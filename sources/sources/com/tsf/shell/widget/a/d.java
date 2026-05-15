package com.tsf.shell.widget.a;

import com.censivn.C3DEngine.api.element.Color4;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.censivn.C3DEngine.b.f.k {
    private Color4 a;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;

    public d(float f, float f2) {
        super(f, f2);
        this.a = new Color4(-1);
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 300.0f;
        this.j = 300.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        setDefaultColor(this.a);
        b(f, f2);
    }

    public void b(float f, float f2) {
        this.d = f2;
        this.e = f;
        this.g = f2 / 2.0f;
        this.f = f / 2.0f;
        points().setPX(0, this.f, -this.g, 0.0f);
        points().setPX(1, -this.f, -this.g, 0.0f);
        points().setPX(2, this.f, this.g, 0.0f);
        points().setPX(3, -this.f, this.g, 0.0f);
        updatePointsVBO();
    }

    public void c(float f, float f2) {
        this.h = f;
        this.i = f2;
        e();
    }

    public void c(float f) {
        c((float) Math.toRadians(f), this.i);
    }

    public void d(float f) {
        this.k = f;
        d();
    }

    public void e(float f) {
        this.l = f;
        d();
    }

    public float a() {
        return this.l;
    }

    private void d() {
        c(this.h, this.k + this.j + this.l);
    }

    private void e() {
        float degrees = ((float) (Math.toDegrees(this.h) - 90.0d)) % 360.0f;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        if (degrees > 180.0f) {
            degrees -= 360.0f;
        }
        if (degrees >= 45.0f || degrees <= -45.0f) {
            if (degrees >= 45.0f && degrees < 135.0f) {
                degrees -= 90.0f;
            } else if (degrees <= -45.0f && degrees > -135.0f) {
                degrees += 90.0f;
            } else {
                degrees += 180.0f;
            }
        }
        rotation().z = degrees;
        float fSin = (float) (Math.sin(this.h) * ((double) this.i));
        position().x = (float) (Math.cos(this.h) * ((double) this.i));
        position().y = fSin;
    }

    public void a(int i) {
        this.a.set(i);
    }
}
