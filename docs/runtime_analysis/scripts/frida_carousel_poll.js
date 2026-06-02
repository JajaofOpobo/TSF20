// Simple poll: find live n$c instances and read fields
Java.deoptimizeEverything();

function poll() {
    Java.perform(function() {
        try {
            Java.choose("com.tsf.shell.f.f.n$c", {
                onMatch: function(inst) {
                    console.log("[INSTANCE]");
                    console.log("  n (orbit radius) = " + inst.n.value);
                    console.log("  D (angular step) = " + inst.D.value);
                    console.log("  a (friction)     = " + inst.a.value);
                    console.log("  b (damping)      = " + inst.b.value);
                    console.log("  g (scroll)       = " + inst.g.value);
                    console.log("  q (target rot)   = " + inst.q.value);
                    console.log("  s (anim prog)    = " + inst.s.value);
                    console.log("  o (neg radius)   = " + inst.o.value);
                    console.log("  p = " + inst.p.value);
                    console.log("  c (effect class) = " + (inst.c.value ? inst.c.value.getClass().getName() : "null"));
                },
                onComplete: function() {
                    console.log("[DONE]");
                }
            });
        } catch(e) {
            console.log("[ERROR] " + e);
        }
    });
}

// Wait 5 seconds for layout to settle, then poll
setTimeout(poll, 5000);
console.log("[*] Will poll for carousel instances in 5 seconds...");
