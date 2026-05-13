package com.tsf.shell.manager.p187r.p193c;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p047a.C1018a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3225i;
/* renamed from: com.tsf.shell.manager.r.c.g */
/* loaded from: classes.dex */
public class C3743g {
    /* renamed from: b */
    private static void m1617b(final C3112b c3112b, final Runnable runnable) {
        if (c3112b instanceof C3225i) {
            m1620a(((C3225i) c3112b).m3093q().m3082q(), c3112b);
        } else if (c3112b instanceof AbstractC3208b) {
            m1620a(((AbstractC3208b) c3112b).f10495k.textures().get(0).textureElement, c3112b);
        } else if (c3112b instanceof C3145b) {
            m1620a(((C3145b) c3112b).m3379aD(), c3112b);
        } else if (c3112b instanceof C3124a) {
            m1620a(((C3124a) c3112b).f10164h, c3112b);
        }
        c3112b.mouseEnabled(false);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.r.c.g.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
                C3359a.f11095i.m1647a(c3112b);
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        c1017d.m10292n(0.0f);
        C1014c.m10326a(c3112b);
        C1014c.m10325a(c3112b, VEasing.Back.easeIn, c1017d);
        c3112b.mo3050p_();
    }

    /* renamed from: a */
    public static void m1620a(TextureElement textureElement, C0975i c0975i) {
        if (textureElement != null && textureElement.f2529id != 0) {
            C1018a m10289a = C1018a.m10289a(textureElement);
            m10289a.position().setAllFrom(c0975i.position());
            Number3d.TEMPNUMBER3D2.reset();
            m10289a.position().setAllFrom(c0975i.localToGlobal(Number3d.TEMPNUMBER3D2));
            C3359a.f11096j.m2232a(m10289a);
        }
    }

    /* renamed from: a */
    public static void m1619a(C3112b c3112b, Runnable runnable) {
        m1617b(c3112b, runnable);
    }

    /* renamed from: a */
    public static void m1618a(final C3112b c3112b, final Runnable runnable, final Runnable runnable2) {
        if (c3112b instanceof C3145b) {
            if (((C3145b) c3112b).m3363aT()) {
                m1619a(c3112b, runnable2);
                return;
            }
            C2244e.m6019a(C1306b.C1315i.notic_delete_folder, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.g.2
                @Override // java.lang.Runnable
                public void run() {
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3743g.m1619a(C3112b.this, runnable2);
                        }
                    });
                }
            }, new Runnable() { // from class: com.tsf.shell.manager.r.c.g.3
                @Override // java.lang.Runnable
                public void run() {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
        }
    }
}
