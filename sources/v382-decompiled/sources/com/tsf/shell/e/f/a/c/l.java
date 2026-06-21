package com.tsf.shell.e.f.a.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends j {
    private static com.tsf.shell.e.e.n l;
    private ArrayList g;
    private com.censivn.C3DEngine.b.f.l h;
    private float i;
    private float j;
    private com.tsf.shell.e.f.a.c.a.a k;

    public l(com.tsf.shell.e.f.a.m mVar, com.tsf.shell.e.f.a.j jVar) {
        super(mVar, jVar, 0, x.c(R.string.text_more));
        this.g = new ArrayList();
        com.tsf.shell.e.f.a.c.a.a aVar = new com.tsf.shell.e.f.a.c.a.a(new m(R.drawable.drawer_classification, x.c(R.string.text_classify)));
        this.k = aVar;
        this.k.a(com.tsf.shell.manager.p.f.j);
        this.g.add(aVar);
        this.g.add(new com.tsf.shell.e.f.a.c.a.b(new m(R.drawable.drawer_preferences, x.c(R.string.text_preferences)) { // from class: com.tsf.shell.e.f.a.c.l.1
            @Override // com.tsf.shell.e.f.a.c.m
            public void a() {
                com.tsf.shell.manager.a.B.d().d();
            }
        }));
        this.g.add(new com.tsf.shell.e.f.a.c.a.b(new m(R.drawable.drawer_clean, x.c(R.string.text_clean)) { // from class: com.tsf.shell.e.f.a.c.l.2
            @Override // com.tsf.shell.e.f.a.c.m
            public void a() {
                com.tsf.shell.k.a(R.string.mn_next_version_release);
            }
        }));
        this.g.add(new com.tsf.shell.e.f.a.c.a.b(new m(R.drawable.drawer_more_manager, x.c(R.string.menu_manage_apps)) { // from class: com.tsf.shell.e.f.a.c.l.3
            @Override // com.tsf.shell.e.f.a.c.m
            public void a() {
                Home.b().m();
            }
        }));
        this.g.add(new com.tsf.shell.e.f.a.c.a.b(new m(R.drawable.drawer_more_reset, x.c(R.string.text_reset)) { // from class: com.tsf.shell.e.f.a.c.l.4
            @Override // com.tsf.shell.e.f.a.c.m
            public void a() {
                com.tsf.shell.manager.a.h.t().am().c();
            }
        }));
        this.h = new com.censivn.C3DEngine.b.f.l();
        this.h.position().y = com.censivn.C3DEngine.b.b.a.a(20.0f);
        this.i = com.censivn.C3DEngine.b.b.a.b(12.0f) + com.tsf.shell.e.f.a.c.a.b.a;
        this.j = ((-this.i) * 2.0f) / 2.0f;
        float f = this.j;
        for (int i = 0; i < this.g.size(); i++) {
            com.tsf.shell.e.f.a.c.a.b bVar = (com.tsf.shell.e.f.a.c.a.b) this.g.get(i);
            bVar.position().x = f;
            if (i > 2) {
                bVar.visible(false);
                bVar.alpha(0.0f);
            } else if (i < 2) {
                f += this.i;
            }
            this.h.addChild(bVar);
        }
        e().addChild(this.h);
        com.tsf.shell.manager.p.g a = com.tsf.shell.manager.a.a.a(com.tsf.shell.manager.p.f.i);
        if (a.a()) {
            l = new com.tsf.shell.e.e.n();
            a.a(new com.tsf.shell.manager.p.h() { // from class: com.tsf.shell.e.f.a.c.l.5
                @Override // com.tsf.shell.manager.p.h
                public void a() {
                    l.l.removeFromParent();
                    l.l.a();
                }
            });
            l = new com.tsf.shell.e.e.n();
            l.position().y = com.censivn.C3DEngine.b.b.a.a(54.0f);
            l.position().x = com.censivn.C3DEngine.b.b.a.a(70.0f);
            e().addChild(l);
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void n() {
        super.n();
        com.tsf.shell.e.f.a.c.a.b.j();
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void p() {
        com.tsf.shell.e.f.a.c.a.b.k();
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b(boolean z) {
        Number3d.TEMPNUMBER3D.reset();
        this.h.localToGlobal(Number3d.TEMPNUMBER3D);
        this.b.h().globalToLocal(Number3d.TEMPNUMBER3D);
        float a = com.censivn.C3DEngine.b.b.a.a(200.0f);
        float f = Number3d.TEMPNUMBER3D.x;
        float f2 = Number3d.TEMPNUMBER3D.y;
        float f3 = com.tsf.shell.e.f.a.j.c;
        int numChildren = this.h.numChildren();
        float a2 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        int i = 0;
        float f4 = f3;
        while (i < numChildren) {
            com.tsf.shell.e.f.a.c.a.b bVar = (com.tsf.shell.e.f.a.c.a.b) this.g.get(i);
            bVar.removeFromParent();
            this.b.h().addChild(bVar);
            bVar.position().setAll(bVar.position().x + f, bVar.position().y + f2, 0.0f);
            bVar.b((i * 20) + 250);
            if (i < 3) {
                com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(bVar, (i / 3) + 2, a) { // from class: com.tsf.shell.e.f.a.c.l.6
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                    }
                };
                aVar.b(i % 2 == 0);
                aVar.f(f4);
                aVar.h(a2);
                aVar.a(255);
                w.a(bVar);
                w.a(bVar, (i * 50) + 600, aVar);
            } else {
                com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.a.c.l.7
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                    }
                };
                xVar.f(f4);
                xVar.h(a2);
                xVar.a(255);
                w.a(bVar);
                w.a(bVar, (i * 50) + 600, xVar);
            }
            bVar.visible(true);
            i++;
            f4 += com.tsf.shell.e.f.a.j.d;
        }
        this.b.e();
    }

    public void c() {
        if (this.k != null) {
            this.k.a();
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a() {
        this.b.f();
        this.k.a();
        float f = this.j;
        for (int i = 0; i < this.g.size(); i++) {
            Number3d.TEMPNUMBER3D.reset();
            final com.tsf.shell.e.f.a.c.a.b bVar = (com.tsf.shell.e.f.a.c.a.b) this.g.get(i);
            bVar.i();
            bVar.localToGlobal(Number3d.TEMPNUMBER3D);
            this.h.globalToLocal(Number3d.TEMPNUMBER3D);
            bVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
            float a = com.censivn.C3DEngine.b.b.a.a(200.0f);
            if (i < 3) {
                com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(bVar, (i / 3) + 2, a) { // from class: com.tsf.shell.e.f.a.c.l.8
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                    }
                };
                aVar.b(i % 2 == 0);
                aVar.f(f);
                if (i != 2) {
                    f += this.i;
                }
                w.a(bVar);
                w.a(bVar, (i * 50) + 600, aVar);
            } else {
                com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.a.c.l.9
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        bVar.visible(false);
                    }
                };
                xVar.f(f);
                xVar.h(0.0f);
                xVar.a(0);
                w.a(bVar);
                w.a(bVar, 600, xVar);
            }
            bVar.removeFromParent();
            this.h.addChild(bVar);
        }
        Number3d.TEMPNUMBER3D.reset();
        this.h.localToGlobal(Number3d.TEMPNUMBER3D);
        e().globalToLocal(Number3d.TEMPNUMBER3D);
        this.h.position().setAllFrom(Number3d.TEMPNUMBER3D);
        this.h.removeFromParent();
        e().addChild(this.h);
    }
}
