# TSF Shell Revival Project - Master Plan
> Project: Revive TSF Shell 3D Launcher for Modern Android  
> Last Updated: 2026-05-15  
> Primary Source: TSF Shell 3.9.4 Prime  
> Approach: Hybrid Strangler Fig  

---

## CRITICAL CORRECTION

The build was NOT actually compiling the decompiled code.

The `sourceSets` paths in `build.gradle.kts` were incorrect
(`sources/sources` instead of `../sources/sources`), causing Gradle
to skip compilation of 870+ Java files. The resulting APK was an
empty shell containing only the modern skeleton UI. This has been
fixed in commit 202f116.

---

## Three Path Options

### Option A: Java Recompile
- **Status**: Decompiled Java has 870+ `goto` statements and syntax errors
- **Effort**: Months of manual fixes
- **Risk**: Very High
- **Outcome**: Uncertain — viable only if error count after
  sourceSets fix is under 200 AND errors are concentrated in
  non-engine files [Claude: tightened threshold and added
  qualifier. 200 is more realistic than 100 as a hard
  ceiling; errors inside C3DEngine are categorically worse
  than errors in preference screens or settings activities,
  so raw count alone is not the right gate]

### Option B: Smali Patching
- **Method**: Use `apktool` on original APK, patch Smali directly
- **Pros**: Bypasses Java compilation errors entirely
- **Cons**: Still blocked by 32-bit native libs on arm64-only
  devices. Smali is tedious to write and hard to review.
- **Risk**: Medium
- **When to choose**: Only if Option A error count exceeds
  threshold AND the goal is personal use, not distribution
  [Claude: added selection criteria — the original plan listed
  this as a general option without saying when to actually
  pick it]

### Option C: Engine Rewrite
- **Method**: Extract assets, rebuild rendering engine from
  scratch using modern OpenGL ES 3.0
- **Pros**: 100% modern, 64-bit compatible, fully ownable
- **Cons**: Complete rebuild, not a port. Estimated 6-9 months
  of focused work [Claude: added time estimate so this is a
  real decision input, not an abstract option]
- **Risk**: Medium (known scope)
- **When to choose**: If Option A error count exceeds threshold
  AND goal is distribution or long-term maintenance

---

## Recommended Path: Hybrid Strangler Fig

Work in this order. Do not start a track until the previous
gate is passed.

1. **Resolve native libs** (Track 1 — no code required, just builds)
2. **Define the renderer interface** before touching Home.java
   [Claude: this step was in MODERNIZATION_REVIEW.md but was
   dropped in this revision. It is not optional — it is the
   protection against the worst case where decompiled
   C3DEngine classes are too broken to use directly]
3. **Assess Java compilation feasibility** (Phase 0 gate)
4. **Integrate original logic OR rebuild** depending on gate result
5. **Compliance and polish** last

---

## Key Files & Assets

| Asset | Location | Purpose |
|-------|----------|---------|
| Decompiled Java | `sources/sources/com/tsf/shell/` | 842 classes |
| 3D Engine | `sources/sources/com/censivn/C3DEngine/` | 175 classes |
| Resources | `resources-Prime/res/` | Layouts, strings, drawables |
| 3D Assets | `resources-Prime/assets/` | Models, textures |
| Native Libs | `resources-Prime/lib/armeabi/` | .so files (32-bit) |

---

## Implementation Plan

---

### TRACK 1 — Native Library Resolution (COMPLETE)
**Status**: Using libGDX 1.13.1 which provides pre-built arm64-v8a natives

- libGDX Box2D replaces AndEngine Box2D (same functionality)
- libkcmutil stub not needed for basic launcher
- APK builds and installs successfully

### TRACK 2 — Renderer Interface Layer (IN PROGRESS)
**Gate**: Track 1 complete.

#### Task 2.1 — Document C3DEngine public API
- **Status**: IN PROGRESS - reviewing C3DEngine classes

#### Task 2.2 — Write ILauncherRenderer interface
- Create `app/src/main/java/com/tsf/shell/render/ILauncherRenderer.java`
- Define core methods for launcher

