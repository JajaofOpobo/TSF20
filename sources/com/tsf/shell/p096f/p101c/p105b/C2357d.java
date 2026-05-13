package com.tsf.shell.p096f.p101c.p105b;

import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.c.b.d */
/* loaded from: classes.dex */
public class C2357d extends C2570b implements InterfaceC2557f {
    public C2357d() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(6);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        m5257a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
        return false;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: m */
    public int mo3310m() {
        return 1;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: n */
    public InterfaceC2557f mo3495n() {
        return null;
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: a */
    public void mo2137a(final C3231c c3231c) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.c.b.d.1
            @Override // java.lang.Runnable
            public void run() {
                C2357d.this.removeChild(c3231c);
            }
        };
        if (c3231c instanceof C3145b) {
            C3743g.m1618a(c3231c, null, runnable);
        } else {
            C3743g.m1619a(c3231c, runnable);
        }
    }

    /* renamed from: a */
    public boolean mo3520a() {
        return true;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: o */
    public boolean mo3494o() {
        return false;
    }

    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
    }

    /* renamed from: d */
    public void mo3140d(InterfaceC2557f interfaceC2557f) {
    }

    /* renamed from: c */
    public void mo3332c(InterfaceC2557f interfaceC2557f) {
    }

    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return true;
    }

    /* renamed from: e */
    public void mo3139e(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: f */
    public void mo3504f(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: h */
    public boolean mo3500h(InterfaceC2557f interfaceC2557f) {
        return false;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: g */
    public void mo3135g(InterfaceC2557f interfaceC2557f) {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: p */
    public void mo3493p() {
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public InterfaceC2557f mo3517a(int i, int i2) {
        return null;
    }
}
