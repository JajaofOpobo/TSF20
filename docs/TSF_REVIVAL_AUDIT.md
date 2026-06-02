# TSF Shell Revival Project — Forensic Audit

> **⚠️ OBSOLETE — 2026-06-02**  
> This document audited the **old handwritten app attempt** (now archived to `archive/app-attempt/`).  
> The handwritten code was a generic 2D launcher, not a true TSF revival. It has been removed from the active build path.  
> **See instead**: [`CODEBASE_AUDIT_2026-06-02.md`](CODEBASE_AUDIT_2026-06-02.md) for current codebase state.  
> **Cataloged by**: opencode 2026-06-02

> **Date**: 2026-05-17  
> **Scope**: Full codebase, plan docs, git history, decompiled sources, new implementations  
> **Verdict**: 🔴 **Project is OFF TRACK.** The current implementation is a generic Android launcher written from scratch, not a revival of TSF Shell.

---

## Executive Summary

The stated goal is to **revive TSF Shell**, preserving ALL of its features, using its old resources, and modernizing them for newer Android — **without writing engines from scratch**, preferring to scrap from other 3D launcher APKs or open-source projects.

What has actually been built is a **brand-new, conventional 2D Android launcher** with a rudimentary OpenGL ES overlay that shows flat colored rectangles rotating in a carousel. None of TSF Shell's defining features exist. None of its 3D assets are loaded. The C3DEngine was documented but then completely ignored. The 842 decompiled Java classes and 175 engine classes are sitting untouched in `sources/` — they are not compiled, not referenced, and not used in any way.

---

## What Made TSF Shell Special (and what must be preserved)

TSF Shell was not a typical launcher. It was a **full 3D desktop environment** rendered via a custom OpenGL engine (C3DEngine). Its defining features were:

| Feature | Description |
|---------|-------------|
| **3D Desktop** | Icons, folders, widgets all lived as textured 3D objects in a scene graph, not Android Views |
| **3D Page Transitions** | Cylinder, cube, carousel, wave — pages were 3D surfaces that rotated in space |
| **3D Folders** | Opening a folder was a 3D animation, not a popup dialog |
| **3D Widgets** | Clock, weather, airship, memo — rendered as textured 3D meshes (`.3DS` models) |
| **3D App Drawer** | Spherical/carousel/wave drawer effects, not a RecyclerView grid |
| **Arch Shortcut Menu** | Long-press produced a semicircular 3D radial menu, not a context menu |
| **Sliding Dock** | A 3D dock that could expand/slide with physics-based animations |
| **Scene Graph** | VObject3d → VObject3dContainer hierarchy with tweening, hit-testing, custom shaders |
| **Theme Engine** | Deep theme integration that reskinned 3D surfaces, not just icon packs |
| **Free-form Layout** | Icons at arbitrary x/y with rotation and scale per-icon |

---

## What Was Actually Built

### Current File Inventory

| Component | Files | What it is |
|-----------|-------|-----------|
| `HomeActivity.java` (754 lines) | 1 monolith | Standard `AppCompatActivity` with `FrameLayout` nesting |
| `DesktopPage.java` | Custom `View` | 2D Canvas-drawn icons at x/y coordinates |
| `DesktopPagerView.java` | Custom `ViewGroup` | Horizontal scrolling pager (like ViewPager) |
| `DockView.java` | Custom `View` | 2D Canvas-drawn dock bar |
| `AppDrawerActivity.java` | Separate Activity | `RecyclerView` with `GridLayoutManager` — a flat grid |
| `FolderView.java` | Custom `View` | 2D folder overlay |
| `PageTransitionRenderer.java` | `GLSurfaceView.Renderer` | Flat colored quads on a carousel arc — **no textures from TSF assets** |
| `LibGDXRenderer.java` | `ILauncherRenderer` impl | Misleadingly named — contains **zero LibGDX code**, just wraps GLSurfaceView |
| `TsfExclusiveWidgets.java` | Static Bitmap renderers | 2D Canvas-drawn bitmaps for memo, music, gallery, battery, etc. |
| `Tsf3DWidget.java` | Clock/Weather | 2D Canvas text rendering — **not 3D at all** |
| `ThemeManager.java` | Theme discovery | Discovers theme APKs but cannot apply them to 3D surfaces (no 3D surfaces exist) |

