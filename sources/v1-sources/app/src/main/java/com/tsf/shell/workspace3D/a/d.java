package com.tsf.shell.workspace3D.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.g.k;
import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.g.h;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.al;
import com.tsf.shell.workspace3D.be;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.e.p;
import com.tsf.shell.workspace3D.h.ao;
import com.tsf.shell.workspace3D.k.ab;
import com.tsf.shell.workspace3D.k.j;
import com.tsf.shell.workspace3D.k.o;
import com.tsf.shell.workspace3D.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends l {
    public float a;
    public float c;
    boolean d;
    boolean e;
    private j f;
    private p g;
    private al h;
    private com.tsf.shell.workspace3D.h.l i;
    private ao j;
    private float k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private l s;
    private float[] t;
    private boolean u;

    public d(j jVar) {
        super(jVar);
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = new float[]{0.0f, 0.0f};
        this.u = false;
        this.d = false;
        this.e = true;
        this.f = jVar;
        this.g = bf.s();
        this.h = bf.m();
        this.i = bf.j();
        this.j = this.i.o();
    }

    private static float l(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        if (motionEvent.getY(0) - motionEvent.getY(1) > 0.0f) {
            return ((float) (Math.atan(x / r1) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(x / r1) / 0.017453292519943295d);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        boolean z;
        super.c(motionEvent);
        if (z.a()) {
            j jVar = (j) this.b;
            if (jVar.aV() != null && (jVar instanceof com.tsf.shell.workspace3D.k.z)) {
                com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) jVar;
                if (zVar.aV().d()) {
                    ArrayList e = zVar.aV().e();
                    zVar.M().z = 0.0f;
                    int size = e.size();
                    int i = 0;
                    z = false;
                    while (i < size) {
                        com.tsf.shell.workspace3D.k.z zVar2 = (com.tsf.shell.workspace3D.k.z) e.get(i);
                        if (zVar2 != zVar) {
                            Number3d.TEMPNUMBER3D.reset();
                            Number3d.TEMPNUMBER3D = zVar2.c(Number3d.TEMPNUMBER3D);
                            zVar2.L().setAllFrom(zVar.d(Number3d.TEMPNUMBER3D));
                            zVar.a(zVar2);
                        }
                        i++;
                        z = true;
                    }
                } else {
                    z = false;
                }
                zVar.aV().b();
                if (z) {
                    zVar.bv();
                }
            }
            boolean z2 = jVar.L;
            com.tsf.shell.action.c.a();
            this.q = false;
            this.r = false;
            u uVar = new u();
            uVar.j(jVar.M);
            uVar.k(jVar.M);
            s.a(this.b);
            s.a(this.b, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
            jVar.a_();
            o aV = jVar.aV();
            if (aV != null) {
                aV.c(jVar);
            }
            jVar.aW();
            this.h.a(jVar, true);
            if (motionEvent != null) {
                h.a();
                this.a = this.b.L().x;
                this.c = this.b.L().y;
            }
            if (motionEvent != null && (this.b instanceof com.tsf.shell.workspace3D.g.g) && !this.f.aY()) {
                com.censivn.C3DEngine.h.a.a(motionEvent, this.t);
                com.tsf.shell.workspace3D.g.g gVar = (com.tsf.shell.workspace3D.g.g) this.b;
                if (gVar.k()) {
                    com.tsf.shell.workspace3D.g.g a = gVar.a((int) this.t[0], (int) this.t[1]);
                    if (a != null) {
                        gVar.e(a);
                    } else {
                        gVar.m();
                    }
                }
            } else {
                this.t[0] = jVar.L().x;
                this.t[1] = jVar.L().y;
            }
            this.o = true;
            if (!jVar.aY()) {
                this.g.a(this.b, true);
                this.g.c(this.b);
                this.g.e(this.b);
                this.g.f(this.b);
                if (!z2) {
                    this.g.a(jVar, this.t[0], this.t[1]);
                }
            }
        }
    }

    public final void a() {
        this.o = true;
    }

    public final boolean b() {
        return this.o;
    }

    public final void a(boolean z) {
        this.p = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // com.censivn.C3DEngine.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(MotionEvent motionEvent) {
        boolean z;
        com.tsf.shell.workspace3D.g.g gVar = null;
        super.d(motionEvent);
        if (z.a()) {
            if (this.p) {
                this.p = false;
                this.i.s();
                a((Integer) null, (Integer) null);
            } else {
                a((Integer) null, (Integer) null);
                if ((this.b instanceof com.tsf.shell.workspace3D.g.g) && !this.f.aY()) {
                    com.tsf.shell.workspace3D.g.g gVar2 = (com.tsf.shell.workspace3D.g.g) this.b;
                    if ((this.q || gVar2.j() != null) && gVar2.k()) {
                        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
                        gVar = gVar2.a((int) a[0], (int) a[1]);
                        if (gVar != null) {
                            z = ((com.tsf.shell.workspace3D.g.g) this.b).f(gVar);
                            if (gVar == null && bf.j().z() == -1) {
                                z = ((com.tsf.shell.workspace3D.g.g) this.b).f(bf.s().h());
                            }
                            if (z) {
                                this.h.e();
                            } else {
                                this.f.b_();
                                this.h.d();
                            }
                        } else {
                            gVar2.m();
                        }
                    }
                }
                z = false;
                if (gVar == null) {
                    z = ((com.tsf.shell.workspace3D.g.g) this.b).f(bf.s().h());
                }
                if (z) {
                }
            }
            this.o = false;
            this.g.d(this.b);
            this.g.b(this.b);
            this.g.y();
        }
    }

    public final void a(Integer num, Integer num2) {
        float[] a;
        e eVar = new e(this);
        if (num != null && num2 != null) {
            a = new float[]{num.intValue(), num2.intValue()};
        } else {
            a = be.a(this.f, false);
        }
        if (a[0] != this.f.L().x || a[1] != this.f.L().y) {
            eVar.f(a[0]);
            eVar.h(a[1]);
        }
        eVar.j(1.0f);
        eVar.k(1.0f);
        eVar.a((r) new k());
        s.a(this.b);
        s.a(this.f, ThemeShellDescription.PAGE_PREVIEW_SELECT, eVar);
        this.f.o();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.o) {
            this.g.e(this.b);
            this.g.f(this.b);
            if (this.f.aY()) {
                com.tsf.shell.workspace3D.g.a.a((int) (this.a + (motionEvent2.getX() - motionEvent.getX())), (int) (this.c - (motionEvent2.getY() - motionEvent.getY())));
            } else if (this.q) {
                this.b.L().x = (int) (this.a + (motionEvent2.getX() - motionEvent.getX()));
                this.b.L().y = (int) (this.c - (motionEvent2.getY() - motionEvent.getY()));
                float[] a = com.censivn.C3DEngine.h.a.a(motionEvent2, this.t);
                this.g.b(a[0], a[1]);
            } else if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                this.q = true;
                this.f.aI();
            }
            if (motionEvent2.getPointerCount() == 2) {
                if (this.f.bg()) {
                    if (!this.r) {
                        this.r = true;
                        this.g.y();
                        this.f.bq();
                    }
                    this.f.M().z = this.n - (this.m - l(motionEvent2));
                    return;
                }
                return;
            }
            if (this.p) {
                this.i.a(motionEvent2.getX(), motionEvent2.getY(), this.k, this.l);
                return;
            }
            if (this.q && (this.b instanceof com.tsf.shell.workspace3D.g.g)) {
                com.tsf.shell.workspace3D.g.g gVar = (com.tsf.shell.workspace3D.g.g) this.b;
                if (gVar.k()) {
                    com.censivn.C3DEngine.h.a.a(motionEvent2, this.t);
                    if (!this.u) {
                        com.censivn.C3DEngine.a.a().b(new f(this, gVar));
                        this.u = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.s != null && this.f.bh()) {
            this.s.a(motionEvent, motionEvent2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // com.censivn.C3DEngine.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(MotionEvent motionEvent) {
        boolean z;
        com.censivn.C3DEngine.b.r rVar;
        super.e(motionEvent);
        this.f.aR();
        this.d = false;
        this.k = motionEvent.getX();
        this.l = motionEvent.getY();
        if (this.f instanceof com.tsf.shell.workspace3D.k.z) {
            com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) this.f;
            if (zVar.aV() != null) {
                z = zVar.aV().d();
                if (z) {
                    float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
                    rVar = this.b.b(a[0], a[1], true);
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    this.s = rVar.aw();
                    this.s.e(motionEvent);
                } else {
                    this.s = null;
                }
                if (this.f.bi()) {
                    com.tsf.shell.action.c.a(motionEvent);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
        }
        if (rVar == null) {
        }
        if (this.f.bi()) {
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void i(MotionEvent motionEvent) {
        if (!this.f.bh() && this.j.c()) {
            bf.j().o();
        }
        if (this.s != null) {
            this.s.i(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void j(MotionEvent motionEvent) {
        if (!this.f.bh() && this.j.c()) {
            bf.j().o().i();
        }
        this.m = l(motionEvent);
        this.n = this.b.M().z;
        if (this.s != null) {
            this.s.j(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void k(MotionEvent motionEvent) {
        if (this.f instanceof com.tsf.shell.workspace3D.k.z) {
            com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) this.f;
            if (zVar.aV() != null && zVar.aV().d()) {
                return;
            }
        }
        if (!z.a && (this.f instanceof ab)) {
            ((ab) this.f).bP();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.f instanceof com.tsf.shell.workspace3D.k.z) {
            com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) this.f;
            if (zVar.aV() != null && zVar.aV().d()) {
                zVar.bB();
                return;
            }
        }
        if (z.a && (this.f instanceof ab)) {
            ((ab) this.f).bP();
        }
        if (this.s != null) {
            this.s.a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent) {
        if (this.s != null) {
            this.s.b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        if (this.s != null) {
            this.s.g(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f.L) {
            if (!bf.s().h().a(motionEvent, motionEvent2)) {
                if (this.s != null) {
                    this.s.a(motionEvent, motionEvent2, f, f2);
                    return;
                }
                if (this.e) {
                    this.e = false;
                    bf.s().h().a(motionEvent2.getX(), motionEvent2.getY());
                }
                bf.s().h().c(motionEvent2.getX(), motionEvent2.getY());
                return;
            }
            if (this.e) {
                this.e = false;
                bf.s().h().a(motionEvent2.getX(), motionEvent2.getY());
            }
            bf.s().h().c(motionEvent2.getX(), motionEvent2.getY());
            return;
        }
        if (!this.f.bh() && this.j.c()) {
            bf.j().o().b(motionEvent, motionEvent2);
            boolean g = bf.j().o().g();
            this.d = bf.j().o().h();
            if (g && !this.d && this.s != null) {
                this.s.a(motionEvent, motionEvent2, f, f2);
                return;
            }
            return;
        }
        if (this.s != null) {
            this.s.a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        if (!this.e) {
            this.e = true;
            bf.s().h().n();
        }
        if (this.s != null) {
            this.s.f(motionEvent);
        }
        if (this.f.L) {
            bf.s().h().aG();
        } else if (!this.f.bh() && this.j.c()) {
            bf.j().o().j();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f.L && !this.f.bh() && this.j.c()) {
            bf.j().o().a(f);
        }
        if (this.s != null && !this.d) {
            this.s.b(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
        if (!z.a) {
            if (this.f instanceof ab) {
                ((com.tsf.shell.workspace3D.k.z) this.f).bB();
            }
            if (this.s != null) {
                this.s.h(motionEvent);
            }
        }
    }
}
