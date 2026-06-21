package com.tsf.shell.manager.wallpaper;

import com.censivn.C3DEngine.api.primitives.button.VButtonItem;

/* loaded from: classes.dex */
public class d {
    float a;
    float b;
    VButtonItem g;
    final /* synthetic */ c j;
    float c = 0.0f;
    float d = 0.0f;
    float e = 0.0f;
    float f = 0.0f;
    float h = 3.2962964f;
    float i = 50.0f;

    public d(c cVar, VButtonItem vButtonItem) {
        float f;
        float f2;
        float f3;
        float f4;
        this.j = cVar;
        this.a = 0.0f;
        this.b = 0.0f;
        this.g = vButtonItem;
        this.g.alpha(cVar.a(50.0f, 100.0f, false));
        f = cVar.f;
        f2 = cVar.f;
        this.a = cVar.a(-f, f2, true);
        f3 = cVar.g;
        f4 = cVar.g;
        this.b = cVar.a(-f3, f4, true);
        float a = cVar.a(0.1f, 0.9f, false);
        this.g.scale().setAll(a, a, a);
        this.g.setTextureAllAndMathSizePX(0, 0, 1, 1);
        this.g.updateAll();
        b();
    }

    private void b() {
        this.e = this.j.a(0.3f, 0.8f, false);
        this.d = this.e / this.h;
    }

    public void a() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        this.a += this.d;
        this.b += this.e;
        this.g.position().pxX(this.a);
        this.g.position().pxY(this.b);
        this.g.updateAll();
        float f6 = this.a;
        f = this.j.f;
        if (f6 <= f + this.i) {
            float f7 = this.b;
            f5 = this.j.g;
            if (f7 <= f5 + this.i) {
                return;
            }
        }
        c cVar = this.j;
        f2 = this.j.d;
        this.a = cVar.a(0.0f, (-f2) - this.i, false);
        c cVar2 = this.j;
        f3 = this.j.g;
        float f8 = (-f3) - this.i;
        f4 = this.j.g;
        this.b = cVar2.a(f8, (-f4) - this.i, false);
        b();
    }
}
