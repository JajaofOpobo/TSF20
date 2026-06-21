package com.tsf.shell.f.e.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.manager.n.ToastOverlayController;
import com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil;
import com.tsf.shell.utils.ErrorThrower;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ItemAnimationController {
    private TextureElement a;
    private TextureElement b;
    private TextureElement c;
    private TextureElement d;
    private TextureElement e;
    private TextureElement f;
    private com.tsf.shell.f.e.e.ItemContainerNode g;
    private com.tsf.shell.f.e.e.ItemContainerNode h;
    private com.tsf.shell.f.e.e.ItemContainerNode i;
    private com.tsf.shell.f.e.e.ItemContainerNode j;
    private com.tsf.shell.f.e.e.ItemContainerNode k;
    private com.tsf.shell.f.e.e.ItemContainerNode l;
    private f m;
    private BaseRenderable n;
    private float o;
    private float p;
    private boolean q = false;
    private boolean r = false;
    private C0133a s;

    public void a() {
        boolean z = false;
        this.a = x.b(ItemContainerNode.d.editer_icon_delete);
        this.b = x.b(ItemContainerNode.d.editer_icon_desktop);
        this.c = x.b(ItemContainerNode.d.editer_icon_grid);
        this.d = x.b(ItemContainerNode.d.editer_icon_info);
        this.e = x.b(ItemContainerNode.d.editer_icon_setting);
        this.f = x.b(ItemContainerNode.d.editer_icon_shadow);
        this.g = new com.tsf.shell.f.e.e.ItemContainerNode();
        this.h = new com.tsf.shell.f.e.e.ItemContainerNode();
        this.i = new com.tsf.shell.f.e.e.ItemContainerNode();
        this.j = new com.tsf.shell.f.e.e.ItemContainerNode();
        this.k = new com.tsf.shell.f.e.e.ItemContainerNode();
        this.l = new com.tsf.shell.f.e.e.ItemContainerNode();
        this.n = new BaseRenderable() { // from class: com.tsf.shell.f.e.e.ItemAnimationController.1
            @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
            public boolean removeChild(i iVar) {
                boolean zRemoveChild = super.removeChild(iVar);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return zRemoveChild;
            }

            @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
            public void addChild(i iVar) {
                if (parent() == null) {
                    com.tsf.shell.manager.app.TaskScheduler.a(this);
                }
                iVar.removeFromParent();
                super.addChild(iVar);
                invalidate();
            }
        };
        a aVar = new ItemNode(com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, z) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.2
            @Override // com.tsf.shell.f.e.e.ItemAnimationController.a, com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.a(fVar);
                w.a(3);
                com.tsf.shell.manager.app.Notifier.a(-52736);
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return true;
            }

            @Override // com.tsf.shell.f.e.e.ItemAnimationController.a, com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
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
                } else if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                    g.a(bVar, new Runnable() { // from class: com.tsf.shell.f.e.e.ItemAnimationController.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.f.i.a.PageItemTouchHandler cVar2 = (com.tsf.shell.f.i.a.PageItemTouchHandler) bVar.getMouseEventListener();
                            bVar.clearDefaultColor();
                            cVar2.a(new float[]{cVar2.b, cVar2.d}, false);
                        }
                    }, null);
                } else {
                    g.a(bVar, (Runnable) null);
                }
            }

            @Override // com.tsf.shell.f.e.e.ItemAnimationController.a, com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
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
        b bVar = new ItemContainerNode(com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, z) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.3
            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                w.a(3);
                ItemAnimationController.this.m.b = fVar;
                com.censivn.C3DEngine.C3DEngine.a().b(ItemAnimationController.this.m, 400L);
                com.tsf.shell.manager.app.Notifier.a(-16728065);
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.censivn.C3DEngine.C3DEngine.a().g(ItemAnimationController.this.m);
                ItemAnimationController.this.m.b = null;
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.censivn.C3DEngine.C3DEngine.a().g(ItemAnimationController.this.m);
                ItemAnimationController.this.m.b = null;
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
        b bVar2 = new ItemContainerNode(com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, z) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.4
            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                if (!com.tsf.shell.manager.app.StateHub.n().c()) {
                    com.tsf.shell.manager.app.StateHub.n().d();
                    ItemAnimationController.this.c();
                    com.tsf.shell.manager.app.StateHub.d.a((com.tsf.shell.f.i.PageItem) fVar);
                    w.a(3);
                }
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
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
        a aVar2 = new ItemNode(com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, z) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.5
            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.f.e.e.ItemAnimationController.a, com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.a(fVar);
                w.a(3);
                ((com.tsf.shell.f.i.PageItem) fVar).setDefaultColor(com.tsf.shell.manager.o.ThemeColorConstants.c);
                com.tsf.shell.manager.app.Notifier.a(-52736);
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.b(fVar);
                com.tsf.shell.f.i.PageItem bVar3 = (com.tsf.shell.f.i.PageItem) fVar;
                bVar3.clearDefaultColor();
                com.tsf.shell.manager.app.Notifier.a();
                return com.tsf.shell.manager.app.StateHub.t().d(bVar3);
            }

            @Override // com.tsf.shell.f.e.e.ItemAnimationController.a, com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                super.e(fVar);
            }

            @Override // com.tsf.shell.f.e.e.ItemAnimationController.a, com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
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
        b bVar3 = new ItemContainerNode(com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, z) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.6
            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean a() {
                return super.a();
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                w.a(3);
                com.tsf.shell.manager.app.Notifier.a(-16728065);
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(final com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.e.e.ItemAnimationController.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fVar instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
                            ((com.tsf.shell.f.i.b.e.DrawerItemVisual) fVar).bh();
                        }
                    }
                }, 250L);
                return false;
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
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
        b bVar4 = new ItemContainerNode(com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 120.0f, z) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.7
            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                return false;
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            }

            @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
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
        this.m = new ItemCleanupTask() { // from class: com.tsf.shell.f.e.e.ItemAnimationController.8
            @Override // com.tsf.shell.f.e.e.ItemCleanupTask
            public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
                com.tsf.shell.manager.app.StateHub.b((com.tsf.shell.f.i.PageItem) fVar);
            }
        };
    }

    public TextureElement e() {
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
                f3 = com.censivn.C3DEngine.b.b.ScreenConstants.D / length;
                f4 = com.censivn.C3DEngine.b.b.ScreenConstants.z + (f3 / 2.0f);
            }
            ArrayList<com.tsf.shell.f.e.e.ItemContainerNode> arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                com.tsf.shell.f.e.e.ItemContainerNode bVar2 = null;
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
                    bVar2.a((i * f3) + f4, com.censivn.C3DEngine.b.b.ScreenConstants.I - (com.tsf.shell.manager.app.Notifier.b() / 2.0f), true);
                    arrayList.add(bVar2);
                }
            }
            Iterator<i> it = this.n.children().iterator();
            while (it.hasNext()) {
                com.tsf.shell.f.e.e.ItemContainerNode bVar3 = (com.tsf.shell.f.e.e.ItemContainerNode) it.next();
                if (!arrayList.contains(bVar3)) {
                    bVar3.c();
                }
            }
            for (com.tsf.shell.f.e.e.ItemContainerNode bVar4 : arrayList) {
                bVar4.b();
                this.n.addChild(bVar4);
            }
        }
    }

    public void c() {
        if (Thread.currentThread().getId() != com.censivn.C3DEngine.a.e.f) {
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.e.e.ItemAnimationController.9
                @Override // java.lang.Runnable
                public void run() {
                    ItemAnimationController.this.c();
                }
            });
        } else if (this.r) {
            com.tsf.shell.manager.app.Notifier.b(this.s);
            this.r = false;
            Iterator<i> it = this.n.children().iterator();
            while (it.hasNext()) {
                ((com.tsf.shell.f.e.e.ItemContainerNode) it.next()).c();
            }
        }
    }

    public void a(float f, float f2) {
        if (this.r) {
            if (this.q && x.b(this.o, this.p, f, f2) > com.censivn.C3DEngine.b.b.ScreenConstants.a(250.0f)) {
                Iterator<i> it = this.n.children().iterator();
                while (it.hasNext()) {
                    ((com.tsf.shell.f.e.e.ItemContainerNode) it.next()).a();
                }
            }
            Iterator<i> it2 = this.n.children().iterator();
            while (it2.hasNext()) {
                com.tsf.shell.f.e.e.ItemContainerNode bVar = (com.tsf.shell.f.e.e.ItemContainerNode) it2.next();
                bVar.a(x.b(bVar.c, bVar.d, f, f2), f, f2);
            }
        }
    }

    public com.tsf.shell.f.e.e.ItemContainerNode d() {
        return this.g;
    }

    public static class b extends ItemRowItem {
        public b(float f, float f2, boolean z) {
            super(f, f2, z);
        }
    }

    public static class a extends ItemContainerNode {
        private static TextureElement d = new TextureElement(0, false);
        private GridRenderable a;

        public a(float f, float f2, boolean z) {
            super(f, f2, z);
            this.a = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.a(64.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(14.0f), false) { // from class: com.tsf.shell.f.e.e.ItemAnimationController.a.1
                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onDrawStart() {
                    if (ItemNode.d.id == 0) {
                        com.censivn.C3DEngine.C3DEngine.g().a(ItemNode.d, ItemContainerNode.d.editer_icon_delete_cap);
                    }
                }
            };
            this.a.moveAllPointsPX(this.a.b() / 2.0f, this.a.c() / 2.0f, 0.0f);
            this.a.position().x = (-this.a.b()) / 2.0f;
            this.a.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(18.0f);
            this.a.textures().addElement(ItemLayoutItem);
            addChild(this.a);
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            a();
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            a();
        }

        @Override // com.tsf.shell.f.e.e.ItemRowItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
        public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
            a();
        }

        private void e() {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.e(50.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, VEasing.Linear.easeNone, dVar);
        }

        private void f() {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.e(0.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 300, dVar);
        }
    }
}
