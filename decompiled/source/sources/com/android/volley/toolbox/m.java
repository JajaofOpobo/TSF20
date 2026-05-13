package com.android.volley.toolbox;

import com.android.volley.n;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public class m extends com.android.volley.l<String> {
    private final n.b<String> a;

    public m(int i, String str, n.b<String> bVar, n.a aVar) {
        super(i, str, aVar);
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    /* renamed from: c */
    public void a(String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public com.android.volley.n<String> a(com.android.volley.i iVar) {
        String str;
        try {
            str = new String(iVar.b, e.a(iVar.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(iVar.b);
        }
        return com.android.volley.n.a(str, e.a(iVar));
    }
}