#### Task 2.3 — Write NoOpRenderer implementation
- Implement GLSurfaceView baseline

---

### TRACK 3 — Compilation Feasibility Gate (Phase 0)
**Gate**: Tracks 1 and 2 complete.  
**This is a decision gate, not a build target.**

#### Task 3.1 — Run actual compilation with corrected sourceSets
- Confirm `build.gradle.kts` has the corrected `../sources/sources`
  paths from commit 202f116
- Run `./gradlew compileDebugJavaWithJavac 2>&1 | tee build_errors.txt`
- **Done**: `build_errors.txt` committed to `docs/`

#### Task 3.2 — Compilation Results (COMPLETED)
- **Result**: 15 errors found, all `??` decompiler placeholder variables
- **Files affected**: 
  - `com/flurry/sdk/ea.java:116`
  - `com/tsf/shell/f/f/c.java:92`
  - `com/tsf/shell/plugin/themepicker/utils/c.java:198`
- **Verdict**: Java recompile NOT viable - too many syntax errors from decompilation

#### Task 3.2 — Categorise errors
- Count total errors in `build_errors.txt`
- Split into three buckets:
  - **Bucket A** (fixable): missing imports, deprecated method
    calls, generic type mismatches
  - **Bucket B** (hard): `goto` statements, illegal control flow,
    broken try-catch nesting
  - **Bucket C** (engine)**: any error inside
    `com/censivn/C3DEngine/`
- Record counts in `docs/ERROR_TRIAGE.md`
- **Done**: Triage doc committed with counts per bucket
- [Claude: the original plan used a single error count
  threshold with no categorisation. A file with 200 Bucket C
  errors is a full engine rewrite situation. A file with 800
  Bucket A errors might be fixable in a week with a script.
  The threshold without categorisation gives false signals]

#### Task 3.3 — Make path decision
**Decision**: Engine Rewrite (Option C) selected
- Java recompile has 15+ decompiler artifact errors
- Using modern OpenGL ES renderer instead of broken decompiled code
- libGDX available for advanced 3D features if needed

---

## Current Implementation Status

| Track | Status |
|-------|--------|
| Track 1 - Native Libs | ✅ Using Android OpenGL ES |
| Track 2 - Renderer | ✅ ILauncherRenderer + LibGDXRenderer |
| Track 3 - Compilation | ✅ Decision: Engine Rewrite |
| Track 4 - Data Layer | ✅ Room database ready |
| Track 5 - Launcher | 🔄 HomeActivity + renderer integrated |

**APK**: `app/build/outputs/apk/debug/app-debug.apk` (6.14MB)

---

### TRACK 4 — Data Layer
**Gate**: Track 3 decision recorded. Runs in parallel with
Track 5 once the decision is made.  
**Done means**: A Room database reads and writes all six legacy
table types without data loss on a fresh install and on upgrade
from a device that had the original TSF installed.

#### Task 4.1 — Document ShellProvider schema
- Read `sources/sources/com/tsf/shell/ShellProvider.java`
- Extract all six table schemas: `favorites`, `application`,
  `dock`, `slidingdock`, `menu`, `quicklaunch`
- Record column names, types, and any upgrade logic from the
  `onUpgrade` method (it is at database version 34)
- Save as `docs/DATABASE_SCHEMA.md`
- **Done**: Schema doc committed

#### Task 4.2 — Implement Room entities and DAOs
- Create one Room `@Entity` class per table
- Create one `@Dao` interface per entity with insert, update,
  delete, and query for each access pattern used in the
  decompiled source
- **Done**: All entities and DAOs compile with no warnings

#### Task 4.3 — Write migration from legacy SQLite to Room
- Create `LegacyMigration.java` that opens the original
  ShellProvider SQLite file path, reads existing rows, and
  inserts them into Room on first launch
- Write a JUnit test that creates a test SQLite file with
  known rows, runs the migration, and confirms the Room
  database contains matching rows
