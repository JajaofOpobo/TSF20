package com.tsf.shell.p096f.p107d.p112c;

import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2417a;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2420b;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2426d;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2428e;
import com.tsf.shell.p096f.p118e.p126f.C2558a;
import com.tsf.shell.p096f.p131f.AbstractC2912c;
import com.tsf.shell.p096f.p131f.C2931f;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.c.a */
/* loaded from: classes.dex */
public class C2416a extends AbstractC2912c<C2426d> {

    /* renamed from: a */
    private C2558a f7978a;

    public C2416a() {
        ArrayList<C2931f> arrayList = new ArrayList<>();
        this.f7978a = new C2558a();
        arrayList.add(new C2428e(0, true, false));
        arrayList.add(new C2428e(1, false, false));
        arrayList.add(new C2417a(10, true, true));
        arrayList.add(new C2417a(11, false, true));
        arrayList.add(new C2420b(20, true, true));
        arrayList.add(new C2420b(21, false, true));
        m4349a(arrayList);
    }

    /* renamed from: a */
    public void m5606a() {
    }

    /* renamed from: d */
    public C2558a m5604d() {
        return this.f7978a;
    }

    /* renamed from: e */
    public boolean m5603e() {
        if (this.f7978a == null) {
            return false;
        }
        return this.f7978a.m5306a();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo4279a(C2426d c2426d) {
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a */
    public void mo4278a(boolean z, String str) {
        C3430e.m2459h(z);
        C3430e.m2473e(str);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: b */
    public boolean mo4277b() {
        return C3430e.m2570B();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: c */
    public String mo4274c() {
        return C3430e.m2569C();
    }
}
