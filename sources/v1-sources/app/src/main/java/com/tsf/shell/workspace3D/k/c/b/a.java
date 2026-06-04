package com.tsf.shell.workspace3D.k.c.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.be;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
final class a extends com.censivn.C3DEngine.b.l {
    private c a;
    private com.tsf.shell.workspace3D.a.d c;
    private boolean d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private float l;
    private float m;
    private boolean n;
    private Runnable o;

    public a(com.censivn.C3DEngine.b.r rVar, c cVar) {
        super(rVar);
        this.d = false;
        this.j = false;
        this.k = -1;
        this.n = false;
        this.a = cVar;
        this.c = (com.tsf.shell.workspace3D.a.d) rVar.aw();
    }

    public final boolean a() {
        this.a = null;
        com.tsf.shell.workspace3D.a.d dVar = this.c;
        float f = this.f;
        float f2 = this.g;
        dVar.a = f;
        dVar.c = f2;
        this.b.a((com.censivn.C3DEngine.b.l) this.c);
        if (this.e) {
            ((com.tsf.shell.workspace3D.k.ab) this.b).bv();
            this.c.c((MotionEvent) null);
            com.censivn.C3DEngine.b.m.d().a((com.censivn.C3DEngine.b.l) this.c, true);
        }
        this.c = null;
        return this.e;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        super.c(motionEvent);
        this.j = false;
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        if (this.a.r() == c.a && com.tsf.shell.workspace3D.z.a()) {
            this.k = this.a.j().g(this.b);
            c cVar = this.a;
            c.x();
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.b;
            this.a.j().j(true);
            if (abVar.aV().d()) {
                ArrayList e = abVar.aV().e();
                abVar.M().z = 0.0f;
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) e.get(i);
                    if (zVar != abVar) {
                        Number3d.TEMPNUMBER3D2.reset();
                        zVar.L().setAllFrom(abVar.d(zVar.c(Number3d.TEMPNUMBER3D2)));
                        abVar.a(zVar);
                    }
                }
                abVar.aV().b();
                this.a.b(false);
            } else {
                abVar.bw();
            }
            com.tsf.shell.g.h.a();
            this.e = true;
            Number3d.TEMPNUMBER3D2.reset();
            Number3d c = this.b.c(Number3d.TEMPNUMBER3D2);
            c.y += this.a.j().q();
            this.b.L().setAllFrom(c);
            this.a.j().a((com.tsf.shell.workspace3D.k.ab) this.b);
            bf.m().a(this.b);
            float f = this.b.L().x;
            float f2 = this.b.L().y;
            this.f = f;
            this.g = f2;
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.j(1.2f);
            uVar.k(1.2f);
            uVar.l(1.2f);
            com.censivn.C3DEngine.g.s.a(this.b);
            com.censivn.C3DEngine.g.s.a(this.b, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
            this.b.a_(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.j().a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.j().g(f2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        this.a.j().g(0.0f);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        this.b.a_(false);
        super.d(motionEvent);
        if (this.a.r() == c.a && this.e) {
            this.a.j().j(false);
            this.e = false;
            if (this.d) {
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                float[] a = be.a((com.tsf.shell.workspace3D.k.j) this.b);
                if (a[0] != this.b.L().x || a[1] != this.b.L().y) {
                    uVar.f(a[0]);
                    uVar.h(a[1]);
                }
                uVar.j(1.0f);
                uVar.k(1.0f);
                uVar.l(1.0f);
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
                com.censivn.C3DEngine.g.s.a(this.b);
                com.censivn.C3DEngine.g.s.a(this.b, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) this.b;
                jVar.be().screen = bf.j().z();
                jVar.bs();
            } else {
                com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.b;
                bf.m();
                abVar.Q();
                this.a.j().d(this.b.L()).y -= this.a.j().q();
                com.censivn.C3DEngine.g.s.a(this.b);
                int b = this.a.j().b(abVar);
                ArrayList bH = abVar.bH();
                int size = bH == null ? 0 : bH.size();
                if (size > 0) {
                    if (b != -1) {
                        for (int i = 0; i < size; i++) {
                            com.tsf.shell.workspace3D.k.ab abVar2 = (com.tsf.shell.workspace3D.k.ab) bH.get(i);
                            abVar2.L().x = abVar.L().x + (com.tsf.shell.workspace3D.k.ab.B * (i + 1));
                            abVar2.L().y = abVar.L().y + (com.tsf.shell.workspace3D.k.ab.B * (i + 1));
                            abVar2.Q();
                            this.a.j().a(abVar2, b);
                        }
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("restoreShortcut index error", Integer.toString(b));
                        com.flurry.android.t.a("EVENT_ISSUSE_FOLDER_ITEM_MOUSE_EVENT", hashMap);
                    }
                    this.a.b(false);
                    abVar.bE();
                }
            }
            this.a.u();
            c cVar = this.a;
            c.y();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.e) {
            if (!this.j) {
                if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                    this.j = true;
                    if (this.b instanceof com.tsf.shell.workspace3D.k.j) {
                        ((com.tsf.shell.workspace3D.k.j) this.b).aI();
                        return;
                    }
                    return;
                }
                return;
            }
            this.l = motionEvent2.getX();
            this.m = motionEvent2.getY();
            this.b.L().x = (int) (this.f + (motionEvent2.getX() - this.h));
            this.b.L().y = (int) (this.g - (motionEvent2.getY() - this.i));
            if (this.o == null) {
                this.o = new b(this);
            }
            if (!this.n) {
                this.n = true;
                com.censivn.C3DEngine.a.a().b(this.o);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        if (this.b.P() instanceof ai) {
            ai aiVar = (ai) this.b.P();
            Number3d.TEMPNUMBER3D2.reset();
            this.b.c(Number3d.TEMPNUMBER3D2);
            Number3d number3d = Number3d.TEMPNUMBER3D2;
            number3d.y = aiVar.q() + number3d.y;
            ((com.tsf.shell.workspace3D.k.ab) this.b).e(Number3d.TEMPNUMBER3D2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void k(MotionEvent motionEvent) {
        if ((!(this.b instanceof com.tsf.shell.workspace3D.k.z) || !((com.tsf.shell.workspace3D.k.z) this.b).aV().d()) && !com.tsf.shell.workspace3D.z.a && !this.a.j().aN()) {
            ((com.tsf.shell.workspace3D.k.ab) this.b).bP();
            this.a.v();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.b instanceof com.tsf.shell.workspace3D.k.z) {
            com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) this.b;
            if (zVar.aV().d()) {
                zVar.bB();
                return;
            }
        }
        if (com.tsf.shell.workspace3D.z.a && !this.a.j().aN()) {
            ((com.tsf.shell.workspace3D.k.ab) this.b).bP();
            this.a.v();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
        if (!com.tsf.shell.workspace3D.z.a && !this.a.w()) {
            ((com.tsf.shell.workspace3D.k.ab) this.b).bB();
        }
    }
}
