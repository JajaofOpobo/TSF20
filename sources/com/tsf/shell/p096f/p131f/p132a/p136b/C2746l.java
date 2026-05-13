package com.tsf.shell.p096f.p131f.p132a.p136b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p131f.AbstractC2912c;
import com.tsf.shell.p096f.p131f.C2931f;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.a.b.l */
/* loaded from: classes.dex */
public class C2746l extends AbstractC2912c<AbstractC2745k> {
    public C2746l() {
        ArrayList<C2931f> arrayList = new ArrayList<>();
        arrayList.add(new C2736c(10, false));
        arrayList.add(new C2735b(20, false));
        arrayList.add(new C2744j(30, false));
        arrayList.add(new C2737d(40, true));
        arrayList.add(new C2738e(50, true));
        arrayList.add(new C2734a(60, true));
        arrayList.add(new C2739f(70, true));
        arrayList.add(new C2741h(80, true));
        arrayList.add(new C2743i(90, true));
        arrayList.add(new C2740g(100, true));
        m4349a(arrayList);
    }

    /* renamed from: a */
    public void m4801a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        int i5 = m4342i();
        for (int i6 = 0; i6 < i5; i6++) {
            m4351a(i6).mo4796a(i, i2, i3, i4, arrayList);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: f */
    public void mo4273f() {
        super.mo4273f();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo4279a(AbstractC2745k abstractC2745k) {
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a */
    public void mo4278a(boolean z, String str) {
        C3430e.m2451j(z);
        C3430e.m2460h(str);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: b */
    public boolean mo4277b() {
        return C3430e.m2565G();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: c */
    public String mo4274c() {
        return C3430e.m2564H();
    }
}
