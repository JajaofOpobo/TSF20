package com.tsf.shell.f.h.a.a;

import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends i {
    private d a;
    private com.censivn.C3DEngine.b.e.a b;
    private com.censivn.C3DEngine.b.e.e c;
    private com.tsf.shell.f.h.a.b d;

    public e(d dVar) {
        this.a = dVar;
        a(b.i.text_preferences);
        com.censivn.C3DEngine.b.e.a aVar = new com.censivn.C3DEngine.b.e.a();
        this.b = aVar;
        aVar.h(b.i.text_show_recents);
        aVar.a(new a.C0027a() { // from class: com.tsf.shell.f.h.a.a.e.1
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                return true;
            }
        });
        b(aVar);
        com.censivn.C3DEngine.b.e.e eVar = new com.censivn.C3DEngine.b.e.e();
        this.c = eVar;
        eVar.g(b.i.text_show_recents);
        eVar.h(b.i.mn_contacts_maximum);
        eVar.a("");
        eVar.i(3);
        eVar.j(10);
        this.d = new com.tsf.shell.f.h.a.b();
        b(this.d);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void h() {
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        this.b.c(this.a.k().c());
        this.c.k(this.a.k().a());
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        if (this.b.e() != this.a.k().visible()) {
            this.a.k().a(this.b.e());
        }
        com.tsf.shell.manager.a.o.a().a(this.d.e());
    }
}
