package com.tsf.shell.p096f.p118e.p126f;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p153i.C3231c;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.f.b */
/* loaded from: classes.dex */
public class C2570b extends C0980j {

    /* renamed from: a */
    private InterfaceC2571a f8507a;

    /* renamed from: b */
    private ArrayList<Integer> f8508b;

    /* renamed from: c */
    private ArrayList<Integer> f8509c;

    /* renamed from: d */
    private boolean f8510d = false;

    /* renamed from: com.tsf.shell.f.e.f.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2571a {
    }

    /* renamed from: q */
    public float mo3246q() {
        return 0.0f;
    }

    /* renamed from: a */
    public void m5257a(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        this.f8508b = arrayList;
        this.f8509c = arrayList2;
    }

    /* renamed from: r */
    public ArrayList<Integer> m5255r() {
        return this.f8508b;
    }

    /* renamed from: s */
    public ArrayList<Integer> m5254s() {
        return this.f8509c;
    }

    /* renamed from: a */
    public void m5258a(InterfaceC2571a interfaceC2571a) {
        this.f8507a = interfaceC2571a;
    }

    /* renamed from: b */
    public void m5256b(InterfaceC2571a interfaceC2571a) {
        if (interfaceC2571a == this.f8507a) {
            this.f8507a = null;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        super.dispatchDraw();
    }

    /* renamed from: a */
    public void mo2137a(C3231c c3231c) {
    }

    /* renamed from: t */
    public void m5253t() {
        this.f8510d = true;
    }

    /* renamed from: u */
    public void m5252u() {
        this.f8510d = false;
    }

    /* renamed from: v */
    public boolean m5251v() {
        return this.f8510d;
    }

    /* renamed from: d */
    public C0975i mo2131d() {
        return null;
    }
}
