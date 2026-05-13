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
        this.e = (this.e * cos) + (this.f * sin);
        this.f = (this.e * (-sin)) + (this.f * cos);
        double d2 = (this.c * cos) + (this.d * sin);
        double d3 = (-sin) * this.c;
        this.c = d2;
        this.d = (cos * this.d) + d3;
    }
}
