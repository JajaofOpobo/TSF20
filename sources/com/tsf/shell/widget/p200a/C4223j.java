package com.tsf.shell.widget.p200a;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
/* renamed from: com.tsf.shell.widget.a.j */
/* loaded from: classes.dex */
public class C4223j {

    /* renamed from: a */
    private float f13648a;

    /* renamed from: b */
    private float f13649b;

    /* renamed from: c */
    private float f13650c;

    /* renamed from: d */
    private float f13651d;

    /* renamed from: e */
    private float f13652e;

    /* renamed from: f */
    private float f13653f;

    /* renamed from: g */
    private C0964b f13654g;

    /* renamed from: h */
    private C0964b f13655h;

    /* renamed from: i */
    private C0964b f13656i;

    /* renamed from: j */
    private long f13657j = -1;

    public C4223j(C0964b c0964b, C0964b c0964b2) {
        this.f13648a = 0.0f;
        this.f13649b = 0.0f;
        this.f13650c = 0.0f;
        this.f13651d = 0.0f;
        this.f13652e = 0.0f;
        this.f13653f = 0.0f;
        this.f13654g = c0964b;
        this.f13655h = c0964b2;
        this.f13648a = (c0964b2.m10407i().f2526x + c0964b.m10407i().f2526x) / 2.0f;
        this.f13649b = (c0964b2.m10407i().f2527y + c0964b.m10407i().f2527y) / 2.0f;
        float f = c0964b2.m10407i().f2526x - c0964b.m10407i().f2526x;
        float f2 = c0964b2.m10407i().f2527y - c0964b.m10407i().f2527y;
        this.f13653f = ((float) Math.sqrt((f * f) + (f2 * f2))) / 2.0f;
        this.f13650c = (float) Math.atan2(c0964b.m10407i().f2527y - this.f13649b, c0964b.m10407i().f2526x - this.f13648a);
        float f3 = this.f13650c;
        this.f13652e = f3;
        this.f13651d = f3;
    }

    /* renamed from: a */
    public void m492a(C0964b c0964b) {
        this.f13656i = c0964b;
        this.f13656i.m10407i().f2526x = this.f13648a;
        this.f13656i.m10407i().f2527y = this.f13649b;
        this.f13656i.m10406j().f2528z = (float) Math.toDegrees(this.f13650c);
        this.f13656i.m10408h();
    }

    /* renamed from: a */
    public void m493a(long j) {
        if (j >= this.f13657j && this.f13657j != -1) {
            float f = this.f13652e - this.f13651d;
            if (Math.abs(f) < 0.01f) {
                float f2 = this.f13650c;
                this.f13652e = f2;
                this.f13651d = f2;
                this.f13657j = -1L;
            } else {
                this.f13651d += 0.05f * f;
            }
            this.f13656i.m10406j().f2528z = (float) Math.toDegrees(this.f13651d);
            this.f13656i.m10443a((float) (Math.abs(f / 3.141592653589793d) * 255.0d));
            this.f13656i.m10408h();
            this.f13654g.m10407i().f2526x = ((float) (Math.cos(this.f13651d) * this.f13653f)) + this.f13648a;
            this.f13654g.m10407i().f2527y = ((float) (Math.sin(this.f13651d) * this.f13653f)) + this.f13649b;
            this.f13654g.m10408h();
            float f3 = (float) (this.f13651d + 3.141592653589793d);
            float sin = (float) (Math.sin(f3) * this.f13653f);
            this.f13655h.m10407i().f2526x = ((float) (Math.cos(f3) * this.f13653f)) + this.f13648a;
            this.f13655h.m10407i().f2527y = sin + this.f13649b;
            this.f13655h.m10408h();
        }
    }

    /* renamed from: a */
    public void m494a(int i, long j) {
        this.f13651d = this.f13650c;
        this.f13652e = (float) (this.f13650c - 3.141592653589793d);
        this.f13657j = (i / 16.0f) + j;
    }
}
