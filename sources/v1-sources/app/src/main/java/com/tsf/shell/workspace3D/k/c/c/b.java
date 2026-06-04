package com.tsf.shell.workspace3D.k.c.c;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ad;

/* loaded from: classes.dex */
final class b extends com.tsf.shell.workspace3D.k.j {
    private double A = 0.017453292519943295d;
    private int B = 0;
    private boolean C = false;
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void i_() {
        super.i_();
        this.a.j = L().y;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        boolean z2;
        float f;
        z = this.a.e;
        if (!z && !this.C) {
            z2 = this.a.i;
            if (z2 && !bo()) {
                PositionNumber3d L = L();
                f = this.a.j;
                L.y = f + (((float) Math.sin(this.A * this.B)) * 50.0f * com.censivn.C3DEngine.a.b);
                this.B++;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void br() {
        com.censivn.C3DEngine.e.b bVar;
        bVar = this.a.k;
        if (bVar != null) {
            this.a.a();
        }
        this.a.j = L().y;
        this.a.i = true;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a_() {
        this.C = true;
        super.a_();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void o() {
        super.o();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void b_() {
        this.a.j = L().y;
        this.B = 0;
        this.C = false;
        super.b_();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void p() {
        this.a.e = true;
        super.p();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void q() {
        this.a.e = false;
        super.q();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void n() {
        TextureElement textureElement;
        TextureElement textureElement2;
        TextureElement textureElement3;
        ad f = com.censivn.C3DEngine.a.f();
        textureElement = this.a.g;
        f.a(textureElement);
        ad f2 = com.censivn.C3DEngine.a.f();
        textureElement2 = this.a.h;
        f2.a(textureElement2);
        ad f3 = com.censivn.C3DEngine.a.f();
        textureElement3 = this.a.n;
        f3.a(textureElement3);
        super.n();
    }
}
