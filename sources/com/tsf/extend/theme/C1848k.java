package com.tsf.extend.theme;

import android.content.ContentValues;
import android.database.Cursor;
import com.tsf.extend.theme.diy.C1802a;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* renamed from: com.tsf.extend.theme.k */
/* loaded from: classes.dex */
public class C1848k implements Serializable {

    /* renamed from: A */
    private long f5915A;

    /* renamed from: B */
    private int f5916B;

    /* renamed from: C */
    private String f5917C;

    /* renamed from: D */
    private float f5918D;

    /* renamed from: E */
    private volatile boolean f5919E;

    /* renamed from: a */
    private String f5920a;

    /* renamed from: b */
    private long f5921b;

    /* renamed from: c */
    private String f5922c;

    /* renamed from: d */
    private int f5923d;

    /* renamed from: e */
    private String f5924e;

    /* renamed from: f */
    private String f5925f;

    /* renamed from: g */
    private String f5926g;

    /* renamed from: h */
    private String f5927h;

    /* renamed from: i */
    private transient boolean f5928i;

    /* renamed from: j */
    private boolean f5929j;

    /* renamed from: k */
    private String f5930k;

    /* renamed from: l */
    private String f5931l;

    /* renamed from: m */
    private int f5932m;

    /* renamed from: n */
    private String f5933n;

    /* renamed from: o */
    private List<String> f5934o;

    /* renamed from: p */
    private transient boolean f5935p;

    /* renamed from: q */
    private int f5936q;

    /* renamed from: t */
    private int f5939t;

    /* renamed from: y */
    private String f5944y;

    /* renamed from: z */
    private long f5945z;

    /* renamed from: r */
    private int f5937r = 0;

    /* renamed from: s */
    private int f5938s = -1;

    /* renamed from: u */
    private int f5940u = 0;

    /* renamed from: v */
    private String f5941v = null;

    /* renamed from: w */
    private String f5942w = null;

    /* renamed from: x */
    private String f5943x = null;

    /* renamed from: g */
    public String m7300g() {
        return this.f5920a;
    }

    /* renamed from: c */
    public void m7310c(String str) {
        this.f5920a = str;
    }

    /* renamed from: h */
    public long m7297h() {
        return this.f5921b;
    }

    /* renamed from: a */
    public void m7320a(long j) {
        this.f5921b = j;
    }

    /* renamed from: i */
    public String m7294i() {
        return this.f5922c;
    }

    /* renamed from: d */
    public void m7307d(String str) {
        this.f5922c = str;
    }

    /* renamed from: j */
    public int m7291j() {
        return this.f5923d;
    }

    /* renamed from: a */
    public void m7321a(int i) {
        this.f5923d = i;
    }

    /* renamed from: k */
    public String m7289k() {
        return this.f5924e;
    }

    /* renamed from: e */
    public void m7304e(String str) {
        this.f5924e = str;
    }

    /* renamed from: l */
    public String m7287l() {
        return this.f5925f;
    }

    /* renamed from: f */
    public void m7301f(String str) {
        this.f5925f = str;
    }

    /* renamed from: m */
    public String m7285m() {
        return this.f5926g;
    }

    /* renamed from: g */
    public void m7298g(String str) {
        this.f5926g = str;
    }

    /* renamed from: n */
    public boolean m7283n() {
        return this.f5928i;
    }

    /* renamed from: b */
    public void m7314b(boolean z) {
        this.f5928i = z;
    }

    /* renamed from: o */
    public boolean m7281o() {
        return this.f5929j;
    }

    /* renamed from: c */
    public void m7309c(boolean z) {
        this.f5929j = z;
    }

    /* renamed from: p */
    public String m7279p() {
        return this.f5930k;
    }

    /* renamed from: h */
    public void m7295h(String str) {
        this.f5930k = str;
    }

    /* renamed from: q */
    public String m7277q() {
        return this.f5931l;
    }

    /* renamed from: i */
    public void m7292i(String str) {
        this.f5931l = str;
    }

    /* renamed from: r */
    public int m7276r() {
        return this.f5932m;
    }

    /* renamed from: b */
    public void m7316b(int i) {
        this.f5932m = i;
    }

    /* renamed from: s */
    public String m7275s() {
        return this.f5933n;
    }

    /* renamed from: j */
    public void m7290j(String str) {
        this.f5933n = str;
    }

    /* renamed from: t */
    public List<String> m7274t() {
        return this.f5934o;
    }

    /* renamed from: a */
    public void m7318a(List<String> list) {
        this.f5934o = list;
    }

    /* renamed from: u */
    public String m7273u() {
        return this.f5927h;
    }

    /* renamed from: k */
    public void m7288k(String str) {
        this.f5927h = str;
    }

    /* renamed from: v */
    public boolean m7272v() {
        return this.f5935p;
    }

    /* renamed from: d */
    public void m7306d(boolean z) {
        this.f5935p = z;
    }

    /* renamed from: w */
    public int m7271w() {
        return this.f5936q;
    }

    /* renamed from: c */
    public void m7312c(int i) {
        this.f5936q = i;
    }

    /* renamed from: x */
    public int m7270x() {
        return this.f5937r;
    }

    /* renamed from: d */
    public void m7308d(int i) {
        this.f5937r = i;
    }

