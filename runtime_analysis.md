# TSF Shell Runtime Analysis (from rooted emulator)

**Date:** 2026-06-01  
**Device:** Pixel 3a XL (API 28, x86)  
**Tool:** Frida 17.10.0  
**APK:** com.tsf.shell-3.9.4-free

---

## 1. Process Architecture

- **Main process**: `com.tsf.shell` (PID 4674)
- **Feature process**: `com.tsf.shell:feature` (PID 4695)  
- **Service process**: `com.tsf.shell:Service` (PID 13000)

---

## 2. Loaded Class Summary

**1308 total TSF/C3D/KSM classes loaded** at runtime.

### C3DEngine (com.censivn.C3DEngine.*) - ~200+ classes

#### Engine Core (com.censivn.C3DEngine.a.*)
| Class | Runtime | Source File |
|-------|---------|-------------|
| Main engine | `com.censivn.C3DEngine.a` | `C3DEngine/a.java` |
| Submodule a-g | `com.censivn.C3DEngine.a.a` - `.a.g` | `C3DEngine/a/a.java` - `a/g.java` |

#### API Core (com.censivn.C3DEngine.api.core.*)
- `VObject3d` - Base 3D scene object
- `VObject3dContainer` - Container for 3D objects (scene graph node)
- `VObjectManager` - Manages 3D objects
- `VTextureList` - Texture list
- `VTextureManager` - Texture lifecycle manager
- `VWidgetContainer` - Widget container

#### Element API (com.censivn.C3DEngine.api.element.*)
- `Color4`, `Color4BufferList`, `Number3d`, `PositionNumber3d`
- `TextureDescription`, `TextureElement`, `TextureEnvDescription`, `TextureList`
- `Uv`, `UvBufferManager`, `Vertices`, `PointBufferManager`, `FacesBufferedList`

#### Info API (com.censivn.C3DEngine.api.element.info.*)
- `ItemInfo` - Base item info
- `LauncherFolder3DInfo` - 3D folder info
- `LauncherWidget3DInfo` - 3D widget info
- `LauncherShortcut3DInfo`, `LauncherShortcutAppInfo`, `LauncherShortcutStandardInfo`

#### Primitives (com.censivn.C3DEngine.api.primitives.*)
- `VRectangle` - 2D/3D rectangle
- `VButton`, `VButtonItem` - 3D buttons

#### Tween/Animation (com.censivn.C3DEngine.api.tween.*)
- `VTween`, `VTweenParam` - Tween animation system
- `VTweenTarget` - Tween target interface

#### Events (com.censivn.C3DEngine.api.event.*)
- `VMouseEventListener` - 3D touch/click handler

#### Shell API (com.censivn.C3DEngine.api.shell.*)
- `VInformation`
- `VPage` - Launcher page abstraction

#### Message/Queue (com.censivn.C3DEngine.api.message.*)
- `RenderRunnable` - Render task
- `VMessageQueueManager` - Message queue

#### Shaders (com.censivn.C3DEngine.common.shader.*)
- `Shader`, `ShaderAlpha`, `ShaderColor`, `ShaderColorMatrixTexture`
- `ShaderColorTexture`, `ShaderFillColorTexture`, `ShaderStandard`, `ShaderTextureMatrix`

#### Renderer (com.censivn.C3DEngine.common.renderer.*)
- `MatrixStack`, `ShaderManager`

#### Worker Subsystems (com.censivn.C3DEngine.b.*)
- `b.b.*` - Scene/render managers  
- `b.c.c` - WidgetManager (HandlerThread: "WidgetManager Database Operating")
- `b.e.*` - Texture loaders
- `b.f.*` - Render tasks
- `b.g.*` - Page/scene management
- `b.h.*` - UI element management

### TSF Shell (com.tsf.shell.*)

#### Core
- `Home` - Main activity (7 inner classes)
- `ShellActivity` - Shell launcher activity
- `ShellApplication` - Application class
- `ShellProvider` - Content provider
- `ShellBroadcastReceiver` - Broadcast receiver
- `InstallShortcutReceiver` - Shortcut receiver

#### Manager Subsystems
| Package | Purpose |
|---------|---------|
| `manager.a.*` | App management (a-g) |
| `manager.action.*` | Gesture/action handling |
| `manager.action.toggle.*` | Toggle state management |
| `manager.bind.*` | Data binding (ShellModel, bind a-d) |
| `manager.wallpaper.*` | Wallpaper management |
| `manager.r.*` | Resource management (a/b/c) |
| `manager.f.*` | Feature management |
| `manager.m.*` | Desktop management |
| `manager.o.*` | Object management |
| `manager.p.*` | Plugin management |
| `manager.q.*` | Query management |
| `manager.c.*`, `manager.d.*`, `manager.e.*` | Other managers |
| `manager.k.*`, `manager.l.*`, `manager.n.*` | Other managers |

