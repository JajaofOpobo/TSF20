// Enumerate n$c fields with proper primitive type handling
Java.deoptimizeEverything();

function poll() {
    Java.perform(function() {
        try {
            Java.choose("com.tsf.shell.f.f.n$c", {
                onMatch: function(inst) {
                    console.log("[n$c FIELDS]");
                    var fields = inst.getClass().getDeclaredFields();
                    for (var i = 0; i < fields.length; i++) {
                        var f = fields[i];
                        f.setAccessible(true);
                        var name = f.getName();
                        var type = f.getType().getName();
                        var val;
                        try {
                            if (type === 'int') {
                                val = f.getInt(inst);
                            } else if (type === 'float') {
                                val = f.getFloat(inst);
                            } else if (type === 'boolean') {
                                val = f.getBoolean(inst);
                            } else if (type === 'double') {
                                val = f.getDouble(inst);
                            } else {
                                var obj = f.get(inst);
                                val = obj ? obj.toString() : "null";
                            }
                        } catch(e) {
                            val = "[error]";
                        }
                        // Print all single-letter fields + interesting ones
                        if (name.length <= 2 || name === 'C' || name === 'E') {
                            console.log("  " + name + " (" + type + ") = " + val);
                        }
                    }
                },
                onComplete: function() {}
            });
        } catch(e) {
            console.log("[ERROR] " + e);
        }
    });
}

setTimeout(poll, 6000);
console.log("[*] Will enumerate n$c fields in 6 seconds (fixed type handling)...");
