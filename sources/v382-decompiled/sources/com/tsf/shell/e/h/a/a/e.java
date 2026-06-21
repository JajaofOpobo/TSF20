package com.tsf.shell.e.h.a.a;

import com.censivn.C3DEngine.b.e.h;
import com.censivn.C3DEngine.b.e.m;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class e extends m {
    private d a;
    private com.censivn.C3DEngine.b.e.a b;
    private h c;
    private com.tsf.shell.e.h.a.b d;

    public e(d dVar) {
        this.a = dVar;
        a(R.string.text_preferences);
        com.censivn.C3DEngine.b.e.a aVar = new com.censivn.C3DEngine.b.e.a();
        this.b = aVar;
        aVar.h(R.string.text_show_recents);
        aVar.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.e.h.a.a.e.1
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                return true;
            }
        });
        b(aVar);
        h hVar = new h();
        this.c = hVar;
        hVar.g(R.string.text_show_recents);
        hVar.h(R.string.mn_contacts_maximum);
        hVar.a("");
        hVar.i(3);
        hVar.j(10);
        this.d = new com.tsf.shell.e.h.a.b();
        b(this.d);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void h() {
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        this.b.c(this.a.k().f());
        this.c.k(this.a.k().c());
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.b.e() != this.a.k().visible()) {
            this.a.k().b(this.b.e());
        }
        com.tsf.shell.manager.a.o.a().a(this.d.e());
    }
}