#### Theme System (com.tsf.shell.theme.inside.*)
- `ThemeManager` - Core theme manager
- `ThemeConfigManager` - Theme configuration
- `ThemeParser` - Theme package parser
- `ThemeCacheFileManager` - Cache management
- `ThemeListsManager` - Theme lists
- `ThemesMixManager` - Theme mixing
- `ThemeMixElementManager` - Element mixing
- `ThemeUtils` - Utilities
- Various `mix.*` managers:
  - `ThemeActionManager`, `ThemeAppMutilChoiceManager`, `ThemeArrangeManager`
  - `ThemeClockManager`, `ThemeContactManager`, `ThemeDesktopEffectManager`
  - `ThemeFolderManager`, `ThemeIconManager`, `ThemeIconMenuManager`
  - `ThemeLassoManager`, `ThemePageManager`, `ThemeShellOtherManager`
  - `ThemeSmartButtonManager`, `ThemeUnreadCountManager`, `ThemeWidgetResizeManager`
- Description classes: `ThemeDescription`, `ThemeIconDescription`, `ThemeFolderDescription`, `ThemeShellDescription`

#### Widgets
- `widget.alarm.*` - Full alarm clock widget system (AlarmWidget, AlarmUtils, service, providers)
- `widget.cubeclock.t` - Cube clock widget

#### Services
- `ForegroundService` - Foreground service
- `services.a-d` - Service helpers

#### Utilities (com.tsf.shell.utils.*)
- `b`, `c`, `d`, `f`, `g`, `h`, `i`, `j`, `l`, `o`, `q`, `r`, `s`, `t`, `x`, `y`

#### Plugin
- `plugin.themepicker.*` - Theme picker, icon designer
- `plugin.notice.*` - Notifications
- `plugin.classification.*` - App classification
- `plugin.widget.FloatingItem` - Floating widget
- `plugin.summary.ShellSummaryActivity` - Summary

#### Settings (com.tsf.shell.preference.*)
- `SettingAdvancedPerferenceActivity` - Settings activity

#### Themes Internal Classes
- `C3DEngine.api.effects.*` - VEffectsStack, VIEffects
- `C3DEngine.api.resources.Resource`
- `C3DEngine.api.shell.*` - VConsole, VTempleteSceneCallbacks, VTempleteLayerManager

### Resource Classes (com.tsf.*)
- `com.tsf.a` - Resource IDs
- `com.tsf.b`, `b$b`, `b$c`, `b$d`, `b$f`, `b$h`, `b$i` - Resource inner classes

### Extension (com.tsf.extend.*)
- `com.tsf.extend.h` - Extension init
- `com.tsf.extend.f$d` - Extension feature
- `com.tsf.extend.theme.ThemeCmClubProvider` - CM theme provider
- `com.tsf.extend.base.*` - Base extension utilities

### KSMobile (com.ksmobile.*)
- `com.ksmobile.a.a.a` - KS utils
- `com.ksmobile.a.b.a-d`, `g` - More KS utils
- `com.ksmobile.launcher.*` - Launcher utilities
- `com.ksmobile.launcher.cmbase.utils.*` - Base utilities

---

## 3. Key Runtime Observations

### C3DEngine State
- Engine main class `com.censivn.C3DEngine.a` is loaded and initialized
- `b.c.c` (WidgetManager) has a HandlerThread named "WidgetManager Database Operating"
- All shader programs loaded (ShaderColor, ShaderStandard, ShaderAlpha, etc.)
- Scene graph classes available: VObject3d, VObject3dContainer, VObjectManager

### Native Libraries
- **`libkcmutil.so`** (79KB, armeabi) - NOT LOADED at startup
- **`libandenginephysicsbox2dextension.so`** (214KB, armeabi) - NOT LOADED at startup
- Both exist in APK's `lib/armeabi/` and are extracted on device at `/data/app/com.tsf.shell-*/lib/arm/`
- ARM translation (Houdini) is available on the x86 emulator

### Missing/Not Loaded Classes
- No AndEngine core classes loaded (`org.andengine.*`)
- No LibGDX classes loaded (`com.badlogic.gdx.*`) 
- No Flurry analytics (`com.flurry.*`)
- No ACRA crash reporting (`org.acra.*`)

---

## 4. Data Flow Architecture

```
ShellApplication.onCreate()
  → init extension (com.tsf.extend.h)
  → ShellProvider.onCreate()
  → ShellBroadcastReceiver.onReceive()
  → Home.onCreate()
    → ShellModel (data binding layer)
      → manager.a.a (app management)
        → manager.bind.a/b/c/d (binding)
      → manager.action.b/f (gestures)
    → ThemeManager (theme system)
    → ShellWallpaperManager (wallpaper)
    → C3DEngine.a.init(activity)
      → VTextureManager (textures)
      → VObjectManager (scene objects)
      → ShaderManager (shaders)
      → VMessageQueueManager (message queue)
      → WidgetManager (b.c.c handler thread)
```

## 5. Immediate Action Items for Source Reconstruction

