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
  send('deopt');

  // === Page transitions ===
  try {
    var pc = Java.use('com.tsf.shell.f.e.c.a.c');
    pc.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(b1, b2) {
      A('TRANSITION:' + (b1 ? b1.hashCode():0) + '->' + (b2 ? b2.hashCode():0));
      return this.a(b1, b2);
    };
    A('transition hook ok');
  } catch(e) { A('trans err: ' + e.message); }

  try {
    var pb = Java.use('com.tsf.shell.f.e.c.a.b');
    pb.a.overload('float').implementation = function(v) {
      A('POS:' + v);
      return this.a(v);
    };
    pb.b.overload('float').implementation = function(v) {
      A('SCALE:' + v);
      return this.b(v);
    };
    A('page hooks ok');
  } catch(e) { A('page err: ' + e.message); }

  // === VObject3d transforms (matrix level) ===
  try {
    var V3 = Java.use('com.censivn.C3DEngine.api.core.VObject3d');
    V3.setPosition.implementation = function(x, y, z) {
      A('VPOS:' + this.$className + ' ' + x + ',' + y + ',' + z);
      return this.setPosition(x, y, z);
    };
    V3.setScale.implementation = function(x, y, z) {
      A('VSCALE:' + this.$className + ' ' + x + ',' + y + ',' + z);
      return this.setScale(x, y, z);
    };
    V3.setRotation.implementation = function(x, y, z) {
      A('VROT:' + this.$className + ' ' + x + ',' + y + ',' + z);
      return this.setRotation(x, y, z);
    };
    A('V3d hooks ok');
  } catch(e) { A('V3d err: ' + e.message); }

  // === VObject3dContainer specific ===
  try {
    var VC = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
    VC.setPosition.implementation = function(x, y, z) {
      A('VPOS_CONTAINER:' + this.$className + ' ' + x + ',' + y + ',' + z);
      return this.setPosition(x, y, z);
    };
    A('VC hooks ok');
  } catch(e) { A('VC err: ' + e.message); }

  // === Touch dispatch ===
  try {
    var Al = Java.use('com.tsf.shell.widget.alarm.AlarmWidget');
    Al.calTouchCollision.implementation = function(x, y) {
      A('TOUCH:' + x + ',' + y);
      return this.calTouchCollision(x, y);
    };
    A('touch hook ok');
  } catch(e) { A('touch err: ' + e.message); }

  // === Container mutations ===
  try {
    var VC2 = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
    VC2.addChild.implementation = function(c) {
      A('ADD:' + (c?c.$className:'null') + '->' + this.$className);
      return this.addChild(c);
    };
    A('addChild hook ok');
  } catch(e) { A('addChild err: ' + e.message); }

  send('ready');
});

retryEgl();
