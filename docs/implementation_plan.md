# TSF Shell Revival — Corrective Implementation Plan (v2)

## Background

The decompiled APK source tree contains **1847 Java files**, broken down as:

| Package | Files | Classification |
|---------|-------|---------------|
| `com/tsf/shell/` | 842 | **TSF launcher code** — compile |
| `com/tsf/extend/` | 296 | **TSF extension modules** — compile |
| `com/censivn/C3DEngine/` | 175 | **Custom 3D engine** — compile |
| `com/ksmobile/` | 16 | **KS Mobile utils** — compile |
| `android/support/` | 338 | Old support library → **exclude**, use AndroidX |
| `org/acra/` | 57 | ACRA crash reporting → **exclude**, stub constants |
| `com/badlogic/gdx/` | 44 | LibGDX math/physics → **exclude**, use Gradle dep |
| `com/android/volley/` | 37 | Volley HTTP → **exclude**, use Gradle dep |
| `com/cm/` | 35 | CM SDK analytics → **exclude**, delete |
| misc obfuscated | 5 | → **exclude** |

Key discovery: **the original TSF Shell already used LibGDX** (`com.badlogic.gdx.math/physics`). C3DEngine wraps LibGDX internally.

## Strategy

**Phase 1** gets the decompiled sources compiling inside the existing Gradle project. This is the most important step because it tells us what's actually broken vs. what works.

**Phase 2** fixes Android API incompatibilities so the decompiled code can run on modern devices.

**Phase 3** is where the real 3D revival happens — wiring the compiled C3DEngine to actually render, loading original assets, and integrating with the existing data layer.

The existing data layer (Room database, entities, DAOs, LegacyMigration, LauncherRepository) is **kept as-is** — it's well built. The existing 2D UI code (DesktopPage, DockView, AppDrawerActivity, etc.) stays temporarily as a fallback while the 3D rendering is brought online.

---

## Phase 1 — Get Decompiled Sources Compiling

**Goal**: `./gradlew compileDebugJavaWithJavac` passes with 0 errors including all 1329 TSF-proprietary source files.

### 1.1 Configure build.gradle.kts source inclusion ✅ DONE
- Added `../sources/sources` as a `java.srcDir`
- Added `java.exclude()` patterns for all third-party bundled packages

### 1.2 Fix the 2 decompiler `??` placeholder errors
- [x] `com/tsf/shell/plugin/themepicker/utils/c.java:198` — `??` was a `String` variable from `c(str)` MD5 hash. Fixed: renamed to `hashKey`, rewrote the broken catch blocks that reused the same variable as an OutputStream.
- [ ] `com/tsf/shell/f/f/c.java:92` — `??` is a generic type cast `(E) ((f) it.next())`. Fix: replace `??` with `E`.

### 1.3 Create stubs for excluded third-party APIs ✅ PARTIALLY DONE
These stubs provide the constants and method signatures that TSF code imports, without pulling in the real libraries:

- [x] `org.acra.ACRAConstants` — stub with `DEFAULT_SOCKET_TIMEOUT`, `UNKNOWN` constants (referenced by 16 TSF files)
- [x] `com.flurry.android.FlurryAgent` — no-op stub (called by `Home.java` in `onStart`/`onStop`)
- [x] `com.flurry.android.Constants` — stub with `UNKNOWN = 0xFF` (used in hex formatting)
- [ ] Check if `com.b` (excluded) defines a resource class `com.tsf.b` or `b.i` — `Home.java` imports `com.tsf.b` which references string resources. This is the TSF resource ID class and lives under `com/tsf/`, so it's included. Verify it compiles.
- [ ] Check if any TSF code imports from `com.cm.*` — if so, create stubs

### 1.4 Handle `android.support.v4/v7` → AndroidX migration in TSF code
~37 TSF files import `android.support.*`. These need to be converted:

