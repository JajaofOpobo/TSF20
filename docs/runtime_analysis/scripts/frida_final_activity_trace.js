'use strict';

var log = [];
function A(s) { log.push(s); }

function retryEgl() {
  var lib = Process.findModuleByName('libEGL.so');
  if (!lib) { setTimeout(retryEgl, 300); return; }
  var ptr = lib.findExportByName('eglSwapBuffers');
  if (!ptr) { setTimeout(retryEgl, 300); return; }
  Interceptor.attach(ptr, { onEnter: function() {
    if (log.length > 0) { log.forEach(function(l) { send(l); }); log = []; }
  }});
  send('egl hooked');
}

Java.perform(function() {
  Java.deoptimizeEverything();

  // Fixed Activity hooks
  try {
    var act = Java.use('android.app.Activity');
    act.onCreate.overload('android.os.Bundle').implementation = function(b) {
      A('ACT_CREATE:' + this.$className);
      return this.onCreate(b);
    };
    act.onResume.implementation = function() {
      A('ACT_RESUME:' + this.$className);
      return this.onResume();
    };
    act.onPause.implementation = function() {
      A('ACT_PAUSE:' + this.$className);
      return this.onPause();
    };
    act.onDestroy.implementation = function() {
      A('ACT_DESTROY:' + this.$className);
      return this.onDestroy();
    };
    A('act hooks ok');
  } catch(e) { A('act err: ' + e.message); }

  // Page transition
  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');
    pc.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(b1, b2) {
      A('TRANSITION:' + Date.now() + ' ' + (b1?b1.hashCode():0) + '->' + (b2?b2.hashCode():0));
      return this.a(b1, b2);
    };
    A('trans hook ok');
  } catch(e) { A('trans err: ' + e.message); }

  // Page position
  try {
    var pb = Java.use('com.tsf.shell.f.e.c.a.b');
    pb.a.overload('float').implementation = function(v) { A('POS:' + v); return this.a(v); };
    pb.b.overload('float').implementation = function(v) { A('SCALE:' + v); return this.b(v); };
    A('page hooks ok');
  } catch(e) { A('page err: ' + e.message); }

  // Wallpaper manager
  try {
    var wp = Java.use('com.tsf.shell.manager.wallpaper.a$b');
    wp.a.overload().implementation = function() { A('WP_INIT'); return this.a(); };
    wp.a.overload('float', 'float').implementation = function(x, y) { A('WP_OFFSET:' + x + ',' + y); return this.a(x, y); };
    wp.b.overload().implementation = function() { A('WP_TOGGLE'); return this.b(); };
    A('wp hooks ok');
  } catch(e) { A('wp err: ' + e.message); }

  A('ready');
});

retryEgl();
