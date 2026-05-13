package com.tsf.shell.p096f.p131f.p132a;

import android.opengl.GLES20;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p038f.C0974h;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2775c;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2780d;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2786f;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2792i;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2799k;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2812m;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.f */
/* loaded from: classes.dex */
public class C2843f extends C0980j implements C0915b.InterfaceC0918a {

    /* renamed from: a */
    public static float f9233a;

    /* renamed from: b */
    public static float f9234b;

    /* renamed from: c */
    public static float f9235c;

    /* renamed from: d */
    public static float f9236d;

    /* renamed from: e */
    private C2862h f9237e;

    /* renamed from: f */
    private C2792i f9238f;

    /* renamed from: h */
    private C2792i f9240h;

    /* renamed from: i */
    private C2792i f9241i;

    /* renamed from: j */
    private C2792i f9242j;

    /* renamed from: k */
    private C2786f f9243k;

    /* renamed from: l */
    private C2799k f9244l;

    /* renamed from: q */
    private boolean f9249q = false;

    /* renamed from: r */
    private C1013b f9250r = new C1013b();

    /* renamed from: g */
    private ArrayList<C2792i> f9239g = new ArrayList<>();

    /* renamed from: m */
    private C0980j f9245m = new C0980j();

    /* renamed from: n */
    private C0980j f9246n = new C0980j();

    /* renamed from: o */
    private C0980j f9247o = new C0980j();

    /* renamed from: p */
    private C0974h f9248p = new C0974h(C0892a.f2553D, C2862h.f9293F * 2.0f, false, true) { // from class: com.tsf.shell.f.f.a.f.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0974h, com.censivn.C3DEngine.p031b.p038f.C0975i
        public void draw() {
            C0853a.m10855e().m10774a(this);
            updateTextureState();
            ShaderColor shaderColor = ShaderManager.SHADER_COLOR;
            ShaderManager.enableShader(shaderColor);
            float alpha = (alpha() / 255.0f) * 0.7f;
            vertices().colors().set(2, 0.0f, 0.0f, 0.0f, 0.0f);
            vertices().colors().set(3, 0.0f, 0.0f, 0.0f, 0.0f);
            vertices().colors().set(0, 0.0f, 0.0f, 0.0f, alpha);
            vertices().colors().set(1, 0.0f, 0.0f, 0.0f, alpha);
            vertices().colors().buffer().position(0);
            GLES20.glEnableVertexAttribArray(shaderColor.maColor4Handle);
            GLES20.glVertexAttribPointer(shaderColor.maColor4Handle, 4, 5126, false, 0, (Buffer) vertices().colors().buffer());
            if (doubleSidedEnabled()) {
                GLES20.glDisable(2884);
            } else {
                GLES20.glEnable(2884);
            }
            drawMVPMatrix();
            drawElement();
            GLES20.glDisableVertexAttribArray(shaderColor.maColor4Handle);
            m10374a();
        }
    };

    /* renamed from: a */
    public void m4554a(int i) {
        switch (i) {
            case 0:
                m4551a(this.f9240h, true);
                return;
            case 1:
                m4545b(this.f9241i);
                return;
            case 2:
                m4545b(this.f9242j);
                return;
            case 3:
                m4545b(this.f9243k);
                return;
            case 4:
                m4545b(this.f9244l);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m4555a() {
        if (this.f9244l != null) {
            this.f9244l.m4635c();
        }
    }

    /* renamed from: b */
    public C2792i m4546b() {
        return this.f9240h;
    }

    /* renamed from: c */
    public C2792i m4541c() {
        return this.f9238f;
    }

    public C2843f(C2862h c2862h) {
        this.f9237e = c2862h;
        this.f9248p.moveAllPointsPX(0.0f, (C2862h.f9293F * 2.0f) / 2.0f, 0.0f);
        this.f9248p.alpha(0.0f);
        this.f9248p.position().f2527y = -C0892a.f2560K;
        this.f9245m.addChild(this.f9248p);
        this.f9245m.addChild(this.f9247o);
        this.f9245m.addChild(this.f9246n);
        m4532g();
    }

    /* renamed from: a */
    public void m4553a(int i, int i2, int i3, int i4) {
        m4532g();
    }

    /* renamed from: d */
    public C2786f m4538d() {
        return this.f9243k;
    }

    /* renamed from: e */
    public void m4535e() {
        final float alpha = this.f9246n.alpha();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.f.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C2843f.this.f9246n.alpha(alpha + ((0.0f - alpha) * f));
            }
        };
        this.f9246n.mouseEnabled(false);
        C1014c.m10326a(this.f9250r);
        C1014c.m10325a(this.f9250r, VEasing.Linear.easeNone, c1017d);
    }

