package com.tsf.shell.manager.r.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.shell.utils.w;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e extends com.tsf.shell.f.e.g.a.b {
    public com.tsf.shell.manager.r.b.a a;
    private h b;
    private com.tsf.shell.manager.action.toggle.a c;

    public e(final com.tsf.shell.manager.r.b.a aVar, String str) {
        super(str);
        this.a = aVar;
        this.c = com.tsf.shell.manager.a.d.c;
        this.b = new h(com.censivn.C3DEngine.b.b.a.D, aVar.getHeight(), 20.0f * com.censivn.C3DEngine.b.b.a.c, 20.0f * com.censivn.C3DEngine.b.b.a.c, (com.censivn.C3DEngine.b.b.a.c * 20.0f) + com.tsf.shell.manager.o.b.b.T, (com.censivn.C3DEngine.b.b.a.c * 20.0f) + com.tsf.shell.manager.o.b.b.U) { // from class: com.tsf.shell.manager.r.b.e.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
            }
        };
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.e.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.d.c.a().size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                a aVar2;
                if (iVar == null) {
                    aVar2 = new a();
                } else {
                    aVar2 = (a) iVar;
                }
                aVar2.a(e.this.c.a().get(i).a());
                return aVar2;
            }
        });
        this.b.a(new f() { // from class: com.tsf.shell.manager.r.b.e.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                com.tsf.shell.f.i.b.e.b a2 = com.tsf.shell.manager.l.a.a(e.this.c.a().get(i).a, com.tsf.shell.manager.o.b.b);
                a2.K().onUpdatePhoto(null, null);
                aVar.b().a(a2);
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void b(i iVar, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void c(i iVar, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
            }
        });
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        this.b.d();
        super.onShow();
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onHide() {
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        Iterator<com.tsf.shell.manager.action.toggle.b> it = this.c.a().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* loaded from: classes.dex */
    class a extends j {
        private com.tsf.shell.f.i.b.e.j b;

        public a() {
        }

        public void a(com.tsf.shell.f.i.b.e.j jVar) {
            this.b = jVar;
        }

        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawChildStart() {
            if (this.b != null) {
                this.b.dispatchDraw();
            }
        }
    }
}
