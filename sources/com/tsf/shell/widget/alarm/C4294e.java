package com.tsf.shell.widget.alarm;

import com.censivn.C3DEngine.api.primitives.VRectangle;
/* renamed from: com.tsf.shell.widget.alarm.e */
/* loaded from: classes.dex */
public class C4294e {

    /* renamed from: a */
    private VRectangle f13905a;

    /* renamed from: b */
    private C4306j f13906b;

    /* renamed from: g */
    private int f13911g;

    /* renamed from: h */
    private int f13912h;

    /* renamed from: i */
    private int f13913i;

    /* renamed from: k */
    private boolean f13915k;

    /* renamed from: c */
    private float f13907c = 1.0f;

    /* renamed from: d */
    private float f13908d = 0.0f;

    /* renamed from: e */
    private float f13909e = 0.0f;

    /* renamed from: f */
    private float f13910f = 0.0f;

    /* renamed from: j */
    private int f13914j = 0;

    public C4294e(VRectangle vRectangle, C4306j c4306j, int i, int i2, int i3) {
        this.f13911g = 0;
        this.f13912h = 0;
        this.f13913i = 0;
        this.f13905a = vRectangle;
        this.f13906b = c4306j;
        this.f13911g = i;
        this.f13912h = i2;
        this.f13913i = i3;
    }

    /* renamed from: a */
    public void m295a() {
        this.f13909e %= 360.0f;
        this.f13908d = this.f13909e;
        AlarmWidget.f13716l.invalidate();
    }

    /* renamed from: a */
    public void m294a(float f) {
        this.f13907c = 1.0f;
        this.f13910f = this.f13908d + f;
        AlarmWidget.f13716l.invalidate();
    }

    /* renamed from: b */
    public void m290b(float f) {
        this.f13915k = true;
        this.f13907c = 0.1f;
        this.f13910f = this.f13909e - f;
        this.f13910f = Math.round(this.f13910f / 30.0f) * 30;
        AlarmWidget.f13716l.invalidate();
    }

    /* renamed from: a */
    public void m292a(int i, float f) {
        C4305i.m259c("=============Fling===============");
        this.f13915k = true;
        this.f13907c = 0.1f;
        this.f13910f += i * f;
        this.f13910f = Math.round(this.f13910f / 30.0f) * 30;
        AlarmWidget.f13716l.invalidate();
    }

    /* renamed from: b */
    public void m291b() {
        if (!this.f13915k) {
            this.f13907c = 0.1f;
            this.f13910f = Math.round(this.f13909e / 30.0f) * 30;
            AlarmWidget.f13716l.invalidate();
        }
        this.f13915k = false;
    }

    /* renamed from: a */
    public void m293a(int i) {
        float f = (((-((i / this.f13912h) - this.f13913i)) - this.f13911g) - 1) * 30.0f;
        this.f13910f = f;
        this.f13909e = f;
        this.f13914j = Math.round(this.f13909e / 30.0f) + this.f13911g;
        this.f13906b.m255a(this.f13914j);
        this.f13905a.rotation().f2528z = this.f13909e;
        AlarmWidget.f13716l.invalidate();
    }

    /* renamed from: c */
    public int m289c() {
        return (this.f13906b.m253b() + this.f13913i) * this.f13912h;
    }

    /* renamed from: d */
    public void m288d() {
        float f = this.f13910f - this.f13909e;
        if (f != 0.0f) {
            if (Math.abs(f) < 0.1f) {
                this.f13910f %= 360.0f;
                this.f13909e = this.f13910f;
            } else {
                this.f13909e = (f * this.f13907c) + this.f13909e;
                AlarmWidget.f13716l.invalidate();
            }
            this.f13914j = Math.round(this.f13909e / 30.0f) + this.f13911g;
            this.f13906b.m255a(this.f13914j);
            this.f13905a.rotation().f2528z = this.f13909e;
        }
    }
}