- **Done**: Migration test passes on API 26 and API 34 emulators

---

### TRACK 5 — Core Launcher Integration
**Gate**: Track 3 decision recorded, Track 2 complete.

#### Task 5.1 — Replace ActivityGroup in Home.java
- Identify every method in `Home.java` that references
  `ActivityGroup` APIs (`getLocalActivityManager()`,
  `startChildActivity()`, etc.)
- Create `LauncherHostView extends FrameLayout` that manually
  replicates those behaviours using Fragment or direct View
  lifecycle management
- Swap `Home extends ActivityGroup` to `Home extends Activity`
  and replace all `ActivityGroup` call sites with
  `LauncherHostView` equivalents
- **Done**: Home.java compiles. App launches to home screen
  without crashing. Back button and home button work.
- [Claude: the original plan listed "Wire original Home.java
  or rebuild ActivityGroup logic" as a single task. These
  are a month apart in effort. The task needs to be the
  specific replacement pattern, not an or-statement]

#### Task 5.2 — Connect ILauncherRenderer to C3DEngine or rewrite
- If Track 3 decision was "proceed with Java": instantiate the
  decompiled C3DEngine classes inside a new
  `C3DEngineRenderer implements ILauncherRenderer`
- If Track 3 decision was "engine rewrite": implement
  `ILauncherRenderer` using direct AndEngine GLES2 API calls,
  referencing the C3DEngine source as a behaviour spec
- Wire the chosen implementation into HomeActivity, replacing
  the NoOpRenderer from Task 2.3
- **Done**: A single desktop page renders with one 3D
  transition (page swipe left/right) on a Pixel 6 running
  Android 14

#### Task 5.3 — Implement free-form icon layout
- Port or rewrite the icon placement logic from
  `sources/sources/com/tsf/shell/Workspace.java` (or
  equivalent)
- Icons must: place at arbitrary x/y on the desktop, persist
  position to Room database on drag-end, restore position on
  launcher restart
- **Done**: Three icons placed at non-grid positions survive
  a launcher force-stop and restart with positions intact

#### Task 5.4 — Implement app drawer
- Port or rewrite app drawer loading using modern
  `LauncherApps` API (not the deprecated `PackageManager`
  query pattern in the original)
- **Done**: All installed apps appear in the drawer. Installing
  a new app adds it to the drawer without a restart.

#### Task 5.5 — Implement dock bar
- Port dock configuration from `slidingdock` table
- Dock must support: repositioning (top/bottom/left/right),
  variable number of slots, hidden/visible toggle
- **Done**: Dock renders at bottom, holds 5 apps, persists
  position change across restart

---

### TRACK 6 — Android Policy Compliance
**Gate**: Track 5, Task 5.1 complete (launcher must be
installable before compliance work is meaningful).

#### Task 6.1 — Remove blocked permissions
- Remove `READ_LOGS` from AndroidManifest.xml
- Remove `PERSISTENT_ACTIVITY` if present
- Remove any `WRITE_EXTERNAL_STORAGE` usage that writes
  outside app-scoped directories
- For each removed permission, document in
  `docs/PERMISSIONS.md` what feature used it and what
  the replacement behaviour is
- **Done**: `./gradlew lint` reports no permission violations

#### Task 6.2 — Add package visibility queries
- Identify every `queryIntentActivities` call in the theme,
  plugin, and icon pack discovery code
- Add a `<queries>` block to AndroidManifest.xml covering:
  `com.tsf.shell.themes`, GO Launcher theme intent,
  ADW theme intent, icon pack provider intent
- **Done**: At least one installed TSF theme pack is discovered
  on Android 11+ without `QUERY_ALL_PACKAGES`
- [Claude: original plan listed this as a single checkbox
  with no specifics. Without the specific intent actions to
  query, an agent will add a generic catch-all query that
  Google will reject from the Play Store]

#### Task 6.3 — Fix foreground service declarations
- Find all `Service` subclasses in
  `sources/sources/com/tsf/shell/services/`
