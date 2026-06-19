package com.tsf.shell.f.h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WorkspaceStateController implements com.censivn.C3DEngine.b.c.b.a, com.censivn.C3DEngine.b.c.e.a {
    public static int b = -1725816286;
    private j d;
    private com.tsf.shell.f.e.c.AnimationNode e;
    private c f;
    private j g;
    private e k;
    private com.censivn.C3DEngine.b.c.b.a l;
    private float m;
    private float o;
    private float p;
    private A r;
    private com.tsf.shell.f.h.a.WorkspacePreviewNode s;
    public int a = 47;
    private float c = 0.0f;
    private boolean h = true;
    private boolean i = false;
    private boolean j = false;
    private boolean n = false;
    private boolean q = false;
    private boolean t = false;

    public void a(boolean z, int i) {
        this.t = z;
        if (z) {
            this.a = i;
            this.g.mouseEnabled(true);
        } else {
            this.a = 0;
            this.g.mouseEnabled(false);
        }
        this.e.a((int) ((this.a / 100.0f) * 255.0f));
    }

    public com.tsf.shell.f.h.a.WorkspacePreviewNode a() {
        return this.s;
    }

    public com.tsf.shell.f.e.c.AnimationNode b() {
        return this.e;
    }

    public c c() {
        return this.f;
    }

    public float d() {
        return this.o;
    }

    public float e() {
        return this.p;
    }

    public void f() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h((-com.censivn.C3DEngine.b.b.A.E) / 2.0f);
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 350, dVar);
    }

    public void g() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(0.0f);
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
    }

    public void a(j jVar) {
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.t = com.tsf.shell.manager.b.ConfigManager.ac();
        this.a = this.t ? com.tsf.shell.manager.b.ConfigManager.ab() : 0;
        this.c = 80.0f * com.censivn.C3DEngine.b.b.A.c;
        this.s = new com.tsf.shell.f.h.a.WorkspacePreviewNode();
        this.d = new j();
        this.k = new DockOperationBorder();
        this.k.b(0.0f);
        this.l = new com.censivn.C3DEngine.b.c.b.a() { // from class: com.tsf.shell.f.h.WorkspaceStub.1
            @Override // com.tsf.shell.manager.f.WorkspaceScene.a
            public void a() {
                if (WorkspaceStub.this.s.e()) {
                    WorkspaceStub.this.s.d();
                } else {
                    WorkspaceStub.this.o();
                }
            }
        };
        this.e = new com.tsf.shell.f.e.c.a(128.0f, ThemeManager.mix.smartButton.getTheme().shell.smartButtonWindowsColor, (int) ((this.a / 100.0f) * 255.0f), x.a(com.tsf.b.d.bubble_icon), 1000, com.censivn.C3DEngine.b.b.A.c) { // from class: com.tsf.shell.f.h.WorkspaceStub.2
            @Override // com.tsf.shell.f.e.c.a
            public void d() {
            }

            @Override // com.tsf.shell.f.e.c.a, com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                if (!WorkspaceStub.this.q) {
                }
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (getAnimationObjectState()) {
                    position().x += (WorkspaceStub.this.o - position().x) * WorkspaceStub.this.m;
                    position().y += (WorkspaceStub.this.p - position().y) * WorkspaceStub.this.m;
                    if (Math.abs(position().x - WorkspaceStub.this.o) < 0.2f && Math.abs(position().y - WorkspaceStub.this.p) < 0.2f && !WorkspaceStub.this.n) {
                        position().x = WorkspaceStub.this.o;
                        position().y = WorkspaceStub.this.p;
                        setAnimationObjectState(false);
                    }
                }
            }
        };
        WorkspaceStateController();
        this.g = this.e.c();
        this.g.mouseEnabled(this.t);
        this.f = new WorkspaceDockPanel(this);
        this.e.a(this.f);
        this.g.setMouseEventListener(new d(this, this.g) { // from class: com.tsf.shell.f.h.WorkspaceStub.3
            @Override // com.tsf.shell.f.h.WorkspaceTouchController, com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                super.a(motionEvent);
                if (!WorkspaceStub.this.e.getAnimationObjectState()) {
                    WorkspaceStub.this.n();
                }
            }

            @Override // com.tsf.shell.f.h.WorkspaceTouchController, com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (!WorkspaceStub.this.i) {
                    super.e(motionEvent);
                    WorkspaceStub.this.l();
                }
            }

            @Override // com.tsf.shell.f.h.WorkspaceTouchController, com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                super.f(motionEvent);
                WorkspaceStub.this.m();
            }

            @Override // com.tsf.shell.f.h.WorkspaceTouchController, com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                super.c(motionEvent);
                WorkspaceStub.this.m();
            }
        });
        this.d.addChild(this.e);
        jVar.addChild(this.d);
        this.r = new WorkspaceContainer();
        this.d.addChild(this.r);
    }

    private void r() {
        Number3d number3dW = com.censivn.C3DEngine.b.b.A.O ? com.tsf.shell.manager.b.ConfigManager.w() : com.tsf.shell.manager.b.ConfigManager.x();
        if (number3dW.x == 0.0f && number3dW.y == 0.0f) {
            number3dW.x = com.censivn.C3DEngine.b.b.A.z + (70.0f * com.censivn.C3DEngine.b.b.A.c);
            number3dW.y = com.censivn.C3DEngine.b.b.A.C + (300.0f * com.censivn.C3DEngine.b.b.A.c);
        }
        a(number3dW.x, number3dW.y, false);
    }

    public void h() {
        this.e.b(ThemeManager.mix.smartButton.getTheme().shell.smartButtonWindowsColor);
        WorkspaceStateController().e();
    }

    public void i() {
        if (!this.h && !this.e.getAnimationObjectState()) {
            this.h = true;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.h.WorkspaceStub.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    WorkspaceStub.this.d.mouseEnabled(true);
                }
            };
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 250, dVar);
        }
    }

    public void a(float f) {
        this.q = true;
        float fA = this.f.a(WorkspaceWidgetPanel);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(fA);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
        this.s.f();
    }

    public void j() {
        this.q = false;
        this.f.a();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.h(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar);
        this.g.setFocus();
        this.s.g();
        com.tsf.shell.manager.app.PanelStateManager.i();
    }

    public void k() {
        if (this.h && !this.i) {
            this.h = false;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 250, dVar);
            this.d.mouseEnabled(false);
        }
    }

    public void l() {
        if (!this.j) {
            this.j = true;
            this.k.position().setAllFrom(this.e.position());
            this.k.removeFromParent();
            com.tsf.shell.manager.app.TaskScheduler.a(this.k);
            this.k.a(60.0f);
            float f = this.e.position().x;
            float f2 = this.e.position().y;
            double dAtan = (Math.atan(f / f2) * 180.0d) / 3.141592653589793d;
            if (f2 > 0.0f) {
                dAtan += 180.0d;
            }
            this.k.rotation().z = (float) (-dAtan);
        }
    }

    public void m() {
        if (this.j) {
            this.j = false;
            this.k.a(0.0f, new Runnable() { // from class: com.tsf.shell.f.h.WorkspaceStub.5
                @Override // java.lang.Runnable
                public void run() {
                    WorkspaceStub.this.k.removeFromParent();
                }
            });
        }
    }

    public void n() {
        if (!com.censivn.C3DEngine.a.e.l()) {
            com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.h.WorkspaceStub.6
                @Override // java.lang.Runnable
                public void run() {
                    WorkspaceStub.this.n();
                }
            });
            return;
        }
        if (com.tsf.shell.f.e._g.MenuOverlay.mCurrentMenu == null && this.h && !this.i && com.tsf.shell.manager.app.StateHub.B() && !com.tsf.shell.manager.app.StateHub.s().a() && !com.tsf.shell.manager.app.v.ScreenHelper.e()) {
            com.tsf.shell.f.b.ShellKeyEventHandler();
            this.e.a(0.0f, 0.0f, this.f.c(), this.f.d(), 204, !this.t);
            com.censivn.C3DEngine.b.c.b.a(this);
            this.i = true;
            this.f.mouseEnabled(true);
            this.f.b();
            com.tsf.shell.manager.app.DataCoordinator.a(this.l);
            this.s.j();
            com.tsf.shell.manager.app.PanelStateManager.i();
        }
    }

    protected void o() {
        if (this.i && !this.q) {
            this.e.a(this.o, this.p, null, !this.t);
            com.censivn.C3DEngine.b.c.b.b(this);
            this.i = false;
            this.f.setAnimationObjectState(false);
            this.f.mouseEnabled(false);
            com.tsf.shell.manager.app.DataCoordinator.e();
            com.tsf.shell.manager.app.PanelStateManager.j();
            this.s.k();
        }
    }

    public void p() {
        if (!this.i) {
            this.m = 0.4f;
            this.n = true;
            this.o = this.e.position().x;
            this.p = this.e.position().y;
            this.e.setAnimationObjectState(true);
            this.e.invalidate();
        }
    }

    public void a(float f, float f2) {
        if (this.n) {
            this.o = f;
            this.p = f2;
            float f3 = this.c / 2.0f;
            if (this.o > com.censivn.C3DEngine.b.b.A.A - f3) {
                this.o = com.censivn.C3DEngine.b.b.A.A - f3;
            } else if (this.o < com.censivn.C3DEngine.b.b.A.z + f3) {
                this.o = com.censivn.C3DEngine.b.b.A.z + f3;
            }
            if (this.p > com.censivn.C3DEngine.b.b.A.B - f3) {
                this.p = com.censivn.C3DEngine.b.b.A.B - f3;
            } else if (this.p < com.censivn.C3DEngine.b.b.A.C + f3) {
                this.p = f3 + com.censivn.C3DEngine.b.b.A.C;
            }
        }
    }

    public void q() {
        if (this.n) {
            this.n = false;
            this.m = 0.2f;
            a(false);
            if (com.censivn.C3DEngine.b.b.A.O) {
                com.tsf.shell.manager.b.ConfigManager.c(this.o, this.p);
            } else {
                com.tsf.shell.manager.b.ConfigManager.d(this.o, this.p);
            }
        }
    }

    private void a(boolean z) {
        float f = this.c / 2.0f;
        if (this.o > com.censivn.C3DEngine.b.b.A.A - f) {
            this.o = com.censivn.C3DEngine.b.b.A.A - f;
        } else if (this.o < com.censivn.C3DEngine.b.b.A.z + f) {
            this.o = com.censivn.C3DEngine.b.b.A.z + f;
        }
        if (this.p > com.censivn.C3DEngine.b.b.A.B - f) {
            this.p = com.censivn.C3DEngine.b.b.A.B - f;
        } else if (this.p < com.censivn.C3DEngine.b.b.A.C + f) {
            this.p = f + com.censivn.C3DEngine.b.b.A.C;
        }
        float fAbs = Math.abs(this.o - com.censivn.C3DEngine.b.b.A.z);
        float fAbs2 = Math.abs(com.censivn.C3DEngine.b.b.A.A - this.o);
        float fAbs3 = Math.abs(com.censivn.C3DEngine.b.b.A.B - this.p);
        float fAbs4 = Math.abs(this.p - com.censivn.C3DEngine.b.b.A.C);
        if (fAbs < fAbs2 && fAbs < fAbs3 && fAbs < fAbs4) {
            this.o = com.censivn.C3DEngine.b.b.A.z + this.c;
            return;
        }
        if (fAbs2 < fAbs && fAbs2 < fAbs3 && fAbs2 < fAbs4) {
            this.o = com.censivn.C3DEngine.b.b.A.A - this.c;
        } else if (fAbs3 < fAbs && fAbs3 < fAbs2 && fAbs3 < fAbs4) {
            this.p = com.censivn.C3DEngine.b.b.A.B - this.c;
        } else {
            this.p = com.censivn.C3DEngine.b.b.A.C + this.c;
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WorkspaceStateController();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        WorkspaceStateController();
        this.s.l();
    }

    private void a(float f, float f2, boolean z) {
        this.o = f;
        this.p = f2;
        a(z);
        if (!this.i) {
            this.e.position().setAll(this.o, this.p, 0.0f);
        }
    }
}
