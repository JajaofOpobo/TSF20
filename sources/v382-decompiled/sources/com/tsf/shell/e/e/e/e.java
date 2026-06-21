package com.tsf.shell.e.e.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.R;
import com.tsf.shell.utils.m;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    private TextureElement a;
    private TextureElement b;
    private TextureElement c;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private d g;
    private d h;
    private d i;
    private d j;
    private d k;
    private d l;
    private j m;
    private l n;
    private float o;
    private float p;
    private boolean q = false;
    private boolean r = false;
    private com.tsf.shell.manager.n.b s;

    public void a() {
        boolean z = false;
        this.a = x.b(R.drawable.editer_icon_delete);
        this.b = x.b(R.drawable.editer_icon_desktop);
        this.c = x.b(R.drawable.editer_icon_grid);
        this.d = x.b(R.drawable.editer_icon_info);
        this.e = x.b(R.drawable.editer_icon_setting);
        this.f = x.b(R.drawable.editer_icon_shadow);
        this.g = new d();
        this.h = new d();
        this.i = new d();
        this.j = new d();
        this.k = new d();
        this.l = new d();
        this.n = new l() { // from class: com.tsf.shell.e.e.e.e.1
            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public boolean removeChild(com.censivn.C3DEngine.b.f.j jVar) {
                boolean removeChild = super.removeChild(jVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChild;
            }

            @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public void addChild(com.censivn.C3DEngine.b.f.j jVar) {
                if (parent() == null) {
                    com.tsf.shell.manager.a.j.a(this);
                }
                jVar.removeFromParent();
                super.addChild(jVar);
                invalidate();
            }
        };
        f fVar = new f(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, z) { // from class: com.tsf.shell.e.e.e.e.2
            @Override // com.tsf.shell.e.e.e.f, com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar) {
                super.a(gVar);
                w.a(3);
                com.tsf.shell.manager.a.q.a(-52736);
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar) {
                return true;
            }

            @Override // com.tsf.shell.e.e.e.f, com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar) {
                super.e(gVar);
                final com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) gVar;
                ArrayList arrayList = new ArrayList();
                if (cVar instanceof com.tsf.shell.e.i.e) {
                    com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) cVar;
                    if (eVar.as()) {
                        Iterator it = eVar.aw().iterator();
                        while (it.hasNext()) {
                            arrayList.add((com.tsf.shell.e.i.e) it.next());
                        }
                    }
                }
                arrayList.add(cVar);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.tsf.shell.e.i.c cVar2 = (com.tsf.shell.e.i.c) it2.next();
                    cVar2.removeFromParent();
                    com.tsf.shell.manager.a.j.a(cVar2);
                }
                if (arrayList.size() > 1) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        com.tsf.shell.manager.r.c.i.a((com.tsf.shell.e.i.c) it3.next(), (Runnable) null);
                    }
                } else if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                    com.tsf.shell.manager.r.c.i.a(cVar, new Runnable() { // from class: com.tsf.shell.e.e.e.e.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.e.i.a.c cVar3 = (com.tsf.shell.e.i.a.c) cVar.getMouseEventListener();
                            cVar.clearDefaultColor();
                            cVar3.a(new float[]{cVar3.b, cVar3.d}, false);
                        }
                    }, null);
                } else {
                    com.tsf.shell.manager.r.c.i.a(cVar, (Runnable) null);
                }
            }

            @Override // com.tsf.shell.e.e.e.f, com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar) {
                super.d(gVar);
                ((com.tsf.shell.e.i.c) gVar).clearDefaultColor();
                com.tsf.shell.manager.a.q.a();
            }
        };
        fVar.alpha(0.0f);
        fVar.scale().setAll(0.0f, 0.0f, 1.0f);
        fVar.calAABB(1.5f, 1.5f, 1.5f);
        this.g.h = fVar;
        fVar.textures().addElement(this.a);
        this.g.addChild(fVar);
        this.g.setAABBPX(fVar.minX(), fVar.minY(), fVar.minZ(), fVar.maxX(), fVar.maxY(), fVar.maxZ());
        g gVar = new g(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, z) { // from class: com.tsf.shell.e.e.e.e.3
            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar2) {
                w.a(3);
                e.this.m.b = gVar2;
                com.censivn.C3DEngine.a.a().b(e.this.m, 400L);
                com.tsf.shell.manager.a.q.a(-16728065);
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar2) {
                return false;
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar2) {
                com.censivn.C3DEngine.a.a().g(e.this.m);
                e.this.m.b = null;
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar2) {
                com.censivn.C3DEngine.a.a().g(e.this.m);
                e.this.m.b = null;
                com.tsf.shell.manager.a.q.a();
            }
        };
        gVar.alpha(0.0f);
        gVar.scale().setAll(0.0f, 0.0f, 1.0f);
        gVar.calAABB(1.5f, 1.5f, 1.5f);
        this.h.h = gVar;
        gVar.textures().addElement(this.b);
        this.h.addChild(gVar);
        this.h.setAABBPX(gVar.minX(), gVar.minY(), gVar.minZ(), gVar.maxX(), gVar.maxY(), gVar.maxZ());
        g gVar2 = new g(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, z) { // from class: com.tsf.shell.e.e.e.e.4
            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar3) {
                if (!com.tsf.shell.manager.a.h.n().c()) {
                    com.tsf.shell.manager.a.h.n().d();
                    e.this.c();
                    com.tsf.shell.manager.a.h.d.a((com.tsf.shell.e.i.c) gVar3);
                    w.a(3);
                }
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar3) {
                return false;
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar3) {
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar3) {
                com.tsf.shell.manager.a.q.a();
            }
        };
        gVar2.alpha(0.0f);
        gVar2.scale().setAll(0.0f, 0.0f, 1.0f);
        gVar2.calAABB(1.5f, 1.5f, 1.5f);
        this.i.h = gVar2;
        gVar2.textures().addElement(this.c);
        this.i.addChild(gVar2);
        this.i.setAABBPX(gVar2.minX(), gVar2.minY(), gVar2.minZ(), gVar2.maxX(), gVar2.maxY(), gVar2.maxZ());
        f fVar2 = new f(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, z) { // from class: com.tsf.shell.e.e.e.e.5
            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.e.e.e.f, com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar3) {
                super.a(gVar3);
                w.a(3);
                ((com.tsf.shell.e.i.c) gVar3).setDefaultColor(com.tsf.shell.manager.o.c.c);
                com.tsf.shell.manager.a.q.a(-52736);
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar3) {
                super.b(gVar3);
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) gVar3;
                cVar.clearDefaultColor();
                com.tsf.shell.manager.a.q.a();
                return com.tsf.shell.manager.a.h.t().d(cVar);
            }

            @Override // com.tsf.shell.e.e.e.f, com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar3) {
                super.e(gVar3);
            }

            @Override // com.tsf.shell.e.e.e.f, com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar3) {
                super.d(gVar3);
                ((com.tsf.shell.e.i.c) gVar3).clearDefaultColor();
                com.tsf.shell.manager.a.q.a();
            }
        };
        fVar2.alpha(0.0f);
        fVar2.scale().setAll(0.0f, 0.0f, 1.0f);
        fVar2.calAABB(1.5f, 1.5f, 1.5f);
        this.j.h = fVar2;
        fVar2.textures().addElement(this.a);
        this.j.addChild(fVar2);
        this.j.setAABBPX(fVar2.minX(), fVar2.minY(), fVar2.minZ(), fVar2.maxX(), fVar2.maxY(), fVar2.maxZ());
        g gVar3 = new g(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, z) { // from class: com.tsf.shell.e.e.e.e.6
            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar4) {
                w.a(3);
                com.tsf.shell.manager.a.q.a(-16728065);
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean b(final com.tsf.shell.e.e.g gVar4) {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.e.e.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (gVar4 instanceof com.tsf.shell.e.i.b.e.i) {
                            ((com.tsf.shell.e.i.b.e.i) gVar4).bh();
                        }
                    }
                }, 250L);
                return false;
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar4) {
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar4) {
                com.tsf.shell.manager.a.q.a();
            }
        };
        gVar3.alpha(0.0f);
        gVar3.scale().setAll(0.0f, 0.0f, 1.0f);
        gVar3.calAABB(1.5f, 1.5f, 1.5f);
        this.k.h = gVar3;
        gVar3.textures().addElement(this.d);
        this.k.addChild(gVar3);
        this.k.setAABBPX(gVar3.minX(), gVar3.minY(), gVar3.minZ(), gVar3.maxX(), gVar3.maxY(), gVar3.maxZ());
        g gVar4 = new g(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, z) { // from class: com.tsf.shell.e.e.e.e.7
            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar5) {
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar5) {
                return false;
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void e(com.tsf.shell.e.e.g gVar5) {
            }

            @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
            public void d(com.tsf.shell.e.e.g gVar5) {
            }
        };
        gVar4.alpha(0.0f);
        gVar4.scale().setAll(0.0f, 0.0f, 1.0f);
        gVar4.calAABB(1.5f, 1.5f, 1.5f);
        this.l.h = gVar4;
        gVar4.textures().addElement(this.e);
        this.l.addChild(gVar4);
        this.l.setAABBPX(gVar4.minX(), gVar4.minY(), gVar4.minZ(), gVar4.maxX(), gVar4.maxY(), gVar4.maxZ());
        this.m = new j() { // from class: com.tsf.shell.e.e.e.e.8
            @Override // com.tsf.shell.e.e.e.j
            public void a(com.tsf.shell.e.e.g gVar5) {
                com.tsf.shell.manager.a.h.b((com.tsf.shell.e.i.c) gVar5);
            }
        };
    }

    public TextureElement b() {
        return this.f;
    }

    public void a(com.tsf.shell.e.i.c cVar, float f, float f2, boolean z, int... iArr) {
        float f3;
        float f4;
        if (cVar.S()) {
            this.q = false;
            this.o = f;
            this.p = f2;
            this.s = com.tsf.shell.manager.a.q.a(this.s);
            this.r = true;
            int length = iArr.length;
            if (length == 1) {
                f4 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = com.censivn.C3DEngine.b.b.a.D / length;
                f4 = com.censivn.C3DEngine.b.b.a.z + (f3 / 2.0f);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                d dVar = null;
                switch (i2) {
                    case 0:
                        dVar = this.g;
                        break;
                    case 1:
                        dVar = this.h;
                        break;
                    case 2:
                        dVar = this.i;
                        break;
                    case 3:
                        dVar = this.j;
                        break;
                    case 4:
                        dVar = this.l;
                        break;
                    case 5:
                        dVar = this.k;
                        break;
                }
                if (dVar == null) {
                    m.a(this, "ElementEditer wrong show type:" + i2);
                } else {
                    dVar.a();
                    dVar.a((i * f3) + f4, com.censivn.C3DEngine.b.b.a.I - (com.tsf.shell.manager.a.q.b() / 2.0f), true);
                    arrayList.add(dVar);
                }
            }
            Iterator it = this.n.children().iterator();
            while (it.hasNext()) {
                d dVar2 = (d) ((com.censivn.C3DEngine.b.f.j) it.next());
                if (!arrayList.contains(dVar2)) {
                    dVar2.c();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d dVar3 = (d) it2.next();
                dVar3.b();
                this.n.addChild(dVar3);
            }
        }
    }

    public void c() {
        if (Thread.currentThread().getId() != com.censivn.C3DEngine.a.i.f) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.e.e.9
                @Override // java.lang.Runnable
                public void run() {
                    e.this.c();
                }
            });
        } else if (this.r) {
            com.tsf.shell.manager.a.q.b(this.s);
            this.r = false;
            Iterator it = this.n.children().iterator();
            while (it.hasNext()) {
                ((d) ((com.censivn.C3DEngine.b.f.j) it.next())).c();
            }
        }
    }

    public void a(float f, float f2) {
        if (this.r) {
            if (this.q && x.b(this.o, this.p, f, f2) > com.censivn.C3DEngine.b.b.a.a(250.0f)) {
                Iterator it = this.n.children().iterator();
                while (it.hasNext()) {
                    ((d) ((com.censivn.C3DEngine.b.f.j) it.next())).a();
                }
            }
            Iterator it2 = this.n.children().iterator();
            while (it2.hasNext()) {
                d dVar = (d) ((com.censivn.C3DEngine.b.f.j) it2.next());
                dVar.a(x.b(dVar.c, dVar.d, f, f2), f, f2);
            }
        }
    }

    public d d() {
        return this.g;
    }
}
