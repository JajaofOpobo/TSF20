package com.tsf.extend.theme;

import android.content.Context;
import com.android.volley.n;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class w {
    public static void a(final k kVar, Context context) {
        if (kVar != null) {
            com.android.volley.toolbox.m mVar = new com.android.volley.toolbox.m(1, "https://cml.ksmobile.com/Theme/favoriteReport", new n.b<String>() { // from class: com.tsf.extend.theme.w.1
                @Override // com.android.volley.n.b
                public void a(String str) {
                }
            }, null) { // from class: com.tsf.extend.theme.w.2
                @Override // com.android.volley.l
                protected Map<String, String> n() {
                    HashMap hashMap = new HashMap();
                    hashMap.put("id", kVar.h() + "");
                    return hashMap;
                }
            };
            mVar.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
            com.tsf.extend.base.f.c.a(context).a((com.android.volley.l) mVar);
        }
    }
}
