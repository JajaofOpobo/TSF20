package com.censivn.C3DEngine.api.primitives.ninepath;

import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
/* loaded from: classes.dex */
public class VNinePatchRectangle {
    private C0967a vTarget;

    public VNinePatchRectangle(float f, float f2, VNinePathParam vNinePathParam) {
        this.vTarget = new C0967a(f, f2, (C0968b) vNinePathParam.getVirtualTarget());
    }

    public void setNinePatch(VNinePathParam vNinePathParam) {
        this.vTarget.m10391a((C0968b) vNinePathParam.getVirtualTarget());
    }

    public void setSize(float f, float f2) {
        this.vTarget.m10389b(f, f2);
    }

    public void width(float f) {
        this.vTarget.mo10368a(f);
    }

    public void height(float f) {
        this.vTarget.mo5215b(f);
    }

    public float width() {
        return this.vTarget.mo10366b();
    }

    public float height() {
        return this.vTarget.mo10365c();
    }
}
