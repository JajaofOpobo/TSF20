package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.a;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends a {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private e.a c;

    public g(b bVar) {
        super(b.i.text_menu);
        this.a = bVar;
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new a.C0095a(b.d.effect_setting_desktop_menu_random, x.c(b.i.text_random), new a.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.g.1
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.a.v.e.g();
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.a.v.e.a(true);
                g.this.b.d();
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.a.v.e.a(false);
                g.this.b.d();
            }
        }));
        setFunctions(arrayList);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.g.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.e.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                com.tsf.shell.f.d.c.a.d dVarA = com.tsf.shell.manager.a.v.e.a(i);
                com.tsf.shell.f.d.c.a.c cVarB = dVarA.b();
                cVarB.removeFromParent();
                if (dVarA.i()) {
                    cVarB.g();
                } else {
                    cVarB.h();
                }
                if (dVarA.n()) {
                    cVarB.c();
                } else {
                    cVarB.d();
                }
                return cVarB;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.g.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.f.d.c.a.d dVarA = com.tsf.shell.manager.a.v.e.a(i);
                w.b();
                com.tsf.shell.manager.a.v.e.a((com.tsf.shell.f.f.f) dVarA);
                com.tsf.shell.manager.a.v.e.d().b(g.this.a.a());
                g.this.b.d();
            }
        });
        this.c = com.tsf.shell.manager.a.a.a(this, com.tsf.shell.manager.p.e.g);
    }

    @Override // com.tsf.shell.f.g.a.a
    public float a() {
        return com.censivn.C3DEngine.b.b.a.z / 2.0f;
    }

    @Override // com.tsf.shell.f.g.a.a
    public float b() {
        return com.censivn.C3DEngine.b.b.a.a(120.0f);
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
    }

    @Override // com.tsf.shell.f.g.a.a
    public void c() {
        com.tsf.shell.manager.a.v.e.d().b(this.a.a());
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onHide() {
        super.onHide();
        com.tsf.shell.manager.a.v.e.d().a((com.tsf.shell.f.i.c) null);
        this.c.b();
        int i = com.tsf.shell.manager.a.v.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.a.v.e.a(i2).l();
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.a.v.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.a.v.e.a(i2).h();
        }
        com.tsf.shell.f.d.c.a.c.a();
        com.tsf.shell.manager.a.v.e.j();
    }
}
