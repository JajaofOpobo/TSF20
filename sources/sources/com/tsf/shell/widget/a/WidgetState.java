package com.tsf.shell.widget.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetState {
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
            WidgetContainer.printStackTrace();
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c, this.a);
            jSONObject.put(d, this.b);
        } catch (Exception e) {
            WidgetContainer.printStackTrace();
        }
        return jSONObject.toString();
    }
}
