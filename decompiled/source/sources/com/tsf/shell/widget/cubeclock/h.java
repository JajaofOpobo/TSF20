package com.tsf.shell.widget.cubeclock;
/* loaded from: classes.dex */
public class h extends e {
    public h(c cVar) {
        super(cVar);
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public int a() {
        return 31;
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public float[] a(int i) {
        int i2 = i + 1;
        return this.c.e.a(i2 / 10, i2 % 10);
    }
}
