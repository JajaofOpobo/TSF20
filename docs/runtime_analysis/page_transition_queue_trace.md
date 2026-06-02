# Page Transition Queue Trace

Date: 2026-06-02

## Purpose

Capture the real TSF Shell v3.9.4 page transition path:

```
gesture/source event -> C3DEngine queue -> page transition method -> per-frame page movement
```

This replaces the earlier high-level `VConsole`/`VTween.start` approach. In v3.9.4, `VTween.start` does not exist; the public tween entry point is `VTween.to(...)`, and the active engine queue is `com.censivn.C3DEngine.b.c.c`.

## Script

`docs/runtime_analysis/scripts/frida_transition_queue_trace.js`

Run in spawn mode:

```bash
frida -U -f com.tsf.shell -l docs/runtime_analysis/scripts/frida_transition_queue_trace.js --no-pause
```

Wait for Home to load fully, then swipe between pages. If swipes do not trigger a page change, confirm that the current desktop has multiple eligible pages and try any UI path that previously produced:

```text
TRANSITION
PAGE.a(float)
PAGE.b(float)
```

## Hooks Installed

- Engine queue:
  - `com.censivn.C3DEngine.b.c.c.a(RenderRunnable)`
  - `com.censivn.C3DEngine.b.c.c.a()`
  - `com.censivn.C3DEngine.b.c.c.a(Runnable)`
  - `com.censivn.C3DEngine.b.c.c.a(Runnable,long)`
  - `com.censivn.C3DEngine.b.c.c.c(Runnable)`
  - `com.censivn.C3DEngine.b.c.c.b(Runnable,long)`
  - `com.censivn.C3DEngine.b.c.c.b(RenderRunnable)`
- Queue facade:
  - `VMessageQueueManager.post(Runnable,int)`
  - `VMessageManager.postRenderRunnable(RenderRunnable)`
  - `VMessageManager.postGLThreadRunnable(Runnable)`
  - `VMessageManager.postGLThreadRunnable(Runnable,long)`
- Page transition path:
  - `com.tsf.shell.f.e.c.a.c.a(b,b)`
  - `com.tsf.shell.f.e.c.a.b.a(float)`
  - `com.tsf.shell.f.e.c.a.b.b(float)`
  - `com.tsf.shell.f.e.c.a.d.a(float,float,float,int)`
  - `com.tsf.shell.f.e.c.a.d.c(float)`
  - `com.tsf.shell.f.e.c.a.d.b(float)`
- Tween/effects:
  - `VTween.to(VTweenTarget,int,VTweenParam)`
  - `VTweenParam` setters for ease, timeout, position, scale, rotation, alpha
  - `VEffectsStack.addModifier/apply/collapse/clear`
- Low-priority sanity:
  - selected `VConsole` methods

## Expected Evidence

Startup should show at least:

```text
Engine queue hooks installed
ENGINE_Q.drain.begin
ENGINE_Q.drain.end
```

Transition capture should show:

```text
TRANSITION from=<page>#<hash> to=<page>#<hash>
PAGE.a(float) ...
PAGE.b(float) ...
```

For queue correlation, look immediately before `TRANSITION` for one of:

```text
ENGINE_Q.postGL runnable=<class>#<hash>
ENGINE_Q.addRender runnable=<class>#<hash>
VMQ.post runnable=<class>#<hash>
VMSG.postGLThreadRunnable.forwarded
```

Each queue enqueue logs the runnable class, thread name, and top 12 stack frames.

## If It Still Does Not Capture Manual Swipes

1. Verify that `ENGINE_Q.drain.begin/end` appears. If not, the main process or EGL hook is wrong.
2. Verify that `PAGE.a(float)`/`PAGE.b(float)` appears during startup. If yes, page hooks are valid.
3. If queue hooks fire but `TRANSITION` does not, use the stack emitted by the latest queue enqueue to identify the real transition method.
4. If no queue hooks fire during swipe, the gesture may not be changing page state. Populate multiple pages or use the UI path that previously produced `TRANSITION`.

## Current Status

Script implemented. Runtime capture still needs to be run on the rooted emulator/device.
