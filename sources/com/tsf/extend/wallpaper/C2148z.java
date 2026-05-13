package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0798m;
import com.android.volley.C0802n;
import com.android.volley.C0809s;
import com.android.volley.InterfaceC0806p;
import com.android.volley.toolbox.C0841m;
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.InterfaceC1373b;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p076f.C1406c;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.wallpaper.C2094m;
import com.tsf.extend.wallpaper.C2097o;
import com.tsf.extend.wallpaper.WallpaperDetail;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.wallpaper.z */
/* loaded from: classes.dex */
public class C2148z extends AbstractC1386a implements C2097o.InterfaceC2098a {

    /* renamed from: i */
    private static C2148z f7092i;

    /* renamed from: t */
    private String f7103t;

    /* renamed from: u */
    private C2097o f7104u;

    /* renamed from: v */
    private List<WeakReference<WallpaperDetail.View$OnClickListenerC1990e>> f7105v;

    /* renamed from: w */
    private SparseArray<Integer> f7106w;

    /* renamed from: b */
    public static String f7085b = "DATA_WALLPAPER_COMMON";

    /* renamed from: c */
    public static String f7086c = "DATA_WALLPAPER_CATEGORY";

    /* renamed from: d */
    public static String f7087d = "DATA_WALLPAPER_CATEGORY_LIST";

    /* renamed from: e */
    public static String f7088e = "DATA_PG_TEMPLATE";

    /* renamed from: f */
    public static String f7089f = "DATA_WALLPAPER_LOCKER";

    /* renamed from: g */
    public static String f7090g = "DATA_LOCKER_WALLPAPER_TAB";

    /* renamed from: h */
    public static String f7091h = "DATA_LIVE_WALLPAPER_TAB";

    /* renamed from: j */
    private static String f7093j = "https://cml.ksmobile.com/WallPaper/getWallPaperList?w=%s&h=%s&source=launch_wp_client&mcc=%s&brand=%s";

    /* renamed from: k */
    private static String f7094k = "&l_id_t=2&l_id=%s&wp_t=%s&l_dc=%s";

    /* renamed from: l */
    private static String f7095l = "&l_id_t=1&wp_t=%s";

    /* renamed from: m */
    private static String f7096m = "&l_id_t=2&l_id=%s&cat=%s&l_dc=%s&p=%s";

    /* renamed from: n */
    private static String f7097n = "&l_id_t=1&cat=%s";

    /* renamed from: o */
    private static String f7098o = "&sort_livewp=%s";

    /* renamed from: p */
    private static String f7099p = f7098o + "&l_id=%s&p=%s";

    /* renamed from: q */
    private static String f7100q = "https://cml.ksmobile.com/WallPaper/getCategoryList?mcc=%s&brand=%s";

    /* renamed from: r */
    private static String f7101r = "http://cdn.dl.pg.ksmobile.com/ga/web/api.php?path=/api/templateList";

    /* renamed from: s */
    private static String f7102s = "https://cml.ksmobile.com/WallPaper/changeWallPaperSet?mcc=%s";

    /* renamed from: h */
    public static synchronized C2148z m6199h() {
        C2148z c2148z;
        synchronized (C2148z.class) {
            if (f7092i == null) {
                f7092i = new C2148z();
            }
            c2148z = f7092i;
        }
        return c2148z;
    }

