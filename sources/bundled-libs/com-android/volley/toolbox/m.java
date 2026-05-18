package com.android.volley.toolbox;

import com.android.volley.n;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class m extends com.android.volley.l<String> {
    private final n.b<String> a;

    public m(int i, String str, n.b<String> bVar, n.a aVar) {
        super(i, str, aVar);
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        this.a.a(str);
    }

    @Override // com.android.volley.l
    protected com.android.volley.n<String> a(com.android.volley.i iVar) {
        String str;
        try {
            str = new String(iVar.b, e.a(iVar.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(iVar.b);
        }
        return com.android.volley.n.a(str, e.a(iVar));
    }
}
