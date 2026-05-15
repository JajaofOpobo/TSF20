package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends h {
    private com.censivn.C3DEngine.b.f.j a;
    private float b;
    private float d;
    private float e;
    private ArrayList<com.tsf.shell.f.d.b.a.d> f;
    private m g;

    public g(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(400.0f));
        this.a = new com.censivn.C3DEngine.b.f.j();
        e().addChild(this.a);
        this.b = com.tsf.shell.manager.o.b.a.H;
        this.e = com.censivn.C3DEngine.b.b.a.a(40.0f);
        this.d = (this.b * 5.0f) + (this.e * 4.0f);
        this.a.position().x = ((-this.d) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f);
        this.a.position().y = -com.censivn.C3DEngine.b.b.a.a(140.0f);
        this.f = new ArrayList<>();
        this.g = new m();
        this.g.c(b.i.notic_mark_introduction);
        this.g.d(34);
        this.g.a(true);
        this.g.position().y = com.censivn.C3DEngine.b.b.a.a(200.0f);
        com.tsf.shell.manager.o.c.a(this.g, com.tsf.shell.manager.o.c.n);
        e().addChild(this.g);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void f() {
        int i = 0;
        super.f();
        this.f.clear();
        this.f.add(com.tsf.shell.manager.a.v.f.a(0));
        this.f.add(com.tsf.shell.manager.a.v.f.a(2));
        this.f.add(com.tsf.shell.manager.a.v.f.a(3));
        this.f.add(com.tsf.shell.manager.a.v.f.a(12));
        this.f.add(com.tsf.shell.manager.a.v.f.a(14));
        while (true) {
            int i2 = i;
            if (i2 < this.f.size()) {
                com.tsf.shell.f.d.b.a.b bVarE = this.f.get(i2).e();
                if (i2 == 0) {
                    bVarE.g();
                } else {
                    bVarE.h();
                }
                bVarE.removeFromParent();
                bVarE.position().x = this.e + ((this.b + this.e) * i2);
                this.a.addChild(bVarE);
                i = i2 + 1;
            } else {
                h();
                return;
            }
        }
    }

    private void h() {
        this.g.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(150.0f)));
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        h();
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        this.g.a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f.size()) {
                com.tsf.shell.f.d.b.a.d dVar = this.f.get(i2);
                dVar.e().removeFromParent();
                dVar.h();
                dVar.d();
                dVar.a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
