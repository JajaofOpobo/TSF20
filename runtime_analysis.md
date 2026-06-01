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

### Interactive Activity Testing
| Activity | Result |
|----------|--------|
| `WallpaperPickerActivity` | Launched, no scene graph changes |
| `PersonalizationActivity` | Launched, no scene graph changes |
| `ThemeDIYActivity` | **CRASH** — `Service Intent must be explicit` |
| `APPWIDGET_PICK` intent | Launched, no scene graph changes |
| Long-press / Tap / Swipe | No scene graph mutations detected |

### Native Library Module Enumeration (still blocked)
- `libkcmutil.so` (76KB) and `libandenginephysicsbox2dextension.so` (214KB) confirmed loaded via `/proc/pid/maps`
- Frida's `Process.enumerateModules()` does NOT include them (linker namespace isolation)
- Workaround: parse `/proc/pid/maps` from script, pass base to `Memory.scan()` or `Interceptor.attach()` at raw offset
