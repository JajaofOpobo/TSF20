package com.tsf.shell.e.i.c.a;

import com.censivn.C3DEngine.api.primitives.VRectangle;

/* loaded from: classes.dex */
public class t extends VRectangle {
    public float a;
    public float b;
    public float c;
    final /* synthetic */ s d;
    private float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, float f) {
        super(70.0f, 70.0f);
        this.d = sVar;
        this.a = 0.1f;
        this.b = (float) (360.0d * Math.random());
        this.e = 0.0f;
        this.c = 0.0f;
        moveAllPointsSP(0.0f, -35.0f, 0.0f);
        this.e = f;
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
        rotation().z = this.b + 180.0f + this.e;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawEnd() {
        if (Math.abs(this.a) > 0.001f && !com.tsf.shell.e.i.c.a.a.m.e) {
            invalidate();
        }
    }

    public void a() {
        this.a = ((float) ((-10.0d) + (20.0d * Math.random()))) + this.a;
    }
}
