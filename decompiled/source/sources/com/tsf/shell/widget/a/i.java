package com.tsf.shell.widget.a;

import com.censivn.C3DEngine.api.element.Color4;
/* loaded from: classes.dex */
public class i extends com.censivn.C3DEngine.b.f.k {
    private float a;
    private float d;
    private float e;
    private float f;
    private Color4 g;

    public i(float f, float f2) {
        super(f, f2);
        this.a = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = new Color4(-1);
        setDefaultColor(this.g);
        b(f, f2);
    }

    public void b(float f, float f2) {
        this.a = f2;
        this.d = f;
        this.f = f2 / 2.0f;
        this.e = f / 2.0f;
        points().setPX(0, this.e, -this.f, 0.0f);
        points().setPX(1, -this.e, -this.f, 0.0f);
        points().setPX(2, this.e, this.f, 0.0f);
        points().setPX(3, -this.e, this.f, 0.0f);
        updatePointsVBO();
    }

    public void a(int i) {
        this.g.set(i);
    }
}
