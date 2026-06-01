'use strict';

// Timed class enumeration v2 - cleaner
var SNAPSHOT_FRAMES = [0, 1, 3, 5, 10, 30, 60, 100, 200, 300];
var frameCount = 0;
var snapIdx = 0;
var snapshots = {};
var lastClasses = null;

function snapshotNow(label) {
  try {
    var classes = Java.enumerateLoadedClassesSync();
    var filtered = classes.filter(function(c) {
      return c.indexOf('com.tsf') !== -1 || 
             c.indexOf('com.censivn') !== -1 || 
             c.indexOf('com.ksmobile') !== -1 ||
             c.indexOf('com.cm.kinfoc') !== -1;
    });
    snapshots[label] = filtered;
    
    if (lastClasses) {
      // compute diff
      var set = {};
      lastClasses.forEach(function(c) { set[c] = true; });
      var added = filtered.filter(function(c) { return !set[c]; });
      if (added.length > 0) {
        send('+NEW at ' + label + ': ' + added.length + ' classes');
        added.forEach(function(c) { send('  + ' + c); });
      }
    }
    lastClasses = filtered;
    send('SNAPSHOT[' + label + ']: ' + filtered.length + ' total');
  } catch(e) {
    send('ERR: ' + e.message);
  }
}

function frameCheck() {
  while (snapIdx < SNAPSHOT_FRAMES.length && frameCount >= SNAPSHOT_FRAMES[snapIdx]) {
    snapshotNow('f' + SNAPSHOT_FRAMES[snapIdx]);
    snapIdx++;
  }
  if (snapIdx >= SNAPSHOT_FRAMES.length) {
    send('=== DONE: all snapshots captured ===');
    // Print summary
    for (var i = 0; i < SNAPSHOT_FRAMES.length; i++) {
      var label = 'f' + SNAPSHOT_FRAMES[i];
      if (snapshots[label]) {
        send('  ' + label + ': ' + snapshots[label].length + ' classes');
      }
    }
  }
}

setTimeout(function() {
  Java.perform(function() {
    Java.deoptimizeEverything();
    send('=== Deoptimized ===');
    
    snapshotNow('f0');
    snapIdx = 1;
    
    // Hook eglSwapBuffers
    var egl = Process.findModuleByName('libEGL.so');
    if (egl) {
      var swap = egl.findExportByName('eglSwapBuffers');
      if (swap) {
        Interceptor.attach(swap, {
          onLeave: function(retval) {
            frameCount++;
            frameCheck();
          }
        });
        send('EGL hooked at ' + swap);
      }
    }
  });
}, 1000);  // Wait 1s for app to settle
