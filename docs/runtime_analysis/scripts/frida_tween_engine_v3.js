// Tween Engine Hook v3 - Direct signature hooks, no overload enumeration
Java.deoptimizeEverything();

Java.perform(function() {
    console.log("[*] Deoptimized. Hooking tween engine v3...");

    function objDesc(o) {
        if (!o) return "null";
        try { return o.getClass().getName(); } catch(e) { return String(o); }
    }

    // ====== 1. Hook b.g.c ======
    try {
        var Mgr = Java.use("com.censivn.C3DEngine.b.g.c");
        // 3-arg schedule: a(b.g.b.a, int, b.g.d)
        Mgr.a.overload('com.censivn.C3DEngine.b.g.b.a', 'int', 'com.censivn.C3DEngine.b.g.d').implementation = function(target, dur, cb) {
            console.log("[TWEEN_SCHEDULE] dur=" + dur + "ms cb=" + objDesc(cb) + " target=" + objDesc(target));
            return this.a(target, dur, cb);
        };
        // 1-arg register: a(b.g.b.a)
        Mgr.a.overload('com.censivn.C3DEngine.b.g.b.a').implementation = function(target) {
            // too noisy for page transition analysis, log only non-null
            return this.a(target);
        };
        console.log("[*] b.g.c hooked");
    } catch(e) { console.log("[!] b.g.c: " + e); }

    // ====== 2. Hook callbacks ======
    // Each callback has a()V and a(F)V from b.g.d interface.
    // We hook them by the implementing class + method name + signature.

    function hookCallback(clsName, tag) {
        try {
            var Klass = Java.use(clsName);
            // a()V — completion
            Klass.a.overload().implementation = function() {
                console.log("[" + tag + "] a() COMPLETE");
                return this.a();
            };
            // a(F)V — progress
            Klass.a.overload('float').implementation = function(f) {
                console.log("[" + tag + "] a(" + f.toFixed(4) + ")");
                return this.a(f);
            };
            console.log("[*] " + tag + " hooked");
        } catch(e) {
            console.log("[!] " + tag + " FAILED: " + e);
        }
    }

    hookCallback("com.tsf.shell.f.f.b.a$1", "PAGE_ANIM1");
    hookCallback("com.tsf.shell.f.f.b.a$2", "PAGE_ANIM2");
    hookCallback("com.tsf.shell.f.f.b.a",   "PAGE_ANIM_BASE");
    hookCallback("com.tsf.shell.f.e.j$2",   "PG_EFFECT_2");
    hookCallback("com.tsf.shell.f.e.j$5",   "PG_EFFECT_5");
    hookCallback("com.tsf.shell.manager.m.b$7", "MGR_B7");
    hookCallback("com.tsf.shell.f.f.n$c$7", "N$C_7");
    hookCallback("com.tsf.shell.f.f.n$c$4", "N$C_4");
    hookCallback("com.tsf.shell.f.f.n$c$8", "N$C_8");
    hookCallback("com.tsf.shell.f.f.n$c$2", "N$C_2");
    hookCallback("com.censivn.C3DEngine.api.tween.VTweenParam$1", "VTWEEN_ADAPTER");

    // ====== 3. Hook n$c page controller ======
    try {
        var PC = Java.use("com.tsf.shell.f.f.n$c");
        PC.d.overload('android.view.MotionEvent', 'android.view.MotionEvent', 'float', 'float').implementation = function(e1, e2, v1, v2) {
            var dx = Math.abs(e2.getX() - e1.getX());
            console.log("[FLING] dx=" + dx.toFixed(0) + " g_field=" + this.g.value);
            return this.d(e1, e2, v1, v2);
        };
        PC.a.overload('com.tsf.shell.f.f.g').implementation = function(g) {
            console.log("[SNAP] a(g) called");
            return this.a(g);
        };
        PC.a.overload('com.tsf.shell.f.f.l').implementation = function(l) {
            console.log("[SET_EFFECT] a(l) l=" + l + " class=" + objDesc(l));
            return this.a(l);
        };
        console.log("[*] n$c hooked");
    } catch(e) {
        console.log("[!] n$c: " + e);
    }

    console.log("[*] === ALL HOOKS INSTALLED ===");
});