1. **Verify `InstallShortcutReceiver.java`** and **`ShellBroadcastReceiver.java`** in app source compile - both confirmed loading at runtime
2. **Check `ShellWallpaperManager`** class - confirmed at `com.tsf.shell.manager.wallpaper.ShellWallpaperManager` - needs to be in app source
3. **Theme system** (`com.tsf.shell.theme.inside.*`) - all classes confirmed loading, verify they compile
4. **C3DEngine API types** - all confirmed matching our decompiled sources
5. **Native lib loading** needs to be traced - hook `System.loadLibrary` in the :feature process and trigger 3D operations

---

## 6. Session 2 Addendum (2026-06-01) — v1.9.9.7.6 Analysis & JNI Discovery

### Updated Class Counts
- **1054 TSF Shell classes** + **203 C3DEngine** + **0 KSM** = **1257 total** (at runtime after UI interaction)
- Difference from session 1 (1308) due to different UI state affecting lazy-loaded classes

### C3DEngine Deobfuscation Reference
- **55 of 65 readable API classes kept their names** between v1.9.9.7.6 and v3.9.4
- Full method-level API reference saved at `docs/runtime_analysis/v1.9.9.7.6_C3DEngine_API.txt` (802 lines)
- Deobfuscation map at `docs/runtime_analysis/c3dengine_deobfuscation_map.txt`

#### Classes that DID get obfuscated in v3.9.4:
| v1 Readable | v3 Obfuscated |
|---|---|
| `WidgetInformation` | `com.censivn.C3DEngine.e.h` |
| `ItemInfo` | `com.censivn.C3DEngine.b.g.a.c` |
| `LauncherItem3DInfo` | `com.censivn.C3DEngine.b.h.a.b` |
| `LauncherShortcut3DInfo` | `com.censivn.C3DEngine.b.f.b` |
| `VInformation` | `com.censivn.C3DEngine.b.c.d` |
| `Utils` (native) | Absorbed into engine internals |

### Kinfoc JNI Signature (libkcmutil.so)
```
com.cm.kinfoc.a.a(String, String, String, int, String) → byte[]
```
- This is a licensing/auth SDK method (returns encrypted byte[] response)
- 26 `com.cm.kinfoc.*` classes loaded at runtime (packages a-q)
- Native libs confirmed loaded at `/proc/13579/maps` (both 76KB and 214KB)

### Version History (confirmed via APKMirror + apkbe.com)
| Version | Date | Notes |
|---------|------|-------|
| v1.3.0 | Mar 2012 | Earliest known build (links dead) |
| v1.4.2 | Apr 2012 | Links dead |
| v1.9.9.6 | Aug 2013 | Earliest on apkbe.com |
| v1.9.9.7.6 | Oct 2015 | **Best unobfuscated reference (analyzed)** |
| v2.0-3.8.x | 2013-2015 | Gradual obfuscation |
| v3.9.4 | Feb 2019 | Fully obfuscated (current target) |

### Frida 17.10.0 Findings & Fixes
| Issue | Fix |
|-------|-----|
| `Java.use().method.implementation = fn` hooks never fire for GL thread methods | **`Java.deoptimizeEverything()`** — JIT-compiled hot methods bypass normal ART dispatch that Frida hooks |
| `Module.findExportByName('libEGL.so', 'eglSwapBuffers')` fails inside `Java.perform()` | `Process.findModuleByName()` + `module.findExportByName()` works — `Module` global may be shadowed inside `Java.perform` scope |
| `Module.findExportByName(null, ...)` fails | Must pass explicit module name string |
| `Process.getModuleByName()` / `Module.findModuleByName()` fail for native libs despite being in /proc/maps | Apps loaded via linker namespace (`android:isolatedSplits`) hide libs from `dl_iterate_phdr` |
| Python Frida API transport timeouts | CLI `frida -U -f com.tsf.shell -l script.js` spawn mode is reliable |
| **Working approaches**: CLI spawn mode + `Java.deoptimizeEverything()` + `Process.findModuleByName()` for native hooks

### Saved Files in docs/runtime_analysis/
| File | Size | Content |
|------|------|---------|
| `all_loaded_classes.txt` | 38KB | 1257 runtime classes |
| `v1.9.9.7.6_all_classes.txt` | 68KB | 2282 DEX classes from v1 |
| `v1.9.9.7.6_C3DEngine_API.txt` | 33KB | Full API with method signatures |
| `c3dengine_deobfuscation_map.txt` | 6KB | Name mapping v1→v3 |
| `scene_graph_trace.txt` | 7KB | Container hierarchy dump (3 roots, fully mapped) |
| `frame_composition_trace.txt` | 78KB | 92 frames of per-frame draw composition |
| `scripts/frida_fixed_trace.js` | 4.7KB | Working rendering pipeline tracer (deoptimize + egl + draw) |
| `scripts/frida_frame_trace.js` | 1.3KB | Per-frame composition tracer |
| `scripts/frida_interactive_trace.js` | 2.1KB | Combined draw + container mutation tracer |
| `scripts/frida_hierarchy2.js` | 2.0KB | Container hierarchy tree builder |
| `scripts/frida_phase2_comprehensive.js` | 3.3KB | Full activity + transition + touch + wallpaper hooks |
| `scripts/frida_phase3_transforms.js` | 3.0KB | VObject3d transform + page transition tracer |
| `scripts/frida_phase5_remaining.js` | 4.4KB | Method enumeration + KSM check + Activity lifecycle |
| `scripts/frida_final_activity_trace.js` | 2.4KB | Clean Activity lifecycle tracer |
| `method_enumeration_output.txt` | 4.4KB | Full method sigs for all discovered classes |
| `activity_lifecycle_trace.txt` | 1.5KB | Activity create/resume/pause/destroy sequence |

