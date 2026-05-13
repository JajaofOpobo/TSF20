package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
/* loaded from: classes.dex */
public class VTween {
    /* renamed from: to */
    public static void m10747to(VTweenTarget vTweenTarget, int i, VTweenParam vTweenParam) {
        if (vTweenTarget.getVirtualTarget() instanceof InterfaceC1012a) {
            C1014c.m10325a((InterfaceC1012a) vTweenTarget.getVirtualTarget(), i, vTweenParam.vTarget);
        }
    }

    public static void killTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof InterfaceC1012a) {
            C1014c.m10326a((InterfaceC1012a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void pauseTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof InterfaceC1012a) {
            C1014c.m10322b((InterfaceC1012a) vTweenTarget.getVirtualTarget());
        }
    }

    public static void resumeTween(VTweenTarget vTweenTarget) {
        if (vTweenTarget.getVirtualTarget() instanceof InterfaceC1012a) {
            C1014c.m10319c((InterfaceC1012a) vTweenTarget.getVirtualTarget());
        }
    }
}
