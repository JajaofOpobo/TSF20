'use strict';

/*
 * Page transition queue trace for TSF Shell v3.9.4.
 *
 * Usage:
 *   frida -U -f com.tsf.shell -l docs/runtime_analysis/scripts/frida_transition_queue_trace.js --no-pause
 *
 * This script traces the real v3 queue/page path:
 *   gesture/source -> engine queue -> page transition object -> per-frame page movement.
 */

var log = [];
var frame = 0;
var hooksReady = false;

function emit(line) {
  log.push('F' + frame + ' ' + line);
}

function flush(reason) {
  if (log.length === 0) {
    return;
  }
  send('--- FLUSH ' + reason + ' frame=' + frame + ' count=' + log.length + ' ---');
  log.forEach(function(line) {
    send(line);
  });
  log = [];
}

function className(obj) {
  if (obj === null || obj === undefined) {
    return 'null';
  }
  try {
    return obj.getClass().getName().toString();
  } catch (e1) {
    try {
      return obj.$className || obj.toString();
    } catch (e2) {
      return '<unknown>';
    }
  }
}

function hashOf(obj) {
  if (obj === null || obj === undefined) {
    return '0';
  }
  try {
    return String(obj.hashCode());
  } catch (e) {
    return '?';
  }
}

function threadName() {
  try {
    return Java.use('java.lang.Thread').currentThread().getName().toString();
  } catch (e) {
    return '<thread?>';
  }
}

function stackTop(limit) {
  try {
    var Throwable = Java.use('java.lang.Throwable');
    var frames = Throwable.$new().getStackTrace();
    var out = [];
    var max = Math.min(limit, frames.length);
    for (var i = 0; i < max; i++) {
      out.push(frames[i].toString());
    }
    return out.join(' | ');
  } catch (e) {
    return '<stack error: ' + e.message + '>';
  }
}

function describeRunnable(runnable) {
  return className(runnable) + '#' + hashOf(runnable);
}

function logQueue(kind, runnable, extra) {
  emit(kind + ' runnable=' + describeRunnable(runnable) +
       (extra ? ' ' + extra : '') +
       ' thread=' + threadName());
  emit(kind + '.stack ' + stackTop(12));
}

function installEglFlush() {
  var egl = Process.findModuleByName('libEGL.so');
  if (!egl) {
    setTimeout(installEglFlush, 300);
    return;
  }
  var swap = egl.findExportByName('eglSwapBuffers');
  if (!swap) {
    setTimeout(installEglFlush, 300);
    return;
  }
  Interceptor.attach(swap, {
    onEnter: function() {
      frame++;
      flush('eglSwapBuffers');
    }
  });
  send('eglSwapBuffers hooked at ' + swap);
}

function hookOverload(label, overload, formatter) {
  overload.implementation = function() {
    try {
      emit(formatter.apply(this, arguments));
    } catch (e) {
      emit(label + '.format_error ' + e.message);
    }
    return overload.apply(this, arguments);
  };
}

function hookNoArg(label, overload, before, after) {
  overload.implementation = function() {
    if (before) {
      emit(before.call(this));
    }
    var result = overload.apply(this, arguments);
    if (after) {
      emit(after.call(this));
    }
    return result;
  };
}

