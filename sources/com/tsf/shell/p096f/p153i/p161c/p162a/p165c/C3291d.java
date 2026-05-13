package com.tsf.shell.p096f.p153i.p161c.p162a.p165c;

import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.i.c.a.c.d */
/* loaded from: classes.dex */
public class C3291d extends C0981k {

    /* renamed from: a */
    private float f10861a;

    /* renamed from: d */
    private float f10862d;

    /* renamed from: e */
    private float f10863e;

    /* renamed from: f */
    private float f10864f;

    public C3291d(float f, float f2) {
        super(f, f2);
        this.f10861a = 0.0f;
        this.f10862d = 0.0f;
        this.f10863e = 0.0f;
        this.f10864f = 0.0f;
        m2917b(f, f2);
    }

    /* renamed from: b */
    public void m2917b(float f, float f2) {
        this.f10861a = f2;
        this.f10862d = f;
        this.f10864f = f2 / 2.0f;
        this.f10863e = f / 2.0f;
        points().setPX(0, this.f10863e, -this.f10864f, 0.0f);
        points().setPX(1, -this.f10863e, -this.f10864f, 0.0f);
        points().setPX(2, this.f10863e, this.f10864f, 0.0f);
        points().setPX(3, -this.f10863e, this.f10864f, 0.0f);
        updatePointsVBO();
    }
}
