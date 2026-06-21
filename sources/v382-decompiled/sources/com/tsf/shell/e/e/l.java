package com.tsf.shell.e.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l extends com.censivn.C3DEngine.b.f.l {
    private com.censivn.C3DEngine.b.f.a.a d;
    private com.censivn.C3DEngine.b.f.a.b e;
    private TextureElement k;
    private m l;
    private m m;
    private m n;
    private int a = 50;
    private int b = 0;
    private int f = -1;
    private boolean g = true;
    private boolean h = false;
    private boolean p = false;
    private com.censivn.C3DEngine.b.g.b.b q = new com.censivn.C3DEngine.b.g.b.b();
    private float i = com.censivn.C3DEngine.b.b.a.c * 100.0f;
    private float j = com.censivn.C3DEngine.b.b.a.c * 100.0f;
    private TextureElement c = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_PREVIEW_INDICATOR, com.tsf.shell.manager.g.a.l, com.tsf.shell.manager.g.a.l);
    private v o = new v();

    public l(final boolean z) {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.e.l.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (z) {
                    if (l.this.p) {
                        if (l.this.h) {
                            com.tsf.shell.manager.a.h.s().c(motionEvent, motionEvent2, 0.0f, 0.0f);
                            return;
                        } else {
                            com.tsf.shell.manager.a.h.s().a(motionEvent, motionEvent2);
                            return;
                        }
                    }
                    com.tsf.shell.manager.a.h.s().c(motionEvent, motionEvent2, 0.0f, 0.0f);
                    if (com.tsf.shell.manager.a.h.s().f()) {
                        if (com.tsf.shell.manager.a.h.s().g()) {
                            l.this.h = true;
                        } else {
                            l.this.h = false;
                        }
                        l.this.p = true;
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.l.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (l.this.h) {
                                    l.this.c();
                                } else {
                                    l.this.d();
                                    com.tsf.shell.manager.a.h.s().e();
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (!z) {
                    return;
                }
                l.this.b();
                com.tsf.shell.manager.a.h.a(true);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (z) {
                    if (l.this.p && !l.this.h) {
                        com.tsf.shell.manager.a.h.s().a(motionEvent);
                    }
                    com.tsf.shell.manager.a.h.s().d(motionEvent);
                    l.this.p = false;
                    l.this.e();
                    com.tsf.shell.manager.a.h.g();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (z && l.this.p && !l.this.h) {
                    com.tsf.shell.manager.a.h.s().b(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                l.this.a();
            }
        });
        this.k = com.tsf.shell.utils.x.b(R.drawable.dock_operation_border_point, com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n);
        this.n = new m(this, com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n, false, this.k, this.i);
        this.l = new m(this, com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n, false, this.k, this.j);
        this.l.rotation().z = 90.0f;
        this.m = new m(this, com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n, false, this.k, this.j);
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
        c();
        d();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.p && this.h) {
            Iterator it = com.tsf.shell.manager.a.h.u().children().iterator();
            float f = 2.1474836E9f;
            int i = 1;
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if (jVar instanceof com.tsf.shell.e.f.g) {
                    com.tsf.shell.e.f.g gVar = (com.tsf.shell.e.f.g) jVar;
                    float abs = Math.abs(gVar.g);
                    if (abs < f) {
                        i = gVar.r();
                        f = abs;
                    }
                }
            }
            if (this.f != i - 1) {
                this.o.b(i);
            }
            b(i - 1);
        }
    }

    public void a(int i) {
        if (this.d != null) {
            this.d.destroy();
        }
        this.b = i;
        this.e = null;
        float f = 0.0f - (((this.a * com.censivn.C3DEngine.b.b.a.c) * (i - 1)) / 2.0f);
        this.d = new com.censivn.C3DEngine.b.f.a.a(i, 32, 32, 32);
        this.d.useVBO(false);
        float f2 = f;
        for (int i2 = 0; i2 < i; i2++) {
            com.censivn.C3DEngine.b.f.a.b a = this.d.a(i2);
            a.m.pxX(f2);
            a.b(com.tsf.shell.manager.g.a.l);
            a.d(com.tsf.shell.manager.g.a.l);
            a.k().setAll(0.4f, 0.4f, 1.0f);
            a.a(0, 0, 1, 1);
            a.h();
            f2 += this.a * com.censivn.C3DEngine.b.b.a.c;
        }
        this.d.textures().addElement(this.c);
        addChild(this.d);
        if (!this.g) {
            this.d.alpha(0.0f);
        }
        if (this.f < this.b && this.f > -1) {
            this.e = this.d.a(this.f);
        }
        setAABBPX(f - com.censivn.C3DEngine.b.b.a.a(150.0f), com.censivn.C3DEngine.b.b.a.c * (-55.0f), 0.0f, com.censivn.C3DEngine.b.b.a.a(150.0f) + (-f), com.censivn.C3DEngine.b.b.a.c * 55.0f, 0.0f);
        this.l.position().x = f - this.j;
        this.m.position().x = (-f) + this.j;
        this.n.position().y = this.i;
        this.f = -1;
    }

    public void b(int i) {
        if (i > -1 && i < this.b) {
            if (this.f != i) {
                if (this.e != null) {
                    com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                    xVar.l(0.4f);
                    xVar.m(0.4f);
                    com.censivn.C3DEngine.b.g.w.a(this.e);
                    com.censivn.C3DEngine.b.g.w.a(this.e, 250, xVar);
                }
                this.f = i;
                this.e = this.d.a(i);
                com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
                xVar2.l(1.0f);
                xVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.w.a(this.e);
                com.censivn.C3DEngine.b.g.w.a(this.e, 250, xVar2);
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
        final float alpha = alpha();
        final float f = z ? 30 : 0;
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.l.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                l.this.alpha(alpha + ((f - alpha) * f2));
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (!z) {
                    l.this.visible(false);
                }
            }
        };
        com.censivn.C3DEngine.b.g.w.a(this.q);
        com.censivn.C3DEngine.b.g.w.a(this.q, 300, xVar);
    }

    public void b(boolean z) {
        if (this.g) {
            mouseEnabled(true);
        }
        visible(true);
        final float alpha = alpha();
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.l.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                l.this.alpha(alpha + ((255.0f - alpha) * f));
            }
        };
        com.censivn.C3DEngine.b.g.w.a(this.q);
        com.censivn.C3DEngine.b.g.w.a(this.q, 300, xVar);
    }

    public void c(boolean z) {
        this.g = false;
        mouseEnabled(false);
        com.censivn.C3DEngine.b.g.w.a(this.d);
        if (z) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.l.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    l.this.d.visible(false);
                }
            };
            xVar.a(0);
            com.censivn.C3DEngine.b.g.w.a(this.d, 600, xVar);
            return;
        }
        this.d.alpha(0.0f);
    }

    public void d(boolean z) {
        com.censivn.C3DEngine.b.g.w.a(this.d);
        this.g = true;
        this.d.visible(true);
        mouseEnabled(true);
        if (z) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.l.5
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f) {
                    l.this.d.visible(true);
                }
            };
            xVar.a(255);
            com.censivn.C3DEngine.b.g.w.a(this.d, 600, xVar);
            return;
        }
        this.d.alpha(255.0f);
    }
}
