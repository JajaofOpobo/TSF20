package com.tsf.shell.workspace3D.h.a.a;

import com.tsf.shell.a.t;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m {
    private ArrayList a = new ArrayList();
    private l b;
    private int c;
    private int d;

    public m() {
        this.d = 1;
        this.a.add(new f());
        this.a.add(new a());
        this.a.add(new g());
        this.a.add(new i());
        this.a.add(new k());
        this.a.add(new h());
        int[] N = t.N();
        this.c = c(N[0]);
        this.d = d(N[1]);
        this.b = (l) this.a.get(this.c);
    }

    public final void a(int i, int i2, int i3, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(i, i2, i3, arrayList);
        }
    }

    public final l a() {
        return this.b;
    }

    public final void a(int i) {
        this.c = c(i);
        this.b = (l) this.a.get(this.c);
        t.b(this.c, this.d);
    }

    public final int b() {
        return this.c;
    }

    public final void b(int i) {
        this.d = d(i);
        t.b(this.c, this.d);
    }

    public final int c() {
        return this.d;
    }

    private int c(int i) {
        if (i < 0 || i > this.a.size() - 1) {
            return 0;
        }
        return i;
    }

    private static int d(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 1) {
            return 1;
        }
        return i;
    }
}
