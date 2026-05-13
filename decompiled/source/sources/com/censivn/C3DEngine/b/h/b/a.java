package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.d.a {
    public boolean a;
    private e b;
    private d d;
    private com.tsf.shell.f.i.b e;
    private float f;
    private float g;
    private boolean h;

    public a(i iVar) {
        super(iVar);
        this.h = false;
    }

    public void a(e eVar) {
        this.b = eVar;
        this.d = eVar.a();
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
            com.tsf.shell.f.i.b e = this.b.e(motionEvent);
            if (e != null && (e instanceof com.tsf.shell.f.i.c)) {
                com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) e;
                w.a();
                this.e = cVar;
                this.a = true;
                if (cVar.A().e()) {
                    int i2 = Integer.MAX_VALUE;
                    ArrayList<com.tsf.shell.f.i.c> i3 = cVar.A().i();
                    cVar.rotation().z = 0.0f;
                    int size = i3.size();
                    int i4 = 0;
                    while (i4 < size) {
                        com.tsf.shell.f.i.c cVar2 = i3.get(i4);
                        if (cVar2 != cVar) {
                            i = cVar2.J();
                            if (i >= i2) {
                                i = i2;
                            }
                            this.d.d(cVar2);
                            cVar.a(cVar2);
                            this.b.d();
                        } else {
                            i = i2;
                        }
                        i4++;
                        i2 = i;
                    }
                    this.b.a(i2, cVar);
                    cVar.A().g();
                }
                com.tsf.shell.manager.a.j.a((i) this.e, true);
                a();
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.2f);
                dVar.m(1.2f);
                dVar.n(1.2f);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
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
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.n(1.0f);
                dVar.a(com.censivn.C3DEngine.b.g.a.a);
                com.censivn.C3DEngine.b.g.c.a(this.e);
                com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
                this.b.d(this.e);
                return;
            }
            this.b.b().globalToLocal(this.e.position());
            this.b.b().addChildAt(this.e, this.e.J());
            Number3d a2 = this.b.a(this.e.J());
            if (this.e instanceof com.tsf.shell.f.i.c) {
                com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) this.e;
                if (cVar.as()) {
                    ArrayList<com.tsf.shell.f.i.c> aw = cVar.aw();
                    ArrayList<com.tsf.shell.f.i.b> arrayList = new ArrayList<>();
                    int size = aw == null ? 0 : aw.size();
                    if (size > 0) {
                        int J = cVar.J() + 1;
                        for (int i = 0; i < size; i++) {
                            com.tsf.shell.f.i.c cVar2 = aw.get(i);
                            arrayList.add(cVar2);
                            cVar2.position().x = cVar.position().x + (com.tsf.shell.f.i.b.e.b.j * (i + 1));
                            cVar2.position().y = cVar.position().y + (com.tsf.shell.f.i.b.e.b.j * (i + 1));
                            cVar2.removeFromParent();
                        }
                        this.b.a(arrayList, J);
                    }
                }
            }
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            this.b.d(this.e);
            dVar2.l(1.0f);
            dVar2.m(1.0f);
            dVar2.n(1.0f);
            dVar2.f(a2.x);
            dVar2.h(a2.y);
            dVar2.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar2);
            if (!this.h && (this.b.b() instanceof com.tsf.shell.f.e.f.b) && (this.e instanceof com.tsf.shell.f.i.c)) {
                ((com.tsf.shell.f.i.c) this.e).ai();
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
            } else if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 60.0f) {
                this.h = true;
                if (this.e instanceof com.tsf.shell.f.i.b) {
                    this.e.ab();
                    return;
                }
                return;
            } else {
                return;
            }
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
