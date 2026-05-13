package com.tsf.extend.theme;

import com.google.android.collect.Lists;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.f */
/* loaded from: classes.dex */
public class C1842f extends C1848k {

    /* renamed from: b */
    private List<Integer> f5903b = Lists.newArrayList();

    /* renamed from: a */
    public boolean f5902a = false;

    /* renamed from: b */
    public List<Integer> m7349b() {
        return this.f5903b;
    }

    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: a */
    public int mo7323a() {
        return 1;
    }

    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: c */
    public String mo7313c() {
        JSONObject jSONObject;
        String mo7313c = super.mo7313c();
        if (mo7313c == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(mo7313c);
            } catch (JSONException e) {
                jSONObject = null;
            }
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            jSONObject2.put("isSystemTheme", this.f5902a);
            if (this.f5903b != null && this.f5903b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (Integer num : this.f5903b) {
                    jSONArray.put(num);
                }
                jSONObject2.put("preview", jSONArray);
            }
        } catch (JSONException e2) {
        }
        return jSONObject2.toString();
    }

    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: a_ */
    public void mo7317a_(String str) {
        super.mo7317a_(str);
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f5902a = jSONObject.optBoolean("isSystemTheme", false);
                JSONArray optJSONArray = jSONObject.optJSONArray("preview");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    if (this.f5903b == null) {
                        this.f5903b = Lists.newArrayList();
                    }
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        this.f5903b.add(Integer.valueOf(optJSONArray.getInt(i)));
                    }
                }
            } catch (JSONException e) {
            }
        }
    }
}
