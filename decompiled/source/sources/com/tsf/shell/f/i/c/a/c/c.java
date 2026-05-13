package com.tsf.shell.f.i.c.a.c;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.f.i.c.a.j;
/* loaded from: classes.dex */
public class c extends j {
    private a a;

    public c(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.a = new a();
        ((com.censivn.C3DEngine.b.f.j) getVirtualTarget()).addChild(this.a);
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        this.a.d();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        this.a.b();
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
    public void d() {
        this.a.c();
    }
}
