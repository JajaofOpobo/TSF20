package com.tsf.shell.manager.r.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.utils.w;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends com.tsf.shell.e.e.g.a.d {
    public a a;
    private com.censivn.C3DEngine.b.h.b.i b;
    private com.tsf.shell.manager.action.toggle.a c;

    public j(final a aVar, String str) {
        super(str);
        this.a = aVar;
        this.c = com.tsf.shell.manager.a.d.c;
        this.b = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, aVar.getHeight(), 20.0f * com.censivn.C3DEngine.b.b.a.c, 20.0f * com.censivn.C3DEngine.b.b.a.c, (com.censivn.C3DEngine.b.b.a.c * 20.0f) + com.tsf.shell.manager.o.b.b.T, (com.censivn.C3DEngine.b.b.a.c * 20.0f) + com.tsf.shell.manager.o.b.b.U) { // from class: com.tsf.shell.manager.r.b.j.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onKillFocus() {
            }
        };
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.j.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.d.c.a().size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                k kVar;
                if (jVar == null) {
                    kVar = new k(j.this);
                } else {
                    kVar = (k) jVar;
                }
                kVar.a(((com.tsf.shell.manager.action.toggle.b) j.this.c.a().get(i)).a());
                return kVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.manager.r.b.j.3
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                w.b();
                com.tsf.shell.e.i.b.e.b a = com.tsf.shell.manager.l.a.a(((com.tsf.shell.manager.action.toggle.b) j.this.c.a().get(i)).a, com.tsf.shell.manager.o.b.b);
                a.K().onUpdatePhoto(null, null);
                aVar.b().a(a);
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void b(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void c(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
            }
        });
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        this.b.d();
        super.onShow();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        Iterator it = this.c.a().iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.manager.action.toggle.b) it.next()).b();
        }
    }
}
