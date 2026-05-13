package com.tsf.shell.p096f.p131f.p132a.p133a.p134a;

import com.tsf.shell.p096f.p131f.p132a.p133a.C2685b;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2695c;
import com.tsf.shell.p096f.p131f.p132a.p133a.p135b.C2693b;
import com.tsf.shell.p096f.p131f.p132a.p133a.p135b.C2694c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.a.a.b */
/* loaded from: classes.dex */
public class C2683b extends C2684c {

    /* renamed from: a */
    private C2694c f8833a;

    public C2683b(C2695c c2695c) {
        super(c2695c);
        this.f8833a = new C2694c(this);
        m4941a((C2693b) this.f8833a);
    }

    /* renamed from: a */
    public void m4943a(C2685b.C2690c c2690c) {
        this.f8833a.m4895a(c2690c.m4897a());
        ArrayList<C2685b.InterfaceC2688a> m4894b = c2690c.m4894b();
        ArrayList<C3222g> arrayList = new ArrayList<>();
        Iterator<C2685b.InterfaceC2688a> it = m4894b.iterator();
        while (it.hasNext()) {
            C2685b.InterfaceC2688a next = it.next();
            if (next instanceof C3222g) {
                C3222g c3222g = (C3222g) next;
                c3222g.m3136g(1.0f);
                c3222g.visible(true);
                c3222g.scale().setAll(1.0f, 1.0f, 1.0f);
                c3222g.rotation().setAll(0.0f, 0.0f, 0.0f);
                c3222g.position().f2528z = 0.0f;
                c3222g.alpha(255.0f);
                arrayList.add(c3222g);
            }
        }
        m4933j();
        m4939a(arrayList);
    }

    /* renamed from: g */
    public String m4942g() {
        return this.f8833a.m4893e();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c
    /* renamed from: f */
    public void mo4842f() {
        this.f8833a.m4896a();
        super.mo4842f();
    }
}
