package com.tsf.shell.f.f.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DragOverlayElement extends BaseRenderable {
    private static final float c = com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f);
    private static final int d = com.censivn.C3DEngine.b.b.ScreenConstants.b(100.0f);
    private FolderPage b;
    private A e;
    private BaseRenderable a = new BaseRenderable();
    private A f = new PageContainerBase(b.d.drawer_more_button) { // from class: com.tsf.shell.f.f.a.DragOverlayElement.1
        @Override // com.tsf.shell.f.f.a.DragOverlayElement.a
        public void a() {
            DragOverlayElement.this.PageItemList.aj();
        }
    };
    private A g = new PageContainerBase(b.d.drawer_search_button) { // from class: com.tsf.shell.f.f.a.DragOverlayElement.2
        @Override // com.tsf.shell.f.f.a.DragOverlayElement.a
        public void a() {
            com.tsf.shell.manager.app.FolderManager.a(500);
        }
    };

    static class A extends GridRenderable {
        private static com.tsf.shell.f.e.CircleDotNode e;
        private TextureElement a;
        private int d;
        private boolean f;
        private DragOverlayElement.a g;

        public A(int i) {
            super(e.d, DragOverlayElement.d, false);
            this.a = new TextureElement(0, false);
            this.d = 0;
            this.f = false;
            textures().addElement(this.a);
            calAABB(1.2f, 1.2f, 1.0f);
            this.d = i;
            setMouseEventListener(new com.censivn.C3DEngine.b.AppClassifier.MouseEventListener(this) { // from class: com.tsf.shell.f.f.a.DragOverlayElement.a.1
                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent) {
                    if (PageElement.this.g != null) {
                        PageElement.this.FolderRenameDialog.b();
                    }
                    PageElement.this.a();
                }
            });
        }

        public void a(int i) {
            this.g = com.tsf.shell.manager.app.AppListManager.a(i);
            if (this.FolderRenameDialog.a()) {
                d();
                    this.FolderRenameDialog.a(new com.tsf.shell.manager.p.ThemePreferenceProvider.PageContainerBase.C0142a() { // from class: com.tsf.shell.f.f.a.DragOverlayElement.a.2
                        @Override // com.tsf.shell.manager.p.ThemePreferenceProvider.a.C0142a
                    public void a() {
                        PageElement.this.e();
                    }
                });
            }
        }

        public void a() {
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (this.a.id == 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.a, this.d, DragOverlayElement.d, DragOverlayElement.d);
            }
        }

        public void d() {
            if (e == null) {
                e = new com.tsf.shell.f.DragOverlayElement.CircleDotNode();
                DragOverlayElement.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.a(50.0f);
                DragOverlayElement.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(50.0f);
            }
            this.f = true;
        }

        public void e() {
            this.f = false;
        }

        @Override // com.censivn.C3DEngine.b.f.BaseRenderable
        public void onDrawChildEnd() {
            if (this.f) {
                DragOverlayElement.dispatchDraw();
            }
        }
    }

    public DragOverlayElement(FolderPage hVar) {
        this.b = hVar;
        this.FolderRenameDialog.a(com.tsf.shell.manager.p.ThemePreferenceProvider.n);
        this.e = new PageContainerBase(b.d.drawer_home);
        this.DragOverlayElement.setMouseEventListener(new com.censivn.C3DEngine.b.AppClassifier.MouseEventListener(this.e) { // from class: com.tsf.shell.f.f.a.DragOverlayElement.3
            private float b;
            private float d;
            private boolean e = false;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.app.FolderManager.a(100);
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                this.e = false;
                this.b = motionEvent.getX();
                this.d = motionEvent.getY();
                com.tsf.shell.manager.action.GestureHandler.a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.e) {
                    com.tsf.shell.manager.app.StateHub.a(motionEvent2.getX(), motionEvent2.getY(), this.b, this.d);
                    return;
                }
                com.tsf.shell.manager.app.StateHub.w();
                com.tsf.shell.manager.app.StateHub.a(motionEvent2.getX(), motionEvent2.getY(), this.b, this.d);
                this.e = true;
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                if (this.e) {
                    com.tsf.shell.manager.app.StateHub.x();
                    this.e = false;
                }
            }
        });
        this.PageContainerBase.addChild(this.e);
        this.PageContainerBase.addChild(this.f);
        this.PageContainerBase.addChild(this.g);
        addChild(this.a);
    }

    public void a(boolean z) {
        a(z, null);
    }

    public void a(boolean z, final Runnable runnable) {
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderRenameDialog.TweenParams() { // from class: com.tsf.shell.f.f.a.DragOverlayElement.4
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    DragOverlayElement.this.PageContainerBase.visible(false);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
            dVar.a(0);
            dVar.h(-com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f));
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 350, dVar);
            return;
        }
        this.PageContainerBase.position().y = -com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f);
        this.PageContainerBase.alpha(0.0f);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b(boolean z) {
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        this.PageContainerBase.visible(true);
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.FolderRenameDialog.TweenParams();
            dVar.a(255);
            dVar.h(0.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.n);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 600, dVar);
            return;
        }
        this.PageContainerBase.position().y = 0.0f;
        this.PageContainerBase.alpha(255.0f);
    }

    public void a(int i, int i2, int i3, int i4) {
        position().y = com.censivn.C3DEngine.b.b.ScreenConstants.C + (c / 2.0f);
        this.PageGridRenderer.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.A - com.censivn.C3DEngine.b.b.ScreenConstants.a(125.0f);
        this.FolderRenameDialog.position().x = com.censivn.C3DEngine.b.b.ScreenConstants.z + com.censivn.C3DEngine.b.b.ScreenConstants.a(125.0f);
    }
}
