package com.tsf.shell.e.e.i;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends com.censivn.C3DEngine.b.f.a.a {
    float a;
    private boolean c;
    private ArrayList d;
    private d e;
    private int f;

    public c() {
        super(16, 32, 32, 32, null, false);
        this.c = false;
        this.d = new ArrayList();
        this.a = 255.0f;
        c();
    }

    public void c() {
        for (int i = 0; i < 16; i++) {
            this.d.add(new e(a(i)));
        }
    }

    public void d() {
        this.c = true;
        e();
        this.a = 255.0f;
        alpha((int) this.a);
        visible(true);
    }

    public void e() {
        this.f = 0;
        alpha(0.0f);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        boolean z;
        super.onDrawStart();
        if (this.c) {
            this.f++;
            if (this.f > 60) {
                this.a *= 0.92f;
                alpha((int) this.a);
                if (this.a < 10.0f) {
                    this.a = 0.0f;
                    visible(false);
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b();
            }
            if (z) {
                invalidate();
            } else {
                this.c = false;
                f();
            }
        }
    }

    private void f() {
        if (this.e != null) {
            this.e.a();
        }
    }
}
