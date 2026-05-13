package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
/* renamed from: com.tsf.shell.f.f.h */
/* loaded from: classes.dex */
public class C2939h {

    /* renamed from: a */
    public static C0967a f9561a;

    /* renamed from: g */
    private static C0925e.InterfaceC0934a f9567g;

    /* renamed from: d */
    private static TextureElement f9564d = null;

    /* renamed from: e */
    private static boolean f9565e = true;

    /* renamed from: f */
    private static boolean f9566f = false;

    /* renamed from: b */
    public static int f9562b = (int) C0892a.m10742a(182.0f);

    /* renamed from: c */
    public static int f9563c = (int) C0892a.m10742a(30.0f);

    /* renamed from: a */
    public static void m4172a() {
        f9565e = C3430e.m2409y();
        TextureElement m4169b = m4169b();
        f9561a = new C0967a(C0892a.f2555F, C0892a.f2556G, 1.0f, new C0968b(f9563c, f9562b - f9563c, f9563c, f9562b - f9563c, m4169b.width, m4169b.height));
        f9561a.m10389b(C0892a.f2555F, C0892a.f2556G);
        f9561a.mo5000c(C0892a.f2551B);
        f9561a.textures().addElement(m4169b);
        f9567g = new C2940a();
        C3359a.f11088b.m10565a(f9567g);
    }

    /* renamed from: a */
    public static void m4171a(int i, int i2, int i3, int i4) {
        f9561a.m10389b(C0892a.f2555F, C0892a.f2556G);
        f9561a.mo5000c(C0892a.f2551B);
    }

    /* renamed from: b */
    public static TextureElement m4169b() {
        if (f9564d == null) {
            f9564d = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_FRAME_BACKGROUND, f9562b, f9562b);
        }
        return f9564d;
    }

    /* renamed from: a */
    public static void m4170a(boolean z) {
        f9566f = z;
    }

    /* renamed from: c */
    public static boolean m4167c() {
        return f9565e && !f9566f;
    }

    /* renamed from: b */
    public static void m4168b(boolean z) {
        f9565e = z;
    }

    /* renamed from: d */
    public static void m4166d() {
        C3430e.m2467f(f9565e);
    }

    /* renamed from: com.tsf.shell.f.f.h$a */
    /* loaded from: classes.dex */
    static class C2940a implements C0925e.InterfaceC0934a {
        C2940a() {
        }

        @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
        /* renamed from: a */
        public void mo1664a(int i, int i2, int i3, int i4) {
            C2939h.m4171a(i, i2, i3, i4);
        }
    }
}
