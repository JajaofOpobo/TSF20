'use strict';
/* Transition capture via C3DEngine message queue + tween hooks
 * Usage: frida -U -f com.tsf.shell -l frida_transition_vtween.js
 * Then: swipe pages, switch transition types
 */

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
  A('deopt');

  // === 1. VTweenParam — captures animation target values + easing ===
  try {
    var VTP = Java.use('com.censivn.C3DEngine.api.tween.VTweenParam');
    VTP.setEase.implementation = function(ease) {
      A('EASE:' + ease + ' target=' + this.getTarget());
      return this.setEase(ease);
    };
    A('hook setEase ok');
  } catch(e) { A('hook setEase err: ' + e.message); }

  try {
    var VTP = Java.use('com.censivn.C3DEngine.api.tween.VTweenParam');
    VTP.setX.implementation = function(v) {
      A('PARAM_X:' + v);
      return this.setX(v);
    };
    VTP.setY.implementation = function(v) {
      A('PARAM_Y:' + v);
      return this.setY(v);
    };
    VTP.setScaleX.implementation = function(v) {
      A('PARAM_SX:' + v);
      return this.setScaleX(v);
    };
    VTP.setScaleY.implementation = function(v) {
      A('PARAM_SY:' + v);
      return this.setScaleY(v);
    };
    A('hook param setters ok');
  } catch(e) { A('hook param err: ' + e.message); }

  // === 2. VTween.to — captures every animation start ===
  try {
    var VT = Java.use('com.censivn.C3DEngine.api.tween.VTween');
    VT.to.overload('com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget', 'int', 'com.censivn.C3DEngine.api.tween.VTweenParam').implementation = function(target, dur, param) {
      var t = Date.now();
      var tgtStr = target ? target.toString() : 'null';
      var ease = '';
      try { ease = ' ease=' + param.getEase(); } catch(ee) {}
      A('TWEEN:' + t + ' target=' + tgtStr + ' dur=' + dur + 'ms' + ease);
      return this.to(target, dur, param);
    };
    A('hook VTween.to ok');
  } catch(e) { A('hook VTween.to err: ' + e.message); }

  // === 3. RenderRunnable.run — captures render command execution ===
  try {
    var RR = Java.use('com.censivn.C3DEngine.api.message.RenderRunnable');
    RR.run.implementation = function() {
      A('RENDER');
      return this.run();
    };
    A('hook RenderRunnable ok');
  } catch(e) { A('hook RenderRunnable err: ' + e.message); }

  // === 4. VMessageQueueManager — message dispatch ===
  try {
    var VMQ = Java.use('com.censivn.C3DEngine.api.message.VMessageQueueManager');
    VMQ.post.overload('java.lang.Runnable', 'int').implementation = function(r, prio) {
      A('POST_Q:' + r.$className + ' prio=' + prio);
      return this.post(r, prio);
    };
    A('hook VMessageQueueManager ok');
  } catch(e) { A('hook VMessageQueueManager err: ' + e.message); }

  // === 5. Page container hooks ===
  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');
    pc.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(from, to) {
      var t = Date.now();
      A('TRANSITION:' + t + ' FROM=' + from.hashCode() + ' TO=' + to.hashCode());
      return this.a(from, to);
    };
    A('hook page transition ok');
  } catch(e) { A('hook page err: ' + e.message); }

  A('=== ALL HOOKS READY ===');
  send('ready');
});

retryEgl();

var beat = 0;
setInterval(function() {
  send('ALIVE beat=' + (++beat));
}, 5000);