### Scene Graph Constructor Scripts
All scripts follow the same pattern:
1. `retryEgl()` outside `Java.perform()` using `Process.findModuleByName('libEGL.so')`
2. `Java.deoptimizeEverything()` inside `Java.perform()` first
3. Java method hooks installed after deoptimization
4. Accumulate data per-frame, dump at `eglSwapBuffers` boundary

---
## 6. Session 3: Rendering Pipeline & Scene Graph (2026-06-01)

### Breakthrough: `Java.deoptimizeEverything()`
After 4 failed attempts to hook GL thread Java methods, calling `Java.deoptimizeEverything()` before installing method hooks forced ART into interpreter mode, making all VObject3d.draw() hooks fire on every frame.

### Per-Frame Composition (92 frames captured, invariant)
**20 draw calls per frame, ~6 FPS on emulator:**
```
AlarmWidget          x1  — main clock container
  k                  x1  — alarm container widget
  a                  x1  — clock face
  b                  x1  — hour hand
  g                  x1  — date/time info container
  h                  x1  — sub-widget
  l                  x1  — sub-widget
  VRectangle         x12 — decorative panels (children of g)
  q                  x1  — alarm time text
```
Scene was **identical across all 92 frames** — no objects added/removed.

### Container Scene Graph (3 roots, 57 mutations)
```
Root 1: f.h.a.a.a.b (main app container)
  └── VObject3dContainer
      └── VObject3dContainer (page host, 3 kids)
          ├── f.e.c.a.b (page 0) — EMPTY
          ├── f.e.c.a.c (other)
          └── f.e.c.a.b (page 1) — EMPTY

Root 2: manager.wallpaper.a$b (wallpaper dock, 3 kids)
  ├── VButton x2
  └── wallpaper.a$a

Root 3: widget.alarm.AlarmWidget
  └── k (alarm container, 2 kids)
      ├── a (clock face, 15 kids)
      │   ├── b (hour hand)
      │   ├── VRectangle x2 (clock face background)
      │   ├── j x2 (tick marks)
      │   ├── c.b (button)
      │   ├── c.d x7 (digit segments, each with 2 VRectangles)
      │   ├── c.a (alarm data)
      │   └── c.c (other)
      └── g (info container, 17 kids)
          ├── h (widget)
          ├── l (widget)
          ├── VRectangle x13 (decorative panels)
          ├── q (alarm time text)
          └── c.b (button)
```

### Key Architectural Discovery
- **Widgets are NOT children of pages** — the alarm widget floats as a separate root alongside the page host container
- Pages (`f.e.c.a.b`) are empty leaf nodes — no widget children added via addChild
- The wallpaper dock (`wallpaper.a$b`) is a third independent root
- Activities (wallpaper picker, personalization, widget picker) open as standard Android overlays — they do NOT add VObjects to the 3D scene graph
- ADB touches/swipes did not trigger any scene graph mutations — page transitions likely use matrix transforms on the page container rather than add/remove

### Interactive Activity Testing (Phase 2 — with lifecycle hooks)
| Activity | Process | Lifecycle Observed | 3D Scene Changes |
|----------|---------|-------------------|------------------|
| `ShellActivity` (main) | main | ACT_CREATE, ACT_DESTROY | Initial setup only |
| `Home` (main) | main | ACT_CREATE, ACT_RESUME, ACT_PAUSE | — |
| `SettingActivity` (alarm) | `:alarm` | Not traceable (sub-process) | Separate C3DEngine instance |
| `WallpaperPickerActivity` | `:wallpaperSelector` | Not traceable (sub-process) | Separate C3DEngine instance |
| `PersonalizationActivity` | **main** | ACT_CREATE, ACT_RESUME, ACT_PAUSE, ACT_DESTROY | No scene changes |
| `ThemeCmClubActivity` | main | **CRASH** — `Service Intent must be explicit` | — |
| `ThemeDIYActivity` | main | **CRASH** — Same error | — |
| `APPWIDGET_PICK` intent | main | Started, no 3D changes | — |

