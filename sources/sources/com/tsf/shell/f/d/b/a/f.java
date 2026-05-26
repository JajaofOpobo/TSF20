package com.tsf.shell.f.d.b.a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends d {
    private a c;
    private Number3d d;

    public f(int i, int i2, boolean z) {
        super(i, z);
        this.d = new Number3d();
        this.c = new a(i2, com.censivn.C3DEngine.b.b.a.a(26.0f), com.censivn.C3DEngine.b.b.a.a(60.0f), 250.0f);
        this.c.position().x = com.censivn.C3DEngine.b.b.a.a(47.0f);
        this.c.position().y = com.censivn.C3DEngine.b.b.a.a(75.0f);
        this.c.rotation().x = -30.0f;
        this.c.rotation().z = -45.0f;
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void a() {
        this.c.a();
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void a(com.tsf.shell.f.i.b.e.b bVar) {
        if (this.c.visible()) {
            if (bVar.parent() instanceof com.tsf.shell.f.f.a.a) {
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

    @Override // com.tsf.shell.f.d.b.a.d
    public void b(com.tsf.shell.f.i.b.e.b bVar) {
        if (this.c.visible()) {
            GLES20.glFrontFace(2304);
            if (bVar.parent() instanceof com.tsf.shell.f.f.a.a) {
                com.censivn.C3DEngine.a.e().b(bVar.position().x, bVar.position().y);
            } else {
                this.d.reset();
                bVar.localToGlobal(this.d);
                com.censivn.C3DEngine.a.e().b(this.d.x, this.d.y);
            }
            float fAz = bVar.az();
            this.c.a(fAz);
            bVar.f(fAz + 8.0f);
            com.censivn.C3DEngine.a.e().f();
            GLES20.glFrontFace(2305);
        }
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void b() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.b.a.f.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                f.this.c.visible(false);
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, VEasing.Back.easeIn, dVar);
    }

    @Override // com.tsf.shell.f.d.b.a.d
    public void c() {
        this.c.visible(true);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.c, VEasing.Back.easeIn, dVar);
    }
}
