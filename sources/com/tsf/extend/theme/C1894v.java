package com.tsf.extend.theme;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0838j;
import com.android.volley.toolbox.C0841m;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.InterfaceC1373b;
import com.tsf.extend.base.p071b.p072a.C1369a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p076f.C1402b;
import com.tsf.extend.base.p079i.C1416a;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1705c;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.theme.p084c.C1726e;
import com.tsf.extend.wallpaper.C2094m;
import com.tsf.extend.wallpaper.EnumC2057ai;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.io.File;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.v */
/* loaded from: classes.dex */
public class C1894v extends AbstractC1386a {

    /* renamed from: b */
    private static volatile C1894v f6111b = null;

    /* renamed from: e */
    private static String f6112e = null;

    /* renamed from: h */
    private static final List<String> f6113h = Lists.newArrayList();

    /* renamed from: c */
    private String f6114c;

    /* renamed from: d */
    private String f6115d;

    /* renamed from: f */
    private List<C1848k> f6116f = Lists.newArrayList();

    /* renamed from: g */
    private boolean f6117g = false;

    /* renamed from: com.tsf.extend.theme.v$a */
    /* loaded from: classes.dex */
    public static class C1915a implements Serializable {

        /* renamed from: a */
        public String f6160a;

        /* renamed from: b */
        public String f6161b;
    }

    /* renamed from: com.tsf.extend.theme.v$b */
    /* loaded from: classes.dex */
    public static class C1916b {

        /* renamed from: a */
        public String f6162a;

        /* renamed from: b */
        public Bitmap f6163b;
    }

    static {
        f6113h.add("com.ksmobile.launcher.theme.material");
        f6113h.add("com.ksmobile.launcher.theme.neonlife");
    }

    private C1894v() {
        this.f6114c = null;
        this.f6115d = null;
        m8809a(C1547h.m8290b());
        C1416a.m8719a().m8718a(C1547h.m8290b());
        C1416a.m8719a().m8716a("1");
        C1416a.m8719a().m8717a(new C1416a.InterfaceC1417a() { // from class: com.tsf.extend.theme.v.1
        });
        this.f6114c = C1423d.m8685b(C1547h.m8290b());
        this.f6114c = this.f6114c == null ? "null" : this.f6114c;
        this.f6115d = C1423d.m8688b();
        this.f6115d = TextUtils.isEmpty(this.f6115d) ? "null" : this.f6115d;
    }

    /* renamed from: h */
    public static C1894v m7069h() {
        if (f6111b == null) {
            synchronized (C1894v.class) {
                if (f6111b == null) {
                    f6111b = new C1894v();
                }
            }
        }
        return f6111b;
    }

    /* renamed from: b */
    public void m7085b(String str) {
        f6112e = str;
    }

    /* renamed from: a */
    public void m7101a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("keyword", URLEncoder.encode(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m8799a("DATA_SEARCH", interfaceC1396a, enumC1397b, jSONObject, false);
    }

    /* renamed from: a */
    public void m7104a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b) {
        m8799a("DATA_SEARCH_TAG", interfaceC1396a, enumC1397b, (JSONObject) null, false);
    }

