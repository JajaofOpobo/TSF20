package com.tsf.shell.widget.p200a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.widget.a.d */
/* loaded from: classes.dex */
public class C4215d extends C0981k {

    /* renamed from: a */
    private Color4 f13622a;

    /* renamed from: d */
    private float f13623d;

    /* renamed from: e */
    private float f13624e;

    /* renamed from: f */
    private float f13625f;

    /* renamed from: g */
    private float f13626g;

    /* renamed from: h */
    private float f13627h;

    /* renamed from: i */
    private float f13628i;

    /* renamed from: j */
    private float f13629j;

    /* renamed from: k */
    private float f13630k;

    /* renamed from: l */
    private float f13631l;

    public C4215d(float f, float f2) {
        super(f, f2);
        this.f13622a = new Color4(-1);
        this.f13623d = 0.0f;
        this.f13624e = 0.0f;
        this.f13625f = 0.0f;
        this.f13626g = 0.0f;
        this.f13627h = 0.0f;
        this.f13628i = 300.0f;
        this.f13629j = 300.0f;
        this.f13630k = 0.0f;
        this.f13631l = 0.0f;
        setDefaultColor(this.f13622a);
        m513b(f, f2);
    }

    /* renamed from: b */
    public void m513b(float f, float f2) {
        this.f13623d = f2;
        this.f13624e = f;
        this.f13626g = f2 / 2.0f;
        this.f13625f = f / 2.0f;
        points().setPX(0, this.f13625f, -this.f13626g, 0.0f);
        points().setPX(1, -this.f13625f, -this.f13626g, 0.0f);
        points().setPX(2, this.f13625f, this.f13626g, 0.0f);
        points().setPX(3, -this.f13625f, this.f13626g, 0.0f);
        updatePointsVBO();
    }

    /* renamed from: c */
    public void m511c(float f, float f2) {
        this.f13627h = f;
        this.f13628i = f2;
        m508e();
    }

    /* renamed from: c */
    public void m512c(float f) {
        m511c((float) Math.toRadians(f), this.f13628i);
    }

    /* renamed from: d */
    public void m509d(float f) {
        this.f13630k = f;
        m510d();
    }

    /* renamed from: e */
    public void m507e(float f) {
        this.f13631l = f;
        m510d();
    }

    /* renamed from: a */
    public float m515a() {
        return this.f13631l;
    }

    /* renamed from: d */
    private void m510d() {
        m511c(this.f13627h, this.f13630k + this.f13629j + this.f13631l);
    }

    /* renamed from: e */
    private void m508e() {
        float degrees = ((float) (Math.toDegrees(this.f13627h) - 90.0d)) % 360.0f;
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
        rotation().f2528z = degrees;
        position().f2526x = (float) (Math.cos(this.f13627h) * this.f13628i);
        position().f2527y = (float) (Math.sin(this.f13627h) * this.f13628i);
    }

    /* renamed from: a */
    public void m514a(int i) {
        this.f13622a.set(i);
    }
}
