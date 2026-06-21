package com.tsf.shell.f.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageIndicatorStrip extends com.censivn.C3DEngine.b.f.BaseRenderable {
    private com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable d;
    private com.censivn.C3DEngine.b.f.sprite.SpriteItemData e;
    private TextureElement k;
    private A l;
    private A m;
    private A n;
    private int a = 50;
    private int b = 0;
    private int f = -1;
    private boolean g = true;
    private boolean h = false;
    private boolean p = false;
    private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper q = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
    private float i = com.censivn.C3DEngine.b.b.ScreenConstants.c * 100.0f;
    private float j = com.censivn.C3DEngine.b.b.ScreenConstants.c * 100.0f;
    private TextureElement c = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_PREVIEW_INDICATOR, com.tsf.shell.manager.g.LayoutDimensionConstants.l, com.tsf.shell.manager.g.LayoutDimensionConstants.l);
    private r o = new PageNumberBadge();

    public PageIndicatorStrip(final boolean z) {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.tsf.shell.f.e.PageIndicatorStrip.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (z) {
                    if (PageIndicatorStrip.this.p) {
                        if (PageIndicatorStrip.this.h) {
                            com.tsf.shell.manager.app.StateHub.s().c(motionEvent, motionEvent2, 0.0f, 0.0f);
                            return;
                        } else {
                            com.tsf.shell.manager.app.StateHub.s().a(motionEvent, motionEvent2);
                            return;
                        }
                    }
                    com.tsf.shell.manager.app.StateHub.s().c(motionEvent, motionEvent2, 0.0f, 0.0f);
                    if (com.tsf.shell.manager.app.StateHub.s().f()) {
                        if (com.tsf.shell.manager.app.StateHub.s().g()) {
                            PageIndicatorStrip.this.h = true;
                        } else {
                            PageIndicatorStrip.this.h = false;
                        }
                        PageIndicatorStrip.this.p = true;
                        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.e.PageIndicatorStrip.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (PageIndicatorStrip.this.h) {
                                    PageIndicatorStrip.this.c();
                                } else {
                                    PageIndicatorStrip.this.d();
                                    com.tsf.shell.manager.app.StateHub.s().e();
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                if (z) {
                    PageIndicatorStrip.this.b();
                    com.tsf.shell.manager.app.StateHub.a(true);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                if (z) {
                    if (PageIndicatorStrip.this.p && !PageIndicatorStrip.this.h) {
                        com.tsf.shell.manager.app.StateHub.s().a(motionEvent);
                    }
                    com.tsf.shell.manager.app.StateHub.s().d(motionEvent);
                    PageIndicatorStrip.this.p = false;
                    PageIndicatorStrip.this.e();
                    com.tsf.shell.manager.app.StateHub.g();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (z && PageIndicatorStrip.this.p && !PageIndicatorStrip.this.h) {
                    com.tsf.shell.manager.app.StateHub.s().b(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                PageIndicatorStrip.this.a();
            }
        });
        this.k = x.b(b.d.dock_operation_border_point, com.tsf.shell.manager.g.LayoutDimensionConstants.m, com.tsf.shell.manager.g.LayoutDimensionConstants.n);
        this.n = new AlignmentOverlay(com.tsf.shell.manager.g.LayoutDimensionConstants.m, com.tsf.shell.manager.g.LayoutDimensionConstants.n, false, this.k, this.i);
        this.l = new AlignmentOverlay(com.tsf.shell.manager.g.LayoutDimensionConstants.m, com.tsf.shell.manager.g.LayoutDimensionConstants.n, false, this.k, this.j);
        this.l.rotation().z = 90.0f;
        this.m = new AlignmentOverlay(com.tsf.shell.manager.g.LayoutDimensionConstants.m, com.tsf.shell.manager.g.LayoutDimensionConstants.n, false, this.k, this.j);
        this.m.rotation().z = -90.0f;
    }

    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.l.a();
        this.m.a();
        this.n.a();
        this.o.a(this.f + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.n.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.l.b();
        this.m.b();
        this.o.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        PageIndicatorStrip();
        PageIndicatorStrip();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.censivn.C3DEngine.b.f.IRenderable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDrawStart() {
        /*
            r6 = this;
            boolean r0 = r6.p
            if (r0 == 0) goto L50
            boolean r0 = r6.h
            if (r0 == 0) goto L50
            com.tsf.shell.f.f.PageTouchHandler r0 = com.tsf.shell.manager.app.StateHub
            com.censivn.C3DEngine.b.f.BaseRenderable r2 = r0.u()
            r1 = 1325400064(0x4f000000, float:2.1474836E9)
            r0 = 1
            java.util.ArrayList r2 = r2.children()
            java.util.Iterator r4 = r2.iterator()
            r2 = r1
            r1 = r0
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            com.censivn.C3DEngine.b.f.IRenderable r0 = (com.censivn.C3DEngine.b.f.IRenderable) r0
            boolean r3 = r0 instanceof com.tsf.shell.f.f.WorkspacePage
            if (r3 == 0) goto L51
            com.tsf.shell.f.f.WorkspacePage r0 = (com.tsf.shell.f.f.WorkspacePage) r0
            float r3 = r0.g
            float r3 = java.lang.Math.abs(r3)
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 >= 0) goto L51
            int r1 = r0.r()
            r0 = r1
            r1 = r3
        L3d:
            r2 = r1
            r1 = r0
            goto L1b
        L40:
            int r0 = r6.f
            int r2 = r1 + (-1)
            if (r0 == r2) goto L4b
            com.tsf.shell.f.e.PageNumberBadge r0 = r6.o
            r0.b(r1)
        L4b:
            int r0 = r1 + (-1)
            r6.b(r0)
        L50:
            return
        L51:
            r0 = r1
            r1 = r2
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.PageIndicatorStrip.onDrawStart():void");
    }

    public void a(int i) {
        if (this.d != null) {
            this.d.destroy();
        }
        this.b = i;
        this.e = null;
        float f = 0.0f - (((this.a * com.censivn.C3DEngine.b.b.ScreenConstants.c) * (i - 1)) / 2.0f);
        this.d = new com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable(i, 32, 32, 32);
        this.d.useVBO(false);
        float f2 = f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = this.d.a(i2);
            bVarA.m.pxX(f2);
            bVarA.b(com.tsf.shell.manager.g.LayoutDimensionConstants.l);
            bVarA.d(com.tsf.shell.manager.g.LayoutDimensionConstants.l);
            bVarA.k().setAll(0.4f, 0.4f, 1.0f);
            bVarA.a(0, 0, 1, 1);
            bVarA.h();
            f2 += this.a * com.censivn.C3DEngine.b.b.ScreenConstants.c;
        }
        this.d.textures().addElement(this.c);
        addChild(this.d);
        if (!this.g) {
            this.d.alpha(0.0f);
        }
        if (this.f < this.b && this.f > -1) {
            this.e = this.d.a(this.f);
        }
        setAABBPX(f - com.censivn.C3DEngine.b.b.ScreenConstants.a(150.0f), com.censivn.C3DEngine.b.b.ScreenConstants.c * (-55.0f), 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.a(150.0f) + (-f), com.censivn.C3DEngine.b.b.ScreenConstants.c * 55.0f, 0.0f);
        this.l.position().x = f - this.j;
        this.m.position().x = (-f) + this.j;
        this.n.position().y = this.i;
        this.f = -1;
    }

    public void b(int i) {
        if (i > -1 && i < this.b) {
            if (this.f != i) {
                if (this.e != null) {
                    com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                    dVar.l(0.4f);
                    dVar.m(0.4f);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 250, dVar);
                }
                this.f = i;
                this.e = this.d.a(SelectionFrame);
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 250, dVar2);
            }
            if (!this.g) {
                d(true);
                return;
            }
            return;
        }
        if (this.g) {
            c(true);
        }
    }

    public void a(final boolean z) {
        mouseEnabled(false);
        final float fAlpha = alpha();
        final float f = z ? 30.0f : 0.0f;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.PageIndicatorStrip.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f2) {
                PageIndicatorStrip.this.alpha(fAlpha + ((f - fAlpha) * f2));
            }

            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                if (!z) {
                    PageIndicatorStrip.this.visible(false);
                }
            }
        };
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.q);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.q, 300, dVar);
    }

    public void b(boolean z) {
        if (this.g) {
            mouseEnabled(true);
        }
        visible(true);
        final float fAlpha = alpha();
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.PageIndicatorStrip.3
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f) {
                PageIndicatorStrip.this.alpha(fAlpha + ((255.0f - fAlpha) * f));
            }
        };
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.q);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.q, 300, dVar);
    }

    public void c(boolean z) {
        this.g = false;
        mouseEnabled(false);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.PageIndicatorStrip.4
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    PageIndicatorStrip.this.d.visible(false);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, 600, dVar);
            return;
        }
        this.d.alpha(0.0f);
    }

    public void d(boolean z) {
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
        this.g = true;
        this.d.visible(true);
        mouseEnabled(true);
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.PageIndicatorStrip.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f) {
                    PageIndicatorStrip.this.d.visible(true);
                }
            };
            dVar.a(255);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, 600, dVar);
            return;
        }
        this.d.alpha(255.0f);
    }

    private class A extends com.censivn.C3DEngine.b.f.BaseRenderable {
        private float b;
        private com.censivn.C3DEngine.b.f.GridRenderable c;
        private float d;
        private boolean e = false;

        public A(float f, float f2, boolean z, TextureElement textureElement, float f3) {
            this.d = f3;
            this.c = new com.censivn.C3DEngine.b.f.GridRenderable(f, f2, z);
            this.c.alpha(0.0f);
            PositionNumber3d positionNumber3dPosition = this.c.position();
            float f4 = -f3;
            this.b = f4;
            positionNumber3dPosition.y = f4;
            this.c.textures().addElement(textureElement);
            addChild(this.c);
        }

        public void a() {
            if (!this.e) {
                this.e = true;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.a(VEasing.Back.easeIn);
                dVar.h(0.0f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 250, dVar);
                removeFromParent();
                PageIndicatorStrip.this.addChild(this);
            }
        }

        public void b() {
            if (this.e) {
                this.e = false;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.PageIndicatorStrip.a.1
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        AlignmentOverlay.this.c.position().y = AlignmentOverlay.this.b;
                        AlignmentOverlay.this.removeFromParent();
                    }
                };
                dVar.a(0);
                dVar.h(100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 250, dVar);
            }
        }
    }
}
