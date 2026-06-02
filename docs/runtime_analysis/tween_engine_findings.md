# Tween Engine & Page Transition Findings

## Complete Architecture Discovered (Jun 2, 2026)

### What We Found
1. **Tween engine is `C3DEngine.b.g.*`** (NOT `f.e.c.a` as previously assumed)
2. **Page animation uses Java-level tweens** through `b.g.c.schedule(target, duration_ms, callback)` — NOT native/JNI bypass
3. **Transition type is class-based** (not numeric parameter): `f.f.l` base class with `f.f.b.a` (cloth) and `f.e.j` (alpha/fade) subclasses
4. **VObject3d.updateAABBMatrix and setPosition/setScale are DEAD CODE** in v3.9.4 — replaced by direct field access on mutable Number3d objects
5. **VTween/VTweenParam/VEasing from v1 replaced** by simplified `b.g.c` scheduler + `b.g.d` callback interface

### How Page Transitions Work
1. Touch → fling handler sets scroll offset `g` → posts `$6` runnable to GL thread
2. `$6.run()` calls `n$c.d()` (3 instr) → resets carousel
3. Render loop `n$c.c()` (222 instr) reads `g` each frame, calls transition effect `c.l.b(F,F)`
4. After fling ends, snap-to-page tweens via `b.g.c.a(target, 500ms, $4)` or `b.g.c.a(target, 250ms, $8)`
5. Page change creates `$7` callback and schedules tween with caller-specified duration

### Key Tween Parameters Captured
- Snap-to-page: 500ms (generic `b.g.d` callback)
- Snap-back: 250ms (generic `b.g.d` callback)
- Cloth transition in: 400ms (`f.f.b.a$1`, lerps cloth z forward)
- Cloth transition out: 400ms (`f.f.b.a$2`, lerps cloth z backward)
- Page effect alpha: 300ms (`f.e.j$2`, lerps alpha)
- Page effect hide: 600ms (`f.e.j$4`)
- Page effect show: 600ms (`f.e.j$5`)
- Drawer enter: 350ms (`manager.m.b$7`)
- Drawer exit: 350ms (`manager.m.b$8`)

### Deobfuscation: v1 → v3 Tween Engine
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

### Scripts
- `frida_tween_engine_hook.js` — v1 (overload iteration, had bugs)
- `frida_tween_engine_v3.js` — v3 (direct signature hooks, captured best data)
- `frida_transition_final.js` — final clean capture

### Key Files
- `runtime_analysis.md` Section 17 — full page transition architecture
- `captures/` — raw Frida output files

### What's Still Unknown
- What triggers the specific `f.f.l` subclass selection (the transition effect picker)
- Full parameter list of `f.f.l` subclasses (screen dimensions + boolean flag seen)
- How the theme system registers custom transition effects
- KSM class loading trigger
