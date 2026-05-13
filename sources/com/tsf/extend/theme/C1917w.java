package com.tsf.extend.theme;

import android.content.Context;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0802n;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0841m;
import com.tsf.extend.base.p076f.C1406c;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tsf.extend.theme.w */
/* loaded from: classes.dex */
public class C1917w {
    /* renamed from: a */
    public static void m7055a(final C1848k c1848k, Context context) {
        if (c1848k != null) {
            C0841m c0841m = new C0841m(1, "https://cml.ksmobile.com/Theme/favoriteReport", new C0802n.InterfaceC0804b<String>() { // from class: com.tsf.extend.theme.w.1
                @Override // com.android.volley.C0802n.InterfaceC0804b
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6192a(String str) {
                }
            }, null) { // from class: com.tsf.extend.theme.w.2
                @Override // com.android.volley.AbstractC0795l
                /* renamed from: n */
                protected Map<String, String> mo6190n() {
                    HashMap hashMap = new HashMap();
                    hashMap.put("id", c1848k.m7297h() + "");
                    return hashMap;
                }
            };
            c0841m.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
            C1406c.m8766a(context).m11010a((AbstractC0795l) c0841m);
        }
    }
}
