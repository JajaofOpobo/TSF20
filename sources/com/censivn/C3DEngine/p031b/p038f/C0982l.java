package com.censivn.C3DEngine.p031b.p038f;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
/* renamed from: com.censivn.C3DEngine.b.f.l */
/* loaded from: classes.dex */
public class C0982l extends C0980j {

    /* renamed from: a */
    private C0984m f2929a;

    /* renamed from: b */
    private C0981k f2930b;

    /* renamed from: c */
    private Color4 f2931c = new Color4();

    /* renamed from: d */
    private int f2932d;

    /* renamed from: e */
    private int f2933e;

    public C0982l(float f, float f2, int i, int i2) {
        this.f2930b = new C0981k(f, f2, false);
        this.f2930b.setDefaultColor(this.f2931c);
        this.f2932d = i;
        this.f2933e = i2;
        this.f2931c.set(this.f2932d);
        this.f2930b.setMouseEventListener(new C0937a(this.f2930b) { // from class: com.censivn.C3DEngine.b.f.l.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C0982l.this.mo2165a();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C0982l.this.mo2164b();
                C0982l.this.f2931c.set(C0982l.this.f2933e);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C0982l.this.mo2163c();
                C0982l.this.f2931c.set(C0982l.this.f2932d);
            }
        });
        this.f2930b.calAABB();
        this.f2929a = new C0984m();
        addChild(this.f2930b);
        addChild(this.f2929a);
    }

    /* renamed from: a */
    public void m10364a(int i) {
        this.f2929a.m10349c(i);
    }

    /* renamed from: b */
    public void m10362b(int i) {
        this.f2929a.m10347d(i);
    }

    /* renamed from: a */
    public void mo2165a() {
    }

    /* renamed from: b */
    public void mo2164b() {
    }

    /* renamed from: c */
    public void mo2163c() {
    }

    /* renamed from: d */
    public void m10359d() {
        this.f2929a.m10358a();
    }
}
