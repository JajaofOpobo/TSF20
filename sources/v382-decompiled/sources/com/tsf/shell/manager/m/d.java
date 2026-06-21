package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.h;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends com.censivn.C3DEngine.b.b.a.e {
    private a d;
    private c e;
    private boolean f = false;
    private h c = new h();

    public d(c cVar, a aVar) {
        this.d = aVar;
        this.e = cVar;
        this.c.a(com.censivn.C3DEngine.b.b.a.a(123.0f), com.censivn.C3DEngine.b.b.a.a(123.0f));
        this.c.a(R.drawable.side_menu_add_button);
        this.c.position().y = -com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.c.calAABB(1.2f, 1.2f, 1.0f);
        this.c.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.c) { // from class: com.tsf.shell.manager.m.d.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                d.this.i();
            }
        });
        this.c.visible(false);
        addChild(this.c);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public boolean calTouchCollision(float f, float f2) {
        if (a() == null || a().numChildren() != 0) {
            return super.calTouchCollision(f, f2);
        }
        return false;
    }

    @Override // com.censivn.C3DEngine.b.b.a.e, com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        super.onDrawChildStart();
        if (a() != null && a().numChildren() == 0) {
            if (!this.e.m()) {
                m();
            }
            mouseSkip(true);
        } else {
            l();
            mouseSkip(false);
        }
    }

    private void l() {
        if (this.f) {
            this.f = false;
            x xVar = new x() { // from class: com.tsf.shell.manager.m.d.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    d.this.c.visible(false);
                }
            };
            xVar.a(0);
            w.a(this.c);
            w.a(this.c, 250, xVar);
        }
    }

    private void m() {
        if (!this.f) {
            this.f = true;
            this.c.visible(true);
            x xVar = new x();
            xVar.a(255);
            w.a(this.c);
            w.a(this.c, 250, xVar);
        }
    }

    public void i() {
        ArrayList a;
        int size;
        if (com.tsf.shell.manager.a.w.a().b() && (size = (a = com.tsf.shell.utils.b.a(6)).size()) > 0) {
            for (int i = 0; i < size; i++) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) a.get(i);
                cVar.scale().setAll(0.0f, 0.0f, 1.0f);
                x xVar = new x();
                xVar.l(1.0f);
                xVar.m(1.0f);
                xVar.b(i * 100);
                xVar.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(cVar, 500, xVar);
                this.e.a(cVar, true);
                this.d.addChild(cVar);
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
