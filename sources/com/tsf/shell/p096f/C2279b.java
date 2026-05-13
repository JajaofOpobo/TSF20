package com.tsf.shell.p096f;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p187r.p193c.C3702b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.b */
/* loaded from: classes.dex */
public class C2279b {

    /* renamed from: a */
    private static int f7442a = 0;

    /* renamed from: b */
    private static TextureElement f7443b;

    /* renamed from: b */
    static /* synthetic */ int m5961b() {
        int i = f7442a;
        f7442a = i - 1;
        return i;
    }

    /* renamed from: a */
    public static void m5964a() {
        if (C3702b.f12209a && f7442a < 6) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C2279b.m5962a(true);
                    C2279b.m5962a(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5962a(boolean z) {
        f7442a++;
        final ArrayList arrayList = new ArrayList();
        if (f7443b == null) {
            f7443b = C4189x.m593b(C1306b.C1310d.snowflake);
        }
        float f = 100.0f * C0892a.f2567c;
        for (int i = 0; i < 20; i++) {
            C2283a c2283a = new C2283a();
            c2283a.f7448a = (float) (0.2d + (Math.random() * 0.800000011920929d));
            if (c2283a.f7448a < 0.5d) {
                c2283a.f7450c = c2283a.f7448a * 10.0f;
            } else {
                c2283a.f7450c = c2283a.f7448a * 5.0f;
            }
            float f2 = c2283a.f7448a * f;
            c2283a.f7454g = (float) (C0892a.f2551B + f2 + ((C0892a.f2554E / 3) * Math.random()));
            c2283a.f7453f = ((C0892a.f2552C - f2) - C0892a.f2560K) - (100.0f * C0892a.f2567c);
            c2283a.f7452e = m5958e();
            c2283a.f7455h = 3.141592653589793d * Math.random() * 2.0d;
            c2283a.f7456i = 0.05235987755982989d;
            c2283a.f7451d = 40.0f * C0892a.f2567c * c2283a.f7448a;
            arrayList.add(c2283a);
        }
        final int size = arrayList.size();
        C0962a c0962a = new C0962a(size, 100, 300, 100) { // from class: com.tsf.shell.f.b.2
            @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                boolean z2 = true;
                for (int i2 = 0; i2 < size; i2++) {
                    C2283a c2283a2 = (C2283a) arrayList.get(i2);
                    C0964b a = m10456a(i2);
                    if (a.m10407i().f2527y >= c2283a2.f7453f) {
                        a.m10407i().f2527y -= c2283a2.f7450c;
                        a.m10407i().f2526x = c2283a2.f7452e + ((float) (Math.sin(c2283a2.f7455h) * c2283a2.f7451d));
                        c2283a2.f7455h += c2283a2.f7456i;
                        a.m10411f();
                        z2 = false;
                    }
                }
                updatePointsVBO();
                if (z2) {
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            this.removeFromParent();
                            C2279b.m5961b();
                            if (C2279b.f7442a == 0) {
                                C0853a.m10853g().m10543a(C2279b.f7443b);
                                TextureElement unused = C2279b.f7443b = null;
                            }
                        }
                    });
                }
            }
        };
        c0962a.useVBO(false);
        c0962a.setAnimationObjectState(true);
        c0962a.textures().addElement(f7443b);
        for (int i2 = 0; i2 < size; i2++) {
            C2283a c2283a2 = (C2283a) arrayList.get(i2);
            C0964b m10456a = c0962a.m10456a(i2);
            m10456a.m10407i().f2526x = c2283a2.f7452e;
            m10456a.f2853m.f2527y = c2283a2.f7454g;
            m10456a.m10438a(0, 0, 1, 1, f, f);
            if (c2283a2.f7448a <= 0.7d) {
                if (c2283a2.f7448a > 0.45d) {
                    m10456a.m10438a(1, 0, 1, 1, f, f);
                } else {
                    m10456a.m10438a(2, 0, 1, 1, f, f);
                }
            }
            m10456a.m10405k().setAll(c2283a2.f7448a * 0.7f, c2283a2.f7448a * 0.7f, 0.0f);
            m10456a.m10408h();
        }
        if (z) {
            C3359a.f11092f.m1579g().addChild(c0962a);
        } else {
            C3359a.f11096j.m2232a(c0962a);
        }
    }

    /* renamed from: e */
    private static float m5958e() {
        return (float) ((Math.random() * C0892a.f2555F) + C0892a.f2590z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.b$a */
    /* loaded from: classes.dex */
    public static class C2283a {

        /* renamed from: d */
        float f7451d;

        /* renamed from: e */
        float f7452e;

        /* renamed from: f */
        float f7453f;

        /* renamed from: g */
        float f7454g;

        /* renamed from: i */
        double f7456i;

        /* renamed from: a */
        float f7448a = 1.0f;

        /* renamed from: b */
        float f7449b = 1.0f;

        /* renamed from: c */
        float f7450c = 1.0f;

        /* renamed from: h */
        double f7455h = 0.0d;

        C2283a() {
        }
    }
}