**Key discovery:** The wallpaper picker and alarm settings run in DEDICATED PROCESSES (`:wallpaperSelector`, `:alarm`) with their own C3DEngine instances. The Demo/preview mode renders there. Frida's Java bridge cannot initialize in these sub-processes on API 28.

### Page Transition Mapping (Phase 3)
Page transitions confirmed via `f.e.c.a.c.a(b, b)` — takes two page container references (from, to). Page positions set via `f.e.c.a.b.a(float)` (position) and `b(float)` (scale). Pattern during transition: POS:128 (initial) → SCALE:-127.5 (offscreen) → POS:75.0 (final). Swipes do NOT use addChild/removeChild — purely matrix/position changes on existing containers.

### VObject3d Transform API Change (v1 vs v3)
**v1.9.9.7.6** had `setPosition()`, `setScale()`, `setRotation()` methods. **v3.9.4** removed these. The new API uses:
- `position()` → returns mutable `Number3d` 
- `scale()` → returns mutable `Number3d`
- Mutate the returned object, then call `updateAABBMatrix(float[])`
- Also available: `drawMVPMatrix()`, `getAABBMatrix()`

### Complete Method Inventory (Phase 1+5)
#### Page System (com.tsf.shell.f.e.c.a.*)
| Class | Methods | Role |
|-------|---------|------|
| `a` | `a(float,float)`, `b(float,float)` | Page layout helper |
| `b` (page) | `a()→float`, `a(float)`, `a(float,float)`, `a(e)`, `b(float)` | Page container (position/scale) |
| `c` (host) | `a(b,b)` (transition!), `a()` (init), `drawElement()`, `a(float,float,float,int)→e`, `a(float,float,float,float)` (private), `b()` (private) | Page host controller |
| `d` | `a()`, `a(float)`, `a(float,float,float,int)`, `b()`, `b(float)`, `c()`, `c(float)`, `d()`, `d(float)`, `e()`, `e(float)`, `f()`, `onDrawStart()` | Page state/animator |
| `e` | `a(e)`, `b(e)` (both take/return `e`) | Page info/data object |

#### Wallpaper Manager
| Class | Key Methods |
|-------|-------------|
| `wallpaper.a$b` | `a()` (init), `a(float,float)` (set offset/parallax), `b()` (toggle show), `a(Bitmap,float,float)→Bitmap` (scale), `onDrawStart()`, `onDrawEnd()` |
| `wallpaper.a$a` | `a(float,float)` (wallpaper object offset) |

#### Touch Dispatch
- `AlarmWidget.calTouchCollision(float, float)` — touch entry point (confirmed firing at 360,80)
- `alarm.b.calTouchCollision(float, float)` — hour hand touch
- `alarm.h.calTouchCollision(float, float)` — sub-widget touch

#### KSM (com.ksm.*)
**0 classes loaded** at runtime in current UI state. Not active.

### VPage Transition Parameters (Captured)
Default page transition parameters (from `f.e.c.a.d.a(float,float,float,int)`):
- `TRANSITION_PARAMS: x=275 y=75 dur=17.5ms easing=-16731076`
- `x` and `y` are animation start/end positions in 3D workspace units
- `dur` is duration in milliseconds (17.5ms seems very fast — possibly a framerate-derived value or percentage)
- `easing` is encoded as a 32-bit int: `-16731076` (0xFF00CCFC unsigned = 4279238908)
- The easing value is NOT a standard Android resource ID; likely a bitmask encoding (easing curve type + direction + flags)

Page position/scale sequence during default transition:
1. `PAGE_POS:128` — both pages at position 128 (offscreen right)
2. `PAGE_SCALE:-127.5` — target page scaled to -127.5 (negative = flipped/mirrored offscreen)
3. `PAGE_POS:75.0` — target page slides to position 75 (visible)
4. `TRANSITION` fires after position changes complete (lazy POST animation event)
5. `ANIM_B:45` — animation counter/step

Page container identity (hashcodes):
- `141078287` and `243485596` — the two page container objects
- Pages cycle: FROM→TO identities swap per swipe direction

Script: `scripts/frida_vpage_transitions.js` — hooks `c.a(Page,Page)`, `d.a(x,y,dur,easing)`, page pos/scale, Number3d.setAll, wallpaper.

**To capture different transition types**: Run script, manually open Settings → Effect via emulator GUI, switch transition type, then swipe pages. Compare `easing` parameter value across types.

### Native Library Analysis (Direct ELF parsing)

#### libkcmutil.so (79KB) — Kinfoc Analytics JNI
- ARM 32-bit, stripped, dynamically linked
- Built with NDK using gabi++/stlport (C++ exceptions support)
- No exported `Java_*` symbols — JNI registered **dynamically** via `JNI_OnLoad` + `RegisterNatives`
- **Java class**: `com.cm.kinfoc.a` (confirmed via string `com/cm/kinfoc/a` in binary)
- **Key**: `tsflauncher_public` (encryption key for kinfoc data)
- **Storage path**: `/mnt/sdcard/kinfoc/` (writes encrypted analytics data to SD card)

