package com.tsf.shell.e.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.e.g;
import com.tsf.shell.e.e.g.e;
import com.tsf.shell.e.f.r;
import com.tsf.shell.manager.action.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends com.censivn.C3DEngine.b.d.a {
    public static r a;
    public float b;
    public float d;
    boolean e;
    boolean f;
    private com.tsf.shell.e.i.c g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private com.censivn.C3DEngine.b.d.a p;
    private com.tsf.shell.manager.d.b q;
    private float[] r;

    public c(com.tsf.shell.e.i.c cVar) {
        super(cVar);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.r = new float[]{0.0f, 0.0f};
        this.e = false;
        this.f = true;
        this.g = cVar;
        this.q = new com.tsf.shell.manager.d.b();
    }

    private void d() {
        this.b = this.c.position().x;
        this.d = this.c.position().y;
    }

    public void a(float f, float f2) {
        this.b = f;
        this.d = f2;
    }

    private float l(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        if (motionEvent.getY(0) - motionEvent.getY(1) > 0.0f) {
            return ((float) (Math.atan(x / r1) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(x / r1) / 0.017453292519943295d);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        float f;
        float f2;
        super.c(motionEvent);
        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.c;
        if (com.tsf.shell.manager.a.A.a()) {
            if (cVar == null || !cVar.O()) {
                com.tsf.shell.manager.a.h.d.a(cVar);
                com.tsf.shell.manager.a.h.a(cVar);
                e.onTempleteHide();
                if (com.tsf.shell.manager.a.h.F() != -1) {
                    com.tsf.shell.manager.a.h.a().b();
                }
                if (cVar.A() != null && (cVar instanceof com.tsf.shell.e.i.e)) {
                    com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) cVar;
                    if (eVar.A().e()) {
                        ArrayList i = eVar.A().i();
                        i.remove(cVar);
                        eVar.rotation().z = 0.0f;
                        if (i.size() > 0) {
                            eVar.ah();
                            eVar.b(i);
                        }
                    }
                    eVar.A().g();
                }
                com.tsf.shell.manager.a.j.a((j) cVar, true);
                h.a();
                this.n = false;
                this.o = false;
                x xVar = new x();
                xVar.l(cVar.d);
                xVar.m(cVar.d);
                w.a(this.c);
                w.a(this.c, 500, xVar);
                cVar.l_();
                com.tsf.shell.e.i.a A = cVar.A();
                if (A != null) {
                    A.a(cVar);
                }
                cVar.B();
                if (motionEvent == null) {
                    this.n = true;
                } else {
                    com.tsf.shell.utils.w.a();
                }
                d();
                if (motionEvent != null) {
                    com.tsf.shell.utils.x.a(motionEvent, this.r);
                    f = this.r[0];
                    f2 = this.r[1];
                } else {
                    f = cVar.position().x;
                    f2 = cVar.position().y;
                }
                if (motionEvent != null && (this.c instanceof g) && !this.g.D()) {
                    g gVar = (g) this.c;
                    if (gVar.o()) {
                        g a2 = gVar.a((int) f, (int) f2);
                        if (a2 != null) {
                            gVar.f(a2);
                        } else {
                            gVar.p();
                        }
                    }
                }
                b(true);
                if (!cVar.D()) {
                    com.tsf.shell.manager.a.h.b().b();
                    com.tsf.shell.manager.a.n.a((j) cVar);
                    if (com.tsf.shell.manager.a.h.d.b()) {
                        com.tsf.shell.manager.a.p.a(cVar, f, f2, true, 0, 1);
                    } else {
                        com.tsf.shell.manager.a.p.a(cVar, f, f2, true, 0, 2, 1);
                    }
                }
            }
        }
    }

    private void b(boolean z) {
        this.l = z;
    }

    public boolean a() {
        return this.l;
    }

    public void a(boolean z) {
        this.m = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    @Override // com.censivn.C3DEngine.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(MotionEvent motionEvent) {
        boolean z;
        super.d(motionEvent);
        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.c;
        com.tsf.shell.manager.a.h.a().d();
        if (!com.tsf.shell.manager.a.A.a() || (cVar != null && cVar.O())) {
            cVar.P();
            return;
        }
        com.tsf.shell.manager.a.h.d.b(cVar);
        e.onTempleteShow();
        if (this.m) {
            this.m = false;
            b();
            a.x();
        } else {
            com.tsf.shell.manager.a.h.d();
            if ((this.c instanceof g) && !this.g.D()) {
                g gVar = (g) this.c;
                if ((this.n || gVar.n() != null) && gVar.o()) {
                    float[] a2 = com.tsf.shell.utils.x.a(motionEvent);
                    g a3 = gVar.a((int) a2[0], (int) a2[1]);
                    if (gVar.h(a3)) {
                        com.tsf.shell.manager.a.j.b(cVar);
                        gVar.g(a3);
                        this.g.k_();
                        this.g.c();
                        z = false;
                    } else {
                        com.tsf.shell.manager.a.j.b(cVar);
                        gVar.p();
                        z = true;
                    }
                    if (z) {
                        com.tsf.shell.manager.a.j.b(cVar);
                        com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
                        if (n != null) {
                            cVar.removeFromParent();
                            n.a(cVar);
                        }
                        b();
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        b(false);
        com.tsf.shell.manager.a.p.c();
        com.tsf.shell.manager.a.h.b().c();
        com.tsf.shell.manager.a.n.e();
    }

    public void b() {
        if (com.tsf.shell.manager.a.h.d.b()) {
            a(com.tsf.shell.manager.a.h.d.a(), true);
        } else {
            c();
        }
    }

    public void c() {
        a((float[]) null, false);
    }

    public void a(float[] fArr, boolean z) {
        x xVar = new x() { // from class: com.tsf.shell.e.i.a.c.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                c.this.g.c();
            }
        };
        if (fArr == null) {
            fArr = com.tsf.shell.manager.r.a.a(this.g, this.g.position().x, this.g.position().y);
        }
        if (fArr[0] != this.g.position().x || fArr[1] != this.g.position().y) {
            xVar.f(fArr[0]);
            xVar.h(fArr[1]);
            if (this.g.Y()) {
                com.tsf.shell.e.e.x.a(fArr[0] - this.g.position().x, fArr[1] - this.g.position().y);
            }
        }
        if (z) {
            xVar.e(0.0f);
        }
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        w.a(this.c);
        w.a(this.g, 380, xVar);
        this.g.k_();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.l) {
            if (this.g.D()) {
                com.tsf.shell.e.e.a.a((int) (this.b + (motionEvent2.getX() - motionEvent.getX())), (int) (this.d - (motionEvent2.getY() - motionEvent.getY())));
            } else if (this.n) {
                this.c.position().x = (int) (this.b + (motionEvent2.getX() - motionEvent.getX()));
                this.c.position().y = (int) (this.d - (motionEvent2.getY() - motionEvent.getY()));
                float[] a2 = com.tsf.shell.utils.x.a(motionEvent2, this.r);
                com.tsf.shell.manager.a.p.a(a2[0], a2[1]);
            } else if (com.tsf.shell.utils.x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                this.n = true;
                this.g.ab();
            }
            if (motionEvent2.getPointerCount() == 2) {
                if (this.g.M()) {
                    if (!this.o) {
                        this.o = true;
                        this.g.aa();
                        com.tsf.shell.manager.a.p.c();
                    }
                    this.g.rotation().z = this.k - (this.j - l(motionEvent2));
                    return;
                }
                return;
            }
            if (this.m) {
                a.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                return;
            } else {
                if (this.n && (this.c instanceof g)) {
                    this.q.a((g) this.c, motionEvent2);
                    return;
                }
                return;
            }
        }
        if (this.p != null && this.g.Q()) {
            this.p.a(motionEvent, motionEvent2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.censivn.C3DEngine.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(MotionEvent motionEvent) {
        boolean z;
        j jVar;
        super.e(motionEvent);
        this.e = false;
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        if (this.g instanceof com.tsf.shell.e.i.e) {
            com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) this.g;
            if (eVar.A() != null) {
                z = eVar.A().e();
                if (z) {
                    float[] a2 = com.tsf.shell.utils.x.a(motionEvent);
                    jVar = this.c.getHittingTarget(a2[0], a2[1], true);
                } else {
                    jVar = null;
                }
                if (jVar == null) {
                    this.p = jVar.getMouseEventListener();
                    this.p.e(motionEvent);
                } else {
                    this.p = null;
                }
                if (this.g.R()) {
                    h.a(motionEvent);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
        }
        if (jVar == null) {
        }
        if (this.g.R()) {
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void i(MotionEvent motionEvent) {
        if (!this.g.Q()) {
            com.tsf.shell.manager.a.h.s().b(motionEvent);
        }
        if (this.p != null) {
            this.p.i(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void j(MotionEvent motionEvent) {
        if (!this.g.Q()) {
            com.tsf.shell.manager.a.h.s().c(motionEvent);
        }
        this.j = l(motionEvent);
        this.k = this.c.rotation().z;
        if (this.p != null) {
            this.p.j(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        if (this.g instanceof com.tsf.shell.e.i.e) {
            com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) this.g;
            if (eVar.A() != null && eVar.A().e()) {
                eVar.ap();
                return;
            }
        }
        if (this.g instanceof com.tsf.shell.e.i.b.e.b) {
            ((com.tsf.shell.e.i.b.e.b) this.g).l();
        }
        if (this.p != null) {
            this.p.a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent) {
        if (this.p != null) {
            this.p.b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        if (this.p != null) {
            this.p.g(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.g.c) {
            if (!this.g.Q()) {
                com.tsf.shell.manager.a.h.s().d(motionEvent, motionEvent2, f, f2);
                boolean f3 = com.tsf.shell.manager.a.h.s().f();
                this.e = com.tsf.shell.manager.a.h.s().g();
                if (f3 && !this.e && this.p != null) {
                    this.p.a(motionEvent, motionEvent2, f, f2);
                    return;
                }
                return;
            }
            if (this.p != null) {
                this.p.a(motionEvent, motionEvent2, f, f2);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        if (this.p != null) {
            this.p.f(motionEvent);
        }
        if (!this.g.c && !this.g.Q()) {
            com.tsf.shell.manager.a.h.s().d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.g.c && !this.g.Q()) {
            com.tsf.shell.manager.a.h.s().a(motionEvent, motionEvent2, f, f2);
        }
        if (this.p != null && !this.e) {
            this.p.b(motionEvent, motionEvent2, f, f2);
        }
    }
}
