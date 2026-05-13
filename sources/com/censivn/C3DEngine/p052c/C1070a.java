package com.censivn.C3DEngine.p052c;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p052c.p053a.C1075c;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.c.a */
/* loaded from: classes.dex */
public class C1070a {

    /* renamed from: a */
    C1075c f3348a = new C1075c();

    /* renamed from: b */
    ArrayList<InterfaceC1078b> f3349b;

    public C1070a(C0975i c0975i) {
        this.f3348a.m9945a(c0975i);
        this.f3348a.m9941c();
        this.f3349b = new ArrayList<>();
    }

    /* renamed from: a */
    public void m9975a(C0975i c0975i) {
        this.f3348a.m9942b(c0975i);
        this.f3348a.m9941c();
    }

    /* renamed from: a */
    public void m9974a(InterfaceC1078b interfaceC1078b) {
        interfaceC1078b.mo9908a(this.f3348a);
        this.f3349b.add(interfaceC1078b);
    }

    /* renamed from: a */
    public void m9976a() {
        this.f3348a.m9940d();
        int size = this.f3349b.size();
        for (int i = 0; i < size; i++) {
            this.f3349b.get(i).mo9901a();
        }
        this.f3348a.m9933k();
    }

    /* renamed from: b */
    public void m9973b() {
        m9976a();
        this.f3348a.m9939e();
        this.f3349b = new ArrayList<>();
    }

    /* renamed from: c */
    public void m9972c() {
        this.f3349b = new ArrayList<>();
    }
}
