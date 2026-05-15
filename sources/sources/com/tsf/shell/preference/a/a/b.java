package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.tsf.b;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends i {
    public static float a = 4.0f;
    public static float b = 0.8f;
    private boolean c = false;
    private com.censivn.C3DEngine.b.e.e d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.tsf.shell.preference.a.a f;
    private float g;

    public b() {
        a(b.i.text_screen_scale);
        this.f = new com.tsf.shell.preference.a.a();
        b(this.f);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(b.i.text_default_scale);
        this.e.b("" + com.censivn.C3DEngine.b.b.a.e);
        this.e.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.b.1
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                b.this.c = z;
                if (b.this.c) {
                    b.this.b(com.censivn.C3DEngine.b.b.a.e);
                }
                b.this.i();
                return true;
            }
        });
        b(this.e);
        this.d = new com.censivn.C3DEngine.b.e.e() { // from class: com.tsf.shell.preference.a.a.b.2
            @Override // com.censivn.C3DEngine.b.e.e, com.censivn.C3DEngine.b.e.h
            public void f(int i) {
                if (i < 10) {
                    d("0." + i);
                } else {
                    String string = Integer.toString(i);
                    d(string.substring(0, 1) + "." + string.substring(1));
                }
                b.this.f.a(b.this.d.e() / 10.0f);
            }
        };
        this.d.g(b.i.text_screen_scale);
        this.d.h(b.i.notic_screen_scale_tips);
        this.d.i((int) (b * 10.0f));
        this.d.j((int) (a * 10.0f));
        this.d.k(8);
        this.d.a("");
        b(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.c) {
            this.d.i();
        } else {
            this.d.j();
        }
    }

    public static float a(float f) {
        if (f != 0.0f) {
            if (f > a) {
                f = a;
            } else if (f < b) {
                f = b;
            }
        }
        return ((int) (f * 10.0f)) / 10.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        this.d.k((int) (10.0f * f));
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        float fAj = com.tsf.shell.manager.b.e.aj();
        this.g = fAj;
        this.c = fAj == 0.0f;
        this.e.c(this.c);
        b(com.censivn.C3DEngine.b.b.a.d);
        i();
        i();
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        float fE = this.e.e() ? 0.0f : this.d.e() / 10.0f;
        if (fE != this.g) {
            com.tsf.shell.manager.o.b.c();
            com.tsf.shell.manager.b.e.f(fE);
            Home.b().a(300);
        }
    }
}
