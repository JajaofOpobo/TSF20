package com.tsf.shell.f.h.a.b;

import com.censivn.C3DEngine.b.e.e;
import com.censivn.C3DEngine.b.e.i;
import com.tsf.b;
/* loaded from: classes.dex */
public class b extends i {
    private a a;
    private e b;
    private com.tsf.shell.f.h.a.b c;

    public b(a aVar) {
        this.a = aVar;
        a(b.i.text_preferences);
        e eVar = new e();
        this.b = eVar;
        eVar.g(b.i.text_display_count);
        eVar.h(b.i.text_recent_apps_display_count_summary);
        eVar.a("");
        eVar.i(3);
        eVar.j(15);
        b(eVar);
        this.c = new com.tsf.shell.f.h.a.b();
        b(this.c);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void h() {
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        this.b.k(this.a.k());
        a(com.tsf.shell.manager.a.o.a().a() == 0 ? b.i.text_top : b.i.text_bottom);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        if (this.b.e() != this.a.k()) {
            this.a.a(this.b.e(), true);
        }
        com.tsf.shell.manager.a.o.a().a(this.c.e());
    }
}
