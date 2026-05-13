package com.tsf.extend.base.p076f;

import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.toolbox.C0838j;
import com.tsf.extend.base.p074d.AbstractC1386a;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.base.f.b */
/* loaded from: classes.dex */
public class C1402b {

    /* renamed from: com.tsf.extend.base.f.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1405a<K> {
        /* renamed from: b */
        K mo7058b(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static <T> C0838j m8768a(String str, JSONObject jSONObject, final AbstractC1386a.InterfaceC1396a<T> interfaceC1396a, final InterfaceC1405a<T> interfaceC1405a) {
        return new C0838j(str, jSONObject, new C0802n.InterfaceC0804b<JSONObject>() { // from class: com.tsf.extend.base.f.b.1
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(JSONObject jSONObject2) {
                try {
                    Object mo7058b = InterfaceC1405a.this.mo7058b(jSONObject2);
                    if (mo7058b == null) {
                        interfaceC1396a.mo6247a(null, 2, null);
                    } else {
                        interfaceC1396a.mo6245a(null, mo7058b);
                    }
                } catch (Exception e) {
                    interfaceC1396a.mo6247a(null, 2, null);
                }
            }
        }, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.base.f.b.2
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                AbstractC1386a.InterfaceC1396a.this.mo6247a(null, 0, null);
            }
        });
    }
}
