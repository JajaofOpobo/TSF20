package com.tsf.shell.f.e.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.manager.n.a;
import com.tsf.shell.manager.r.c.g;
import com.tsf.shell.utils.l;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c {
    private TextureElement a;
    private TextureElement b;
    private TextureElement c;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private com.tsf.shell.f.e.e.b g;
    private com.tsf.shell.f.e.e.b h;
    private com.tsf.shell.f.e.e.b i;
    private com.tsf.shell.f.e.e.b j;
    private com.tsf.shell.f.e.e.b k;
    private com.tsf.shell.f.e.e.b l;
    private f m;
    private j n;
    private float o;
    private float p;
    private boolean q = false;
    private boolean r = false;
    private a.C0133a s;

    public void a() {
        this.a = x.b(b.d.editer_icon_delete);
        this.b = x.b(b.d.editer_icon_desktop);
        this.c = x.b(b.d.editer_icon_grid);
        this.d = x.b(b.d.editer_icon_info);
        this.e = x.b(b.d.editer_icon_setting);
        this.f = x.b(b.d.editer_icon_shadow);
        this.g = new com.tsf.shell.f.e.e.b();
        this.h = new com.tsf.shell.f.e.e.b();
        this.i = new com.tsf.shell.f.e.e.b();
        this.j = new com.tsf.shell.f.e.e.b();
        this.k = new com.tsf.shell.f.e.e.b();
        this.l = new com.tsf.shell.f.e.e.b();
        this.n = new j() { // from class: com.tsf.shell.f.e.e.c.1
            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public boolean removeChild(i iVar) {
                boolean removeChild = super.removeChild(iVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChild;
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public void addChild(i iVar) {
                if (parent() == null) {
                    com.tsf.shell.manager.a.j.a(this);
                }
                iVar.removeFromParent();
                super.addChild(iVar);
                invalidate();
            }
        };
        a aVar = new a(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.2
            @Override // com.tsf.shell.f.e.e.c.a, com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                super.a(fVar);
                w.a(3);
                com.tsf.shell.manager.a.q.a(-52736);
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean b(com.tsf.shell.f.e.f fVar) {
                return true;
            }

            @Override // com.tsf.shell.f.e.e.c.a, com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
                super.e(fVar);
                final com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) fVar;
                ArrayList arrayList = new ArrayList();
                if (bVar instanceof com.tsf.shell.f.i.c) {
                    com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) bVar;
                    if (cVar.as()) {
                        Iterator<com.tsf.shell.f.i.c> it = cVar.aw().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next());
                        }
                    }
                }
                arrayList.add(bVar);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.tsf.shell.f.i.b bVar2 = (com.tsf.shell.f.i.b) it2.next();
                    bVar2.removeFromParent();
                    com.tsf.shell.manager.a.j.a(bVar2);
                }
                if (arrayList.size() > 1) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        g.a((com.tsf.shell.f.i.b) it3.next(), (Runnable) null);
                    }
                } else if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                    g.a(bVar, new Runnable() { // from class: com.tsf.shell.f.e.e.c.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.f.i.a.c cVar2 = (com.tsf.shell.f.i.a.c) bVar.getMouseEventListener();
                            bVar.clearDefaultColor();
                            cVar2.a(new float[]{cVar2.b, cVar2.d}, false);
                        }
                    }, null);
                } else {
                    g.a(bVar, (Runnable) null);
                }
            }

            @Override // com.tsf.shell.f.e.e.c.a, com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
                super.d(fVar);
                ((com.tsf.shell.f.i.b) fVar).clearDefaultColor();
                com.tsf.shell.manager.a.q.a();
            }
        };
        aVar.alpha(0.0f);
        aVar.scale().setAll(0.0f, 0.0f, 1.0f);
        aVar.calAABB(1.5f, 1.5f, 1.5f);
        this.g.h = aVar;
        aVar.textures().addElement(this.a);
        this.g.addChild(aVar);
        this.g.setAABBPX(aVar.minX(), aVar.minY(), aVar.minZ(), aVar.maxX(), aVar.maxY(), aVar.maxZ());
        b bVar = new b(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.3
            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                w.a(3);
                c.this.m.b = fVar;
                com.censivn.C3DEngine.a.a().b(c.this.m, 400L);
                com.tsf.shell.manager.a.q.a(-16728065);
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean b(com.tsf.shell.f.e.f fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
                com.censivn.C3DEngine.a.a().g(c.this.m);
                c.this.m.b = null;
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
                com.censivn.C3DEngine.a.a().g(c.this.m);
                c.this.m.b = null;
                com.tsf.shell.manager.a.q.a();
            }
        };
        bVar.alpha(0.0f);
        bVar.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar.calAABB(1.5f, 1.5f, 1.5f);
        this.h.h = bVar;
        bVar.textures().addElement(this.b);
        this.h.addChild(bVar);
        this.h.setAABBPX(bVar.minX(), bVar.minY(), bVar.minZ(), bVar.maxX(), bVar.maxY(), bVar.maxZ());
        b bVar2 = new b(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.4
            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                if (!com.tsf.shell.manager.a.h.n().c()) {
                    com.tsf.shell.manager.a.h.n().d();
                    c.this.c();
                    com.tsf.shell.manager.a.h.d.a((com.tsf.shell.f.i.b) fVar);
                    w.a(3);
                }
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean b(com.tsf.shell.f.e.f fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
                com.tsf.shell.manager.a.q.a();
            }
        };
        bVar2.alpha(0.0f);
        bVar2.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar2.calAABB(1.5f, 1.5f, 1.5f);
        this.i.h = bVar2;
        bVar2.textures().addElement(this.c);
        this.i.addChild(bVar2);
        this.i.setAABBPX(bVar2.minX(), bVar2.minY(), bVar2.minZ(), bVar2.maxX(), bVar2.maxY(), bVar2.maxZ());
        a aVar2 = new a(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.5
            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.f.e.e.c.a, com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                super.a(fVar);
                w.a(3);
                ((com.tsf.shell.f.i.b) fVar).setDefaultColor(com.tsf.shell.manager.o.c.c);
                com.tsf.shell.manager.a.q.a(-52736);
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean b(com.tsf.shell.f.e.f fVar) {
                super.b(fVar);
                com.tsf.shell.f.i.b bVar3 = (com.tsf.shell.f.i.b) fVar;
                bVar3.clearDefaultColor();
                com.tsf.shell.manager.a.q.a();
                return com.tsf.shell.manager.a.h.t().d(bVar3);
            }

            @Override // com.tsf.shell.f.e.e.c.a, com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
                super.e(fVar);
            }

            @Override // com.tsf.shell.f.e.e.c.a, com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
                super.d(fVar);
                ((com.tsf.shell.f.i.b) fVar).clearDefaultColor();
                com.tsf.shell.manager.a.q.a();
            }
        };
        aVar2.alpha(0.0f);
        aVar2.scale().setAll(0.0f, 0.0f, 1.0f);
        aVar2.calAABB(1.5f, 1.5f, 1.5f);
        this.j.h = aVar2;
        aVar2.textures().addElement(this.a);
        this.j.addChild(aVar2);
        this.j.setAABBPX(aVar2.minX(), aVar2.minY(), aVar2.minZ(), aVar2.maxX(), aVar2.maxY(), aVar2.maxZ());
        b bVar3 = new b(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.6
            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                w.a(3);
                com.tsf.shell.manager.a.q.a(-16728065);
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean b(final com.tsf.shell.f.e.f fVar) {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.e.e.c.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fVar instanceof com.tsf.shell.f.i.b.e.g) {
                            ((com.tsf.shell.f.i.b.e.g) fVar).bh();
                        }
                    }
                }, 250L);
                return false;
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
                com.tsf.shell.manager.a.q.a();
            }
        };
        bVar3.alpha(0.0f);
        bVar3.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar3.calAABB(1.5f, 1.5f, 1.5f);
        this.k.h = bVar3;
        bVar3.textures().addElement(this.d);
        this.k.addChild(bVar3);
        this.k.setAABBPX(bVar3.minX(), bVar3.minY(), bVar3.minZ(), bVar3.maxX(), bVar3.maxY(), bVar3.maxZ());
        b bVar4 = new b(com.censivn.C3DEngine.b.b.a.c * 120.0f, com.censivn.C3DEngine.b.b.a.c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.7
            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public boolean b(com.tsf.shell.f.e.f fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void e(com.tsf.shell.f.e.f fVar) {
            }

            @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
            public void d(com.tsf.shell.f.e.f fVar) {
            }
        };
        bVar4.alpha(0.0f);
        bVar4.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar4.calAABB(1.5f, 1.5f, 1.5f);
        this.l.h = bVar4;
        bVar4.textures().addElement(this.e);
        this.l.addChild(bVar4);
        this.l.setAABBPX(bVar4.minX(), bVar4.minY(), bVar4.minZ(), bVar4.maxX(), bVar4.maxY(), bVar4.maxZ());
        this.m = new f() { // from class: com.tsf.shell.f.e.e.c.8
            @Override // com.tsf.shell.f.e.e.f
            public void a(com.tsf.shell.f.e.f fVar) {
                com.tsf.shell.manager.a.h.b((com.tsf.shell.f.i.b) fVar);
            }
        };
    }

    public TextureElement b() {
        return this.f;
    }

    public void a(com.tsf.shell.f.i.b bVar, float f, float f2, boolean z, int... iArr) {
        float f3;
        float f4;
        if (bVar.S()) {
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
                com.tsf.shell.f.e.e.b bVar2 = null;
                switch (i2) {
                    case 0:
                        bVar2 = this.g;
                        break;
                    case 1:
                        bVar2 = this.h;
                        break;
                    case 2:
                        bVar2 = this.i;
                        break;
                    case 3:
                        bVar2 = this.j;
                        break;
                    case 4:
                        bVar2 = this.l;
                        break;
                    case 5:
                        bVar2 = this.k;
                        break;
                }
                if (bVar2 == null) {
                    l.a(this, "ElementEditer wrong show type:" + i2);
                } else {
                    bVar2.a();
                    bVar2.a((i * f3) + f4, com.censivn.C3DEngine.b.b.a.I - (com.tsf.shell.manager.a.q.b() / 2.0f), true);
                    arrayList.add(bVar2);
                }
            }
            Iterator<i> it = this.n.children().iterator();
            while (it.hasNext()) {
                com.tsf.shell.f.e.e.b bVar3 = (com.tsf.shell.f.e.e.b) it.next();
                if (!arrayList.contains(bVar3)) {
                    bVar3.c();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.tsf.shell.f.e.e.b bVar4 = (com.tsf.shell.f.e.e.b) it2.next();
                bVar4.b();
                this.n.addChild(bVar4);
            }
        }
    }

    public void c() {
        if (Thread.currentThread().getId() != com.censivn.C3DEngine.a.e.f) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.e.e.c.9
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c();
                }
            });
        } else if (this.r) {
            com.tsf.shell.manager.a.q.b(this.s);
            this.r = false;
            Iterator<i> it = this.n.children().iterator();
            while (it.hasNext()) {
                ((com.tsf.shell.f.e.e.b) it.next()).c();
            }
        }
    }

    public void a(float f, float f2) {
        if (this.r) {
            if (this.q && x.b(this.o, this.p, f, f2) > com.censivn.C3DEngine.b.b.a.a(250.0f)) {
                Iterator<i> it = this.n.children().iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.f.e.e.b) it.next()).a();
                }
            }
            Iterator<i> it2 = this.n.children().iterator();
            while (it2.hasNext()) {
                com.tsf.shell.f.e.e.b bVar = (com.tsf.shell.f.e.e.b) it2.next();
                bVar.a(x.b(bVar.c, bVar.d, f, f2), f, f2);
            }
        }
    }

    public com.tsf.shell.f.e.e.b d() {
        return this.g;
    }

    /* loaded from: classes.dex */
    public static class b extends e {
        public b(float f, float f2, boolean z) {
            super(f, f2, z);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends b {
        private static TextureElement d = new TextureElement(0, false);
        private k a;

        public a(float f, float f2, boolean z) {
            super(f, f2, z);
            this.a = new k(com.censivn.C3DEngine.b.b.a.a(64.0f), com.censivn.C3DEngine.b.b.a.a(14.0f), false) { // from class: com.tsf.shell.f.e.e.c.a.1
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    if (a.d.id == 0) {
                        com.censivn.C3DEngine.a.g().a(a.d, b.d.editer_icon_delete_cap);
                    }
                }
            };
            this.a.moveAllPointsPX(this.a.b() / 2.0f, this.a.c() / 2.0f, 0.0f);
            this.a.position().x = (-this.a.b()) / 2.0f;
            this.a.position().y = com.censivn.C3DEngine.b.b.a.a(18.0f);
            this.a.textures().addElement(d);
            addChild(this.a);
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public void a(com.tsf.shell.f.e.f fVar) {
            e();
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public void e(com.tsf.shell.f.e.f fVar) {
            f();
        }

        @Override // com.tsf.shell.f.e.e.e, com.tsf.shell.f.e.f
        public void d(com.tsf.shell.f.e.f fVar) {
            f();
        }

        private void e() {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.e(50.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(this.a);
            com.censivn.C3DEngine.b.g.c.a(this.a, VEasing.Linear.easeNone, dVar);
        }

        private void f() {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.e(0.0f);
            com.censivn.C3DEngine.b.g.c.a(this.a);
            com.censivn.C3DEngine.b.g.c.a(this.a, 300, dVar);
        }
    }
}
