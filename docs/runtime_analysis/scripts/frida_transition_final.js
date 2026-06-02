// Page Transition Final Capture
// Captures all tween registrations and animation callbacks for page transitions
Java.deoptimizeEverything();

Java.perform(function() {
    function objDesc(o) {
        if (!o) return "null";
        try { return o.getClass().getName(); } catch(e) { return String(o); }
    }

    var frameNo = 0;

    // ====== 1. Tween manager ======
    try {
        var Mgr = Java.use("com.censivn.C3DEngine.b.g.c");
        Mgr.a.overload('com.censivn.C3DEngine.b.g.b.a', 'int', 'com.censivn.C3DEngine.b.g.d').implementation = function(target, dur, cb) {
            console.log("[SCHEDULE] " + objDesc(cb) + " dur=" + dur + "ms target=" + objDesc(target));
            return this.a(target, dur, cb);
        };
        console.log("[*] b.g.c hooked");
    } catch(e) { console.log("[!] b.g.c: " + e); }

    // ====== 2. Page transition callbacks ======
    function hookCb(cls, tag) {
        try {
            var K = Java.use(cls);
            K.a.overload().implementation = function() {
                console.log("[" + tag + "] complete");
                return this.a();
            };
            K.a.overload('float').implementation = function(f) {
                console.log("[" + tag + "] progress " + f.toFixed(4));
                return this.a(f);
            };
            console.log("[*] " + tag + " OK");
        } catch(e) {}
    }
    hookCb("com.tsf.shell.f.f.b.a$1", "CLOTH_IN");
    hookCb("com.tsf.shell.f.f.b.a$2", "CLOTH_OUT");
    hookCb("com.tsf.shell.f.e.j$2", "EFFECT_ALPHA");
    hookCb("com.tsf.shell.f.e.j$4", "EFFECT_HIDE");
    hookCb("com.tsf.shell.f.e.j$5", "EFFECT_SHOW");
    hookCb("com.tsf.shell.f.f.n$c$2", "N$C_2");

    // ====== 3. Fling handler for context ======
    try {
        var PC = Java.use("com.tsf.shell.f.f.n$c");
        PC.d.overload('android.view.MotionEvent', 'android.view.MotionEvent', 'float', 'float').implementation = function(e1, e2, v1, v2) {
            var dx = Math.abs(e2.getX() - e1.getX());
            console.log("[FLING] dx=" + dx);
            return this.d(e1, e2, v1, v2);
        };
        console.log("[*] fling hooked");
    } catch(e) { console.log("[!] fling: " + e); }

    // ====== 4. Render loop frame counter for context ======
    try {
        var EGL = Java.use("android.opengl.EGL14");
        console.log("[*] EGL14 available");
    } catch(e) {}

    console.log("[*] ===== READY =====");
    console.log("[*] Swipe pages in emulator now to capture transition data.");
});
