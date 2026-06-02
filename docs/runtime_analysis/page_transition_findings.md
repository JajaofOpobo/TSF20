# Page Transition Capture Summary

## What Was Found

### Touch → Page Flip Chain (fully traced)
1. **Touch down**: `C3DEngine.a.d$1.onTouch()` → `C3DEngine.a.b.a()` → `f.i.a.a.a()` → `f.f.n$c.d(MotionEvent, MotionEvent, float, float)` 
2. **Runnable creation**: `Nc.d()` creates anonymous `$6` runnable, posted via `C3DEngine.b.c.c.b()` to GL queue
3. **Touch up**: same chain, finger-up triggers final decision
4. **Execution**: GL thread drains queue → `$6.run()` → calls `Nc.d()` (no-arg) repeatedly
5. **Animation**: `Nc.d()` no-arg fires many times per swipe (~6-14 calls per touch), but NO known page transition hooks fire during these calls

### Hooks That Work at Startup Only (NOT during user swipes)
- `c.a(Page, Page)` — fires once at startup for initial page layout
- `b.a(float)` / `b.b(float)` — page position/scale setters, fire only at startup
- `d.a(float,float,float,int)` — transition params, fires once at startup
- `VTween.to()` / `VTweenParam.setEase()` — only catches icon breathing animations (EASE:101), not page transitions

### Engine Queue Architecture
- **Queue class**: `com.censivn.C3DEngine.b.c.c` (exists at runtime)
- **Enqueue methods**: `a(RenderRunnable)`, `c(Runnable)` (GL thread), `b(Runnable, long)` (delayed)
- **Drain**: `a()` — per-frame drain
- **VMessageQueueManager** (`com.censivn.C3DEngine.api.message`) — separate sub-queue for widgets

### Why Page Hooks Don't Fire During Swipes
Page transitions during user swipes do NOT go through:
- `f.e.c.a.c.a(Page, Page)` — page controller transition
- `f.e.c.a.d.a(3f,i)` — transition parameter creation
- `f.e.c.a.b.a(float)` / `b(float)` — page position/scale setters
- VTween animation system
- VMessageManager / VMessageQueueManager message dispatch

The page flip animation must happen through a different mechanism — likely either:
- Direct native code (JNI) that manipulates VObject3d transforms
- OpenGL matrix manipulation without going through Java methods
- PositionNumber3d.spX()/spY() setters (not hooked yet)
- VObject3d.updateAABBMatrix() (not hooked yet)

### Key Classes Identified
- **Touch handler (gesture decision)**: `com.tsf.shell.f.f.n$c` — method `d()` has multiple overloads
- **Posted runnable**: `com.tsf.shell.f.f.n$c$6` — created during touch, runs on GL thread
- **Engine queue**: `com.censivn.C3DEngine.b.c.c` — methods a(RR), c(R), b(R,long), a()
- **Engine touch handler**: `com.censivn.C3DEngine.a.d$1` — onTouch listener
- **Intercept touch**: `com.tsf.shell.e.e` — onInterceptTouchEvent

### OpenGL-Level Targets (not yet tested)
- `VObject3d.updateAABBMatrix(float[])` — applies position/scale/rotation to 3D objects
- `PositionNumber3d.spX(float)` / `spY(float)` — screen-percentage position setters
- `PositionNumber3d.pxX(float)` / `pxY(float)` — pixel position setters
