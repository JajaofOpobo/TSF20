package com.tsf.shell.widget.alarm.p202a;
/* renamed from: com.tsf.shell.widget.alarm.a.a */
/* loaded from: classes.dex */
public class C4257a {

    /* renamed from: a */
    public int f13787a;

    /* renamed from: c */
    public double f13789c;

    /* renamed from: d */
    public double f13790d;

    /* renamed from: i */
    public double f13795i = 0.0d;

    /* renamed from: h */
    public double f13794h = 0.0d;

    /* renamed from: g */
    public double f13793g = 0.0d;

    /* renamed from: f */
    public double f13792f = 0.0d;

    /* renamed from: e */
    public double f13791e = 0.0d;

    /* renamed from: b */
    public float f13788b = 1.0f;

    /* renamed from: a */
    public void m375a(double d) {
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        this.f13791e = (this.f13791e * cos) + (this.f13792f * sin);
        this.f13792f = (this.f13791e * (-sin)) + (this.f13792f * cos);
        double d2 = (this.f13789c * cos) + (this.f13790d * sin);
        double d3 = (-sin) * this.f13789c;
        this.f13789c = d2;
        this.f13790d = (cos * this.f13790d) + d3;
    }
}
