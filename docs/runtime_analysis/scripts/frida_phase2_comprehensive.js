'use strict';

var log = [];
var activities = {};

function A(s) { log.push(s); }

function hookAll() {
  // Page transition: f.e.c.a.c.a(b, b) — swipe handler
  try {
    var pageHost = Java.use('com.tsf.shell.f.e.c.a.c');
    pageHost.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b').implementation = function(b1, b2) {
      A('PAGE_TRANSITION: ' + (b1 ? b1.hashCode() : 0) + ' -> ' + (b2 ? b2.hashCode() : 0));
      return this.a(b1, b2);
    };
    pageHost.drawElement.implementation = function() {
      A('PAGE_HOST_DRAW');
      return this.drawElement();
    };
    A('pageHost hooks ok');
  } catch(e) { A('pageHost err: ' + e.message); }

  // Page position: f.e.c.a.b
  try {
    var page = Java.use('com.tsf.shell.f.e.c.a.b');
    page.a.overload('float').implementation = function(v) {
      A('PAGE_MOVE: ' + v);
      return this.a(v);
    };
    page.b.overload('float').implementation = function(v) {
      A('PAGE_SCALE: ' + v);
      return this.b(v);
    };
    A('page hooks ok');
  } catch(e) { A('page err: ' + e.message); }

  // Touch collision on alarm
  try {
    var alarm = Java.use('com.tsf.shell.widget.alarm.AlarmWidget');
    alarm.calTouchCollision.implementation = function(x, y) {
      A('TOUCH_ALARM: ' + x + ',' + y);
      return this.calTouchCollision(x, y);
    };
    var hw = Java.use('com.tsf.shell.widget.alarm.h');
    hw.calTouchCollision.implementation = function(x, y) {
      A('TOUCH_ALARM_H: ' + x + ',' + y);
      return this.calTouchCollision(x, y);
    };
    var bw = Java.use('com.tsf.shell.widget.alarm.b');
    bw.calTouchCollision.implementation = function(x, y) {
      A('TOUCH_ALARM_B: ' + x + ',' + y);
      return this.calTouchCollision(x, y);
    };
    A('touch hooks ok');
  } catch(e) { A('touch err: ' + e.message); }

  // Wallpaper parallax
  try {
    var wp = Java.use('com.tsf.shell.manager.wallpaper.a$a');
    wp.a.overload('float', 'float').implementation = function(x, y) {
      A('WALLPAPER_MOVE: ' + x + ',' + y);
      return this.a(x, y);
    };
    A('wallpaper hook ok');
  } catch(e) { A('wallpaper err: ' + e.message); }
  
  // Container mutations
  try {
    var VC = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
    VC.addChild.implementation = function(child) {
      A('ADD:' + (child ? child.$className : 'null') + ' -> ' + this.$className);
      return this.addChild(child);
    };
    VC.removeChild.implementation = function(child) {
      A('DEL:' + (child ? child.$className : 'null') + ' -> ' + this.$className);
      return this.removeChild(child);
    };
    A('container hooks ok');
  } catch(e) { A('container err: ' + e.message); }
}

function retryEgl() {
  var lib = Process.findModuleByName('libEGL.so');
  if (!lib) { setTimeout(retryEgl, 300); return; }
  var ptr = lib.findExportByName('eglSwapBuffers');
  if (!ptr) { setTimeout(retryEgl, 300); return; }
  Interceptor.attach(ptr, {
    onEnter: function() {
      if (log.length > 0) {
        log.forEach(function(l) { send(l); });
        log = [];
      }
    }
  });
  A('eglSwapBuffers hooked');
  if (typeof send === 'function') send('egl hooked');
}

Java.perform(function() {
  Java.deoptimizeEverything();
  A('deopt');
  hookAll();
  A('ready');
});

retryEgl();
