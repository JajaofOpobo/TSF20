// Compute carousel params from known formulas instead of hooking
Java.deoptimizeEverything();

function poll(attempt) {
    Java.perform(function() {
        // Read screen dimensions from C3DEngine config
        try {
            var C3DConfig = Java.use("com.censivn.C3DEngine.b.b.a");
            var screenW = C3DConfig.F.value;
            var screenH = C3DConfig.G.value;
            var density = C3DConfig.b.value;
            console.log("Screen: " + screenW + "x" + screenH + " density=" + density);
        } catch(e) {
            console.log("C3DConfig err: " + e);
        }

        // Read page count from parent n via n$c instance
        try {
            Java.choose("com.tsf.shell.f.f.n$c", {
                onMatch: function(inst) {
                    var fields = inst.getClass().getDeclaredFields();
                    var pageCount = 0;
                    var screenWidth = 0;
                    var nField;
                    var DField;

                    for (var i = 0; i < fields.length; i++) {
                        var f = fields[i];
                        f.setAccessible(true);
                        var name = f.getName();
                        var type = f.getType().getName();

                        if (name === 'n' && type === 'float') nField = f;
                        if (name === 'D' && type === 'float') DField = f;
                        if (name === 'a' && type === 'float') {
                            console.log("friction a=" + f.getFloat(inst));
                        }
                        if (name === 'b' && type === 'float') {
                            console.log("damping b=" + f.getFloat(inst));
                        }
                        if (name === 'e' && !type.startsWith('float')) {
                            // parent n — read its n field (pageCount)
                            try {
                                var parentN = f.get(inst);
                                if (parentN) {
                                    var pFields = parentN.getClass().getDeclaredFields();
                                    for (var j = 0; j < pFields.length; j++) {
                                        var pf = pFields[j];
                                        pf.setAccessible(true);
                                        var pn = pf.getName();
                                        var pt = pf.getType().getName();
                                        if (pn === 'n' && pt === 'int') {
                                            pageCount = pf.getInt(parentN);
                                            console.log("pageCount=" + pageCount);
                                        }
                                    }
                                }
                            } catch(e2) {
                                console.log("parent err: " + e2);
                            }
                        }
                    }

                    // Read actual n and D values
                    console.log("n(orbit radius)=" + nField.getFloat(inst));
                    console.log("D(angular step)=" + DField.getFloat(inst));

                    // Compute what they SHOULD be
                    if (pageCount > 0) {
                        console.log("COMPUTED D = 360 / " + pageCount + " = " + (360.0 / pageCount));
                    }
                },
                onComplete: function() {}
            });
        } catch(e) {
            console.log("Main err: " + e);
        }
    });
}

setTimeout(function() { poll(1); }, 8000);
console.log("[*] Polling at 8s...");
