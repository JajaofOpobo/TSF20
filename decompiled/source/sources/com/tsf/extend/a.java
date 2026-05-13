package com.tsf.extend;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.tsf.extend.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    public static final a a = new a();
    public static String b = "CM_TOOL";
    public static String c = "C1";
    public static String d = "C2";
    public static String e = "C3";
    public static String f = "C4";
    public static String g = "C5";
    public static String h = "C6";
    public static String i = "C7";
    public static String j = "C8";
    public static String k = "C9";
    public static String l = "C10";
    public static String m = "C0";
    public static String n = "C11";
    public static String o = "C12";
    public static String p = "C13";
    public static String q = "C14";
    public static String r = "C15";
    public static String s = "C200";
    public static List<String> t = new ArrayList();
    static Map<String, C0045a> u;
    static HashMap<String, String> v;
    static HashMap<String, String> w;
    static Map<String, String> x;
    private String y = null;
    private String z = null;
    private int A = 1;
    private int B = 0;

    static {
        t.add(b);
        t.add(c);
        t.add(d);
        t.add(f);
        t.add(h);
        t.add(i);
        t.add(g);
        t.add(j);
        t.add(k);
        t.add(e);
        t.add(o);
        t.add(p);
        t.add(q);
        t.add(n);
        t.add(l);
        t.add(m);
        t.add(r);
        u = new HashMap();
        u.put(m, new C0045a().a(f.g.cm_category_c0));
        u.put(c, new C0045a().a(f.g.cm_category_c1));
        u.put(d, new C0045a().a(f.g.cm_category_c2));
        u.put(e, new C0045a().a(f.g.cm_category_c3));
        u.put(f, new C0045a().a(f.g.cm_category_c4));
        u.put(g, new C0045a().a(f.g.cm_category_c5));
        u.put(h, new C0045a().a(f.g.cm_category_c6));
        u.put(i, new C0045a().a(f.g.cm_category_c7));
        u.put(j, new C0045a().a(f.g.cm_category_c8));
        u.put(k, new C0045a().a(f.g.cm_category_c9));
        u.put(l, new C0045a().a(f.g.cm_category_c10));
        u.put(n, new C0045a().a(f.g.cm_category_c0));
        u.put(o, new C0045a().a(f.g.cm_category_c12));
        u.put(p, new C0045a().a(f.g.cm_category_c13));
        u.put(q, new C0045a().a(f.g.cm_category_c14));
        v = new HashMap<>();
        v.put("game_adventure", c);
        v.put("game_family", c);
        v.put("game_arcade", c);
        v.put("game_role_playing", c);
        v.put("game_action", c);
        v.put("game_racing", c);
        v.put("game_music", c);
        v.put("game_strategy", c);
        v.put("game_casual", c);
        v.put("game_educational", c);
        v.put("game_word", c);
        v.put("game_board", c);
        v.put("game_card", c);
        v.put("game_sports", c);
        v.put("game_casino", c);
        v.put("game_puzzle", c);
        v.put("game_trivia", c);
        v.put("game_simulation", c);
        v.put("C1", c);
        v.put("communication", d);
        v.put("social", d);
        v.put("C2", d);
        v.put("education", e);
        v.put("libraries_and_demo", e);
        v.put("tools", e);
        v.put("productivity", e);
        v.put("C3", e);
        v.put("music_and_audio", f);
        v.put("media_and_video", f);
        v.put("C4", f);
        v.put("transportation", g);
        v.put("sports", g);
        v.put("health_and_fitness", g);
        v.put("comics", g);
        v.put("medical", g);
        v.put("weather", g);
        v.put("travel_and_local", g);
        v.put("lifestyle", g);
        v.put("C5", g);
        v.put("photography", h);
        v.put("C6", h);
        v.put("news_and_magazines", i);
        v.put("books_and_reference", i);
        v.put("C7", i);
        v.put("entertainment", j);
        v.put("C8", j);
        v.put("shopping", k);
        v.put("C9", k);
        v.put("C10", l);
        v.put("C0", m);
        v.put("122", o);
        v.put("business", o);
        v.put("C12", o);
        v.put("124", p);
        v.put("finance", p);
        v.put("C13", p);
        v.put("127", q);
        v.put("personalization", q);
        v.put("C14", q);
        w = new HashMap<>();
        w.put(o, e);
        w.put(p, e);
        x = new HashMap();
        x.put(b, "200");
        x.put(o, "122");
        x.put(p, "124");
        x.put(q, "127");
    }

    public static a a(String str) {
        return new a().b(str).c("unknown");
    }

    public a b(String str) {
        this.z = str;
        return this;
    }

    public void a(int i2) {
        this.A = i2;
    }

    public void b(int i2) {
        this.B = i2;
    }

    public a c(String str) {
        this.y = str;
        return this;
    }

    /* renamed from: com.tsf.extend.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0045a {
        int a = 0;

        C0045a() {
        }

        public C0045a a(int i) {
            this.a = i;
            return this;
        }
    }

    public String a() {
        return d(this.y);
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return m;
        }
        if (f(str)) {
            return c;
        }
        String str2 = v.get(str);
        return TextUtils.isEmpty(str2) ? m : str2;
    }

    private static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.US).startsWith("game|");
    }

    public ContentValues b() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("category", this.y);
        contentValues.put("pkg_name", this.z);
        contentValues.put("tc", Integer.valueOf(this.A));
        return contentValues;
    }

    public static String a(Cursor cursor, String str, String str2) {
        try {
            return cursor.getString(cursor.getColumnIndexOrThrow(str));
        } catch (RuntimeException e2) {
            return str2;
        }
    }

    public static int a(Cursor cursor, String str, int i2) {
        try {
            return cursor.getInt(cursor.getColumnIndexOrThrow(str));
        } catch (RuntimeException e2) {
            return i2;
        }
    }

    public a a(Cursor cursor) {
        this.z = a(cursor, "pkg_name", "");
        this.y = a(cursor, "category", "unknow");
        this.A = a(cursor, "tc", -1);
        return this;
    }

    public String toString() {
        return String.format("(AppCatelog :pkg_name %s  :category %s)", this.z, this.y);
    }

    public String c() {
        return this.z;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_category(_id INTEGER PRIMARY KEY,pkg_name TEXT,category TEXT,tc TEXT);");
    }

    public static boolean e(String str) {
        return d.equals(str);
    }
}
