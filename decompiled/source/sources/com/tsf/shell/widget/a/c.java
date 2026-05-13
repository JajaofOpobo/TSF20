package com.tsf.shell.widget.a;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static String c = "shownumber";
    private static String d = "color";
    public boolean a = true;
    public int b = -1;

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.getBoolean(c);
            this.b = jSONObject.getInt(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c, this.a);
            jSONObject.put(d, this.b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
