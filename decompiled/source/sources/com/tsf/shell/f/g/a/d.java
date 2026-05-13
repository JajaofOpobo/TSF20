package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.a;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends com.tsf.shell.f.e.g.a.b {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;

    public d(b bVar) {
        super(b.i.mn_drawer);
        this.a = bVar;
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new a.C0095a(b.d.effect_setting_desktop_menu_random, x.c(b.i.text_random), new a.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.d.1
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.a.v.a.b.g();
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.a.v.a.b.a(true);
                d.this.b.d();
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.a.v.a.b.a(false);
                d.this.b.d();
            }
        }));
        setFunctions(arrayList);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.d.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.a.b.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                com.tsf.shell.f.f.b.a.d dVar = (com.tsf.shell.f.f.b.a.d) com.tsf.shell.manager.a.v.a.b.a(i);
                com.tsf.shell.f.d.e.a aVar = (com.tsf.shell.f.d.e.a) dVar.o();
                aVar.e.textures().clear();
                aVar.e.textures().addElement(com.tsf.shell.f.d.e.a.a());
                if (dVar.i()) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                return aVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.d.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                com.tsf.shell.manager.a.v.a.b.b(com.tsf.shell.manager.a.v.a.b.a(i));
                d.this.b.d();
            }
        });
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

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.a.v.a.b.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.a.v.a.b.a(i2).h();
        }
        h.b();
        com.tsf.shell.manager.a.v.a.b.j();
    }
}