    /* renamed from: y */
    public ContentValues m7269y() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", ((this instanceof C1703b) && ((C1703b) this).m7748e()) ? ((C1703b) this).m7747f() : m7300g());
        contentValues.put("theme_id", Long.valueOf(m7297h()));
        contentValues.put("name", m7294i());
        contentValues.put("download", Integer.valueOf(m7291j()));
        contentValues.put("favorite", Integer.valueOf(m7271w()));
        contentValues.put("url", m7289k());
        contentValues.put("image_url", m7287l());
        contentValues.put("cover_url", m7285m());
        contentValues.put("size", m7279p());
        contentValues.put("author", m7277q());
        contentValues.put("version_code", Integer.valueOf(m7276r()));
        contentValues.put("version_name", m7275s());
        JSONArray jSONArray = new JSONArray();
        List<String> m7274t = m7274t();
        if (m7274t != null) {
            for (String str : m7274t) {
                jSONArray.put(str);
            }
        }
        contentValues.put("preview_urls", jSONArray.toString());
        contentValues.put("theme_type", Integer.valueOf(mo7323a()));
        contentValues.put("extend_data", mo7313c());
        return contentValues;
    }

    /* renamed from: a */
    public static C1848k m7319a(Cursor cursor) {
        C1848k c1848k;
        String string = cursor.getString(cursor.getColumnIndex("package_name"));
        long j = cursor.getLong(cursor.getColumnIndex("theme_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("name"));
        int i = cursor.getInt(cursor.getColumnIndex("download"));
        int i2 = cursor.getInt(cursor.getColumnIndex("favorite"));
        String string3 = cursor.getString(cursor.getColumnIndex("url"));
        String string4 = cursor.getString(cursor.getColumnIndex("image_url"));
        String string5 = cursor.getString(cursor.getColumnIndex("cover_url"));
        String string6 = cursor.getString(cursor.getColumnIndex("size"));
        String string7 = cursor.getString(cursor.getColumnIndex("author"));
        int i3 = cursor.getInt(cursor.getColumnIndex("version_code"));
        String string8 = cursor.getString(cursor.getColumnIndex("version_name"));
        String string9 = cursor.getString(cursor.getColumnIndex("preview_urls"));
        int i4 = cursor.getInt(cursor.getColumnIndex("theme_type"));
        String string10 = cursor.getString(cursor.getColumnIndex("extend_data"));
        if (i4 == 2) {
            c1848k = new C1802a();
        } else if (i4 == 3) {
            c1848k = new C1703b();
        } else if (i4 == 1) {
            c1848k = new C1842f();
        } else {
            c1848k = new C1848k();
        }
        c1848k.m7310c(string);
        c1848k.m7320a(j);
        c1848k.m7307d(string2);
        c1848k.m7321a(i);
        c1848k.m7312c(i2);
        c1848k.m7304e(string3);
        c1848k.m7301f(string4);
        c1848k.m7298g(string5);
        c1848k.m7295h(string6);
        c1848k.m7292i(string7);
        c1848k.m7316b(i3);
        if (string9 != null) {
            try {
                JSONArray jSONArray = new JSONArray(string9);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        arrayList.add(jSONArray.getString(i5));
                    }
                    c1848k.m7318a(arrayList);
                }
            } catch (Exception e) {
            }
        }
        c1848k.m7290j(string8);
        c1848k.mo7317a_(string10);
        return c1848k;
    }

    /* renamed from: a */
    public int mo7323a() {
        return 0;
    }

    /* renamed from: c */
    public String mo7313c() {
        return null;
    }

    /* renamed from: a_ */
    public void mo7317a_(String str) {
    }

    /* renamed from: e */
    public static String m7305e(int i) {
        if (i < 200) {
            return "100+";
        }
        return new DecimalFormat("#,###").format((i / 100) * 100) + "+";
    }

    /* renamed from: z */
    public int m7268z() {
        return this.f5938s;
    }

    /* renamed from: f */
    public void m7302f(int i) {
        this.f5938s = i;
    }

    /* renamed from: A */
    public int m7331A() {
        return this.f5939t;
    }

    /* renamed from: g */
    public void m7299g(int i) {
        this.f5939t = i;
    }

    /* renamed from: h */
    public void m7296h(int i) {
        this.f5940u = i;
    }

    /* renamed from: l */
    public void m7286l(String str) {
        this.f5941v = str;
    }

    /* renamed from: m */
    public void m7284m(String str) {
        this.f5942w = str;
    }

    /* renamed from: n */
    public void m7282n(String str) {
        this.f5943x = str;
    }

    /* renamed from: o */
    public void m7280o(String str) {
        this.f5944y = str;
    }

    /* renamed from: B */
    public String m7330B() {
        return this.f5944y;
    }

    /* renamed from: C */
    public long m7329C() {
        return this.f5945z;
    }

    /* renamed from: b */
    public void m7315b(long j) {
        this.f5945z = j;
    }

    /* renamed from: D */
    public long m7328D() {
        return this.f5915A;
    }

    /* renamed from: c */
    public void m7311c(long j) {
        this.f5915A = j;
    }

    /* renamed from: E */
    public String m7327E() {
        return this.f5917C;
    }

    /* renamed from: p */
    public void m7278p(String str) {
        this.f5917C = str;
    }

    /* renamed from: F */
    public int m7326F() {
        return this.f5916B;
    }

    /* renamed from: i */
    public void m7293i(int i) {
        this.f5916B = i;
    }

    /* renamed from: G */
    public float m7325G() {
        return this.f5918D;
    }

    /* renamed from: a */
    public void m7322a(float f) {
        this.f5918D = f;
    }

    /* renamed from: H */
    public boolean m7324H() {
        return this.f5919E;
    }

    /* renamed from: e */
    public void m7303e(boolean z) {
        this.f5919E = z;
    }
}
