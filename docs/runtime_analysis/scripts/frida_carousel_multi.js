// Multi-poll using proven reflection field access
Java.deoptimizeEverything();

function readField(inst, f) {
    f.setAccessible(true);
    var type = f.getType().getName();
    if (type === 'float') return f.getFloat(inst);
    if (type === 'int') return f.getInt(inst);
    if (type === 'boolean') return f.getBoolean(inst);
    if (type === 'double') return f.getDouble(inst);
    return f.get(inst);
}

function poll(attempt) {
    Java.perform(function() {
        try {
            Java.choose("com.tsf.shell.f.f.n$c", {
                onMatch: function(inst) {
                    var klass = inst.getClass();
                    var fields = {};
                    var allFields = klass.getDeclaredFields();
                    for (var i = 0; i < allFields.length; i++) {
                        var f = allFields[i];
                        try { fields[f.getName()] = readField(inst, f); } catch(e) {}
                    }
                    console.log("--- POLL " + attempt + " ---");
                    console.log("n=" + fields['n'] + " D=" + fields['D'] + " C=" + fields['C']);
                    console.log("a=" + fields['a'] + " b=" + fields['b'] + " x=" + fields['x']);
                    console.log("f=" + fields['f'] + " g=" + fields['g'] + " q=" + fields['q']);
                    console.log("o=" + fields['o'] + " p=" + fields['p'] + " s=" + fields['s']);
                    console.log("c=" + (fields['c'] ? fields['c'].getClass().getName() : "null"));
                    console.log("i=" + fields['i'] + " j=" + fields['j'] + " k=" + fields['k']);
                    console.log("z=" + fields['z'] + " y=" + fields['y']);
                    console.log("h=" + fields['h'] + " l=" + fields['l'] + " m=" + fields['m']);
                    console.log("A=" + fields['A'] + " B=" + fields['B']);
                },
                onComplete: function() {}
            });
        } catch(e) {
            console.log("[POLL " + attempt + " ERROR] " + e);
        }
    });
}

setTimeout(function() { poll(1); }, 5000);
setTimeout(function() { poll(2); }, 12000);
setTimeout(function() { poll(3); }, 20000);
setTimeout(function() { poll(4); }, 30000);
console.log("[*] Polling at 5s, 12s, 20s, 30s...");