**Detected methods** (from JNI descriptor strings):
- `([B)Ljava/lang/String;` — `native String decrypt(byte[])`
- `(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)[B` — `native byte[] report(String, String, String, int, String)` → matches `com.cm.kinfoc.a.a`
- `(Ljava/lang/String;ILjava/lang/String;)[B` — `native byte[] encrypt(String, int, String)`
- `(Ljava/lang/String;)[B` — `native byte[] process(String)`

The `libkcmutil.so` is the JNI backing for the Kinfoc tracking/analytics library. All native methods are registered at `JNI_OnLoad`, which is why Frida's `Module.findExportByName()` doesn't see them — they're not named exports but function pointers passed to `RegisterNatives`.

**Implication for Frida hooking**: To hook these native methods, use `Module.findBaseAddress("libkcmutil.so")` + pattern scan for `JNI_OnLoad`, or hook `Java_com_cm_kinfoc_a_a` by intercepting `RegisterNatives` in `JNI_OnLoad`.

#### libandenginephysicsbox2dextension.so (214KB) — Box2D Physics
- Standard libgdx Box2D wrapper for AndEngine
- Full `com.badlogic.gdx.physics.box2d.*` JNI bindings (Body, World, Fixture, Joint, Shape, etc.)
- ~150 exported `Java_*` functions wrapping native Box2D C++ API
- Not TSF-specific — standard 3rd-party physics engine binding

### GLSL Shader Extraction (Complete)
All 7 Shader* classes extracted from both v1.9.9.7.6 and v3.9.4:

| Shader | v1 vs v3 | Notes |
|--------|----------|-------|
| ShaderAlpha | **Identical** | Alpha-blended texture |
| ShaderColor | **DIFFERENT** | v1: `gl_FragColor = vColor;` v3: `gl_FragColor = vColor*texture2D(sTexture, vTextureCoord).rgba;` |
| ShaderColorMatrixTexture | **Identical** | Color + texture with matrix transform |
| ShaderColorTexture | **Identical** | Color + texture |
| ShaderFillColorTexture | **Identical** | Fill color + texture |
| ShaderStandard | **Identical** | Standard textured |
| ShaderTextureMatrix | **Identical** | Texture with ST matrix |

**Key difference**: ShaderColor fragment was upgraded in v3 to multiply color by texture (was solid color in v1). All other shaders unchanged.

**Storing pattern**: 6/7 shaders use instance fields in `<init>` (constructor) in v3; ShaderTextureMatrix uses static fields in `<clinit>` (unique).

### TSF Shell Data Model (Database Schema)
Pulled from emulator: `TSFLauncher-database.db` with 8 tables.

**favorites table** (home screen items):
- `container`: `-1`=workspace, `-2`=quicklaunch, `-3`=dock, `-4`=sliding dock
- `itemType`: `2`=app shortcut, `5`=widget, `7`=custom TSF action
- `scale/rotation`: stored as `"x,y"` strings (e.g. `"1.0,1.0"`, `"0.8,0.8"`)
- `config`: JSON for widgets (cloud floating params)

**Action IDs** (via intent `i.action=`):
- `100`=app drawer toggle, `200`=Themes, `300`=Effect, `400`=Gestures, `800`=Dock
- `6`=All Apps, `8`=Lasso mode, `19`/`20`=Themes/Panda Keyboard

See `docs/runtime_analysis/tsf_database_schema.txt` for full schema.

### Shader Extraction Files
- v1 shaders (14 files): `docs/runtime_analysis/shaders/`
- v3 shaders (14 files): `docs/runtime_analysis/shaders_v3/`
- v3 extraction script: `extract_shaders_v3_final.py` (fixed to handle `<clinit>`+`<init>`, IndexError)

### TSF Shell Java Layer Deobfuscation
- Map: `docs/runtime_analysis/tsf_shell_deobfuscation_map.txt` (5964 lines)
- Packages: `com.tsf.shell.*` (main), `com.tsf.a`/`b` (obfuscated top-level), `com.tsf.extend.*` (theme providers)
- v3 obfuscated sub-packages: `a`, `b`, `d`, `e`, `f` (with `f.a`-`f.e` sub-packages), `activity`, `manager`, `services`, `theme`, `widget`
- 55 unchanged C3DEngine API classes, 19 unchanged TSF Shell classes

---

## 17. Page Transition Architecture (Complete)

### Overview
Page transitions bypass Java VObject3d transform API entirely. Instead, a **scroll-offset based model** drives transitions: touch events set a float field `g`, and the per-frame render loop `n$c.c()` reads this offset to position all pages via a transition effect controller.

### Key Classes

| Class | Role |
|-------|------|
| `f.f.n$c` | Page carousel controller (89 methods) |
| `f.f.l` | Transition effect base/interface (18 methods) |
| `f.f.b.a` | "Cloth" transition (3D mesh page curl) |
| `f.e.j` | Alpha/fade page effect with grid tiles |
| `C3DEngine.b.g.c` | Tween scheduler (static) |
| `C3DEngine.b.g.b.b` | Tween target (implements `b.g.b.a`) |
| `C3DEngine.b.g.d` | Tween callback interface (`a()` complete, `a(F)` progress) |

