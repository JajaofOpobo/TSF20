package com.tsf.shell.p096f.p131f.p144d;

import android.annotation.SuppressLint;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.p096f.p131f.p144d.p145a.C2921a;
import com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.d.a */
/* loaded from: classes.dex */
public class C2920a {

    /* renamed from: a */
    private C2951n f9478a;

    /* renamed from: b */
    private InterfaceC2928b f9479b;

    public C2920a(C2951n c2951n) {
        this.f9478a = c2951n;
        m4305a(new C2921a());
    }

    /* renamed from: a */
    public void m4305a(InterfaceC2928b interfaceC2928b) {
        interfaceC2928b.mo4284a(this.f9478a);
        interfaceC2928b.mo4287a(this);
        interfaceC2928b.mo4289a(this.f9478a.m4017u());
        this.f9479b = interfaceC2928b;
    }

    /* renamed from: a */
    public void m4304a(C2932g c2932g) {
        this.f9479b.mo4286a(c2932g);
    }

    /* renamed from: a */
    public void m4306a(C1017d c1017d, C2932g c2932g) {
        this.f9479b.mo4288a(c1017d, c2932g);
    }

    /* renamed from: a */
    public void m4303a(C2932g c2932g, InterfaceC1012a interfaceC1012a) {
        this.f9479b.mo4285a(c2932g, interfaceC1012a);
    }

    /* renamed from: b */
    public void m4299b(C2932g c2932g, InterfaceC1012a interfaceC1012a) {
        this.f9479b.mo4281b(c2932g, interfaceC1012a);
    }

    /* renamed from: a */
    public void mo4002a() {
    }

    /* renamed from: b */
    public void mo4001b() {
    }

    /* renamed from: c */
    public void mo4000c() {
    }

    /* renamed from: a */
    public void m4302a(C2951n c2951n, int i, ArrayList<C2932g> arrayList, C2932g c2932g, boolean z) {
        mo4002a();
        this.f9479b.mo4290a(i, arrayList, c2932g, z);
    }

    /* renamed from: a */
    public void m4301a(C2951n c2951n, ArrayList<C2932g> arrayList, C2932g c2932g, boolean z) {
        this.f9479b.mo4283a(arrayList, c2932g, z);
    }

    @SuppressLint({"WrongCall"})
    /* renamed from: d */
    public void m4298d() {
        this.f9479b.mo4295a();
    }

    /* renamed from: a */
    public void m4307a(int i, int i2) {
        this.f9479b.mo4291a(i, i2);
    }

    /* renamed from: a */
    public void m4309a(int i) {
        this.f9479b.mo4293a(i);
    }

    /* renamed from: a */
    public void m4310a(float f, float f2, float f3, float f4, boolean z) {
        this.f9479b.mo4294a(f, f2, f3, f4, z);
    }

    /* renamed from: a */
    public int m4308a(int i, float f, float f2, float f3, float f4, boolean z) {
        return this.f9479b.mo4292a(i, f, f2, f3, f4, z);
    }

    /* renamed from: b */
    public float m4300b(int i) {
        return this.f9479b.mo4282b(i);
    }
}
