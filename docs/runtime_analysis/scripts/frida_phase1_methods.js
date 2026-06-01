'use strict';

var TARGETS = [
  'com.tsf.shell.f.h.a.a.a.b',
  'com.tsf.shell.f.e.c.a.b',
  'com.tsf.shell.f.e.c.a.c',
  'com.tsf.shell.manager.wallpaper.a$a',
  'com.tsf.shell.manager.wallpaper.a$b',
  'com.tsf.shell.widget.alarm.AlarmWidget',
  'com.tsf.shell.widget.alarm.k',
  'com.tsf.shell.widget.alarm.a',
  'com.tsf.shell.widget.alarm.g',
  'com.tsf.shell.widget.alarm.b',
  'com.tsf.shell.widget.alarm.h',
  'com.tsf.shell.widget.alarm.l',
  'com.tsf.shell.widget.alarm.q',
  'com.tsf.shell.widget.alarm.j',
  'com.tsf.shell.widget.alarm.c.a',
  'com.tsf.shell.widget.alarm.c.b',
  'com.tsf.shell.widget.alarm.c.c',
  'com.tsf.shell.widget.alarm.c.d',
];

Java.perform(function() {
  Java.deoptimizeEverything();
  
  TARGETS.forEach(function(cn) {
    try {
      var cls = Java.use(cn);
      var methods = cls.class.getDeclaredMethods();
      send('=== ' + cn + ' (' + methods.length + ' methods) ===');
      methods.forEach(function(m) {
        var s = m.toString();
        // Shorten: strip "public/private" etc for readability
        send('  ' + s);
      });
    } catch(e) {
      send('ERR ' + cn + ': ' + e.message);
    }
  });
  
  // Also search for more obfuscated packages
  send('=== SEARCHING FOR MORE OBFUSCATED CLASSES ===');
  try {
    var classes = Java.enumerateLoadedClassesSync();
    var obfuscated = classes.filter(function(c) {
      // Single-letter package names (obfuscated)
      return c.match(/^com\.tsf\.shell\.[a-z]\.[a-z]\.[a-z]/);
    });
    send('Obfuscated classes found: ' + obfuscated.length);
    obfuscated.forEach(function(c) { send('  ' + c); });
  } catch(e) {
    send('Search err: ' + e.message);
  }
  
  send('DONE');
});
