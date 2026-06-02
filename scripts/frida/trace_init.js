Java.perform(function() {
    // Trace app startup lifecycle
    var ShellApp = Java.use('com.tsf.shell.ShellApplication');
    ShellApp.onCreate.implementation = function() {
        console.log('[TRACE] ShellApplication.onCreate()');
        this.onCreate();
    };

    var ShellActivity = Java.use('com.tsf.shell.ShellActivity');
    ShellActivity.onCreate.implementation = function(bundle) {
        console.log('[TRACE] ShellActivity.onCreate()');
        this.onCreate(bundle);
    };

    var Home = Java.use('com.tsf.shell.Home');
    Home.onCreate.implementation = function(bundle) {
        console.log('[TRACE] Home.onCreate()');
        this.onCreate(bundle);
    };
    Home.onResume.implementation = function() {
        console.log('[TRACE] Home.onResume()');
        this.onResume();
    };

    // Trace C3DEngine initialization
    var C3D = Java.use('com.censivn.C3DEngine.a');
    C3D.a.overload('android.app.Activity').implementation = function(activity) {
        console.log('[TRACE] C3DEngine.init(activity=' + activity + ')');
        this.a(activity);
    };

    // Enumerate loaded native libraries
    console.log('[INFO] Loaded libraries:');
    var runtime = Java.use('java.lang.Runtime');
    runtime.getRuntime().loadLibrary.overload('java.lang.String').implementation = function(name) {
        console.log('[LIB] loadLibrary: ' + name);
        this.loadLibrary(name);
    };

    // Hook ShellProvider onCreate
    var ShellProvider = Java.use('com.tsf.shell.ShellProvider');
    ShellProvider.onCreate.implementation = function() {
        console.log('[TRACE] ShellProvider.onCreate()');
        return this.onCreate();
    };

    // Hook ShellBroadcastReceiver
    var Receiver = Java.use('com.tsf.shell.ShellBroadcastReceiver');
    Receiver.onReceive.implementation = function(ctx, intent) {
        console.log('[TRACE] ShellBroadcastReceiver.onReceive: ' + intent.toString());
        this.onReceive(ctx, intent);
    };

    // Trace extension init
    var ExtH = Java.use('com.tsf.extend.h');
    ExtH.a.overload('android.content.Context').implementation = function(ctx) {
        console.log('[TRACE] com.tsf.extend.h.init(context)');
        this.a(ctx);
    };
});
