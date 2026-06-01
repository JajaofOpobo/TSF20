'use strict';

// Timed class enumeration: captures loaded classes at frame intervals
// Usage: frida -U -f com.tsf.shell -l frida_timed_class_enum.js

var SNAPSHOT_INTERVALS = [0, 1, 5, 10, 30, 60, 100, 150, 200, 300];
var nextSnapshot = 0;
var frameCount = 0;
var snapshots = {};
var libSnapshots = {};
var allLibraries = {};
var hookInstalled = false;

function snapshot(label) {
  try {
    var classes = Java.enumerateLoadedClassesSync();
    var filtered = classes.filter(function(c) {
      return c.indexOf('com.tsf') !== -1 || 
             c.indexOf('com.censivn') !== -1 || 
             c.indexOf('com.ksmobile') !== -1 ||
             c.indexOf('com.cm.kinfoc') !== -1;
    });
    snapshots[label] = filtered;
    
    // Also grab native libs from /proc/self/maps
    var libs = [];
    try {
      var maps = Memory.readCString(ptr(0x0)); // dummy
      // Use Frida's File API
      var file = new File('/proc/self/maps', 'r');
      var line;
      while ((line = file.readLine()) !== null) {
        if (line.indexOf('.so') !== -1) {
          var parts = line.trim().split(/\s+/);
          if (parts.length >= 6) {
            var libname = parts[5];
            var addr = parts[0].split('-')[0];
            libs.push(addr + ' ' + libname);
          }
        }
      }
      file.close();
    } catch(e) {
      libs = ['(maps file error: ' + e.message + ')'];
    }
    libSnapshots[label] = libs;
    
    send('SNAPSHOT[' + label + ']: ' + filtered.length + ' app classes, ' + libs.length + ' native libs');
  } catch(e) {
    send('SNAPSHOT_ERROR[' + label + ']: ' + e.message);
  }
}

function diffSnapshots(a, b) {
  var setA = {};
  a.forEach(function(c) { setA[c] = true; });
  var newClasses = b.filter(function(c) { return !setA[c]; });
  var removed = a.filter(function(c) { return b.indexOf(c) === -1; });
  return { added: newClasses, removed: removed };
}

function printDiff(label, prevLabel) {
  if (!snapshots[prevLabel] || !snapshots[label]) return;
  var diff = diffSnapshots(snapshots[prevLabel], snapshots[label]);
  if (diff.added.length > 0) {
    send('NEW[' + label + ' vs ' + prevLabel + ']: +' + diff.added.length + ' classes');
    diff.added.forEach(function(c) {
      send('  + ' + c);
    });
  }
  if (diff.removed.length > 0) {
    send('REMOVED[' + label + ' vs ' + prevLabel + ']: -' + diff.removed.length + ' classes');
  }
}

function checkSnapshot() {
  if (nextSnapshot >= SNAPSHOT_INTERVALS.length) return;
  var target = SNAPSHOT_INTERVALS[nextSnapshot];
  if (frameCount >= target) {
    var label = 'frame_' + target;
    snapshot(label);
    if (nextSnapshot > 0) {
      var prevLabel = 'frame_' + SNAPSHOT_INTERVALS[nextSnapshot - 1];
      printDiff(label, prevLabel);
    }
    nextSnapshot++;
  }
}

// EGL hook
function setup() {
  var egl = Process.findModuleByName('libEGL.so');
  if (!egl) {
    send('EGL not loaded yet, retrying in 500ms...');
    setTimeout(setup, 500);
    return;
  }
  
  var swap = egl.findExportByName('eglSwapBuffers');
  if (!swap) {
    send('eglSwapBuffers not found');
    return;
  }
  
  Interceptor.attach(swap, {
    onLeave: function(retval) {
      frameCount++;
      checkSnapshot();
    }
  });
  
  send('EGL hooked at ' + swap + ', monitoring frames...');
  hookInstalled = true;
  
  // Also hook System.loadLibrary for native lib timing
  var System = Java.use('java.lang.System');
  var Runtime = Java.use('java.lang.Runtime');
  Runtime.loadLibrary.overload('java.lang.String').implementation = function(libname) {
    send('NATIVE_LOAD: ' + libname);
    return this.loadLibrary(libname);
  };
  send('System.loadLibrary hook installed');
}

Java.perform(function() {
  Java.deoptimizeEverything();
  send('Deoptimized. Waiting for first frame...');
  
  // Take initial snapshot immediately after deoptimization
  snapshot('init');
  nextSnapshot = 1;
  
  setup();
});

// Watch for library load events
var dlopen = Module.findExportByName('libdl.so', 'dlopen');
if (dlopen) {
  Interceptor.attach(dlopen, {
    onEnter: function(args) {
      var name = Memory.readCString(args[0]);
      if (name.indexOf('.so') !== -1) {
        send('dlopen: ' + name);
      }
    }
  });
}