    private C2148z() {
        Context m8290b = C1547h.m8290b();
        this.f7104u = new C2097o(C1406c.m8765a(m8290b, null));
        this.f7104u.m6418a(this);
        m8808a(m8290b, this.f7104u);
        String m8685b = C1423d.m8685b(m8290b);
        m8685b = m8685b == null ? "null" : m8685b;
        this.f7103t = m8685b;
        String str = Build.BRAND;
        f7093j = String.format(f7093j, "" + C1437p.m8619b(), "" + C1437p.m8616c(), m8685b, str);
        f7100q = String.format(f7100q, m8685b, str);
        f7102s = String.format(f7102s, m8685b);
        this.f7106w = new SparseArray<>();
        this.f7106w.put(1, Integer.valueOf(C1536f.C1543g.wallpaper_category_1));
        this.f7106w.put(12, Integer.valueOf(C1536f.C1543g.wallpaper_category_12));
        this.f7106w.put(6, Integer.valueOf(C1536f.C1543g.wallpaper_category_6));
        this.f7106w.put(11, Integer.valueOf(C1536f.C1543g.wallpaper_category_11));
        this.f7106w.put(15, Integer.valueOf(C1536f.C1543g.wallpaper_category_15));
        this.f7106w.put(2, Integer.valueOf(C1536f.C1543g.wallpaper_category_2));
        this.f7106w.put(18, Integer.valueOf(C1536f.C1543g.wallpaper_category_18));
        this.f7106w.put(25, Integer.valueOf(C1536f.C1543g.wallpaper_category_25));
        this.f7106w.put(7, Integer.valueOf(C1536f.C1543g.wallpaper_category_7));
        this.f7106w.put(4, Integer.valueOf(C1536f.C1543g.wallpaper_category_4));
        this.f7106w.put(21, Integer.valueOf(C1536f.C1543g.wallpaper_category_21));
        this.f7106w.put(29, Integer.valueOf(C1536f.C1543g.wallpaper_category_29));
        this.f7106w.put(28, Integer.valueOf(C1536f.C1543g.wallpaper_category_28));
        this.f7106w.put(30, Integer.valueOf(C1536f.C1543g.wallpaper_category_30));
        this.f7106w.put(31, Integer.valueOf(C1536f.C1543g.wallpaper_category_31));
        this.f7106w.put(32, Integer.valueOf(C1536f.C1543g.wallpaper_category_32));
        this.f7106w.put(33, Integer.valueOf(C1536f.C1543g.wallpaper_category_33));
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    protected String mo6210a(String str, AbstractC1386a.EnumC1397b enumC1397b, int i, JSONObject jSONObject) {
        if (f7088e.equals(str)) {
            return f7101r;
        }
        if (f7087d.equals(str)) {
            return f7100q;
        }
        if (f7090g.equals(str)) {
            if (TextUtils.isEmpty(this.f7103t)) {
                this.f7103t = C1423d.m8685b(C1547h.m8290b());
            }
            return "https://cml.ksmobile.com/rand/wp?count=20&mcc=" + this.f7103t;
        } else if (jSONObject == null) {
            return null;
        } else {
            boolean optBoolean = jSONObject.optBoolean("isCategory", false);
            long optLong = jSONObject.optLong("catId");
            long optLong2 = jSONObject.optLong("typeId");
            long optLong3 = jSONObject.optLong("lastId");
            int optInt = jSONObject.optInt("downloadCount");
            boolean equals = f7091h.equals(str);
            switch (enumC1397b) {
                case LoadCache:
                    if (equals) {
                        return f7093j + String.format(f7098o, "1");
                    }
                    if (!optBoolean) {
                        optLong = optLong2;
                    }
                    return f7093j + String.format(optBoolean ? f7097n : f7095l, Long.valueOf(optLong));
                case Refresh:
                    return optBoolean ? f7093j + String.format(f7097n, Long.valueOf(optLong)) : equals ? f7093j + String.format(f7098o, "1") : f7093j + String.format(f7095l, Long.valueOf(optLong2));
                case LoadMore:
                    return optBoolean ? f7093j + String.format(f7096m, Long.valueOf(optLong3), Long.valueOf(optLong), Integer.valueOf(optInt), Integer.valueOf(i)) : equals ? f7093j + String.format(f7099p, "1", Long.valueOf(optLong3), Integer.valueOf(i)) : f7093j + String.format(f7094k, Long.valueOf(optLong3), Long.valueOf(optLong2), Integer.valueOf(optInt));
                default:
                    return null;
            }
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    protected String mo6221a() {
        return "THEME_IMAGE_REQEUST";
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: a */
    protected C1368a mo6209a(String str, String str2, JSONObject jSONObject) {
        if (str == null) {
            return null;
        }
        if (str.equals(f7087d)) {
            return m6201d(jSONObject);
        }
        if (str.equals(f7088e)) {
            return m6203b(jSONObject);
        }
        if (str.equals(f7090g)) {
            return m6207a(jSONObject);
        }
        return m6202c(jSONObject);
    }

    /* renamed from: a */
    private C2084j m6207a(JSONObject jSONObject) {
        EnumC2057ai enumC2057ai;
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        C2084j c2084j = new C2084j();
        c2084j.m8873a(System.currentTimeMillis());
        JSONObject optJSONObject = jSONObject.optJSONObject("page");
        if (optJSONObject != null) {
            c2084j.m8874a(optJSONObject.optInt("page"));
            c2084j.mo6378c(optJSONObject.optInt("total"));
        }
        long optLong = jSONObject.optLong("wpCategoryID");
        long optLong2 = jSONObject.optLong("wpTypeID");
        if (optLong != 0) {
            c2084j.m6377c(optLong);
        } else {
            c2084j.m6379b(optLong2);
        }
        EnumC2057ai[] values = EnumC2057ai.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC2057ai = null;
                break;
            }
            enumC2057ai = values[i];
            if (enumC2057ai.m6559a() == optLong2) {
                break;
            }
            i++;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            c2084j.m8875a().add(C2094m.m6446a(optJSONArray.getJSONObject(i2), enumC2057ai));
        }
        return c2084j;
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
    public void m6208a(List<WeakReference<WallpaperDetail.View$OnClickListenerC1990e>> list) {
        this.f7105v = list;
    }

    /* renamed from: a */
    public String m6218a(Context context, int i) {
        Integer num;
        if (context == null || i == 0 || (num = this.f7106w.get(i)) == null) {
            return "";
        }
        return context.getResources().getString(num.intValue());
    }

    /* renamed from: a */
    public C1368a m6219a(long j, String str) {
        C1368a c1368a = m8792d().get(m6211a(str, j, 0L));
        if (c1368a == null || c1368a.mo6376d()) {
            return null;
        }
        return c1368a;
    }

    /* renamed from: a */
    public void m6214a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, long j, long j2, long j3, String str) {
        String m6211a = m6211a(str, j2, j3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("typeId", j2);
            jSONObject.put("catId", j3);
            jSONObject.put("lastId", j);
            jSONObject.put("isCategory", f7086c.equals(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo8250a(m6211a, interfaceC1396a, enumC1397b, jSONObject);
    }

    /* renamed from: a */
    public void m6215a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b, long j, long j2, int i, long j3, String str, int i2) {
        String m6211a = m6211a(str, j2, j3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("typeId", j2);
            jSONObject.put("catId", j3);
            jSONObject.put("isCategory", f7086c.equals(str));
            jSONObject.put("lastId", j);
            jSONObject.put("downloadCount", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo8250a(m6211a, interfaceC1396a, AbstractC1386a.EnumC1397b.LoadMore, jSONObject);
    }

    /* renamed from: a */
    public void m6212a(final C2094m.C2095a c2095a, AbstractC1386a.InterfaceC1396a<Pair<C2094m.C2095a, Bitmap>> interfaceC1396a, boolean z, int i, int i2) {
        final WeakReference weakReference = new WeakReference(interfaceC1396a);
        m8807a(new C2039ac(true, c2095a, new C0802n.InterfaceC0804b<Bitmap>() { // from class: com.tsf.extend.wallpaper.z.1
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(Bitmap bitmap) {
                AbstractC1386a.InterfaceC1396a interfaceC1396a2 = (AbstractC1386a.InterfaceC1396a) weakReference.get();
                if (bitmap != null && interfaceC1396a2 != null) {
                    interfaceC1396a2.mo6245a(null, Pair.create(c2095a, bitmap));
                }
            }
        }, i, i2, Bitmap.Config.ARGB_8888, new C0802n.InterfaceC0803a() { // from class: com.tsf.extend.wallpaper.z.2
            @Override // com.android.volley.C0802n.InterfaceC0803a
            /* renamed from: a */
            public void mo6194a(C0809s c0809s) {
                AbstractC1386a.InterfaceC1396a interfaceC1396a2 = (AbstractC1386a.InterfaceC1396a) weakReference.get();
                if (interfaceC1396a2 != null) {
                    interfaceC1396a2.mo6247a(null, 0, Pair.create(c2095a, null));
                }
            }
        }, z));
    }

    /* renamed from: b */
    private static C1368a m6203b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        C2113u c2113u = new C2113u();
        c2113u.m8873a(System.currentTimeMillis());
        for (int i = 0; i < optJSONArray.length(); i++) {
            c2113u.m8875a().add(C2094m.m6447a(optJSONArray.getJSONObject(i)));
        }
        return c2113u;
    }

    /* renamed from: c */
    private static C1368a m6202c(JSONObject jSONObject) {
        EnumC2057ai enumC2057ai;
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        C2113u c2113u = new C2113u();
        c2113u.m8873a(System.currentTimeMillis());
        JSONObject optJSONObject = jSONObject.optJSONObject("page");
        if (optJSONObject != null) {
            c2113u.m8874a(optJSONObject.optInt("page"));
            c2113u.mo6378c(optJSONObject.optInt("total"));
        }
        long optLong = jSONObject.optLong("wpCategoryID");
        long optLong2 = jSONObject.optLong("wpTypeID");
        if (optLong != 0) {
            c2113u.m6377c(optLong);
        } else {
            c2113u.m6379b(optLong2);
        }
        EnumC2057ai[] values = EnumC2057ai.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC2057ai = null;
                break;
            }
            enumC2057ai = values[i];
            if (enumC2057ai.m6559a() == optLong2) {
                break;
            }
            i++;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            c2113u.m8875a().add(C2094m.m6446a(optJSONArray.getJSONObject(i2), enumC2057ai));
        }
        return c2113u;
    }

    /* renamed from: i */
    public static synchronized void m6198i() {
        synchronized (C2148z.class) {
            if (f7092i != null) {
                f7092i.m6196k();
            }
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a
    /* renamed from: f */
    public void mo6200f() {
        super.mo6200f();
        m6198i();
        f7092i = null;
    }

    /* renamed from: b */
    public void m6204b(final List<String> list) {
        m8791e().m11009a(new C0798m.InterfaceC0800a() { // from class: com.tsf.extend.wallpaper.z.3
            @Override // com.android.volley.C0798m.InterfaceC0800a
            /* renamed from: a */
            public boolean mo6193a(AbstractC0795l<?> abstractC0795l) {
                return (abstractC0795l instanceof C2039ac) && list.contains(((C2039ac) abstractC0795l).m11025d());
            }
        });
    }

    @Override // com.tsf.extend.wallpaper.C2097o.InterfaceC2098a
    /* renamed from: a */
    public void mo6213a(C2039ac c2039ac, long j) {
        if (this.f7105v != null) {
            int size = this.f7105v.size();
            for (int i = 0; i < size; i++) {
                WeakReference<WallpaperDetail.View$OnClickListenerC1990e> weakReference = this.f7105v.get(i);
                if (weakReference.get() != null) {
                    WallpaperDetail.View$OnClickListenerC1990e view$OnClickListenerC1990e = weakReference.get();
                    if (view$OnClickListenerC1990e.m6802a().equals(c2039ac.m11025d())) {
                        long m6642x = c2039ac.m6642x();
                        if (m6642x > 0) {
                            view$OnClickListenerC1990e.m6801a((int) ((((float) j) / ((float) m6642x)) * 100.0f));
                        } else if (m6642x == 0) {
                            view$OnClickListenerC1990e.m6801a(0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m6216a(AbstractC1386a.InterfaceC1396a<C1368a> interfaceC1396a, AbstractC1386a.EnumC1397b enumC1397b) {
        mo8250a(f7087d, interfaceC1396a, enumC1397b, (JSONObject) null);
    }

    /* renamed from: d */
    private C1368a m6201d(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        int optInt = jSONObject.optInt("resCode");
        if (optJSONArray == null || optInt != 0) {
            return null;
        }
        C1547h.m8290b();
        C1368a c1368a = new C1368a();
        c1368a.m8872a(new C2156a());
        c1368a.m8873a(System.currentTimeMillis());
        c1368a.m8871a(jSONObject.optString("version"));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= optJSONArray.length()) {
                return c1368a;
            }
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            C2145w c2145w = new C2145w();
            int optInt2 = jSONObject2.optInt("id");
            Integer num = this.f7106w.get(optInt2);
            if (num != null && num.intValue() != 0) {
                c2145w.m6243a(optInt2);
                c2145w.m6242a(jSONObject2.optString("name"));
                c2145w.m6240b(jSONObject2.optString("description"));
                c2145w.m6238c(jSONObject2.optString("image_url"));
                c1368a.m8875a().add(c2145w);
            }
            i = i2 + 1;
        }
    }

    /* renamed from: j */
    public C1368a m6197j() {
        return m8792d().get(f7087d);
    }

    /* renamed from: k */
    private void m6196k() {
        m8791e().m11009a(new C0798m.InterfaceC0800a() { // from class: com.tsf.extend.wallpaper.z.4
            @Override // com.android.volley.C0798m.InterfaceC0800a
            /* renamed from: a */
            public boolean mo6193a(AbstractC0795l<?> abstractC0795l) {
                return true;
            }
        });
    }

    /* renamed from: b */
    public static boolean m6205b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(f7085b) || str.startsWith(f7086c) || str.startsWith(f7088e) || str.startsWith(f7091h) || str.startsWith(f7090g) || f7087d.equals(str);
    }

    /* renamed from: a */
    public void m6220a(final long j) {
        C0841m c0841m = new C0841m(1, f7102s, new C0802n.InterfaceC0804b<String>() { // from class: com.tsf.extend.wallpaper.z.5
            @Override // com.android.volley.C0802n.InterfaceC0804b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6192a(String str) {
            }
        }, null) { // from class: com.tsf.extend.wallpaper.z.6
            @Override // com.android.volley.AbstractC0795l
            /* renamed from: n */
            protected Map<String, String> mo6190n() {
                HashMap hashMap = new HashMap();
                hashMap.put("sid", "" + j);
                hashMap.put("op", "1");
                return hashMap;
            }
        };
        c0841m.m11034a((InterfaceC0806p) new C0785d(30000, 1, 1.0f));
        m8807a(c0841m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.z$a */
    /* loaded from: classes.dex */
    public static class C2156a implements InterfaceC1373b {
        private C2156a() {
        }

        @Override // com.tsf.extend.base.p071b.InterfaceC1373b
        /* renamed from: a */
        public boolean mo6189a(C1368a c1368a) {
            return System.currentTimeMillis() - c1368a.m8865c() > TimeUnit.HOURS.toMillis(10L);
        }
    }

    /* renamed from: a */
    private String m6211a(String str, long j, long j2) {
        if (f7085b.equals(str)) {
            return f7085b + j;
        }
        if (f7086c.equals(str)) {
            return f7086c + j2;
        }
        if (f7088e.equals(str)) {
            return f7088e;
        }
        if (f7091h.equals(str)) {
            return f7091h;
        }
        if (f7089f.equals(str)) {
            return f7090g;
        }
        return f7088e;
    }
}
