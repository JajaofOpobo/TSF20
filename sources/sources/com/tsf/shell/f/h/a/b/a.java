package com.tsf.shell.f.h.a.b;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.f.e.d;
import com.tsf.shell.f.h.a.c;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.manager.a.f;
import com.tsf.shell.manager.b.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a implements c.a {
    private c a;
    private int e;
    private m f;
    private int g;
    private b b = new b(this) { // from class: com.tsf.shell.f.h.a.b.a.1
        @Override // com.tsf.shell.f.h.a.b.b, com.censivn.C3DEngine.b.e.c
        public void g() {
            super.g();
            a.this.a.u();
        }
    };
    private d<C0112a> d = new d<C0112a>() { // from class: com.tsf.shell.f.h.a.b.a.2
        @Override // com.tsf.shell.f.e.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0112a b() {
            C0112a c0112a = a.this.new C0112a();
            c0112a.setAABBPX(com.tsf.shell.manager.o.b.a.T, com.tsf.shell.manager.o.b.a.U);
            c0112a.position().y = -com.censivn.C3DEngine.b.b.a.a(30.0f);
            return c0112a;
        }
    };
    private com.censivn.C3DEngine.b.b.a.b c = new com.censivn.C3DEngine.b.b.a.b();

    public a(c cVar) {
        this.e = 8;
        this.a = cVar;
        this.c.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.a.a(180.0f));
        this.e = b(e.ax());
    }

    public int k() {
        return this.e;
    }

    public void a(int i, boolean z) {
        this.e = b(i);
        if (z) {
            n();
            e.u(this.e);
        }
    }

    private int b(int i) {
        if (i < 3) {
            return 3;
        }
        if (i > 15) {
            return 15;
        }
        return i;
    }

    private void l() {
        while (!this.c.children().isEmpty()) {
            i iVarRemoveChildAt = this.c.removeChildAt(0);
            if (iVarRemoveChildAt instanceof C0112a) {
                C0112a c0112a = (C0112a) iVarRemoveChildAt;
                c0112a.q();
                c0112a.textures().clear();
                this.d.a(c0112a);
            }
        }
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.a.b.a.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.c.removeFromParent();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.c.a(this.c);
        this.c.alpha(0.0f);
        this.c.removeFromParent();
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void b(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.c.a(this.c);
        this.c.alpha(255.0f);
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public j a() {
        return this.c;
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void b() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void c() {
        n();
    }

    private m m() {
        if (this.f == null) {
            this.f = new m();
            this.f.d(40);
            this.f.c(b.i.notic_no_recent_apps);
            this.f.b();
            this.f.minX(com.censivn.C3DEngine.b.b.a.z);
            this.f.maxX(com.censivn.C3DEngine.b.b.a.A);
        }
        return this.f;
    }

    private void n() {
        System.currentTimeMillis();
        ArrayList<g> arrayListA = com.tsf.shell.manager.a.w.a().a().a(this.e);
        l();
        if (arrayListA.isEmpty()) {
            this.c.addChild(m());
            return;
        }
        if (this.f != null) {
            this.f.a();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayListA.size()) {
                g gVar = arrayListA.get(i2);
                C0112a c0112aC = this.d.c();
                c0112aC.a(gVar.bd());
                c0112aC.scale().setAll(0.9f, 0.9f, 1.0f);
                c0112aC.k.textures().clear();
                c0112aC.k.textures().addElement(gVar.aZ());
                this.c.addChild(c0112aC);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void d() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void e() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void f() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void g() {
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void h() {
        if (this.f != null) {
            this.f.minX(com.censivn.C3DEngine.b.b.a.z);
            this.f.maxX(com.censivn.C3DEngine.b.b.a.A);
            this.c.onChildMeasure(this.f);
        }
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public void i() {
        this.b.d();
    }

    public void a(int i) {
        this.g = i;
    }

    @Override // com.tsf.shell.f.h.a.c.a
    public int j() {
        return this.g;
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.h.a.b.a$a, reason: collision with other inner class name */
    class C0112a extends h {
        private f b;

        public C0112a() {
        }

        @Override // com.tsf.shell.f.i.b.e.b
        public void l() {
            if (this.b != null) {
                this.b.a();
            }
        }

        public void a(f fVar) {
            this.b = fVar;
        }

        public void q() {
            this.b = null;
        }
    }
}
