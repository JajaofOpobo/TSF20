package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.b.g.b.a;
import com.censivn.C3DEngine.b.g.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VTween {
    public static void to(VTweenTarget vTweenTarget, int i, VTweenParam vTweenParam) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            c.a((a) vTweenTarget.getVirtualTarget(), i, vTweenParam.vTarget);
        }
    }

    public static void killTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            c.a((a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void pauseTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            c.b((a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void resumeTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof a) {
            c.c((a) vTweenTarget.getVirtualTarget());
        }
    }
}
