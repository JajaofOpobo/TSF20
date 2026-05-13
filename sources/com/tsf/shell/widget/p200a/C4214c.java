package com.tsf.shell.widget.p200a;

import org.json.JSONObject;
/* renamed from: com.tsf.shell.widget.a.c */
/* loaded from: classes.dex */
public class C4214c {

    /* renamed from: c */
    private static String f13618c = "shownumber";

    /* renamed from: d */
    private static String f13619d = "color";

    /* renamed from: a */
    public boolean f13620a = true;

    /* renamed from: b */
    public int f13621b = -1;

    /* renamed from: a */
    public void m516a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13620a = jSONObject.getBoolean(f13618c);
            this.f13621b = jSONObject.getInt(f13619d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String m517a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f13618c, this.f13620a);
            jSONObject.put(f13619d, this.f13621b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
