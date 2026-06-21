package com.tsf.shell.e.d.a;

import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.e.g.a.h;

/* loaded from: classes.dex */
public class b extends h {
    public static m b;
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
        this.d = new Runnable() { // from class: com.tsf.shell.e.d.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().b(b.this.f, 300L);
            }
        };
        this.f = new Runnable() { // from class: com.tsf.shell.e.d.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.a = false;
            }
        };
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (!this.a) {
            this.a = true;
            this.c.a((m) this.e, this.d);
        }
    }

    @Override // com.tsf.shell.e.g.a.h, com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        com.tsf.shell.manager.i.a.a(this.c.a(), com.censivn.C3DEngine.b.b.a.a(30.0f));
    }
}
