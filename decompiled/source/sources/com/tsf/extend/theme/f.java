package com.tsf.extend.theme;

import com.google.android.collect.Lists;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f extends k {
    private List<Integer> b = Lists.newArrayList();
    public boolean a = false;

    public List<Integer> b() {
        return this.b;
    }

    @Override // com.tsf.extend.theme.k
    public int a() {
        return 1;
    }

    @Override // com.tsf.extend.theme.k
    public String c() {
        JSONObject jSONObject;
        String c = super.c();
        if (c == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(c);
            } catch (JSONException e) {
                jSONObject = null;
            }
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            jSONObject2.put("isSystemTheme", this.a);
            if (this.b != null && this.b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (Integer num : this.b) {
                    jSONArray.put(num);
                }
                jSONObject2.put("preview", jSONArray);
            }
        } catch (JSONException e2) {
        }
        return jSONObject2.toString();
    }

    @Override // com.tsf.extend.theme.k
    public void a_(String str) {
        super.a_(str);
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.a = jSONObject.optBoolean("isSystemTheme", false);
                JSONArray optJSONArray = jSONObject.optJSONArray("preview");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    if (this.b == null) {
                        this.b = Lists.newArrayList();
                    }
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        this.b.add(Integer.valueOf(optJSONArray.getInt(i)));
                    }
                }
            } catch (JSONException e) {
            }
        }
    }
}
