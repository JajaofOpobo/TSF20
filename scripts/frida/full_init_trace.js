Java.perform(function() {
    console.log('[=== TSF SHELL FULL INITIALIZATION TRACE ===]\n');

    var indent = '';

    // Utility to log with indentation
    function log(msg) { console.log(indent + msg); }

    // Hook class loading
    var classLoader = Java.use('java.lang.ClassLoader');
    classLoader.loadClass.overload('java.lang.String').implementation = function(name) {
        if (name.indexOf('tsf.') >= 0 || name.indexOf('censivn') >= 0 || name.indexOf('ksmobile') >= 0) {
            console.log('[CLASSLOAD] ' + name);
        }
        return this.loadClass(name);
    };

    // Hook key lifecycle methods
    var ShellApp = Java.use('com.tsf.shell.ShellApplication');
    ShellApp.onCreate.implementation = function() {
        console.log('[LIFECYCLE] ShellApplication.onCreate()');
        this.onCreate();
    };

    var ShellActivity = Java.use('com.tsf.shell.ShellActivity');
    ShellActivity.onCreate.overload('android.os.Bundle').implementation = function(b) {
        console.log('[LIFECYCLE] ShellActivity.onCreate()');
        this.onCreate(b);
    };
    ShellActivity.onResume.implementation = function() {
        console.log('[LIFECYCLE] ShellActivity.onResume()');
        this.onResume();
    };

    var Home = Java.use('com.tsf.shell.Home');
    Home.onCreate.overload('android.os.Bundle').implementation = function(b) {
        console.log('[LIFECYCLE] Home.onCreate()');
        indent = '  ';
        this.onCreate(b);
        indent = '';
    };
    Home.onResume.implementation = function() {
        console.log('[LIFECYCLE] Home.onResume()');
        this.onResume();
    };
    Home.onStart.implementation = function() {
        console.log('[LIFECYCLE] Home.onStart()');
        this.onStart();
    };
    Home.onPause.implementation = function() {
        console.log('[LIFECYCLE] Home.onPause()');
        this.onPause();
    };

    // Hook ShellProvider
    var ShellProvider = Java.use('com.tsf.shell.ShellProvider');
    ShellProvider.onCreate.implementation = function() {
        console.log('[LIFECYCLE] ShellProvider.onCreate()');
        return this.onCreate();
    };
    ShellProvider.query.overload('android.net.Uri', '[Ljava.lang.String;', 'java.lang.String', '[Ljava.lang.String;', 'java.lang.String').implementation = function(u, p, sel, args, sort) {
        console.log('[PROVIDER] query: ' + (u ? u.toString() : 'null'));
        return this.query(u, p, sel, args, sort);
    };

    // Hook C3DEngine
    var C3D_a = Java.use('com.censivn.C3DEngine.a');
    // Try to find init methods
    try {
        C3D_a.a.overload('android.app.Activity').implementation = function(act) {
            console.log('[C3D] a.init(Activity=' + act + ')');
            return this.a(act);
        };
    } catch(e) {
        console.log('[C3D] No init(Activity) overload found');
    }

    // Hook C3DEngine.b.c.c (WidgetManager)
    var WidgetMgr = Java.use('com.censivn.C3DEngine.b.c.c');
    WidgetMgr.a.overload('com.censivn.C3DEngine.api.message.RenderRunnable').implementation = function(r) {
        console.log('[WIDGETMGR] a(RenderRunnable): ' + r);
        return this.a(r);
    };

    // Hook ShellModel data operations
    var ShellModel = Java.use('com.tsf.shell.manager.bind.ShellModel');
    ShellModel.a.overload('java.lang.String').implementation = function(s) {
        console.log('[SHELLMODEL] a(String): ' + s);
        return this.a(s);
    };
    ShellModel.onReceive.overload('android.content.Context', 'android.content.Intent').implementation = function(ctx, intent) {
        console.log('[SHELLMODEL] onReceive: ' + (intent ? intent.toString() : 'null'));
        return this.onReceive(ctx, intent);
    };

    // Hook app manager
    var AppMgr = Java.use('com.tsf.shell.manager.a.a');
    AppMgr.a.overload('android.content.ComponentName').implementation = function(cn) {
        console.log('[APPMGR] a(ComponentName): ' + (cn ? cn.toString() : 'null'));
        return this.a(cn);
    };

    // Hook ShellBroadcastReceiver
    var Receiver = Java.use('com.tsf.shell.ShellBroadcastReceiver');
    Receiver.onReceive.implementation = function(ctx, intent) {
        console.log('[RECEIVER] onReceive: ' + (intent ? intent.toString() : 'null'));
        return this.onReceive(ctx, intent);
    };

    // Snapshot all loaded classes after 5 seconds
    setTimeout(function() {
        Java.perform(function() {
            console.log('\n[=== DEFERRED CLASS LOADS ===]');
            var allClasses = [];
            Java.enumerateLoadedClasses({
                onMatch: function(c) {
                    if (c.indexOf('tsf.') >= 0 || c.indexOf('censivn') >= 0 || c.indexOf('ksmobile') >= 0) {
                        allClasses.push(c);
                    }
                },
                onComplete: function() {
                    allClasses.sort();
                    allClasses.forEach(function(c) { console.log('  ' + c); });
                    console.log('\n  TOTAL: ' + allClasses.length);
                }
            });
        });
    }, 5000);

    console.log('\n[=== TRACE ACTIVE - Interact with the launcher ===]\n');
});
