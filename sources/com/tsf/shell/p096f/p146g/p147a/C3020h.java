package com.tsf.shell.p096f.p146g.p147a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.C2636k;
import com.tsf.shell.utils.C4168e;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.g.a.h */
/* loaded from: classes.dex */
public class C3020h extends C0980j {

    /* renamed from: b */
    private static TextureElement f9828b;

    /* renamed from: c */
    private static TextureElement f9829c;

    /* renamed from: d */
    private static C2636k f9830d;

    /* renamed from: g */
    private static TextureElement f9831g;

    /* renamed from: a */
    private C0981k f9832a;

    /* renamed from: e */
    public C0980j f9833e;

    /* renamed from: f */
    private boolean f9834f;

    /* renamed from: a */
    private static void m3827a() {
        if (f9828b == null) {
            Bitmap m692a = C4168e.m692a(true);
            f9828b = C0853a.m10853g().m10544a(m692a, false);
            m692a.recycle();
            Bitmap m692a2 = C4168e.m692a(false);
            f9829c = C0853a.m10853g().m10544a(m692a2, false);
            m692a2.recycle();
        }
    }

    /* renamed from: b */
    public static void m3825b() {
        if (f9828b != null) {
            C0853a.m10853g().m10543a(f9828b);
            C0853a.m10853g().m10543a(f9829c);
            f9828b = null;
            f9829c = null;
        }
        if (f9830d != null) {
            f9830d.m5101a();
        }
    }

    /* renamed from: c */
    public void m3824c() {
        if (f9830d == null) {
            f9830d = new C2636k();
            f9830d.position().f2526x = C0892a.m10742a(80.0f);
            f9830d.position().f2527y = C0892a.m10742a(80.0f);
        }
        this.f9834f = true;
    }

    /* renamed from: d */
    public void m3823d() {
        this.f9834f = false;
    }

    public C3020h(C0980j c0980j) {
        this.f9834f = false;
        this.f9833e = c0980j;
        c0980j.calAABB();
        c0980j.position().f2527y = 20.0f * C0892a.f2567c;
        this.f9832a = new C0981k(C3489a.f11516c, C3489a.f11516c, false);
        this.f9832a.position().f2527y = (-83.0f) * C0892a.f2567c;
        this.f9832a.useVBO(false);
        this.f9832a.textures().addElement(f9829c);
        addChild(c0980j);
        addChild(this.f9832a);
        setMouseEventListener(new C0937a(this));
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        if (this.f9834f) {
            f9830d.dispatchDraw();
        }
    }

    /* renamed from: a */
    public static C0981k m3826a(float f) {
        return new C0981k(C3566b.f11841c.f11750H * f, C3566b.f11841c.f11751I * f, false);
    }

    /* renamed from: e */
    public static int m3822e() {
        return (int) (C3566b.f11841c.f11750H * 0.9f);
    }

    /* renamed from: f */
    public static int m3821f() {
        return (int) (C3566b.f11841c.f11751I * 0.9f);
    }

    public C3020h() {
        this(m3826a(0.8f));
    }

    public C3020h(float f) {
        this(m3826a(f));
    }

    /* renamed from: g */
    public void m3820g() {
        m3827a();
        this.f9832a.textures().clear();
        this.f9832a.textures().addElement(f9828b);
    }

    /* renamed from: h */
    public void m3819h() {
        m3827a();
        this.f9832a.textures().clear();
        this.f9832a.textures().addElement(f9829c);
    }

    /* renamed from: i */
    public static TextureElement m3818i() {
        if (f9831g == null) {
            f9831g = C4189x.m593b(C1306b.C1310d.effect_icon_standard);
        }
        return f9831g;
    }

    /* renamed from: j */
    public static void m3817j() {
        if (f9831g != null) {
            C0853a.m10853g().m10543a(f9831g);
            f9831g = null;
        }
    }
}
