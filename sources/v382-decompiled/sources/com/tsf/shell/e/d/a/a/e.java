package com.tsf.shell.e.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
public class e extends com.tsf.shell.e.d.a.a {
    private com.tsf.shell.e.d.a.b a;

    public e(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.e.d.a.a
    public j e() {
        if (this.a == null) {
            this.a = new com.tsf.shell.e.d.a.b(this, false);
        }
        return this.a;
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(m mVar, Runnable runnable) {
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(j jVar, Number3d number3d, Number3d number3d2, Runnable runnable) {
    }
}