### Touch → Page Flip Chain

1. **Touch dispatch**: `C3DEngine.a.d$1.onTouch()` → creates gestures → `$3` mouse listener
2. **$3 handlers**:
   - `a(ME, ME)` — drag: rotates carousel `rotation.y`, clamped ±400°
   - `b(ME, ME, F, F)` — fling end: snaps to nearest 360° alignment
   - `e(ME)` — touch up: registers tween target, finalizes rotation
3. **$6 runnable**: Created by fling handler, posted to GL thread via `C3DEngine.b.c.c.b(Runnable)`
4. **`$6.run()`**: Calls `n$c.d()` → `n$c.a(null)` → resets carousel state
5. **Render loop `n$c.c()`** (222 instr):
   - Called every frame by C3DEngine GL thread
   - Reads scroll offset `g` → calls `c.l.b(F, F)` (transition effect positioning)
   - Applies damping with `n$c.b` friction constant
   - Eventually calls `a(Z)V` to finalize

### Tween Engine (`C3DEngine.b.g.*`)

Replaced the v1 `VTween`/`VTweenParam`/`VEasing` API with a simpler system:

| v1 (unobfuscated) | v3 (obfuscated) |
|---|---|
| `api.tween.VTween` | `b.g.c` (scheduler only) |
| `api.tween.VTweenParam` | Eliminated (params → callbacks) |
| `api.tween.VEasing` | Eliminated (easing → callback impl) |
| `api.tween.TweenTarget.VTweenTarget` | `b.g.b.a` (interface) |
| `api.tween.TweenTarget.VValueTweenTarget` | `b.g.b.b` (concrete target) |
| (nonexistent) | `b.g.d` (callback interface) |

`b.g.c` methods:
- `a(b.g.b.a)` — register tween target
- `a(b.g.b.a, int, b.g.d)` — schedule tween (target, duration_ms, callback)
- `a()` — no-op tick
- `a(b.g.a.c)` — internal (unused at runtime)

### Animation Callback Classes (`n$c` inner classes)

| Class | Complete `a()` | Progress `a(F)` | Duration | Purpose |
|-------|-----------|-------------|----------|---------|
| `$2` | `b(int)` page scroll | Quadratic easing interpolation | Varied | Delayed page switch |
| `$4` | Sets flags, `o()` | Alpha/scale animation | 500ms | Snap-to-page |
| `$7` | Re-parents pages, runs callback | `s = progress * factor` | Caller-specified | Page change animation |
| `$8` | Resets state, removes items | Lerps rotation | max(500, abs(delta)*150) | Snap-back |
| `$9` | Resets flags, runs Runnable | Lerps rotation | Varied | Generic animation |

### Observed Tween Callbacks & Durations

| Callback Class | Duration | Purpose |
|---|---|---|
| `b.g.d` (generic/C3D) | 500ms | Snap-to-page |
| `b.g.d` (generic/C3D) | 250ms | Snap-back |
| `f.f.b.a$1` | 400ms | Cloth page enter |
| `f.f.b.a$2` | 400ms | Cloth page exit |
| `f.e.j$2` | 300ms | Page effect alpha lerp |
| `f.e.j$4` | 600ms | Page effect hide |
| `f.e.j$5` | 600ms | Page effect show |
| `manager.m.b$7` | 350ms | Drawer/app-manager enter |
| `manager.m.b$8` | 350ms | Drawer/app-manager exit |
| `widget.a.a.c$a$a` | 90ms | Widget breathing/pulse |
| `VTweenParam$1` | 100ms | Dock icon breathing |
| `VTweenParam$1` | 500ms | Dock icon stretch |
| `widget.a.b$1` | 1000ms | Widget scroll |
| `widget.a.a$1-4` | 1000-1500ms | Widget animations |

### Transition Effects

The transition type is NOT a numeric parameter. It's **class-based polymorphism**:
- `n$c.c` field is type `f.f.l` (base effect)
- Subclasses implement different effects:
  - `f.f.b.a` — "Cloth" 3D mesh transition (page curl/fold, uses `$1`/`$2` callbacks)
  - `f.e.j` — Alpha/fade with grid tile management (uses `$2`/`$4`/`$5` callbacks)
- `f.f.l.a(F F)V` and `f.f.l.b(F F)V` — called per-frame by `n$c.c()` for page positioning
- `f.f.l.a(g, b/a)F` — alpha fade based on scroll offset
- Default constructor: `f.f.l(int screenW, int screenH, boolean flag)`

### Key Fields of `n$c`

