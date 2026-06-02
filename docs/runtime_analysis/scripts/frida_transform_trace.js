'use strict';
/* High-signal transform hooks — updateAABBMatrix + PositionNumber3d only */
var log = [];
function A(s) { log.push(s); }

function retryEgl() {
  var lib = Process.findModuleByName('libEGL.so');
  if (!lib) { setTimeout(retryEgl, 300); return; }
  Interceptor.attach(lib.findExportByName('eglSwapBuffers'), {
    onEnter: function() {
      if (log.length > 0) { log.forEach(function(l) { send(l); }); log = []; }
    }
  });
  send('egl hooked');
}

Java.perform(function() {
  Java.deoptimizeEverything();

  // === 1. VObject3d.updateAABBMatrix — applies position/scale/rotation ===
  try {
    var V3 = Java.use('com.censivn.C3DEngine.api.core.VObject3d');
    V3.updateAABBMatrix.overload('[F').implementation = function(mat) {
      var info = this.hashCode();
      try { info += ' name=' + this.name(); } catch(e) {}
      var pos = '';
      try { var p = this.position(); pos = ' px=' + p.pxX() + ',' + p.pxY(); } catch(e) {}
      var scl = '';
      try { var s = this.scale(); scl = ' sc=' + s.x() + ',' + s.y(); } catch(e) {}
      A('AABB:' + info + pos + scl);
      return this.updateAABBMatrix(mat);
    };
    A('hook AABB ok');
  } catch(e) { A('hook AABB err: ' + e.message); }

  // === 2. PositionNumber3d pixel/screen-percentage setters ===
  try {
    var Pn3 = Java.use('com.censivn.C3DEngine.api.element.PositionNumber3d');
    Pn3.spX.overload('float').implementation = function(v) { A('SPX:' + v + ' h=' + this.hashCode()); return this.spX(v); };
    Pn3.spY.overload('float').implementation = function(v) { A('SPY:' + v + ' h=' + this.hashCode()); return this.spY(v); };
    Pn3.pxX.overload('float').implementation = function(v) { A('PXX:' + v + ' h=' + this.hashCode()); return this.pxX(v); };
    Pn3.pxY.overload('float').implementation = function(v) { A('PXY:' + v + ' h=' + this.hashCode()); return this.pxY(v); };
    A('hook PosNum3d ok');
  } catch(e) { A('hook PosNum3d err: ' + e.message); }

  // === 3. VObject3dContainer addChild/removeChild ===
  try {
    var VOC = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
    VOC.addChild.overload('com.censivn.C3DEngine.api.core.VObject3d').implementation = function(c) {
      A('ADD:' + c.hashCode() + ' ' + c.$className + ' -> ' + this.hashCode());
      return this.addChild(c);
    };
    VOC.removeChild.overload('com.censivn.C3DEngine.api.core.VObject3d').implementation = function(c) {
      A('REM:' + c.hashCode() + ' <- ' + this.hashCode());
      return this.removeChild(c);
    };
    A('hook addChild ok');
  } catch(e) { A('hook addChild err: ' + e.message); }

  // === 4. Also hook f.f.n$c.d() to see what Nc_d() does ===
  try {
    var Nc = Java.use('com.tsf.shell.f.f.n$c');
    Nc.d.overload().implementation = function() {
      var t = Date.now();
      // Log first call only (to avoid spam)
      A('NC_D: no-arg at t=' + t);
      return this.d();
    };
    A('hook Nc.d() ok');
  } catch(e) { A('hook Nc.d() err: ' + e.message); }

  A('=== ALL HOOKS READY ===');
  send('ready');
});

retryEgl();
