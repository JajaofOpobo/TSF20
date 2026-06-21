package com.tsf.shell.f.e;

import android.content.ContentValues;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.b.g.EasingFunctions;
import com.tsf.shell.e.CellLayout;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetFreeResizeController extends com.censivn.C3DEngine.b.f.BaseRenderable implements com.censivn.C3DEngine.b.c.KeyboardHandler.a {
    private static WidgetFreeResizeController a;
    private static C b;
    private static com.tsf.shell.f.i.b.b.ItemShell c;
    private static com.tsf.shell.e.CellLayout.WidgetContainer d;
    private static boolean e = false;
    private static WidgetResizeResources f;

    public static class b {
        public void a() {
        }
    }

    public static void a() {
        a.h();
    }

    public static void b() {
        a = new WidgetFreeResizeController();
        b = new SpringEasing(500.0f, 500.0f, new com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f), a);
        AlignmentOverlay.addChild(WidgetResizeResources);
    }

    public static void a(com.tsf.shell.f.i.b.b.ItemShell aVar) {
        a(aVar, (WidgetResizeResources) null);
    }

    public static void a(com.tsf.shell.f.i.b.b.ItemShell aVar, WidgetResizeResources bVar) {
        e = true;
        f = bVar;
        c = aVar;
        d.b bVar2 = (d.b) aVar.g.getLayoutParams();
        d = bVar2;
        int i = bVar2.d;
        int i2 = bVar2.e;
        int i3 = (bVar2.a - (com.censivn.C3DEngine.b.b.ScreenConstants.F / 2)) + (i / 2);
        int i4 = ((com.censivn.C3DEngine.b.b.ScreenConstants.G / 2) - bVar2.b) - (i2 / 2);
        AlignmentOverlay.removeFromParent();
        com.tsf.shell.manager.app.TaskScheduler.a(AlignmentOverlay);
        AlignmentOverlay.position().x = i3;
        AlignmentOverlay.position().y = i4;
        a.c().a(i, i2);
        a.c().setFocus();
        a.c().h();
        a.c().a((-i) / 2, (-i2) / 2, i / 2, i2 / 2);
        com.censivn.C3DEngine.b.c.KeyboardHandler.a(AlignmentOverlay);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(AlignmentOverlay);
        com.censivn.C3DEngine.b.g.TweenUtils.a(a, 250, dVar);
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            b();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (ItemTrailContainer) {
            b.i();
            c = null;
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.1
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    t.a.removeFromParent();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this, 250, dVar);
            e = false;
            if (f != null) {
                f.a();
                f = null;
            }
        }
    }

    public C c() {
        return b;
    }

    static class C extends com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable {
        public static int a = 120;
        private int d;
        private int e;
        private DynamicTextureElement f;
        private C g;
        private WidgetFreeResizeController h;
        private com.censivn.C3DEngine.b.f.GridRenderable i;
        private com.censivn.C3DEngine.b.f.GridRenderable j;
        private com.censivn.C3DEngine.b.f.GridRenderable k;
        private com.censivn.C3DEngine.b.f.GridRenderable l;
        private com.censivn.C3DEngine.b.f.EmptyRenderable m;
        private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper n;
        private int o;
        private float p;
        private float q;
        private float r;
        private float s;
        private int[] t;

        public C(float f, float f2, com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds bVar, WidgetFreeResizeController tVar) {
            super(f, f2, bVar);
            this.o = 3;
            this.t = new int[4];
            this.g = this;
            this.h = tVar;
            this.n = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
            this.f = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, 64, 64);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.c.1
                @Override // java.lang.Runnable
                public void run() {
                    SpringEasing.this.d = SpringEasing.this.f.id;
                }
            };
            this.f.setReloadThemeRunnable(runnable);
            runnable.run();
            final DynamicTextureElement textureElement = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON, 64, 64);
            Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.c.2
                @Override // java.lang.Runnable
                public void run() {
                    SpringEasing.this.e = textureElement.id;
                }
            };
            textureElement.setReloadThemeRunnable(runnable2);
            runnable2.run();
            textures().addElement(com.tsf.shell.f.e.b.ResizeTextureManager);
            this.m = new com.censivn.C3DEngine.b.f.EmptyRenderable();
            this.m.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.c.3
                private float b;
                private float d;
                private float e;
                private float f;

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void e(MotionEvent motionEvent) {
                    if (t.e) {
                        this.b = t.c.position().x;
                        this.d = t.c.position().y;
                        this.e = SpringEasing.this.h.position().x;
                        this.f = SpringEasing.this.h.position().y;
                        SpringEasing.this.h.setAnimationObjectState(true);
                        SpringEasing.this.h.invalidate();
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
                    if (t.e) {
                        float x = motionEvent2.getX() - motionEvent.getX();
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (this.b + x + (t.c.b.b() / 2.0f) > com.censivn.C3DEngine.b.b.ScreenConstants.t) {
                            x = (com.censivn.C3DEngine.b.b.ScreenConstants.t - (t.c.b.b() / 2.0f)) - this.b;
                        } else if ((this.b + x) - (t.c.b.b() / 2.0f) < com.censivn.C3DEngine.b.b.ScreenConstants.r) {
                            x = (com.censivn.C3DEngine.b.b.ScreenConstants.r + (t.c.b.b() / 2.0f)) - this.b;
                        }
                        if ((this.d - y) + (t.c.b.c() / 2.0f) > com.censivn.C3DEngine.b.b.ScreenConstants.s) {
                            y = (-com.censivn.C3DEngine.b.b.ScreenConstants.s) + (t.c.b.c() / 2.0f) + this.d;
                        } else if ((this.d - y) - (t.c.b.c() / 2.0f) < com.censivn.C3DEngine.b.b.ScreenConstants.u) {
                            y = ((-com.censivn.C3DEngine.b.b.ScreenConstants.u) - (t.c.b.c() / 2.0f)) + this.d;
                        }
                        t.c.position().x = this.b + x;
                        SpringEasing.this.h.position().x = x + this.e;
                        t.c.position().y = this.d - y;
                        SpringEasing.this.h.position().y = this.f - y;
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void f(MotionEvent motionEvent) {
                    if (t.e) {
                        SpringEasing.this.h.setAnimationObjectState(false);
                        d.b bVar2 = (d.b) t.c.g.getLayoutParams();
                        int[] iArr = {(int) ((t.c.position().x - (t.c.b.b() / 2.0f)) + com.censivn.C3DEngine.b.b.ScreenConstants.H), (int) (((-t.c.position().y) + com.censivn.C3DEngine.b.b.ScreenConstants.I) - (t.c.b.c() / 2.0f)), bVar2.d, bVar2.e};
                        ItemInfo itemInfoK = t.c.K();
                        if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                            int i = iArr[0];
                            bVar2.a = i;
                            itemInfoK.cellX = i;
                            int i2 = iArr[1];
                            bVar2.b = i2;
                            itemInfoK.cellY = i2;
                        } else {
                            int i3 = iArr[0];
                            bVar2.a = i3;
                            itemInfoK.cellXH = i3;
                            int i4 = iArr[1];
                            bVar2.b = i4;
                            itemInfoK.cellYH = i4;
                        }
                        final com.tsf.shell.f.i.b.b.ItemShell aVar = t.c;
                        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.c.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (aVar != null && aVar.g != null) {
                                    aVar.g.requestLayout();
                                }
                            }
                        });
                    }
                }
            });
            addChild(this.m);
            this.i = c(0);
            this.j = c(1);
            this.k = c(2);
            this.l = c(3);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this));
            mouseSkip(true);
            b(0);
        }

        public void a(float f, float f2, float f3, float f4) {
            this.m.setAABBPX(f, f2, 1.0f, f3, f4, 1.0f);
        }

        public void g() {
            a(-f(), -d(), e(), C());
        }

        private void b(int i) {
            switch (SelectionFrame) {
                case 0:
                    textures().removeAll();
                    textures().addElement(com.tsf.shell.f.e.b.ResizeTextureManager);
                    this.f.id = this.d;
                    break;
                case 1:
                    textures().removeAll();
                    textures().addElement(com.tsf.shell.f.e.b.ResizeShader);
                    this.f.id = this.e;
                    break;
            }
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onKillFocus() {
            t.a.h();
        }

        private com.censivn.C3DEngine.b.f.GridRenderable c(int i) {
            com.censivn.C3DEngine.b.f.GridRenderable kVar = new com.censivn.C3DEngine.b.f.GridRenderable(64.0f, 64.0f);
            switch (SelectionFrame) {
                case 0:
                    kVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    break;
                case 1:
                    kVar.rotation().z = 180.0f;
                    kVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    break;
                case 2:
                    kVar.rotation().z = 90.0f;
                    kVar.moveAllPointsSP(0.0f, -33.0f, 0.0f);
                    break;
                case 3:
                    kVar.rotation().z = 270.0f;
                    kVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    break;
            }
            kVar.calAABB();
            kVar.maxY(kVar.maxY() + (80.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b));
            kVar.minY(kVar.minY() + (com.censivn.C3DEngine.b.b.ScreenConstants.b * 38.0f));
            kVar.minX(kVar.minX() - (com.censivn.C3DEngine.b.b.ScreenConstants.b * 38.0f));
            kVar.maxX(kVar.maxX() + (com.censivn.C3DEngine.b.b.ScreenConstants.b * 38.0f));
            kVar.textures().addElement(this.f);
            kVar.setMouseEventListener(new AlignmentOverlay(this.g, this, i));
            addChild(kVar);
            return kVar;
        }

        public void a(final int i, final int i2) {
            final int i3;
            final int i4;
            if (i > i2) {
                i4 = com.censivn.C3DEngine.b.b.ScreenConstants.F;
                i3 = (i4 * i2) / i;
            } else {
                i3 = com.censivn.C3DEngine.b.b.ScreenConstants.G;
                i4 = (i3 * i) / i2;
            }
            this.g.a(i + i4, i2 + i3);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.c.4
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f) {
                    SpringEasing.this.g.a(i + (i4 * (1.0f - f)), i2 + (i3 * (1.0f - f)));
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                }
            };
            dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.n);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.n, 250, dVar);
            this.p = i / 2;
            this.q = i / 2;
            this.r = i2 / 2;
            this.s = i2 / 2;
        }

        @Override // com.censivn.C3DEngine.b.f.GridRenderable
        public void a(float f, float f2) {
            super.b(f, f2);
            float f3 = f / 2.0f;
            float f4 = f2 / 2.0f;
            this.i.position().x = 0.0f;
            this.i.position().y = (f4 - this.o) - 1.0f;
            this.j.position().x = 0.0f;
            this.j.position().y = (-f4) + this.o + 1.0f;
            this.k.position().x = (-f3) + this.o;
            this.k.position().y = 0.0f;
            this.l.position().x = (f3 - this.o) - 3.0f;
            this.l.position().y = 0.0f;
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void i(float f) {
            super.i(ILayoutItem);
            this.k.position().x = (-f) + this.o;
            float f2 = (-f()) + ((f() + e()) / 2.0f);
            this.i.position().x = f2;
            this.j.position().x = f2;
            C();
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void g(float f) {
            super.g(ILayoutItem);
            this.l.position().x = (f - this.o) - 3.0f;
            float f2 = (-f()) + ((f() + e()) / 2.0f);
            this.i.position().x = f2;
            this.j.position().x = f2;
            C();
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void c(float f) {
            super.c(ILayoutItem);
            this.i.position().y = (f - this.o) - 1.0f;
            float fA = a() - ((d() + a()) / 2.0f);
            this.k.position().y = fA;
            this.l.position().y = fA;
            C();
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void e(float f) {
            super.e(ILayoutItem);
            this.j.position().y = (-f) + this.o + 1.0f;
            float fA = a() - ((d() + a()) / 2.0f);
            this.k.position().y = fA;
            this.l.position().y = fA;
            C();
        }

        public void h() {
        }

        public void i() {
            ItemInfo itemInfoK = t.c.K();
            if (com.censivn.C3DEngine.b.b.ScreenConstants.O) {
                itemInfoK.cellX = t.d.a;
                itemInfoK.cellY = t.d.b;
                itemInfoK.width = t.d.d;
                itemInfoK.height = t.d.e;
            } else {
                itemInfoK.cellXH = t.d.a;
                itemInfoK.cellYH = t.d.b;
                itemInfoK.widthH = t.d.d;
                itemInfoK.heightH = t.d.e;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("cellX", itemInfoK.cellX + "," + itemInfoK.cellXH);
            contentValues.put("cellY", itemInfoK.cellY + "," + itemInfoK.cellYH);
            contentValues.put("spanX", itemInfoK.width + "," + itemInfoK.widthH);
            contentValues.put("spanY", itemInfoK.height + "," + itemInfoK.heightH);
            ShellModel.a.a(contentValues, itemInfoK, (Runnable) null);
        }

        public void j() {
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.n);
        }

        private int[] a(int i, int i2, int i3, int i4, boolean z) {
            this.t[0] = i;
            this.t[1] = i2;
            this.t[2] = i3;
            this.t[3] = i4;
            if (z) {
                com.tsf.shell.manager.r.a.AppWidgetHostManager(this.t);
            } else {
                com.tsf.shell.manager.r.a.WidgetInstanceTracker(this.t);
            }
            b(0);
            return this.t;
        }

        private boolean b(int i, int i2, int i3, int i4, boolean z) {
            boolean zB;
            this.t[0] = i;
            this.t[1] = i2;
            this.t[2] = i3;
            this.t[3] = i4;
            if (z) {
                zB = com.tsf.shell.manager.r.a.AppWidgetHostManager(this.t);
            } else {
                zB = com.tsf.shell.manager.r.a.WidgetInstanceTracker(this.t);
            }
            if (zB) {
                b(1);
                return false;
            }
            b(0);
            return true;
        }

        public void a(int i) {
            boolean z = true;
            a(i, true);
            switch (SelectionFrame) {
                case 0:
                    this.r = t.d.e - this.s;
                    break;
                case 1:
                    this.s = t.d.e - this.r;
                    z = false;
                    break;
                case 2:
                    this.p = t.d.d - this.q;
                    break;
                case 3:
                    this.q = t.d.d - this.p;
                    z = false;
                    break;
            }
            b(t.d.a, t.d.b, t.d.d, t.d.e, z);
            final float f = f();
            final float fE = e();
            final float fA = a();
            final float fD = d();
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.c.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f2) {
                    if (f != SpringEasing.this.p) {
                        SpringEasing.this.g.i(f + ((SpringEasing.this.p - f) * f2));
                    }
                    if (fE != SpringEasing.this.q) {
                        SpringEasing.this.g.g(fE + ((SpringEasing.this.q - fE) * f2));
                    }
                    if (fA != SpringEasing.this.r) {
                        SpringEasing.this.g.c(fA + ((SpringEasing.this.r - fA) * f2));
                    }
                    if (fD != SpringEasing.this.s) {
                        SpringEasing.this.g.e(fD + ((SpringEasing.this.s - fD) * f2));
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                }
            };
            dVar.a((com.censivn.C3DEngine.b.g.TweenCallback) new a.c.C0034a());
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.n);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.n, 1000, dVar);
        }

        private void a(int i, boolean z) {
            switch (SelectionFrame) {
                case 0:
                    int iA = (int) ((com.censivn.C3DEngine.b.b.ScreenConstants.I - t.a.position().y) - a());
                    int iD = ((int) ((com.censivn.C3DEngine.b.b.ScreenConstants.I - t.a.position().y) + d())) - iA;
                    if (z) {
                        int[] iArrA = a(t.d.a, iA, t.d.d, iD, true);
                        t.d.b = iArrA[1];
                        t.d.e = iArrA[3];
                        t.c.ag();
                    } else {
                        b(t.d.a, iA, t.d.d, iD, true);
                    }
                    break;
                case 1:
                    int iA2 = (int) (a() + d());
                    if (z) {
                        t.d.e = a(t.d.a, t.d.b, t.d.d, iA2, false)[3];
                        t.c.ag();
                    } else {
                        b(t.d.a, t.d.b, t.d.d, iA2, false);
                    }
                    break;
                case 2:
                    int iF = (int) ((t.a.position().x - f()) + com.censivn.C3DEngine.b.b.ScreenConstants.H);
                    int iE = ((int) ((t.a.position().x + e()) + com.censivn.C3DEngine.b.b.ScreenConstants.H)) - iF;
                    if (z) {
                        int[] iArrA2 = a(iF, t.d.b, iE, t.d.e, true);
                        t.d.a = iArrA2[0];
                        t.d.d = iArrA2[2];
                        t.c.ag();
                    } else {
                        b(iF, t.d.b, iE, t.d.e, true);
                    }
                    break;
                case 3:
                    int iF2 = (int) (f() + e());
                    if (z) {
                        t.d.d = a(t.d.a, t.d.b, iF2, t.d.e, false)[2];
                        t.c.ag();
                    } else {
                        b(t.d.a, t.d.b, iF2, t.d.e, false);
                    }
                    break;
            }
        }

        public void a(int i, float f) {
            switch (SelectionFrame) {
                case 0:
                    if ((this.r - f) + d() < a) {
                        f = (this.r + d()) - a;
                    }
                    c(this.r - f);
                    a(i, false);
                    break;
                case 1:
                    if (this.s + f + a() < a) {
                        f = (a - this.s) - a();
                    }
                    e(this.s + f);
                    a(i, false);
                    break;
                case 2:
                    if ((this.p - f) + e() < a) {
                        f = (this.p + e()) - a;
                    }
                    i(this.p - f);
                    a(i, false);
                    break;
                case 3:
                    if (this.q + f + f() < a) {
                        f = (a - this.q) - f();
                    }
                    g(this.q + f);
                    a(i, false);
                    break;
            }
        }
    }

    static class A extends com.censivn.C3DEngine.b.d.MouseEventListener {
        private float a;
        private float b;
        private int d;
        private C e;
        private boolean f;

        public A(com.censivn.C3DEngine.b.f.IRenderable iVar, C cVar, int i) {
            super(iVar);
            this.f = false;
            this.e = cVar;
            this.d = i;
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            final float y;
            if (this.f) {
                if (this.d == 0 || this.d == 1) {
                    y = motionEvent2.getY() - this.b;
                } else {
                    y = motionEvent2.getX() - this.a;
                }
                com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.e.WidgetFreeResizeController.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlignmentOverlay.this.e.a(AlignmentOverlay.this.d, y);
                    }
                });
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void e(MotionEvent motionEvent) {
            this.f = true;
            this.a = motionEvent.getX();
            this.b = motionEvent.getY();
            this.e.j();
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void f(MotionEvent motionEvent) {
            this.f = false;
            if (t.e) {
                this.e.a(this.d);
            }
        }
    }
}
