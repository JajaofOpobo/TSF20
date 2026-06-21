package com.tsf.shell.e.h.a.b;

import com.censivn.C3DEngine.b.e.h;
import com.censivn.C3DEngine.b.e.m;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class c extends m {
    private a a;
    private h b;
    private com.tsf.shell.e.h.a.b c;

    public c(a aVar) {
        this.a = aVar;
        a(R.string.text_preferences);
        h hVar = new h();
        this.b = hVar;
        hVar.g(R.string.text_display_count);
        hVar.h(R.string.text_recent_apps_display_count_summary);
        hVar.a("");
        hVar.i(3);
        hVar.j(15);
        b(hVar);
        this.c = new com.tsf.shell.e.h.a.b();
        b(this.c);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void h() {
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        this.b.k(this.a.k());
        a(com.tsf.shell.manager.a.o.a().a() == 0 ? R.string.text_top : R.string.text_bottom);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.b.e() != this.a.k()) {
            this.a.a(this.b.e(), true);
        }
        com.tsf.shell.manager.a.o.a().a(this.c.e());
    }
}
