package com.tsf.shell.p096f.p153i.p161c;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.utils.C4175k;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.c.g */
/* loaded from: classes.dex */
public class C3343g extends AbstractC3341e {

    /* renamed from: b */
    public String f11053b;

    /* renamed from: d */
    public int f11055d;

    /* renamed from: e */
    public boolean f11056e;

    /* renamed from: g */
    public int f11058g;

    /* renamed from: k */
    private boolean f11062k = false;

    /* renamed from: a */
    public String f11052a = "";

    /* renamed from: c */
    public String f11054c = "";

    /* renamed from: f */
    public boolean f11057f = false;

    /* renamed from: h */
    public int f11059h = 6;

    /* renamed from: i */
    public int f11060i = 0;

    /* renamed from: j */
    public boolean f11061j = true;

    /* renamed from: m */
    private boolean f11064m = true;

    /* renamed from: l */
    private ArrayList<C3112b> f11063l = new ArrayList<>();

    /* renamed from: j */
    public boolean m2789j() {
        return this.f11062k;
    }

    /* renamed from: b */
    public void m2796b(boolean z) {
        this.f11062k = z;
        if (!this.f11062k) {
            ArrayList arrayList = (ArrayList) this.f11063l.clone();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3359a.f11095i.m1647a((C3112b) it.next());
            }
            this.f11063l.clear();
            arrayList.clear();
        }
    }

    /* renamed from: k */
    public void m2788k() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.i.c.g.1
            @Override // java.lang.Runnable
            public void run() {
                C4175k.m671a(Home.f7122c, C3343g.this.f11052a);
            }
        });
    }

    /* renamed from: l */
    public void m2787l() {
    }

    /* renamed from: a */
    public void m2799a(C3112b c3112b) {
        this.f11063l.add(c3112b);
    }

    /* renamed from: b */
    public void m2797b(C3112b c3112b) {
        this.f11063l.remove(c3112b);
    }

    /* renamed from: m */
    public void m2786m() {
        this.f11063l.clear();
    }

    /* renamed from: n */
    public boolean m2785n() {
        return this.f11063l.size() <= 0 || !this.f11057f;
    }

    /* renamed from: o */
    public ArrayList<C3112b> m2784o() {
        return this.f11063l;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: a */
    public void mo1625a() {
        super.mo1625a();
        ArrayList arrayList = (ArrayList) this.f11063l.clone();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3359a.f11095i.m1647a((C3112b) it.next());
        }
        this.f11063l.clear();
        arrayList.clear();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: a */
    public C0975i mo1624a(int i, int i2, boolean z) {
        C0975i mo2798a = mo2798a(z);
        if (mo2798a == null) {
            return null;
        }
        return mo2798a;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: b */
    public void mo1623b() {
    }

    /* renamed from: a */
    public C0975i mo2798a(boolean z) {
        return null;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: g */
    public void mo2791g() {
        if (!this.f11064m) {
            this.f11064m = true;
            mo2795c();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: h */
    public void mo2790h() {
        if (this.f11064m) {
            this.f11064m = false;
            mo2794d();
        }
    }

    /* renamed from: c */
    public void mo2795c() {
    }

    /* renamed from: d */
    public void mo2794d() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: e */
    public void mo2793e() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: f */
    public void mo2792f() {
    }
}
