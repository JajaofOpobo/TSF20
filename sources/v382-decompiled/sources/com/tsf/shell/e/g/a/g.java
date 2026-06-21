package com.tsf.shell.e.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.h.b.i;
import com.tsf.shell.R;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends a {
    public b a;
    private i b;
    private com.tsf.shell.manager.p.g c;

    public g(b bVar) {
        super(R.string.text_menu);
        this.a = bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_random, x.c(R.string.text_random), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.g.a.g.1
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.a.v.e.g();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.v.e.a(true);
                g.this.b.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.v.e.a(false);
                g.this.b.d();
            }
        }));
        setFunctions(arrayList);
        this.b = new i(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.e.g.a.g.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.e.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                com.tsf.shell.e.d.c.a.d dVar = (com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.a(i);
                com.tsf.shell.e.d.c.a.c b = dVar.b();
                b.removeFromParent();
                if (dVar.i()) {
                    b.g();
                } else {
                    b.h();
                }
                if (dVar.n()) {
                    b.c();
                } else {
                    b.d();
                }
                return b;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.e.g.a.g.3
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.e.d.c.a.d dVar = (com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.a(i);
                w.b();
                com.tsf.shell.manager.a.v.e.a((com.tsf.shell.e.f.f) dVar);
                com.tsf.shell.manager.a.v.e.d().b(g.this.a.a());
                g.this.b.d();
            }
        });
        this.c = com.tsf.shell.manager.a.a.a(this, com.tsf.shell.manager.p.f.g);
    }

    @Override // com.tsf.shell.e.g.a.a
    public float a() {
        return com.censivn.C3DEngine.b.b.a.z / 2.0f;
    }

    @Override // com.tsf.shell.e.g.a.a
    public float b() {
        return com.censivn.C3DEngine.b.b.a.a(120.0f);
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
    }

    @Override // com.tsf.shell.e.g.a.a
    public void c() {
        com.tsf.shell.manager.a.v.e.d().b(this.a.a());
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
        super.onHide();
        com.tsf.shell.manager.a.v.e.d().a((com.tsf.shell.e.i.e) null);
        this.c.b();
        int i = com.tsf.shell.manager.a.v.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.a(i2)).l();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.a.v.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((com.tsf.shell.e.d.c.a.d) com.tsf.shell.manager.a.v.e.a(i2)).h();
        }
        com.tsf.shell.e.d.c.a.c.a();
        com.tsf.shell.manager.a.v.e.j();
    }
}
