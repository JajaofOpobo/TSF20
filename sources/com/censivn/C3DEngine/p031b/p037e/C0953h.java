package com.censivn.C3DEngine.p031b.p037e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.e.h */
/* loaded from: classes.dex */
public class C0953h extends AbstractC0951f {

    /* renamed from: b */
    private C0980j f2782b;

    /* renamed from: d */
    private C0984m f2783d;

    /* renamed from: e */
    private C0984m f2784e;

    /* renamed from: f */
    private C0984m f2785f;

    /* renamed from: g */
    private C0981k f2786g;

    /* renamed from: h */
    private C0981k f2787h;

    /* renamed from: i */
    private float f2788i;

    /* renamed from: j */
    private C0980j f2789j;

    /* renamed from: k */
    private C0981k f2790k;

    /* renamed from: l */
    private TextureElement f2791l;

    /* renamed from: s */
    private C0955a f2798s;

    /* renamed from: a */
    public float f2781a = 0.1f;

    /* renamed from: m */
    private int f2792m = 0;

    /* renamed from: n */
    private int f2793n = 100;

    /* renamed from: o */
    private int f2794o = 0;

    /* renamed from: p */
    private float f2795p = 0.0f;

    /* renamed from: q */
    private float f2796q = 0.0f;

    /* renamed from: r */
    private boolean f2797r = false;

    /* renamed from: t */
    private boolean f2799t = true;

    /* renamed from: u */
    private boolean f2800u = false;

    /* renamed from: v */
    private float f2801v = 0.0f;

    /* renamed from: com.censivn.C3DEngine.b.e.h$a */
    /* loaded from: classes.dex */
    public static class C0955a {
        /* renamed from: a */
        public boolean mo733a(int i) {
            return true;
        }

        /* renamed from: a */
        public void mo734a() {
        }
    }

    public C0953h() {
        m10466m();
    }

