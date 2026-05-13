package com.tsf.shell.manager.r.b.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.utils.w;
/* loaded from: classes.dex */
public class f extends com.censivn.C3DEngine.b.h.b.f {
    private float a;
    private float b;
    private h c;
    private i d;
    private boolean e;
    private com.tsf.shell.f.e.g.d f;

    public f(com.tsf.shell.f.e.g.d dVar) {
        this.f = dVar;
    }

    @Override // com.censivn.C3DEngine.b.h.b.f
    public void a(i iVar, int i, MotionEvent motionEvent) {
    }

    public com.tsf.shell.f.i.c.e a(int i) {
        return null;
    }

    @Override // com.censivn.C3DEngine.b.h.b.f
    public void b(i iVar, int i, MotionEvent motionEvent) {
        w.a();
        this.c = (h) iVar;
        this.d = this.c.a();
        this.e = this.d.getAnimationObjectState();
        this.d.setAnimationObjectState(true);
        Number3d.TEMPNUMBER3D.reset();
        Number3d localToGlobal = this.d.localToGlobal(Number3d.TEMPNUMBER3D);
        this.d.position().setAllFrom(localToGlobal);
        this.a = localToGlobal.x;
        this.b = localToGlobal.y;
        this.d.removeFromParent();
        a(i).e();
        com.tsf.shell.manager.a.j.a(this.d);
        this.f.templeteHide();
    }

    @Override // com.censivn.C3DEngine.b.h.b.f
    public void c(i iVar, int i, MotionEvent motionEvent) {
        final com.tsf.shell.f.i.c.e a = a(i);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.r.b.c.f.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.f();
                com.tsf.shell.manager.a.j.b(f.this.d);
                f.this.c.a(f.this.d);
                f.this.d.alpha(255.0f);
                f.this.d.scale().setAll(0.0f, 0.0f, 1.0f);
                f.this.d.position().x = 0.0f;
                f.this.d.position().y = 0.0f;
                f.this.d.setAnimationObjectState(f.this.e);
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                dVar2.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(f.this.d);
                com.censivn.C3DEngine.b.g.c.a(f.this.d, 500, dVar2);
                f.this.d = null;
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.n(1.0f);
        dVar.a(0);
        dVar.j(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 300, dVar);
        if (a(a, this.d.position().x, this.d.position().y)) {
            this.f.templeteShow();
        }
    }

    public boolean a(com.tsf.shell.f.i.c.e eVar, float f, float f2) {
        return true;
    }

    @Override // com.censivn.C3DEngine.b.h.b.f
    public void a(i iVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.d != null) {
            this.d.position().x = this.a + (motionEvent2.getX() - motionEvent.getX());
            this.d.position().y = this.b - (motionEvent2.getY() - motionEvent.getY());
        }
    }
}
