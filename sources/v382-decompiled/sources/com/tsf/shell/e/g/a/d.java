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
public class d extends com.tsf.shell.e.e.g.a.d {
    public b a;
    private i b;

    public d(b bVar) {
        super(R.string.mn_drawer);
        this.a = bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_random, x.c(R.string.text_random), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.g.a.d.1
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.a.v.a.b.g();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.v.a.b.a(true);
                d.this.b.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.v.a.b.a(false);
                d.this.b.d();
            }
        }));
        setFunctions(arrayList);
        this.b = new i(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.e.g.a.d.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.a.b.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                com.tsf.shell.e.f.b.a.d dVar = (com.tsf.shell.e.f.b.a.d) com.tsf.shell.manager.a.v.a.b.a(i);
                com.tsf.shell.e.d.e.a aVar = (com.tsf.shell.e.d.e.a) dVar.o();
                aVar.e.textures().clear();
                aVar.e.textures().addElement(com.tsf.shell.e.d.e.a.a());
                if (dVar.i()) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                return aVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.e.g.a.d.3
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                p pVar = (p) com.tsf.shell.manager.a.v.a.b.a(i);
                w.b();
                com.tsf.shell.manager.a.v.a.b.b(pVar);
                d.this.b.d();
            }
        });
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
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.a.v.a.b.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((p) com.tsf.shell.manager.a.v.a.b.a(i2)).h();
        }
        h.b();
        com.tsf.shell.manager.a.v.a.b.j();
    }
}
