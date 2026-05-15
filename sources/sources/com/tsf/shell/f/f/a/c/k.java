package com.tsf.shell.f.f.a.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k extends i {
    private static com.tsf.shell.f.e.k l;
    private ArrayList<com.tsf.shell.f.f.a.c.a.b> g;
    private com.censivn.C3DEngine.b.f.j h;
    private float i;
    private float j;
    private com.tsf.shell.f.f.a.c.a.a k;

    public static class a {
        public String b;
        public int c;

        public a(int i, String str) {
            this.c = i;
            this.b = str;
        }

        public void a() {
        }
    }

    public k(com.tsf.shell.f.f.a.h hVar, com.tsf.shell.f.f.a.f fVar) {
        super(hVar, fVar, 0, x.c(b.i.text_more));
        this.g = new ArrayList<>();
        com.tsf.shell.f.f.a.c.a.a aVar = new com.tsf.shell.f.f.a.c.a.a(new a(b.d.drawer_classification, x.c(b.i.text_classify)));
        this.k = aVar;
        this.k.a(com.tsf.shell.manager.p.e.j);
        this.g.add(aVar);
        this.g.add(new com.tsf.shell.f.f.a.c.a.b(new a(b.d.drawer_preferences, x.c(b.i.text_preferences)) { // from class: com.tsf.shell.f.f.a.c.k.1
            @Override // com.tsf.shell.f.f.a.c.k.a
            public void a() {
                com.tsf.shell.manager.a.B.d().d();
            }
        }));
        this.g.add(new com.tsf.shell.f.f.a.c.a.b(new a(b.d.drawer_clean, x.c(b.i.text_clean)) { // from class: com.tsf.shell.f.f.a.c.k.2
            @Override // com.tsf.shell.f.f.a.c.k.a
            public void a() {
                com.tsf.shell.e.a(b.i.mn_next_version_release);
            }
        }));
        this.g.add(new com.tsf.shell.f.f.a.c.a.b(new a(b.d.drawer_more_manager, x.c(b.i.menu_manage_apps)) { // from class: com.tsf.shell.f.f.a.c.k.3
            @Override // com.tsf.shell.f.f.a.c.k.a
            public void a() {
                Home.b().m();
            }
        }));
        this.g.add(new com.tsf.shell.f.f.a.c.a.b(new a(b.d.drawer_more_reset, x.c(b.i.text_reset)) { // from class: com.tsf.shell.f.f.a.c.k.4
            @Override // com.tsf.shell.f.f.a.c.k.a
            public void a() {
                com.tsf.shell.manager.a.h.t().am().c();
            }
        }));
        this.h = new com.censivn.C3DEngine.b.f.j();
        this.h.position().y = com.censivn.C3DEngine.b.b.a.a(20.0f);
        this.i = com.censivn.C3DEngine.b.b.a.b(12.0f) + com.tsf.shell.f.f.a.c.a.b.a;
        this.j = ((-this.i) * 2.0f) / 2.0f;
        float f = this.j;
        for (int i = 0; i < this.g.size(); i++) {
            com.tsf.shell.f.f.a.c.a.b bVar = this.g.get(i);
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
        e.a aVarA = com.tsf.shell.manager.a.a.a(com.tsf.shell.manager.p.e.i);
        if (aVarA.a()) {
            l = new com.tsf.shell.f.e.k();
            aVarA.a(new e.a.C0142a() { // from class: com.tsf.shell.f.f.a.c.k.5
                @Override // com.tsf.shell.manager.p.e.a.C0142a
                public void a() {
                    k.l.removeFromParent();
                    k.l.a();
                }
            });
            l = new com.tsf.shell.f.e.k();
            l.position().y = com.censivn.C3DEngine.b.b.a.a(54.0f);
            l.position().x = com.censivn.C3DEngine.b.b.a.a(70.0f);
            e().addChild(l);
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void n() {
        super.n();
        com.tsf.shell.f.f.a.c.a.b.j();
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void p() {
        com.tsf.shell.f.f.a.c.a.b.k();
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b(boolean z) {
        Number3d.TEMPNUMBER3D.reset();
        this.h.localToGlobal(Number3d.TEMPNUMBER3D);
        this.b.h().globalToLocal(Number3d.TEMPNUMBER3D);
        float fA = com.censivn.C3DEngine.b.b.a.a(200.0f);
        float f = Number3d.TEMPNUMBER3D.x;
        float f2 = Number3d.TEMPNUMBER3D.y;
        float f3 = com.tsf.shell.f.f.a.f.c;
        int iNumChildren = this.h.numChildren();
        float fA2 = com.censivn.C3DEngine.b.b.a.a(20.0f);
        int i = 0;
        float f4 = f3;
        while (i < iNumChildren) {
            com.tsf.shell.f.f.a.c.a.b bVar = this.g.get(i);
            bVar.removeFromParent();
            this.b.h().addChild(bVar);
            bVar.position().setAll(bVar.position().x + f, bVar.position().y + f2, 0.0f);
            bVar.b((i * 20) + 250);
            if (i < 3) {
                com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(bVar, (i / 3) + 2, fA) { // from class: com.tsf.shell.f.f.a.c.k.6
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                aVar.b(i % 2 == 0);
                aVar.f(f4);
                aVar.h(fA2);
                aVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, (i * 50) + 600, aVar);
            } else {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.k.7
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                dVar.f(f4);
                dVar.h(fA2);
                dVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, (i * 50) + 600, dVar);
            }
            bVar.visible(true);
            i++;
            f4 += com.tsf.shell.f.f.a.f.d;
        }
        this.b.e();
    }

    public void c() {
        if (this.k != null) {
            this.k.a();
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a() {
        this.b.f();
        this.k.a();
        float f = this.j;
        for (int i = 0; i < this.g.size(); i++) {
            Number3d.TEMPNUMBER3D.reset();
            final com.tsf.shell.f.f.a.c.a.b bVar = this.g.get(i);
            bVar.i();
            bVar.localToGlobal(Number3d.TEMPNUMBER3D);
            this.h.globalToLocal(Number3d.TEMPNUMBER3D);
            bVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
            float fA = com.censivn.C3DEngine.b.b.a.a(200.0f);
            if (i < 3) {
                com.censivn.C3DEngine.b.g.c.a.a aVar = new com.censivn.C3DEngine.b.g.c.a.a(bVar, (i / 3) + 2, fA) { // from class: com.tsf.shell.f.f.a.c.k.8
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                aVar.b(i % 2 == 0);
                aVar.f(f);
                if (i != 2) {
                    f += this.i;
                }
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, (i * 50) + 600, aVar);
            } else {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.k.9
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        bVar.visible(false);
                    }
                };
                dVar.f(f);
                dVar.h(0.0f);
                dVar.a(0);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, 600, dVar);
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
