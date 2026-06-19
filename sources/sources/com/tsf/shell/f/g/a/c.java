package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.a;
import com.tsf.shell.f.f.l;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.tsf.shell.f.e._g.a.b {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private a.C0095a c;
    private e.a d;

    public c(b bVar) {
        super(b.i.menu_effect_desktop);
        this.a = bVar;
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        a.C0095a.C0096a c0096a = new a.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.c.1
            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.app.v.FlagHelper.C0126a.g();
            }

            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(true);
                c.this.b.d();
            }

            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(false);
                c.this.b.d();
            }
        };
        a.C0095a.C0096a c0096a2 = new a.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.c.2
            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.f.f.h.c();
            }

            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void b() {
                com.tsf.shell.f.f.h.b(true);
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }

            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void c() {
                com.tsf.shell.f.f.h.b(false);
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }
        };
        this.c = new a.C0095a(b.d.effect_setting_desktop_menu_swing, x.c(b.i.menu_effect_swing), new a.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.c.3
            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.app.v.ObjectHelper.b();
            }

            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.v.ObjectHelper.c();
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }

            @Override // com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.v.ObjectHelper.d();
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }
        });
        arrayList.add(new a.C0095a(b.d.effect_setting_desktop_menu_random, x.c(b.i.text_random), c0096a));
        arrayList.add(new a.C0095a(b.d.effect_setting_desktop_menu_page_border, x.c(b.i.text_border), c0096a2));
        arrayList.add(this.c);
        setFunctions(arrayList);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.A.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.A.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.c.4
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.app.v.FlagHelper.C0126a.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i hVar;
                if (iVar == null) {
                    hVar = new h();
                    hVar.calAABB();
                } else {
                    hVar = iVar;
                }
                l lVarA = com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i);
                h hVar2 = (h) hVar;
                if (lVarA.i()) {
                    hVar2.g();
                } else {
                    hVar2.h();
                }
                if (lVarA.n()) {
                    hVar2.c();
                } else {
                    hVar2.d();
                }
                hVar2.e.textures().clear();
                hVar2.e.textures().addElement(lVarA.a(h.e(), h.f()));
                return hVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.c.5
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                l lVarA = com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i);
                w.b();
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.c(lVarA);
                c.this.b.d();
            }
        });
        this.d = com.tsf.shell.manager.app.AppListManager.a(this, com.tsf.shell.manager.p.e.f);
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public j getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onShow() {
        this.b.d();
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onHide() {
        super.onHide();
        this.d.b();
        int i = com.tsf.shell.manager.app.v.FlagHelper.C0126a.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i2).l();
        }
    }

    @Override // com.tsf.shell.f.e._g.a.c
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.app.v.FlagHelper.C0126a.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i2).h();
        }
        h.b();
        com.tsf.shell.manager.app.v.FlagHelper.C0126a.j();
    }
}
