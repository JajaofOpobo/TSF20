package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends j {
    private com.censivn.C3DEngine.b.f.l a;
    private float b;
    private float d;
    private float e;
    private ArrayList f;
    private o g;

    public i(String str) {
        super(str, com.censivn.C3DEngine.b.b.a.a(400.0f));
        this.a = new com.censivn.C3DEngine.b.f.l();
        e().addChild(this.a);
        this.b = com.tsf.shell.manager.o.b.a.H;
        this.e = com.censivn.C3DEngine.b.b.a.a(40.0f);
        this.d = (this.b * 5.0f) + (this.e * 4.0f);
        this.a.position().x = ((-this.d) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(40.0f);
        this.a.position().y = -com.censivn.C3DEngine.b.b.a.a(140.0f);
        this.f = new ArrayList();
        this.g = new o();
        this.g.c(R.string.notic_mark_introduction);
        this.g.d(34);
        this.g.a(true);
        this.g.position().y = com.censivn.C3DEngine.b.b.a.a(200.0f);
        com.tsf.shell.manager.o.c.a(this.g, com.tsf.shell.manager.o.c.n);
        e().addChild(this.g);
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void f() {
        super.f();
        this.f.clear();
        this.f.add((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.a(0));
        this.f.add((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.a(2));
        this.f.add((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.a(3));
        this.f.add((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.a(12));
        this.f.add((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.a(14));
        for (int i = 0; i < this.f.size(); i++) {
            com.tsf.shell.e.d.b.a.c e = ((com.tsf.shell.e.d.b.a.e) this.f.get(i)).e();
            if (i == 0) {
                e.g();
            } else {
                e.h();
            }
            e.removeFromParent();
            e.position().x = this.e + ((this.b + this.e) * i);
            this.a.addChild(e);
        }
        h();
    }

    private void h() {
        this.g.f((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(150.0f)));
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        h();
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        this.g.a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f.size()) {
                com.tsf.shell.e.d.b.a.e eVar = (com.tsf.shell.e.d.b.a.e) this.f.get(i2);
                eVar.e().removeFromParent();
                eVar.h();
                eVar.d();
                eVar.a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
