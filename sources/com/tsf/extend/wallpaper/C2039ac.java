package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0792i;
import com.android.volley.C0793j;
import com.android.volley.C0794k;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0824e;
import com.android.volley.toolbox.C0837i;
import com.tsf.extend.wallpaper.C2094m;
/* renamed from: com.tsf.extend.wallpaper.ac */
/* loaded from: classes.dex */
public class C2039ac extends C0837i {

    /* renamed from: a */
    private static final String f6615a = C2039ac.class.getSimpleName();

    /* renamed from: b */
    private boolean f6616b;

    /* renamed from: c */
    private boolean f6617c;

    /* renamed from: d */
    private long f6618d;

    /* renamed from: e */
    private long f6619e;

    /* renamed from: f */
    private C2094m.C2095a f6620f;

    public C2039ac(boolean z, C2094m.C2095a c2095a, C0802n.InterfaceC0804b<Bitmap> interfaceC0804b, int i, int i2, Bitmap.Config config, C0802n.InterfaceC0803a interfaceC0803a, boolean z2) {
        super(c2095a.f6861a, interfaceC0804b, i, i2, config, interfaceC0803a);
        m11034a((InterfaceC0806p) new C0785d(30000, 2, 2.0f));
        this.f6616b = z2;
        this.f6620f = c2095a;
        this.f6617c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.C0837i, com.android.volley.AbstractC0795l
    /* renamed from: a */
    public C0802n<Bitmap> mo6646a(C0792i c0792i) {
        C0802n<Bitmap> mo6646a;
        try {
            if (this.f6616b) {
                mo6646a = C0802n.m11000a(null, C0824e.m10946a(c0792i));
            } else {
                mo6646a = super.mo6646a(c0792i);
            }
            if (mo6646a != null && mo6646a.f2321b != null) {
                mo6646a.f2321b.f2254e = Long.MAX_VALUE;
                mo6646a.f2321b.f2255f = Long.MAX_VALUE;
                return mo6646a;
            }
            return mo6646a;
        } catch (Exception e) {
            return C0802n.m11001a(new C0794k(c0792i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a */
    public C0809s mo6645a(C0809s c0809s) {
        if (!(c0809s instanceof C0793j) && c0809s.f2324a != null) {
            int i = c0809s.f2324a.f2280a;
        }
        return super.mo6645a(c0809s);
    }

    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a */
    public void mo6644a(String str) {
        super.mo6644a(str);
        if (!"cache-hit-parsed".equals(str)) {
            if ("network-queue-take".equals(str)) {
                this.f6618d = System.currentTimeMillis();
            } else if ("network-parse-complete".equals(str) && this.f6617c) {
                this.f6618d = System.currentTimeMillis() - this.f6618d;
            }
        }
    }

    @Override // com.android.volley.toolbox.C0837i, com.android.volley.AbstractC0795l
    /* renamed from: s */
    public AbstractC0795l.EnumC0797a mo6643s() {
        return this.f6617c ? AbstractC0795l.EnumC0797a.HIGH : super.mo6643s();
    }

    /* renamed from: a */
    public void m6647a(long j) {
        this.f6619e = j;
    }

    /* renamed from: x */
    public long m6642x() {
        return this.f6619e;
    }
}
