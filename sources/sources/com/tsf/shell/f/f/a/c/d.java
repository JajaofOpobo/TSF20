package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.a;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends i {
    private com.censivn.C3DEngine.b.h.b.h g;
    private com.tsf.shell.f.f.a.b.l h;
    private com.tsf.shell.f.e.g.b i;
    private ArrayList<a.C0095a> j;

    public d(com.tsf.shell.f.f.a.h hVar, com.tsf.shell.f.f.a.f fVar) {
        super(hVar, fVar, b.d.drawer_effect, x.c(b.i.text_effect));
        this.h = hVar.aC();
        c();
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-com.tsf.shell.manager.o.b.c.U) / 2.0f, i3, com.tsf.shell.manager.o.b.c.U / 2.0f);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b(boolean z) {
        this.b.e();
        this.g.d();
        if (this.j != null && this.j.size() > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.j.size()) {
                    this.j.get(i2).d();
                    i = i2 + 1;
                } else {
                    this.i.measure();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a() {
        this.b.f();
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b() {
        for (int i = 0; i < this.h.i(); i++) {
            this.h.a(i).h();
        }
        if (this.j != null && this.j.size() > 0) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).e();
            }
        }
        com.tsf.shell.f.g.a.h.b();
        this.h.j();
    }

    private void c() {
        this.g = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, com.tsf.shell.manager.o.b.c.U, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.g.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.f.a.c.d.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return d.this.h.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.i a(int i, com.censivn.C3DEngine.b.f.i iVar) {
                com.censivn.C3DEngine.b.f.i hVar;
                if (iVar == null) {
                    hVar = new com.tsf.shell.f.g.a.h();
                    hVar.calAABB();
                } else {
                    hVar = iVar;
                }
                com.tsf.shell.f.f.a.b.k kVarA = d.this.h.a(i);
                com.tsf.shell.f.g.a.h hVar2 = (com.tsf.shell.f.g.a.h) hVar;
                if (kVarA.i()) {
                    hVar2.g();
                } else {
                    hVar2.h();
                }
                hVar2.e.textures().clear();
                hVar2.e.textures().addElement(kVarA.a(com.tsf.shell.f.g.a.h.e(), com.tsf.shell.f.g.a.h.f()));
                return hVar;
            }
        });
        this.g.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.f.a.c.d.2
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(com.censivn.C3DEngine.b.f.i iVar, int i, MotionEvent motionEvent) {
                w.b();
                if (!com.tsf.shell.manager.a.h.t().an().c()) {
                    d.this.a.d(i);
                    w.b();
                }
                d.this.g.d();
            }
        });
        addChild(this.g);
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new a.C0095a(b.d.effect_setting_desktop_menu_random, x.c(b.i.text_random), new a.C0095a.C0096a() { // from class: com.tsf.shell.f.f.a.c.d.3
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return d.this.h.g();
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                d.this.h.a(true);
                d.this.g.d();
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void c() {
                d.this.h.a(false);
                d.this.g.d();
            }
        }));
        a(arrayList);
    }

    public void a(ArrayList<a.C0095a> arrayList) {
        if (arrayList != null) {
            this.j = arrayList;
            this.i = new com.tsf.shell.f.e.g.b();
            this.i.position().y = com.censivn.C3DEngine.b.b.a.a(160.0f);
            Iterator<a.C0095a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.i.addChild(it.next());
            }
            addChild(this.i);
        }
    }
}
