package com.tsf.shell.f.d.e.a;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.f.f.g;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a extends b {
    private g a;

    public a(int i) {
        super(i);
    }

    @Override // com.tsf.shell.f.d.e.a.b
    public boolean a() {
        return true;
    }

    @Override // com.tsf.shell.f.d.e.a.b
    public boolean b() {
        return false;
    }

    @Override // com.tsf.shell.f.d.e.a.InterfaceC0090a
    public void a(final com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        d dVar = new d() { // from class: com.tsf.shell.f.d.e.a.a.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                aVar.rotation().x = (1.0f - (Math.abs(f - 0.5f) * 2.0f)) * (-30.0f);
            }
        };
        dVar.a(50);
        dVar.l(0.5f);
        dVar.m(0.5f);
        dVar.a(runnable);
        dVar.b(runnable);
        c.a(aVar);
        c.a(aVar, e(), dVar);
    }

    @Override // com.tsf.shell.f.d.e.a.b, com.tsf.shell.f.d.e.a.InterfaceC0090a
    public void b(final com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        d dVar = new d() { // from class: com.tsf.shell.f.d.e.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                aVar.rotation().x = (1.0f - (Math.abs(f - 0.5f) * 2.0f)) * (-30.0f);
            }
        };
        dVar.a(255);
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.a(runnable);
        dVar.b(runnable);
        c.a(aVar);
        c.a(aVar, e(), dVar);
    }

    @Override // com.tsf.shell.f.d.e.a.b
    public void a(g gVar, float f, ArrayList<i> arrayList, Runnable runnable) {
        this.a = gVar;
        com.tsf.shell.manager.a.e.a(gVar.a((b) this, (i) com.tsf.shell.manager.a.e.a(), true).b, f, runnable);
    }

    @Override // com.tsf.shell.f.d.e.a.b
    public void a(g gVar) {
        c();
    }

    public void c() {
        com.tsf.shell.manager.a.e.a().a(this.a.a(true, true).b);
        com.tsf.shell.manager.a.e.a().a(1.0f);
    }

    @Override // com.tsf.shell.f.d.e.a.b
    public void a(final g gVar, ArrayList<i> arrayList, final Runnable runnable, boolean z) {
        if (z) {
            com.tsf.shell.manager.a.e.a(500, new Runnable() { // from class: com.tsf.shell.f.d.e.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    gVar.h();
                    runnable.run();
                    a.this.a = null;
                }
            });
            return;
        }
        gVar.h();
        com.tsf.shell.manager.a.e.a(0, runnable);
        this.a = null;
    }

    @Override // com.tsf.shell.f.d.e.a.b
    public int d() {
        return 600;
    }
}
