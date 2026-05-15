package com.tsf.shell.f.d.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class a {
    private int a;
    private boolean b = false;
    private boolean c = false;
    private boolean d;

    public abstract void a(i iVar, Number3d number3d, Number3d number3d2, Runnable runnable);

    public abstract void a(k kVar, Runnable runnable);

    public abstract i e();

    public a(int i, boolean z) {
        boolean z2 = false;
        this.d = false;
        this.a = i;
        if (z && Home.a()) {
            z2 = true;
        }
        this.d = z2;
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public void b(boolean z) {
        this.c = z;
    }
}
