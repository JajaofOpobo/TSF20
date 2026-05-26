package com.tsf.shell.preference.a.a.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends h {
    private com.censivn.C3DEngine.b.b.a.d a;
    private com.censivn.C3DEngine.b.b.a.b b;
    private com.censivn.C3DEngine.b.f.j d;
    private com.censivn.C3DEngine.b.f.k e;
    private TextureElement f;
    private Runnable g;
    private boolean h;
    private int i;
    private ArrayList<com.tsf.shell.manager.o.a.b> j;

    public d(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(238.0f));
        this.h = false;
        this.i = 0;
        this.d = new com.censivn.C3DEngine.b.f.j();
        this.g = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.n();
            }
        };
        this.j = new ArrayList<>();
        this.j.add(com.tsf.shell.manager.o.a.c.c(0));
        this.j.add(com.tsf.shell.manager.o.a.c.c(1));
        this.j.add(com.tsf.shell.manager.o.a.c.c(3));
        this.j.add(com.tsf.shell.manager.o.a.c.c(8));
        this.a = new com.censivn.C3DEngine.b.b.a.d() { // from class: com.tsf.shell.preference.a.a.a.d.2
            @Override // com.censivn.C3DEngine.b.b.a.d
            public float b(float f) {
                return com.tsf.shell.manager.o.b.a.J * 1.2f * (-((int) ((Math.abs(f) + (r0 / 2.0f)) / r0)));
            }
        };
        this.a.b(true);
        this.a.c(((-com.tsf.shell.manager.o.b.a.J) / 2.0f) * 1.2f);
        this.a.d((com.tsf.shell.manager.o.b.a.J / 2.0f) * 1.2f);
        this.b = new com.censivn.C3DEngine.b.b.a.b();
        this.a.c(this.b);
        for (int i = 0; i < this.j.size(); i++) {
            com.tsf.shell.manager.o.a.b bVar = this.j.get(i);
            com.censivn.C3DEngine.b.f.k kVar = new com.censivn.C3DEngine.b.f.k(com.tsf.shell.manager.o.b.c.J, com.tsf.shell.manager.o.b.c.K + com.tsf.shell.manager.o.a.b.d, false);
            kVar.textures().addElement(bVar.b());
            kVar.calAABB(1.2f, 1.0f, 1.0f);
            this.b.addChild(kVar);
        }
        this.d.addChild(this.a);
        this.e = new com.censivn.C3DEngine.b.f.k(com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I, false);
        this.f = new TextureElement(0, false);
        this.e.textures().addElement(this.f);
        this.a.position().y = -com.tsf.shell.manager.o.b.c.I;
        this.d.addChild(this.e);
        this.d.position().y = com.censivn.C3DEngine.b.b.a.a(50.0f);
        e().addChild(this.d);
    }

    private void h() {
        m();
        Bitmap bitmapA = x.a(b.d.tsf_ico);
        com.censivn.C3DEngine.a.g().a(this.f, bitmapA);
        bitmapA.recycle();
    }

    private void m() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.i++;
        if (this.i > this.b.numChildren() - 1) {
            this.i = 0;
        }
        a(this.i, true);
        if (this.h) {
            com.censivn.C3DEngine.a.a().b(this.g, 2000L);
        }
    }

    private void a(int i, boolean z) {
        this.a.a((com.tsf.shell.manager.o.b.a.J * 1.2f * (-i)) + (this.a.i() / 2.0f) + this.a.b(), z);
        this.a.setAnimationObjectState(true);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        super.f();
        this.h = true;
        h();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.j.size()) {
                this.j.get(i2).a(com.tsf.shell.manager.o.b.c);
                i = i2 + 1;
            } else {
                o();
                n();
                return;
            }
        }
    }

    private void o() {
        this.a.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.a.setAABBPX(0.0f, (-com.censivn.C3DEngine.b.b.a.a(500.0f)) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.a(500.0f) / 2.0f, 0.0f);
        this.a.k();
        this.a.a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        o();
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        int i = 0;
        super.g();
        this.h = false;
        while (true) {
            int i2 = i;
            if (i2 < this.j.size()) {
                this.j.get(i2).c();
                i = i2 + 1;
            } else {
                m();
                return;
            }
        }
    }
}