### What This Actually Is

This is a **basic Android launcher** comparable to early AOSP Launcher2. It has:
- 2D icon grid drawn with Canvas
- Horizontal page swipe
- RecyclerView app drawer
- AlertDialog-based folder creation
- Standard AppWidgetHost binding

It is **not** a 3D launcher. It is **not** TSF Shell.

---

## 8 Critical Problems

### 🔴 Problem 1: The "Engine Rewrite" Decision Was Wrong and Misexecuted

The plan at Track 3 concluded that Java recompilation had "15+ decompiler artifact errors" and chose "Engine Rewrite (Option C)." But:

- **15 errors across 870+ files is an absurdly low error count.** The plan's own threshold was 200. Three files had `??` placeholder variables — these are trivial to fix (replace `??` with a local variable name).
- The plan then declared "Engine Rewrite" but **did not rewrite the engine.** It wrote a flat 2D launcher instead. Option C in the plan says *"rebuild rendering engine from scratch using modern OpenGL ES 3.0"* — what was built is a 300-line GLES 2.0 renderer that draws colored rectangles.
- The decision log says "AndEngine is open source; full rewrite not necessary" — but then proceeded to ignore AndEngine entirely.

### 🔴 Problem 2: Zero Original Assets Are Used

The legacy `resources-Prime/` directory contains:

- **`widget_airship.3DS`** — a 3D model file. Not loaded anywhere.
- **`res/raw/` weather icons** — 23 AccuWeather PNGs. The `WeatherIconMapper.java` references `R.raw.*` icons but the mapping is purely code-generated, not reading from the original assets.
- **`res/drawable-*`** — Hundreds of TSF-specific drawables (dock backgrounds, folder textures, icon masks, slider controls). The app's `res/` copies some layout XMLs but uses **none of the TSF-specific drawables**.
- **`assets/`** — Contains only `kctrl.dat` and `kfmt.dat` (license/format data) and `about/` and `video/` dirs. Not used.
- **`res/anim/`** — TSF's custom animations. Not used.
- **176 legacy layout XMLs** were copied into `app/src/main/res/layout/` but most are **dead code** — the app only actually uses `activity_home.xml`, `activity_app_drawer.xml`, `activity_widget_picker.xml`, and a few item layouts.

### 🔴 Problem 3: C3DEngine Was Documented But Completely Ignored

