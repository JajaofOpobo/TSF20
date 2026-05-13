package com.tsf.shell.p096f.p118e.p121c.p122a;

import com.censivn.C3DEngine.api.primitives.VRectangle;
/* renamed from: com.tsf.shell.f.e.c.a.a */
/* loaded from: classes.dex */
public class C2481a extends VRectangle {

    /* renamed from: a */
    private float f8173a;

    /* renamed from: b */
    private float f8174b;

    /* renamed from: c */
    private float f8175c;

    /* renamed from: d */
    private float f8176d;

    public C2481a(float f, float f2) {
        super(f, f2);
        this.f8173a = 0.0f;
        this.f8174b = 0.0f;
        this.f8175c = 0.0f;
        this.f8176d = 0.0f;
        m5451a(f, f2);
    }

    /* renamed from: a */
    public void m5451a(float f, float f2) {
        this.f8173a = f2;
        this.f8174b = f;
        this.f8176d = f2 / 2.0f;
        this.f8175c = f / 2.0f;
        point().setPX(0, this.f8175c, -this.f8176d, 0.0f);
        point().setPX(1, -this.f8175c, -this.f8176d, 0.0f);
        point().setPX(2, this.f8175c, this.f8176d, 0.0f);
        point().setPX(3, -this.f8175c, this.f8176d, 0.0f);
        updatePointsVBO();
    }

    /* renamed from: b */
    public void m5450b(float f, float f2) {
        point().setPX(0, f2, -this.f8176d, 0.0f);
        point().setPX(1, f, -this.f8176d, 0.0f);
        point().setPX(2, f2, this.f8176d, 0.0f);
        point().setPX(3, f, this.f8176d, 0.0f);
        updatePointsVBO();
    }
}
