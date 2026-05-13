package com.android.volley.toolbox;

import com.android.volley.AbstractC0795l;
import com.android.volley.C0792i;
import com.android.volley.C0802n;
import java.io.UnsupportedEncodingException;
/* renamed from: com.android.volley.toolbox.m */
/* loaded from: classes.dex */
public class C0841m extends AbstractC0795l<String> {

    /* renamed from: a */
    private final C0802n.InterfaceC0804b<String> f2400a;

    public C0841m(int i, String str, C0802n.InterfaceC0804b<String> interfaceC0804b, C0802n.InterfaceC0803a interfaceC0803a) {
        super(i, str, interfaceC0803a);
        this.f2400a = interfaceC0804b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: c */
    public void mo7365a(String str) {
        this.f2400a.mo6192a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a */
    public C0802n<String> mo6646a(C0792i c0792i) {
        String str;
        try {
            str = new String(c0792i.f2281b, C0824e.m10944a(c0792i.f2282c));
        } catch (UnsupportedEncodingException e) {
            str = new String(c0792i.f2281b);
        }
        return C0802n.m11000a(str, C0824e.m10946a(c0792i));
    }
}
