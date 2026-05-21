package com.censivn.C3DEngine.api.primitives.ninepath;

import com.censivn.C3DEngine.b.f.b.a;
import com.censivn.C3DEngine.b.f.b.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VNinePatchRectangle {
    private a vTarget;

    public VNinePatchRectangle(float f, float f2, VNinePathParam vNinePathParam) {
        this.vTarget = new a(f, f2, (b) vNinePathParam.getVirtualTarget());
    }

    public void setNinePatch(VNinePathParam vNinePathParam) {
        this.vTarget.a((b) vNinePathParam.getVirtualTarget());
    }

    public void setSize(float f, float f2) {
        this.vTarget.b(f, f2);
    }

    public void width(float f) {
        this.vTarget.a(f);
    }

    public void height(float f) {
        this.vTarget.b(f);
    }

    public float width() {
        return this.vTarget.b();
    }

    public float height() {
        return this.vTarget.c();
    }
}
