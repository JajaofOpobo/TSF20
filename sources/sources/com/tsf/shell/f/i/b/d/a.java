package com.tsf.shell.f.i.b.d;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.f.e.e.c;
import com.tsf.shell.manager.d.a;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.censivn.C3DEngine.b.d.a {
    private static float[] l = {0.0f, 0.0f};
    private b a;
    private com.censivn.C3DEngine.b.d.a b;
    private boolean d;
    private a.C0127a e;
    private boolean f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private int m;
    private float n;
    private float o;
    private boolean p;
    private Runnable q;

    public a(com.censivn.C3DEngine.b.f.i iVar, b bVar) {
        super(iVar);
        this.d = false;
        this.k = false;
        this.m = -1;
        this.p = false;
        this.a = bVar;
        this.b = iVar.getMouseEventListener();
        this.e = new a.C0127a() { // from class: com.tsf.shell.f.i.b.d.a.1
            @Override // com.tsf.shell.manager.d.a.C0127a
            public boolean a(com.tsf.shell.f.e.f fVar) {
                return fVar instanceof c.b;
            }
        };
    }

    public boolean a() {
        this.a = null;
        this.c.setMouseEventListener(this.b);
        if (this.f) {
            ((com.tsf.shell.f.i.b.e.b) this.c).ah();
            this.b.c(null);
            com.censivn.C3DEngine.a.d.d().e();
            com.censivn.C3DEngine.a.d.d().a(this.b, true);
        }
        this.b = null;
        return this.f;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        super.c(motionEvent);
        this.k = false;
        l = x.a(motionEvent, l);
        this.i = motionEvent.getX();
        this.j = motionEvent.getY();
        if (this.a.aV() == b.a) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) this.c;
            if (com.tsf.shell.manager.a.A.a() && bVar.aC()) {
                this.m = this.a.aF().a(this.c);
                this.a.aO();
                this.a.aF().c(true);
                if (bVar.A().e()) {
                    ArrayList<com.tsf.shell.f.i.c> arrayListI = bVar.A().i();
                    bVar.rotation().z = 0.0f;
                    int size = arrayListI.size();
                    for (int i = 0; i < size; i++) {
                        com.tsf.shell.f.i.b.e.b bVar2 = (com.tsf.shell.f.i.b.e.b) arrayListI.get(i);
                        if (bVar2 != bVar) {
                            bVar2.g(1.0f);
                            bVar.a((com.tsf.shell.f.i.c) bVar2);
                            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                            com.censivn.C3DEngine.b.g.c.a(bVar2);
                            dVar.l(1.0f);
                            dVar.m(1.0f);
                            com.censivn.C3DEngine.b.g.c.a(bVar2, 300, dVar);
                        }
                    }
                    bVar.A().g();
                    this.a.n(false);
                }
                w.a();
                this.f = true;
                Number3d.TEMPNUMBER3D2.reset();
                Number3d number3dLocalToGlobal = this.c.localToGlobal(Number3d.TEMPNUMBER3D2);
                number3dLocalToGlobal.y += this.a.aF().m();
                this.c.position().setAllFrom(number3dLocalToGlobal);
                this.a.aF().a((com.tsf.shell.f.i.b.e.b) this.c);
                com.tsf.shell.manager.a.j.a(this.c);
                b();
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.l(bVar.d);
                dVar2.m(bVar.d);
                dVar2.n(1.0f);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar2);
                this.c.setAnimationObjectState(true);
                if (this.a.aC()) {
                    if (!bVar.as()) {
                        com.tsf.shell.manager.a.h.t().a((com.tsf.shell.f.i.b) bVar, false, l[0], l[1]);
                        return;
                    }
                    return;
                }
                com.tsf.shell.manager.a.p.a(bVar, l[0], l[1], true, 0);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.aF().a(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.aF().a(f2);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        this.a.aF().a(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // com.censivn.C3DEngine.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.b.d.a.d(android.view.MotionEvent):void");
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.f) {
            if (!this.k) {
                if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                    this.k = true;
                    if (this.c instanceof com.tsf.shell.f.i.b) {
                        ((com.tsf.shell.f.i.b) this.c).ab();
                        return;
                    }
                    return;
                }
                return;
            }
            final float[] fArrA = x.a(motionEvent2, l);
            if (!this.d) {
                this.e.a((com.tsf.shell.f.e.f) this.c, motionEvent2);
            }
            this.n = motionEvent2.getX();
            this.o = motionEvent2.getY();
            this.c.position().x = (int) (this.g + (motionEvent2.getX() - this.i));
            this.c.position().y = (int) (this.h - (motionEvent2.getY() - this.j));
            if (this.q == null) {
                this.q = new Runnable() { // from class: com.tsf.shell.f.i.b.d.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.p = false;
                        if (!a.this.d) {
                            com.tsf.shell.manager.a.p.a(fArrA[0], fArrA[1]);
                            int iB = a.this.a.b(a.this.n, a.this.o);
                            if (iB == -2) {
                                a.this.d = true;
                                a.this.a.aF().c(false);
                                a.this.a.a((com.tsf.shell.f.i.b.e.b) a.this.c);
                                return;
                            }
                            if (a.this.m != iB) {
                                switch (iB) {
                                    case -4:
                                        a.this.a.aF();
                                        g.a(false);
                                        a.this.a.aF();
                                        g.b(true);
                                        return;
                                    case -3:
                                        a.this.a.aF();
                                        g.a(true);
                                        a.this.a.aF();
                                        g.b(false);
                                        return;
                                    case -2:
                                    default:
                                        a.this.a.aF();
                                        g.a(false);
                                        a.this.a.aF();
                                        g.b(false);
                                        a.this.a.aF();
                                        g.a();
                                        a.this.a.aF().k();
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        a.this.a.aF();
                                        g.a(false);
                                        a.this.a.aF();
                                        g.b(false);
                                        a.this.a.aF();
                                        g.a();
                                        return;
                                }
                            }
                            if (a.this.a.aF().a(a.this.c, a.this.m, iB)) {
                                a.this.m = iB;
                            }
                        }
                    }
                };
            }
            if (!this.p) {
                this.p = true;
                com.censivn.C3DEngine.a.a().b(this.q);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        if (this.c.parent() instanceof g) {
            g gVar = (g) this.c.parent();
            Number3d.TEMPNUMBER3D2.reset();
            Number3d.TEMPNUMBER3D3.reset();
            this.c.localToGlobal(Number3d.TEMPNUMBER3D2);
            Number3d number3d = Number3d.TEMPNUMBER3D2;
            number3d.y = gVar.m() + number3d.y;
            ((com.tsf.shell.f.i.b.e.b) this.c).a(Number3d.TEMPNUMBER3D2, Number3d.TEMPNUMBER3D3);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        if (this.c instanceof com.tsf.shell.f.i.c) {
            com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) this.c;
            if (cVar.A().e()) {
                cVar.ap();
                return;
            }
        }
        ((com.tsf.shell.f.i.b.e.b) this.c).l();
    }

    public void b() {
        a(this.c.position().x, this.c.position().y);
    }

    public void a(float f, float f2) {
        this.g = f;
        this.h = f2;
    }
}
