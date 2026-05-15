package com.tsf.extend.theme;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k implements Serializable {
    private long A;
    private int B;
    private String C;
    private float D;
    private volatile boolean E;
    private String a;
    private long b;
    private String c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private transient boolean i;
    private boolean j;
    private String k;
    private String l;
    private int m;
    private String n;
    private List<String> o;
    private transient boolean p;
    private int q;
    private int t;
    private String y;
    private long z;
    private int r = 0;
    private int s = -1;
    private int u = 0;
    private String v = null;
    private String w = null;
    private String x = null;

    public String g() {
        return this.a;
    }

    public void c(String str) {
        this.a = str;
    }

    public long h() {
        return this.b;
    }

    public void a(long j) {
        this.b = j;
    }

    public String i() {
        return this.c;
    }

    public void d(String str) {
        this.c = str;
    }

    public int j() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public String k() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public String l() {
        return this.f;
    }

    public void f(String str) {
        this.f = str;
    }

    public String m() {
        return this.g;
    }

    public void g(String str) {
        this.g = str;
    }

    public boolean n() {
        return this.i;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public boolean o() {
        return this.j;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public String p() {
        return this.k;
    }

    public void h(String str) {
        this.k = str;
    }

    public String q() {
        return this.l;
    }

    public void i(String str) {
        this.l = str;
    }

    public int r() {
        return this.m;
    }

    public void b(int i) {
        this.m = i;
    }

    public String s() {
        return this.n;
    }

    public void j(String str) {
        this.n = str;
    }

    public List<String> t() {
        return this.o;
    }

    public void a(List<String> list) {
        this.o = list;
    }

    public String u() {
        return this.h;
    }

    public void k(String str) {
        this.h = str;
    }

    public boolean v() {
        return this.p;
    }

    public void d(boolean z) {
        this.p = z;
    }

    public int w() {
        return this.q;
    }

    public void c(int i) {
        this.q = i;
    }

    public int x() {
        return this.r;
    }

    public void d(int i) {
        this.r = i;
    }

    public ContentValues y() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", ((this instanceof b) && ((b) this).e()) ? ((b) this).f() : g());
        contentValues.put("theme_id", Long.valueOf(h()));
        contentValues.put("name", i());
        contentValues.put("download", Integer.valueOf(j()));
        contentValues.put("favorite", Integer.valueOf(w()));
        contentValues.put("url", k());
        contentValues.put("image_url", l());
        contentValues.put("cover_url", m());
        contentValues.put("size", p());
        contentValues.put("author", q());
        contentValues.put("version_code", Integer.valueOf(r()));
        contentValues.put("version_name", s());
        JSONArray jSONArray = new JSONArray();
        List<String> listT = t();
        if (listT != null) {
            Iterator<String> it = listT.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        contentValues.put("preview_urls", jSONArray.toString());
        contentValues.put("theme_type", Integer.valueOf(a()));
        contentValues.put("extend_data", c());
        return contentValues;
    }

    public static k a(Cursor cursor) {
        k kVar;
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
            kVar = new com.tsf.extend.theme.diy.a();
        } else if (i4 == 3) {
            kVar = new b();
        } else if (i4 == 1) {
            kVar = new f();
        } else {
            kVar = new k();
        }
        kVar.c(string);
        kVar.a(j);
        kVar.d(string2);
        kVar.a(i);
        kVar.c(i2);
        kVar.e(string3);
        kVar.f(string4);
        kVar.g(string5);
        kVar.h(string6);
        kVar.i(string7);
        kVar.b(i3);
        if (string9 != null) {
            try {
                JSONArray jSONArray = new JSONArray(string9);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        arrayList.add(jSONArray.getString(i5));
                    }
                    kVar.a(arrayList);
                }
            } catch (Exception e) {
            }
        }
        kVar.j(string8);
        kVar.a_(string10);
        return kVar;
    }

    public int a() {
        return 0;
    }

    public String c() {
        return null;
    }

    public void a_(String str) {
    }

    public static String e(int i) {
        if (i < 200) {
            return "100+";
        }
        return new DecimalFormat("#,###").format((i / 100) * 100) + "+";
    }

    public int z() {
        return this.s;
    }

    public void f(int i) {
        this.s = i;
    }

    public int A() {
        return this.t;
    }

    public void g(int i) {
        this.t = i;
    }

    public void h(int i) {
        this.u = i;
    }

    public void l(String str) {
        this.v = str;
    }

    public void m(String str) {
        this.w = str;
    }

    public void n(String str) {
        this.x = str;
    }

    public void o(String str) {
        this.y = str;
    }

    public String B() {
        return this.y;
    }

    public long C() {
        return this.z;
    }

    public void b(long j) {
        this.z = j;
    }

    public long D() {
        return this.A;
    }

    public void c(long j) {
        this.A = j;
    }

    public String E() {
        return this.C;
    }

    public void p(String str) {
        this.C = str;
    }

    public int F() {
        return this.B;
    }

    public void i(int i) {
        this.B = i;
    }

    public float G() {
        return this.D;
    }

    public void a(float f) {
        this.D = f;
    }

    public boolean H() {
        return this.E;
    }

    public void e(boolean z) {
        this.E = z;
    }
}
