// Fixed: store object references separately for further use
Java.deoptimizeEverything();

function poll(attempt) {
    Java.perform(function() {
        try {
            Java.choose("com.tsf.shell.f.f.n$c", {
                onMatch: function(inst) {
                    var klass = inst.getClass();
                    var vals = {};
                    var refs = {};
                    var fields = klass.getDeclaredFields();
                    for (var i = 0; i < fields.length; i++) {
                        var f = fields[i];
                        f.setAccessible(true);
                        try {
                            var type = f.getType().getName();
                            if (type === 'float') vals[f.getName()] = f.getFloat(inst);
                            else if (type === 'int') vals[f.getName()] = f.getInt(inst);
                            else if (type === 'boolean') vals[f.getName()] = f.getBoolean(inst);
                            else if (type === 'double') vals[f.getName()] = f.getDouble(inst);
                            else {
                                refs[f.getName()] = f.get(inst);
                                vals[f.getName()] = "[obj " + f.getType().getName() + "]";
                            }
                        } catch(e) { vals[f.getName()] = "[err]"; }
                    }

                    console.log("--- POLL " + attempt + " ---");
                    console.log("n=" + vals['n'] + " D=" + vals['D'] + " C=" + vals['C']);
                    console.log("a=" + vals['a'] + " b=" + vals['b'] + " x=" + vals['x']);
                    console.log("f=" + vals['f'] + " g=" + vals['g'] + " q=" + vals['q']);
                    console.log("c=" + vals['c'] + " z=" + vals['z'] + " y=" + vals['y']);

                    // Read parent page count
                    try {
                        var parentN = refs['e'];
                        if (parentN) {
                            var pFields = parentN.getClass().getDeclaredFields();
                            for (var i = 0; i < pFields.length; i++) {
                                var pf = pFields[i];
                                pf.setAccessible(true);
                                if (pf.getName() === 'n' && pf.getType().getName() === 'int') {
                                    console.log("parent.n (pageCount)=" + pf.getInt(parentN));
                                }
                                if (pf.getName() === 'x') {
                                    console.log("parent.x=" + pf.get(parentN));
                                }
                            }
                        }
                    } catch(e) {
                        console.log("parent err: " + e);
                    }

                    // Read carousel child count
                    try {
                        var carNode = refs['A'];
                        if (carNode) {
                            console.log("A.numChildren()=" + carNode.numChildren());
                            console.log("A.class=" + carNode.getClass().getName());
                        }
                    } catch(e) {
                        console.log("children err: " + e);
                    }
                },
                onComplete: function() {}
            });
        } catch(e) {
            console.log("[POLL " + attempt + " ERROR] " + e);
        }
    });
}

setTimeout(function() { poll(1); }, 8000);
setTimeout(function() { poll(2); }, 18000);
console.log("[*] Polling at 8s, 18s...");
