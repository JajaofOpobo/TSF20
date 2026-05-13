package com.android.volley.toolbox;

import com.android.volley.C0792i;
import com.android.volley.C0794k;
import com.android.volley.C0802n;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.android.volley.toolbox.j */
/* loaded from: classes.dex */
public class C0838j extends AbstractC0839k<JSONObject> {
    public C0838j(int i, String str, JSONObject jSONObject, C0802n.InterfaceC0804b<JSONObject> interfaceC0804b, C0802n.InterfaceC0803a interfaceC0803a) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), interfaceC0804b, interfaceC0803a);
    }

    public C0838j(String str, JSONObject jSONObject, C0802n.InterfaceC0804b<JSONObject> interfaceC0804b, C0802n.InterfaceC0803a interfaceC0803a) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, interfaceC0804b, interfaceC0803a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.AbstractC0839k, com.android.volley.AbstractC0795l
    /* renamed from: a */
    public C0802n<JSONObject> mo6646a(C0792i c0792i) {
        try {
            return C0802n.m11000a(new JSONObject(new String(c0792i.f2281b, C0824e.m10943a(c0792i.f2282c, "utf-8"))), C0824e.m10946a(c0792i));
        } catch (UnsupportedEncodingException e) {
            return C0802n.m11001a(new C0794k(e));
        } catch (JSONException e2) {
            return C0802n.m11001a(new C0794k(e2));
        }
    }
}
