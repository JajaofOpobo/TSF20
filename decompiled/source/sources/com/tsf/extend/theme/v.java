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
import com.android.volley.l;
import com.android.volley.n;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.f.b;
import com.tsf.extend.base.i.a;
import com.tsf.extend.theme.c;
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
/* loaded from: classes.dex */
public class v extends com.tsf.extend.base.d.a {
    private static volatile v b = null;
    private static String e = null;
    private static final List<String> h = Lists.newArrayList();
    private String c;
    private String d;
    private List<k> f = Lists.newArrayList();
    private boolean g = false;

    /* loaded from: classes.dex */
    public static class a implements Serializable {
        public String a;
        public String b;
    }

    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public Bitmap b;
    }

    static {
        h.add("com.ksmobile.launcher.theme.material");
        h.add("com.ksmobile.launcher.theme.neonlife");
    }

    private v() {
        this.c = null;
        this.d = null;
        a(com.tsf.extend.h.b());
        com.tsf.extend.base.i.a.a().a(com.tsf.extend.h.b());
        com.tsf.extend.base.i.a.a().a("1");
        com.tsf.extend.base.i.a.a().a(new a.InterfaceC0050a() { // from class: com.tsf.extend.theme.v.1
        });
        this.c = com.tsf.extend.base.j.d.b(com.tsf.extend.h.b());
        this.c = this.c == null ? "null" : this.c;
        this.d = com.tsf.extend.base.j.d.b();
        this.d = TextUtils.isEmpty(this.d) ? "null" : this.d;
    }

    public static v h() {
        if (b == null) {
            synchronized (v.class) {
                if (b == null) {
                    b = new v();
                }
            }
        }
        return b;
    }

    public void b(String str) {
        e = str;
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("keyword", URLEncoder.encode(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("DATA_SEARCH", interfaceC0048a, bVar, jSONObject, false);
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar) {
        a("DATA_SEARCH_TAG", interfaceC0048a, bVar, (JSONObject) null, false);
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, long j) {
        a("DATA_RELATIVE_" + j, interfaceC0048a, bVar, (JSONObject) null);
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("categoryId", j + "");
            jSONObject.put("id", j2 + "");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("DATA_WALLPAPE_RELATIVE_" + j, interfaceC0048a, bVar, jSONObject);
    }

    public void b(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packname", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("DATA_RECOM_BY_NAME" + str, interfaceC0048a, bVar, jSONObject, false);
    }

    public com.tsf.extend.base.b.a a(long j) {
        return d().get("DATA_RELATIVE_" + j);
    }

    public void c(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("album_id", str);
            a("DATA_ALBUM_" + str, interfaceC0048a, bVar, jSONObject);
        } catch (Exception e2) {
            interfaceC0048a.a(null, 0, null);
        }
    }

    @Override // com.tsf.extend.base.d.a
    public void f() {
        super.f();
        b = null;
    }

    @Override // com.tsf.extend.base.d.a
    public String a(String str, a.b bVar, int i, JSONObject jSONObject) {
        return b(str, bVar, i, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r10, com.tsf.extend.base.d.a.b r11, int r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.v.b(java.lang.String, com.tsf.extend.base.d.a$b, int, org.json.JSONObject):java.lang.String");
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
    public String a() {
        return "THEME_IMAGE_REQEUST";
    }

    @Override // com.tsf.extend.base.d.a
    protected com.tsf.extend.base.b.a a(String str, String str2, JSONObject jSONObject) {
        if ("DATA_PLAY".equals(str)) {
            return j(jSONObject);
        }
        if (str.contains("DATA_ALBUM")) {
            return c(jSONObject);
        }
        if ("DATA_CATEGORY".equals(str)) {
            return d(jSONObject);
        }
        if ("DATA_HOT".equals(str) || "DATA_NEW".equals(str)) {
            return e(jSONObject);
        }
        if (str.contains("DATA_WALLPAPE_RELATIVE")) {
            return h(jSONObject);
        }
        if (str.equals("DATA_SEARCH_TAG")) {
            return a(jSONObject);
        }
        if (str != null && str.contains("DATA_DATA_FF")) {
            return f(jSONObject);
        }
        return g(jSONObject);
    }

    @Override // com.tsf.extend.base.d.a
    public void a(com.android.volley.s sVar) {
    }

    @Override // com.tsf.extend.base.d.a
    public com.tsf.extend.base.b.a b() {
        return null;
    }

    private static String a(long j, String str) {
        ag agVar = new ag("detail?");
        agVar.a(j, str);
        return agVar.d();
    }

    public void a(long j, String str, a.InterfaceC0048a<p> interfaceC0048a, String str2) {
        com.android.volley.toolbox.j a2 = com.tsf.extend.base.f.b.a(a(j, str), null, interfaceC0048a, new b.a<p>() { // from class: com.tsf.extend.theme.v.6
            @Override // com.tsf.extend.base.f.b.a
            /* renamed from: a */
            public p b(JSONObject jSONObject) {
                try {
                    return v.this.g(jSONObject);
                } catch (JSONException e2) {
                    return null;
                }
            }
        });
        a2.a(false);
        a2.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
        a(a2);
    }

    public void a(final a.InterfaceC0048a<k> interfaceC0048a, final long j, String str, String str2) {
        k kVar;
        Iterator<Map.Entry<String, com.tsf.extend.base.b.a>> it = d().entrySet().iterator();
        k kVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                kVar = kVar2;
                break;
            }
            Map.Entry<String, com.tsf.extend.base.b.a> next = it.next();
            if (next.getValue() instanceof p) {
                kVar = a((p) next.getValue(), j);
                if (kVar != null) {
                    break;
                }
                kVar2 = kVar;
            }
        }
        if (kVar != null) {
            interfaceC0048a.a(null, kVar);
        } else {
            a(j, str, new a.InterfaceC0048a<p>() { // from class: com.tsf.extend.theme.v.7
                @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                public void a(JSONObject jSONObject, p pVar) {
                    if (pVar != null) {
                        k a2 = v.this.a(pVar, j);
                        if (a2 != null) {
                            interfaceC0048a.a(jSONObject, a2);
                            return;
                        } else {
                            interfaceC0048a.a(jSONObject, 2, null);
                            return;
                        }
                    }
                    interfaceC0048a.a(jSONObject, 0, null);
                }

                @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                public void a(JSONObject jSONObject, int i, p pVar) {
                    interfaceC0048a.a(jSONObject, i, null);
                }
            }, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k a(p pVar, long j) {
        if (pVar == null || pVar.a() == null) {
            return null;
        }
        for (k kVar : pVar.a()) {
            if (kVar.h() == j) {
                return kVar;
            }
        }
        return null;
    }

    private com.tsf.extend.base.b.a a(JSONObject jSONObject) {
        com.tsf.extend.base.b.a aVar = new com.tsf.extend.base.b.a();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        aVar.b(jSONObject.optInt("count"));
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(b(optJSONArray.getJSONObject(i)));
            }
        }
        aVar.a(newArrayList);
        return aVar;
    }

    private static com.tsf.extend.theme.c.e b(JSONObject jSONObject) {
        com.tsf.extend.theme.c.e eVar = new com.tsf.extend.theme.c.e();
        eVar.a(jSONObject.optString("search_word"));
        return eVar;
    }

    private com.tsf.extend.theme.a c(JSONObject jSONObject) {
        com.tsf.extend.theme.a aVar = new com.tsf.extend.theme.a();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        String optString = jSONObject.optString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        if (jSONObject.optInt("diyEnabled") == 1) {
        }
        aVar.a(optString);
        aVar.a(System.currentTimeMillis());
        aVar.a(z);
        aVar.e(jSONObject.optString("album_name"));
        aVar.f(jSONObject.optString("album_url"));
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(i(optJSONArray.getJSONObject(i)));
            }
        }
        aVar.a(newArrayList);
        return aVar;
    }

    private p d(JSONObject jSONObject) {
        p pVar = new p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        ArrayList newArrayList = Lists.newArrayList();
        String optString = jSONObject.optString("version");
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        pVar.b(jSONObject.optInt("diyEnabled") == 1);
        pVar.a(optString);
        pVar.a(System.currentTimeMillis());
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                k kVar = new k();
                kVar.a(jSONObject2.optInt("id"));
                kVar.k(jSONObject2.optString("cover_url"));
                kVar.d(jSONObject2.optString("album_name"));
                kVar.g(jSONObject2.optInt("type"));
                newArrayList.add(kVar);
            }
        }
        pVar.a(newArrayList);
        return pVar;
    }

    private p e(JSONObject jSONObject) {
        JSONArray optJSONArray;
        p pVar = new p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        a(pVar, jSONObject);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("data");
        if (optJSONArray2 != null) {
            for (int i = 0; i < optJSONArray2.length(); i++) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("type");
                if (string.equals("1")) {
                    newArrayList.add(i(jSONObject2));
                } else if (string.equals("2") && (optJSONArray = jSONObject2.optJSONArray("list")) != null) {
                    newArrayList.add(a(optJSONArray));
                }
            }
        }
        pVar.a(newArrayList);
        return pVar;
    }

    private k a(JSONArray jSONArray) {
        int length;
        n nVar = null;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            nVar = new n();
            ArrayList arrayList = new ArrayList();
            nVar.b(arrayList);
            int min = Math.min(length, 50);
            for (int i = 0; i < min; i++) {
                c.a k = k(jSONArray.getJSONObject(i));
                if (k != null) {
                    arrayList.add(k);
                }
            }
        }
        return nVar;
    }

    private d f(JSONObject jSONObject) {
        d dVar = new d();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        a(dVar, jSONObject);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(i(optJSONArray.getJSONObject(i)));
            }
        }
        dVar.a(newArrayList);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p g(JSONObject jSONObject) {
        p pVar = new p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        a(pVar, jSONObject);
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(i(optJSONArray.getJSONObject(i)));
            }
        }
        pVar.a(newArrayList);
        return pVar;
    }

    private p h(JSONObject jSONObject) {
        p g = g(jSONObject);
        final int optInt = jSONObject.optInt("ttl", 10);
        if (g != null) {
            g.a(new com.tsf.extend.base.b.b() { // from class: com.tsf.extend.theme.v.8
                @Override // com.tsf.extend.base.b.b
                public boolean a(com.tsf.extend.base.b.a aVar) {
                    return System.currentTimeMillis() - aVar.c() > TimeUnit.MINUTES.toMillis((long) optInt);
                }
            });
        }
        return g;
    }

    private void a(p pVar, JSONObject jSONObject) {
        String optString = jSONObject.optString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        boolean z2 = jSONObject.optInt("diyEnabled") == 1;
        pVar.a(optString);
        pVar.a(System.currentTimeMillis());
        pVar.a(z);
        pVar.b(z2);
        pVar.c(jSONObject.optString("stime"));
        pVar.d(jSONObject.optString("msg"));
        pVar.b(jSONObject.optInt("count"));
        pVar.c(jSONObject.optInt("total"));
        pVar.d(jSONObject.optInt("offset", -1));
        pVar.b(jSONObject.optString("upack"));
    }

    private static k i(JSONObject jSONObject) {
        k kVar = new k();
        kVar.i(jSONObject.optString("author"));
        kVar.a(jSONObject.optInt("download_count"));
        kVar.c(jSONObject.optInt("favorite_count"));
        kVar.a(jSONObject.optLong("id"));
        kVar.f(jSONObject.optString("image_url"));
        kVar.g(jSONObject.optString("newcover_url"));
        kVar.d(jSONObject.optString("name"));
        kVar.c(jSONObject.optString("packageName"));
        kVar.h(jSONObject.optString("size"));
        kVar.k(jSONObject.optString("thumbnail_url"));
        kVar.e(jSONObject.optString("download_url"));
        kVar.j(jSONObject.optString("version"));
        kVar.d(jSONObject.optInt("is_recommand", 0));
        kVar.i(jSONObject.optInt("themetype", 0));
        kVar.p(jSONObject.optString("cmt_url"));
        ArrayList newArrayList = Lists.newArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                newArrayList.add(optJSONArray.getString(i));
            }
        }
        kVar.a(newArrayList);
        kVar.h(jSONObject.optInt("show_position", 0));
        kVar.l(jSONObject.optString("country"));
        kVar.m(jSONObject.optString("version_flag"));
        kVar.n(jSONObject.optString("locker_download_url"));
        kVar.o(jSONObject.optString("cpack"));
        return kVar;
    }

    public void a(final a.InterfaceC0048a<List<k>> interfaceC0048a) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.9
            @Override // java.lang.Runnable
            public void run() {
                v.this.f = ai.a().c();
                final ArrayList newArrayList = Lists.newArrayList();
                newArrayList.addAll(v.this.f);
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0048a.a(null, newArrayList);
                    }
                });
            }
        });
    }

    public void b(final a.InterfaceC0048a<List<k>> interfaceC0048a) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.10
            @Override // java.lang.Runnable
            public void run() {
                final List<k> d = ai.a().d();
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0048a.a(null, d);
                    }
                });
            }
        });
    }

    public static List<aq> i() {
        aq a2;
        ArrayList arrayList = new ArrayList();
        File[] c = com.tsf.extend.theme.diy.e.c(com.tsf.extend.h.b());
        if (c != null) {
            for (File file : c) {
                if (file != null && file.isDirectory() && (a2 = com.tsf.extend.theme.diy.e.a(file.getAbsolutePath(), true)) != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public static f c(String str) {
        f fVar;
        if (e(str)) {
            try {
                Context createPackageContext = com.tsf.extend.h.b().createPackageContext(str, 3);
                HashMap<String, Object> d = com.tsf.extend.base.j.d.d(createPackageContext);
                if (createPackageContext != null) {
                    fVar = ae.a(createPackageContext, d);
                    if (fVar == null || TextUtils.isEmpty(fVar.i())) {
                        fVar = null;
                    }
                } else {
                    fVar = null;
                }
                return fVar;
            } catch (PackageManager.NameNotFoundException e2) {
                return null;
            }
        }
        return null;
    }

    public boolean d(String str) {
        if (this.f == null || this.f.size() == 0) {
            return false;
        }
        for (k kVar : this.f) {
            if (str.equals(kVar.g())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str) {
        if (h.contains(str)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = com.tsf.extend.h.b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            return applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("CMLAUNCHER_THEME_SUPPORT", false) && ah.c(applicationInfo.metaData.getString("CMLAUNCHER_THEME_VERSION"));
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public static String f(String str) {
        try {
            ApplicationInfo applicationInfo = com.tsf.extend.h.b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            return applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_SUPPORT_MODULES");
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static boolean g(String str) {
        try {
            ApplicationInfo applicationInfo = com.tsf.extend.h.b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("CMLAUNCHER_WIDGETSKIN", false);
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public static boolean h(String str) {
        try {
            ApplicationInfo applicationInfo = com.tsf.extend.h.b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            return (applicationInfo == null || applicationInfo.metaData == null || !ah.d(applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_VERSION"))) ? false : true;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public static String i(String str) {
        try {
            ApplicationInfo applicationInfo = com.tsf.extend.h.b().getPackageManager().getApplicationInfo(str, ItemInfo.APP_INTENT);
            if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean("CMLAUNCHER_WIDGETSKIN", false) || !ah.d(applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_VERSION"))) {
                return null;
            }
            return applicationInfo.metaData.getString("CMLAUNCHER_WIDGETSKIN_CHANNEL");
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public void a(final int i, final String str, final a.InterfaceC0048a<b> interfaceC0048a, final int i2) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.11
            @Override // java.lang.Runnable
            public void run() {
                Context context;
                BitmapFactory.Options options;
                try {
                    context = com.tsf.extend.h.b().createPackageContext(str, 3);
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                    context = null;
                }
                if (context == null || i == 0) {
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.11.1
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC0048a.a(null, -1, null);
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
                    final b bVar = new b();
                    bVar.a = str;
                    bVar.b = decodeResource;
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.11.2
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC0048a.a(null, bVar);
                        }
                    });
                } catch (Throwable th) {
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.11.3
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC0048a.a(null, -1, null);
                        }
                    });
                }
            }
        });
    }

    public void a(final String str, final List<String> list, final a.InterfaceC0048a<b> interfaceC0048a, final int i, final int i2) {
        if (list == null || list.size() == 0 || list.size() < i2) {
            interfaceC0048a.a(null, -1, null);
            return;
        }
        final String str2 = list.get(i2) + "_" + i;
        Bitmap a2 = a(str2);
        if (a2 != null) {
            b bVar = new b();
            bVar.a = str;
            bVar.b = a2;
            interfaceC0048a.a(null, bVar);
            return;
        }
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.12
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
                    final b bVar2 = new b();
                    bVar2.a = str;
                    bVar2.b = decodeFile;
                    v.this.a(str2, bVar2.b);
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.12.1
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC0048a.a(null, bVar2);
                        }
                    });
                } catch (Throwable th) {
                    com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.12.2
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC0048a.a(null, -1, null);
                        }
                    });
                }
            }
        });
    }

    public void a(String str, aq aqVar, a.InterfaceC0048a<b> interfaceC0048a, int i, int i2) {
        a(str, aqVar.t(), interfaceC0048a, i, i2);
    }

    public void a(String str, View view, a.InterfaceC0048a<Pair<String, Bitmap>> interfaceC0048a, int i, int i2) {
        a(str, interfaceC0048a, l.a.LOW, i, i2);
    }

    public void c(String str, a.InterfaceC0048a<Pair<String, Bitmap>> interfaceC0048a) {
        a(str, interfaceC0048a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(final long j) {
        com.android.volley.toolbox.m mVar = new com.android.volley.toolbox.m(1, "https://cml.ksmobile.com/Theme/downloadReport", new n.b<String>() { // from class: com.tsf.extend.theme.v.2
            @Override // com.android.volley.n.b
            public void a(String str) {
            }
        }, null) { // from class: com.tsf.extend.theme.v.3
            @Override // com.android.volley.l
            protected Map<String, String> n() {
                HashMap hashMap = new HashMap();
                hashMap.put("id", j + "");
                return hashMap;
            }
        };
        mVar.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
        a(mVar);
    }

    private c j(JSONObject jSONObject) {
        c cVar = new c();
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
            c.a k = k(jSONObject2);
            if (k != null) {
                cVar.a().add(k);
                if (cVar.a().size() >= optLong) {
                    break;
                }
            }
        }
        if (cVar.a().size() == 0) {
            return null;
        }
        return cVar;
    }

    private c.a k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        c.a aVar = new c.a();
        aVar.a = jSONObject.optString("id");
        aVar.b = jSONObject.optString("type");
        aVar.c = jSONObject.optString("banner_img");
        if ("1".equals(aVar.b)) {
            aVar.d = i(jSONObject);
        } else if ("2".equals(aVar.b)) {
            aVar.d = com.tsf.extend.wallpaper.m.a(jSONObject, com.tsf.extend.wallpaper.ai.NewType);
        } else if ("3".equals(aVar.b)) {
            aVar.d = jSONObject.optString("banner_img_url");
        } else if (!"4".equals(aVar.b)) {
            return null;
        } else {
            a aVar2 = new a();
            aVar2.a = jSONObject.optString("album_id");
            aVar2.b = jSONObject.optString("album_name");
            aVar.d = aVar2;
        }
        return aVar;
    }

    public static boolean j(String str) {
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

    public Bitmap a(Context context, BitmapFactory.Options options) {
        File file;
        if (PersonalizationActivity.e) {
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
    public static void a(android.content.Context r6, android.graphics.Bitmap r7) {
        /*
            r0 = 0
            boolean r1 = com.tsf.extend.wallpaper.PersonalizationActivity.e     // Catch: java.lang.Throwable -> L2b
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.v.a(android.content.Context, android.graphics.Bitmap):void");
    }

    public static void c(final a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.4
            @Override // java.lang.Runnable
            public void run() {
                Object a2 = com.tsf.extend.base.b.a.a.a().a("DATA_RECOMMEND_CACHE");
                final com.tsf.extend.base.b.a aVar = a2 instanceof com.tsf.extend.base.b.a ? (com.tsf.extend.base.b.a) a2 : null;
                if (aVar != null && aVar.d()) {
                    com.tsf.extend.base.b.a.a.a().b("DATA_RECOMMEND_CACHE");
                    aVar = null;
                }
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.InterfaceC0048a.this.a(null, aVar);
                    }
                });
            }
        });
    }

    public void a(final com.tsf.extend.base.b.a aVar) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.5
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.base.b.a.a.a().a("DATA_RECOMMEND_CACHE", aVar);
            }
        });
    }
}
