package com.censivn.C3DEngine.b.h.d;

import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class c extends a {
    private m a;
    private int b;
    private float c;

    public c(float f, int i, float f2) {
        super(f, i, f2);
        this.b = 0;
        this.a = new m();
        this.a.d(32);
        this.c = com.censivn.C3DEngine.b.b.a.a(20.0f);
        addChild(this.a);
    }

    public void b(int i) {
        a(x.c(i));
    }

    public void a(String str) {
        if (str == null || str.length() == 0) {
            this.a.visible(false);
        } else {
            this.a.visible(true);
        }
        this.a.a(str);
        c();
    }

    public void c(int i) {
        this.b = i;
        c();
    }

    private void c() {
        this.a.b();
        if (this.b == 0) {
            this.a.b(2);
            this.a.position().x = ((-a()) / 2.0f) - this.c;
            return;
        }
        this.a.b(1);
        this.a.position().x = (a() / 2.0f) + this.c;
    }
}
