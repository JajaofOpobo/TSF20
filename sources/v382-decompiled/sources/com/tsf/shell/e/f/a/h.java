package com.tsf.shell.e.f.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class h extends com.censivn.C3DEngine.b.f.l {
    private static final float c = com.censivn.C3DEngine.b.b.a.a(200.0f);
    private static final int d = com.censivn.C3DEngine.b.b.a.b(100.0f);
    private m b;
    private i e;
    private com.censivn.C3DEngine.b.f.l a = new com.censivn.C3DEngine.b.f.l();
    private i f = new i(R.drawable.drawer_more_button) { // from class: com.tsf.shell.e.f.a.h.1
        @Override // com.tsf.shell.e.f.a.i
        public void a() {
            h.this.b.aj();
        }
    };
    private i g = new i(R.drawable.drawer_search_button) { // from class: com.tsf.shell.e.f.a.h.2
        @Override // com.tsf.shell.e.f.a.i
        public void a() {
            com.tsf.shell.manager.a.d.a(500);
        }
    };

    public h(m mVar) {
        this.b = mVar;
        this.g.a(com.tsf.shell.manager.p.f.n);
        this.e = new i(R.drawable.drawer_home);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.e.f.a.h.3
            private float b;
            private float d;
            private boolean e = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.a.d.a(100);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.e = false;
                this.b = motionEvent.getX();
                this.d = motionEvent.getY();
                com.tsf.shell.manager.action.h.a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.e) {
                    com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.b, this.d);
                    return;
                }
                com.tsf.shell.manager.a.h.w();
                com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.b, this.d);
                this.e = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (this.e) {
                    com.tsf.shell.manager.a.h.x();
                    this.e = false;
                }
            }
        });
        this.a.addChild(this.e);
        this.a.addChild(this.f);
        this.a.addChild(this.g);
        addChild(this.a);
    }

    public void a(boolean z) {
        a(z, null);
    }

    public void a(boolean z, final Runnable runnable) {
        w.a(this.a);
        if (z) {
            x xVar = new x() { // from class: com.tsf.shell.e.f.a.h.4
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    h.this.a.visible(false);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
            xVar.a(0);
            xVar.h(-com.censivn.C3DEngine.b.b.a.a(200.0f));
            w.a(this.a, 350, xVar);
            return;
        }
        this.a.position().y = -com.censivn.C3DEngine.b.b.a.a(200.0f);
        this.a.alpha(0.0f);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b(boolean z) {
        w.a(this.a);
        this.a.visible(true);
        if (z) {
            x xVar = new x();
            xVar.a(255);
            xVar.h(0.0f);
            xVar.a(com.censivn.C3DEngine.b.g.a.n);
            w.a(this.a, 600, xVar);
            return;
        }
        this.a.position().y = 0.0f;
        this.a.alpha(255.0f);
    }

    public void a(int i, int i2, int i3, int i4) {
        position().y = com.censivn.C3DEngine.b.b.a.C + (c / 2.0f);
        this.f.position().x = com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(125.0f);
        this.g.position().x = com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(125.0f);
    }
}
