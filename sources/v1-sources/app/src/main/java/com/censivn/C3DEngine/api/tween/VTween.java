package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.g.s;

/* loaded from: classes.dex */
public class VTween {
    public static void to(VTweenTarget vTweenTarget, int i, VTweenParam vTweenParam) {
        if (vTweenTarget.getVirtualTarget() instanceof com.censivn.C3DEngine.g.b.a) {
            s.a((com.censivn.C3DEngine.g.b.a) vTweenTarget.getVirtualTarget(), i, vTweenParam.vTarget);
        }
    }

    public static void killTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof com.censivn.C3DEngine.g.b.a) {
            s.a((com.censivn.C3DEngine.g.b.a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void pauseTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof com.censivn.C3DEngine.g.b.a) {
            s.b((com.censivn.C3DEngine.g.b.a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void resumeTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof com.censivn.C3DEngine.g.b.a) {
            s.c((com.censivn.C3DEngine.g.b.a) vTweenTarget.getVirtualTarget());
        }
    }
}
