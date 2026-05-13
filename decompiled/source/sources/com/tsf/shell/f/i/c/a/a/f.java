package com.tsf.shell.f.i.c.a.a;

import com.censivn.C3DEngine.api.primitives.VRectangle;
/* loaded from: classes.dex */
public class f extends VRectangle {
    public float a;
    public float b;
    public float c;
    private float d;

    public f(float f, float f2, float f3) {
        super(f, f2);
        this.a = 0.1f;
        this.b = (float) (360.0d * Math.random());
        this.d = 0.0f;
        this.c = 0.0f;
        this.d = f3;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (this.a != 0.0f) {
            this.a = ((float) (this.a + (Math.sin(Math.toRadians(this.b)) / 5.0d))) * 0.97f;
            this.c = this.b + this.a;
        }
        if (Math.abs(this.c - this.b) > 6.0f) {
            this.b = this.c;
        } else {
            this.b += (this.c - this.b) * 0.9f;
        }
        rotation().z = this.b + 180.0f + this.d;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawEnd() {
        if (Math.abs(this.a) > 0.001f && !h.e) {
            invalidate();
        }
    }
}
