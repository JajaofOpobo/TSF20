package com.android.volley.toolbox;

import com.android.volley.n;
import com.android.volley.t;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public abstract class k<T> extends com.android.volley.l<T> {
    private static final String a = String.format("application/json; charset=%s", "utf-8");
    private final n.b<T> b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public abstract com.android.volley.n<T> a(com.android.volley.i iVar);

    public k(int i, String str, String str2, n.b<T> bVar, n.a aVar) {
        super(i, str, aVar);
        this.b = bVar;
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public void a(T t) {
        this.b.a(t);
    }

    @Override // com.android.volley.l
    public String l() {
        return p();
    }

    @Override // com.android.volley.l
    public byte[] m() {
        return q();
    }

    @Override // com.android.volley.l
    public String p() {
        return a;
    }

    @Override // com.android.volley.l
    public byte[] q() {
        try {
            if (this.c == null) {
                return null;
            }
            return this.c.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            t.d("Unsupported Encoding while trying to get the bytes of %s using %s", this.c, "utf-8");
            return null;
        }
    }
}
