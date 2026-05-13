package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

import com.censivn.C3DEngine.api.primitives.VRectangle;
/* renamed from: com.tsf.shell.f.i.c.a.a.f */
/* loaded from: classes.dex */
public class C3250f extends VRectangle {

    /* renamed from: a */
    public float f10679a;

    /* renamed from: b */
    public float f10680b;

    /* renamed from: c */
    public float f10681c;

    /* renamed from: d */
    private float f10682d;

    public C3250f(float f, float f2, float f3) {
        super(f, f2);
        this.f10679a = 0.1f;
        this.f10680b = (float) (360.0d * Math.random());
        this.f10682d = 0.0f;
        this.f10681c = 0.0f;
        this.f10682d = f3;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (this.f10679a != 0.0f) {
            this.f10679a = ((float) (this.f10679a + (Math.sin(Math.toRadians(this.f10680b)) / 5.0d))) * 0.97f;
            this.f10681c = this.f10680b + this.f10679a;
        }
        if (Math.abs(this.f10681c - this.f10680b) > 6.0f) {
            this.f10680b = this.f10681c;
        } else {
            this.f10680b += (this.f10681c - this.f10680b) * 0.9f;
        }
        rotation().f2528z = this.f10680b + 180.0f + this.f10682d;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawEnd() {
        if (Math.abs(this.f10679a) > 0.001f && !C3252h.f10683e) {
            invalidate();
        }
    }
}
