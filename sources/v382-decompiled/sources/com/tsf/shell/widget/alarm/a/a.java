package com.tsf.shell.widget.alarm.a;

/* loaded from: classes.dex */
public class a {
    public int a;
    public double c;
    public double d;
    public double i = 0.0d;
    public double h = 0.0d;
    public double g = 0.0d;
    public double f = 0.0d;
    public double e = 0.0d;
    public float b = 1.0f;

    public void a(double d) {
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double d2 = (this.e * cos) + (this.f * sin);
        double d3 = (this.e * (-sin)) + (this.f * cos);
        this.e = d2;
        this.f = d3;
        double d4 = (this.c * cos) + (this.d * sin);
        double d5 = (cos * this.d) + ((-sin) * this.c);
        this.c = d4;
        this.d = d5;
    }
}