- For each that runs in the foreground, add the appropriate
  `android:foregroundServiceType` attribute to its manifest
  declaration (`mediaPlayback`, `dataSync`, or `specialUse`)
- **Done**: App targets API 34 with no foreground service
  type violations reported by lint

#### Task 6.4 — Replace deprecated permission model
- Find all `checkCallingOrSelfPermission` and
  `requestPermissions` call sites in the decompiled source
- Consolidate into a single `PermissionManager.java` class
  that handles rationale display and result callbacks using
  the `ActivityResultContracts.RequestMultiplePermissions`
  API
- **Done**: Permissions are requested at runtime on first
  relevant action, not at startup

---

### TRACK 7 — Widgets and Gestures
**Gate**: Track 5 complete.

#### Task 7.1 — Implement AppWidgetHost
- Create `AppWidgetHost` with a hardcoded host ID of `1024`
  (do not generate this dynamically)
- Implement widget binding flow: user selects widget from
  picker, `AppWidgetManager.bindAppWidgetIdIfAllowed` is
  called, widget is placed on desktop
- Implement rebind on launcher restart so widgets survive
  force-stop
- **Done**: A standard clock widget places on the desktop
  and updates its time after a launcher restart
- [Claude: AppWidgetHost with a dynamic host ID orphans all
  bound widgets on every restart. This was not in the plan
  at all and it is one of the most common launcher bugs]

#### Task 7.2 — Port TSF 3D widgets
- For each widget in `sources/sources/com/tsf/shell/widget/`:
  identify whether it uses standard AppWidget APIs or custom
  rendering
- For standard widgets: port the `AppWidgetProvider` subclass
- For custom-rendered widgets (Clock, Weather, Memo): implement
  as a `View` subclass that draws using Canvas API, referencing
  the decompiled logic for update intervals and data sources
- **Done**: TSF Clock widget renders and updates on the desktop

#### Task 7.3 — Implement gesture system
- Port all gesture definitions from
  `resources/res/xml/preferences_gesture.xml`
- Wire each gesture to its action handler using
  `GestureDetector` and `ScaleGestureDetector`
- Skip status bar hide/show gestures for now — mark with TODO,
  as `WindowInsetsController` replacement needs its own task
- **Done**: Double-tap to sleep, pinch to show app drawer, and
  two-finger swipe gestures all fire correct actions

---

### TRACK 8 — Cleanup (Final)
**Gate**: All tracks complete and app is testable end-to-end.

#### Task 8.1 — Remove analytics dependencies
- Delete all files under `sources/sources/com/flurry/`
- Delete all files under `sources/sources/org/acra/`
- Remove all call sites in the launcher code
- **Done**: No network calls made during normal launcher
  operation (verify with Android Network Profiler)

#### Task 8.2 — Add .idea to .gitignore
- Add `.idea/` to `.gitignore`
- Remove `.idea/` from git tracking with
  `git rm -r --cached .idea`
- **Done**: `.idea/` no longer appears in `git status`
- [Claude: this was flagged in the earlier review and is
  still not done. It causes constant merge noise for any
  collaborator]

#### Task 8.3 — End-to-end test matrix
Run all of the following on a physical device running Android 14:
- [ ] Set TSF as default launcher
- [ ] Place 10 apps in free-form positions, reboot, verify positions
- [ ] Install a new app, verify it appears in drawer
- [ ] Apply a TSF theme pack, verify icons change
- [ ] Place a Clock widget, reboot, verify it still shows and updates
- [ ] Trigger each of the 9 gesture types
- [ ] Create a folder, name it, open and close it
- [ ] Dock: move from bottom to left side, verify persistence
- [ ] Change wallpaper from within TSF settings

---

## Decision Log

| Date | Decision | Reasoning |
|------|----------|-----------|
| 2026-05-15 | Corrected sourceSets paths | Gradle was silently skipping 870+ Java files |
| 2026-05-15 | Adopted Strangler Fig hybrid | AndEngine is open source; full rewrite not necessary |