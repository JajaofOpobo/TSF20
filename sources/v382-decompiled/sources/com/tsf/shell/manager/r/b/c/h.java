package com.tsf.shell.manager.r.b.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.utils.w;

/* loaded from: classes.dex */
public class h extends com.censivn.C3DEngine.b.h.b.g {
    private float a;
    private float b;
    private j c;
    private com.censivn.C3DEngine.b.f.j d;
    private boolean e;
    private com.tsf.shell.e.e.g.e f;

    public h(com.tsf.shell.e.e.g.e eVar) {
        this.f = eVar;
    }

    @Override // com.censivn.C3DEngine.b.h.b.g
    public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
    }

    public com.tsf.shell.e.i.c.g a(int i) {
        return null;
    }

    @Override // com.censivn.C3DEngine.b.h.b.g
    public void b(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
        w.a();
        this.c = (j) jVar;
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

    @Override // com.censivn.C3DEngine.b.h.b.g
    public void c(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
        final com.tsf.shell.e.i.c.g a = a(i);
        x xVar = new x() { // from class: com.tsf.shell.manager.r.b.c.h.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.f();
                com.tsf.shell.manager.a.j.b(h.this.d);
                h.this.c.a(h.this.d);
                h.this.d.alpha(255.0f);
                h.this.d.scale().setAll(0.0f, 0.0f, 1.0f);
                h.this.d.position().x = 0.0f;
                h.this.d.position().y = 0.0f;
                h.this.d.setAnimationObjectState(h.this.e);
                x xVar2 = new x();
                xVar2.l(1.0f);
                xVar2.m(1.0f);
                xVar2.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.w.a(h.this.d);
                com.censivn.C3DEngine.b.g.w.a(h.this.d, 500, xVar2);
                h.this.d = null;
            }
        };
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.n(1.0f);
        xVar.a(0);
        xVar.j(0.0f);
        com.censivn.C3DEngine.b.g.w.a(this.d);
        com.censivn.C3DEngine.b.g.w.a(this.d, 300, xVar);
        if (a(a, this.d.position().x, this.d.position().y)) {
            this.f.templeteShow();
        }
    }

    public boolean a(com.tsf.shell.e.i.c.g gVar, float f, float f2) {
        return true;
    }

    @Override // com.censivn.C3DEngine.b.h.b.g
    public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.d != null) {
            this.d.position().x = this.a + (motionEvent2.getX() - motionEvent.getX());
            this.d.position().y = this.b - (motionEvent2.getY() - motionEvent.getY());
        }
    }
}
