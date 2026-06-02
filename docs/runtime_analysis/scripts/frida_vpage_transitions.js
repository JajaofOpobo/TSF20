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

  // === 3. Transition parameter creation ===
  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.a.overload('float', 'float', 'float', 'int').implementation = function(x, y, dur, easing) {
      A('TRANS_PARAMS:' + ' x=' + x + ' y=' + y + ' dur=' + dur + 'ms easing=' + easing);
      return this.a(x, y, dur, easing);
    };
    A('hook d.a(3f,i) ok');
  } catch(e) { A('hook d.a(3f,i) err: ' + e.message); }

  // === 4a. Additional d methods: d.d(float) and d.e(float) ===
  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.d.overload('float').implementation = function(v) {
      A('D_D:' + v);
      return this.d(v);
    };
    A('hook d.d(flt) ok');
  } catch(e) { A('hook d.d err: ' + e.message); }
  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.e.overload('float').implementation = function(v) {
      A('D_E:' + v);
      return this.e(v);
    };
    A('hook d.e(flt) ok');
  } catch(e) { A('hook d.e err: ' + e.message); }
  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.onDrawStart.implementation = function() {
      A('D_DRAW');
      return this.onDrawStart();
    };
    A('hook d.onDrawStart ok');
  } catch(e) { A('hook d.draw err: ' + e.message); }

  // === 4b. Class a methods (float,float) ===
  try {
    var pa = Java.use('com.tsf.shell.f.e.c.a.a');
    pa.a.overload('float', 'float').implementation = function(x, y) {
      A('A_A:' + x + ',' + y);
      return this.a(x, y);
    };
    A('hook a.a(ff) ok');
  } catch(e) { A('hook a.a err: ' + e.message); }
  try {
    var pa = Java.use('com.tsf.shell.f.e.c.a.a');
    pa.b.overload('float', 'float').implementation = function(x, y) {
      A('A_B:' + x + ',' + y);
      return this.b(x, y);
    };
    A('hook a.b(ff) ok');
  } catch(e) { A('hook a.b err: ' + e.message); }

  // === 5. Wallpaper parallax ===
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

// Heartbeat — prints every 5s so user knows it's alive
var beat = 0;
setInterval(function() {
  send('ALIVE frame=' + frameNum + ' beat=' + (++beat));
}, 5000);
