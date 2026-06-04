package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
public final class ab {
    private ai a;
    private com.censivn.C3DEngine.e.b b = new com.censivn.C3DEngine.e.b(512.0f, 640.0f, 8, 10, false);
    private TextureElement c;
    private com.censivn.C3DEngine.c.b.b d;
    private com.censivn.C3DEngine.c.a e;
    private com.tsf.shell.workspace3D.d.a f;

    public ab(ai aiVar) {
        this.a = aiVar;
        this.b.b(true);
        this.b.c((Boolean) false);
        int i = 98;
        int i2 = 0;
        while (i2 < 11) {
            int i3 = i;
            for (int i4 = 0; i4 < 9; i4++) {
                this.b.F().setV(i3, 0.125f + (0.0625f * i2));
                i3--;
            }
            i2++;
            i = i3;
        }
        this.d = new com.censivn.C3DEngine.c.b.b(0.0f);
        this.d.d = new Vector3(0.0f, -128.0f, 0.0f);
        this.e = new com.censivn.C3DEngine.c.a(this.b);
        this.e.a(this.d);
        this.b.a((com.censivn.C3DEngine.b.l) new ac(this, this.b));
        this.b.ar();
        this.f = new ad(this);
    }

    static /* synthetic */ void a(ab abVar) {
        if (abVar.b.au()) {
            abVar.b.e(false);
            ae aeVar = new ae(abVar);
            aeVar.d(-180.0f);
            aeVar.f(com.censivn.C3DEngine.a.e + 80);
            aeVar.h(com.censivn.C3DEngine.a.h + 20);
            aeVar.j(0.01f);
            aeVar.k(0.01f);
            com.censivn.C3DEngine.g.s.a(abVar.b, 600, aeVar);
            ag agVar = new ag(abVar);
            agVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.o());
            com.censivn.C3DEngine.g.s.a(new com.censivn.C3DEngine.g.b.b(), 300, agVar);
        }
    }
}
