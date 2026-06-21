package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.b.g.b.a;
import com.censivn.C3DEngine.b.g.w;

/* loaded from: classes.dex */
public class VTween {
    public static void to(VTweenTarget vTweenTarget, int i, VTweenParam vTweenParam) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            w.a((a) vTweenTarget.getVirtualTarget(), i, vTweenParam.vTarget);
        }
    }

    public static void killTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            w.a((a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void pauseTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            w.b((a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void resumeTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            w.c((a) vTweenTarget.getVirtualTarget());
        }
    }
}