| Field | Type | Purpose |
|-------|------|---------|
| `c` | `f.f.l` | Current transition effect |
| `g` | float | Current scroll offset (animation driver) |
| `q` | float | Target rotation for snap |
| `s` | float | Animation progress (set by `$7.a(F)`) |
| `A` | `b/f/j` | Carousel scene node |
| `B` | `b/f/j` | Background/touch region node |
| `F` | `b/d/a` | Mouse event listener |
| `G` | `b.g.b.b` | Tween target |
| `H` | `b.g.d` | Active tween callback |
| `a`, `b` | float | Friction/damping constants |
| `n` | float | Carousel orbit radius |
| `D` | float | Angular step per page |
| `E` | `n$c$a` | Comparator (cos-based page ordering) |
| `L`, `I`, `M` | Various | Active page, target page, pending runnable |

### Tween Deobfuscation Map

```
v1 (unobfuscated)                   v3 (obfuscated)
---                                 ---
api.tween.VTween                    b.g.c
api.tween.VTweenParam               (eliminated)
api.tween.VEasing                   (eliminated)  
api.tween.TweenTarget.VTweenTarget  b.g.b.a
api.tween.TweenTarget.VValueTweenTarget b.g.b.b
(interface only)                    b.g.d (new)
```

### Bytecode Confirmed: No Native Bypass
Previous conclusion of "purely native/JNI" was **incorrect**. The animation goes through:
1. Java tween scheduler `b.g.c` (C3DEngine)
2. Java callbacks `n$c$7/$4/$8/$9/$2` implementing `b.g.d`
3. Java render loop `n$c.c()` (222 instr)
4. Java field manipulation on `Number3d.y` (rotation) and `PositionNumber3d.z` (position)
5. Java transition effect controller `f.f.l.b(F F)V`

The `VObject3d.updateAABBMatrix` and older setPosition/setScale APIs are dead code — v3 replaced them with direct field access on mutable Number3d objects.

---

## 18. Complete Transition Effect Catalogue

### All 20 `f.f.l` Subclasses

| Class | Display Name |
|-------|-------------|
| `f.f.b.a` | Cloth |
| `f.f.b.b` | Crossfade |
| `f.f.b.c` | Cube |
| `f.f.b.d` | Curtain |
| `f.f.b.e` | Diary |
| `f.f.b.f` | Cylinder |
| `f.f.b.g` | Fan |
| `f.f.b.h` | Flip |
| `f.f.b.i` | Fold Page |
| `f.f.b.j` | Hon |
| `f.f.b.k` | Horse |
| `f.f.b.l` | Roll |
| `f.f.b.m` | Scale In/Out |
| `f.f.b.n` | Wave Zoom Out |
| `f.f.b.o` | Slope Inside |
| `f.f.b.p` | Slope Outside |
| `f.f.b.q` | Stack |
| `f.f.b.r` | Smooth |
| `f.f.b.s` | Wave |
| `f.f.b.t` | Windmill |

### Hierarchy
```
f.f/l (base interface/abstract)
  └─ f.f/f (abstract with animation logic)
       └─ f.f/i (intermediate with renderer setup)
            └─ f.f.b/a through f.f.b/t (20 concrete effects)
```

### Registry & Selection
- **`f.f/m`** creates all 20 instances at startup in `<init>()`, plus ~12 app drawer transition instances
- Desktop transitions stored in `f.f/d` container, drawer in `f.f/e`
- **`f.f/d.c(I)`** selects transition by integer ID code (matching `R$id` resource)
- **`f.f/d.h()`** returns the current active `f.f/l` instance
- Preference persisted by **`manager/b/e`** as comma-separated string of IDs
- Each concrete subclass constructor: `(I Z)V` — resource ID + boolean flag

---

## 19. Carousel Orbit Parameters (Confirmed at Runtime)

### Runtime Values (Pixel 3a XL, 1080×2160, 4 pages)

| Field | Value | Description |
|-------|-------|-------------|
| `n` | **937.3078** | Orbit radius (pixels) |
| `D` | **90.0** | Angular step per page (degrees) |
| `a` | **0.125** | Friction constant |
| `b` | **0.3** | Damping constant |

### Orbit Radius Formula (`n$c.m()`)

```
radius = (screenWidth * 0.45) / sin((180/pageCount) * π / 180) + (200.0 * density)
```

Where:
- `screenWidth` = `C3DEngine.b.b.a.F` (int, pixels)
- `density` = `C3DEngine.b.b.a.b` (float, typically ~1.25)
- Constants decoded: `0.9f` = `0x3F666666`, `200.0f` = `0x43480000`
- Trigonometric constants: `π` = `0x400921FB54442D18`, `180.0` = `0x4066800000000000`

### Angular Step Formula (`n$c.c(F)V`)

```
D = 360.0 / pageCount
```

Where `pageCount` = parent `n.n` (int field).

### Derived Fields

| Field | Formula |
|-------|---------|
| `o` | `-n` (negated orbit radius) |
| `p` | `-(int)(n * 3.484375)` (pixel offset) |
| `C` | (double, unused = 0) |
