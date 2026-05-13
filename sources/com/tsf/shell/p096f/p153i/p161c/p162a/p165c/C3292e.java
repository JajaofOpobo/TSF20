package com.tsf.shell.p096f.p153i.p161c.p162a.p165c;

import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
/* renamed from: com.tsf.shell.f.i.c.a.c.e */
/* loaded from: classes.dex */
public class C3292e {

    /* renamed from: a */
    private float f10865a;

    /* renamed from: b */
    private float f10866b;

    /* renamed from: c */
    private float f10867c;

    /* renamed from: d */
    private float f10868d;

    /* renamed from: e */
    private float f10869e;

    /* renamed from: f */
    private float f10870f;

    /* renamed from: g */
    private C0964b f10871g;

    /* renamed from: h */
    private C0964b f10872h;

    /* renamed from: i */
    private C0964b f10873i;

    /* renamed from: j */
    private long f10874j = -1;

    public C3292e(C0964b c0964b, C0964b c0964b2) {
        this.f10865a = 0.0f;
        this.f10866b = 0.0f;
        this.f10867c = 0.0f;
        this.f10868d = 0.0f;
        this.f10869e = 0.0f;
        this.f10870f = 0.0f;
        this.f10871g = c0964b;
        this.f10872h = c0964b2;
        this.f10865a = (c0964b2.m10407i().f2526x + c0964b.m10407i().f2526x) / 2.0f;
        this.f10866b = (c0964b2.m10407i().f2527y + c0964b.m10407i().f2527y) / 2.0f;
        float f = c0964b2.m10407i().f2526x - c0964b.m10407i().f2526x;
        float f2 = c0964b2.m10407i().f2527y - c0964b.m10407i().f2527y;
        this.f10870f = ((float) Math.sqrt((f * f) + (f2 * f2))) / 2.0f;
        this.f10867c = (float) Math.atan2(c0964b.m10407i().f2527y - this.f10866b, c0964b.m10407i().f2526x - this.f10865a);
        float f3 = this.f10867c;
        this.f10869e = f3;
        this.f10868d = f3;
    }

    /* renamed from: a */
    public void m2914a(C0964b c0964b) {
        this.f10873i = c0964b;
        this.f10873i.m10407i().f2526x = this.f10865a;
        this.f10873i.m10407i().f2527y = this.f10866b;
        this.f10873i.m10406j().f2528z = (float) Math.toDegrees(this.f10867c);
        this.f10873i.m10408h();
    }

    /* renamed from: a */
    public void m2915a(long j) {
        if (j >= this.f10874j && this.f10874j != -1) {
            float f = this.f10869e - this.f10868d;
            if (Math.abs(f) < 0.01f) {
                float f2 = this.f10867c;
                this.f10869e = f2;
                this.f10868d = f2;
                this.f10874j = -1L;
            } else {
                this.f10868d += 0.05f * f;
            }
            this.f10873i.m10406j().f2528z = (float) Math.toDegrees(this.f10868d);
            this.f10873i.m10443a((float) (Math.abs(f / 3.141592653589793d) * 255.0d));
            this.f10873i.m10408h();
            this.f10871g.m10407i().f2526x = ((float) (Math.cos(this.f10868d) * this.f10870f)) + this.f10865a;
            this.f10871g.m10407i().f2527y = ((float) (Math.sin(this.f10868d) * this.f10870f)) + this.f10866b;
            this.f10871g.m10408h();
            float f3 = (float) (this.f10868d + 3.141592653589793d);
            float sin = (float) (Math.sin(f3) * this.f10870f);
            this.f10872h.m10407i().f2526x = ((float) (Math.cos(f3) * this.f10870f)) + this.f10865a;
            this.f10872h.m10407i().f2527y = sin + this.f10866b;
            this.f10872h.m10408h();
        }
    }

    /* renamed from: a */
    public void m2916a(int i, long j) {
        this.f10868d = this.f10867c;
        this.f10869e = (float) (this.f10867c - 3.141592653589793d);
        this.f10874j = (i / 16.0f) + j;
    }
}
