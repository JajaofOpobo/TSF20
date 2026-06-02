Java.perform(function() {
    var classes = [];
    Java.enumerateLoadedClasses({
        onMatch: function(className) {
            if (className.indexOf('tsf') >= 0 || className.indexOf('censivn') >= 0 || className.indexOf('ksmobile') >= 0) {
                if (className.startsWith('com.tsf.') || className.startsWith('com.censivn.') || className.startsWith('com.ksmobile.')) {
                    classes.push(className);
                }
            }
        },
        onComplete: function() {
            classes.sort();
            classes.forEach(function(cn) {
                try {
                    var clazz = Java.use(cn);
                    var methods = clazz.class.getDeclaredMethods();
                    var ifaces = clazz.class.getInterfaces();
                    var superCls = clazz.class.getSuperclass();
                    var ifaceNames = [];
                    for (var i = 0; i < ifaces.length; i++) {
                        ifaceNames.push(ifaces[i].getName());
                    }
                    console.log('=== ' + cn + ' ===');
                    console.log('  super: ' + (superCls ? superCls.getName() : 'none'));
                    if (ifaceNames.length) console.log('  interfaces: ' + ifaceNames.join(', '));
                    methods.forEach(function(m) {
                        console.log('  ' + m.toString().replace(/, /g, ', '));
                    });
                } catch(e) {
                    console.log('=== ' + cn + ' === [ERROR: ' + e.message + ']');
                }
            });
        }
    });
});
