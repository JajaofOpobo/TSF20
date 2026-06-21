package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;
import com.tsf.shell.R;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends j {
    private com.censivn.C3DEngine.b.h.b.i g;
    private com.tsf.shell.e.f.a.b.m h;
    private com.tsf.shell.e.e.g.b i;
    private ArrayList j;

    public e(com.tsf.shell.e.f.a.m mVar, com.tsf.shell.e.f.a.j jVar) {
        super(mVar, jVar, R.drawable.drawer_effect, x.c(R.string.text_effect));
        this.h = mVar.aC();
        c();
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-com.tsf.shell.manager.o.b.c.U) / 2.0f, i3, com.tsf.shell.manager.o.b.c.U / 2.0f);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b(boolean z) {
        this.b.e();
        this.g.d();
        if (this.j != null && this.j.size() > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.j.size()) {
                    ((com.tsf.shell.e.e.g.a.b) this.j.get(i2)).d();
                    i = i2 + 1;
                } else {
                    this.i.measure();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a() {
        this.b.f();
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b() {
        for (int i = 0; i < this.h.i(); i++) {
            ((com.tsf.shell.e.f.a.b.l) this.h.a(i)).h();
        }
        if (this.j != null && this.j.size() > 0) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                ((com.tsf.shell.e.e.g.a.b) this.j.get(i2)).e();
            }
        }
        com.tsf.shell.e.g.a.h.b();
        this.h.j();
    }

    private void c() {
        this.g = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, com.tsf.shell.manager.o.b.c.U, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.g.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.e.f.a.c.e.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return e.this.h.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                com.censivn.C3DEngine.b.f.j jVar2;
                if (jVar == null) {
                    jVar2 = new com.tsf.shell.e.g.a.h();
                    jVar2.calAABB();
                } else {
                    jVar2 = jVar;
                }
                com.tsf.shell.e.f.a.b.l lVar = (com.tsf.shell.e.f.a.b.l) e.this.h.a(i);
                com.tsf.shell.e.g.a.h hVar = (com.tsf.shell.e.g.a.h) jVar2;
                if (lVar.i()) {
                    hVar.g();
                } else {
                    hVar.h();
                }
                hVar.e.textures().clear();
                hVar.e.textures().addElement(lVar.a(com.tsf.shell.e.g.a.h.e(), com.tsf.shell.e.g.a.h.f()));
                return jVar2;
            }
        });
        this.g.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.e.f.a.c.e.2
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                w.b();
                if (!com.tsf.shell.manager.a.h.t().an().c()) {
                    e.this.a.d(i);
                    w.b();
                }
                e.this.g.d();
            }
        });
        addChild(this.g);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_random, x.c(R.string.text_random), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.f.a.c.e.3
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return e.this.h.g();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                e.this.h.a(true);
                e.this.g.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                e.this.h.a(false);
                e.this.g.d();
            }
        }));
        a(arrayList);
    }

    public void a(ArrayList arrayList) {
        if (arrayList != null) {
            this.j = arrayList;
            this.i = new com.tsf.shell.e.e.g.b();
            this.i.position().y = com.censivn.C3DEngine.b.b.a.a(160.0f);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.i.addChild((com.tsf.shell.e.e.g.a.b) it.next());
            }
            addChild(this.i);
        }
    }
}
