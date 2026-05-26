package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.tsf.b;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class m extends i {
    private com.censivn.C3DEngine.b.h.e.a g;
    private com.tsf.shell.f.f.a.d.a h;
    private ArrayList<com.tsf.shell.f.g.a.h> i;
    private com.tsf.shell.f.g.a.h j;
    private com.censivn.C3DEngine.b.f.m k;
    private float l;

    public m(com.tsf.shell.f.f.a.h hVar, com.tsf.shell.f.f.a.f fVar) {
        super(hVar, fVar, b.d.drawer_sort, x.c(b.i.text_sort));
        this.h = com.tsf.shell.manager.a.w.b();
        d();
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b(boolean z) {
        c();
        this.b.e();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.h.a()) {
                com.tsf.shell.f.g.a.h hVar = this.i.get(i2);
                com.tsf.shell.f.f.a.d.a.c cVarA = this.h.a(i2);
                hVar.e.textures().addElement(cVarA.a(com.tsf.shell.f.g.a.h.e(), com.tsf.shell.f.g.a.h.f()));
                if (cVarA == this.h.b()) {
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

    @Override // com.tsf.shell.f.f.a.c.i
    public void a() {
        this.b.f();
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-this.l) / 2.0f, i3, this.l / 2.0f);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.h.a()) {
                com.tsf.shell.f.g.a.h hVar = this.i.get(i2);
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
        this.k = new com.censivn.C3DEngine.b.f.m();
        this.k.d(38);
        this.k.position().y = com.censivn.C3DEngine.b.b.a.a(145.0f);
        this.i = new ArrayList<>();
        float f = 0.0f;
        float fMaxY = 0.0f;
        final int i = 0;
        while (i < this.h.a()) {
            final com.tsf.shell.f.g.a.h hVar = new com.tsf.shell.f.g.a.h(1.0f);
            hVar.e.scale().setAll(0.8f, 0.8f, 1.0f);
            hVar.e.position().y = com.censivn.C3DEngine.b.b.a.a(20.0f);
            com.tsf.shell.manager.o.c.a(hVar, com.tsf.shell.manager.o.c.h);
            com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(hVar) { // from class: com.tsf.shell.f.f.a.c.m.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (com.tsf.shell.manager.a.h.t().aL()) {
                        m.this.h.b(m.this.h.a(i).k());
                        w.b();
                        if (m.this.j != null) {
                            m.this.j.h();
                        }
                        m.this.j = hVar;
                        hVar.g();
                        m.this.c();
                    }
                }
            };
            hVar.calAABB();
            hVar.setMouseEventListener(aVar);
            fMaxY = hVar.maxY() - hVar.minY();
            float fMaxX = hVar.maxX() - hVar.minX();
            this.i.add(hVar);
            i++;
            f = fMaxX;
        }
        this.l = fMaxY;
        this.g = new com.censivn.C3DEngine.b.h.e.a(com.censivn.C3DEngine.b.b.a.D, fMaxY, f * 0.8f, 80.0f * com.censivn.C3DEngine.b.b.a.c, 40.0f * com.censivn.C3DEngine.b.b.a.c);
        this.g.d();
        this.g.d();
        addChild(this.g);
        for (int i2 = 0; i2 < this.h.a(); i2++) {
            this.g.addChild(this.i.get(i2));
        }
        addChild(this.k);
    }
}
