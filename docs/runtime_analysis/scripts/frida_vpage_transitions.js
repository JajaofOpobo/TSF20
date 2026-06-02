'use strict';
/* VPage Transition Parameter Capture
 * Usage: frida -U -f com.tsf.shell -l frida_vpage_transitions.js
 * Then: swipe between pages, switch transition types in settings
 */

var log = [];
function A(s) { log.push(s); }

var frameNum = 0;

function retryEgl() {
  var lib = Process.findModuleByName('libEGL.so');
  if (!lib) { setTimeout(retryEgl, 300); return; }
  var ptr = lib.findExportByName('eglSwapBuffers');
  if (!ptr) { setTimeout(retryEgl, 300); return; }
  Interceptor.attach(ptr, { onEnter: function() {
    frameNum++;
    if (log.length > 0) { log.forEach(function(l) { send(l); }); log = []; }
  }});
  send('egl hooked');
}

Java.perform(function() {
  Java.deoptimizeEverything();
  A('deopt');

  // === 1. Page host controller c.a(b,b) — transition trigger ===
  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');

    // Overload 1: a(boolean, boolean) — start/end transition
    pc.a.overload('boolean', 'boolean').implementation = function(fwd, anim) {
      var hc = this.hashCode();
      A('TRANSITION_TOGGLE:' + hc + ' fwd=' + fwd + ' anim=' + anim);
      return this.a(fwd, anim);
    };
    A('hook c.a(boolean,boolean) ok');
  } catch(e) { A('hook c.a(bb) err: ' + e.message); }

  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');

    // Overload 2: a(Page, Page) — direct page-to-page transition
    pc.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(from, to) {
      var t = Date.now();
      var fromHC = from ? from.hashCode() : 0;
      var toHC = to ? to.hashCode() : 0;
      A('TRANSITION:' + t + ' FROM=' + fromHC + ' TO=' + toHC);

      // Read page positions pre-transition
      try {
        var fx = from.a();
        var fy = from.a();
        A('  FROM_POS:' + fx);
      } catch(ee) {}
      try {
        var tx = to.a();
        A('  TO_POS:' + tx);
      } catch(ee) {}

      return this.a(from, to);
    };
    A('hook c.a(Page,Page) ok');
  } catch(e) { A('hook c.a(PP) err: ' + e.message); }

  // === 2. Page position/scale changes ===
  try {
    var pb = Java.use('com.tsf.shell.f.e.c.a.b');
    pb.a.overload('float').implementation = function(v) {
      A('PAGE_POS:' + this.hashCode() + ' -> ' + v);
      return this.a(v);
    };
    pb.b.overload('float').implementation = function(v) {
      A('PAGE_SCALE:' + this.hashCode() + ' -> ' + v);
      return this.b(v);
    };
    A('hook page pos/scale ok');
  } catch(e) { A('hook page err: ' + e.message); }

  // === 3. Transition parameter creation: a(float,float,float,int) → e ===
  // This creates transition state with start, end, duration, easing type
  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.a.overload('float', 'float', 'float', 'int').implementation = function(x, y, dur, easing) {
      A('TRANSITION_PARAMS:' + ' x=' + x + ' y=' + y + ' dur=' + dur + 'ms easing=' + easing);
      return this.a(x, y, dur, easing);
    };
    A('hook d.a(x,y,dur,easing) ok');
  } catch(e) { A('hook d.a err: ' + e.message); }

  // === 4. Page state animator methods ===
  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.a.overload('float').implementation = function(v) {
      A('ANIM_A:' + v);
      return this.a(v);
    };
    pd.b.overload('float').implementation = function(v) {
      A('ANIM_B:' + v);
      return this.b(v);
    };
    pd.c.overload('float').implementation = function(v) {
      A('ANIM_C:' + v);
      return this.c(v);
    };
    A('hook d animators ok');
  } catch(e) { A('hook d anim err: ' + e.message); }

  // === 5. VObject3d Number3d position/scale mutations ===
  try {
    var n3d = Java.use('com.censivn.C3DEngine.api.element.Number3d');
    n3d.setAll.implementation = function(x, y, z) {
      if (x !== 0 || y !== 0 || z !== 0) {
        A('N3D_SET:' + this.$className + ' ' + x + ',' + y + ',' + z);
      }
      return this.setAll(x, y, z);
    };
    A('hook Number3d.setAll ok');
  } catch(e) { A('hook N3D err: ' + e.message); }

  // === 6. Wallpaper parallax ===
  try {
    var wp = Java.use('com.tsf.shell.manager.wallpaper.a$b');
    wp.a.overload('float', 'float').implementation = function(x, y) {
      A('WP_OFFSET:' + x + ',' + y);
      return this.a(x, y);
    };
    A('hook wallpaper offset ok');
  } catch(e) { A('hook wp err: ' + e.message); }

  A('ALL_HOOKS_READY');
  send('hooks ready');
});

retryEgl();
