package com.tsf.shell.manager.p183o;

import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p183o.p184a.C3562b;
import com.tsf.shell.manager.p183o.p184a.C3563c;
/* renamed from: com.tsf.shell.manager.o.b */
/* loaded from: classes.dex */
public class C3566b {

    /* renamed from: a */
    public static C3560a f11839a;

    /* renamed from: b */
    public static C3560a f11840b;

    /* renamed from: c */
    public static C3560a f11841c;

    /* renamed from: a */
    public static void m1974a() {
        f11839a = new C3560a(m1972b(), 1.15f);
        f11841c = new C3560a(1.15f, 1.15f);
        f11840b = new C3560a(1.0f, 1.0f, 144, 144, 215, 42, 0);
        C3563c.C3564a c3564a = new C3563c.C3564a();
        c3564a.f11838g = 30;
        f11840b.f11771ab = new C3562b(0, c3564a);
        C3563c.m1983a();
    }

    /* renamed from: b */
    public static float m1972b() {
        return m1971b(C3430e.m2563I());
    }

    /* renamed from: c */
    public static void m1970c() {
        C3430e.m2475e(1.15f);
    }

    /* renamed from: a */
    public static void m1973a(float f) {
        C3430e.m2475e(m1971b(f));
    }

    /* renamed from: b */
    public static float m1971b(float f) {
        if (f < 0.7f) {
            return 0.7f;
        }
        if (f > 1.9f) {
            return 1.9f;
        }
        return f;
    }
}
