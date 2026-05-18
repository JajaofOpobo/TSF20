package com.android.volley.toolbox;

import com.android.volley.n;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends k<JSONObject> {
    public j(int i, String str, JSONObject jSONObject, n.b<JSONObject> bVar, n.a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    public j(String str, JSONObject jSONObject, n.b<JSONObject> bVar, n.a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.k, com.android.volley.l
    protected com.android.volley.n<JSONObject> a(com.android.volley.i iVar) {
        try {
            return com.android.volley.n.a(new JSONObject(new String(iVar.b, e.a(iVar.c, "utf-8"))), e.a(iVar));
        } catch (UnsupportedEncodingException e) {
            return com.android.volley.n.a(new com.android.volley.k(e));
        } catch (JSONException e2) {
            return com.android.volley.n.a(new com.android.volley.k(e2));
        }
    }
}
