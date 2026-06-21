package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.l;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends com.censivn.C3DEngine.b.e.f {
    private com.censivn.C3DEngine.b.e.h a;
    private com.tsf.shell.preference.a.g b;
    private com.tsf.shell.preference.a.h c;
    private com.censivn.C3DEngine.b.e.h d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.censivn.C3DEngine.b.e.a f;
    private int g = 0;
    private int h = 0;
    private com.censivn.C3DEngine.b.e.g i;
    private com.censivn.C3DEngine.b.e.g j;
    private com.censivn.C3DEngine.b.e.c k;

    public e() {
        a(R.string.text_preferences);
        this.k = new com.censivn.C3DEngine.b.e.c();
        this.k.g(R.string.text_standard_dock);
        this.k.g(R.string.text_slinding_dock);
        a(this.k);
        this.k.a(new com.censivn.C3DEngine.b.e.d() { // from class: com.tsf.shell.preference.a.a.e.1
            @Override // com.censivn.C3DEngine.b.e.d
            public void a(int i) {
                e.this.a(i, i != 0);
            }
        });
        this.i = new com.censivn.C3DEngine.b.e.g();
        this.j = new com.censivn.C3DEngine.b.e.g();
        a(this.i);
        a(this.j);
        this.c = new com.tsf.shell.preference.a.h(com.censivn.C3DEngine.b.b.a.a(250.0f));
        this.i.a(this.c);
        com.censivn.C3DEngine.b.e.h hVar = new com.censivn.C3DEngine.b.e.h();
        this.d = hVar;
        hVar.h(R.string.text_width_margin_summary);
        hVar.a(" %");
        hVar.k(0);
        hVar.i(0);
        hVar.j(100);
        this.i.a(hVar);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(R.string.mn_indicator_mode);
        this.e.i(R.string.mn_indicator_mode_summary);
        this.i.a(this.e);
        this.e.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.e.2
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                if (z) {
                    e.this.c.h();
                    return true;
                }
                e.this.c.m();
                return true;
            }
        });
        hVar.a(new l() { // from class: com.tsf.shell.preference.a.a.e.3
            @Override // com.censivn.C3DEngine.b.e.l
            public boolean a(int i) {
                e.this.c.f(i);
                if (com.censivn.C3DEngine.b.b.a.O) {
                    e.this.g = i;
                    return true;
                }
                e.this.h = i;
                return true;
            }
        });
        com.tsf.shell.preference.a.g gVar = new com.tsf.shell.preference.a.g(com.censivn.C3DEngine.b.b.a.a(300.0f));
        this.b = gVar;
        this.j.a(gVar);
        com.censivn.C3DEngine.b.e.h hVar2 = new com.censivn.C3DEngine.b.e.h();
        this.a = hVar2;
        hVar2.g(R.string.text_button_transparency);
        hVar2.a(" %");
        hVar2.k(70);
        hVar2.a(new l() { // from class: com.tsf.shell.preference.a.a.e.4
            @Override // com.censivn.C3DEngine.b.e.l
            public boolean a(int i) {
                e.this.b.f(i);
                return true;
            }
        });
        this.j.a(hVar2);
        this.f = new com.censivn.C3DEngine.b.e.a();
        this.f.h(R.string.mn_indicator_mode);
        this.f.i(R.string.mn_indicator_mode_summary);
        this.j.a(this.f);
        this.f.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.e.5
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                if (z) {
                    e.this.b.h();
                    return true;
                }
                e.this.b.m();
                return true;
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public int b() {
        return com.tsf.shell.manager.a.g.c();
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void h() {
        i();
    }

    private void i() {
        if (com.censivn.C3DEngine.b.b.a.O) {
            this.d.b(String.valueOf(x.c(R.string.text_width_margin)) + " (" + x.c(R.string.text_vertical) + ")");
            this.d.k(this.g);
            this.c.f(this.g);
        } else {
            this.d.b(String.valueOf(x.c(R.string.text_width_margin)) + " (" + x.c(R.string.text_horizontal) + ")");
            this.d.k(this.h);
            this.c.f(this.h);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        this.k.alpha(0.0f);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(255);
        w.a(this.k);
        w.a(this.k, 500, xVar);
        this.k.f(com.tsf.shell.manager.a.g.c());
        int i = com.tsf.shell.manager.a.g.b.i();
        this.a.k(i);
        this.b.f(i);
        this.g = com.tsf.shell.manager.b.g.t();
        this.h = com.tsf.shell.manager.b.g.u();
        this.e.c(com.tsf.shell.manager.b.g.ae());
        this.f.c(com.tsf.shell.manager.b.g.af());
        i();
        if (com.tsf.shell.manager.b.g.ae()) {
            this.c.h();
        } else {
            this.c.m();
        }
        if (com.tsf.shell.manager.b.g.af()) {
            this.b.h();
        } else {
            this.b.m();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        com.tsf.shell.manager.a.g.b.a(this.a.e(), true);
        com.tsf.shell.manager.a.g.a.a(this.d.e());
        com.tsf.shell.manager.b.g.d(this.g);
        com.tsf.shell.manager.b.g.e(this.h);
        com.tsf.shell.manager.b.g.p(this.e.e());
        com.tsf.shell.manager.b.g.q(this.f.e());
        com.tsf.shell.manager.a.g.b(this.k.e());
    }
}
