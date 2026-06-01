Java.perform(function() {
    console.log('=== TSF SHELL RUNTIME ANALYSIS ===\n');

    // 1. Enumerate ALL TSF/C3D classes
    console.log('--- LOADED CLASSES ---');
    var tsfClasses = [];
    Java.enumerateLoadedClasses({
        onMatch: function(c) {
            if (c.indexOf('tsf.') >= 0 || c.indexOf('censivn') >= 0 || c.indexOf('ksmobile') >= 0) {
                tsfClasses.push(c);
                console.log('  ' + c);
            }
        },
        onComplete: function() {
            console.log('  TOTAL: ' + tsfClasses.length + '\n');
        }
    });

    // 2. Enumerate loaded native libraries
    console.log('--- NATIVE LIBRARIES ---');
    var loadLib = Java.use('java.lang.Runtime').getRuntime().loadLibrary;
    var nativeLibs = [];
    loadLib.overload('java.lang.String').implementation = function(name) {
        nativeLibs.push(name);
        console.log('  [LOAD] ' + name);
        this.loadLibrary(name);
    };

    // Schedule library listing after a delay
    setTimeout(function() {
        console.log('\n  Libraries loaded during trace:');
        nativeLibs.forEach(function(l) { console.log('    ' + l); });

        // 3. Dump package info
        console.log('\n--- PACKAGE INFO ---');
        var context = Java.use('android.app.ActivityThread').currentApplication().getApplicationContext();
        var pkgManager = context.getPackageManager();
        try {
            var pkgInfo = pkgManager.getPackageInfo('com.tsf.shell', 0);
            console.log('  Version: ' + pkgInfo.versionName + ' (' + pkgInfo.versionCode + ')');
            console.log('  First install: ' + new Date(pkgInfo.firstInstallTime));
            console.log('  Last update: ' + new(pkgInfo.lastUpdateTime));
        } catch(e) {
            console.log('  Error: ' + e);
        }

        // 4. Dump preferences
        console.log('\n--- SHARED PREFERENCES ---');
        var prefs = context.getSharedPreferences('com.tsf.shell_preferences', 0);
        var allPrefs = prefs.getAll();
        if (allPrefs) {
            var keys = allPrefs.keySet().toArray();
            for (var i = 0; i < keys.length; i++) {
                var val = allPrefs.get(keys[i]);
                console.log('  ' + keys[i] + ' = ' + val);
            }
        }

        // 5. List files in data dir
        console.log('\n--- DATA DIRECTORY ---');
        var dataDir = context.getFilesDir().getParent();
        console.log('  Data dir: ' + dataDir);
        var file = Java.use('java.io.File');
        var dataFile = file.$new(dataDir);
        var files = dataFile.list();
        if (files) {
            for (var i = 0; i < files.length; i++) {
                console.log('  ' + files[i]);
            }
        }

        // 6. Database info
        console.log('\n--- DATABASES ---');
        var dbDir = file.$new(dataDir + '/databases');
        var dbFiles = dbDir.list();
        if (dbFiles) {
            for (var i = 0; i < dbFiles.length; i++) {
                console.log('  ' + dbFiles[i]);
            }
        }

        // 7. Hook ALL TSF methods
        console.log('\n--- METHOD TRACING ---');
        var targetPackages = ['com.tsf.shell', 'com.censivn.C3DEngine', 'com.tsf.extend', 'com.tsf.b'];
        tsfClasses.forEach(function(c) {
            var isTarget = false;
            for (var p = 0; p < targetPackages.length; p++) {
                if (c.indexOf(targetPackages[p]) === 0) { isTarget = true; break; }
            }
            if (!isTarget) return;

            try {
                var clazz = Java.use(c);
                var methods = Object.getOwnPropertyNames(clazz.__proto__).filter(function(m) {
                    return m.indexOf('$') === -1 && m !== 'constructor' && m !== 'class' && typeof clazz[m] === 'function';
                });

                methods.forEach(function(m) {
                    try {
                        var overloads = clazz[m].overloads;
                        if (overloads) {
                            overloads.forEach(function(overload, idx) {
                                var proto = '';
                                try { proto = '(' + overload.argumentTypes.map(function(t) { return t.className; }).join(', ') + ')'; } catch(e) {}
                                var orig = overload.implementation;
                                overload.implementation = function() {
                                    var args = [];
                                    try {
                                        for (var i = 0; i < arguments.length; i++) {
                                            var a = arguments[i];
                                            if (a === null) args.push('null');
                                            else if (typeof a === 'object' && a.toString) args.push(a.toString().substring(0, 100));
                                            else args.push(String(a).substring(0, 100));
                                        }
                                    } catch(e) { args.push('?'); }
                                    console.log('[CALL] ' + c + '.' + m + proto + ' args=[' + args.join(', ') + ']');
                                    return overload.apply(this, arguments);
                                };
                            });
                        }
                    } catch(e) {
                        // Skip - can't hook this method
                    }
                });
            } catch(e) {
                console.log('[ERR] Cannot use class ' + c + ': ' + e);
            }
        });
        console.log('\n=== ANALYSIS COMPLETE ===');
    }, 3000);
});
