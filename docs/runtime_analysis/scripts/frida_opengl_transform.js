'use strict';
/* Hook 3D transform methods + OpenGL calls during page transitions
 * Focus: VObject3d.updateAABBMatrix, PositionNumber3d setters
 */
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
      var pos = '';
      try {
        var p = this.position();
        pos = 'pxX=' + p.pxX() + ' pxY=' + p.pxY();
      } catch(e) {}
      var scl = '';
      try {
        var s = this.scale();
        scl = ' sx=' + s.x() + ' sy=' + s.y();
      } catch(e) {}
      A('UPDATE_AABB:' + this.hashCode() + pos + scl);
      return this.updateAABBMatrix(mat);
    };
    A('hook updateAABBMatrix ok');
  } catch(e) { A('hook updateAABBMatrix err: ' + e.message); }

  // === 2. PositionNumber3d.spX/spY (screen %) + pxX/pxY (pixels) ===
  try {
    var Pn3 = Java.use('com.censivn.C3DEngine.api.element.PositionNumber3d');
    Pn3.spX.overload('float').implementation = function(v) {
      A('SPX:' + v + ' this=' + this.hashCode());
      return this.spX(v);
    };
    Pn3.spY.overload('float').implementation = function(v) {
      A('SPY:' + v + ' this=' + this.hashCode());
      return this.spY(v);
    };
    Pn3.pxX.overload('float').implementation = function(v) {
      A('PXX:' + v + ' this=' + this.hashCode());
      return this.pxX(v);
    };
    Pn3.pxY.overload('float').implementation = function(v) {
      A('PXY:' + v + ' this=' + this.hashCode());
      return this.pxY(v);
    };
    A('hook PositionNumber3d ok');
  } catch(e) { A('hook PositionNumber3d err: ' + e.message); }

  // === 3. Number3d.setAll — only log non-zero (catch page container movements) ===
  try {
    var N3 = Java.use('com.censivn.C3DEngine.api.element.Number3d');
    N3.setAll.implementation = function(x, y, z) {
      if (Math.abs(x) > 0.01 || Math.abs(y) > 0.01 || Math.abs(z) > 0.01) {
        A('N3D:' + x + ',' + y + ',' + z + ' hash=' + this.hashCode());
      }
      return this.setAll(x, y, z);
    };
    A('hook Number3d.setAll (nonzero) ok');
  } catch(e) { A('hook Number3d err: ' + e.message); }

  // === 4. VObject3dContainer.addChild/removeChild for scene changes ===
  try {
    var VOC = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
    VOC.addChild.overload('com.censivn.C3DEngine.api.core.VObject3d').implementation = function(child) {
      A('ADD_CHILD:' + child.hashCode() + ' type=' + child.$className + ' to=' + this.hashCode());
      return this.addChild(child);
    };
    VOC.removeChild.overload('com.censivn.C3DEngine.api.core.VObject3d').implementation = function(child) {
      A('REMOVE_CHILD:' + child.hashCode() + ' from=' + this.hashCode());
      return this.removeChild(child);
    };
    A('hook addChild/removeChild ok');
  } catch(e) { A('hook scene err: ' + e.message); }

  // === 5. GL matrix operations (from libGLESv2.so) ===
  var gl = null;
  function retryGL() {
    gl = Process.findModuleByName('libGLESv2.so');
    if (!gl) { setTimeout(retryGL, 500); return; }
    A('glesv2 base=' + gl.base);

    var funcs = ['glTranslatef', 'glScalef', 'glRotatef', 'glMatrixMode',
                 'glLoadIdentity', 'glMultMatrixf'];
    funcs.forEach(function(name) {
      try {
        var ptr = gl.findExportByName(name);
        if (ptr) {
          Interceptor.attach(ptr, {
            onEnter: function(args) {
              if (name === 'glTranslatef')
                A('GL:translate ' + args[0] + ',' + args[1] + ',' + args[2]);
              else if (name === 'glScalef')
                A('GL:scale ' + args[0] + ',' + args[1] + ',' + args[2]);
              else if (name === 'glRotatef')
                A('GL:rotate ' + args[0] + 'deg ' + args[1] + ',' + args[2] + ',' + args[3]);
              else if (name === 'glMatrixMode')
                A('GL:matrixMode ' + args[0]);
              else if (name === 'glLoadIdentity')
                A('GL:loadIdent');
            }
          });
          A('hook GL ' + name + ' ok');
        }
      } catch(e) { A('hook GL ' + name + ' err: ' + e.message); }
    });
    A('GL hooks ready');
  }
  retryGL();

  A('=== ALL HOOKS READY ===');
  send('ready');
});

retryEgl();
