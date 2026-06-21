package com.tsf.shell.e.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.h.b.i;
import com.tsf.shell.R;
import com.tsf.shell.e.f.p;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.e.e.g.a.d {
    public b a;
    private i b;
    private com.tsf.shell.e.e.g.a.b c;
    private com.tsf.shell.manager.p.g d;

    public c(b bVar) {
        super(R.string.menu_effect_desktop);
        this.a = bVar;
        ArrayList arrayList = new ArrayList();
        com.tsf.shell.e.e.g.a.c cVar = new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.g.a.c.1
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.a.v.a.a.g();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.v.a.a.a(true);
                c.this.b.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.v.a.a.a(false);
                c.this.b.d();
            }
        };
        com.tsf.shell.e.e.g.a.c cVar2 = new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.g.a.c.2
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.e.f.i.c();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.e.f.i.b(true);
                com.tsf.shell.manager.a.v.a.a.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.e.f.i.b(false);
                com.tsf.shell.manager.a.v.a.a.d();
            }
        };
        this.c = new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_swing, x.c(R.string.menu_effect_swing), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.g.a.c.3
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.a.v.c.b();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.v.c.c();
                com.tsf.shell.manager.a.v.a.a.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.v.c.d();
                com.tsf.shell.manager.a.v.a.a.d();
            }
        });
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_random, x.c(R.string.text_random), cVar));
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_page_border, x.c(R.string.text_border), cVar2));
        arrayList.add(this.c);
        setFunctions(arrayList);
        this.b = new i(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.e.g.a.c.4
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.a.a.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                j jVar2;
                if (jVar == null) {
                    jVar2 = new h();
                    jVar2.calAABB();
                } else {
                    jVar2 = jVar;
                }
                p pVar = (p) com.tsf.shell.manager.a.v.a.a.a(i);
                h hVar = (h) jVar2;
                if (pVar.i()) {
                    hVar.g();
                } else {
                    hVar.h();
                }
                if (pVar.n()) {
                    hVar.c();
                } else {
                    hVar.d();
                }
                hVar.e.textures().clear();
                hVar.e.textures().addElement(pVar.a(h.e(), h.f()));
                return jVar2;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.e.g.a.c.5
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                p pVar = (p) com.tsf.shell.manager.a.v.a.a.a(i);
                w.b();
                com.tsf.shell.manager.a.v.a.a.c(pVar);
                c.this.b.d();
            }
        });
        this.d = com.tsf.shell.manager.a.a.a(this, com.tsf.shell.manager.p.f.f);
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

    @Override // com.tsf.shell.e.e.g.a.e
    public void onHide() {
        super.onHide();
        this.d.b();
        int i = com.tsf.shell.manager.a.v.a.a.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((p) com.tsf.shell.manager.a.v.a.a.a(i2)).l();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.a.v.a.a.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((p) com.tsf.shell.manager.a.v.a.a.a(i2)).h();
        }
        h.b();
        com.tsf.shell.manager.a.v.a.a.j();
    }
}
