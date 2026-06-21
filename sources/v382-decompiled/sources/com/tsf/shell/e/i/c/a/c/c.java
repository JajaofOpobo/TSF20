package com.tsf.shell.e.i.c.a.c;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.e.i.c.a.o;

/* loaded from: classes.dex */
public class c extends o {
    private a a;

    public c(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        l lVar = (l) getVirtualTarget();
        this.a = new a();
        lVar.addChild(this.a);
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void b() {
        this.a.d();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void c() {
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        this.a.b();
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
    public void d() {
        this.a.c();
    }
}
