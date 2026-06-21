package com.tsf.shell.e.h.a.b;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.e.e;
import com.tsf.shell.e.h.a.d;
import com.tsf.shell.e.i.b.e.i;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a implements d {
    private com.tsf.shell.e.h.a.c a;
    private int e;
    private o f;
    private int g;
    private c b = new c(this) { // from class: com.tsf.shell.e.h.a.b.a.1
        @Override // com.tsf.shell.e.h.a.b.c, com.censivn.C3DEngine.b.e.f
        public void g() {
            super.g();
            a.this.a.u();
        }
    };
    private e d = new e() { // from class: com.tsf.shell.e.h.a.b.a.2
        @Override // com.tsf.shell.e.e.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b b() {
            b bVar = new b(a.this);
            bVar.setAABBPX(com.tsf.shell.manager.o.b.a.T, com.tsf.shell.manager.o.b.a.U);
            bVar.position().y = -com.censivn.C3DEngine.b.b.a.a(30.0f);
            return bVar;
        }
    };
    private com.censivn.C3DEngine.b.b.a.b c = new com.censivn.C3DEngine.b.b.a.b();

    public a(com.tsf.shell.e.h.a.c cVar) {
        this.e = 8;
        this.a = cVar;
        this.c.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.a.a(180.0f));
        this.e = b(g.av());
    }

    public int k() {
        return this.e;
    }

    public void a(int i, boolean z) {
        this.e = b(i);
        if (z) {
            n();
            g.t(this.e);
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
            j removeChildAt = this.c.removeChildAt(0);
            if (removeChildAt instanceof b) {
                b bVar = (b) removeChildAt;
                bVar.q();
                bVar.textures().clear();
                this.d.a(bVar);
            }
        }
    }

    @Override // com.tsf.shell.e.h.a.d
    public void a(boolean z) {
        if (z) {
            x xVar = new x() { // from class: com.tsf.shell.e.h.a.b.a.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    a.this.c.removeFromParent();
                }
            };
            xVar.a(0);
            w.a(this.c);
            w.a(this.c, 300, xVar);
            return;
        }
        w.a(this.c);
        this.c.alpha(0.0f);
        this.c.removeFromParent();
    }

    @Override // com.tsf.shell.e.h.a.d
    public void b(boolean z) {
        if (z) {
            x xVar = new x();
            xVar.a(255);
            w.a(this.c);
            w.a(this.c, 300, xVar);
            return;
        }
        w.a(this.c);
        this.c.alpha(255.0f);
    }

    @Override // com.tsf.shell.e.h.a.d
    public l a() {
        return this.c;
    }

    @Override // com.tsf.shell.e.h.a.d
    public void b() {
    }

    @Override // com.tsf.shell.e.h.a.d
    public void c() {
        n();
    }

    private o m() {
        if (this.f == null) {
            this.f = new o();
            this.f.d(40);
            this.f.c(R.string.notic_no_recent_apps);
            this.f.b();
            this.f.minX(com.censivn.C3DEngine.b.b.a.z);
            this.f.maxX(com.censivn.C3DEngine.b.b.a.A);
        }
        return this.f;
    }

    private void n() {
        System.currentTimeMillis();
        ArrayList a = com.tsf.shell.manager.a.w.a().a().a(this.e);
        l();
        if (a.isEmpty()) {
            this.c.addChild(m());
            return;
        }
        if (this.f != null) {
            this.f.a();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < a.size()) {
                i iVar = (i) a.get(i2);
                b bVar = (b) this.d.c();
                bVar.a(iVar.bd());
                bVar.scale().setAll(0.9f, 0.9f, 1.0f);
                bVar.k.textures().clear();
                bVar.k.textures().addElement(iVar.aZ());
                this.c.addChild(bVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.e.h.a.d
    public void d() {
    }

    @Override // com.tsf.shell.e.h.a.d
    public void e() {
    }

    @Override // com.tsf.shell.e.h.a.d
    public void f() {
    }

    @Override // com.tsf.shell.e.h.a.d
    public void g() {
    }

    @Override // com.tsf.shell.e.h.a.d
    public void h() {
        if (this.f != null) {
            this.f.minX(com.censivn.C3DEngine.b.b.a.z);
            this.f.maxX(com.censivn.C3DEngine.b.b.a.A);
            this.c.onChildMeasure(this.f);
        }
    }

    @Override // com.tsf.shell.e.h.a.d
    public void i() {
        this.b.d();
    }

    public void a(int i) {
        this.g = i;
    }

    @Override // com.tsf.shell.e.h.a.d
    public int j() {
        return this.g;
    }
}
