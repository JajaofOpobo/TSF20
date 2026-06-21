package com.tsf.shell.e.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.manager.a.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends com.tsf.shell.e.f.a.a.a.a {
    private l a;
    private com.tsf.shell.e.e.e b;
    private ArrayList c;
    private TextureElement d;
    private m e;
    private float f;

    public h(f fVar) {
        super(fVar, R.drawable.allapps_recent_icon);
        this.d = new TextureElement(0, false);
        this.f = -com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.c = new ArrayList();
        this.b = new com.tsf.shell.e.e.e() { // from class: com.tsf.shell.e.f.a.a.h.1
            @Override // com.tsf.shell.e.e.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.tsf.shell.e.i.b.e.g b() {
                return new com.tsf.shell.e.i.b.e.g();
            }
        };
        this.a = new l() { // from class: com.tsf.shell.e.f.a.a.h.2
            @Override // com.tsf.shell.manager.a.l
            public void a(ArrayList arrayList) {
                h.this.g();
            }
        };
        com.tsf.shell.manager.a.w.a().a().a(this.a);
        this.e = new m(com.censivn.C3DEngine.b.b.a.a(60.0f), com.censivn.C3DEngine.b.b.a.a(50.0f), false) { // from class: com.tsf.shell.e.f.a.a.h.3
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (h.this.d.id == 0) {
                    com.censivn.C3DEngine.a.g().a(h.this.d, R.drawable.allapps_direction_swap);
                }
            }
        };
        this.e.position().y = this.f;
        this.e.textures().addElement(this.d);
        this.e.calAABB(3.0f, 3.0f, 1.0f);
        i().addChild(this.e);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.e.f.a.a.h.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                h.this.h().a();
            }
        });
    }

    @Override // com.tsf.shell.e.f.a.a.a.c
    public void a(int i, boolean z) {
        super.a(i, z);
        float r = r();
        w.a(this.e);
        if (z) {
            x xVar = new x();
            if (i == f.b) {
                xVar.e(0.0f);
            } else {
                xVar.e(180.0f);
            }
            xVar.f(r);
            xVar.a(com.censivn.C3DEngine.b.g.a.n);
            w.a(this.e, 500, xVar);
            return;
        }
        this.e.position().x = r;
        if (i == f.b) {
            this.e.rotation().z = 0.0f;
        } else {
            this.e.rotation().z = 180.0f;
        }
    }

    @Override // com.tsf.shell.e.f.a.a.a.c
    public void e() {
        super.e();
        com.tsf.shell.e.f.a.a.b.b.a(this.e, this.f - f.a, this.f);
    }

    @Override // com.tsf.shell.e.f.a.a.a.c, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        this.e.position().x = r();
        if (q() == f.b) {
            this.e.rotation().z = 0.0f;
        } else {
            this.e.rotation().z = 180.0f;
        }
    }

    @Override // com.tsf.shell.e.f.a.a.a.a, com.tsf.shell.e.f.a.a.a.c
    public void f() {
        super.f();
        if (this.d.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
        v();
    }

    public void g() {
        v();
        int k = k() * 3;
        Iterator it = com.tsf.shell.manager.a.w.a().a().a(k <= 12 ? k : 12).iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            com.tsf.shell.e.i.b.e.g gVar = (com.tsf.shell.e.i.b.e.g) this.b.c();
            gVar.a(iVar);
            this.c.add(gVar);
        }
        j();
        a(this.c);
    }

    private void v() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.g gVar = (com.tsf.shell.e.i.b.e.g) ((com.tsf.shell.e.i.b.e.i) it.next());
            gVar.aW();
            this.b.a(gVar);
        }
        this.c.clear();
    }
}
