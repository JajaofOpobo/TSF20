Java.perform(function() {
    console.log('=== TSF SHELL ENUMERATED CLASSES ===');
    var count = 0;
    Java.enumerateLoadedClasses({
        onMatch: function(className) {
            if (className.indexOf('tsf') >= 0 || className.indexOf('censivn') >= 0 || className.indexOf('ksmobile') >= 0) {
                if (className.startsWith('com.tsf.') || className.startsWith('com.censivn.') || className.startsWith('com.ksmobile.')) {
                    console.log(className);
                    count++;
                }
            }
        },
        onComplete: function() {
            console.log('=== TOTAL TSF CLASSES: ' + count + ' ===');
        }
    });
});
