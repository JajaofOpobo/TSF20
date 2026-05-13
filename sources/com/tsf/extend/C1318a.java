package com.tsf.extend;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.tsf.extend.C1536f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* renamed from: com.tsf.extend.a */
/* loaded from: classes.dex */
public class C1318a {

    /* renamed from: a */
    public static final C1318a f4119a = new C1318a();

    /* renamed from: b */
    public static String f4120b = "CM_TOOL";

    /* renamed from: c */
    public static String f4121c = "C1";

    /* renamed from: d */
    public static String f4122d = "C2";

    /* renamed from: e */
    public static String f4123e = "C3";

    /* renamed from: f */
    public static String f4124f = "C4";

    /* renamed from: g */
    public static String f4125g = "C5";

    /* renamed from: h */
    public static String f4126h = "C6";

    /* renamed from: i */
    public static String f4127i = "C7";

    /* renamed from: j */
    public static String f4128j = "C8";

    /* renamed from: k */
    public static String f4129k = "C9";

    /* renamed from: l */
    public static String f4130l = "C10";

    /* renamed from: m */
    public static String f4131m = "C0";

    /* renamed from: n */
    public static String f4132n = "C11";

    /* renamed from: o */
    public static String f4133o = "C12";

    /* renamed from: p */
    public static String f4134p = "C13";

    /* renamed from: q */
    public static String f4135q = "C14";

    /* renamed from: r */
    public static String f4136r = "C15";

    /* renamed from: s */
    public static String f4137s = "C200";

    /* renamed from: t */
    public static List<String> f4138t = new ArrayList();

    /* renamed from: u */
    static Map<String, C1319a> f4139u;

    /* renamed from: v */
    static HashMap<String, String> f4140v;

    /* renamed from: w */
    static HashMap<String, String> f4141w;

    /* renamed from: x */
    static Map<String, String> f4142x;

    /* renamed from: y */
    private String f4145y = null;

    /* renamed from: z */
    private String f4146z = null;

    /* renamed from: A */
    private int f4143A = 1;

    /* renamed from: B */
    private int f4144B = 0;

    static {
        f4138t.add(f4120b);
        f4138t.add(f4121c);
        f4138t.add(f4122d);
        f4138t.add(f4124f);
        f4138t.add(f4126h);
        f4138t.add(f4127i);
        f4138t.add(f4125g);
        f4138t.add(f4128j);
        f4138t.add(f4129k);
        f4138t.add(f4123e);
        f4138t.add(f4133o);
        f4138t.add(f4134p);
        f4138t.add(f4135q);
        f4138t.add(f4132n);
        f4138t.add(f4130l);
        f4138t.add(f4131m);
        f4138t.add(f4136r);
        f4139u = new HashMap();
        f4139u.put(f4131m, new C1319a().m9022a(C1536f.C1543g.cm_category_c0));
        f4139u.put(f4121c, new C1319a().m9022a(C1536f.C1543g.cm_category_c1));
        f4139u.put(f4122d, new C1319a().m9022a(C1536f.C1543g.cm_category_c2));
        f4139u.put(f4123e, new C1319a().m9022a(C1536f.C1543g.cm_category_c3));
        f4139u.put(f4124f, new C1319a().m9022a(C1536f.C1543g.cm_category_c4));
        f4139u.put(f4125g, new C1319a().m9022a(C1536f.C1543g.cm_category_c5));
        f4139u.put(f4126h, new C1319a().m9022a(C1536f.C1543g.cm_category_c6));
        f4139u.put(f4127i, new C1319a().m9022a(C1536f.C1543g.cm_category_c7));
        f4139u.put(f4128j, new C1319a().m9022a(C1536f.C1543g.cm_category_c8));
        f4139u.put(f4129k, new C1319a().m9022a(C1536f.C1543g.cm_category_c9));
        f4139u.put(f4130l, new C1319a().m9022a(C1536f.C1543g.cm_category_c10));
        f4139u.put(f4132n, new C1319a().m9022a(C1536f.C1543g.cm_category_c0));
        f4139u.put(f4133o, new C1319a().m9022a(C1536f.C1543g.cm_category_c12));
        f4139u.put(f4134p, new C1319a().m9022a(C1536f.C1543g.cm_category_c13));
        f4139u.put(f4135q, new C1319a().m9022a(C1536f.C1543g.cm_category_c14));
        f4140v = new HashMap<>();
        f4140v.put("game_adventure", f4121c);
        f4140v.put("game_family", f4121c);
        f4140v.put("game_arcade", f4121c);
        f4140v.put("game_role_playing", f4121c);
        f4140v.put("game_action", f4121c);
        f4140v.put("game_racing", f4121c);
        f4140v.put("game_music", f4121c);
        f4140v.put("game_strategy", f4121c);
        f4140v.put("game_casual", f4121c);
        f4140v.put("game_educational", f4121c);
        f4140v.put("game_word", f4121c);
        f4140v.put("game_board", f4121c);
        f4140v.put("game_card", f4121c);
        f4140v.put("game_sports", f4121c);
        f4140v.put("game_casino", f4121c);
        f4140v.put("game_puzzle", f4121c);
        f4140v.put("game_trivia", f4121c);
        f4140v.put("game_simulation", f4121c);
        f4140v.put("C1", f4121c);
        f4140v.put("communication", f4122d);
        f4140v.put("social", f4122d);
        f4140v.put("C2", f4122d);
        f4140v.put("education", f4123e);
        f4140v.put("libraries_and_demo", f4123e);
        f4140v.put("tools", f4123e);
        f4140v.put("productivity", f4123e);
        f4140v.put("C3", f4123e);
        f4140v.put("music_and_audio", f4124f);
        f4140v.put("media_and_video", f4124f);
        f4140v.put("C4", f4124f);
        f4140v.put("transportation", f4125g);
        f4140v.put("sports", f4125g);
        f4140v.put("health_and_fitness", f4125g);
        f4140v.put("comics", f4125g);
        f4140v.put("medical", f4125g);
        f4140v.put("weather", f4125g);
        f4140v.put("travel_and_local", f4125g);
        f4140v.put("lifestyle", f4125g);
        f4140v.put("C5", f4125g);
        f4140v.put("photography", f4126h);
        f4140v.put("C6", f4126h);
        f4140v.put("news_and_magazines", f4127i);
        f4140v.put("books_and_reference", f4127i);
        f4140v.put("C7", f4127i);
        f4140v.put("entertainment", f4128j);
        f4140v.put("C8", f4128j);
        f4140v.put("shopping", f4129k);
        f4140v.put("C9", f4129k);
        f4140v.put("C10", f4130l);
        f4140v.put("C0", f4131m);
        f4140v.put("122", f4133o);
        f4140v.put("business", f4133o);
        f4140v.put("C12", f4133o);
        f4140v.put("124", f4134p);
        f4140v.put("finance", f4134p);
        f4140v.put("C13", f4134p);
        f4140v.put("127", f4135q);
        f4140v.put("personalization", f4135q);
        f4140v.put("C14", f4135q);
        f4141w = new HashMap<>();
        f4141w.put(f4133o, f4123e);
        f4141w.put(f4134p, f4123e);
        f4142x = new HashMap();
        f4142x.put(f4120b, "200");
        f4142x.put(f4133o, "122");
        f4142x.put(f4134p, "124");
        f4142x.put(f4135q, "127");
    }

