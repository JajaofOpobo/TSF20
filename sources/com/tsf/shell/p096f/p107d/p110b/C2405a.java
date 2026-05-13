package com.tsf.shell.p096f.p107d.p110b;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2410c;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2411d;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2413e;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2414f;
import com.tsf.shell.p096f.p131f.AbstractC2912c;
import com.tsf.shell.p096f.p131f.C2931f;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.d.b.a */
/* loaded from: classes.dex */
public class C2405a extends AbstractC2912c<C2411d> {

    /* renamed from: a */
    private ArrayList<AbstractC3208b> f7953a = new ArrayList<>();

    public C2405a() {
        ArrayList<C2931f> arrayList = new ArrayList<>();
        arrayList.add(new C2410c(0, false));
        arrayList.add(new C2414f(50, -13421773, false));
        arrayList.add(new C2414f(10, -49152, false));
        arrayList.add(new C2414f(45, -16749095, true));
        arrayList.add(new C2414f(40, -16742990, true));
        arrayList.add(new C2414f(30, -8015360, true));
        arrayList.add(new C2414f(20, -16640, true));
        arrayList.add(new C2414f(60, -1118482, true));
        arrayList.add(new C2413e(250, -13421773, true));
        arrayList.add(new C2413e(VEasing.Back.easeIn, -49152, true));
        arrayList.add(new C2413e(45, -16749095, true));
        arrayList.add(new C2413e(230, -16742990, true));
        arrayList.add(new C2413e(220, -8015360, true));
        arrayList.add(new C2413e(20, -16640, true));
        arrayList.add(new C2413e(260, -1118482, true));
        m4349a(arrayList);
    }

    /* renamed from: a */
    public void m5631a() {
    }

    /* renamed from: a */
    public void m5629a(AbstractC3208b abstractC3208b) {
        if (!this.f7953a.contains(abstractC3208b)) {
            this.f7953a.add(abstractC3208b);
        }
    }

    /* renamed from: b */
    public void m5628b(AbstractC3208b abstractC3208b) {
        this.f7953a.remove(abstractC3208b);
        if (this.f7953a.isEmpty()) {
            m4343h().mo5612a();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo4279a(C2411d c2411d) {
        Iterator<AbstractC3208b> it = this.f7953a.iterator();
        while (it.hasNext()) {
            it.next().m3137f(0.0f);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a */
    public void mo4278a(boolean z, String str) {
        C3430e.m2468f(str);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: b */
    public boolean mo4277b() {
        return false;
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: c */
    public String mo4274c() {
        return C3430e.m2568D();
    }

    /* renamed from: d */
    public void m5627d() {
        m4343h().mo5609b();
    }

    /* renamed from: e */
    public void m5626e() {
        m4343h().mo5607c();
    }
}
