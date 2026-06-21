package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.utils.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a extends com.censivn.C3DEngine.b.d.a {
    public boolean a;
    private f b;
    private e d;
    private com.tsf.shell.e.i.c e;
    private float f;
    private float g;
    private boolean h;

    public a(com.censivn.C3DEngine.b.f.j jVar) {
        super(jVar);
        this.h = false;
    }

    public void a(f fVar) {
        this.b = fVar;
        this.d = fVar.a();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        this.d.c(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        this.d.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        this.d.f(motionEvent);
        this.b.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void k(MotionEvent motionEvent) {
        this.d.e(motionEvent);
        this.b.d(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void h(MotionEvent motionEvent) {
        if (this.b.a(false)) {
            this.d.d(motionEvent);
            this.b.a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        int i;
        super.c(motionEvent);
        if (this.b.a(true)) {
            this.h = false;
            com.tsf.shell.e.i.c e = this.b.e(motionEvent);
            if (e != null && (e instanceof com.tsf.shell.e.i.e)) {
                com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) e;
                w.a();
                this.e = eVar;
                this.a = true;
                if (eVar.A().e()) {
                    int i2 = Integer.MAX_VALUE;
                    ArrayList i3 = eVar.A().i();
                    eVar.rotation().z = 0.0f;
                    int size = i3.size();
                    int i4 = 0;
                    while (i4 < size) {
                        com.tsf.shell.e.i.e eVar2 = (com.tsf.shell.e.i.e) i3.get(i4);
                        if (eVar2 != eVar) {
                            i = eVar2.J();
                            if (i >= i2) {
                                i = i2;
                            }
                            this.d.d(eVar2);
                            eVar.a(eVar2);
                            this.b.d();
                        } else {
                            i = i2;
                        }
                        i4++;
                        i2 = i;
                    }
                    this.b.a(i2, eVar);
                    eVar.A().g();
                }
                com.tsf.shell.manager.a.j.a((com.censivn.C3DEngine.b.f.j) this.e, true);
                a();
                x xVar = new x();
                xVar.l(1.2f);
                xVar.m(1.2f);
                xVar.n(1.2f);
                com.censivn.C3DEngine.b.g.w.a(this.e);
                com.censivn.C3DEngine.b.g.w.a(this.e, 500, xVar);
                this.b.c(this.e);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.d.a(motionEvent);
        this.b.c(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void d(MotionEvent motionEvent) {
        super.d(motionEvent);
        if (this.a) {
            this.a = false;
            boolean a = this.b.a(this.e, motionEvent.getX(), motionEvent.getY(), false, true);
            com.tsf.shell.manager.a.j.b(this.e);
            if (a && this.b.e(this.e)) {
                x xVar = new x();
                xVar.l(1.0f);
                xVar.m(1.0f);
                xVar.n(1.0f);
                xVar.a(com.censivn.C3DEngine.b.g.a.a);
                com.censivn.C3DEngine.b.g.w.a(this.e);
                com.censivn.C3DEngine.b.g.w.a(this.e, 500, xVar);
                this.b.d(this.e);
                return;
            }
            this.b.b().globalToLocal(this.e.position());
            this.b.b().addChildAt(this.e, this.e.J());
            Number3d a2 = this.b.a(this.e.J());
            if (this.e instanceof com.tsf.shell.e.i.e) {
                com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) this.e;
                if (eVar.as()) {
                    ArrayList aw = eVar.aw();
                    ArrayList arrayList = new ArrayList();
                    int size = aw == null ? 0 : aw.size();
                    if (size > 0) {
                        int J = eVar.J() + 1;
                        for (int i = 0; i < size; i++) {
                            com.tsf.shell.e.i.e eVar2 = (com.tsf.shell.e.i.e) aw.get(i);
                            arrayList.add(eVar2);
                            eVar2.position().x = eVar.position().x + (com.tsf.shell.e.i.b.e.b.j * (i + 1));
                            eVar2.position().y = eVar.position().y + (com.tsf.shell.e.i.b.e.b.j * (i + 1));
                            eVar2.removeFromParent();
                        }
                        this.b.a(arrayList, J);
                    }
                }
            }
            x xVar2 = new x();
            this.b.d(this.e);
            xVar2.l(1.0f);
            xVar2.m(1.0f);
            xVar2.n(1.0f);
            xVar2.f(a2.x);
            xVar2.h(a2.y);
            xVar2.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.w.a(this.e);
            com.censivn.C3DEngine.b.g.w.a(this.e, 500, xVar2);
            if (!this.h && (this.b.b() instanceof com.tsf.shell.e.e.f.e) && (this.e instanceof com.tsf.shell.e.i.e)) {
                ((com.tsf.shell.e.i.e) this.e).ai();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.a) {
            if (this.h) {
                this.e.position().x = (int) (this.f + (motionEvent2.getX() - motionEvent.getX()));
                this.e.position().y = (int) (this.g - (motionEvent2.getY() - motionEvent.getY()));
                this.b.a(this.e, motionEvent2.getX(), motionEvent2.getY());
                return;
            }
            if (com.tsf.shell.utils.x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 60.0f) {
                this.h = true;
                if (this.e instanceof com.tsf.shell.e.i.c) {
                    this.e.ab();
                    return;
                }
                return;
            }
            return;
        }
        this.d.a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d.a(motionEvent, motionEvent2, f, f2);
    }

    public void a() {
        a(this.e.position().x, this.e.position().y);
    }

    public void a(float f, float f2) {
        this.f = f;
        this.g = f2;
    }
}
