'use strict';
/* Focus: hook touch handler + its posted runnable directly */
var log = [];
function A(s) { log.push(s); }

var libEgl = null;
function retryEgl() {
  libEgl = Process.findModuleByName('libEGL.so');
  if (!libEgl) { setTimeout(retryEgl, 300); return; }
  Interceptor.attach(libEgl.findExportByName('eglSwapBuffers'), {
    onEnter: function() {
      if (log.length > 0) { log.forEach(function(l) { send(l); }); log = []; }
    }
  });
  send('egl hooked');
}

var TRACE_TOUCH = true;

Java.perform(function() {
  Java.deoptimizeEverything();

  // === 1. Hook touch handler: f.f.n$c.d() — the gesture decision method ===
  try {
    var Nc = Java.use('com.tsf.shell.f.f.n$c');
    var methods = Nc.class.getDeclaredMethods();
    methods.forEach(function(m) {
      var name = m.getName();
      if (name === 'd') {
        try {
          Nc.d.overloads.forEach(function(overload) {
            var paramTypes = overload.argumentTypes;
            var sig = paramTypes.map(function(t) { return t.className; }).join(',');
            overload.implementation = function() {
              var args = Array.prototype.slice.call(arguments);
              var s = 'Nc_d(' + sig + ') ';
              if (args[0] && args[0].getAction !== undefined) {
                var ev = args[0];
                var action = ev.getAction();
                s += 'ACTION=' + action + ' x=' + ev.getX() + ' y=' + ev.getY();
              } else {
                s += args.map(function(a) { return a ? a.toString().substring(0,80) : 'null'; }).join(',');
              }
              A(s);
              return overload.apply(this, arguments);
            };
          });
        } catch(e) {}
      }
    });
    A('hook Nc.d ok');
  } catch(e) { A('hook Nc.d err: ' + e.message); }

  // === 2. Hook the posted runnable (anonymous class $6) ===
  try {
    var R6 = Java.use('com.tsf.shell.f.f.n$c$6');
    R6.run.implementation = function() {
      A('RUNNABLE_6: run at frame=' + (libEgl ? '?' : '?'));
      return this.run();
    };
    R6.$init.overload('com.tsf.shell.f.f.n$c').implementation = function(parent) {
      A('RUNNABLE_6: created, parent=' + parent.hashCode());
      return this.$init(parent);
    };
    A('hook runnable6 ok');
  } catch(e) { A('hook runnable6 err: ' + e.message); }

  // === 3. Also hook the onInterceptTouchEvent handler ===
  try {
    var Ee = Java.use('com.tsf.shell.e.e');
    Ee.onInterceptTouchEvent.implementation = function(ev) {
      var action = ev.getAction();
      if (action === 0 || action === 1 || action === 3) {
        A('INTERCEPT:' + action + ' x=' + ev.getX() + ' y=' + ev.getY());
      }
      return this.onInterceptTouchEvent(ev);
    };
    A('hook onIntercept ok');
  } catch(e) { A('hook onIntercept err: ' + e.message); }

  // === 4. Also hook the engine touch handler more broadly ===
  try {
    var TouchHandler = Java.use('com.censivn.C3DEngine.a.d$1');
    TouchHandler.onTouch.implementation = function(view, ev) {
      var action = ev.getAction();
      if (action === 0 || action === 1 || action === 3) {
        A('ENG_TOUCH:' + action + ' x=' + ev.getX() + ' y=' + ev.getY());
      }
      return this.onTouch(view, ev);
    };
    A('hook engTouch ok');
  } catch(e) { A('hook engTouch err: ' + e.message); }

  A('=== ALL HOOKS READY ===');
  send('ready');
});

retryEgl();