    /* renamed from: f */
    public void m4533f() {
        final float alpha = this.f9246n.alpha();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.f.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C2843f.this.f9246n.alpha(alpha + ((255.0f - alpha) * f));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2843f.this.f9246n.mouseEnabled(true);
            }
        };
        C1014c.m10326a(this.f9250r);
        C1014c.m10325a(this.f9250r, VEasing.Linear.easeNone, c1017d);
    }

    /* renamed from: g */
    public void m4532g() {
        f9234b = 90.0f * C0892a.f2567c;
        f9233a = C2862h.f9293F - (120.0f * C0892a.f2567c);
        position().f2527y = C0892a.f2552C;
        this.f9248p.m10373a(C0892a.f2553D);
        Iterator<C2792i> it = this.f9239g.iterator();
        while (it.hasNext()) {
            it.next().mo4616a(C0892a.f2590z, C0892a.f2552C, C0892a.f2550A, C0892a.f2551B);
        }
    }

    /* renamed from: h */
    public C0980j m4531h() {
        return this.f9247o;
    }

    /* renamed from: i */
    public void m4530i() {
        this.f9246n.position().f2527y = (-C2862h.f9293F) / 2.0f;
        this.f9240h = new C2775c(this.f9237e, this);
        this.f9241i = new C2780d(this.f9237e, this);
        this.f9242j = new C2812m(this.f9237e, this);
        this.f9243k = new C2786f(this.f9237e, this);
        this.f9244l = new C2799k(this.f9237e, this);
        this.f9239g.add(this.f9241i);
        this.f9239g.add(this.f9242j);
        this.f9239g.add(this.f9243k);
        this.f9239g.add(this.f9240h);
        this.f9239g.add(this.f9244l);
        position().f2527y = C0892a.f2552C;
        f9236d = 200.0f * C0892a.f2567c;
        f9235c = ((-f9236d) * (this.f9239g.size() - 1)) / 2.0f;
    }

    /* renamed from: j */
    public void m4529j() {
        m4525n();
    }

    /* renamed from: k */
    public void m4528k() {
        m4524o();
    }

    /* renamed from: n */
    private void m4525n() {
        this.f9245m.removeFromParent();
        addChild(this.f9245m);
        final float alpha = this.f9246n.alpha();
        final float f = this.f9246n.position().f2527y;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.f.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                C2843f.this.f9246n.alpha(alpha + ((255.0f - alpha) * f2));
                if (!C2843f.this.f9249q) {
                    C2843f.this.f9246n.position().f2527y = f + (((C2862h.f9293F / 2.0f) - f) * f2);
                }
            }
        };
        c1017d.m10313a(C0986a.f2959n);
        C1014c.m10326a(this.f9250r);
        C1014c.m10325a(this.f9250r, 800, c1017d);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(255);
        c1017d2.m10313a(C0986a.f2959n);
        C1014c.m10326a(this.f9248p);
        C1014c.m10325a(this.f9248p, 800, c1017d2);
        float f2 = f9235c;
        if (this.f9246n.numChildren() == 0) {
            Iterator<C2792i> it = this.f9239g.iterator();
            while (true) {
                float f3 = f2;
                if (!it.hasNext()) {
                    break;
                }
                C0962a m4648e = it.next().m4648e();
                m4648e.position().f2526x = f3;
                m4648e.removeFromParent();
                this.f9246n.addChild(m4648e);
                f2 = f9236d + f3;
            }
        }
        Iterator<C2792i> it2 = this.f9239g.iterator();
        while (it2.hasNext()) {
            it2.next().mo4633n();
        }
    }

    /* renamed from: l */
    public boolean m4527l() {
        return (this.f9238f == null ? true : this.f9238f.m4640l()) && this.f9237e.m4452ao().m4803g();
    }

    /* renamed from: o */
    private void m4524o() {
        m4526m();
        final float alpha = this.f9246n.alpha();
        final float f = this.f9246n.position().f2527y;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.f.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                C2843f.this.f9246n.alpha(alpha + ((0.0f - alpha) * f2));
                C2843f.this.f9246n.position().f2527y = f + ((((-C2862h.f9293F) / 2.0f) - f) * f2);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2843f.this.f9245m.removeFromParent();
                Iterator it = C2843f.this.f9239g.iterator();
                while (it.hasNext()) {
                    ((C2792i) it.next()).mo4632p();
                }
            }
        };
        C1014c.m10326a(this.f9250r);
        C1014c.m10325a(this.f9250r, VEasing.Linear.easeNone, c1017d);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(0);
        C1014c.m10326a(this.f9248p);
        C1014c.m10325a(this.f9248p, VEasing.Linear.easeNone, c1017d2);
        Iterator<C2792i> it = this.f9239g.iterator();
        while (it.hasNext()) {
            it.next().m4638o();
        }
    }

    /* renamed from: m */
    public void m4526m() {
        if (this.f9238f != null && this.f9238f.m4640l()) {
            m4522q();
            this.f9238f.m4643i();
            this.f9238f = null;
        }
    }

    /* renamed from: p */
    private void m4523p() {
        if (!this.f9249q) {
            this.f9249q = true;
            C0915b.m10597a(this);
            Iterator<C2792i> it = this.f9239g.iterator();
            while (it.hasNext()) {
                C2792i next = it.next();
                next.m4645g();
                next.m4641k();
            }
            C1017d c1017d = new C1017d();
            c1017d.mo10298h(C2862h.f9293F - f9234b);
            c1017d.m10294l(0.6f);
            c1017d.m10293m(0.6f);
            C1014c.m10326a(this.f9246n);
            C1014c.m10325a(this.f9246n, VEasing.Linear.easeNone, c1017d);
        }
    }

    /* renamed from: q */
    private void m4522q() {
        if (this.f9249q) {
            this.f9249q = false;
            C0915b.m10594b(this);
            Iterator<C2792i> it = this.f9239g.iterator();
            while (it.hasNext()) {
                C2792i next = it.next();
                next.m4646f();
                next.m4642j();
            }
            C1017d c1017d = new C1017d();
            c1017d.mo10298h(C2862h.f9293F / 2.0f);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10314a(255);
            this.f9246n.mouseEnabled(true);
            C1014c.m10326a(this.f9246n);
            C1014c.m10325a(this.f9246n, VEasing.Linear.easeNone, c1017d);
        }
    }

    /* renamed from: b */
    private boolean m4545b(C2792i c2792i) {
        return m4551a(c2792i, false);
    }

    /* renamed from: a */
    private boolean m4551a(C2792i c2792i, boolean z) {
        if (c2792i != this.f9238f) {
            m4523p();
            if (this.f9238f != null) {
                this.f9238f.m4643i();
                this.f9238f.m4641k();
            }
            this.f9238f = c2792i;
            this.f9238f.m4650c(z);
            if (z) {
                this.f9238f.m4644h();
            }
            this.f9238f.m4642j();
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4552a(C2792i c2792i) {
        return m4551a(c2792i, true);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m4526m();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: a */
    public void m4549a(C3231c c3231c, MotionEvent motionEvent) {
        if (this.f9238f != null) {
            this.f9238f.mo4659a(c3231c, motionEvent);
        }
    }

    /* renamed from: b */
    public void m4543b(C3231c c3231c, MotionEvent motionEvent) {
        if (this.f9238f != null) {
            this.f9238f.mo4654b(c3231c, motionEvent);
        }
    }

    /* renamed from: c */
    public void m4539c(C3231c c3231c, MotionEvent motionEvent) {
        this.f9240h.mo4651c(c3231c, motionEvent);
        if (this.f9238f != this.f9240h && this.f9238f != this.f9243k) {
            m4545b(this.f9240h);
        }
    }

    /* renamed from: d */
    public void m4536d(C3231c c3231c, MotionEvent motionEvent) {
        if (this.f9238f == null) {
            m4545b(this.f9240h);
        }
        if (this.f9238f != null) {
            this.f9238f.mo4649d(c3231c, motionEvent);
        }
    }

    /* renamed from: a */
    public void m4548a(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.f9238f != null) {
            this.f9238f.mo4658a(c3231c, motionEvent, motionEvent2);
        }
    }

    /* renamed from: a */
    public void m4547a(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f9238f != null) {
            this.f9238f.mo4657a(c3231c, motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: b */
    public void m4542b(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f9238f != null) {
            this.f9238f.mo4653b(c3231c, motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: e */
    public void m4534e(C3231c c3231c, MotionEvent motionEvent) {
        if (c3231c instanceof C3145b) {
            ((C3145b) c3231c).m3365aR();
        } else if (this.f9238f != this.f9243k && this.f9238f != this.f9240h) {
            this.f9240h.mo4647e(c3231c, motionEvent);
            m4545b(this.f9240h);
        } else if (this.f9238f != null) {
            this.f9238f.mo4647e(c3231c, motionEvent);
        }
    }
}
