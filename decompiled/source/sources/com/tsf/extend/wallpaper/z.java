package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.android.volley.m;
import com.android.volley.n;
import com.tsf.extend.base.d.a;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.WallpaperDetail;
import com.tsf.extend.wallpaper.m;
import com.tsf.extend.wallpaper.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class z extends com.tsf.extend.base.d.a implements o.a {
    private static z i;
    private String t;
    private o u;
    private List<WeakReference<WallpaperDetail.e>> v;
    private SparseArray<Integer> w;
    public static String b = "DATA_WALLPAPER_COMMON";
    public static String c = "DATA_WALLPAPER_CATEGORY";
    public static String d = "DATA_WALLPAPER_CATEGORY_LIST";
    public static String e = "DATA_PG_TEMPLATE";
    public static String f = "DATA_WALLPAPER_LOCKER";
    public static String g = "DATA_LOCKER_WALLPAPER_TAB";
    public static String h = "DATA_LIVE_WALLPAPER_TAB";
    private static String j = "https://cml.ksmobile.com/WallPaper/getWallPaperList?w=%s&h=%s&source=launch_wp_client&mcc=%s&brand=%s";
    private static String k = "&l_id_t=2&l_id=%s&wp_t=%s&l_dc=%s";
    private static String l = "&l_id_t=1&wp_t=%s";
    private static String m = "&l_id_t=2&l_id=%s&cat=%s&l_dc=%s&p=%s";
    private static String n = "&l_id_t=1&cat=%s";
    private static String o = "&sort_livewp=%s";
    private static String p = o + "&l_id=%s&p=%s";
    private static String q = "https://cml.ksmobile.com/WallPaper/getCategoryList?mcc=%s&brand=%s";
    private static String r = "http://cdn.dl.pg.ksmobile.com/ga/web/api.php?path=/api/templateList";
    private static String s = "https://cml.ksmobile.com/WallPaper/changeWallPaperSet?mcc=%s";

    public static synchronized z h() {
        z zVar;
        synchronized (z.class) {
            if (i == null) {
                i = new z();
            }
            zVar = i;
        }
        return zVar;
    }

    private z() {
        Context b2 = com.tsf.extend.h.b();
        this.u = new o(com.tsf.extend.base.f.c.a(b2, null));
        this.u.a(this);
        a(b2, this.u);
        String b3 = com.tsf.extend.base.j.d.b(b2);
        b3 = b3 == null ? "null" : b3;
        this.t = b3;
        String str = Build.BRAND;
        j = String.format(j, "" + com.tsf.extend.base.j.p.b(), "" + com.tsf.extend.base.j.p.c(), b3, str);
        q = String.format(q, b3, str);
        s = String.format(s, b3);
        this.w = new SparseArray<>();
        this.w.put(1, Integer.valueOf(f.g.wallpaper_category_1));
        this.w.put(12, Integer.valueOf(f.g.wallpaper_category_12));
        this.w.put(6, Integer.valueOf(f.g.wallpaper_category_6));
        this.w.put(11, Integer.valueOf(f.g.wallpaper_category_11));
        this.w.put(15, Integer.valueOf(f.g.wallpaper_category_15));
        this.w.put(2, Integer.valueOf(f.g.wallpaper_category_2));
        this.w.put(18, Integer.valueOf(f.g.wallpaper_category_18));
        this.w.put(25, Integer.valueOf(f.g.wallpaper_category_25));
        this.w.put(7, Integer.valueOf(f.g.wallpaper_category_7));
        this.w.put(4, Integer.valueOf(f.g.wallpaper_category_4));
        this.w.put(21, Integer.valueOf(f.g.wallpaper_category_21));
        this.w.put(29, Integer.valueOf(f.g.wallpaper_category_29));
        this.w.put(28, Integer.valueOf(f.g.wallpaper_category_28));
        this.w.put(30, Integer.valueOf(f.g.wallpaper_category_30));
        this.w.put(31, Integer.valueOf(f.g.wallpaper_category_31));
        this.w.put(32, Integer.valueOf(f.g.wallpaper_category_32));
        this.w.put(33, Integer.valueOf(f.g.wallpaper_category_33));
    }

    @Override // com.tsf.extend.base.d.a
    protected String a(String str, a.b bVar, int i2, JSONObject jSONObject) {
        if (e.equals(str)) {
            return r;
        }
        if (d.equals(str)) {
            return q;
        }
        if (g.equals(str)) {
            if (TextUtils.isEmpty(this.t)) {
                this.t = com.tsf.extend.base.j.d.b(com.tsf.extend.h.b());
            }
            return "https://cml.ksmobile.com/rand/wp?count=20&mcc=" + this.t;
        } else if (jSONObject == null) {
            return null;
        } else {
            boolean optBoolean = jSONObject.optBoolean("isCategory", false);
            long optLong = jSONObject.optLong("catId");
            long optLong2 = jSONObject.optLong("typeId");
            long optLong3 = jSONObject.optLong("lastId");
            int optInt = jSONObject.optInt("downloadCount");
            boolean equals = h.equals(str);
            switch (bVar) {
                case LoadCache:
                    if (equals) {
                        return j + String.format(o, "1");
                    }
                    if (!optBoolean) {
                        optLong = optLong2;
                    }
                    return j + String.format(optBoolean ? n : l, Long.valueOf(optLong));
                case Refresh:
                    return optBoolean ? j + String.format(n, Long.valueOf(optLong)) : equals ? j + String.format(o, "1") : j + String.format(l, Long.valueOf(optLong2));
                case LoadMore:
                    return optBoolean ? j + String.format(m, Long.valueOf(optLong3), Long.valueOf(optLong), Integer.valueOf(optInt), Integer.valueOf(i2)) : equals ? j + String.format(p, "1", Long.valueOf(optLong3), Integer.valueOf(i2)) : j + String.format(k, Long.valueOf(optLong3), Long.valueOf(optLong2), Integer.valueOf(optInt));
                default:
                    return null;
            }
        }
    }

    @Override // com.tsf.extend.base.d.a
    protected String a() {
        return "THEME_IMAGE_REQEUST";
    }

    @Override // com.tsf.extend.base.d.a
    protected com.tsf.extend.base.b.a a(String str, String str2, JSONObject jSONObject) {
        if (str == null) {
            return null;
        }
        if (str.equals(d)) {
            return d(jSONObject);
        }
        if (str.equals(e)) {
            return b(jSONObject);
        }
        if (str.equals(g)) {
            return a(jSONObject);
        }
        return c(jSONObject);
    }

    private j a(JSONObject jSONObject) {
        ai aiVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        j jVar = new j();
        jVar.a(System.currentTimeMillis());
        JSONObject optJSONObject = jSONObject.optJSONObject("page");
        if (optJSONObject != null) {
            jVar.a(optJSONObject.optInt("page"));
            jVar.c(optJSONObject.optInt("total"));
        }
        long optLong = jSONObject.optLong("wpCategoryID");
        long optLong2 = jSONObject.optLong("wpTypeID");
        if (optLong != 0) {
            jVar.c(optLong);
        } else {
            jVar.b(optLong2);
        }
        ai[] values = ai.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aiVar = null;
                break;
            }
            aiVar = values[i2];
            if (aiVar.a() == optLong2) {
                break;
            }
            i2++;
        }
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            jVar.a().add(m.a(optJSONArray.getJSONObject(i3), aiVar));
        }
        return jVar;
    }

    @Override // com.tsf.extend.base.d.a
    public void a(com.android.volley.s sVar) {
    }

    @Override // com.tsf.extend.base.d.a
    public com.tsf.extend.base.b.a b() {
        return null;
    }

    public void a(List<WeakReference<WallpaperDetail.e>> list) {
        this.v = list;
    }

    public String a(Context context, int i2) {
        Integer num;
        if (context == null || i2 == 0 || (num = this.w.get(i2)) == null) {
            return "";
        }
        return context.getResources().getString(num.intValue());
    }

    public com.tsf.extend.base.b.a a(long j2, String str) {
        com.tsf.extend.base.b.a aVar = d().get(a(str, j2, 0L));
        if (aVar == null || aVar.d()) {
            return null;
        }
        return aVar;
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, long j2, long j3, long j4, String str) {
        String a2 = a(str, j3, j4);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("typeId", j3);
            jSONObject.put("catId", j4);
            jSONObject.put("lastId", j2);
            jSONObject.put("isCategory", c.equals(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a(a2, interfaceC0048a, bVar, jSONObject);
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar, long j2, long j3, int i2, long j4, String str, int i3) {
        String a2 = a(str, j3, j4);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("typeId", j3);
            jSONObject.put("catId", j4);
            jSONObject.put("isCategory", c.equals(str));
            jSONObject.put("lastId", j2);
            jSONObject.put("downloadCount", i2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a(a2, interfaceC0048a, a.b.LoadMore, jSONObject);
    }

    public void a(final m.a aVar, a.InterfaceC0048a<Pair<m.a, Bitmap>> interfaceC0048a, boolean z, int i2, int i3) {
        final WeakReference weakReference = new WeakReference(interfaceC0048a);
        a(new ac(true, aVar, new n.b<Bitmap>() { // from class: com.tsf.extend.wallpaper.z.1
            @Override // com.android.volley.n.b
            public void a(Bitmap bitmap) {
                a.InterfaceC0048a interfaceC0048a2 = (a.InterfaceC0048a) weakReference.get();
                if (bitmap != null && interfaceC0048a2 != null) {
                    interfaceC0048a2.a(null, Pair.create(aVar, bitmap));
                }
            }
        }, i2, i3, Bitmap.Config.ARGB_8888, new n.a() { // from class: com.tsf.extend.wallpaper.z.2
            @Override // com.android.volley.n.a
            public void a(com.android.volley.s sVar) {
                a.InterfaceC0048a interfaceC0048a2 = (a.InterfaceC0048a) weakReference.get();
                if (interfaceC0048a2 != null) {
                    interfaceC0048a2.a(null, 0, Pair.create(aVar, null));
                }
            }
        }, z));
    }

    private static com.tsf.extend.base.b.a b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        u uVar = new u();
        uVar.a(System.currentTimeMillis());
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            uVar.a().add(m.a(optJSONArray.getJSONObject(i2)));
        }
        return uVar;
    }

    private static com.tsf.extend.base.b.a c(JSONObject jSONObject) {
        ai aiVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        u uVar = new u();
        uVar.a(System.currentTimeMillis());
        JSONObject optJSONObject = jSONObject.optJSONObject("page");
        if (optJSONObject != null) {
            uVar.a(optJSONObject.optInt("page"));
            uVar.c(optJSONObject.optInt("total"));
        }
        long optLong = jSONObject.optLong("wpCategoryID");
        long optLong2 = jSONObject.optLong("wpTypeID");
        if (optLong != 0) {
            uVar.c(optLong);
        } else {
            uVar.b(optLong2);
        }
        ai[] values = ai.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aiVar = null;
                break;
            }
            aiVar = values[i2];
            if (aiVar.a() == optLong2) {
                break;
            }
            i2++;
        }
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            uVar.a().add(m.a(optJSONArray.getJSONObject(i3), aiVar));
        }
        return uVar;
    }

    public static synchronized void i() {
        synchronized (z.class) {
            if (i != null) {
                i.k();
            }
        }
    }

    @Override // com.tsf.extend.base.d.a
    public void f() {
        super.f();
        i();
        i = null;
    }

    public void b(final List<String> list) {
        e().a(new m.a() { // from class: com.tsf.extend.wallpaper.z.3
            @Override // com.android.volley.m.a
            public boolean a(com.android.volley.l<?> lVar) {
                return (lVar instanceof ac) && list.contains(((ac) lVar).d());
            }
        });
    }

    @Override // com.tsf.extend.wallpaper.o.a
    public void a(ac acVar, long j2) {
        if (this.v != null) {
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                WeakReference<WallpaperDetail.e> weakReference = this.v.get(i2);
                if (weakReference.get() != null) {
                    WallpaperDetail.e eVar = weakReference.get();
                    if (eVar.a().equals(acVar.d())) {
                        long x = acVar.x();
                        if (x > 0) {
                            eVar.a((int) ((((float) j2) / ((float) x)) * 100.0f));
                        } else if (x == 0) {
                            eVar.a(0);
                        }
                    }
                }
            }
        }
    }

    public void a(a.InterfaceC0048a<com.tsf.extend.base.b.a> interfaceC0048a, a.b bVar) {
        a(d, interfaceC0048a, bVar, (JSONObject) null);
    }

    private com.tsf.extend.base.b.a d(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        int optInt = jSONObject.optInt("resCode");
        if (optJSONArray == null || optInt != 0) {
            return null;
        }
        com.tsf.extend.h.b();
        com.tsf.extend.base.b.a aVar = new com.tsf.extend.base.b.a();
        aVar.a(new a());
        aVar.a(System.currentTimeMillis());
        aVar.a(jSONObject.optString("version"));
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= optJSONArray.length()) {
                return aVar;
            }
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
            w wVar = new w();
            int optInt2 = jSONObject2.optInt("id");
            Integer num = this.w.get(optInt2);
            if (num != null && num.intValue() != 0) {
                wVar.a(optInt2);
                wVar.a(jSONObject2.optString("name"));
                wVar.b(jSONObject2.optString("description"));
                wVar.c(jSONObject2.optString("image_url"));
                aVar.a().add(wVar);
            }
            i2 = i3 + 1;
        }
    }

    public com.tsf.extend.base.b.a j() {
        return d().get(d);
    }

    private void k() {
        e().a(new m.a() { // from class: com.tsf.extend.wallpaper.z.4
            @Override // com.android.volley.m.a
            public boolean a(com.android.volley.l<?> lVar) {
                return true;
            }
        });
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(b) || str.startsWith(c) || str.startsWith(e) || str.startsWith(h) || str.startsWith(g) || d.equals(str);
    }

    public void a(final long j2) {
        com.android.volley.toolbox.m mVar = new com.android.volley.toolbox.m(1, s, new n.b<String>() { // from class: com.tsf.extend.wallpaper.z.5
            @Override // com.android.volley.n.b
            public void a(String str) {
            }
        }, null) { // from class: com.tsf.extend.wallpaper.z.6
            @Override // com.android.volley.l
            protected Map<String, String> n() {
                HashMap hashMap = new HashMap();
                hashMap.put("sid", "" + j2);
                hashMap.put("op", "1");
                return hashMap;
            }
        };
        mVar.a((com.android.volley.p) new com.android.volley.d(30000, 1, 1.0f));
        a(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements com.tsf.extend.base.b.b {
        private a() {
        }

        @Override // com.tsf.extend.base.b.b
        public boolean a(com.tsf.extend.base.b.a aVar) {
            return System.currentTimeMillis() - aVar.c() > TimeUnit.HOURS.toMillis(10L);
        }
    }

    private String a(String str, long j2, long j3) {
        if (b.equals(str)) {
            return b + j2;
        }
        if (c.equals(str)) {
            return c + j3;
        }
        if (e.equals(str)) {
            return e;
        }
        if (h.equals(str)) {
            return h;
        }
        if (f.equals(str)) {
            return g;
        }
        return e;
    }
}
