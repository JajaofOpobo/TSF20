package com.tsf.shell.e.f.a.c;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
public class o {
    public float c;
    public float d;
    final /* synthetic */ n e;
    public float b = 1.0f;
    public Number3d a = new Number3d();

    public o(n nVar) {
        this.e = nVar;
    }

    public void a(Double d, float f) {
        float f2;
        double sin = Math.sin(d.doubleValue());
        Double.valueOf(d.doubleValue() + 0.03490658503988659d);
        f2 = this.e.f;
        this.b = ((float) ((0.2f * sin) + (f - 0.2f))) * f2;
        this.c = (float) (this.a.x - ((sin * 10.0d) * com.censivn.C3DEngine.b.b.a.c));
    }
}