[C3DEngine_API_Reference.md](file:///c:/Users/Jaja/AndroidStudioProjects/TSF20/docs/C3DEngine_API_Reference.md) is an excellent document. It maps out:
- `VObject3d`, `VObject3dContainer` — scene graph nodes
- `VTween`, `VEasing` — animation system
- `VMouseEventListener` — 3D touch/gesture handling
- `VTextureManager` — texture lifecycle
- `VPage` — launcher page abstraction
- `VRenderer` — render control

But nothing in the new code references any of this. The `ILauncherRenderer` interface has 10 generic methods that don't map to C3DEngine's actual API surface. The `PageTransitionRenderer` is a standalone GLES2 shader program that knows nothing about scene graphs.

### 🔴 Problem 4: LibGDXRenderer Contains Zero LibGDX

`LibGDXRenderer.java` is named after LibGDX but:
- Contains no LibGDX imports
- No LibGDX dependency in `build.gradle.kts`
- Is just a wrapper around a raw `GLSurfaceView` + `PageTransitionRenderer`

This is misleading and suggests the code was generated without verification.

### 🔴 Problem 5: The Plan Claims Completion But Features Don't Exist

The plan's status table says:

| Track | Claimed Status |
|-------|---------------|
| Track 5 - Launcher | ✅ HomeActivity, DesktopGridView, DockView, AppDrawerActivity, renderer integration |
| Track 7 - Widgets/Gestures | ✅ LauncherWidgetHost, GestureHandler, LauncherPreferences, WidgetPickerActivity |

But:
- There is no `DesktopGridView` file anywhere
- "Renderer integration" means a GLSurfaceView rendering colored rectangles behind a 2D view — not 3D desktop rendering
- The plan says *"TSF Clock widget renders and updates on the desktop"* — the actual implementation (`Tsf3DWidget.renderClock`) draws 2D text on a Canvas bitmap. This is not a 3D widget.
- The plan says *"A single desktop page renders with one 3D transition (page swipe left/right) on a Pixel 6 running Android 14"* — the actual renderer shows a carousel of flat quads. No desktop content is rendered on those quads in 3D.

### 🔴 Problem 6: Missing TSF Core Features (No Attempt Made)

| TSF Feature | Status |
|-------------|--------|
| 3D desktop rendering | ❌ Not attempted |
| 3D page transition effects (cube, cylinder, wave, etc.) | ❌ Only flat carousel |
| 3D folder open/close animation | ❌ FolderView is a 2D overlay |
| 3D app drawer effects (sphere, carousel, wave) | ❌ RecyclerView grid |
| 3D arch shortcut menu | ❌ ArchShortcutMenu.java exists but renders 2D Canvas arcs, not 3D |
| 3D widget rendering (airship, clock with 3D hands) | ❌ 2D Canvas bitmaps |
| Icon rotation and scale (per-icon) | ❌ Not implemented |
| Sliding dock with physics | ❌ Static dock |
| Scene graph with VObject3d tree | ❌ Not implemented |
| Tween/easing animation system | ❌ Not implemented |
| 3D model loading (.3DS) | ❌ Not implemented |
| Theme application to 3D surfaces | ❌ ThemeManager only does icon replacement |

### 🔴 Problem 7: Manifest Declares Non-Existent Classes

The `AndroidManifest.xml` declares:
- `com.tsf.shell.InstallShortcutReceiver` — **this class does not exist** in `app/src/main/java/`
- `com.tsf.shell.ShellBroadcastReceiver` — **does not exist**
- `com.tsf.extend.theme.core.ThemeManagerService` — **does not exist**
- `com.tsf.shell.manager.wallpaper.ShellWallpaperManager` (as receiver) — **does not exist**

These will cause `ClassNotFoundException` crashes at runtime.

### 🔴 Problem 8: Decompiled Sources Are Unused Reference Material

The 870+ Java files in `sources/sources/` are **not compiled** (the `build.gradle.kts` `sourceSets` only includes `src/main/java`). They exist purely as reference. This is fine for reference, but the plan claims Track 1 "COMPLETE" with "safe-load stubs applied" to files in `sources/` — those stubs do nothing because the files aren't compiled.

---

## What Went Wrong: Root Cause Analysis

### The fundamental mistake: **choosing to write a launcher from scratch instead of using existing 3D launcher code**

Your original goal explicitly stated: *"avoid writing any script or engine from scratch, there are other 3D launcher APKs available to scrap from, if that is not feasible then the solution should be gotten from an open source project."*

This constraint was violated immediately. The project:

1. Declared 15 compilation errors as "too many" (they were trivially fixable)
2. Jumped to "Engine Rewrite" but then didn't rewrite the engine — it wrote a 2D launcher
3. Never attempted to find or evaluate other 3D launcher APKs to scrap from
4. Never evaluated open-source 3D engines (Rajawali, jMonkeyEngine, min3d, etc.) as replacements for C3DEngine
5. Never attempted to use LibGDX despite naming a class after it

### The secondary mistake: **treating plan checkboxes as deliverables**

Every track is marked ✅ COMPLETE, but the actual code behind those checkboxes is rudimentary 2D implementation that bears no resemblance to the feature descriptions. The plan became a checkbox-completion exercise rather than a feature-delivery process.

---

## The Path That Should Have Been Taken

### Option 1: Fix the 15 Compilation Errors (2-3 hours of work)

The decompiled source had **only 15 errors** across 870+ files. All were `??` decompiler placeholder variables in 3 files:

- `com/flurry/sdk/ea.java:116` — analytics code being deleted anyway
- `com/tsf/shell/f/f/c.java:92` — single variable rename
- `com/tsf/shell/plugin/themepicker/utils/c.java:198` — single variable rename

This should have been fixed in an afternoon. The entire C3DEngine + launcher logic would have compiled. Then the modernization work would be:
1. Replace `ActivityGroup` with `Activity` + Fragment-based view management
2. Rebuild native libs for arm64 (already done for Box2D)
3. Add `<queries>` blocks, foreground service types, scoped storage
4. Remove Flurry/ACRA
5. Test and fix deprecated API calls incrementally

This is the **Strangler Fig** approach the plan describes but never executes.

### Option 2: Use an Existing 3D Launcher as a Shell (Per Your Original Goal)

Several open-source and available 3D launchers could provide the rendering shell:

| Project | What It Provides |
|---------|-----------------|
| **Launcher3D** (various APKs on APKMirror/APKPure) | Working 3D page transitions, some with scene graph support |
| **Rajawali** (open source, GitHub) | Full OpenGL ES 3D engine with scene graph, model loading (.obj, .3ds), tweening, texture management — directly maps to C3DEngine's API |
| **min3d** (open source) | Lightweight 3D engine, scene graph, .3ds loader — historically used by early Android 3D launchers |
| **LibGDX** (open source) | Scene graph (`Stage`/`Actor`), tweening (`Actions`), model loading, texture management — widely used, well-documented |
| **jMonkeyEngine** (open source) | Full scene graph, model loading, physics — heavier but very capable |

The correct approach would be:
1. Choose one (Rajawali or LibGDX are the best fits)
2. Map C3DEngine's API surface (15 methods documented in [C3DEngine_API_Reference.md](file:///c:/Users/Jaja/AndroidStudioProjects/TSF20/docs/C3DEngine_API_Reference.md)) to the chosen engine's equivalent
3. Implement `ILauncherRenderer` using the real engine
4. Load the original `.3DS` assets, textures, and drawables
5. Port the scene construction logic from the decompiled `Home.java` → `e()` method (lines 297-314) which shows exactly how the 3D workspace is initialized

### Option 3: Hybrid — Fix Compilation + Use Rajawali for the Engine

This is actually the best path:
1. Fix the 15 decompiler errors (trivial)
2. Delete Flurry/ACRA packages (they're being removed anyway)
3. Replace C3DEngine internals with Rajawali (which has the same concepts: `Object3D`, `Scene`, `Tweening`, `.3ds` loader)
4. Keep the C3DEngine `api/` wrapper classes as a facade
5. Wire the decompiled launcher logic through the facade to Rajawali
6. Modernize Android APIs incrementally

---

## Specific Corrective Actions

### Immediate (Today)

1. **Stop marking tracks as complete.** Nothing is complete.
2. **Go back to Track 3.2 and fix the 15 errors.** They are trivial `??` → local variable renames. Delete the Flurry package entirely.
3. **Verify the fixed sources compile.** Run `compileDebugJavaWithJavac` with the corrected `sourceSets` paths.

### Short-term (This Week)

4. **Evaluate Rajawali as a C3DEngine replacement.** Clone [Rajawali](https://github.com/Rajawali/Rajawali), look at its `Object3D`, `Scene`, `Loader3DS`, `Animation3D` classes. They map 1:1 to C3DEngine's concepts.
5. **Write a proof-of-concept**: Load `widget_airship.3DS` using Rajawali's `.3ds` loader and render it in a `GLSurfaceView`. This proves the pipeline works.
6. **Create a real `ILauncherRenderer` implementation** backed by Rajawali that can:
   - Create a scene with pages as textured rectangles
   - Apply 3D transitions (cube, cylinder, carousel) between pages
   - Place 3D objects (icons, widgets) as textured quads in the scene
   - Handle touch → 3D hit-testing → item selection

### Medium-term (2-4 Weeks)

7. **Port `Home.java`'s initialization sequence** through the Rajawali-backed renderer:
   - `e()` → initializes engine, creates workspace, adds GLSurfaceView
   - `f()` → creates touch handler
   - `g()` → creates workspace view, sets page manager
   - `u()` → initializes data binding

8. **Wire the existing Room database** (which is well-built) to the 3D scene:
   - `FavoriteItem` → 3D icon object at `(cellX, cellY)` with `rotation` and `scale`
   - `DockItem` → 3D dock slot
   - `FolderItem` → 3D folder container

9. **Port the original TSF drawables and animations** into the 3D scene as textures.

---

## What Was Done Well

Not everything is wrong. These pieces are solid and should be kept:

| Component | Quality | Keep? |
|-----------|---------|-------|
| Room database schema (7 entities, 7 DAOs) | Good | ✅ Yes |
| `LegacyMigration.java` | Good | ✅ Yes |
| `AppDatabase.java` | Good | ✅ Yes |
| `LauncherRepository.java` | Good | ✅ Yes |
| `C3DEngine_API_Reference.md` | Excellent | ✅ Yes — this is the Rosetta Stone |
| `DATABASE_SCHEMA.md` | Good | ✅ Yes |
| `GestureEngine.java` | Acceptable | ✅ Keep, wire to 3D |
| `LauncherPreferences.java` | Acceptable | ✅ Keep |
| `ThemeManager.java` (discovery only) | Acceptable | ✅ Keep, extend for 3D |
| `LauncherWidgetHost.java` | Good | ✅ Keep |
| Manifest queries block | Good | ✅ Keep |
| `build.gradle.kts` (Room, deps) | Good | ✅ Keep |

### What Should Be Discarded or Heavily Rewritten

| Component | Why |
|-----------|-----|
| `HomeActivity.java` | Monolith mixing 2D views with fake 3D. Needs to become a thin shell hosting a real 3D renderer |
| `DesktopPage.java` | 2D Canvas drawing. Must be replaced by 3D scene objects |
| `DesktopPagerView.java` | 2D ViewPager clone. Pages should be 3D surfaces |
| `DockView.java` | 2D Canvas dock. Must be 3D |
| `AppDrawerActivity.java` | RecyclerView grid. Must be 3D drawer effect |
| `FolderView.java` | 2D popup. Must be 3D folder animation |
| `PageTransitionRenderer.java` | Rudimentary flat-quad carousel. Needs real 3D transition engine |
| `LibGDXRenderer.java` | Misnamed, doesn't use LibGDX. Replace with Rajawali/real-engine backed impl |
| `TsfExclusiveWidgets.java` | 2D Canvas bitmaps pretending to be TSF widgets. Must render as 3D objects |
| `Tsf3DWidget.java` | Not 3D. Must render on 3D surfaces |
| `ArchShortcutMenu.java` | 2D Canvas arcs. Must be actual 3D arch menu |

---

## Summary Verdict

| Question | Answer |
|----------|--------|
| Is the aim on track? | **No.** The project built a generic 2D launcher, not a TSF Shell revival. |
| What are we doing wrong? | Writing everything from scratch in 2D, ignoring the decompiled sources, ignoring the 3D assets, marking features as complete when they don't resemble TSF Shell at all. |
| What path should we take instead? | Fix the trivially-small 15 compilation errors in the decompiled source. Replace C3DEngine internals with Rajawali (open-source, maps 1:1 to C3DEngine's API). Keep the data layer (it's good). Load and render the original 3D assets. Port the initialization sequence from the decompiled `Home.java`. |

The data layer, documentation, and project infrastructure are solid. The rendering and UI layers need to be scrapped and rebuilt around a real 3D engine that can host TSF Shell's actual visual identity.
