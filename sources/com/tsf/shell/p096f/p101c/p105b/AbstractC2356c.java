package com.tsf.shell.p096f.p101c.p105b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.c.b.c */
/* loaded from: classes.dex */
public abstract class AbstractC2356c {

    /* renamed from: b */
    private TextureElement f7728b;

    /* renamed from: c */
    private C0981k f7729c;

    /* renamed from: d */
    private TextureElement f7730d;

    /* renamed from: e */
    private C0980j f7731e;

    /* renamed from: f */
    private boolean f7732f = false;

    /* renamed from: g */
    private boolean f7733g = false;

    /* renamed from: h */
    private boolean f7734h = false;

    /* renamed from: a */
    private C0981k f7727a = C0892a.m10741a(103.0f, 149.0f);

    /* renamed from: a */
    public abstract C0980j mo5698a();

    /* renamed from: b */
    public abstract void mo5696b();

    public AbstractC2356c() {
        this.f7727a.position().f2527y = (-this.f7727a.mo10365c()) / 2.0f;
        this.f7728b = new TextureElement(0, false);
        this.f7727a.textures().addElement(this.f7728b);
        this.f7727a.alpha(0.0f);
        this.f7729c = C0892a.m10741a(69.0f, 69.0f);
        this.f7729c.alpha(0.0f);
        this.f7730d = new TextureElement(0, false);
        this.f7729c.textures().addElement(this.f7730d);
        this.f7731e = new C0980j();
        this.f7731e.addChild(this.f7729c);
        this.f7731e.addChild(this.f7727a);
    }

    /* renamed from: c */
    public C0980j m5746c() {
        return this.f7731e;
    }

    /* renamed from: d */
    public void m5745d() {
        if (!this.f7734h) {
            this.f7734h = true;
            mo5698a().addChild(this.f7731e);
            Bitmap m608a = C4189x.m608a(C1306b.C1310d.tips_gesture_finger, this.f7727a.mo10366b(), this.f7727a.mo10365c());
            C0853a.m10853g().m10540a(this.f7728b, m608a);
            m608a.recycle();
            Bitmap m608a2 = C4189x.m608a(C1306b.C1310d.tips_finger_point, this.f7727a.mo10366b(), this.f7727a.mo10365c());
            C0853a.m10853g().m10540a(this.f7730d, m608a2);
            m608a2.recycle();
        }
    }

    /* renamed from: e */
    public void m5744e() {
        this.f7734h = false;
        this.f7731e.removeFromParent();
        C0853a.m10853g().m10543a(this.f7728b);
    }

    /* renamed from: f */
    public void m5743f() {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(0);
        C1014c.m10326a(this.f7727a);
        C1014c.m10325a(this.f7727a, 300, c1017d);
    }

    /* renamed from: a */
    public void m5748a(float f, float f2) {
        this.f7731e.position().f2526x = f;
        this.f7731e.position().f2527y = f2;
        m5741h();
    }

    /* renamed from: a */
    public void m5747a(boolean z) {
        this.f7729c.scale().f2526x = 0.0f;
        this.f7729c.scale().f2527y = 0.0f;
        this.f7729c.alpha(255.0f);
        C1017d c1017d = new C1017d();
        if (z) {
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f7729c);
            C1014c.m10325a(this.f7729c, 450, c1017d);
            return;
        }
        c1017d.m10294l(2.0f);
        c1017d.m10293m(2.0f);
        c1017d.m10314a(0);
        C1014c.m10326a(this.f7729c);
        C1014c.m10325a(this.f7729c, 700, c1017d);
    }

    /* renamed from: g */
    public void m5742g() {
        C1017d c1017d = new C1017d();
        c1017d.m10294l(2.0f);
        c1017d.m10293m(2.0f);
        c1017d.m10314a(0);
        C1014c.m10326a(this.f7729c);
        C1014c.m10325a(this.f7729c, 350, c1017d);
    }

    /* renamed from: h */
    public void m5741h() {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f7727a);
        C1014c.m10325a(this.f7727a, 300, c1017d);
    }

    /* renamed from: i */
    public void m5740i() {
        this.f7732f = false;
    }

    /* renamed from: j */
    public void m5739j() {
        this.f7732f = true;
        m5737l();
    }

    /* renamed from: k */
    public void m5738k() {
        this.f7733g = false;
    }

    /* renamed from: l */
    public void m5737l() {
        if (!this.f7733g && this.f7732f) {
            this.f7733g = true;
            mo5696b();
        }
    }
}
