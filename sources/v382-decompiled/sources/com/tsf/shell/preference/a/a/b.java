package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.m;
import com.tsf.shell.Home;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class b extends m {
    public static float a = 4.0f;
    public static float b = 0.8f;
    private boolean c = false;
    private com.censivn.C3DEngine.b.e.h d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.tsf.shell.preference.a.a f;
    private float g;

    public b() {
        a(R.string.text_screen_scale);
        this.f = new com.tsf.shell.preference.a.a();
        b(this.f);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(R.string.text_default_scale);
        this.e.b(new StringBuilder().append(com.censivn.C3DEngine.b.b.a.e).toString());
        this.e.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.b.1
            @Override // com.censivn.C3DEngine.b.e.b
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
        this.d = new com.censivn.C3DEngine.b.e.h() { // from class: com.tsf.shell.preference.a.a.b.2
            @Override // com.censivn.C3DEngine.b.e.h, com.censivn.C3DEngine.b.e.k
            public void f(int i) {
                if (i < 10) {
                    d("0." + i);
                } else {
                    String num = Integer.toString(i);
                    d(String.valueOf(num.substring(0, 1)) + "." + num.substring(1));
                }
                b.this.f.a(b.this.d.e() / 10.0f);
            }
        };
        this.d.g(R.string.text_screen_scale);
        this.d.h(R.string.notic_screen_scale_tips);
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

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        float ah = com.tsf.shell.manager.b.g.ah();
        this.g = ah;
        this.c = ah == 0.0f;
        this.e.c(this.c);
        b(com.censivn.C3DEngine.b.b.a.d);
        i();
        i();
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        float e = this.e.e() ? 0.0f : this.d.e() / 10.0f;
        if (e != this.g) {
            com.tsf.shell.manager.o.b.c();
            com.tsf.shell.manager.b.g.f(e);
            Home.b().a(300);
        }
    }
}
