package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;
import com.tsf.shell.R;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class p extends j {
    private com.censivn.C3DEngine.b.h.e.a g;
    private com.tsf.shell.e.f.a.d.a h;
    private ArrayList i;
    private com.tsf.shell.e.g.a.h j;
    private com.censivn.C3DEngine.b.f.o k;
    private float l;

    public p(com.tsf.shell.e.f.a.m mVar, com.tsf.shell.e.f.a.j jVar) {
        super(mVar, jVar, R.drawable.drawer_sort, x.c(R.string.text_sort));
        this.h = com.tsf.shell.manager.a.w.b();
        d();
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b(boolean z) {
        c();
        this.b.e();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.h.a()) {
                com.tsf.shell.e.g.a.h hVar = (com.tsf.shell.e.g.a.h) this.i.get(i2);
                com.tsf.shell.e.f.a.d.a.c a = this.h.a(i2);
                hVar.e.textures().addElement(a.a(com.tsf.shell.e.g.a.h.e(), com.tsf.shell.e.g.a.h.f()));
                if (a == this.h.b()) {
                    this.j = hVar;
                    hVar.g();
                } else {
                    hVar.h();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a() {
        this.b.f();
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-this.l) / 2.0f, i3, this.l / 2.0f);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.h.a()) {
                com.tsf.shell.e.g.a.h hVar = (com.tsf.shell.e.g.a.h) this.i.get(i2);
                this.h.a(i2).h();
                hVar.e.textures().clear();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.k.a(this.h.b().c());
    }

    private void d() {
        this.k = new com.censivn.C3DEngine.b.f.o();
        this.k.d(38);
        this.k.position().y = com.censivn.C3DEngine.b.b.a.a(145.0f);
        this.i = new ArrayList();
        float f = 0.0f;
        float f2 = 0.0f;
        final int i = 0;
        while (i < this.h.a()) {
            final com.tsf.shell.e.g.a.h hVar = new com.tsf.shell.e.g.a.h(1.0f);
            hVar.e.scale().setAll(0.8f, 0.8f, 1.0f);
            hVar.e.position().y = com.censivn.C3DEngine.b.b.a.a(20.0f);
            com.tsf.shell.manager.o.c.a(hVar, com.tsf.shell.manager.o.c.h);
            com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(hVar) { // from class: com.tsf.shell.e.f.a.c.p.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (com.tsf.shell.manager.a.h.t().aL()) {
                        p.this.h.b(p.this.h.a(i).k());
                        w.b();
                        if (p.this.j != null) {
                            p.this.j.h();
                        }
                        p.this.j = hVar;
                        hVar.g();
                        p.this.c();
                    }
                }
            };
            hVar.calAABB();
            hVar.setMouseEventListener(aVar);
            f2 = hVar.maxY() - hVar.minY();
            float maxX = hVar.maxX() - hVar.minX();
            this.i.add(hVar);
            i++;
            f = maxX;
        }
        this.l = f2;
        this.g = new com.censivn.C3DEngine.b.h.e.a(com.censivn.C3DEngine.b.b.a.D, f2, f * 0.8f, 80.0f * com.censivn.C3DEngine.b.b.a.c, 40.0f * com.censivn.C3DEngine.b.b.a.c);
        this.g.d();
        this.g.d();
        addChild(this.g);
        for (int i2 = 0; i2 < this.h.a(); i2++) {
            this.g.addChild((com.tsf.shell.e.g.a.h) this.i.get(i2));
        }
        addChild(this.k);
    }
}
