package com.tsf.extend.keyboard;

import android.text.TextUtils;
import com.android.volley.s;
import com.google.android.collect.Lists;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.j.d;
import com.tsf.extend.base.j.f;
import com.tsf.extend.base.j.z;
import com.tsf.extend.h;
import java.util.ArrayList;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.tsf.extend.base.d.a {
    private static a b = new a();
    private String c;
    private String d;
    private String e;
    private com.tsf.extend.base.b.a f = null;

    private a() {
        this.c = "";
        this.d = "";
        this.e = "";
        a(h.b().getApplicationContext());
        this.c = d.b(h.b().getApplicationContext());
        this.c = this.c == null ? "" : this.c;
        this.d = d.d();
        this.e = d.b();
    }

    public static a h() {
        return b;
    }

    @Override // com.tsf.extend.base.d.a
    protected String a() {
        return "KEYBOARD_IMAGE_REQEUST";
    }

    @Override // com.tsf.extend.base.d.a
    protected com.tsf.extend.base.b.a a(String str, String str2, JSONObject jSONObject) {
        return (TextUtils.isEmpty(str) || !str.equals("DATA_RECOMMEND_KEYBOARD_THEME")) ? a(jSONObject) : b(jSONObject);
    }

    @Override // com.tsf.extend.base.d.a
    public void a(s sVar) {
    }

    @Override // com.tsf.extend.base.d.a
    public com.tsf.extend.base.b.a b() {
        return null;
    }

    @Override // com.tsf.extend.base.d.a
    public void a(String str, a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, JSONObject jSONObject) {
        super.a(str, interfaceC0048a, bVar, jSONObject);
    }

    @Override // com.tsf.extend.base.d.a
    public String a(String str, a.b bVar, int i, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && str.equals("DATA_RECOMMEND_KEYBOARD_THEME")) {
            return "https://api-keyboard.cmcm.com/cmltabpromote";
        }
        return String.format("https://api-keyboard.cmcm.com/theme/hdpromote?aid=%s&mcc=%s&appv=%s&offset=%s&count=%s", this.e, this.c, this.d, "" + a(str, bVar), "20");
    }

    private int a(String str, a.b bVar) {
        if (bVar == a.b.Refresh) {
            return 0;
        }
        com.tsf.extend.base.b.a aVar = this.a.get(str);
        if (aVar == null) {
            return -1;
        }
        return aVar.j();
    }

    @Override // com.tsf.extend.base.d.a
    public void f() {
        super.f();
        b = null;
    }

    public static boolean b(String str) {
        return "Keyboard".equals(str) || "DATA_KEYBOARD_RECOMMEND_CACHE".equals(str);
    }

    private C0054a a(JSONObject jSONObject) {
        C0054a c0054a = new C0054a();
        if (jSONObject == null) {
            return null;
        }
        try {
            c0054a.c(a(jSONObject, "stime"));
            c0054a.d(a(jSONObject, "msg"));
            if (jSONObject.has("pagination")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pagination");
                c0054a.a(b(jSONObject2, "offset"));
                c0054a.d(b(jSONObject2, "offset"));
                c0054a.c(b(jSONObject2, "total"));
                c0054a.b(b(jSONObject2, "count"));
                c0054a.a(b(jSONObject2, "hasMore") != 0);
            }
            if (jSONObject.has("data")) {
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayListNewArrayList.add(c(jSONArrayOptJSONArray.getJSONObject(i)));
                    }
                }
                c0054a.a(arrayListNewArrayList);
                return c0054a;
            }
            return c0054a;
        } catch (JSONException e) {
            e.printStackTrace();
            return c0054a;
        }
    }

    private C0054a b(JSONObject jSONObject) {
        C0054a c0054a = new C0054a();
        if (jSONObject == null) {
            return null;
        }
        try {
            c0054a.c(a(jSONObject, "stime"));
            c0054a.d(a(jSONObject, "msg"));
            if (jSONObject.has("data")) {
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(0);
                b bVar = new b();
                bVar.a(jSONObject2.optLong("id"));
                String strOptString = jSONObject2.optString("package_name");
                bVar.b(strOptString);
                bVar.c(jSONObject2.optString("url"));
                int iOptInt = jSONObject2.optInt("show_mode");
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(1);
                b bVar2 = new b();
                bVar2.a(jSONObject3.optLong("id"));
                String strOptString2 = jSONObject3.optString("package_name");
                bVar2.b(strOptString2);
                bVar2.c(jSONObject3.optString("url"));
                if (iOptInt == 1) {
                    arrayListNewArrayList.add(bVar);
                    arrayListNewArrayList.add(bVar2);
                } else {
                    arrayListNewArrayList.add(bVar2);
                    arrayListNewArrayList.add(bVar);
                }
                if (f.a(h.b().getApplicationContext(), strOptString)) {
                    arrayListNewArrayList.remove(bVar);
                }
                if (f.a(h.b().getApplicationContext(), strOptString2)) {
                    arrayListNewArrayList.remove(bVar2);
                }
                c0054a.a(arrayListNewArrayList);
                return c0054a;
            }
            return c0054a;
        } catch (JSONException e) {
            e.printStackTrace();
            return c0054a;
        }
    }

    private b c(JSONObject jSONObject) {
        b bVar = new b();
        bVar.a(jSONObject.optLong("id"));
        bVar.b(jSONObject.optString("package_name"));
        bVar.a(jSONObject.optString("title"));
        bVar.c(jSONObject.optString("cover_url"));
        bVar.d(jSONObject.optString("download_url"));
        return bVar;
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, JSONObject jSONObject) {
        a("Keyboard", interfaceC0048a, bVar, jSONObject);
    }

    private String a(JSONObject jSONObject, String str) {
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

    private int b(JSONObject jSONObject, String str) {
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

    /* JADX INFO: renamed from: com.tsf.extend.keyboard.a$a, reason: collision with other inner class name */
    public static class C0054a extends com.tsf.extend.base.b.a<b> {
        @Override // com.tsf.extend.base.b.a
        public boolean h() {
            return b();
        }
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar) {
        a("DATA_RECOMMEND_KEYBOARD_THEME", interfaceC0048a, bVar, new JSONObject(), false);
    }

    public void a(final a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a) {
        z.a(2, new Runnable() { // from class: com.tsf.extend.keyboard.a.1
            @Override // java.lang.Runnable
            public void run() {
                final com.tsf.extend.base.b.a aVar;
                Object objA = com.tsf.extend.base.b.a.a.a().a("DATA_KEYBOARD_RECOMMEND_CACHE");
                if (objA instanceof com.tsf.extend.base.b.a) {
                    aVar = (com.tsf.extend.base.b.a) objA;
                } else {
                    aVar = objA instanceof C0054a ? (C0054a) objA : null;
                }
                if (aVar != null) {
                    Calendar calendar = Calendar.getInstance();
                    if (aVar.k() != calendar.get(5) + ((calendar.get(2) + 1) * 100)) {
                        com.tsf.extend.base.b.a.a.a().b("DATA_KEYBOARD_RECOMMEND_CACHE");
                        aVar = null;
                    }
                }
                z.a(0, new Runnable() { // from class: com.tsf.extend.keyboard.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0048a.a(null, aVar);
                    }
                });
            }
        });
    }

    public void a(final com.tsf.extend.base.b.a aVar) {
        z.a(2, new Runnable() { // from class: com.tsf.extend.keyboard.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.extend.base.b.a.a.a().a("DATA_KEYBOARD_RECOMMEND_CACHE") != null) {
                    com.tsf.extend.base.b.a.a.a().b("DATA_KEYBOARD_RECOMMEND_CACHE");
                }
                com.tsf.extend.base.b.a.a.a().a("DATA_KEYBOARD_RECOMMEND_CACHE", aVar);
            }
        });
    }

    public void b(com.tsf.extend.base.b.a aVar) {
        this.f = aVar;
    }
}
