package com.tsf.extend.base.p076f;

import android.graphics.Bitmap;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0792i;
import com.android.volley.C0802n;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0837i;
/* renamed from: com.tsf.extend.base.f.a */
/* loaded from: classes.dex */
public class C1401a extends C0837i {

    /* renamed from: a */
    private boolean f4369a;

    /* renamed from: b */
    private AbstractC0795l.EnumC0797a f4370b;

    public C1401a(String str, C0802n.InterfaceC0804b<Bitmap> interfaceC0804b, int i, int i2, Bitmap.Config config, C0802n.InterfaceC0803a interfaceC0803a) {
        super(str, interfaceC0804b, i, i2, config, interfaceC0803a);
        this.f4369a = true;
        this.f4370b = AbstractC0795l.EnumC0797a.LOW;
        m11034a((InterfaceC0806p) new C0785d(30000, 2, 2.0f));
    }

    /* renamed from: a */
    public void m8769a(AbstractC0795l.EnumC0797a enumC0797a) {
        this.f4370b = enumC0797a;
    }

    @Override // com.android.volley.toolbox.C0837i, com.android.volley.AbstractC0795l
    /* renamed from: s */
    public AbstractC0795l.EnumC0797a mo6643s() {
        return this.f4370b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.C0837i, com.android.volley.AbstractC0795l
    /* renamed from: a */
    public C0802n<Bitmap> mo6646a(C0792i c0792i) {
        C0802n<Bitmap> mo6646a = super.mo6646a(c0792i);
        if (this.f4369a && mo6646a != null && mo6646a.f2321b != null) {
            mo6646a.f2321b.f2254e = Long.MAX_VALUE;
            mo6646a.f2321b.f2255f = Long.MAX_VALUE;
        }
        return mo6646a;
    }
}
