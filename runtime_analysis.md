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
