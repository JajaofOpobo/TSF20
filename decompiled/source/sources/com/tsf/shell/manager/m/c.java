package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.b.a.e;
import com.censivn.C3DEngine.b.f.g;
import com.tsf.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends e {
    private a d;
    private b e;
    private boolean f = false;
    private g c = new g();

    public c(b bVar, a aVar) {
        this.d = aVar;
        this.e = bVar;
        this.c.a(com.censivn.C3DEngine.b.b.a.a(123.0f), com.censivn.C3DEngine.b.b.a.a(123.0f));
        this.c.a(b.d.side_menu_add_button);
        this.c.position().y = -com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.c.calAABB(1.2f, 1.2f, 1.0f);
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c) { // from class: com.tsf.shell.manager.m.c.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                c.this.i();
            }
        });
        this.c.visible(false);
        addChild(this.c);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public boolean calTouchCollision(float f, float f2) {
        if (a() == null || a().numChildren() != 0) {
            return super.calTouchCollision(f, f2);
        }
        return false;
    }

    @Override // com.censivn.C3DEngine.b.b.a.e, com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        super.onDrawChildStart();
        if (a() != null && a().numChildren() == 0) {
            if (!this.e.m()) {
                m();
            }
            mouseSkip(true);
            return;
        }
        l();
        mouseSkip(false);
    }

    private void l() {
        if (this.f) {
            this.f = false;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.c.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    c.this.c.visible(false);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 250, dVar);
        }
    }

    private void m() {
        if (!this.f) {
            this.f = true;
            this.c.visible(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.c, 250, dVar);
        }
    }

    public void i() {
        ArrayList<com.tsf.shell.f.i.b.e.g> a;
        int size;
        if (com.tsf.shell.manager.a.w.a().b() && (size = (a = com.tsf.shell.utils.b.a(6)).size()) > 0) {
            for (int i = 0; i < size; i++) {
                com.tsf.shell.f.i.b.e.g gVar = a.get(i);
                gVar.scale().setAll(0.0f, 0.0f, 1.0f);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.b(i * 100);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(gVar, 500, dVar);
                this.e.a((com.tsf.shell.f.i.b) gVar, true);
                this.d.addChild(gVar);
            }
            this.e.o();
        }
    }

    public void j() {
        this.f = false;
        this.c.visible(false);
        this.c.alpha(0.0f);
    }

    public void k() {
        this.c.a();
    }
}