    /* renamed from: a */
    public static C1318a m9033a(String str) {
        return new C1318a().m9030b(str).m9028c("unknown");
    }

    /* renamed from: b */
    public C1318a m9030b(String str) {
        this.f4146z = str;
        return this;
    }

    /* renamed from: a */
    public void m9039a(int i) {
        this.f4143A = i;
    }

    /* renamed from: b */
    public void m9031b(int i) {
        this.f4144B = i;
    }

    /* renamed from: c */
    public C1318a m9028c(String str) {
        this.f4145y = str;
        return this;
    }

    /* renamed from: com.tsf.extend.a$a */
    /* loaded from: classes.dex */
    static class C1319a {

        /* renamed from: a */
        int f4147a = 0;

        C1319a() {
        }

        /* renamed from: a */
        public C1319a m9022a(int i) {
            this.f4147a = i;
            return this;
        }
    }

    /* renamed from: a */
    public String m9040a() {
        return m9027d(this.f4145y);
    }

    /* renamed from: d */
    public static String m9027d(String str) {
        if (TextUtils.isEmpty(str)) {
            return f4131m;
        }
        if (m9025f(str)) {
            return f4121c;
        }
        String str2 = f4140v.get(str);
        return TextUtils.isEmpty(str2) ? f4131m : str2;
    }

    /* renamed from: f */
    private static boolean m9025f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.US).startsWith("game|");
    }

    /* renamed from: b */
    public ContentValues m9032b() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("category", this.f4145y);
        contentValues.put("pkg_name", this.f4146z);
        contentValues.put("tc", Integer.valueOf(this.f4143A));
        return contentValues;
    }

    /* renamed from: a */
    public static String m9036a(Cursor cursor, String str, String str2) {
        try {
            return cursor.getString(cursor.getColumnIndexOrThrow(str));
        } catch (RuntimeException e) {
            return str2;
        }
    }

    /* renamed from: a */
    public static int m9037a(Cursor cursor, String str, int i) {
        try {
            return cursor.getInt(cursor.getColumnIndexOrThrow(str));
        } catch (RuntimeException e) {
            return i;
        }
    }

    /* renamed from: a */
    public C1318a m9038a(Cursor cursor) {
        this.f4146z = m9036a(cursor, "pkg_name", "");
        this.f4145y = m9036a(cursor, "category", "unknow");
        this.f4143A = m9037a(cursor, "tc", -1);
        return this;
    }

    public String toString() {
        return String.format("(AppCatelog :pkg_name %s  :category %s)", this.f4146z, this.f4145y);
    }

    /* renamed from: c */
    public String m9029c() {
        return this.f4146z;
    }

    /* renamed from: a */
    public static void m9034a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public static void m9035a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_category(_id INTEGER PRIMARY KEY,pkg_name TEXT,category TEXT,tc TEXT);");
    }

    /* renamed from: e */
    public static boolean m9026e(String str) {
        return f4122d.equals(str);
    }
}
