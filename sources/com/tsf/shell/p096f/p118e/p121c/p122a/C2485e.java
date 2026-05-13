package com.tsf.shell.p096f.p118e.p121c.p122a;
/* renamed from: com.tsf.shell.f.e.c.a.e */
/* loaded from: classes.dex */
public class C2485e {

    /* renamed from: a */
    public float f8209a;

    /* renamed from: b */
    public float f8210b;

    /* renamed from: c */
    public float f8211c;

    public C2485e(float f, float f2, float f3) {
        this.f8209a = f;
        this.f8210b = f2;
        this.f8211c = f3;
    }

    /* renamed from: a */
    public float m5427a(C2485e c2485e) {
        float abs = Math.abs((this.f8211c * this.f8209a) / (c2485e.f8211c + this.f8211c));
        if (this.f8209a < 0.0f) {
            return abs + this.f8209a;
        }
        return this.f8209a - abs;
    }

    /* renamed from: b */
    public float m5426b(C2485e c2485e) {
        float abs = Math.abs((this.f8211c * c2485e.f8210b) / (c2485e.f8211c + this.f8211c));
        if (c2485e.f8210b < 0.0f) {
            return abs * (-1.0f);
        }
        return abs;
    }
}
