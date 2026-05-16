# C3DEngine API Reference

## Overview

C3DEngine is a custom OpenGL ES 2.0 3D engine built specifically for the TSF Shell launcher. It provides a complete scene graph, rendering pipeline, texture management, animation/tweening system, input handling, and 3D model loading.

**Architecture**: All public API classes in `com.censivn.C3DEngine.api.*` are wrappers around obfuscated internal implementations in `com.censivn.C3DEngine.b.*`. The static singleton `com.censivn.C3DEngine.a` provides access to all engine subsystems.

---

## Engine Singleton: `com.censivn.C3DEngine.a`

The main entry point. All launcher code accesses the engine through this class.

| Method | Returns | Purpose |
|--------|---------|---------|
| `a()` | `b.c.c` (MessageQueue) | Get message queue manager for posting runnables |
| `a(Activity)` | void | Initialize engine with activity (sets density, creates display metrics) |
| `d()` | Context | Get application context |
| `e()` | `a.e` (Renderer) | Get GLSurfaceView.Renderer implementation |
| `f()` | GLSurfaceView | Get the GLSurfaceView |
| `g()` | `b.c.f` (TextureManager) | Get texture manager |
| `b()` | String | Get package name |
| `c()` | int | Get version code |

---

## Scene Graph (`api.core`)

### `VObject3d` — Base scene graph node
Wraps internal `b.f.i`. Supports position, rotation, scale, visibility, alpha, textures, AABB collision, mouse events, VBO management.

| Method | Returns | Description |
|--------|---------|-------------|
| `position()` | PositionNumber3d | Get position vector |
| `rotation()` | Number3d | Get rotation vector |
| `scale()` | Number3d | Get scale vector |
| `alpha()` / `alpha(int)` | int / void | Get/set alpha (0-255) |
| `visible()` / `visible(Boolean)` | boolean / void | Get/set visibility |
| `name()` / `name(String)` | String / void | Get/set name |
| `parent()` | VObject3dContainer | Get parent container |
| `textures()` | VTextureList | Get texture list |
| `destroy()` / `destroy(boolean)` | void | Destroy this object |
| `invalidate()` | void | Mark for re-render |
| `point()` | PointBufferManager | Get vertex point buffer |
| `uv()` | UvBufferManager | Get UV buffer |
| `defaultColor()` / `defaultColor(Color4)` | Color4 / void | Get/set default color |
| `calTouchCollision(float, float)` | boolean | Hit test against this object |
| `getHittingTarget(float, float, boolean)` | VObject3d | Find deepest child at point |
| `setMouseEventListener(VMouseEventListener)` | void | Set touch/click handler |
| `mouseEnabled()` / `mouseEnabled(boolean)` | boolean / void | Get/set mouse input |
| `setTag(Object)` / `getTag()` | void / Object | Generic tag storage |
| `localToGlobal(Number3d)` | Number3d | Transform local to global coords |
| `globalToLocal(Number3d)` | Number3d | Transform global to local coords |
| `updateAABBMatrix(float[])` | void | Update AABB from matrix |
| `getAABBMatrix()` | float[] | Get AABB matrix |
| `syncUpdatePointVBO()` / `syncUpdateUvsVBO()` / `syncUpdateFacesVBO()` | void | Sync VBO data |
| `useVBO()` / `useVBO(Boolean)` | boolean / void | Get/set VBO usage |
| `freeVBO()` | void | Free VBO resources |
| `setZOrderOnTop()` | void | Bring to front |
| `setFocus()` / `killFocus()` | void | Focus management |
| `setCustomShader(Shader)` | void | Set custom shader |
| `resetDefaultShader()` | void | Reset to default shader |

### `VObject3dContainer` — Container node (extends VObject3d)
Wraps internal `b.f.j`. Adds child management.

| Method | Returns | Description |
|--------|---------|-------------|
| `addChild(VObject3d)` | void | Add child |
| `addChildAt(VObject3d, int)` | void | Add child at index |
| `removeChild(VObject3d)` | boolean | Remove child |
| `removeChildAt(int)` | VObject3d | Remove child at index |
| `getChildAt(int)` | VObject3d | Get child at index |
| `getChildByName(String)` | VObject3d | Find child by name |
| `getChildIndexOf(VObject3d)` | int | Get child index |
| `numChildren()` | int | Get child count |
| `children()` | ArrayList<VObject3d> | Get all children |
| `renderChildren(boolean)` | void | Enable/disable child rendering |

### `VWidgetContainer` — Widget container (extends VObject3dContainer)
For hosting launcher widgets.

### `VObjectManager` — Object manager
Manages lists of VObject3d instances.

### `VTextureManager` — Texture lifecycle manager
Create, delete, replace textures on 3D objects (with optional tween animation).

### `VTextureList` — Texture list proxy
Add/remove/get TextureDescription and TextureElement objects.

### `VRenderer` — Static renderer helpers
| Method | Description |
|--------|-------------|
| `pause()` | Pause rendering |
| `resume()` | Resume rendering |
| `lockView(float, float)` | Lock camera view |
| `unlockView()` | Unlock camera view |

---

## Primitives (`api.primitives`)

### `VBox` — 3D box/cuboid
Constructor: `VBox(float width, float height, float depth)`. Extends VObject3dContainer.

### `VRectangle` — 2D rectangle (or grid)
Multiple constructors for width/height, subdivisions, auto-size. Extends VObject3dContainer.

### `VVirtualObject` — Invisible container
Extends VObject3d. No geometry drawn. Used for grouping.

### `VNinePatchRectangle` — 9-patch scalable rectangle

---

## Element Types (`api.element`)

