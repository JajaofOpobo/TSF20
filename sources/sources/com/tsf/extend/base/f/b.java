package com.tsf.extend.base.f;

import com.android.volley.n;
import com.android.volley.s;
import com.android.volley.toolbox.j;
import com.tsf.extend.base.d.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {

    public interface a<K> {
        K b(JSONObject jSONObject);
    }

    public static <T> j a(String str, JSONObject jSONObject, final a.InterfaceC0048a<T> interfaceC0048a, final a<T> aVar) {
        return new j(str, jSONObject, new n.b<JSONObject>() { // from class: com.tsf.extend.base.f.b.1
            @Override // com.android.volley.n.b
            public void a(JSONObject jSONObject2) {
                try {
                    Object objB = aVar.b(jSONObject2);
                    if (objB == null) {
                        interfaceC0048a.a(null, 2, null);
                    } else {
                        interfaceC0048a.a(null, objB);
                    }
                } catch (Exception e) {
                    interfaceC0048a.a(null, 2, null);
                }
            }
        }, new n.a() { // from class: com.tsf.extend.base.f.b.2
            @Override // com.android.volley.n.a
            public void a(s sVar) {
                interfaceC0048a.a(null, 0, null);
            }
        });
    }
}
