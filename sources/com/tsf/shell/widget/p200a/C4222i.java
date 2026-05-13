package com.tsf.shell.widget.p200a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.widget.a.i */
/* loaded from: classes.dex */
public class C4222i extends C0981k {

    /* renamed from: a */
    private float f13643a;

    /* renamed from: d */
    private float f13644d;

    /* renamed from: e */
    private float f13645e;

    /* renamed from: f */
    private float f13646f;

    /* renamed from: g */
    private Color4 f13647g;

    public C4222i(float f, float f2) {
        super(f, f2);
        this.f13643a = 0.0f;
        this.f13644d = 0.0f;
        this.f13645e = 0.0f;
        this.f13646f = 0.0f;
        this.f13647g = new Color4(-1);
        setDefaultColor(this.f13647g);
        m495b(f, f2);
    }

    /* renamed from: b */
    public void m495b(float f, float f2) {
        this.f13643a = f2;
        this.f13644d = f;
        this.f13646f = f2 / 2.0f;
        this.f13645e = f / 2.0f;
        points().setPX(0, this.f13645e, -this.f13646f, 0.0f);
        points().setPX(1, -this.f13645e, -this.f13646f, 0.0f);
        points().setPX(2, this.f13645e, this.f13646f, 0.0f);
        points().setPX(3, -this.f13645e, this.f13646f, 0.0f);
        updatePointsVBO();
    }

    /* renamed from: a */
    public void m496a(int i) {
        this.f13647g.set(i);
    }
}
