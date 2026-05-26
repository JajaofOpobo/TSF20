package com.tsf.shell.f.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
                                } else {
                                    j.this.d();
                                    com.tsf.shell.manager.a.h.s().e();
                                }
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.censivn.C3DEngine.b.f.i
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
            com.tsf.shell.f.f.n r0 = com.tsf.shell.manager.a.h
            com.censivn.C3DEngine.b.f.j r2 = r0.u()
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
            com.censivn.C3DEngine.b.f.i r0 = (com.censivn.C3DEngine.b.f.i) r0
            boolean r3 = r0 instanceof com.tsf.shell.f.f.g
            if (r3 == 0) goto L51
            com.tsf.shell.f.f.g r0 = (com.tsf.shell.f.f.g) r0
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
            com.tsf.shell.f.e.r r0 = r6.o
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.j.onDrawStart():void");
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
            com.censivn.C3DEngine.b.f.a.b bVarA = this.d.a(i2);
            bVarA.m.pxX(f2);
            bVarA.b(com.tsf.shell.manager.g.a.l);
            bVarA.d(com.tsf.shell.manager.g.a.l);
            bVarA.k().setAll(0.4f, 0.4f, 1.0f);
            bVarA.a(0, 0, 1, 1);
            bVarA.h();
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
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                j.this.alpha(fAlpha + ((f - fAlpha) * f2));
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
        final float fAlpha = alpha();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.j.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                j.this.alpha(fAlpha + ((255.0f - fAlpha) * f));
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

    private class a extends com.censivn.C3DEngine.b.f.j {
        private float b;
        private com.censivn.C3DEngine.b.f.k c;
        private float d;
        private boolean e = false;

        public a(float f, float f2, boolean z, TextureElement textureElement, float f3) {
            this.d = f3;
            this.c = new com.censivn.C3DEngine.b.f.k(f, f2, z);
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
