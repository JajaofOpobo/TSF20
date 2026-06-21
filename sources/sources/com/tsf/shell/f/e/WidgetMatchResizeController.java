package com.tsf.shell.f.e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetMatchResizeController extends com.censivn.C3DEngine.b.f.BaseRenderable implements b.a, e.a {
    private static s a;
    private static A b;
    private static boolean c = false;
    private static com.tsf.shell.f.i.PageItem d;
    private static Runnable e;

    public static void a() {
        if (SpringEasing) {
            com.censivn.C3DEngine.C3DEngine.a().c(ItemTrailContainer);
        }
    }

    public static void a(float f, float f2) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(AlignmentOverlay.position().x + f);
        dVar.h(AlignmentOverlay.position().y + f2);
        com.censivn.C3DEngine.b.g.TweenUtils.a(AlignmentOverlay);
        com.censivn.C3DEngine.b.g.TweenUtils.a(a, 250, dVar);
    }

    public static void b() {
        a.d();
    }

    public static void c() {
        a = new WidgetMatchResizeController();
        e = new Runnable() { // from class: com.tsf.shell.f.e.WidgetMatchResizeController.1
            @Override // java.lang.Runnable
            public void run() {
                s.b();
            }
        };
        b = new AlignmentOverlay(500.0f, 500.0f, new com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f));
        AlignmentOverlay.addChild(WidgetResizeResources);
    }

    public static void a(com.tsf.shell.f.i.PageItem bVar) {
        c = true;
        d = bVar;
        d.W();
        AlignmentOverlay.removeFromParent();
        AlignmentOverlay.rotation().z = bVar.rotation().z;
        AlignmentOverlay.position().setAllFrom(bVar.position());
        com.tsf.shell.manager.app.TaskScheduler.a(AlignmentOverlay);
        a.e().a(Math.abs(bVar.minX() * bVar.u()), Math.abs(bVar.maxX() * bVar.u()), Math.abs(bVar.minY() * bVar.u()), Math.abs(bVar.maxY() * bVar.u()));
        a.e().setFocus();
        a.e().h();
        com.censivn.C3DEngine.b.c.KeyboardHandler.a(AlignmentOverlay);
        com.tsf.shell.manager.app.ObserverManager.a(AlignmentOverlay);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(AlignmentOverlay);
        com.censivn.C3DEngine.b.g.TweenUtils.a(a, 250, dVar);
    }

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i, int i2, int i3, int i4) {
        WidgetMatchResizeController();
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WidgetMatchResizeController();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void d() {
        if (SpringEasing) {
            b.i();
            d.X();
            d = null;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.WidgetMatchResizeController.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    s.a.removeFromParent();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this, 250, dVar);
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            com.tsf.shell.manager.app.ObserverManager.b(AlignmentOverlay);
            c = false;
        }
    }

    public a e() {
        return b;
    }

    static class A extends com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable {
        private int a;
        private DynamicTextureElement d;
        private A e;
        private com.censivn.C3DEngine.b.f.GridRenderable f;
        private com.censivn.C3DEngine.b.f.GridRenderable g;
        private com.censivn.C3DEngine.b.f.GridRenderable h;
        private com.censivn.C3DEngine.b.f.GridRenderable i;
        private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper j;
        private int k;
        private float l;
        private float m;
        private boolean n;

        public A(float f, float f2, com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds bVar) {
            super(f, f2, bVar);
            this.k = 3;
            this.l = 1.0f;
            this.m = 1.0f;
            this.n = false;
            this.e = this;
            this.j = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
            this.d = ThemeManager.mix.widgetResize.getTextureElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, 64, 64);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.WidgetMatchResizeController.a.1
                @Override // java.lang.Runnable
                public void run() {
                    AlignmentOverlay.this.a = AlignmentOverlay.this.d.id;
                }
            };
            this.d.setReloadThemeRunnable(runnable);
            runnable.run();
            textures().addElement(b.g);
            this.f = c(0);
            this.g = c(1);
            this.h = c(2);
            this.i = c(3);
            setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this));
            mouseSkip(true);
            b(0);
        }

        public int a(com.censivn.C3DEngine.b.f.IRenderable iVar) {
            Number3ObjectPool.TEMPNUMBER3D3.reset();
            Number3d number3dLocalToGlobal = this.f.localToGlobal(Number3ObjectPool.TEMPNUMBER3D3);
            Number3ObjectPool.TEMPNUMBER3D3.reset();
            Number3d number3dLocalToGlobal2 = this.g.localToGlobal(Number3ObjectPool.TEMPNUMBER3D3);
            Number3ObjectPool.TEMPNUMBER3D3.reset();
            Number3d number3dLocalToGlobal3 = this.h.localToGlobal(Number3ObjectPool.TEMPNUMBER3D3);
            Number3ObjectPool.TEMPNUMBER3D3.reset();
            Number3d number3dLocalToGlobal4 = this.i.localToGlobal(Number3ObjectPool.TEMPNUMBER3D3);
            float[] fArr = {number3dLocalToGlobal.x, number3dLocalToGlobal2.x, number3dLocalToGlobal3.x, number3dLocalToGlobal4.x};
            float[] fArr2 = {number3dLocalToGlobal.y, number3dLocalToGlobal2.y, number3dLocalToGlobal3.y, number3dLocalToGlobal4.y};
            Number3ObjectPool.TEMPNUMBER3D3.reset();
            Number3d number3dLocalToGlobal5 = iVar.localToGlobal(Number3ObjectPool.TEMPNUMBER3D3);
            float f = number3dLocalToGlobal5.x;
            float f2 = number3dLocalToGlobal5.y;
            float f3 = 2.1474836E9f;
            float f4 = -2.1474836E9f;
            float f5 = 2.1474836E9f;
            float f6 = -2.1474836E9f;
            int i = 0;
            while (i < 4) {
                float f7 = fArr[i];
                float f8 = fArr2[i];
                if (f7 > f4) {
                    f4 = f7;
                }
                if (f7 >= f3) {
                    f7 = f3;
                }
                if (f8 > f6) {
                    f6 = f8;
                }
                if (f8 >= f5) {
                    f8 = f5;
                }
                i++;
                f3 = f7;
                f5 = f8;
            }
            if (f == f4) {
                return 3;
            }
            if (f == f3) {
                return 2;
            }
            if (f2 == f5) {
                return 1;
            }
            if (f2 == f6) {
                return 0;
            }
            return 0;
        }

        private void b(int i) {
            switch (SelectionFrame) {
                case 0:
                    textures().removeAll();
                    textures().addElement(b.g);
                    this.d.id = this.a;
                    break;
            }
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onKillFocus() {
            s.a.d();
        }

        private com.censivn.C3DEngine.b.f.GridRenderable c(int i) {
            com.censivn.C3DEngine.b.f.GridRenderable kVar = new com.censivn.C3DEngine.b.f.GridRenderable(64.0f, 64.0f);
            switch (SelectionFrame) {
                case 0:
                    kVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    kVar.calAABB();
                    break;
                case 1:
                    kVar.rotation().z = 180.0f;
                    kVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    kVar.calAABB();
                    break;
                case 2:
                    kVar.rotation().z = 90.0f;
                    kVar.moveAllPointsSP(0.0f, -33.0f, 0.0f);
                    kVar.calAABB();
                    break;
                case 3:
                    kVar.rotation().z = 270.0f;
                    kVar.moveAllPointsSP(0.0f, -32.0f, 0.0f);
                    kVar.calAABB();
                    break;
            }
            kVar.maxY(kVar.maxY() + (70.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b));
            kVar.minY(kVar.minY() + (38.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b));
            kVar.minX(kVar.minX() - (com.censivn.C3DEngine.b.b.ScreenConstants.b * 25.0f));
            kVar.maxX(kVar.maxX() + (com.censivn.C3DEngine.b.b.ScreenConstants.b * 25.0f));
            kVar.textures().addElement(this.d);
            kVar.setMouseEventListener(new C0100a(this.e, this, kVar));
            addChild(kVar);
            return kVar;
        }

        public void a(final float f, final float f2, final float f3, final float f4) {
            i(f * 2.0f);
            g(f2 * 2.0f);
            c(f4 * 2.0f);
            e(f3 * 2.0f);
            this.e.updatePointsVBO();
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e.WidgetMatchResizeController.a.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f5) {
                    float f6 = f + (f * (1.0f - f5));
                    float f7 = f2 + (f2 * (1.0f - f5));
                    float f8 = (f4 * (1.0f - f5)) + f4;
                    float f9 = f3 + (f3 * (1.0f - f5));
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    float f10 = f9 >= 0.0f ? f9 : 0.0f;
                    AlignmentOverlay.this.i(f6);
                    AlignmentOverlay.this.g(f7);
                    AlignmentOverlay.this.c(f8);
                    AlignmentOverlay.this.e(f10);
                    AlignmentOverlay.this.g();
                    AlignmentOverlay.this.e.updatePointsVBO();
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                }
            };
            dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.j);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.j, 250, dVar);
        }

        public void g() {
            PositionNumber3d positionNumber3dPosition = this.h.position();
            PositionNumber3d positionNumber3dPosition2 = this.i.position();
            float fA = (a() - d()) / 2.0f;
            positionNumber3dPosition2.y = fA;
            positionNumber3dPosition.y = fA;
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void i(float f) {
            super.j(ILayoutItem);
            this.h.position().x = (-f) + this.k;
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void g(float f) {
            super.h(ILayoutItem);
            this.i.position().x = (f - this.k) - 3.0f;
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void c(float f) {
            super.d(ILayoutItem);
            this.f.position().y = (f - this.k) - 1.0f;
        }

        @Override // com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable
        public void e(float f) {
            super.f(ILayoutItem);
            this.g.position().y = (-f) + this.k + 1.0f;
        }

        public void h() {
        }

        public void i() {
            this.n = false;
            setAnimationObjectState(false);
        }

        public void j() {
            float fU = s.d.u();
            this.m = fU;
            this.l = fU;
            this.n = true;
            setAnimationObjectState(true);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.j);
        }

        public void a(int i) {
            this.n = false;
        }

        public void k(float f) {
            this.l = f;
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (this.n || getAnimationObjectState()) {
                if (this.l > s.d.V()) {
                    this.l = s.d.V();
                } else if (this.l < s.d.U()) {
                    this.l = s.d.U();
                }
                this.m += (this.l - this.m) * 0.2f;
                if (!this.n && Math.abs(this.m - this.l) < 0.005d) {
                    setAnimationObjectState(false);
                    this.m = this.l;
                }
                s.d.a(this.m);
                i((-s.d.minX()) * this.m);
                g(s.d.maxX() * this.m);
                c(s.d.maxY() * this.m);
                e((-s.d.minY()) * this.m);
                A();
                this.e.updatePointsVBO();
            }
        }

        /* JADX INFO: renamed from: com.tsf.shell.f.e.WidgetMatchResizeController$a$a, reason: collision with other inner class name */
        static class C0100a extends com.censivn.C3DEngine.b.d.MouseEventListener {
            private float a;
            private float b;
            private float d;
            private A e;
            private boolean f;
            private int g;
            private com.censivn.C3DEngine.b.f.IRenderable h;

            public C0100a(com.censivn.C3DEngine.b.f.IRenderable iVar, A aVar, com.censivn.C3DEngine.b.f.IRenderable iVar2) {
                super(iVar);
                this.f = false;
                this.e = aVar;
                this.h = iVar2;
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f && s.c) {
                    switch (this.g) {
                        case 0:
                            this.e.k((this.d - (motionEvent2.getY() - this.b)) / s.d.maxY());
                            break;
                        case 1:
                            this.e.k((this.d - (this.b - motionEvent2.getY())) / Math.abs(s.d.minY()));
                            break;
                        case 2:
                            this.e.k((this.d - (motionEvent2.getX() - this.a)) / Math.abs(s.d.minX()));
                            break;
                        case 3:
                            this.e.k((this.d - (this.a - motionEvent2.getX())) / s.d.maxX());
                            break;
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                if (s.c) {
                    this.f = true;
                    this.e.j();
                    this.a = motionEvent.getX();
                    this.b = motionEvent.getY();
                    this.g = this.e.a(this.h);
                    switch (this.g) {
                        case 0:
                            this.d = this.e.a();
                            break;
                        case 1:
                            this.d = this.e.d();
                            break;
                        case 2:
                            this.d = this.e.f();
                            break;
                        case 3:
                            this.d = this.e.e();
                            break;
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                if (this.f) {
                    this.f = false;
                    if (s.c) {
                        this.e.a(this.g);
                    }
                }
            }
        }
    }
}
