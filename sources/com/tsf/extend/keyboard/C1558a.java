package com.tsf.extend.keyboard;

import android.text.TextUtils;
import com.android.volley.C0809s;
import com.google.android.collect.Lists;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.p072a.C1369a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1427f;
import com.tsf.extend.base.p080j.C1455z;
import java.util.ArrayList;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.keyboard.a */
/* loaded from: classes.dex */
public class C1558a extends AbstractC1386a {

    /* renamed from: b */
    private static C1558a f4927b = new C1558a();

    /* renamed from: c */
    private String f4928c;

    /* renamed from: d */
    private String f4929d;

    /* renamed from: e */
    private String f4930e;

    /* renamed from: f */
    private C1368a f4931f = null;

    private C1558a() {
        this.f4928c = "";
        this.f4929d = "";
        this.f4930e = "";
        m8809a(C1547h.m8290b().getApplicationContext());
        this.f4928c = C1423d.m8685b(C1547h.m8290b().getApplicationContext());
        this.f4928c = this.f4928c == null ? "" : this.f4928c;
        this.f4929d = C1423d.m8681d();
        this.f4930e = C1423d.m8688b();
    }

    /* renamed from: h */
    public static C1558a m8241h() {
        return f4927b;
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    protected String mo6221a() {
        return "KEYBOARD_IMAGE_REQEUST";
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    protected C1368a mo6209a(String str, String str2, JSONObject jSONObject) {
        return (TextUtils.isEmpty(str) || !str.equals("DATA_RECOMMEND_KEYBOARD_THEME")) ? m8248a(jSONObject) : m8244b(jSONObject);
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    public void mo6217a(C0809s c0809s) {
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: b */
    public C1368a mo6206b() {
        return null;
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    public void mo8250a(String str, AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, JSONObject jSONObject) {
        super.mo8250a(str, interfaceC1396a, enumC1397b, jSONObject);
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    public String mo6210a(String str, AbstractC1386a.EnumC1397b enumC1397b, int i, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && str.equals("DATA_RECOMMEND_KEYBOARD_THEME")) {
            return "https://api-keyboard.cmcm.com/cmltabpromote";
        }
        return String.format("https://api-keyboard.cmcm.com/theme/hdpromote?aid=%s&mcc=%s&appv=%s&offset=%s&count=%s", this.f4930e, this.f4928c, this.f4929d, "" + m8249a(str, enumC1397b), "20");
    }

    /* renamed from: a */
    private int m8249a(String str, AbstractC1386a.EnumC1397b enumC1397b) {
        if (enumC1397b == AbstractC1386a.EnumC1397b.Refresh) {
            return 0;
        }
        C1368a c1368a = this.f4330a.get(str);
        if (c1368a == null) {
            return -1;
        }
        return c1368a.m8857j();
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: f */
    public void mo6200f() {
        super.mo6200f();
        f4927b = null;
    }

    /* renamed from: b */
    public static boolean m8245b(String str) {
        return "Keyboard".equals(str) || "DATA_KEYBOARD_RECOMMEND_CACHE".equals(str);
    }

    /* renamed from: a */
    private C1562a m8248a(JSONObject jSONObject) {
        C1562a c1562a = new C1562a();
        if (jSONObject == null) {
            return null;
        }
        try {
            c1562a.m8864c(m8247a(jSONObject, "stime"));
            c1562a.m8862d(m8247a(jSONObject, "msg"));
            if (jSONObject.has("pagination")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pagination");
                c1562a.m8874a(m8243b(jSONObject2, "offset"));
                c1562a.m8863d(m8243b(jSONObject2, "offset"));
                c1562a.mo6378c(m8243b(jSONObject2, "total"));
                c1562a.m8867b(m8243b(jSONObject2, "count"));
                c1562a.m8869a(m8243b(jSONObject2, "hasMore") != 0);
            }
            if (jSONObject.has("data")) {
                ArrayList newArrayList = Lists.newArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        newArrayList.add(m8242c(optJSONArray.getJSONObject(i)));
                    }
                }
                c1562a.m8870a(newArrayList);
                return c1562a;
            }
            return c1562a;
        } catch (JSONException e) {
            e.printStackTrace();
            return c1562a;
        }
    }

    /* renamed from: b */
    private C1562a m8244b(JSONObject jSONObject) {
        C1562a c1562a = new C1562a();
        if (jSONObject == null) {
            return null;
        }
        try {
            c1562a.m8864c(m8247a(jSONObject, "stime"));
            c1562a.m8862d(m8247a(jSONObject, "msg"));
            if (jSONObject.has("data")) {
                ArrayList newArrayList = Lists.newArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                JSONObject jSONObject2 = optJSONArray.getJSONObject(0);
                C1563b c1563b = new C1563b();
                c1563b.m8239a(jSONObject2.optLong("id"));
                String optString = jSONObject2.optString("package_name");
                c1563b.m8236b(optString);
                c1563b.m8234c(jSONObject2.optString("url"));
                int optInt = jSONObject2.optInt("show_mode");
                JSONObject jSONObject3 = optJSONArray.getJSONObject(1);
                C1563b c1563b2 = new C1563b();
                c1563b2.m8239a(jSONObject3.optLong("id"));
                String optString2 = jSONObject3.optString("package_name");
                c1563b2.m8236b(optString2);
                c1563b2.m8234c(jSONObject3.optString("url"));
                if (optInt == 1) {
                    newArrayList.add(c1563b);
                    newArrayList.add(c1563b2);
                } else {
                    newArrayList.add(c1563b2);
                    newArrayList.add(c1563b);
                }
                if (C1427f.m8664a(C1547h.m8290b().getApplicationContext(), optString)) {
                    newArrayList.remove(c1563b);
                }
                if (C1427f.m8664a(C1547h.m8290b().getApplicationContext(), optString2)) {
                    newArrayList.remove(c1563b2);
                }
                c1562a.m8870a(newArrayList);
                return c1562a;
            }
            return c1562a;
        } catch (JSONException e) {
            e.printStackTrace();
            return c1562a;
        }
    }

    /* renamed from: c */
    private C1563b m8242c(JSONObject jSONObject) {
        C1563b c1563b = new C1563b();
        c1563b.m8239a(jSONObject.optLong("id"));
        c1563b.m8236b(jSONObject.optString("package_name"));
        c1563b.m8238a(jSONObject.optString("title"));
        c1563b.m8234c(jSONObject.optString("cover_url"));
        c1563b.m8232d(jSONObject.optString("download_url"));
        return c1563b;
    }

    /* renamed from: a */
    public void m8251a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, JSONObject jSONObject) {
        mo8250a("Keyboard", interfaceC1396a, enumC1397b, jSONObject);
    }

    /* renamed from: a */
    private String m8247a(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!jSONObject.has(str)) {
            return "";
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private int m8243b(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str) || !jSONObject.has(str)) {
            return 0;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: com.tsf.extend.keyboard.a$a */
    /* loaded from: classes.dex */
    public static class C1562a extends C1368a<C1563b> {
        @Override // com.tsf.extend.base.p071b.C1368a
        /* renamed from: h */
        public boolean mo6375h() {
            return m8868b();
        }
    }

    /* renamed from: a */
    public void m8252a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b) {
        m8799a("DATA_RECOMMEND_KEYBOARD_THEME", interfaceC1396a, enumC1397b, new JSONObject(), false);
    }

    /* renamed from: a */
    public void m8253a(final AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.keyboard.a.1
            @Override // java.lang.Runnable
            public void run() {
                final C1368a c1368a;
                Object m8853a = C1369a.m8855a().m8853a("DATA_KEYBOARD_RECOMMEND_CACHE");
                if (m8853a instanceof C1368a) {
                    c1368a = (C1368a) m8853a;
                } else {
                    c1368a = m8853a instanceof C1562a ? (C1562a) m8853a : null;
                }
                if (c1368a != null) {
                    Calendar calendar = Calendar.getInstance();
                    if (c1368a.m8856k() != calendar.get(5) + ((calendar.get(2) + 1) * 100)) {
                        C1369a.m8855a().m8848b("DATA_KEYBOARD_RECOMMEND_CACHE");
                        c1368a = null;
                    }
                }
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.keyboard.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC1396a.mo6245a(null, c1368a);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m8254a(final C1368a c1368a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.keyboard.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (C1369a.m8855a().m8853a("DATA_KEYBOARD_RECOMMEND_CACHE") != null) {
                    C1369a.m8855a().m8848b("DATA_KEYBOARD_RECOMMEND_CACHE");
                }
                C1369a.m8855a().m8852a("DATA_KEYBOARD_RECOMMEND_CACHE", c1368a);
            }
        });
    }

    /* renamed from: b */
    public void m8246b(C1368a c1368a) {
        this.f4931f = c1368a;
    }
}
