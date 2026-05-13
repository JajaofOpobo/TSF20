package com.android.volley.toolbox;

import com.android.volley.AbstractC0795l;
import com.android.volley.C0792i;
import com.android.volley.C0802n;
import com.android.volley.C0810t;
import java.io.UnsupportedEncodingException;
/* renamed from: com.android.volley.toolbox.k */
/* loaded from: classes.dex */
public abstract class AbstractC0839k<T> extends AbstractC0795l<T> {

    /* renamed from: a */
    private static final String f2396a = String.format("application/json; charset=%s", "utf-8");

    /* renamed from: b */
    private final C0802n.InterfaceC0804b<T> f2397b;

    /* renamed from: c */
    private final String f2398c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a */
    public abstract C0802n<T> mo6646a(C0792i c0792i);

    public AbstractC0839k(int i, String str, String str2, C0802n.InterfaceC0804b<T> interfaceC0804b, C0802n.InterfaceC0803a interfaceC0803a) {
        super(i, str, interfaceC0803a);
        this.f2397b = interfaceC0804b;
        this.f2398c = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a */
    public void mo7365a(T t) {
        this.f2397b.mo6192a(t);
    }

    @Override // com.android.volley.AbstractC0795l
    /* renamed from: l */
    public String mo10905l() {
        return mo10903p();
    }

    @Override // com.android.volley.AbstractC0795l
    /* renamed from: m */
    public byte[] mo10904m() {
        return mo10902q();
    }

    @Override // com.android.volley.AbstractC0795l
    /* renamed from: p */
    public String mo10903p() {
        return f2396a;
    }

    @Override // com.android.volley.AbstractC0795l
    /* renamed from: q */
    public byte[] mo10902q() {
        try {
            if (this.f2398c == null) {
                return null;
            }
            return this.f2398c.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            C0810t.m10988d("Unsupported Encoding while trying to get the bytes of %s using %s", this.f2398c, "utf-8");
            return null;
        }
    }
}