| Old Import | New Import |
|-----------|-----------|
| `android.support.v4.app.Fragment` | `androidx.fragment.app.Fragment` |
| `android.support.v4.app.FragmentActivity` | `androidx.fragment.app.FragmentActivity` |
| `android.support.v4.view.ViewPager` | `androidx.viewpager.widget.ViewPager` |
| `android.support.v4.widget.NestedScrollView` | `androidx.core.widget.NestedScrollView` |
| `android.support.v7.app.AppCompatActivity` | `androidx.appcompat.app.AppCompatActivity` |
| `android.support.v4.d.f` (obfuscated LruCache) | `androidx.collection.LruCache` |
| `android.support.v4.app.o` (obfuscated FragmentManager) | Need to identify and map |

**Strategy**: Run compilation first, then fix import errors one by one. Some obfuscated support lib references (`android.support.v4.d.f`, `android.support.v4.app.o`) are classes that were decompiled with obfuscated names. For these, we need to:
1. Identify what they are from usage context
2. Create adapter classes or change TSF code to use AndroidX equivalents

### 1.5 Handle decompiler raw bytecode stubs
The file `com/tsf/shell/plugin/themepicker/utils/c.java` has 3 methods where JADX failed to decompile and left raw Smali bytecode in comments + `throw new UnsupportedOperationException("Method not decompiled: ...")`:
- `a():void` — disk cache init (lines 92-156)
- `b(String):Bitmap` — get bitmap from disk cache (lines 285-372)
- `d():void` — close disk cache (lines 439-475)

**Strategy**: Rewrite these methods manually by reading the Smali comments. The logic is visible in the comments — it's standard disk cache open/read/close code. Alternatively, if this class is only used by the theme picker UI, it can be temporarily stubbed to return null.

### 1.6 Resolve duplicate class conflicts
The new code in `app/src/main/java/com/tsf/shell/` and the decompiled code in `sources/sources/com/tsf/shell/` share the same package namespace. Potential conflicts:
- New `ShellApplication.java` vs decompiled TSF files that may define the same class
- New `Home.java`-adjacent code

**Strategy**: Run compilation. If duplicates appear, the new skeleton classes yield to the decompiled originals (which contain the real logic). The new classes we keep are:
- Room entities/DAOs/database (no equivalent in decompiled source)
- `LauncherRepository.java` (new, no conflict)
- Stub/bridge classes in `render/`, `service/`, `settings/`

### 1.7 First compilation attempt
- Run `./gradlew compileDebugJavaWithJavac 2>&1 | tee docs/build_errors_phase1.txt`
- Count errors, categorize into:
  - **A**: Import/type errors (fixable by import migration)
  - **B**: Decompiler artifacts (`goto`, broken control flow, raw bytecode)
  - **C**: API removals (`ActivityGroup`, removed Android APIs)
  - **D**: Errors inside `com/censivn/C3DEngine/` (critical — these block the 3D engine)
- Save categorized results to `docs/ERROR_TRIAGE_v2.md`

### 1.8 Fix all Category A and B errors
- Batch-fix import errors with find-and-replace
- Manually fix remaining decompiler artifacts
- Re-run compilation after each batch

### 1.9 Compilation gate decision
- **If C3DEngine compiles clean**: Proceed to Phase 2 (API compat) → the engine is usable
- **If C3DEngine has < 20 errors**: Fix them manually → proceed to Phase 2
- **If C3DEngine has > 20 errors**: Assess whether Rajawali/LibGDX bridge is needed for the broken classes only

---

## Phase 2 — Fix Android API Compatibility

**Goal**: The app builds, installs, and launches on Android 14 (API 34) without crashing.

### 2.1 Replace `ActivityGroup` in `Home.java`
`Home extends ActivityGroup` — `ActivityGroup` was removed in API 13.
- Replace with `Home extends Activity`
- Remove `getLocalActivityManager()` calls
- Replace child activity management with Fragment transactions or direct View management
- This is the single biggest code change needed

### 2.2 Fix deprecated/removed API calls
Scan decompiled code for:
- `getRunningTasks()` / `getRecentTasks()` → stub or use `UsageStatsManager`
- `getRunningServices()` → removed in API 26
- Implicit broadcast registration → explicit
- `PackageManager` flag changes for API 33+
- `startForegroundService()` requirements for API 26+