function installHooks() {
  Java.perform(function() {
    Java.deoptimizeEverything();
    send('Java.deoptimizeEverything complete');

    try {
      var EngineQueue = Java.use('com.censivn.C3DEngine.b.c.c');

      var addRender = EngineQueue.a.overload('com.censivn.C3DEngine.api.message.RenderRunnable');
      addRender.implementation = function(r) {
        logQueue('ENGINE_Q.addRender', r, 'autoInvalidate=' + r.autoInvalidate.value + ' frameDelay=' + r.frame.value + ' type=' + r.type.value);
        return addRender.apply(this, arguments);
      };

      var drain = EngineQueue.a.overload();
      drain.implementation = function() {
        emit('ENGINE_Q.drain.begin thread=' + threadName());
        var result = drain.apply(this, arguments);
        emit('ENGINE_Q.drain.end thread=' + threadName());
        return result;
      };

      var postUI = EngineQueue.a.overload('java.lang.Runnable');
      postUI.implementation = function(r) {
        logQueue('ENGINE_Q.postUI', r, '');
        return postUI.apply(this, arguments);
      };

      var postUIDelayed = EngineQueue.a.overload('java.lang.Runnable', 'long');
      postUIDelayed.implementation = function(r, delay) {
        logQueue('ENGINE_Q.postUIDelayed', r, 'delayMs=' + delay);
        return postUIDelayed.apply(this, arguments);
      };

      var postGL = EngineQueue.c.overload('java.lang.Runnable');
      postGL.implementation = function(r) {
        logQueue('ENGINE_Q.postGL', r, '');
        return postGL.apply(this, arguments);
      };

      var postGLDelayed = EngineQueue.b.overload('java.lang.Runnable', 'long');
      postGLDelayed.implementation = function(r, delay) {
        logQueue('ENGINE_Q.postGLDelayed', r, 'delayMs=' + delay);
        return postGLDelayed.apply(this, arguments);
      };

      var cancelRender = EngineQueue.b.overload('com.censivn.C3DEngine.api.message.RenderRunnable');
      cancelRender.implementation = function(r) {
        logQueue('ENGINE_Q.cancelRender', r, '');
        return cancelRender.apply(this, arguments);
      };

      send('Engine queue hooks installed');
    } catch (e) {
      send('Engine queue hook error: ' + e.message);
    }

    try {
      var VMQ = Java.use('com.censivn.C3DEngine.api.message.VMessageQueueManager');
      var vmqPost = VMQ.post.overload('java.lang.Runnable', 'int');
      vmqPost.implementation = function(r, type) {
        logQueue('VMQ.post', r, 'type=' + type);
        return vmqPost.apply(this, arguments);
      };
      send('VMessageQueueManager.post hook installed');
    } catch (e) {
      send('VMessageQueueManager hook error: ' + e.message);
    }

    try {
      var VMsg = Java.use('com.censivn.C3DEngine.api.message.VMessageManager');
      hookOverload('VMSG.postRenderRunnable',
        VMsg.postRenderRunnable.overload('com.censivn.C3DEngine.api.message.RenderRunnable'),
        function(r) {
          logQueue('VMSG.postRenderRunnable', r, '');
          return 'VMSG.postRenderRunnable.forwarded';
        });
      hookOverload('VMSG.postGLThreadRunnable',
        VMsg.postGLThreadRunnable.overload('java.lang.Runnable'),
        function(r) {
          logQueue('VMSG.postGLThreadRunnable', r, '');
          return 'VMSG.postGLThreadRunnable.forwarded';
        });
      hookOverload('VMSG.postGLThreadRunnableDelayed',
        VMsg.postGLThreadRunnable.overload('java.lang.Runnable', 'long'),
        function(r, delay) {
          logQueue('VMSG.postGLThreadRunnableDelayed', r, 'delayMs=' + delay);
          return 'VMSG.postGLThreadRunnableDelayed.forwarded';
        });
      send('VMessageManager hooks installed');
    } catch (e) {
      send('VMessageManager hook error: ' + e.message);
    }

    try {
      var RenderRunnable = Java.use('com.censivn.C3DEngine.api.message.RenderRunnable');
      var rrInit = RenderRunnable.$init.overload('int', 'int');
      rrInit.implementation = function(delayFrames, type) {
        emit('RENDER_RUNNABLE.new delayFrames=' + delayFrames + ' type=' + type + ' class=' + className(this) + '#' + hashOf(this));
        return rrInit.apply(this, arguments);
      };
      var rrRun = RenderRunnable.run.overload();
      rrRun.implementation = function() {
        emit('RENDER_RUNNABLE.baseRun class=' + className(this) + '#' + hashOf(this) + ' thread=' + threadName());
        return rrRun.apply(this, arguments);
      };
      send('RenderRunnable constructor/base run hooks installed');
    } catch (e) {
      send('RenderRunnable hook error: ' + e.message);
    }

    try {
      var PageHost = Java.use('com.tsf.shell.f.e.c.a.c');
      var pageTransition = PageHost.a.overload('com.tsf.shell.f.e.c.a.b', 'com.tsf.shell.f.e.c.a.b');
      pageTransition.implementation = function(from, to) {
        emit('TRANSITION from=' + className(from) + '#' + hashOf(from) +
             ' to=' + className(to) + '#' + hashOf(to) +
             ' thread=' + threadName());
        emit('TRANSITION.stack ' + stackTop(12));
        return pageTransition.apply(this, arguments);
      };
      send('Page transition hook installed');
    } catch (e) {
      send('Page transition hook error: ' + e.message);
    }

    try {
      var Page = Java.use('com.tsf.shell.f.e.c.a.b');
      var pageSetSize = Page.a.overload('float');
      pageSetSize.implementation = function(v) {
        emit('PAGE.a(float) page=' + hashOf(this) + ' value=' + v + ' posX=' + this.position().x.value);
        return pageSetSize.apply(this, arguments);
      };
      var pageMove = Page.b.overload('float');
      pageMove.implementation = function(v) {
        emit('PAGE.b(float) page=' + hashOf(this) + ' value=' + v + ' beforeX=' + this.position().x.value);
        var result = pageMove.apply(this, arguments);
        emit('PAGE.b(float).after page=' + hashOf(this) + ' afterX=' + this.position().x.value);
        return result;
      };
      send('Page movement hooks installed');
    } catch (e) {
      send('Page movement hook error: ' + e.message);
    }

    try {
      var PageAnimator = Java.use('com.tsf.shell.f.e.c.a.d');
      hookOverload('PAGE_ANIM.init',
        PageAnimator.a.overload('float', 'float', 'float', 'int'),
        function(width, radius, depth, color) {
          return 'PAGE_ANIM.init width=' + width + ' radius=' + radius + ' depth=' + depth + ' color=' + color + ' obj=' + hashOf(this);
        });
      hookOverload('PAGE_ANIM.progress',
        PageAnimator.c.overload('float'),
        function(progress) {
          return 'PAGE_ANIM.progress obj=' + hashOf(this) + ' value=' + progress;
        });
      hookOverload('PAGE_ANIM.rotation',
        PageAnimator.b.overload('float'),
        function(rotation) {
          return 'PAGE_ANIM.rotation obj=' + hashOf(this) + ' value=' + rotation;
        });
      send('Page animator hooks installed');
    } catch (e) {
      send('Page animator hook error: ' + e.message);
    }

    try {
      var VTween = Java.use('com.censivn.C3DEngine.api.tween.VTween');
      var tweenTo = VTween.to.overload(
        'com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget',
        'int',
        'com.censivn.C3DEngine.api.tween.VTweenParam'
      );
      tweenTo.implementation = function(target, duration, param) {
        emit('VTWEEN.to target=' + className(target) + '#' + hashOf(target) +
             ' durationMs=' + duration +
             ' param=' + className(param) + '#' + hashOf(param));
        emit('VTWEEN.to.stack ' + stackTop(12));
        return tweenTo.apply(this, arguments);
      };
      send('VTween.to hook installed');
    } catch (e) {
      send('VTween hook error: ' + e.message);
    }

    try {
      var VTP = Java.use('com.censivn.C3DEngine.api.tween.VTweenParam');
      [
        ['setEase', 'int'],
        ['setTimeout', 'int'],
        ['setAlpha', 'int'],
        ['setX', 'float'],
        ['setY', 'float'],
        ['setZ', 'float'],
        ['setSPX', 'float'],
        ['setSPY', 'float'],
        ['setSPZ', 'float'],
        ['setScaleX', 'float'],
        ['setScaleY', 'float'],
        ['setScaleZ', 'float'],
        ['setRotationX', 'float'],
        ['setRotationY', 'float'],
        ['setRotationZ', 'float']
      ].forEach(function(spec) {
        try {
          var name = spec[0];
          var sig = spec[1];
          var ov = VTP[name].overload(sig);
          ov.implementation = function(v) {
            emit('VTWEEN_PARAM.' + name + ' param=' + hashOf(this) + ' value=' + v);
            return ov.apply(this, arguments);
          };
        } catch (inner) {
          emit('VTWEEN_PARAM.hook_error ' + spec[0] + ': ' + inner.message);
        }
      });
      send('VTweenParam setter hooks installed');
    } catch (e) {
      send('VTweenParam hook error: ' + e.message);
    }

    try {
      var Effects = Java.use('com.censivn.C3DEngine.api.effects.VEffectsStack');
      hookOverload('VEFFECTS.addModifier',
        Effects.addModifier.overload('com.censivn.C3DEngine.api.effects.VIEffects'),
        function(effect) {
          return 'VEFFECTS.addModifier stack=' + hashOf(this) + ' effect=' + className(effect) + '#' + hashOf(effect);
        });
      hookNoArg('VEFFECTS.apply', Effects.apply.overload(),
        function() { return 'VEFFECTS.apply stack=' + hashOf(this); }, null);
      hookNoArg('VEFFECTS.collapse', Effects.collapse.overload(),
        function() { return 'VEFFECTS.collapse stack=' + hashOf(this); }, null);
      hookNoArg('VEFFECTS.clear', Effects.clear.overload(),
        function() { return 'VEFFECTS.clear stack=' + hashOf(this); }, null);
      send('VEffectsStack hooks installed');
    } catch (e) {
      send('VEffectsStack hook error: ' + e.message);
    }

    try {
      var VConsole = Java.use('com.censivn.C3DEngine.api.shell.VConsole');
      [
        ['pauseScreenOrientation', []],
        ['resumeScreenOrientation', []],
        ['isTransparentNavigationBar', []],
        ['isFullScreen', []],
        ['startActivityWithoutAnimation', ['android.content.Intent']]
      ].forEach(function(spec) {
        try {
          var name = spec[0];
          var ov = VConsole[name].overload.apply(VConsole[name], spec[1]);
          ov.implementation = function() {
            var args = [];
            for (var i = 0; i < arguments.length; i++) {
              args.push(arguments[i] ? arguments[i].toString() : 'null');
            }
            emit('VCONSOLE.' + name + '(' + args.join(', ') + ') thread=' + threadName());
            return ov.apply(this, arguments);
          };
        } catch (inner) {
          emit('VCONSOLE.hook_error ' + spec[0] + ': ' + inner.message);
        }
      });
      send('VConsole sanity hooks installed');
    } catch (e) {
      send('VConsole hook error: ' + e.message);
    }

    hooksReady = true;
    send('=== TRANSITION QUEUE HOOKS READY ===');
  });
}

installEglFlush();
installHooks();

setInterval(function() {
  send('ALIVE frame=' + frame + ' hooksReady=' + hooksReady + ' pending=' + log.length);
  flush('heartbeat');
}, 5000);
