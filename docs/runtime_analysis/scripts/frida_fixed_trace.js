'use strict';

// Fixed rendering trace — applies all four of Claude's fixes

Java.perform(function() {
    // Step 1: Force interpreter mode — MUST be before any other hook
    Java.deoptimizeEverything();
    // Java.deoptimizeBootImage(); // uncomment if framework hooks also needed
    send('DEO PTIMIZED');
    
    var frameCount = 0;
    
    // Step 2: Native frame counter — works regardless of Java bridge
    try {
        var eglSwapBuffers = Module.findExportByName('libEGL.so', 'eglSwapBuffers');
        if (eglSwapBuffers) {
            Interceptor.attach(eglSwapBuffers, {
                onEnter: function(args) {
                    frameCount++;
                }
            });
            send('eglSwapBuffers hooked at ' + eglSwapBuffers);
        } else {
            send('eglSwapBuffers NOT FOUND');
        }
    } catch(e) {
        send('eglSwapBuffers error: ' + e.message);
    }
    
    // Step 2b: glDrawArrays for per-draw detail
    try {
        var glDrawArrays = Module.findExportByName('libGLESv2.so', 'glDrawArrays');
        if (glDrawArrays) {
            Interceptor.attach(glDrawArrays, {
                onEnter: function(args) {
                    // mode, first, count
                    if (frameCount % 30 === 0 || frameCount <= 5) {
                        send('glDrawArrays frame=' + frameCount + ' mode=' + args[0] + ' count=' + args[2]);
                    }
                }
            });
            send('glDrawArrays hooked');
        }
    } catch(e) {
        send('glDrawArrays error: ' + e.message);
    }
    
    // Step 3: C3DEngine Java hooks — now will fire with deoptimization
    try {
        var VObject3d = Java.use('com.censivn.C3DEngine.api.core.VObject3d');
        VObject3d.draw.implementation = function() {
            var name = this.name.value ? this.name.value : '?';
            send('DRAW[' + frameCount + ']: ' + this.$className + ' name=' + name);
            return this.draw();
        };
        send('VObject3d.draw hooked');
    } catch(e) {
        send('VObject3d error: ' + e.message);
    }
    
    try {
        var VContainer = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
        VContainer.addChild.implementation = function(child) {
            var pname = this.name.value ? this.name.value : '?';
            var cname = child.name.value ? child.name.value : '?';
            send('ADDCHILD[' + frameCount + ']: ' + pname + ' <- ' + cname + ' (' + child.$className + ')');
            return this.addChild(child);
        };
        send('VObject3dContainer.addChild hooked');
    } catch(e) {
        send('VContainer error: ' + e.message);
    }
    
    try {
        var VWidget = Java.use('com.censivn.C3DEngine.api.core.VWidgetContainer');
        VWidget.onDragStart.implementation = function() {
            send('DRAG_START[' + frameCount + ']');
            return this.onDragStart();
        };
        VWidget.onDragEnd.implementation = function() {
            send('DRAG_END[' + frameCount + ']');
            return this.onDragEnd();
        };
        VWidget.onDestroy.implementation = function() {
            send('WIDGET_DESTROY[' + frameCount + ']');
            return this.onDestroy();
        };
        VWidget.onChangeSceneSize.overload('float', 'float').implementation = function(w, h) {
            send('WIDGET_RESIZE[' + frameCount + ']: ' + w + 'x' + h);
            return this.onChangeSceneSize(w, h);
        };
        send('VWidgetContainer hooks installed');
    } catch(e) {
        send('VWidget error: ' + e.message);
    }
    
    try {
        var VPage = Java.use('com.censivn.C3DEngine.api.shell.VPage');
        VPage.addWidget.overload('com.censivn.C3DEngine.api.core.VObject3d').implementation = function(widget) {
            send('PAGE_ADDWIDGET[' + frameCount + ']: ' + (widget ? widget.$className : 'null'));
            return this.addWidget(widget);
        };
        send('VPage hooks installed');
    } catch(e) {
        send('VPage error: ' + e.message);
    }
    
    try {
        var VTexMgr = Java.use('com.censivn.C3DEngine.api.core.VTextureManager');
        VTexMgr.createTexture.overload('android.graphics.Bitmap', 'boolean').implementation = function(bmp, recycle) {
            send('TEX_CREATE[' + frameCount + ']: w=' + bmp.getWidth() + ' h=' + bmp.getHeight());
            return this.createTexture(bmp, recycle);
        };
        send('VTextureManager hooked');
    } catch(e) {
        send('VTexMgr error: ' + e.message);
    }
    
    send('ALL_HOOKS_READY');
});

// Periodic status report
setInterval(function() {
    send('STATUS: frames=' + frameCount);
}, 5000);
