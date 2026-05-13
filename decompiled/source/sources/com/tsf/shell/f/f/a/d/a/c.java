package com.tsf.shell.f.f.a.d.a;

import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.utils.x;
import java.util.Comparator;
/* loaded from: classes.dex */
public class c extends com.tsf.shell.f.f.f {
    protected int a;
    protected Comparator<com.tsf.shell.f.i.b> b;
    protected Comparator<i> c;
    protected String d;

    public c(int i, int i2) {
        super(i2, i, false);
        this.d = x.c(i2);
    }

    public Comparator<? super com.tsf.shell.f.i.b> a() {
        return this.b;
    }

    public Comparator<? super i> b() {
        return this.c;
    }

    @Override // com.tsf.shell.f.f.f
    public int k() {
        return this.a;
    }

    public String c() {
        return this.d;
    }
}
