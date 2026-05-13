package com.tsf.shell.widget.cubeclock.provider;

import com.censivn.C3DEngine.api.core.VWidgetContainer;
import org.json.JSONObject;
/* renamed from: com.tsf.shell.widget.cubeclock.provider.a */
/* loaded from: classes.dex */
public class C4399a {

    /* renamed from: a */
    public int f14279a = -13421773;

    /* renamed from: b */
    public int f14280b = 0;

    /* renamed from: c */
    private VWidgetContainer f14281c;

    public C4399a(VWidgetContainer vWidgetContainer) {
        this.f14281c = vWidgetContainer;
    }

    /* renamed from: a */
    public void m37a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14280b = jSONObject.getInt("mode");
            this.f14279a = jSONObject.getInt("color");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String m38a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mode", this.f14280b);
            jSONObject.put("color", this.f14279a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public void m36b() {
        this.f14281c.getLauncherInfo().onUpdateConfig(m38a());
    }
}
