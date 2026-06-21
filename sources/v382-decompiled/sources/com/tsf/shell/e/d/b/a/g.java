package com.tsf.shell.e.d.b.a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class g extends e {
    private a c;
    private Number3d d;

    public g(int i, int i2, boolean z) {
        super(i, z);
        this.d = new Number3d();
        this.c = new a(i2, com.censivn.C3DEngine.b.b.a.a(26.0f), com.censivn.C3DEngine.b.b.a.a(60.0f), 250.0f);
        this.c.position().x = com.censivn.C3DEngine.b.b.a.a(47.0f);
        this.c.position().y = com.censivn.C3DEngine.b.b.a.a(75.0f);
        this.c.rotation().x = -30.0f;
        this.c.rotation().z = -45.0f;
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void a() {
        this.c.a();
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void a(com.tsf.shell.e.i.b.e.b bVar) {
        if (this.c.visible()) {
            if (bVar.parent() instanceof com.tsf.shell.e.f.a.a) {
                com.censivn.C3DEngine.a.e().b(bVar.position().x, bVar.position().y);
            } else {
                this.d.reset();
                bVar.localToGlobal(this.d);
                com.censivn.C3DEngine.a.e().b(this.d.x, this.d.y);
            }
            this.c.b(bVar.az());
            com.censivn.C3DEngine.a.e().f();
            com.censivn.C3DEngine.a.e().j();
        }
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void b(com.tsf.shell.e.i.b.e.b bVar) {
        if (this.c.visible()) {
            GLES20.glFrontFace(2304);
            if (bVar.parent() instanceof com.tsf.shell.e.f.a.a) {
                com.censivn.C3DEngine.a.e().b(bVar.position().x, bVar.position().y);
            } else {
                this.d.reset();
                bVar.localToGlobal(this.d);
                com.censivn.C3DEngine.a.e().b(this.d.x, this.d.y);
            }
            float az = bVar.az();
            this.c.a(az);
            bVar.f(az + 8.0f);
            com.censivn.C3DEngine.a.e().f();
            GLES20.glFrontFace(2305);
        }
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void b() {
        x xVar = new x() { // from class: com.tsf.shell.e.d.b.a.g.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                g.this.c.visible(false);
            }
        };
        xVar.a(0);
        w.a(this.c);
        w.a(this.c, VEasing.Back.easeIn, xVar);
    }

    @Override // com.tsf.shell.e.d.b.a.e
    public void c() {
        this.c.visible(true);
        x xVar = new x();
        xVar.a(255);
        w.a(this.c);
        w.a(this.c, VEasing.Back.easeIn, xVar);
    }
}
