package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.ab;
import com.tsf.shell.workspace3D.k.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends com.censivn.C3DEngine.b.l {
    public boolean a;
    private k c;
    private i d;
    private com.tsf.shell.workspace3D.k.j e;
    private float f;
    private float g;
    private boolean h;

    public a(r rVar) {
        super(rVar);
        this.h = false;
    }

    public final void a(k kVar) {
        this.c = kVar;
        this.d = kVar.i();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.d.n();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        this.d.m();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        i iVar = this.d;
        this.c.a(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void k(MotionEvent motionEvent) {
        i iVar = this.d;
        this.c.d(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
        if (this.c.h(false)) {
            i iVar = this.d;
            this.c.c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        int i;
        super.c(motionEvent);
        if (this.c.h(true)) {
            this.h = false;
            com.tsf.shell.workspace3D.k.j e = this.c.e(motionEvent);
            if (e != null && (e instanceof z)) {
                z zVar = (z) e;
                com.tsf.shell.g.h.a();
                this.e = zVar;
                this.a = true;
                if (zVar.aV().d()) {
                    int i2 = Integer.MAX_VALUE;
                    ArrayList e2 = zVar.aV().e();
                    zVar.M().z = 0.0f;
                    int size = e2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        z zVar2 = (z) e2.get(i3);
                        if (zVar2 != zVar) {
                            i = zVar2.bd();
                            if (i >= i2) {
                                i = i2;
                            }
                            zVar2.L().setAllFrom(zVar.d(zVar2.c(new Number3d())));
                            this.d.b(zVar2);
                            zVar.a(zVar2);
                            k kVar = this.c;
                            k.k();
                        } else {
                            i = i2;
                        }
                        i3++;
                        i2 = i;
                    }
                    this.c.a(i2, zVar);
                    zVar.aV().b();
                } else if ((this.c.b() instanceof com.tsf.shell.workspace3D.g.c.o) && (e instanceof z)) {
                    ((z) e).bw();
                }
                bf.m().a(this.e, true);
                float f = this.e.L().x;
                float f2 = this.e.L().y;
                this.f = f;
                this.g = f2;
                u uVar = new u();
                uVar.j(1.2f);
                uVar.k(1.2f);
                uVar.l(1.2f);
                s.a(this.e);
                s.a(this.e, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
                k kVar2 = this.c;
                com.tsf.shell.workspace3D.k.j jVar = this.e;
                kVar2.l();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.d.a(motionEvent);
        this.c.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        super.d(motionEvent);
        if (this.a) {
            this.a = false;
            boolean a = this.c.a(this.e, motionEvent.getX(), motionEvent.getY(), true);
            bf.m().d();
            if (a && this.c.a(this.e)) {
                u uVar = new u();
                uVar.j(1.0f);
                uVar.k(1.0f);
                uVar.l(1.0f);
                uVar.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
                s.a(this.e);
                s.a(this.e, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
                this.c.b(this.e);
                return;
            }
            this.c.b().d(this.e.L());
            this.c.b().a(this.e, this.e.bd());
            Number3d a2 = this.c.a(this.e.bd());
            if (this.e instanceof z) {
                z zVar = (z) this.e;
                ArrayList bH = zVar.bH();
                int size = bH == null ? 0 : bH.size();
                if (size > 0) {
                    int bd = zVar.bd() + 1;
                    for (int i = 0; i < size; i++) {
                        z zVar2 = (z) bH.get(i);
                        zVar2.L().x = zVar.L().x + (ab.B * (i + 1));
                        zVar2.L().y = zVar.L().y + (ab.B * (i + 1));
                        zVar2.Q();
                    }
                    this.c.b(bH, bd);
                    zVar.bE();
                }
            }
            u uVar2 = new u();
            this.c.b(this.e);
            uVar2.j(1.0f);
            uVar2.k(1.0f);
            uVar2.l(1.0f);
            uVar2.f(a2.x);
            uVar2.h(a2.y);
            uVar2.a((com.censivn.C3DEngine.g.r) new com.censivn.C3DEngine.g.k());
            s.a(this.e);
            s.a(this.e, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.a) {
            if (this.h) {
                this.e.L().x = (int) (this.f + (motionEvent2.getX() - motionEvent.getX()));
                this.e.L().y = (int) (this.g - (motionEvent2.getY() - motionEvent.getY()));
                this.c.a(this.e, motionEvent2.getX(), motionEvent2.getY());
                return;
            }
            if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 60.0f) {
                this.h = true;
                if (this.e instanceof com.tsf.shell.workspace3D.k.j) {
                    this.e.aI();
                    return;
                }
                return;
            }
            return;
        }
        this.d.a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d.g(f2);
    }
}
