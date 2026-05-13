package com.tsf.shell.p096f.p118e.p121c.p122a;

import com.censivn.C3DEngine.api.primitives.VRectangle;
/* renamed from: com.tsf.shell.f.e.c.a.b */
/* loaded from: classes.dex */
public class C2482b extends VRectangle {

    /* renamed from: a */
    public float f8177a;

    /* renamed from: b */
    private float f8178b;

    /* renamed from: c */
    private float f8179c;

    /* renamed from: d */
    private float f8180d;

    /* renamed from: e */
    private float f8181e;

    /* renamed from: f */
    private C2485e f8182f;

    public C2482b(float f, C2485e c2485e) {
        super(f, f);
        this.f8178b = 0.0f;
        this.f8179c = 0.0f;
        this.f8180d = 0.0f;
        this.f8181e = 0.0f;
        this.f8177a = 0.0f;
        m5448a(f);
        this.f8182f = c2485e;
    }

    /* renamed from: a */
    public void m5446a(C2485e c2485e) {
        this.f8182f = c2485e;
    }

    /* renamed from: a */
    public void m5447a(float f, float f2) {
        this.f8178b = f2;
        this.f8179c = f;
        this.f8181e = f2 / 2.0f;
        this.f8180d = f / 2.0f;
        point().setPX(0, this.f8180d, -this.f8181e, 0.0f);
        point().setPX(1, -this.f8180d, -this.f8181e, 0.0f);
        point().setPX(2, this.f8180d, this.f8181e, 0.0f);
        point().setPX(3, -this.f8180d, this.f8181e, 0.0f);
        updatePointsVBO();
    }

    /* renamed from: a */
    public void m5448a(float f) {
        this.f8177a = f;
        m5447a(this.f8177a * 2.0f, this.f8177a * 2.0f);
    }

    /* renamed from: b */
    public void m5445b(float f) {
        float f2 = this.f8182f.f8209a - f;
        float f3 = this.f8182f.f8210b;
        m5448a(((float) Math.sqrt((f2 * f2) + (f3 * f3))) - this.f8182f.f8211c);
        position().f2526x = f;
    }

    /* renamed from: a */
    public float m5449a() {
        float abs = Math.abs((this.f8177a * position().f2526x) / (this.f8182f.f8211c + this.f8177a));
        if (position().f2526x < 0.0f) {
            return abs + position().f2526x;
        }
        return position().f2526x - abs;
    }
}
