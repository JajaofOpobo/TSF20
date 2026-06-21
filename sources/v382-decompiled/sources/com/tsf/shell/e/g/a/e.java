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
public class e extends a {
    public b a;
    private i b;

    public e(b bVar) {
        super(R.string.menu_effect_clicking);
        this.a = bVar;
        com.tsf.shell.e.e.g.a.c cVar = new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.e.g.a.e.1
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.a.v.b.b();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.a.v.b.a(true);
                e.this.b.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.a.v.b.a(false);
                e.this.b.d();
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.effect_setting_desktop_menu_random, x.c(R.string.text_random), cVar));
        setFunctions(arrayList);
        this.b = new i(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.e.g.a.e.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.b.d();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public j a(int i, j jVar) {
                com.tsf.shell.e.d.a.a a = com.tsf.shell.manager.a.v.b.a(i);
                h hVar = (h) a.e();
                hVar.e.textures().clear();
                hVar.e.textures().addElement(h.i());
                if (a.b()) {
                    hVar.g();
                } else {
                    hVar.h();
                }
                return hVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.e.g.a.e.3
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(j jVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.e.d.a.a a = com.tsf.shell.manager.a.v.b.a(i);
                w.b();
                com.tsf.shell.manager.a.v.b.a(a);
                if (a.b()) {
                    e.this.a.a().a(a);
                }
                e.this.b.d();
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
    public void onHide() {
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        super.onRecycle();
        h.b();
        h.j();
        com.tsf.shell.manager.a.v.b.e();
    }
}
