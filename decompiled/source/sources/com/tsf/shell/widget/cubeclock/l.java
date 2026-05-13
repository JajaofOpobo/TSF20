package com.tsf.shell.widget.cubeclock;
/* loaded from: classes.dex */
public class l extends e {
    public l(c cVar) {
        super(cVar);
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public int a() {
        return 60;
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public float[] a(int i) {
        return this.c.e.a(i / 10, i % 10);
    }
}
