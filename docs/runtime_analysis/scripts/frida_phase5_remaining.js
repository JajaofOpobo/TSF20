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

  // === Enumerate remaining obfuscated classes ===
  var extras = ['com.tsf.shell.f.e.c.a.a', 'com.tsf.shell.f.e.c.a.d', 'com.tsf.shell.f.e.c.a.e',
    'com.tsf.shell.widget.alarm.e', 'com.tsf.shell.widget.alarm.d.c',
    'com.tsf.shell.widget.alarm.AlarmUtils$Alarm$b', 'com.tsf.shell.widget.alarm.service.c'];
  extras.forEach(function(cn) {
    try {
      var cls = Java.use(cn);
      var ms = cls.class.getDeclaredMethods();
      A('=== ' + cn + ' (' + ms.length + ' methods) ===');
      ms.forEach(function(m) { A('  ' + m.toString().replace(/^.*\s(\S+\(.*\))$/, '$1')); });
    } catch(e) { A('ERR:' + cn + ' ' + e.message); }
  });

  // === Wallpaper manager deep hooks ===
  try {
    var wp = Java.use('com.tsf.shell.manager.wallpaper.a$b');
    wp.a.overload().implementation = function() { A('WP_INIT'); return this.a(); };
    wp.a.overload('float', 'float').implementation = function(x, y) { A('WP_OFFSET:' + x + ',' + y); return this.a(x, y); };
    wp.b.overload().implementation = function() { A('WP_SHOW'); return this.b(); };
    A('wp hooks ok');
  } catch(e) { A('wp err: ' + e.message); }
  
  try {
    var wpObj = Java.use('com.tsf.shell.manager.wallpaper.a$a');
    wpObj.a.overload('float', 'float').implementation = function(x, y) { A('WP_OBJ_MOVE:' + x + ',' + y); return this.a(x, y); };
    A('wpObj hook ok');
  } catch(e) { A('wpObj err: ' + e.message); }

  // === Page transition with timing ===
  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');
    pc.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(b1, b2) {
      var t = Date.now();
      A('TRANSITION:' + t + ' ' + (b1?b1.hashCode():0) + '->' + (b2?b2.hashCode():0));
      return this.a(b1, b2);
    };
    A('transition hook ok');
  } catch(e) { A('trans err: ' + e.message); }

  try {
    var pb = Java.use('com.tsf.shell.f.e.c.a.b');
    pb.a.overload('float').implementation = function(v) { A('POS:' + v); return this.a(v); };
    pb.b.overload('float').implementation = function(v) { A('SCALE:' + v); return this.b(v); };
    A('page hooks ok');
  } catch(e) { A('page err: ' + e.message); }

  // === VObject3d methods enumeration ===
  try {
    var v3 = Java.use('com.censivn.C3DEngine.api.core.VObject3d');
    var v3methods = v3.class.getMethods();
    var xformMethods = [];
    for (var i = 0; i < v3methods.length; i++) {
      var name = v3methods[i].getName();
      if (name.indexOf('osition') >= 0 || name.indexOf('cale') >= 0 || name.indexOf('ranslat') >= 0 || name.indexOf('Transform') >= 0 || name.indexOf('Matrix') >= 0 || name.indexOf('set') >= 0) {
        xformMethods.push(name + '(' + v3methods[i].getParameterTypes().join(',') + ')');
      }
    }
    A('=== VObject3d transform methods ===');
    xformMethods.forEach(function(m) { A('  ' + m); });
  } catch(e) { A('V3d enum err: ' + e.message); }

  // === KSM check ===
  try {
    var loaded = Java.enumerateLoadedClassesSync();
    var ksm = loaded.filter(function(c) { return c.indexOf('com.ksm') >= 0; });
    A('=== KSM classes loaded: ' + ksm.length + ' ===');
    ksm.forEach(function(c) { A('  ' + c); });
  } catch(e) { A('KSM err: ' + e.message); }

  // === Touch ===
  try {
    Java.use('com.tsf.shell.widget.alarm.AlarmWidget').calTouchCollision.implementation = function(x, y) {
      A('TOUCH:' + x + ',' + y);
      return this.calTouchCollision(x, y);
    };
    A('touch hook ok');
  } catch(e) { A('touch err: ' + e.message); }

  // === Activity tracking ===
  try {
    var act = Java.use('android.app.Activity');
    act.onCreate.implementation = function(b) {
      A('ACTIVITY:' + this.$className);
      return this.onCreate(b);
    };
    act.onResume.implementation = function() {
      A('RESUME:' + this.$className);
      return this.onResume();
    };
    A('activity hooks ok');
  } catch(e) { A('act err: ' + e.message); }

  A('ready');
});

retryEgl();
