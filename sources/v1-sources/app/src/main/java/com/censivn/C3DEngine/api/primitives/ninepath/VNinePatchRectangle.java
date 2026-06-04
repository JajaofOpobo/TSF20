package com.censivn.C3DEngine.api.primitives.ninepath;

import com.censivn.C3DEngine.e.b.a;
import com.censivn.C3DEngine.e.b.b;

/* loaded from: classes.dex */
public class VNinePatchRectangle {
    private a vTarget;

    public VNinePatchRectangle(float f, float f2, VNinePathParam vNinePathParam) {
        this.vTarget = new a(f, f2, (b) vNinePathParam.getVirtualTarget());
    }

    public void setNinePatch(VNinePathParam vNinePathParam) {
        this.vTarget.a((b) vNinePathParam.getVirtualTarget());
    }

    public void setSize(float f, float f2) {
        this.vTarget.a(f, f2);
    }

    public void width(float f) {
        this.vTarget.a_(f);
    }

    public void height(float f) {
        this.vTarget.h(f);
    }

    public float width() {
        return this.vTarget.n_();
    }

    public float height() {
        return this.vTarget.o_();
    }
}