    /* renamed from: a */
    public void m7103a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, long j) {
        mo8250a("DATA_RELATIVE_" + j, interfaceC1396a, enumC1397b, (JSONObject) null);
    }

    /* renamed from: a */
    public void m7102a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("categoryId", j + "");
            jSONObject.put("id", j2 + "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo8250a("DATA_WALLPAPE_RELATIVE_" + j, interfaceC1396a, enumC1397b, jSONObject);
    }

    /* renamed from: b */
    public void m7086b(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packname", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m8799a("DATA_RECOM_BY_NAME" + str, interfaceC1396a, enumC1397b, jSONObject, false);
    }

    /* renamed from: a */
    public C1368a m7112a(long j) {
        return m8792d().get("DATA_RELATIVE_" + j);
    }

    /* renamed from: c */
    public void m7081c(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("album_id", str);
            mo8250a("DATA_ALBUM_" + str, interfaceC1396a, enumC1397b, jSONObject);
        } catch (Exception e) {
            interfaceC1396a.mo6247a(null, 0, null);
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: f */
    public void mo6200f() {
        super.mo6200f();
        f6111b = null;
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    public String mo6210a(String str, AbstractC1386a.EnumC1397b enumC1397b, int i, JSONObject jSONObject) {
        return m7084b(str, enumC1397b, i, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m7084b(java.lang.String r10, com.tsf.extend.base.p074d.AbstractC1386a.EnumC1397b r11, int r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.C1894v.m7084b(java.lang.String, com.tsf.extend.base.d.a$b, int, org.json.JSONObject):java.lang.String");
    }

    /* renamed from: a */
    private int m7093a(String str, AbstractC1386a.EnumC1397b enumC1397b) {
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
    /* renamed from: a */
    public String mo6221a() {
        return "THEME_IMAGE_REQEUST";
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    protected C1368a mo6209a(String str, String str2, JSONObject jSONObject) {
        if ("DATA_PLAY".equals(str)) {
            return m7062j(jSONObject);
        }
        if (str.contains("DATA_ALBUM")) {
            return m7078c(jSONObject);
        }
        if ("DATA_CATEGORY".equals(str)) {
            return m7076d(jSONObject);
        }
        if ("DATA_HOT".equals(str) || "DATA_NEW".equals(str)) {
            return m7074e(jSONObject);
        }
        if (str.contains("DATA_WALLPAPE_RELATIVE")) {
            return m7067h(jSONObject);
        }
        if (str.equals("DATA_SEARCH_TAG")) {
            return m7089a(jSONObject);
        }
        if (str != null && str.contains("DATA_DATA_FF")) {
            return m7072f(jSONObject);
        }
        return m7070g(jSONObject);
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

    /* renamed from: a */
    private static String m7111a(long j, String str) {
        C1672ag c1672ag = new C1672ag("detail?");
        c1672ag.m7877a(j, str);
        return c1672ag.m8948d();
    }

    /* renamed from: a */
    public void m7110a(long j, String str, AbstractC1386a.InterfaceC1396a<C1862p> interfaceC1396a, String str2) {
        C0838j m8768a = C1402b.m8768a(m7111a(j, str), null, interfaceC1396a, new C1402b.InterfaceC1405a<C1862p>() { // from class: com.tsf.extend.theme.v.6
            @Override // com.tsf.extend.base.p076f.C1402b.InterfaceC1405a
            /* renamed from: a */
            public C1862p mo7058b(JSONObject jSONObject) {
                try {
                    return C1894v.this.m7070g(jSONObject);
                } catch (JSONException e) {
                    return null;
                }
            }
        });
        m8768a.m11032a(false);
        m8768a.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
        m8807a(m8768a);
    }

    /* renamed from: a */
    public void m7105a(final AbstractC1386a.InterfaceC1396a<C1848k> interfaceC1396a, final long j, String str, String str2) {
        C1848k c1848k;
        Iterator<Map.Entry<String, C1368a>> it = m8792d().entrySet().iterator();
        C1848k c1848k2 = null;
        while (true) {
            if (!it.hasNext()) {
                c1848k = c1848k2;
                break;
            }
            Map.Entry<String, C1368a> next = it.next();
            if (next.getValue() instanceof C1862p) {
                c1848k = m7100a((C1862p) next.getValue(), j);
                if (c1848k != null) {
                    break;
                }
                c1848k2 = c1848k;
            }
        }
        if (c1848k != null) {
            interfaceC1396a.mo6245a(null, c1848k);
        } else {
            m7110a(j, str, new AbstractC1386a.InterfaceC1396a<C1862p>() { // from class: com.tsf.extend.theme.v.7
                @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6245a(JSONObject jSONObject, C1862p c1862p) {
                    if (c1862p != null) {
                        C1848k m7100a = C1894v.this.m7100a(c1862p, j);
                        if (m7100a != null) {
                            interfaceC1396a.mo6245a(jSONObject, m7100a);
                            return;
                        } else {
                            interfaceC1396a.mo6247a(jSONObject, 2, null);
                            return;
                        }
                    }
                    interfaceC1396a.mo6247a(jSONObject, 0, null);
                }

                @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo6247a(JSONObject jSONObject, int i, C1862p c1862p) {
                    interfaceC1396a.mo6247a(jSONObject, i, null);
                }
            }, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C1848k m7100a(C1862p c1862p, long j) {
        if (c1862p == null || c1862p.m8875a() == null) {
            return null;
        }
        for (C1848k c1848k : c1862p.m8875a()) {
            if (c1848k.m7297h() == j) {
                return c1848k;
            }
        }
        return null;
    }

    /* renamed from: a */
    private C1368a m7089a(JSONObject jSONObject) {
        C1368a c1368a = new C1368a();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        c1368a.m8867b(jSONObject.optInt("count"));
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(m7083b(optJSONArray.getJSONObject(i)));
            }
        }
        c1368a.m8870a(newArrayList);
        return c1368a;
    }

    /* renamed from: b */
    private static C1726e m7083b(JSONObject jSONObject) {
        C1726e c1726e = new C1726e();
        c1726e.m7656a(jSONObject.optString("search_word"));
        return c1726e;
    }

    /* renamed from: c */
    private C1645a m7078c(JSONObject jSONObject) {
        C1645a c1645a = new C1645a();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        String optString = jSONObject.optString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        if (jSONObject.optInt("diyEnabled") == 1) {
        }
        c1645a.m8871a(optString);
        c1645a.m8873a(System.currentTimeMillis());
        c1645a.m8869a(z);
        c1645a.m7940e(jSONObject.optString("album_name"));
        c1645a.m7939f(jSONObject.optString("album_url"));
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(m7064i(optJSONArray.getJSONObject(i)));
            }
        }
        c1645a.m8870a(newArrayList);
        return c1645a;
    }

    /* renamed from: d */
    private C1862p m7076d(JSONObject jSONObject) {
        C1862p c1862p = new C1862p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        ArrayList newArrayList = Lists.newArrayList();
        String optString = jSONObject.optString("version");
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        c1862p.mo7220b(jSONObject.optInt("diyEnabled") == 1);
        c1862p.m8871a(optString);
        c1862p.m8873a(System.currentTimeMillis());
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C1848k c1848k = new C1848k();
                c1848k.m7320a(jSONObject2.optInt("id"));
                c1848k.m7288k(jSONObject2.optString("cover_url"));
                c1848k.m7307d(jSONObject2.optString("album_name"));
                c1848k.m7299g(jSONObject2.optInt("type"));
                newArrayList.add(c1848k);
            }
        }
        c1862p.m8870a(newArrayList);
        return c1862p;
    }

    /* renamed from: e */
    private C1862p m7074e(JSONObject jSONObject) {
        JSONArray optJSONArray;
        C1862p c1862p = new C1862p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        m7099a(c1862p, jSONObject);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("data");
        if (optJSONArray2 != null) {
            for (int i = 0; i < optJSONArray2.length(); i++) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("type");
                if (string.equals("1")) {
                    newArrayList.add(m7064i(jSONObject2));
                } else if (string.equals("2") && (optJSONArray = jSONObject2.optJSONArray("list")) != null) {
                    newArrayList.add(m7090a(optJSONArray));
                }
            }
        }
        c1862p.m8870a(newArrayList);
        return c1862p;
    }

    /* renamed from: a */
    private C1848k m7090a(JSONArray jSONArray) {
        int length;
        C1858n c1858n = null;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            c1858n = new C1858n();
            ArrayList arrayList = new ArrayList();
            c1858n.m7234b(arrayList);
            int min = Math.min(length, 50);
            for (int i = 0; i < min; i++) {
                C1705c.C1706a m7061k = m7061k(jSONArray.getJSONObject(i));
                if (m7061k != null) {
                    arrayList.add(m7061k);
                }
            }
        }
        return c1858n;
    }

    /* renamed from: f */
    private C1763d m7072f(JSONObject jSONObject) {
        C1763d c1763d = new C1763d();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        m7099a(c1763d, jSONObject);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(m7064i(optJSONArray.getJSONObject(i)));
            }
        }
        c1763d.m8870a(newArrayList);
        return c1763d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public C1862p m7070g(JSONObject jSONObject) {
        C1862p c1862p = new C1862p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        m7099a(c1862p, jSONObject);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(m7064i(optJSONArray.getJSONObject(i)));
            }
        }
        c1862p.m8870a(newArrayList);
        return c1862p;
    }

    /* renamed from: h */
    private C1862p m7067h(JSONObject jSONObject) {
        C1862p m7070g = m7070g(jSONObject);
        final int optInt = jSONObject.optInt("ttl", 10);
        if (m7070g != null) {
            m7070g.m8872a(new InterfaceC1373b() { // from class: com.tsf.extend.theme.v.8
                @Override // com.tsf.extend.base.p071b.InterfaceC1373b
                /* renamed from: a */
                public boolean mo6189a(C1368a c1368a) {
                    return System.currentTimeMillis() - c1368a.m8865c() > TimeUnit.MINUTES.toMillis((long) optInt);
                }
            });
        }
        return m7070g;
    }

    /* renamed from: a */
    private void m7099a(C1862p c1862p, JSONObject jSONObject) {
        String optString = jSONObject.optString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        boolean z2 = jSONObject.optInt("diyEnabled") == 1;
        c1862p.m8871a(optString);
        c1862p.m8873a(System.currentTimeMillis());
        c1862p.m8869a(z);
        c1862p.mo7220b(z2);
        c1862p.m8864c(jSONObject.optString("stime"));
        c1862p.m8862d(jSONObject.optString("msg"));
        c1862p.m8867b(jSONObject.optInt("count"));
        c1862p.mo6378c(jSONObject.optInt("total"));
        c1862p.m8863d(jSONObject.optInt("offset", -1));
        c1862p.m8866b(jSONObject.optString("upack"));
    }

    /* renamed from: i */
    private static C1848k m7064i(JSONObject jSONObject) {
        C1848k c1848k = new C1848k();
        c1848k.m7292i(jSONObject.optString("author"));
        c1848k.m7321a(jSONObject.optInt("download_count"));
        c1848k.m7312c(jSONObject.optInt("favorite_count"));
        c1848k.m7320a(jSONObject.optLong("id"));
        c1848k.m7301f(jSONObject.optString("image_url"));
        c1848k.m7298g(jSONObject.optString("newcover_url"));
        c1848k.m7307d(jSONObject.optString("name"));
        c1848k.m7310c(jSONObject.optString("packageName"));
        c1848k.m7295h(jSONObject.optString("size"));
        c1848k.m7288k(jSONObject.optString("thumbnail_url"));
        c1848k.m7304e(jSONObject.optString("download_url"));
        c1848k.m7290j(jSONObject.optString("version"));
        c1848k.m7308d(jSONObject.optInt("is_recommand", 0));
        c1848k.m7293i(jSONObject.optInt("themetype", 0));
        c1848k.m7278p(jSONObject.optString("cmt_url"));
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(optJSONArray.getString(i));
            }
        }
        c1848k.m7318a(newArrayList);
        c1848k.m7296h(jSONObject.optInt("show_position", 0));
        c1848k.m7286l(jSONObject.optString("country"));
        c1848k.m7284m(jSONObject.optString("version_flag"));
        c1848k.m7282n(jSONObject.optString("locker_download_url"));
        c1848k.m7280o(jSONObject.optString("cpack"));
        return c1848k;
    }

    /* renamed from: a */
    public void m7106a(final AbstractC1386a.InterfaceC1396a<List<C1848k>> interfaceC1396a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.v.9
            @Override // java.lang.Runnable
            public void run() {
                C1894v.this.f6116f = C1685ai.m7809a().m7803c();
                final ArrayList newArrayList = Lists.newArrayList();
                newArrayList.addAll(C1894v.this.f6116f);
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC1396a.mo6245a(null, newArrayList);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void m7087b(final AbstractC1386a.InterfaceC1396a<List<C1848k>> interfaceC1396a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.v.10
            @Override // java.lang.Runnable
            public void run() {
                final List<C1848k> m7802d = C1685ai.m7809a().m7802d();
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC1396a.mo6245a(null, m7802d);
                    }
                });
            }
        });
    }

    /* renamed from: i */
    public static List<AbstractC1700aq> m7066i() {
        AbstractC1700aq m7389a;
        ArrayList arrayList = new ArrayList();
        File[] m7384c = C1821e.m7384c(C1547h.m8290b());
        if (m7384c != null) {
            for (File file : m7384c) {
                if (file != null && file.isDirectory() && (m7389a = C1821e.m7389a(file.getAbsolutePath(), true)) != null) {
                    arrayList.add(m7389a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C1842f m7080c(String str) {
        C1842f c1842f;
        if (m7075e(str)) {
            try {
                Context createPackageContext = C1547h.m8290b().createPackageContext(str, 3);
                HashMap<String, Object> m8680d = C1423d.m8680d(createPackageContext);
                if (createPackageContext != null) {
                    c1842f = C1668ae.m7891a(createPackageContext, m8680d);
                    if (c1842f == null || TextUtils.isEmpty(c1842f.m7294i())) {
                        c1842f = null;
                    }
                } else {
                    c1842f = null;
                }
                return c1842f;
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean m7077d(String str) {
        if (this.f6116f == null || this.f6116f.size() == 0) {
            return false;
        }
        for (C1848k c1848k : this.f6116f) {
            if (str.equals(c1848k.m7300g())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m7075e(String str) {
        if (f6113h.contains(str)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = C1547h.m8290b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            return applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("CMLAUNCHER_THEME_SUPPORT", false) && C1673ah.m7831c(applicationInfo.metaData.getString("CMLAUNCHER_THEME_VERSION"));
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: f */
    public static String m7073f(String str) {
        try {
            ApplicationInfo applicationInfo = C1547h.m8290b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            return applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_SUPPORT_MODULES");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m7071g(String str) {
        try {
            ApplicationInfo applicationInfo = C1547h.m8290b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("CMLAUNCHER_WIDGETSKIN", false);
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m7068h(String str) {
        try {
            ApplicationInfo applicationInfo = C1547h.m8290b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            return (applicationInfo == null || applicationInfo.metaData == null || !C1673ah.m7829d(applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_VERSION"))) ? false : true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: i */
    public static String m7065i(String str) {
        try {
            ApplicationInfo applicationInfo = C1547h.m8290b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean("CMLAUNCHER_WIDGETSKIN", false) || !C1673ah.m7829d(applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_VERSION"))) {
                return null;
            }
            return applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_CHANNEL");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public void m7113a(final int i, final String str, final AbstractC1386a.InterfaceC1396a<C1916b> interfaceC1396a, final int i2) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.v.11
            @Override // java.lang.Runnable
            public void run() {
                Context context;
                BitmapFactory.Options options;
                try {
                    context = C1547h.m8290b().createPackageContext(str, 3);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    context = null;
                }
                if (context == null || i == 0) {
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.11.1
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC1396a.mo6247a(null, -1, null);
                        }
                    });
                    return;
                }
                try {
                    if (i2 != 0) {
                        options = new BitmapFactory.Options();
                        options.inSampleSize = i2;
                        options.inJustDecodeBounds = false;
                    } else {
                        options = null;
                    }
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
                    final C1916b c1916b = new C1916b();
                    c1916b.f6162a = str;
                    c1916b.f6163b = decodeResource;
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.11.2
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC1396a.mo6245a(null, c1916b);
                        }
                    });
                } catch (Throwable th) {
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.11.3
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC1396a.mo6247a(null, -1, null);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void m7091a(final String str, final List<String> list, final AbstractC1386a.InterfaceC1396a<C1916b> interfaceC1396a, final int i, final int i2) {
        if (list == null || list.size() == 0 || list.size() < i2) {
            interfaceC1396a.mo6247a(null, -1, null);
            return;
        }
        final String str2 = list.get(i2) + "_" + i;
        Bitmap a = m8804a(str2);
        if (a != null) {
            C1916b c1916b = new C1916b();
            c1916b.f6162a = str;
            c1916b.f6163b = a;
            interfaceC1396a.mo6245a(null, c1916b);
            return;
        }
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.v.12
            @Override // java.lang.Runnable
            public void run() {
                BitmapFactory.Options options;
                try {
                    if (i == 0) {
                        options = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i;
                        options2.inJustDecodeBounds = false;
                        options = options2;
                    }
                    Bitmap decodeFile = BitmapFactory.decodeFile(Uri.parse((String) list.get(i2)).getPath(), options);
                    final C1916b c1916b2 = new C1916b();
                    c1916b2.f6162a = str;
                    c1916b2.f6163b = decodeFile;
                    C1894v.this.m8803a(str2, c1916b2.f6163b);
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.12.1
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC1396a.mo6245a(null, c1916b2);
                        }
                    });
                } catch (Throwable th) {
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.12.2
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC1396a.mo6247a(null, -1, null);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void m7092a(String str, AbstractC1700aq abstractC1700aq, AbstractC1386a.InterfaceC1396a<C1916b> interfaceC1396a, int i, int i2) {
        m7091a(str, abstractC1700aq.m7274t(), interfaceC1396a, i, i2);
    }

    /* renamed from: a */
    public void m7094a(String str, View view, AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> interfaceC1396a, int i, int i2) {
        m8800a(str, interfaceC1396a, AbstractC0795l.EnumC0797a.LOW, i, i2);
    }

    /* renamed from: c */
    public void m7079c(String str, AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> interfaceC1396a) {
        m8801a(str, interfaceC1396a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7088b(final long j) {
        C0841m c0841m = new C0841m(1, "https://cml.ksmobile.com/Theme/downloadReport", new C0802n.InterfaceC0804b<String>() { // from class: com.tsf.extend.theme.v.2
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(String str) {
            }
        }, null) { // from class: com.tsf.extend.theme.v.3
            @Override // com.android.volley.AbstractC0795l
            /* renamed from: n */
            protected Map<String, String> mo6190n() {
                HashMap hashMap = new HashMap();
                hashMap.put("id", j + "");
                return hashMap;
            }
        };
        c0841m.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
        m8807a(c0841m);
    }

    /* renamed from: j */
    private C1705c m7062j(JSONObject jSONObject) {
        C1705c c1705c = new C1705c();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        long optLong = jSONObject.optLong("showCount");
        if (optJSONArray == null || optLong == 0) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                return null;
            }
            C1705c.C1706a m7061k = m7061k(jSONObject2);
            if (m7061k != null) {
                c1705c.m8875a().add(m7061k);
                if (c1705c.m8875a().size() >= optLong) {
                    break;
                }
            }
        }
        if (c1705c.m8875a().size() == 0) {
            return null;
        }
        return c1705c;
    }

    /* renamed from: k */
    private C1705c.C1706a m7061k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C1705c.C1706a c1706a = new C1705c.C1706a();
        c1706a.f5478a = jSONObject.optString("id");
        c1706a.f5479b = jSONObject.optString("type");
        c1706a.f5480c = jSONObject.optString("banner_img");
        if ("1".equals(c1706a.f5479b)) {
            c1706a.f5481d = m7064i(jSONObject);
        } else if ("2".equals(c1706a.f5479b)) {
            c1706a.f5481d = C2094m.m6446a(jSONObject, EnumC2057ai.NewType);
        } else if ("3".equals(c1706a.f5479b)) {
            c1706a.f5481d = jSONObject.optString("banner_img_url");
        } else if (!"4".equals(c1706a.f5479b)) {
            return null;
        } else {
            C1915a c1915a = new C1915a();
            c1915a.f6160a = jSONObject.optString("album_id");
            c1915a.f6161b = jSONObject.optString("album_name");
            c1706a.f5481d = c1915a;
        }
        return c1706a;
    }

    /* renamed from: j */
    public static boolean m7063j(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("DATA_DATA_FF")) {
            if ((!TextUtils.isEmpty(str) && str.equals("DATA_RECOMMEND_CACHE")) || "DATA_PLAY".equals(str) || "DATA_NEW".equals(str) || "DATA_HOT".equals(str) || "DATA_DIY".equals(str)) {
                return true;
            }
            if (TextUtils.isEmpty(str) || !str.contains("DATA_ALBUM")) {
                return !TextUtils.isEmpty(str) && str.contains("DATA_RELATIVE");
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public Bitmap m7108a(Context context, BitmapFactory.Options options) {
        File file;
        if (PersonalizationActivity.f6215e) {
            file = new File(context.getFilesDir().getAbsolutePath(), "diy_theme_default_3d.png");
        } else {
            file = new File(context.getFilesDir().getAbsolutePath(), "diy_theme_default_3d.png");
        }
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (Throwable th) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: a */
    public static void m7109a(android.content.Context r6, android.graphics.Bitmap r7) {
        /*
            r0 = 0
            boolean r1 = com.tsf.extend.wallpaper.PersonalizationActivity.f6215e     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L27
            java.lang.String r1 = "diy_theme_default_3d.png"
            r2 = r1
        L8:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2b
            java.io.File r4 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L44
            r2 = 100
            r7.compress(r0, r2, r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.io.IOException -> L3e
        L26:
            return
        L27:
            java.lang.String r1 = "diy_theme_default_3d.png"
            r2 = r1
            goto L8
        L2b:
            r1 = move-exception
        L2c:
            if (r0 == 0) goto L26
            r0.close()     // Catch: java.io.IOException -> L32
            goto L26
        L32:
            r0 = move-exception
            goto L26
        L34:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L38:
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.io.IOException -> L40
        L3d:
            throw r0
        L3e:
            r0 = move-exception
            goto L26
        L40:
            r1 = move-exception
            goto L3d
        L42:
            r0 = move-exception
            goto L38
        L44:
            r0 = move-exception
            r0 = r1
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.C1894v.m7109a(android.content.Context, android.graphics.Bitmap):void");
    }

    /* renamed from: c */
    public static void m7082c(final AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.v.4
            @Override // java.lang.Runnable
            public void run() {
                Object m8853a = C1369a.m8855a().m8853a("DATA_RECOMMEND_CACHE");
                final C1368a c1368a = m8853a instanceof C1368a ? (C1368a) m8853a : null;
                if (c1368a != null && c1368a.mo6376d()) {
                    C1369a.m8855a().m8848b("DATA_RECOMMEND_CACHE");
                    c1368a = null;
                }
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.v.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC1386a.InterfaceC1396a.this.mo6245a(null, c1368a);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m7107a(final C1368a c1368a) {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.v.5
            @Override // java.lang.Runnable
            public void run() {
                C1369a.m8855a().m8852a("DATA_RECOMMEND_CACHE", c1368a);
            }
        });
    }
}
