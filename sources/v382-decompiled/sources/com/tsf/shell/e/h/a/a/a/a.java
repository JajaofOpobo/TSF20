package com.tsf.shell.e.h.a.a.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.R;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends l {
    private f b;
    private f c;
    private f d;
    private c e;
    private float f;
    private Number3d g;
    private Number3d h;
    private Number3d i;
    private ArrayList j;
    private b k;
    private boolean m = false;
    private float[] n = new float[2];
    private boolean o = false;
    private l a = new l();
    private com.censivn.C3DEngine.b.f.e l = new com.censivn.C3DEngine.b.f.e(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.a(200.0f));

    public a(c cVar) {
        this.e = cVar;
        this.l.a(855638016, -1442840576);
        this.l.alpha(0.0f);
        this.l.visible(false);
        addChild(this.l);
        addChild(this.a);
        this.f = com.censivn.C3DEngine.b.b.a.a(330.0f);
        this.k = new b(com.censivn.C3DEngine.a.d(), this.f, com.censivn.C3DEngine.b.b.a.a(90.0f), com.censivn.C3DEngine.b.b.a.a(21.0f), -16731076);
        this.k.b(45.0f);
        this.b = new f(com.censivn.C3DEngine.b.b.a.a(120.0f), com.censivn.C3DEngine.b.b.a.a(120.0f)) { // from class: com.tsf.shell.e.h.a.a.a.a.1
            @Override // com.tsf.shell.e.h.a.a.a.f
            public Bitmap a() {
                return x.a(R.drawable.contact_menu_call_icon);
            }
        };
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.tsf.shell.e.h.a.a.a.a.2
            private boolean b = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.e.a();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                a.this.d();
                a.this.b();
                a.this.m = true;
                this.b = false;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                this.b = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                a.this.m = false;
                a.this.c();
                a.this.k.a(a.this.g);
                a.this.e();
                x.a(motionEvent, a.this.n);
                j hittingTarget = a.this.a.getHittingTarget(a.this.n[0], a.this.n[1], true);
                if (hittingTarget != a.this.b) {
                    if (hittingTarget != a.this.c) {
                        if (hittingTarget == a.this.d) {
                            w.b();
                            w.a();
                            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.h.a.a.a.a.2.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.e.a().a().h();
                                }
                            }, 500L);
                            return;
                        }
                        return;
                    }
                    w.b();
                    w.a();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.h.a.a.a.a.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.e.a().a().g();
                        }
                    }, 500L);
                    return;
                }
                if (!this.b) {
                    w.b();
                    w.a();
                    com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.h.a.a.a.a.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.e.a().a().f();
                        }
                    }, 250L);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                a.this.a(motionEvent2);
            }
        });
        this.b.calAABB(1.2f, 1.2f, 1.0f);
        this.c = new f(com.censivn.C3DEngine.b.b.a.a(100.0f), com.censivn.C3DEngine.b.b.a.a(100.0f)) { // from class: com.tsf.shell.e.h.a.a.a.a.3
            @Override // com.tsf.shell.e.h.a.a.a.f
            public Bitmap a() {
                return x.a(R.drawable.contact_menu_message_icon);
            }
        };
        this.c.alpha(0.0f);
        this.c.calAABB(4.0f, 4.0f, 1.0f);
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c));
        this.d = new f(com.censivn.C3DEngine.b.b.a.a(100.0f), com.censivn.C3DEngine.b.b.a.a(100.0f)) { // from class: com.tsf.shell.e.h.a.a.a.a.4
            @Override // com.tsf.shell.e.h.a.a.a.f
            public Bitmap a() {
                return x.a(R.drawable.contact_menu_mail_icon);
            }
        };
        this.d.alpha(0.0f);
        this.d.calAABB(4.0f, 4.0f, 1.0f);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d));
        this.a.addChild((j) this.k.getVirtualTarget());
        this.a.addChild(this.c);
        this.a.addChild(this.d);
        this.a.addChild(this.b);
        float cos = (float) (Math.cos(0.7853981633974483d) * this.f);
        float sin = (float) (Math.sin(0.7853981633974483d) * this.f);
        this.g = new Number3d(0.0f, 0.0f, 0.0f);
        this.h = new Number3d(-cos, sin, 0.0f);
        this.i = new Number3d(cos, sin, 0.0f);
        this.j = new ArrayList();
        this.j.add(this.g);
        this.j.add(this.h);
        this.j.add(this.i);
    }

    public void a() {
        this.b.d();
        this.d.d();
        this.c.d();
        this.k.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MotionEvent motionEvent) {
        if (!this.o) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.h.a.a.a.a.5
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.m) {
                        a.this.b(motionEvent);
                    }
                    a.this.o = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MotionEvent motionEvent) {
        float b;
        int i;
        float f;
        int size = this.j.size();
        int i2 = -1;
        x.a(motionEvent, this.n);
        this.n[1] = this.n[1] - position().y;
        if (Math.abs(this.n[1] - ((Number3d) this.j.get(1)).y) < com.censivn.C3DEngine.b.b.a.a(150.0f)) {
            this.n[1] = ((Number3d) this.j.get(1)).y + com.censivn.C3DEngine.b.b.a.a(150.0f);
        }
        int i3 = 0;
        float f2 = Float.MAX_VALUE;
        while (i3 < size) {
            Number3d number3d = (Number3d) this.j.get(i3);
            float b2 = x.b(number3d.x, number3d.y, this.n[0], this.n[1]);
            if (b2 < f2) {
                f = b2;
                i = i3;
            } else {
                i = i2;
                f = f2;
            }
            i3++;
            f2 = f;
            i2 = i;
        }
        int i4 = 0;
        float f3 = Float.MAX_VALUE;
        while (i4 < size) {
            if (i4 == i2) {
                b = f3;
            } else {
                Number3d number3d2 = (Number3d) this.j.get(i4);
                b = x.b(number3d2.x, number3d2.y, this.n[0], this.n[1]);
                if (b >= f3) {
                    b = f3;
                }
            }
            i4++;
            f3 = b;
        }
        this.k.a((Number3d) this.j.get(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.l.a(com.censivn.C3DEngine.b.b.a.D);
        this.l.b(com.censivn.C3DEngine.b.b.a.E + com.censivn.C3DEngine.b.b.a.a(500.0f));
        this.l.position().y = (((this.l.b() / 2.0f) - position().y) + com.censivn.C3DEngine.b.b.a.C) - com.censivn.C3DEngine.b.b.a.K;
        this.l.visible(true);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(255);
        com.censivn.C3DEngine.b.g.w.a(this.l);
        com.censivn.C3DEngine.b.g.w.a(this.l, 350, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.h.a.a.a.a.6
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.l.visible(false);
            }
        };
        xVar.a(0);
        com.censivn.C3DEngine.b.g.w.a(this.l);
        com.censivn.C3DEngine.b.g.w.a(this.l, 350, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(255);
        float cos = (float) (Math.cos(0.7853981633974483d) * this.f);
        float sin = (float) (Math.sin(0.7853981633974483d) * this.f);
        xVar.f(-cos);
        xVar.h(sin);
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.w.a(this.c);
        com.censivn.C3DEngine.b.g.w.a(this.c, 500, xVar);
        com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
        xVar2.a(255);
        xVar2.f(cos);
        xVar2.h(sin);
        xVar2.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.w.a(this.d);
        com.censivn.C3DEngine.b.g.w.a(this.d, 350, xVar2);
        this.d.visible(true);
        this.c.visible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.h.a.a.a.a.7
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.c.visible(false);
            }
        };
        xVar.a(0);
        xVar.f(0.0f);
        xVar.h(0.0f);
        com.censivn.C3DEngine.b.g.w.a(this.c);
        com.censivn.C3DEngine.b.g.w.a(this.c, 300, xVar);
        com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.h.a.a.a.a.8
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.d.visible(false);
            }
        };
        xVar2.a(0);
        xVar2.f(0.0f);
        xVar2.h(0.0f);
        com.censivn.C3DEngine.b.g.w.a(this.d);
        com.censivn.C3DEngine.b.g.w.a(this.d, 300, xVar2);
    }
}
