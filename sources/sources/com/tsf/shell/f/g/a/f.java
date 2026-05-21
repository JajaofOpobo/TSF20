package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.manager.p.e;
import com.tsf.shell.utils.w;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends a {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private e.a c;
    private m d;

    public f(b bVar) {
        super(b.i.text_mark);
        this.a = bVar;
        this.d = new m();
        this.d.c(b.i.notic_mark_introduction);
        this.d.d(34);
        this.d.a(true);
        com.tsf.shell.manager.o.c.a(this.d, com.tsf.shell.manager.o.c.n);
        setMenuHeight(com.censivn.C3DEngine.b.b.a.a(430.0f));
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T * 0.9f, com.tsf.shell.manager.o.b.c.U * com.censivn.C3DEngine.b.b.a.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.f.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.a.v.f.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                com.tsf.shell.f.d.b.a.d dVarA = com.tsf.shell.manager.a.v.f.a(i);
                com.tsf.shell.f.d.b.a.b bVarE = dVarA.e();
                bVarE.removeFromParent();
                if (dVarA.i()) {
                    bVarE.g();
                } else {
                    bVarE.h();
                }
                if (dVarA.n()) {
                    bVarE.c();
                } else {
                    bVarE.d();
                }
                return bVarE;
            }
        });
        this.d.position().y = com.censivn.C3DEngine.b.b.a.a(300.0f);
        this.b.a().addChild(this.d);
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.f.2
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.f.d.b.a.d dVarA = com.tsf.shell.manager.a.v.f.a(i);
                w.b();
                com.tsf.shell.manager.a.v.f.a((com.tsf.shell.f.f.f) dVarA);
                f.this.b.d();
            }
        });
        this.c = com.tsf.shell.manager.a.a.a(this, com.tsf.shell.manager.p.e.h);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
        this.d.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(150.0f)));
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        this.b.d();
        this.a.a();
    }

    @Override // com.tsf.shell.f.g.a.a
    public float b() {
        return com.censivn.C3DEngine.b.b.a.a(120.0f);
    }

    @Override // com.tsf.shell.f.g.a.a
    public void c() {
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onHide() {
        super.onHide();
        this.c.b();
        int i = com.tsf.shell.manager.a.v.f.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.a.v.f.a(i2).l();
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        super.onRecycle();
        this.d.a();
        int i = com.tsf.shell.manager.a.v.f.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.f.d.b.a.d dVarA = com.tsf.shell.manager.a.v.f.a(i2);
            dVarA.h();
            dVarA.d();
            dVarA.a();
        }
        com.tsf.shell.manager.a.v.f.j();
    }
}
