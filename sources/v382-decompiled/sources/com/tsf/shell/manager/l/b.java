package com.tsf.shell.manager.l;

import android.content.Intent;

/* loaded from: classes.dex */
public class b implements com.censivn.C3DEngine.b.c.b {
    public int a;

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.a) {
            a.a(intent, this);
        }
    }

    public void a(com.tsf.shell.e.i.b.e.b bVar) {
    }

    public com.tsf.shell.manager.o.a a() {
        return com.tsf.shell.manager.o.b.a;
    }
}
