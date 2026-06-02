// Call m() and c(F)V on live instance to trigger computation
Java.deoptimizeEverything();

setTimeout(function() {
    Java.perform(function() {
        try {
            Java.choose("com.tsf.shell.f.f.n$c", {
                onMatch: function(inst) {
                    console.log("[INSTANCE FOUND]");

                    // Read current values
                    var fields = inst.getClass().getDeclaredFields();
                    var vals = {};
                    for (var i = 0; i < fields.length; i++) {
                        var f = fields[i];
                        f.setAccessible(true);
                        var type = f.getType().getName();
                        var name = f.getName();
                        if (type === 'float') vals[name] = f.getFloat(inst);
                        else if (type === 'int') vals[name] = f.getInt(inst);
                        else if (type === 'boolean') vals[name] = f.getBoolean(inst);
                    }

                    console.log("Before call: n=" + vals['n'] + " D=" + vals['D'] + " o=" + vals['o'] + " p=" + vals['p']);

                    // Call m() directly to compute orbit radius
                    try {
                        var computedN = inst.m();
                        console.log("m() returned: " + computedN);
                    } catch(e) {
                        console.log("m() call error: " + e);
                    }

                    // Try calling c(F)V with a dummy float
                    try {
                        console.log("Calling c(1.0)...");
                        inst.c(1.0);
                        // Re-read values
                        for (var i = 0; i < fields.length; i++) {
                            var f = fields[i];
                            f.setAccessible(true);
                            var type = f.getType().getName();
                            var name = f.getName();
                            if (type === 'float') vals[name] = f.getFloat(inst);
                        }
                        console.log("After c(1.0): n=" + vals['n'] + " D=" + vals['D'] + " o=" + vals['o'] + " p=" + vals['p']);
                    } catch(e) {
                        console.log("c(1.0) error: " + e);
                    }
                },
                onComplete: function() {}
            });
        } catch(e) {
            console.log("Error: " + e);
        }
    });
}, 8000);

console.log("[*] Will call m() and c(F)V at 8s...");
