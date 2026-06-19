package com.tsf.shell.f.e._e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.manager.n.ToastOverlayController;
import com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil;
import com.tsf.shell.utils.ErrorThrower;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SelectionState {
    private TextureElement a;
    private TextureElement b;
    private TextureElement c;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private com.tsf.shell.f.e._e.SelectionCallback g;
    private com.tsf.shell.f.e._e.SelectionCallback h;
    private com.tsf.shell.f.e._e.SelectionCallback i;
    private com.tsf.shell.f.e._e.SelectionCallback j;
    private com.tsf.shell.f.e._e.SelectionCallback k;
    private com.tsf.shell.f.e._e.SelectionCallback l;
    private f m;
    private j n;
    private float o;
    private float p;
    private boolean q = false;
    private boolean r = false;
    private C0133a s;

    public void a() {
        boolean z = false;
        this.a = x.b(SelectionCallback.d.editer_icon_delete);
        this.b = x.b(SelectionCallback.d.editer_icon_desktop);
        this.c = x.b(SelectionCallback.d.editer_icon_grid);
        this.d = x.b(SelectionCallback.d.editer_icon_info);
        this.e = x.b(SelectionCallback.d.editer_icon_setting);
        this.f = x.b(SelectionCallback.d.editer_icon_shadow);
        this.g = new com.tsf.shell.f.e._e.SelectionCallback();
        this.h = new com.tsf.shell.f.e._e.SelectionCallback();
        this.i = new com.tsf.shell.f.e._e.SelectionCallback();
        this.j = new com.tsf.shell.f.e._e.SelectionCallback();
        this.k = new com.tsf.shell.f.e._e.SelectionCallback();
        this.l = new com.tsf.shell.f.e._e.SelectionCallback();
        this.n = new j() { // from class: com.tsf.shell.f.e._e.SelectionState.1
            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public boolean removeChild(i iVar) {
                boolean zRemoveChild = super.removeChild(iVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return zRemoveChild;
            }

            @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public void addChild(i iVar) {
                if (parent() == null) {
                    com.tsf.shell.manager.app.TaskScheduler.a(this);
                }
                iVar.removeFromParent();
                super.addChild(iVar);
                invalidate();
            }
        };
        a aVar = new SelectionIndicator(com.censivn.C3DEngine.b.b.A.c * 120.0f, com.censivn.C3DEngine.b.b.A.c * 120.0f, z) { // from class: com.tsf.shell.f.e._e.SelectionState.2
            @Override // com.tsf.shell.f.e._e.SelectionState.a, com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.a(fVar);
                w.a(3);
                com.tsf.shell.manager.app.Notifier.a(-52736);
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return true;
            }

            @Override // com.tsf.shell.f.e._e.SelectionState.a, com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.e(fVar);
                final com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) fVar;
                ArrayList<com.tsf.shell.f.i.PageItem> arrayList = new ArrayList();
                if (bVar instanceof com.tsf.shell.f.i.ShortcutItem) {
                    com.tsf.shell.f.i.ShortcutItem cVar = (com.tsf.shell.f.i.ShortcutItem) bVar;
                    if (cVar.as()) {
                        Iterator<com.tsf.shell.f.i.ShortcutItem> it = cVar.aw().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next());
                        }
                    }
                }
                arrayList.add(bVar);
                for (com.tsf.shell.f.i.PageItem bVar2 : arrayList) {
                    bVar2.removeFromParent();
                    com.tsf.shell.manager.app.TaskScheduler.a(bVar2);
                }
                if (arrayList.size() > 1) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        g.a((com.tsf.shell.f.i.PageItem) it2.next(), (Runnable) null);
                    }
                } else if (bVar instanceof com.tsf.shell.f.i._b.d.WorkspaceShortcutItem) {
                    g.a(bVar, new Runnable() { // from class: com.tsf.shell.f.e._e.SelectionState.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.f.i._a.WidgetItemTouchHandler cVar2 = (com.tsf.shell.f.i._a.WidgetItemTouchHandler) bVar.getMouseEventListener();
                            bVar.clearDefaultColor();
                            cVar2.a(new float[]{cVar2.b, cVar2.d}, false);
                        }
                    }, null);
                } else {
                    g.a(bVar, (Runnable) null);
                }
            }

            @Override // com.tsf.shell.f.e._e.SelectionState.a, com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.d(fVar);
                ((com.tsf.shell.f.i.PageItem) fVar).clearDefaultColor();
                com.tsf.shell.manager.app.Notifier.a();
            }
        };
        aVar.alpha(0.0f);
        aVar.scale().setAll(0.0f, 0.0f, 1.0f);
        aVar.calAABB(1.5f, 1.5f, 1.5f);
        this.g.h = aVar;
        aVar.textures().addElement(this.a);
        this.g.addChild(aVar);
        this.g.setAABBPX(aVar.minX(), aVar.minY(), aVar.minZ(), aVar.maxX(), aVar.maxY(), aVar.maxZ());
        b bVar = new SelectionCallback(com.censivn.C3DEngine.b.b.A.c * 120.0f, com.censivn.C3DEngine.b.b.A.c * 120.0f, z) { // from class: com.tsf.shell.f.e._e.SelectionState.3
            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                w.a(3);
                c.this.m.b = fVar;
                com.censivn.C3DEngine.A.a().b(c.this.m, 400L);
                com.tsf.shell.manager.app.Notifier.a(-16728065);
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.censivn.C3DEngine.A.a().g(c.this.m);
                c.this.m.b = null;
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.censivn.C3DEngine.A.a().g(c.this.m);
                c.this.m.b = null;
                com.tsf.shell.manager.app.Notifier.a();
            }
        };
        bVar.alpha(0.0f);
        bVar.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar.calAABB(1.5f, 1.5f, 1.5f);
        this.h.h = bVar;
        bVar.textures().addElement(this.b);
        this.h.addChild(bVar);
        this.h.setAABBPX(bVar.minX(), bVar.minY(), bVar.minZ(), bVar.maxX(), bVar.maxY(), bVar.maxZ());
        b bVar2 = new SelectionCallback(com.censivn.C3DEngine.b.b.A.c * 120.0f, com.censivn.C3DEngine.b.b.A.c * 120.0f, z) { // from class: com.tsf.shell.f.e._e.SelectionState.4
            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                if (!com.tsf.shell.manager.app.StateHub.n().c()) {
                    com.tsf.shell.manager.app.StateHub.n().d();
                    c.this.c();
                    com.tsf.shell.manager.app.StateHub.d.a((com.tsf.shell.f.i.PageItem) fVar);
                    w.a(3);
                }
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.tsf.shell.manager.app.Notifier.a();
            }
        };
        bVar2.alpha(0.0f);
        bVar2.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar2.calAABB(1.5f, 1.5f, 1.5f);
        this.i.h = bVar2;
        bVar2.textures().addElement(this.c);
        this.i.addChild(bVar2);
        this.i.setAABBPX(bVar2.minX(), bVar2.minY(), bVar2.minZ(), bVar2.maxX(), bVar2.maxY(), bVar2.maxZ());
        a aVar2 = new SelectionIndicator(com.censivn.C3DEngine.b.b.A.c * 120.0f, com.censivn.C3DEngine.b.b.A.c * 120.0f, z) { // from class: com.tsf.shell.f.e._e.SelectionState.5
            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.f.e._e.SelectionState.a, com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.a(fVar);
                w.a(3);
                ((com.tsf.shell.f.i.PageItem) fVar).setDefaultColor(com.tsf.shell.manager.o.ThemeColorConstants.c);
                com.tsf.shell.manager.app.Notifier.a(-52736);
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.b(fVar);
                com.tsf.shell.f.i.PageItem bVar3 = (com.tsf.shell.f.i.PageItem) fVar;
                bVar3.clearDefaultColor();
                com.tsf.shell.manager.app.Notifier.a();
                return com.tsf.shell.manager.app.StateHub.t().d(bVar3);
            }

            @Override // com.tsf.shell.f.e._e.SelectionState.a, com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.e(fVar);
            }

            @Override // com.tsf.shell.f.e._e.SelectionState.a, com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.d(fVar);
                ((com.tsf.shell.f.i.PageItem) fVar).clearDefaultColor();
                com.tsf.shell.manager.app.Notifier.a();
            }
        };
        aVar2.alpha(0.0f);
        aVar2.scale().setAll(0.0f, 0.0f, 1.0f);
        aVar2.calAABB(1.5f, 1.5f, 1.5f);
        this.j.h = aVar2;
        aVar2.textures().addElement(this.a);
        this.j.addChild(aVar2);
        this.j.setAABBPX(aVar2.minX(), aVar2.minY(), aVar2.minZ(), aVar2.maxX(), aVar2.maxY(), aVar2.maxZ());
        b bVar3 = new SelectionCallback(com.censivn.C3DEngine.b.b.A.c * 120.0f, com.censivn.C3DEngine.b.b.A.c * 120.0f, z) { // from class: com.tsf.shell.f.e._e.SelectionState.6
            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                w.a(3);
                com.tsf.shell.manager.app.Notifier.a(-16728065);
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(final com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.censivn.C3DEngine.A.a().a(new Runnable() { // from class: com.tsf.shell.f.e._e.SelectionState.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fVar instanceof com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual) {
                            ((com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual) fVar).bh();
                        }
                    }
                }, 250L);
                return false;
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.tsf.shell.manager.app.Notifier.a();
            }
        };
        bVar3.alpha(0.0f);
        bVar3.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar3.calAABB(1.5f, 1.5f, 1.5f);
        this.k.h = bVar3;
        bVar3.textures().addElement(this.d);
        this.k.addChild(bVar3);
        this.k.setAABBPX(bVar3.minX(), bVar3.minY(), bVar3.minZ(), bVar3.maxX(), bVar3.maxY(), bVar3.maxZ());
        b bVar4 = new SelectionCallback(com.censivn.C3DEngine.b.b.A.c * 120.0f, com.censivn.C3DEngine.b.b.A.c * 120.0f, z) { // from class: com.tsf.shell.f.e._e.SelectionState.7
            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }
        };
        bVar4.alpha(0.0f);
        bVar4.scale().setAll(0.0f, 0.0f, 1.0f);
        bVar4.calAABB(1.5f, 1.5f, 1.5f);
        this.l.h = bVar4;
        bVar4.textures().addElement(this.e);
        this.l.addChild(bVar4);
        this.l.setAABBPX(bVar4.minX(), bVar4.minY(), bVar4.minZ(), bVar4.maxX(), bVar4.maxY(), bVar4.maxZ());
        this.m = new WorkspaceTask() { // from class: com.tsf.shell.f.e._e.SelectionState.8
            @Override // com.tsf.shell.f.e._e.WorkspaceTask
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.tsf.shell.manager.app.StateHub.b((com.tsf.shell.f.i.PageItem) fVar);
            }
        };
    }

    public class TextureElement 
        return this.f;
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, float f, float f2, boolean z, int... iArr) {
        float f3;
        float f4;
        if (bVar.S()) {
            this.q = false;
            this.o = f;
            this.p = f2;
            this.s = com.tsf.shell.manager.app.Notifier.a(this.s);
            this.r = true;
            int length = iArr.length;
            if (length == 1) {
                f4 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = com.censivn.C3DEngine.b.b.A.D / length;
                f4 = com.censivn.C3DEngine.b.b.A.z + (f3 / 2.0f);
            }
            ArrayList<com.tsf.shell.f.e._e.SelectionCallback> arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                com.tsf.shell.f.e._e.SelectionCallback bVar2 = null;
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
                    bVar2.a((i * f3) + f4, com.censivn.C3DEngine.b.b.A.I - (com.tsf.shell.manager.app.Notifier.b() / 2.0f), true);
                    arrayList.add(bVar2);
                }
            }
            Iterator<i> it = this.n.children().iterator();
            while (it.hasNext()) {
                com.tsf.shell.f.e._e.SelectionCallback bVar3 = (com.tsf.shell.f.e._e.SelectionCallback) it.next();
                if (!arrayList.contains(bVar3)) {
                    bVar3.c();
                }
            }
            for (com.tsf.shell.f.e._e.SelectionCallback bVar4 : arrayList) {
                bVar4.b();
                this.n.addChild(bVar4);
            }
        }
    }

    public void c() {
        if (Thread.currentThread().getId() != com.censivn.C3DEngine.a.e.f) {
            com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.e._e.SelectionState.9
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c();
                }
            });
        } else if (this.r) {
            com.tsf.shell.manager.app.Notifier.b(this.s);
            this.r = false;
            Iterator<i> it = this.n.children().iterator();
            while (it.hasNext()) {
                ((com.tsf.shell.f.e._e.SelectionCallback) it.next()).c();
            }
        }
    }

    public void a(float f, float f2) {
        if (this.r) {
            if (this.q && x.b(this.o, this.p, f, f2) > com.censivn.C3DEngine.b.b.A.a(250.0f)) {
                Iterator<i> it = this.n.children().iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.f.e._e.SelectionCallback) it.next()).a();
                }
            }
            Iterator<i> it2 = this.n.children().iterator();
            while (it2.hasNext()) {
                com.tsf.shell.f.e._e.SelectionCallback bVar = (com.tsf.shell.f.e._e.SelectionCallback) it2.next();
                bVar.a(x.b(bVar.c, bVar.d, f, f2), f, f2);
            }
        }
    }

    public com.tsf.shell.f.e._e.SelectionCallback d() {
        return this.g;
    }

    public static class b extends WorkspaceRowItem {
        public b(float f, float f2, boolean z) {
            super(f, f2, z);
        }
    }

    public static class a extends SelectionCallback {
        private static TextureElement d = new TextureElement(0, false);
        private k a;

        public a(float f, float f2, boolean z) {
            super(f, f2, z);
            this.a = new k(com.censivn.C3DEngine.b.b.A.a(64.0f), com.censivn.C3DEngine.b.b.A.a(14.0f), false) { // from class: com.tsf.shell.f.e._e.SelectionState.a.1
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    if (SelectionIndicator.d.id == 0) {
                        com.censivn.C3DEngine.A.g().a(SelectionIndicator.d, SelectionCallback.d.editer_icon_delete_cap);
                    }
                }
            };
            this.a.moveAllPointsPX(this.a.b() / 2.0f, this.a.c() / 2.0f, 0.0f);
            this.a.position().x = (-this.a.b()) / 2.0f;
            this.a.position().y = com.censivn.C3DEngine.b.b.A.a(18.0f);
            this.a.textures().addElement(WorkspaceLayoutItem);
            addChild(this.a);
        }

        @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            e();
        }

        @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            f();
        }

        @Override // com.tsf.shell.f.e._e.WorkspaceRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
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
