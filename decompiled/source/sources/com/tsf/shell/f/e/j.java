package com.tsf.shell.f.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.x;
import java.util.Iterator;
/* loaded from: classes.dex */
public class j extends com.censivn.C3DEngine.b.f.j {
    private com.censivn.C3DEngine.b.f.a.a d;
    private com.censivn.C3DEngine.b.f.a.b e;
    private TextureElement k;
    private a l;
    private a m;
    private a n;
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
    private r o = new r();

    public j(final boolean z) {
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.e.j.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (z) {
                    if (j.this.p) {
                        if (j.this.h) {
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
                            j.this.h = true;
                        } else {
                            j.this.h = false;
                        }
                        j.this.p = true;
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.e.j.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (j.this.h) {
                                    j.this.c();
                                    return;
                                }
                                j.this.d();
                                com.tsf.shell.manager.a.h.s().e();
                            }
                        });
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (z) {
                    j.this.b();
                    com.tsf.shell.manager.a.h.a(true);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (z) {
                    if (j.this.p && !j.this.h) {
                        com.tsf.shell.manager.a.h.s().a(motionEvent);
                    }
                    com.tsf.shell.manager.a.h.s().d(motionEvent);
                    j.this.p = false;
                    j.this.e();
                    com.tsf.shell.manager.a.h.g();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (z && j.this.p && !j.this.h) {
                    com.tsf.shell.manager.a.h.s().b(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                j.this.a();
            }
        });
        this.k = x.b(b.d.dock_operation_border_point, com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n);
        this.n = new a(com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n, false, this.k, this.i);
        this.l = new a(com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n, false, this.k, this.j);
        this.l.rotation().z = 90.0f;
        this.m = new a(com.tsf.shell.manager.g.a.m, com.tsf.shell.manager.g.a.n, false, this.k, this.j);
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

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        int i;
        if (this.p && this.h) {
            float f = 2.1474836E9f;
            int i2 = 1;
            Iterator<com.censivn.C3DEngine.b.f.i> it = com.tsf.shell.manager.a.h.u().children().iterator();
            while (true) {
                float f2 = f;
                i = i2;
                if (!it.hasNext()) {
                    break;
                }
                com.censivn.C3DEngine.b.f.i next = it.next();
                if (next instanceof com.tsf.shell.f.f.g) {
                    com.tsf.shell.f.f.g gVar = (com.tsf.shell.f.f.g) next;
                    float abs = Math.abs(gVar.g);
                    if (abs < f2) {
                        i2 = gVar.r();
                        f = abs;
                    }
                }
                i2 = i;
                f = f2;
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
            com.censivn.C3DEngine.b.f.a.b a2 = this.d.a(i2);
            a2.m.pxX(f2);
            a2.b(com.tsf.shell.manager.g.a.l);
            a2.d(com.tsf.shell.manager.g.a.l);
            a2.k().setAll(0.4f, 0.4f, 1.0f);
            a2.a(0, 0, 1, 1);
            a2.h();
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
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.l(0.4f);
                    dVar.m(0.4f);
                    com.censivn.C3DEngine.b.g.c.a(this.e);
                    com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar);
                }
                this.f = i;
                this.e = this.d.a(i);
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 250, dVar2);
            }
            if (!this.g) {
                d(true);
            }
        } else if (this.g) {
            c(true);
        }
    }

    public void a(final boolean z) {
        mouseEnabled(false);
        final float alpha = alpha();
        final float f = z ? 30.0f : 0.0f;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                j.this.alpha(alpha + ((f - alpha) * f2));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (!z) {
                    j.this.visible(false);
                }
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.q);
        com.censivn.C3DEngine.b.g.c.a(this.q, 300, dVar);
    }

    public void b(boolean z) {
        if (this.g) {
            mouseEnabled(true);
        }
        visible(true);
        final float alpha = alpha();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                j.this.alpha(alpha + ((255.0f - alpha) * f));
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.q);
        com.censivn.C3DEngine.b.g.c.a(this.q, 300, dVar);
    }

    public void c(boolean z) {
        this.g = false;
        mouseEnabled(false);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.4
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    j.this.d.visible(false);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.d, 600, dVar);
            return;
        }
        this.d.alpha(0.0f);
    }

    public void d(boolean z) {
        com.censivn.C3DEngine.b.g.c.a(this.d);
        this.g = true;
        this.d.visible(true);
        mouseEnabled(true);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    j.this.d.visible(true);
                }
            };
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.d, 600, dVar);
            return;
        }
        this.d.alpha(255.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends com.censivn.C3DEngine.b.f.j {
        private float b;
        private com.censivn.C3DEngine.b.f.k c;
        private float d;
        private boolean e = false;

        public a(float f, float f2, boolean z, TextureElement textureElement, float f3) {
            this.d = f3;
            this.c = new com.censivn.C3DEngine.b.f.k(f, f2, z);
            this.c.alpha(0.0f);
            PositionNumber3d position = this.c.position();
            float f4 = -f3;
            this.b = f4;
            position.y = f4;
            this.c.textures().addElement(textureElement);
            addChild(this.c);
        }

        public void a() {
            if (!this.e) {
                this.e = true;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.a(VEasing.Back.easeIn);
                dVar.h(0.0f);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 250, dVar);
                removeFromParent();
                j.this.addChild(this);
            }
        }

        public void b() {
            if (this.e) {
                this.e = false;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.a.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        a.this.c.position().y = a.this.b;
                        a.this.removeFromParent();
                    }
                };
                dVar.a(0);
                dVar.h(100.0f * com.censivn.C3DEngine.b.b.a.c);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 250, dVar);
            }
        }
    }
}
