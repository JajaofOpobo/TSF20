package com.tsf.shell.f.d.a;

import com.censivn.C3DEngine.b.f.k;
import com.tsf.shell.f.g.a.h;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends h {
    public static k b;
    public boolean a;
    private a c;
    private Runnable d;
    private Runnable f;

    public b(a aVar, boolean z) {
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
        this.d = new Runnable() { // from class: com.tsf.shell.f.d.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().b(b.this.f, 300L);
            }
        };
        this.f = new Runnable() { // from class: com.tsf.shell.f.d.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.a = false;
            }
        };
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (!this.a) {
            this.a = true;
            this.c.a((k) this.e, this.d);
        }
    }

    @Override // com.tsf.shell.f.g.a.h, com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        com.tsf.shell.manager.i.a.a(this.c.a(), com.censivn.C3DEngine.b.b.a.a(30.0f));
    }
}