### `Number3d` — 3-component vector
Fields: x, y, z. Supports add, subtract, multiply, normalize, clone, cross/dot.

### `PositionNumber3d` — Position vector (extends Number3d)
Additional sp/px coordinate helpers: `spX()/spY()/spZ()`, `pxX()/pxY()/pxZ()`.

### `Color4` — RGBA color
Stored as shorts + floats. Constructors from int or individual channels.

### `TextureElement` — OpenGL texture handle
Fields: `id`, `width`, `height`, `mipMap`.

### `UvBufferManager` / `PointBufferManager` — Buffer managers
Manage vertex and UV coordinate buffer data.

### `FacesBufferedList` — Face index buffer

---

## Item Info (`api.element.info`)

| Class | Purpose |
|-------|---------|
| `ItemInfo` | Abstract base for all launcher items. Fields: `id`, `screen`, `cellX/Y`, `rotation`, `scale`, `title`, `container`, `itemType`, `spanX/Y`. |
| `LauncherAppWidgetInfo` | Android AppWidget (type=3). Fields: `appWidgetId`, `providerName`. |
| `LauncherWidget3DInfo` | 3D widget (type=5). |
| `LauncherFolder3DInfo` | Folder (type=1). Has `itemsInfos` list. |
| `LauncherDrawerFolder3DInfo` | Drawer folder variant. |
| `LauncherShortcut3DInfo` | Shortcut base. Contains `intent`, `texture`. |
| `LauncherShortcutAppInfo` | App shortcut. Adds `clickCount`, `isHide`, `versionCode`, `versionName`. |
| `LauncherShortcutStandardInfo` | Standard shortcut (type=7). Has `notifPointState`. |

---

## Events (`api.event`)

### `VMouseEventListener` — Touch/gesture event listener
Constructor takes `VObject3d`. Callbacks:
- `onSingleTapUp`, `onSingleTapConfirmed`, `onShowPress`, `onLongPress`, `onLongRelease`
- `onScroll`, `onDown`, `onUp`, `onSingleUp`, `onMove`, `onFling`
- `onDoubleTap`, `onPointer2Up`, `onPointer2Down`

---

## Tween/Animation (`api.tween`)

### `VTween` — Static tween manager
| Method | Description |
|--------|-------------|
| `to(VTweenTarget, int, VTweenParam)` | Start tween animation |
| `killTween(VTweenTarget)` | Stop tween |
| `pauseTween(VTweenTarget)` | Pause tween |
| `resumeTween(VTweenTarget)` | Resume tween |

### `VTweenParam` — Tween configuration
Property setters: `setX/Y/Z(float)`, `setRotationX/Y/Z(float)`, `setScaleX/Y/Z(float)`, `setAlpha(int)`, `setEase(int)`, `setTimeout(int)`.
Callbacks: `onStart()`, `onKill()`, `onComplete()`, `onUpdate(float)`, `setCompleteRunnable(Runnable)`.

### `VEasing` — Easing constants
- `Back`: easeIn=200, easeOut=201, easeInOut=202
- `Circ`: easeIn=100, easeOut=101, easeInOut=102
- `Elastic`: easeIn=300 (and variants)
- `Linear`: easeIn=400, easeOut=401, easeInOut=402, easeNone=403

---

## Messaging (`api.message`)

### `VMessageManager` — Static message posting
| Method | Description |
|--------|-------------|
| `postRenderRunnable(RenderRunnable)` | Post to render thread |
| `postUIThreadRunnable(Runnable)` | Post to main UI thread |
| `postUIThreadRunnable(Runnable, long)` | Post with delay |
| `postGLThreadRunnable(Runnable)` | Post to GL thread |
| `postGLThreadRunnable(Runnable, long)` | Post with delay to GL thread |

### `VMessageQueueManager` — Queue-based message manager
With pause/resume capability. Thread types: `TYPE_MAINUI_THREAD=0`, `TYPE_GL_THREAD=1`.

---

## Shell Utilities (`api.shell`)

### `VPage` — Launcher page
Methods: `addWidget(VObject3d)`, `removeWidget(VObject3d)`, `containsWidget(VObject3d)`, `getIndex()`.

### `VConsole` — Console utilities
Methods: `pauseScreenOrientation()`, `resumeScreenOrientation()`, `isTransparentNavigationBar()`, `isFullScreen()`, `context()`, `activity()`.

### `VInformation` — Screen dimension queries
Methods: `getScreenWidth()`, `getScreenHeight()`, `getStatusBarHeight()`, `Scale()`, `HDScale()`, `XHDScale()`, `engineDensity()`, `systemDensity()`, `isVerticalMode()`, `navigationBarHeight()`, `desktopWidth/Height()`, `screenRawWidth/Height()`.

---

## API Surface Called by Launcher (Home.java + Widgets)

The following 15 methods are the core interface surface called by Home.java and widget classes:

1. `a.a(Activity)` — Engine init with activity
2. `a.a()` — Get message queue
3. `a.d()` — Get context
4. `a.e()` — Get renderer
5. `a.e().g()` — Set continuous render mode
6. `a.e().h()` — Set static render mode
7. `a.e().j()` / `k()` — Request render / invalidate
8. `a.e().c(float, float)` — Hit test (touch picking)
9. `a.e().b(float, float)` — Lock camera view
10. `a.e().f()` — Unlock camera view
11. `a.g()` — Get texture manager (for creating/deleting textures)
12. `a.a(RenderRunnable)` — Post render runnable
13. `a.a(Runnable)` — Post UI runnable
14. `a.c(Runnable)` — Post GL runnable
15. `a.a(Runnable, long)` — Post delayed UI runnable
