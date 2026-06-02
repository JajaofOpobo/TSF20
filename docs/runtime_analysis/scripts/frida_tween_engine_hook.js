// Tween Engine Hook v2 - Robust overload enumeration
// Deoptimize everything first for JIT-compiled methods
Java.deoptimizeEverything();

Java.perform(function() {
    console.log("[*] Deoptimized. Now hooking tween engine...");

    // Helper: safe callback toString
    function cbDesc(callback) {
        if (!callback) return "null";
        try {
            return callback.getClass().getName();
        } catch (e) {
            return callback.toString();
        }
    }

    // Helper: print stack trace (top 5 lines)
    function logStack(tag) {
        var trace = Java.use("android.util.Log").getStackTraceString(
            Java.use("java.lang.Exception").$new()
        );
        var lines = trace.split("\n");
        for (var i = 0; i < Math.min(5, lines.length); i++) {
            console.log(tag + "  " + lines[i]);
        }
    }

    // ====== 1. Hook Tween Manager: b.g.c ======
    console.log("[*] Hooking C3DEngine.b.g.c...");
    try {
        var TweenManager = Java.use("com.censivn.C3DEngine.b.g.c");

        // Enumerate all overloads of method 'a'
        var overloads = TweenManager.a.overloads;
        console.log("[*] b.g.c has " + overloads.length + " overloads of 'a'");
        for (var i = 0; i < overloads.length; i++) {
            var ov = overloads[i];
            console.log("  overload " + i + ": a" + ov.toString());
        }

        // Hook each overload
        overloads.forEach(function(ov, idx) {
            ov.implementation = function() {
                var argInfo = "";
                for (var j = 0; j < arguments.length; j++) {
                    if (j > 0) argInfo += ", ";
                    var a = arguments[j];
                    if (a === null) {
                        argInfo += "null";
                    } else if (typeof a === 'number') {
                        argInfo += a;
                    } else if (typeof a === 'boolean') {
                        argInfo += a;
                    } else {
                        argInfo += cbDesc(a);
                    }
                }
                console.log("[TWEEN_" + idx + "] a(" + argInfo + ")");
                if (idx === 0 && arguments.length >= 2) {
                    // 3-arg overload: target, int duration, callback
                    console.log("[TWEEN_SCHEDULE] duration=" + arguments[1] + "ms callback=" + cbDesc(arguments[2]));
                }
                if (arguments.length >= 1 && arguments[0] !== null) {
                    console.log("[TWEEN] target class=" + arguments[0].getClass().getName());
                }
                return ov.apply(this, arguments);
            };
        });
        console.log("[*] b.g.c hooks installed (" + overloads.length + " overloads)");
    } catch (e) {
        console.log("[!] Failed to hook b.g.c: " + e + "\n" + e.stack);
    }

    // ====== 2. Hook n$c inner class callbacks ======
    var callbackClasses = [
        { name: "$7 - Page change", cls: "com.tsf.shell.f.f.n$c$7" },
        { name: "$4 - Snap-to-page", cls: "com.tsf.shell.f.f.n$c$4" },
        { name: "$8 - Snap-back", cls: "com.tsf.shell.f.f.n$c$8" },
        { name: "$9 - Animation", cls: "com.tsf.shell.f.f.n$c$9" },
        { name: "$2 - Delayed switch", cls: "com.tsf.shell.f.f.n$c$2" }
    ];

    callbackClasses.forEach(function(cb) {
        console.log("[*] Hooking " + cb.name + "...");
        try {
            var Klass = Java.use(cb.cls);
            var aMethods = Klass.a.overloads;
            if (!aMethods) {
                console.log("[!] " + cb.cls + " has no 'a' method");
                return;
            }
            aMethods.forEach(function(ov, idx) {
                ov.implementation = function() {
                    var argStr = "";
                    for (var j = 0; j < arguments.length; j++) {
                        if (j > 0) argStr += ", ";
                        argStr += arguments[j];
                    }
                    console.log("[" + cb.name + "_" + idx + "] a(" + argStr + ")");
                    return ov.apply(this, arguments);
                };
            });
            console.log("[*] " + cb.name + " hooked (" + aMethods.length + " overloads)");
        } catch (e) {
            console.log("[!] Failed to hook " + cb.name + ": " + e);
        }
    });

    // ====== 3. Hook n$c key methods ======
    console.log("[*] Hooking n$c methods...");
    try {
        var PageCtrl = Java.use("com.tsf.shell.f.f.n$c");

        // d(ME, ME, F, F) - fling handler
        PageCtrl.d.overload('android.view.MotionEvent', 'android.view.MotionEvent', 'float', 'float').implementation = function(e1, e2, v1, v2) {
            var dx = Math.abs(e2.getX() - e1.getX());
            var dy = Math.abs(e2.getY() - e1.getY());
            console.log("[FLING] dx=" + dx.toFixed(0) + " dy=" + dy.toFixed(0) + " g(ptr)=" + this.g.value);
            return this.d(e1, e2, v1, v2);
        };

        // d() - no-arg reset
        PageCtrl.d.overload().implementation = function() {
            console.log("[CAROUSEL_RESET] d() called");
            return this.d();
        };

        // a(g) - snap-to-page
        PageCtrl.a.overload('com.tsf.shell.f.f.g').implementation = function(page) {
            console.log("[SNAP] a(g) called");
            return this.a(page);
        };

        // c() - render loop (would be VERY noisy, skip for now)
        // PageCtrl.c.overload().implementation = function() {
        //     return this.c();
        // };

        console.log("[*] n$c hooks installed");
    } catch (e) {
        console.log("[!] Failed to hook n$c: " + e);
    }

    console.log("[*] ===== ALL HOOKS INSTALLED =====");
    console.log("[*] Swipe pages in the emulator now.");
});