    /* renamed from: a */
    public void m10484a(C0955a c0955a) {
        this.f2798s = c0955a;
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        if (this.f2799t) {
            mo866f(this.f2794o);
            this.f2799t = false;
        }
        if (this.f2791l.f2529id == 0) {
            Bitmap m638b = C4181q.m638b(30.0f, -1);
            C0853a.m10853g().m10540a(this.f2791l, m638b);
            m638b.recycle();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        C0853a.m10853g().m10543a(this.f2791l);
        this.f2783d.m10358a();
        this.f2784e.m10358a();
        if (this.f2785f != null) {
            this.f2785f.m10358a();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: i */
    public void mo821i() {
        super.mo821i();
        this.f2790k.visible(false);
        if (this.f2785f != null) {
            this.f2785f.alpha(100.0f);
        }
        this.f2782b.alpha(100.0f);
        this.f2789j.alpha(100.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: j */
    public void mo820j() {
        super.mo820j();
        this.f2790k.visible(true);
        if (this.f2785f != null) {
            this.f2785f.alpha(255.0f);
        }
        this.f2782b.alpha(255.0f);
        this.f2789j.alpha(255.0f);
    }

    /* renamed from: m */
    private void m10466m() {
        m10628a(1);
        this.f2782b = new C0980j();
        this.f2783d = new C0984m();
        this.f2783d.m10356a(1);
        this.f2783d.m10352b(1);
        this.f2783d.m10347d(50);
        this.f2782b.addChild(this.f2783d);
        this.f2784e = new C0984m();
        this.f2784e.m10356a(1);
        this.f2784e.m10352b(2);
        this.f2784e.m10347d(50);
        this.f2784e.m10353b();
        this.f2782b.addChild(this.f2784e);
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(15.0f);
        c0907b.f2663i = this.f2784e.minY();
        c0907b.f2665k = this.f2784e.maxY();
        this.f2782b.setLayoutParams(c0907b);
        addChild(this.f2782b);
        this.f2789j = new C0980j();
        this.f2786g = new C0981k(0.0f, C0892a.m10742a(10.0f), false);
        this.f2786g.setDefaultColor(new Color4(255, 255, 255, (int) VEasing.Back.easeIn));
        this.f2787h = new C0981k(0.0f, C0892a.m10742a(10.0f), false);
        this.f2787h.setDefaultColor(new Color4(255, 255, 255, 100));
        this.f2789j.addChild(this.f2786g);
        this.f2789j.addChild(this.f2787h);
        C0907b c0907b2 = new C0907b();
        c0907b2.f2655a = C0892a.m10742a(70.0f);
        c0907b2.f2656b = C0892a.m10742a(60.0f);
        c0907b2.f2663i = (-C0892a.m10742a(10.0f)) / 2.0f;
        c0907b2.f2665k = C0892a.m10742a(10.0f) / 2.0f;
        this.f2789j.setLayoutParams(c0907b2);
        this.f2790k = C0892a.m10741a(60.0f, 60.0f);
        this.f2790k.calAABB(2.0f, 2.0f, 2.0f);
        this.f2791l = new TextureElement(0, false);
        this.f2790k.textures().addElement(this.f2791l);
        this.f2790k.setMouseEventListener(new C0937a(this.f2790k) { // from class: com.censivn.C3DEngine.b.e.h.1

            /* renamed from: b */
            private float f2803b;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f2803b = C0953h.this.f2796q;
                C0953h.this.f2790k.setAnimationObjectState(true);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C0953h.this.f2781a = 0.1f;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C0953h.this.f2800u = true;
                C0953h.this.f2781a = 0.3f;
                float x = (motionEvent2.getX() - motionEvent.getX()) / C0953h.this.f2788i;
                C0953h.this.f2796q = x + this.f2803b;
                C0953h.this.f2796q = (((int) (C0953h.this.f2792m + ((C0953h.this.f2793n - C0953h.this.f2792m) * C0953h.this.f2796q))) - C0953h.this.f2792m) / (C0953h.this.f2793n - C0953h.this.f2792m);
                if (C0953h.this.f2796q < 0.0f) {
                    C0953h.this.f2796q = 0.0f;
                } else if (C0953h.this.f2796q > 1.0f) {
                    C0953h.this.f2796q = 1.0f;
                }
            }
        });
        this.f2789j.addChild(this.f2790k);
        addChild(this.f2789j);
    }

    /* renamed from: g */
    public void m10472g(int i) {
        m10479b(C4189x.m588c(i));
    }

    /* renamed from: b */
    public void m10479b(String str) {
        this.f2783d.m10355a(str);
    }

    /* renamed from: h */
    public void m10470h(int i) {
        m10477c(C4189x.m588c(i));
    }

    /* renamed from: c */
    public void m10477c(String str) {
        if (this.f2785f == null) {
            this.f2785f = new C0984m();
            this.f2785f.m10354a(true);
            this.f2785f.m10356a(1);
            this.f2785f.m10352b(1);
            this.f2785f.setLayoutParams(new C0907b());
            this.f2785f.m10347d(38);
            this.f2785f.position().f2526x = (-m10629a()) / 2.0f;
            this.f2785f.m10345e(-5592406);
            addChildAt(this.f2785f, 1);
        }
        this.f2785f.m10355a(str);
        m10465n();
        mo4847d();
    }

    /* renamed from: n */
    private void m10465n() {
        if (this.f2785f != null) {
            this.f2785f.m10353b();
            C0907b layoutParams = this.f2785f.getLayoutParams();
            layoutParams.f2662h = this.f2785f.minX();
            layoutParams.f2664j = this.f2785f.maxX();
            layoutParams.f2663i = this.f2785f.minY();
            layoutParams.f2665k = this.f2785f.maxY();
        }
    }

    /* renamed from: d */
    public void m10475d(String str) {
        this.f2784e.m10355a(str);
    }

    /* renamed from: a */
    public void m10486a(float f) {
        this.f2801v = f / 2.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        int i2 = (int) (i - (this.f2801v * 2.0f));
        if (this.f2783d != null) {
            this.f2783d.position().f2526x = ((-i2) / 2.0f) + this.f2801v;
        }
        if (this.f2785f != null) {
            this.f2785f.m10344f(i2);
            this.f2785f.position().f2526x = ((-i2) / 2.0f) + this.f2801v;
            m10465n();
        }
        if (this.f2784e != null) {
            this.f2784e.position().f2526x = (i2 / 2.0f) + this.f2801v;
        }
        this.f2788i = i2 * 0.8f;
        if (this.f2786g != null) {
            this.f2786g.position().f2526x = ((-this.f2788i) / 2.0f) + this.f2801v;
        }
        if (this.f2787h != null) {
            this.f2787h.position().f2526x = (this.f2788i / 2.0f) + this.f2801v;
        }
        m10471h();
    }

    /* renamed from: i */
    public void m10469i(int i) {
        this.f2792m = i;
    }

    /* renamed from: j */
    public void m10468j(int i) {
        this.f2793n = i;
    }

    /* renamed from: e */
    public int m10474e() {
        return this.f2794o;
    }

    /* renamed from: k */
    public void mo865k(int i) {
        m10485a(i, false);
    }

    /* renamed from: a */
    public void m10485a(int i, boolean z) {
        if (this.f2794o != i) {
            this.f2794o = i;
            if (z) {
                this.f2796q = (i - this.f2792m) / (this.f2793n - this.f2792m);
                return;
            }
            float f = (i - this.f2792m) / (this.f2793n - this.f2792m);
            this.f2795p = f;
            this.f2796q = f;
            m10471h();
            mo866f(this.f2794o);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f2796q != this.f2795p || this.f2797r || this.f2790k.getAnimationObjectState()) {
            if (this.f2797r) {
                this.f2797r = false;
            }
            this.f2795p += (this.f2796q - this.f2795p) * this.f2781a;
            if (Math.abs(this.f2796q - this.f2795p) < 0.005f) {
                this.f2795p = this.f2796q;
            }
            invalidate();
            m10471h();
            int i = (int) (this.f2792m + ((this.f2793n - this.f2792m) * this.f2795p));
            if (i != this.f2794o) {
                this.f2794o = i;
                if (this.f2800u) {
                    this.f2800u = false;
                    if (this.f2798s != null) {
                        this.f2798s.mo734a();
                    }
                }
                m10467l(this.f2794o);
            }
        }
    }

    /* renamed from: l */
    private void m10467l(int i) {
        if (this.f2798s != null) {
            this.f2798s.mo733a(i);
        }
        mo866f(this.f2794o);
    }

    /* renamed from: f */
    public void mo866f(int i) {
    }

    /* renamed from: h */
    public void m10471h() {
        float f = this.f2795p * this.f2788i;
        this.f2786g.points().pxX(0, f);
        this.f2786g.points().pxX(2, f);
        this.f2786g.updatePointsVBO();
        float f2 = (1.0f - this.f2795p) * this.f2788i;
        this.f2787h.points().pxX(1, -f2);
        this.f2787h.points().pxX(3, -f2);
        this.f2787h.updatePointsVBO();
        this.f2790k.position().f2526x = ((-this.f2788i) / 2.0f) + (this.f2795p * this.f2788i) + this.f2801v;
    }
}
