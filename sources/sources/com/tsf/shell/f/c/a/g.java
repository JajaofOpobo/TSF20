package com.tsf.shell.f.c.a;

import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends k {
    private float a;
    private float d;
    private float e;
    private float f;
    private float g;

    public g(int i, int i2, h hVar) {
        super(0.0f, 0.0f, 3, 1, false);
        a(i, i2, hVar);
    }

    public void a(int i, int i2, h hVar) {
        this.d = i * com.censivn.C3DEngine.b.b.a.b;
        this.e = i2 * com.censivn.C3DEngine.b.b.a.b;
        a(hVar, false);
        d();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
    }

    private void a(h hVar, boolean z) {
        float f = hVar.a;
        float f2 = hVar.b;
        float f3 = hVar.c;
        float f4 = this.d / 2.0f;
        this.f = com.censivn.C3DEngine.b.b.a.b * f;
        this.g = (hVar.c - f2) * com.censivn.C3DEngine.b.b.a.b;
        uvs().set(0, 1.0f, 1.0f);
        uvs().set(3, 0.0f, 1.0f);
        uvs().set(4, 1.0f, 0.0f);
        uvs().set(7, 0.0f, 0.0f);
        uvs().set(1, f2 / f3, 1.0f);
        uvs().set(2, f / f3, 1.0f);
        uvs().set(6, f2 / f3, 0.0f);
        uvs().set(5, f / f3, 0.0f);
        points().setPX(2, (-f4) + this.f, (-this.e) / 2.0f, 0.0f);
        points().setPX(3, -f4, (-this.e) / 2.0f, 0.0f);
        points().setPX(6, (-f4) + this.f, this.e / 2.0f, 0.0f);
        points().setPX(7, -f4, this.e / 2.0f, 0.0f);
        points().setPX(1, 0.0f, (-this.e) / 2.0f, 0.0f);
        points().setPX(0, this.g, (-this.e) / 2.0f, 0.0f);
        points().setPX(5, 0.0f, this.e / 2.0f, 0.0f);
        points().setPX(4, this.g, this.e / 2.0f, 0.0f);
        if (z) {
            syncUpdateUvsVBO();
        }
    }

    public float a() {
        return this.a;
    }

    public void c(float f) {
        this.a = f;
        d();
    }

    private void d() {
        float f = this.a;
        float f2 = this.e / 2.0f;
        points().setPX(1, f, -f2, 0.0f);
        points().setPX(0, this.g + f, -f2, 0.0f);
        points().setPX(5, f, f2, 0.0f);
        points().setPX(4, f + this.g, f2, 0.0f);
        syncUpdatePointVBO();
    }
}
