Java.perform(function() {
    console.log('=== HEAP SCAN: Live C3DEngine & Manager Instances ===\n');

    // 1. Scan for instances of key classes using the class loader
    function findInstances(className) {
        try {
            var clazz = Java.use(className);
            if (clazz.$isStaticClass) return;
            
            var instances = Java.choose(className, {
                onMatch: function(inst) {
                    console.log('[INSTANCE] ' + className + '@' + inst.hashCode());
                    
                    // Try to dump all fields
                    try {
                        var fields = Object.getOwnPropertyNames(inst);
                        fields.forEach(function(f) {
                            if (f === '$class' || f === '$className' || f === 'constructor') return;
                            try {
                                var val = inst[f];
                                if (typeof val !== 'function') {
                                    console.log('    .' + f + ' = ' + (val ? val.toString().substring(0, 200) : 'null'));
                                }
                            } catch(e) {}
                        });
                    } catch(e) {
                        // Try Java reflection
                        try {
                            var declaredFields = clazz.class.getDeclaredFields();
                            for (var i = 0; i < declaredFields.length; i++) {
                                declaredFields[i].setAccessible(true);
                                var name = declaredFields[i].getName();
                                var type = declaredFields[i].getType().getName();
                                var val = declaredFields[i].get(inst);
                                console.log('    [refl] ' + type + ' ' + name + ' = ' + (val ? String(val).substring(0, 200) : 'null'));
                            }
                        } catch(e2) {}
                    }
                    
                    // List methods
                    try {
                        var methods = clazz.class.getDeclaredMethods();
                        console.log('    METHODS (' + methods.length + '):');
                        for (var i = 0; i < Math.min(methods.length, 30); i++) {
                            var m = methods[i];
                            console.log('      ' + m.getReturnType().getName() + ' ' + m.getName() + '(' + 
                                Array.from(m.getParameterTypes()).map(function(p) { return p.getName(); }).join(',') + ')');
                        }
                    } catch(e) {}
                },
                onComplete: function() {}
            });
            return instances;
        } catch(e) {
            console.log('[ERR] ' + className + ': ' + e);
            return null;
        }
    }

    // Scan key TSF classes
    var targets = [
        'com.censivn.C3DEngine.a',
        'com.censivn.C3DEngine.b.c.c',
        'com.tsf.shell.Home',
        'com.tsf.shell.ShellActivity',
        'com.tsf.shell.ShellApplication',
        'com.tsf.shell.manager.bind.ShellModel',
        'com.tsf.shell.manager.action.b',
        'com.tsf.shell.manager.action.f',
        'com.tsf.shell.manager.b.e',
        'com.tsf.shell.manager.a.a',
        'com.tsf.shell.manager.bind.a',
        'com.tsf.shell.manager.bind.d',
        'com.tsf.shell.utils.x',
        'com.tsf.a',
        'com.tsf.b'
    ];
    
    targets.forEach(function(t) { findInstances(t); });

    // 2. Dump the C3D engine configuration
    console.log('\n=== C3D ENGINE CONFIG ===');
    try {
        var C3DEngine = Java.use('com.censivn.C3DEngine.a');
        var fields = C3DEngine.class.getDeclaredFields();
        for (var i = 0; i < fields.length; i++) {
            var f = fields[i];
            f.setAccessible(true);
            var mod = java.lang.reflect.Modifier.toString(f.getModifiers());
            var type = f.getType().getName();
            var name = f.getName();
            
            if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                try {
                    var val = f.get(null);
                    console.log('  [static] ' + mod + ' ' + type + ' ' + name + ' = ' + (val ? String(val).substring(0, 300) : 'null'));
                } catch(e) {
                    console.log('  [static] ' + mod + ' ' + type + ' ' + name + ' = <' + e.message.substring(0, 100) + '>');
                }
            } else {
                // Instance field - show type and name only
                console.log('  [inst] ' + mod + ' ' + type + ' ' + name);
            }
        }
    } catch(e) {
        console.log('[ERR] ' + e);
    }

    console.log('\n=== HEAP SCAN COMPLETE ===');
});
