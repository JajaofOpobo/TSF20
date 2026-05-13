package com.tsf.shell.f.f.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.manager.a.g;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d extends com.tsf.shell.f.f.a.a.a.a {
    private g.b a;
    private com.tsf.shell.f.e.d<com.tsf.shell.f.i.b.e.e> b;
    private ArrayList<com.tsf.shell.f.i.b.e.g> c;
    private TextureElement d;
    private k e;
    private float f;

    public d(c cVar) {
        super(cVar, b.d.allapps_recent_icon);
        this.d = new TextureElement(0, false);
        this.f = -com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.c = new ArrayList<>();
        this.b = new com.tsf.shell.f.e.d<com.tsf.shell.f.i.b.e.e>() { // from class: com.tsf.shell.f.f.a.a.d.1
            @Override // com.tsf.shell.f.e.d
            /* renamed from: a */
            public com.tsf.shell.f.i.b.e.e b() {
                return new com.tsf.shell.f.i.b.e.e();
            }
        };
        this.a = new g.b() { // from class: com.tsf.shell.f.f.a.a.d.2
            @Override // com.tsf.shell.manager.a.g.b
            public void a(ArrayList<com.tsf.shell.f.i.b.e.g> arrayList) {
                d.this.g();
            }
        };
        com.tsf.shell.manager.a.w.a().a().a(this.a);
        this.e = new k(com.censivn.C3DEngine.b.b.a.a(60.0f), com.censivn.C3DEngine.b.b.a.a(50.0f), false) { // from class: com.tsf.shell.f.f.a.a.d.3
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (d.this.d.id == 0) {
                    com.censivn.C3DEngine.a.g().a(d.this.d, b.d.allapps_direction_swap);
                }
            }
        };
        this.e.position().y = this.f;
        this.e.textures().addElement(this.d);
        this.e.calAABB(3.0f, 3.0f, 1.0f);
        i().addChild(this.e);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.f.f.a.a.d.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                d.this.h().a();
            }
        });
    }

    @Override // com.tsf.shell.f.f.a.a.a.c
    public void a(int i, boolean z) {
        super.a(i, z);
        float r = r();
        com.censivn.C3DEngine.b.g.c.a(this.e);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            if (i == c.b) {
                dVar.e(0.0f);
            } else {
                dVar.e(180.0f);
            }
            dVar.f(r);
            dVar.a(com.censivn.C3DEngine.b.g.a.n);
            com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
            return;
        }
        this.e.position().x = r;
        if (i == c.b) {
            this.e.rotation().z = 0.0f;
        } else {
            this.e.rotation().z = 180.0f;
        }
    }

    @Override // com.tsf.shell.f.f.a.a.a.c
    public void e() {
        super.e();
        com.tsf.shell.f.f.a.a.b.b.a(this.e, this.f - c.a, this.f);
    }

    @Override // com.tsf.shell.f.f.a.a.a.c, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        this.e.position().x = r();
        if (q() == c.b) {
            this.e.rotation().z = 0.0f;
        } else {
            this.e.rotation().z = 180.0f;
        }
    }

    @Override // com.tsf.shell.f.f.a.a.a.a, com.tsf.shell.f.f.a.a.a.c
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
        Iterator<com.tsf.shell.f.i.b.e.g> it = com.tsf.shell.manager.a.w.a().a().a(k <= 12 ? k : 12).iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.e c = this.b.c();
            c.a(it.next());
            this.c.add(c);
        }
        j();
        a(this.c);
    }

    private void v() {
        Iterator<com.tsf.shell.f.i.b.e.g> it = this.c.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.e eVar = (com.tsf.shell.f.i.b.e.e) it.next();
            eVar.aW();
            this.b.a(eVar);
        }
        this.c.clear();
    }
}
