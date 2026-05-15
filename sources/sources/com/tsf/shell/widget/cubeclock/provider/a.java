package com.tsf.shell.widget.cubeclock.provider;

import com.censivn.C3DEngine.api.core.VWidgetContainer;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public int a = -13421773;
    public int b = 0;
    private VWidgetContainer c;

    public a(VWidgetContainer vWidgetContainer) {
        this.c = vWidgetContainer;
    }

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b = jSONObject.getInt("mode");
            this.a = jSONObject.getInt("color");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mode", this.b);
            jSONObject.put("color", this.a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void b() {
        this.c.getLauncherInfo().onUpdateConfig(a());
    }
}
