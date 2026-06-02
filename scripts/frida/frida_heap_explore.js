// Frida script: enumerate classes, heap instances, SQLite from TSF
Java.perform(function() {
    // 1. Enumerate loaded classes matching TSF/C3DEngine patterns
    console.log('\n=== ENUMERATING LOADED CLASSES ===');
    var count = 0;
    Java.enumerateLoadedClasses({
        onMatch: function(className) {
            if (className.indexOf('com.tsf.') === 0 || 
                className.indexOf('com.censivn.') === 0 ||
                className.indexOf('com.ksmobile.') === 0) {
                console.log(className);
                count++;
            }
        },
        onComplete: function() {
            console.log('Total filtered loaded classes: ' + count);
        }
    });
    
    // 2. Dump shared preferences
    console.log('\n=== SHARED PREFERENCES ===');
    var context = Java.use('android.app.ActivityThread').currentApplication().getApplicationContext();
    var prefsNames = ['com.tsf.shell_preferences', 'config', 'temp', 'isFirstLauncher', 'tsf_infoc_setting_pref'];
    prefsNames.forEach(function(name) {
        try {
            var prefs = context.getSharedPreferences(name, 0);
            var all = prefs.getAll();
            var map = Java.cast(all, Java.use('java.util.HashMap'));
            var entries = map.entrySet().toArray();
            console.log('\n--- ' + name + ' (' + entries.length + ' entries) ---');
            for (var i = 0; i < entries.length; i++) {
                var entry = entries[i];
                console.log('  ' + entry.getKey() + ' = ' + entry.getValue());
            }
        } catch(e) {
            console.log('Error reading ' + name + ': ' + e.message);
        }
    });
    
    // 3. Query SQLite
    console.log('\n=== SQLITE DATABASE QUERY ===');
    var SQLiteDatabase = Java.use('android.database.sqlite.SQLiteDatabase');
    try {
        var dbPath = '/data/data/com.tsf.shell/databases/TSFLauncher-database.db';
        var db = SQLiteDatabase.openDatabase(dbPath, null, 0);
        var tables = ['favorites', 'application', 'dock', 'menu', 'slidingdock', 'quicklaunch', 'action'];
        tables.forEach(function(table) {
            try {
                var cursor = db.rawQuery('SELECT * FROM ' + table + ' LIMIT 3', null);
                var colCount = cursor.getColumnCount();
                console.log('\n--- ' + table + ' (' + cursor.getCount() + ' rows, ' + colCount + ' cols) ---');
                var cols = [];
                for (var i = 0; i < colCount; i++) {
                    cols.push(cursor.getColumnName(i));
                }
                console.log('Columns: ' + cols.join(', '));
                while (cursor.moveToNext()) {
                    var row = {};
                    for (var i = 0; i < colCount; i++) {
                        row[cols[i]] = cursor.getString(i);
                    }
                    console.log('  ' + JSON.stringify(row));
                }
                cursor.close();
            } catch(e) {
                console.log('  Error: ' + e.message);
            }
        });
        db.close();
    } catch(e) {
        console.log('DB error: ' + e.message);
    }
    
    // 4. Hook key C3DEngine classes
    console.log('\n=== KEY CLASS HOOKS ===');
    var targets = [
        'com.censivn.C3DEngine.a',
        'com.censivn.C3DEngine.b.c.c',
        'com.tsf.shell.Home',
        'com.tsf.shell.ShellActivity'
    ];
    targets.forEach(function(t) {
        try {
            var cls = Java.use(t);
            var methods = cls.class.getDeclaredMethods();
            console.log(t + ': ' + methods.length + ' methods');
            for (var i = 0; i < Math.min(methods.length, 3); i++) {
                console.log('  ' + methods[i].getName());
            }
            if (methods.length > 3) console.log('  ... and ' + (methods.length - 3) + ' more');
        } catch(e) {}
    });
});
