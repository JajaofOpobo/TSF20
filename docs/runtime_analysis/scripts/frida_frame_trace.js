'use strict';

var frameCount = 0;
var frameDraws = [];

function retryEgl() {
    var lib = Process.findModuleByName('libEGL.so');
    if (!lib) {
        setTimeout(retryEgl, 300);
        return;
    }
    var ptr = lib.findExportByName('eglSwapBuffers');
    if (!ptr) {
        setTimeout(retryEgl, 300);
        return;
    }
    Interceptor.attach(ptr, {
        onEnter: function() {
            frameCount++;
            var counts = {};
            frameDraws.forEach(function(c) {
                counts[c] = (counts[c] || 0) + 1;
            });
            var lines = [];
            for (var cls in counts) {
                lines.push(cls + ' x' + counts[cls]);
            }
            send('--- FRAME[' + frameCount + '] ---');
            lines.forEach(function(l) { send('  ' + l); });
            frameDraws = [];
        }
    });
    send('eglSwapBuffers hooked');
}

Java.perform(function() {
    Java.deoptimizeEverything();
    send('deopt done');

    try {
        var VObj = Java.use('com.censivn.C3DEngine.api.core.VObject3d');
        VObj.draw.implementation = function() {
            frameDraws.push(this.$className);
            return this.draw();
        };
        send('VObject3d.draw hooked');
    } catch (e) {
        send('VObj hook error: ' + e.message);
    }

    send('HOOKS_READY');
});

retryEgl();
