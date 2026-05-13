package com.tsf.shell.p096f.p153i.p155b.p159d;

import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.i.b.d.h */
/* loaded from: classes.dex */
public class C3185h extends C0981k {

    /* renamed from: a */
    private float f10387a;

    /* renamed from: d */
    private float f10388d;

    public C3185h(float f, float f2) {
        super(f, f2, 1, 1, false);
        useVBO(false);
        float f3 = f2 / 2.0f;
        this.f10388d = f3;
        this.f10387a = f3;
    }

    /* renamed from: c */
    public void m3241c(float f) {
        points().pxY(2, f);
        points().pxY(3, f);
        this.f10387a = f;
    }

    /* renamed from: d */
    public void m3240d(float f) {
        points().pxY(0, -f);
        points().pxY(1, -f);
        this.f10388d = f;
    }
}
