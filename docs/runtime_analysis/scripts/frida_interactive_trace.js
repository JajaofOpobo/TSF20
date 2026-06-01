'use strict';

var frameCount = 0;
var frameDraws = [];
var mutations = [];

function hookContainer() {
    try {
        var VC = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
        VC.addChild.implementation = function(child) {
            mutations.push('ADD:' + (child ? child.$className + '@' + child.hashCode() : 'null') + ' → ' + this.$className);
            return this.addChild(child);
        };
        VC.removeChild.implementation = function(child) {
            mutations.push('DEL:' + (child ? child.$className + '@' + child.hashCode() : 'null') + ' → ' + this.$className);
            return this.removeChild(child);
        };
        send('container hooks ok');
    } catch(e) {
        send('container err: ' + e.message);
    }
}

function retryEgl() {
    var lib = Process.findModuleByName('libEGL.so');
    if (!lib) { setTimeout(retryEgl, 300); return; }
    var ptr = lib.findExportByName('eglSwapBuffers');
    if (!ptr) { setTimeout(retryEgl, 300); return; }
    Interceptor.attach(ptr, {
        onEnter: function() {
            frameCount++;
            if (mutations.length > 0) {
                send('F' + frameCount + ' MUT:');
                mutations.forEach(function(m) { send('  ' + m); });
                mutations = [];
            }
            var counts = {};
            frameDraws.forEach(function(c) { counts[c] = (counts[c] || 0) + 1; });
            var total = frameDraws.length;
            if (total > 0) {
                var cls = Object.keys(counts);
                send('F' + frameCount + ' ' + total + 'obj: ' + cls.join(' '));
            }
            frameDraws = [];
        }
    });
    send('egl hooked');
}

Java.perform(function() {
    Java.deoptimizeEverything();
    send('deopt');
    try {
        var VObj = Java.use('com.censivn.C3DEngine.api.core.VObject3d');
        VObj.draw.implementation = function() { frameDraws.push(this.$className); return this.draw(); };
        send('draw hooked');
    } catch (e) { send('draw err: ' + e.message); }
    hookContainer();
    send('ready');
});

retryEgl();
