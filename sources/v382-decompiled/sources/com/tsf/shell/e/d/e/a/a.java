package com.tsf.shell.e.d.e.a;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends b {
    private g a;

    public a(int i) {
        super(i);
    }

    @Override // com.tsf.shell.e.d.e.a.b
    public boolean a() {
        return true;
    }

    @Override // com.tsf.shell.e.d.e.a.b
    public boolean b() {
        return false;
    }

    @Override // com.tsf.shell.e.d.e.b
    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar = new x() { // from class: com.tsf.shell.e.d.e.a.a.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                aVar.rotation().x = (1.0f - (Math.abs(f - 0.5f) * 2.0f)) * (-30.0f);
            }
        };
        xVar.a(50);
        xVar.l(0.5f);
        xVar.m(0.5f);
        xVar.a(runnable);
        xVar.b(runnable);
        w.a(aVar);
        w.a(aVar, e(), xVar);
    }

    @Override // com.tsf.shell.e.d.e.a.b, com.tsf.shell.e.d.e.b
    public void b(final com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar = new x() { // from class: com.tsf.shell.e.d.e.a.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                aVar.rotation().x = (1.0f - (Math.abs(f - 0.5f) * 2.0f)) * (-30.0f);
            }
        };
        xVar.a(255);
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.a(runnable);
        xVar.b(runnable);
        w.a(aVar);
        w.a(aVar, e(), xVar);
    }

    @Override // com.tsf.shell.e.d.e.a.b
    public void a(g gVar, float f, ArrayList arrayList, Runnable runnable) {
        this.a = gVar;
        com.tsf.shell.manager.a.e.a(gVar.a((b) this, (j) com.tsf.shell.manager.a.e.a(), true).b, f, runnable);
    }

    @Override // com.tsf.shell.e.d.e.a.b
    public void a(g gVar) {
        c();
    }

    public void c() {
        com.tsf.shell.manager.a.e.a().a(this.a.a(true, true).b);
        com.tsf.shell.manager.a.e.a().a(1.0f);
    }

    @Override // com.tsf.shell.e.d.e.a.b
    public void a(final g gVar, ArrayList arrayList, final Runnable runnable, boolean z) {
        if (z) {
            com.tsf.shell.manager.a.e.a(500, new Runnable() { // from class: com.tsf.shell.e.d.e.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    gVar.h();
                    runnable.run();
                    a.this.a = null;
                }
            });
        } else {
            gVar.h();
            com.tsf.shell.manager.a.e.a(0, runnable);
            this.a = null;
        }
    }

    @Override // com.tsf.shell.e.d.e.a.b
    public int d() {
        return 600;
    }
}
