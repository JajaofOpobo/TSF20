package com.tsf.shell.widget.alarm.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = (this.e * dCos) + (this.f * dSin);
        double d3 = (this.e * (-dSin)) + (this.f * dCos);
        this.e = d2;
        this.f = d3;
        double d4 = (this.c * dCos) + (this.d * dSin);
        double d5 = (dCos * this.d) + ((-dSin) * this.c);
        this.c = d4;
        this.d = d5;
    }
}
