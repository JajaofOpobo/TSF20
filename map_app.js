// Full app mapper: enumerate all loaded classes, methods, and trace key APIs

rpc.exports = {
  enumerateAllClasses() {
    const results = [];
    Java.enumerateLoadedClasses({
      onMatch: function(className) {
        if (className.startsWith('com.tsf.') || className.startsWith('com.censivn.')) {
          results.push(className);
        }
      },
      onComplete: function() {}
    });
    return results;
  },

  enumerateMethods(className) {
    const results = [];
    try {
      const clazz = Java.use(className);
      const methods = clazz.class.getDeclaredMethods();
      for (const m of methods) {
        results.push(m.toString());
      }
    } catch (e) {
      results.push('Error: ' + e.message);
    }
    return results;
  },

  getClassFields(className) {
    const results = [];
    try {
      const clazz = Java.use(className);
      const fields = clazz.class.getDeclaredFields();
      for (const f of fields) {
        results.push(f.toString());
      }
    } catch (e) {
      results.push('Error: ' + e.message);
    }
    return results;
  },

  getClassHierarchy(className) {
    const results = [];
    try {
      const clazz = Java.use(className);
      let current = clazz.class;
      while (current) {
        results.push(current.getName());
        current = current.getSuperclass();
      }
    } catch (e) {
      results.push('Error: ' + e.message);
    }
    return results;
  },

  enumerateClassLoaders() {
    const results = [];
    Java.enumerateClassLoaders({
      onMatch: function(loader) {
        results.push(loader.toString());
      },
      onComplete: function() {}
    });
    return results;
  },

  // Get all interfaces implemented
  getInterfaces(className) {
    const results = [];
    try {
      const clazz = Java.use(className);
      const ifaces = clazz.class.getInterfaces();
      for (const i of ifaces) {
        results.push(i.getName());
      }
    } catch (e) {}
    return results;
  }
};

// Set up tracing of all methods on a class
function traceClass(className) {
  try {
    const clazz = Java.use(className);
    const methods = clazz.class.getDeclaredMethods();
    methods.forEach(function(method) {
      const methodName = method.getName();
      const overloads = clazz[methodName].overloads;
      overloads.forEach(function(overload) {
        overload.implementation = function() {
          const args = Array.prototype.slice.call(arguments).map(a => {
            if (a === null) return 'null';
            if (typeof a === 'object') {
              try { return a.toString(); } catch(e) { return String(a); }
            }
            return String(a);
          });
          console.log(`[${className}.${methodName}] args=[${args.join(', ')}]`);
          const ret = overload.apply(this, arguments);
          console.log(`[${className}.${methodName}] => ${ret}`);
          return ret;
        };
      });
    });
  } catch (e) {
    console.log(`Cannot trace ${className}: ${e.message}`);
  }
}

setTimeout(function() {
  Java.perform(function() {
    console.log('=== Frida Mapper Ready ===');
    console.log('Running app mapping...');
  });
}, 0);
