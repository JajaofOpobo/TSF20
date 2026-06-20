package com.tsf.shell.f._d.a;

import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.f.g.a.GestureMenuRenderer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashElementInfo extends h {
    public static k b;
    public boolean a;
    private A c;
    private Runnable d;
    private Runnable f;

    public DashElementInfo(A aVar, boolean z) {
        super(0.85f);
        this.a = false;
        this.c = aVar;
        calAABB();
        useVBO(false);
        this.e.useVBO(false);
        if (b == null) {
            b = h.a(0.85f);
            b.useVBO(false);
        }
        this.a = z ? false : true;
        this.d = new Runnable() { // from class: com.tsf.shell.f._d.a.DashElementInfo.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.C3DEngine.a().b(b.this.f, 300L);
            }
        };
        this.f = new Runnable() { // from class: com.tsf.shell.f._d.a.DashElementInfo.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.a = false;
            }
        };
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (!this.a) {
            this.a = true;
            this.c.a((k) this.e, this.d);
        }
    }

    @Override // com.tsf.shell.f.g.a.GestureMenuRenderer, com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        com.tsf.shell.manager.i.PrimeEffectRenderer.a(this.c.a(), com.censivn.C3DEngine.b.b.A.a(30.0f));
    }
}