### 2.3 Fix manifest declarations
- Ensure all `<activity>`, `<service>`, `<receiver>` have `android:exported`
- Add `android:foregroundServiceType` where needed
- Keep existing `<queries>` block
- Remove non-existent class declarations (InstallShortcutReceiver, ShellBroadcastReceiver, etc.) or create the classes

### 2.4 Test launch
- Build APK
- Install on Android 14 emulator
- Verify it launches without crash
- Document what renders (even if broken)

---

## Phase 3 — 3D Engine Revival

**Goal**: C3DEngine renders its 3D desktop with original assets on screen.

### 3.1 Verify C3DEngine initializes
- Trace the init path: `Home.e()` → `C3DEngine.a.a(Activity)` → creates `GLSurfaceView`
- Ensure the engine singleton starts and creates its render thread
- Fix any runtime errors

### 3.2 Load original assets
- Copy `resources-Prime/res/raw/widget_airship.3DS` to `app/src/main/res/raw/`
- Copy original drawables needed by the engine from `resources-Prime/res/drawable-*`
- Verify texture loading works

### 3.3 Wire data layer to 3D scene
- Connect the existing Room `FavoriteItem` data to C3DEngine's `ItemInfo` classes
- Map `FavoriteItem.cellX/cellY/rotation/scale` → `ItemInfo` equivalents
- Icons should appear as textured 3D objects

### 3.4 Bring 3D page transitions online
- Verify page manager (`com.tsf.shell.manager.a.h`) initializes
- Test page swipe triggers 3D carousel/cube transition
- If C3DEngine transitions work, the original effects are restored

### 3.5 If C3DEngine doesn't work: Rajawali fallback
Only if Phase 3.1-3.4 fail:
- Add Rajawali as Gradle dependency
- Map C3DEngine's 15-method API surface to Rajawali equivalents
- Implement `ILauncherRenderer` backed by Rajawali
- Load `.3DS` models via Rajawali's `Loader3DS`

---

## What We Keep From Current Code

| Component | Action |
|-----------|--------|
| Room entities (7 files) | ✅ Keep |
| Room DAOs (7 files) | ✅ Keep |
| AppDatabase.java | ✅ Keep |
| LegacyMigration.java | ✅ Keep |
| LauncherRepository.java | ✅ Keep |
| DatabaseSeeder.java | ✅ Keep |
| LauncherPreferences.java | ✅ Keep — wire to decompiled prefs |
| GestureEngine.java | ✅ Keep — wire to C3DEngine input |
| ThemeManager.java | ✅ Keep — extend for 3D surface theming |
| LauncherWidgetHost.java | ✅ Keep |
| C3DEngine_API_Reference.md | ✅ Keep — Rosetta Stone |
| DATABASE_SCHEMA.md | ✅ Keep |
| build.gradle.kts (Room, deps) | ✅ Keep + extend |
| Manifest queries block | ✅ Keep |

| Component | Action |
|-----------|--------|
| HomeActivity.java | 🔄 Demote to fallback, eventually replace with decompiled Home.java |
| DesktopPage.java | 🔄 Fallback until 3D desktop works |
| DockView.java | 🔄 Fallback until 3D dock works |
| AppDrawerActivity.java | 🔄 Fallback until 3D drawer works |
| FolderView.java | 🔄 Fallback until 3D folders work |
| PageTransitionRenderer.java | ❌ Replace with C3DEngine or Rajawali |
| LibGDXRenderer.java | ❌ Replace — misleadingly named, no actual LibGDX |
| TsfExclusiveWidgets.java | ❌ Replace with actual 3D widget rendering |

---

## Verification Plan

### Phase 1 Success Criteria
- `./gradlew compileDebugJavaWithJavac` passes with 0 errors
- All 1329 TSF-proprietary files are included in compilation
- No third-party library source is compiled (excluded by Gradle patterns)

### Phase 2 Success Criteria
- APK installs on Android 14 emulator
- App launches without `ClassNotFoundException` or `NoSuchMethodError`
- Home screen appears (even if visually broken)

### Phase 3 Success Criteria
- C3DEngine's `GLSurfaceView` renders on screen
- At least one 3D page transition animates
- `widget_airship.3DS` model loads and renders
- Icons appear as textured 3D objects at their persisted positions
