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
import java.io.FileOutputStream;
import java.io.IOException;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class v extends com.tsf.extend.base.d.a {
    private static volatile v b = null;
    private static String e = null;
    private static final List<String> h = Lists.newArrayList();
    private String c;
    private String d;
    private List<k> f = Lists.newArrayList();
    private boolean g = false;

    public static class a implements Serializable {
        public String a;
        public String b;
    }

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

    public String b(String str, a.b bVar, int i, JSONObject jSONObject) {
        String strD;
        JSONException e2;
        String string;
        String string2 = null;
        if ("DATA_PLAY".equals(str)) {
            strD = String.format("https://cml.ksmobile.com/ThemeBanner/getBannerList?mcc=%s&w=%d&h=%d&isnew=1&f=%s", this.c, Integer.valueOf(com.tsf.extend.base.j.p.b()), Integer.valueOf(com.tsf.extend.base.j.p.c()), this.d);
        } else if (!TextUtils.isEmpty(str) && str.contains("DATA_RELATIVE")) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit == null || strArrSplit.length < 3) {
                return null;
            }
            long j = Long.parseLong(strArrSplit[2]);
            if (j == 0) {
                return null;
            }
            int iA = a(str, bVar);
            ag agVar = new ag("recom?");
            agVar.a("190", String.valueOf(j), String.valueOf(iA != -1 ? iA : 0));
            strD = agVar.d();
        } else if (str.contains("DATA_RECOM_BY_NAME")) {
            try {
                string2 = jSONObject.getString("packname");
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            int iA2 = a(str, bVar);
            ag agVar2 = new ag("recom?");
            agVar2.b("120", String.valueOf(string2), String.valueOf(iA2 != -1 ? iA2 : 0));
            strD = agVar2.d();
        } else if (str.contains("DATA_ALBUM")) {
            if (jSONObject == null) {
                return null;
            }
            long jOptLong = jSONObject.optLong("album_id", -1L);
            if (jOptLong <= 0) {
                return null;
            }
            strD = String.format("https://cml.ksmobile.com/Album/getThemeList?p=%s&album_id=%d&mcc=%s&p_n=21&pos=%s", Integer.valueOf(i), Long.valueOf(jOptLong), this.c, e);
        } else if ("DATA_DIY".equals(str)) {
            strD = String.format("https://cml.ksmobile.com/Album/getDiyThemeList?p=%s&mcc=%s", Integer.valueOf(i), this.c);
        } else if ("DATA_CATEGORY".equals(str)) {
            strD = new s().d();
        } else if (str.contains("DATA_WALLPAPE_RELATIVE")) {
            int iA3 = a(str, bVar);
            try {
                string = jSONObject.getString("categoryId");
            } catch (JSONException e4) {
                e2 = e4;
                string = null;
            }
            try {
                string2 = jSONObject.getString("id");
            } catch (JSONException e5) {
                e2 = e5;
                e2.printStackTrace();
            }
            ap apVar = new ap();
            apVar.a(string, string2, String.valueOf(iA3 != -1 ? iA3 : 0));
            strD = apVar.d();
        } else if (str.equals("DATA_SEARCH")) {
            int iA4 = a(str, bVar);
            try {
                string2 = jSONObject.getString("keyword");
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            aj ajVar = new aj();
            ajVar.b(string2, String.valueOf(iA4 != -1 ? iA4 : 0));
            strD = ajVar.d();
        } else if (str.equals("DATA_SEARCH_TAG")) {
            strD = new ak().d();
        } else if (str != null && str.contains("DATA_DATA_FF")) {
            ac acVar = new ac("PRecom?");
            acVar.e();
            strD = acVar.d();
        } else {
            int iA5 = a(str, bVar);
            ag agVar3 = new ag("tlist?", true);
            agVar3.b("DATA_NEW".equals(str) ? "101" : "102", String.valueOf(iA5 != -1 ? iA5 : 0));
            strD = agVar3.d();
        }
        return strD;
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
        com.android.volley.toolbox.j jVarA = com.tsf.extend.base.f.b.a(a(j, str), null, interfaceC0048a, new b.a<p>() { // from class: com.tsf.extend.theme.v.6
            @Override // com.tsf.extend.base.f.b.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p b(JSONObject jSONObject) {
                try {
                    return v.this.g(jSONObject);
                } catch (JSONException e2) {
                    return null;
                }
            }
        });
        jVarA.a(false);
        jVarA.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
        a(jVarA);
    }

    public void a(final a.InterfaceC0048a<k> interfaceC0048a, final long j, String str, String str2) {
        k kVarA;
        Iterator<Map.Entry<String, com.tsf.extend.base.b.a>> it = d().entrySet().iterator();
        k kVar = null;
        while (true) {
            if (!it.hasNext()) {
                kVarA = kVar;
                break;
            }
            Map.Entry<String, com.tsf.extend.base.b.a> next = it.next();
            if (next.getValue() instanceof p) {
                kVarA = a((p) next.getValue(), j);
                if (kVarA != null) {
                    break;
                } else {
                    kVar = kVarA;
                }
            }
        }
        if (kVarA != null) {
            interfaceC0048a.a(null, kVarA);
        } else {
            a(j, str, new a.InterfaceC0048a<p>() { // from class: com.tsf.extend.theme.v.7
                @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                public void a(JSONObject jSONObject, p pVar) {
                    if (pVar != null) {
                        k kVarA2 = v.this.a(pVar, j);
                        if (kVarA2 != null) {
                            interfaceC0048a.a(jSONObject, kVarA2);
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
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListNewArrayList.add(b(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        aVar.a(arrayListNewArrayList);
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
        String strOptString = jSONObject.optString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        if (jSONObject.optInt("diyEnabled") == 1) {
        }
        aVar.a(strOptString);
        aVar.a(System.currentTimeMillis());
        aVar.a(z);
        aVar.e(jSONObject.optString("album_name"));
        aVar.f(jSONObject.optString("album_url"));
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListNewArrayList.add(i(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        aVar.a(arrayListNewArrayList);
        return aVar;
    }

    private p d(JSONObject jSONObject) throws JSONException {
        p pVar = new p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        String strOptString = jSONObject.optString("version");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        pVar.b(jSONObject.optInt("diyEnabled") == 1);
        pVar.a(strOptString);
        pVar.a(System.currentTimeMillis());
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                k kVar = new k();
                kVar.a(jSONObject2.optInt("id"));
                kVar.k(jSONObject2.optString("cover_url"));
                kVar.d(jSONObject2.optString("album_name"));
                kVar.g(jSONObject2.optInt("type"));
                arrayListNewArrayList.add(kVar);
            }
        }
        pVar.a(arrayListNewArrayList);
        return pVar;
    }

    private p e(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        p pVar = new p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        a(pVar, jSONObject);
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("type");
                if (string.equals("1")) {
                    arrayListNewArrayList.add(i(jSONObject2));
                } else if (string.equals("2") && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("list")) != null) {
                    arrayListNewArrayList.add(a(jSONArrayOptJSONArray));
                }
            }
        }
        pVar.a(arrayListNewArrayList);
        return pVar;
    }

    private k a(JSONArray jSONArray) {
        int length;
        n nVar = null;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            nVar = new n();
            ArrayList arrayList = new ArrayList();
            nVar.b(arrayList);
            int iMin = Math.min(length, 50);
            for (int i = 0; i < iMin; i++) {
                c.a aVarK = k(jSONArray.getJSONObject(i));
                if (aVarK != null) {
                    arrayList.add(aVarK);
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
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListNewArrayList.add(i(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        dVar.a(arrayListNewArrayList);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p g(JSONObject jSONObject) {
        p pVar = new p();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        a(pVar, jSONObject);
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListNewArrayList.add(i(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        pVar.a(arrayListNewArrayList);
        return pVar;
    }

    private p h(JSONObject jSONObject) {
        p pVarG = g(jSONObject);
        final int iOptInt = jSONObject.optInt("ttl", 10);
        if (pVarG != null) {
            pVarG.a(new com.tsf.extend.base.b.b() { // from class: com.tsf.extend.theme.v.8
                @Override // com.tsf.extend.base.b.b
                public boolean a(com.tsf.extend.base.b.a aVar) {
                    return System.currentTimeMillis() - aVar.c() > TimeUnit.MINUTES.toMillis((long) iOptInt);
                }
            });
        }
        return pVarG;
    }

    private void a(p pVar, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("version");
        boolean z = jSONObject.optInt("hasMore") == 1;
        boolean z2 = jSONObject.optInt("diyEnabled") == 1;
        pVar.a(strOptString);
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
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListNewArrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        kVar.a(arrayListNewArrayList);
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
                final ArrayList arrayListNewArrayList = Lists.newArrayList();
                arrayListNewArrayList.addAll(v.this.f);
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0048a.a(null, arrayListNewArrayList);
                    }
                });
            }
        });
    }

    public void b(final a.InterfaceC0048a<List<k>> interfaceC0048a) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.10
            @Override // java.lang.Runnable
            public void run() {
                final List<k> listD = ai.a().d();
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0048a.a(null, listD);
                    }
                });
            }
        });
    }

    public static List<aq> i() {
        aq aqVarA;
        ArrayList arrayList = new ArrayList();
        File[] fileArrC = com.tsf.extend.theme.diy.e.c(com.tsf.extend.h.b());
        if (fileArrC != null) {
            for (File file : fileArrC) {
                if (file != null && file.isDirectory() && (aqVarA = com.tsf.extend.theme.diy.e.a(file.getAbsolutePath(), true)) != null) {
                    arrayList.add(aqVarA);
                }
            }
        }
        return arrayList;
    }

    public static f c(String str) {
        f fVarA;
        if (!e(str)) {
            return null;
        }
        try {
            Context contextCreatePackageContext = com.tsf.extend.h.b().createPackageContext(str, 3);
            HashMap<String, Object> mapD = com.tsf.extend.base.j.d.d(contextCreatePackageContext);
            if (contextCreatePackageContext == null || (fVarA = ae.a(contextCreatePackageContext, mapD)) == null || TextUtils.isEmpty(fVarA.i())) {
                fVarA = null;
            }
            return fVarA;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public boolean d(String str) {
        if (this.f == null || this.f.size() == 0) {
            return false;
        }
        Iterator<k> it = this.f.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().g())) {
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
            public void run() throws PackageManager.NameNotFoundException {
                Context contextCreatePackageContext;
                BitmapFactory.Options options;
                try {
                    contextCreatePackageContext = com.tsf.extend.h.b().createPackageContext(str, 3);
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                    contextCreatePackageContext = null;
                }
                if (contextCreatePackageContext == null || i == 0) {
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
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(contextCreatePackageContext.getResources(), i, options);
                    final b bVar = new b();
                    bVar.a = str;
                    bVar.b = bitmapDecodeResource;
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
        Bitmap bitmapA = a(str2);
        if (bitmapA != null) {
            b bVar = new b();
            bVar.a = str;
            bVar.b = bitmapA;
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
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(Uri.parse((String) list.get(i2)).getPath(), options);
                    final b bVar2 = new b();
                    bVar2.a = str;
                    bVar2.b = bitmapDecodeFile;
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

    void b(final long j) {
        com.android.volley.toolbox.m mVar = new com.android.volley.toolbox.m(1, "https://cml.ksmobile.com/Theme/downloadReport", new n.b<String>() { // from class: com.tsf.extend.theme.v.2
            @Override // com.android.volley.n.b
            public void a(String str) {
            }
        }, null) { // from class: com.tsf.extend.theme.v.3
            @Override // com.android.volley.l
            protected Map<String, String> n() {
                HashMap map = new HashMap();
                map.put("id", j + "");
                return map;
            }
        };
        mVar.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
        a(mVar);
    }

    private c j(JSONObject jSONObject) throws JSONException {
        c cVar = new c();
        if (jSONObject.optInt("resCode", 1) != 0) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        long jOptLong = jSONObject.optLong("showCount");
        if (jSONArrayOptJSONArray == null || jOptLong == 0) {
            return null;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                return null;
            }
            c.a aVarK = k(jSONObject2);
            if (aVarK != null) {
                cVar.a().add(aVarK);
                if (cVar.a().size() >= jOptLong) {
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
        } else {
            if (!"4".equals(aVar.b)) {
                return null;
            }
            a aVar2 = new a();
            aVar2.a = jSONObject.optString("album_id");
            aVar2.b = jSONObject.optString("album_name");
            aVar.d = aVar2;
        }
        return aVar;
    }

    public static boolean j(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("DATA_DATA_FF")) {
            return true;
        }
        if ((!TextUtils.isEmpty(str) && str.equals("DATA_RECOMMEND_CACHE")) || "DATA_PLAY".equals(str) || "DATA_NEW".equals(str) || "DATA_HOT".equals(str) || "DATA_DIY".equals(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str) || !str.contains("DATA_ALBUM")) {
            return !TextUtils.isEmpty(str) && str.contains("DATA_RELATIVE");
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

    public static void a(Context context, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(new File(context.getFilesDir().getAbsolutePath(), PersonalizationActivity.e ? "diy_theme_default_3d.png" : "diy_theme_default_3d.png"));
        } catch (Throwable th2) {
            fileOutputStream = null;
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                }
            }
        } catch (Throwable th3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e3) {
                }
            }
        }
    }

    public static void c(final a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a) {
        com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.v.4
            @Override // java.lang.Runnable
            public void run() {
                Object objA = com.tsf.extend.base.b.a.a.a().a("DATA_RECOMMEND_CACHE");
                final com.tsf.extend.base.b.a aVar = objA instanceof com.tsf.extend.base.b.a ? (com.tsf.extend.base.b.a) objA : null;
                if (aVar != null && aVar.d()) {
                    com.tsf.extend.base.b.a.a.a().b("DATA_RECOMMEND_CACHE");
                    aVar = null;
                }
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.v.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0048a.a(null, aVar);
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
