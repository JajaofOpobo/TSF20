'use strict';
/* Capture ALL transition paths simultaneously */
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

  // === ORIGINAL PATH: f.e.c.a ===
  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');
    pc.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(from, to) {
      A('CA_PP:' + Date.now() + ' FROM=' + from.hashCode() + ' TO=' + to.hashCode());
      try { A('  F_POS:' + from.a()); } catch(e) {}
      try { A('  T_POS:' + to.a()); } catch(e) {}
      return this.a(from, to);
    };
    A('hook CA_PP ok');
  } catch(e) { A('hook CA_PP err: ' + e.message); }

  try {
    var pb = Java.use('com.tsf.shell.f.e.c.a.b');
    pb.a.overload('float').implementation = function(v) {
      A('PB_A:' + this.hashCode() + ' -> ' + v);
      return this.a(v);
    };
    pb.b.overload('float').implementation = function(v) {
      A('PB_B:' + this.hashCode() + ' -> ' + v);
      return this.b(v);
    };
    A('hook PB pos/scale ok');
  } catch(e) { A('hook PB err: ' + e.message); }

  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.a.overload('float', 'float', 'float', 'int').implementation = function(x, y, dur, e) {
      A('DA_3F1I: x=' + x + ' y=' + y + ' dur=' + dur + ' easing=' + e);
      return this.a(x, y, dur, e);
    };
    A('hook DA_3F1I ok');
  } catch(e) { A('hook DA_3F1I err: ' + e.message); }

  try {
    var pd = Java.use('com.tsf.shell.f.e.c.a.d');
    pd.d.overload('float').implementation = function(v) { A('D_D:' + v); return this.d(v); };
    pd.e.overload('float').implementation = function(v) { A('D_E:' + v); return this.e(v); };
    A('hook D_DE ok');
  } catch(e) { A('hook D_DE err: ' + e.message); }

  // === VTWEEN PATH ===
  try {
    var VTP = Java.use('com.censivn.C3DEngine.api.tween.VTweenParam');
    VTP.setEase.implementation = function(ease) { A('EASE:' + ease); return this.setEase(ease); };
    VTP.setX.implementation = function(v) { A('PX:' + v); return this.setX(v); };
    VTP.setY.implementation = function(v) { A('PY:' + v); return this.setY(v); };
    VTP.setScaleX.implementation = function(v) { A('PSX:' + v); return this.setScaleX(v); };
    VTP.setScaleY.implementation = function(v) { A('PSY:' + v); return this.setScaleY(v); };
    A('hook VTweenParam ok');
  } catch(e) { A('hook VTweenParam err: ' + e.message); }

  try {
    var VT = Java.use('com.censivn.C3DEngine.api.tween.VTween');
    VT.to.overload('com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget', 'int', 'com.censivn.C3DEngine.api.tween.VTweenParam').implementation = function(t, d, p) {
      A('TWEEN:dur=' + d + 'ms target=' + (t ? t.hashCode() : 0));
      return this.to(t, d, p);
    };
    A('hook TWEEN ok');
  } catch(e) { A('hook TWEEN err: ' + e.message); }

  // === MESSAGE QUEUE ===
  try {
    var RR = Java.use('com.censivn.C3DEngine.api.message.RenderRunnable');
    RR.run.implementation = function() { A('RR'); return this.run(); };
    A('hook RR ok');
  } catch(e) { A('hook RR err: ' + e.message); }

  try {
    var VMQ = Java.use('com.censivn.C3DEngine.api.message.VMessageQueueManager');
    VMQ.post.overload('java.lang.Runnable', 'int').implementation = function(r, p) {
      A('POSTQ:' + r.$className + ' prio=' + p);
      return this.post(r, p);
    };
    A('hook VMQ ok');
  } catch(e) { A('hook VMQ err: ' + e.message); }

  send('READY');
});

retryEgl();

var beat = 0;
setInterval(function() { send('ALIVE beat=' + (++beat)); }, 5000);
