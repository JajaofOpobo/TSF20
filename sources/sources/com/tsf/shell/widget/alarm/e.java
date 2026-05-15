package com.tsf.shell.widget.alarm;

import com.censivn.C3DEngine.api.primitives.VRectangle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    private VRectangle a;
    private j b;
    private int g;
    private int h;
    private int i;
    private boolean k;
    private float c = 1.0f;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private int j = 0;

    public e(VRectangle vRectangle, j jVar, int i, int i2, int i3) {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.a = vRectangle;
        this.b = jVar;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    public void a() {
        this.e %= 360.0f;
        this.d = this.e;
        AlarmWidget.l.invalidate();
    }

    public void a(float f) {
        this.c = 1.0f;
        this.f = this.d + f;
        AlarmWidget.l.invalidate();
    }

    public void b(float f) {
        this.k = true;
        this.c = 0.1f;
        this.f = this.e - f;
        this.f = Math.round(this.f / 30.0f) * 30;
        AlarmWidget.l.invalidate();
    }

    public void a(int i, float f) {
        i.c("=============Fling===============");
        this.k = true;
        this.c = 0.1f;
        this.f += i * f;
        this.f = Math.round(this.f / 30.0f) * 30;
        AlarmWidget.l.invalidate();
    }

    public void b() {
        if (!this.k) {
            this.c = 0.1f;
            this.f = Math.round(this.e / 30.0f) * 30;
            AlarmWidget.l.invalidate();
        }
        this.k = false;
    }

    public void a(int i) {
        float f = (((-((i / this.h) - this.i)) - this.g) - 1) * 30.0f;
        this.f = f;
        this.e = f;
        this.j = Math.round(this.e / 30.0f) + this.g;
        this.b.a(this.j);
        this.a.rotation().z = this.e;
        AlarmWidget.l.invalidate();
    }

    public int c() {
        return (this.b.b() + this.i) * this.h;
    }

    public void d() {
        float f = this.f - this.e;
        if (f != 0.0f) {
            if (Math.abs(f) < 0.1f) {
                this.f %= 360.0f;
                this.e = this.f;
            } else {
                this.e = (f * this.c) + this.e;
                AlarmWidget.l.invalidate();
            }
            this.j = Math.round(this.e / 30.0f) + this.g;
            this.b.a(this.j);
            this.a.rotation().z = this.e;
        }
    }
}
