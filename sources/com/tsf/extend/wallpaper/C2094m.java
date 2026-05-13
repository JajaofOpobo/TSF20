package com.tsf.extend.wallpaper;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.wallpaper.m */
/* loaded from: classes.dex */
public class C2094m extends C2106s implements Serializable {

    /* renamed from: a */
    private long f6848a;

    /* renamed from: b */
    private String f6849b;

    /* renamed from: c */
    private String f6850c;

    /* renamed from: d */
    private int f6851d;

    /* renamed from: e */
    private int f6852e;

    /* renamed from: f */
    private long f6853f;

    /* renamed from: g */
    private long f6854g;

    /* renamed from: h */
    private boolean f6855h;

    /* renamed from: j */
    private String f6857j;

    /* renamed from: l */
    private String f6859l;

    /* renamed from: m */
    private EnumC2057ai f6860m;

    /* renamed from: i */
    private String f6856i = "";

    /* renamed from: k */
    private long f6858k = 0;

    /* renamed from: f */
    public long m6434f() {
        return this.f6854g;
    }

    /* renamed from: b */
    public void m6444b(long j) {
        this.f6854g = j;
    }

    /* renamed from: a */
    public long mo6451a() {
        return this.f6853f;
    }

    /* renamed from: a */
    public void mo6450a(long j) {
        this.f6853f = j;
    }

    /* renamed from: g */
    public int m6432g() {
        return this.f6852e;
    }

    /* renamed from: b */
    public void m6445b(int i) {
        this.f6852e = i;
    }

    /* renamed from: a */
    public void m6448a(EnumC2057ai enumC2057ai) {
        this.f6860m = enumC2057ai;
    }

    /* renamed from: h */
    public long m6431h() {
        return this.f6848a;
    }

    /* renamed from: c */
    public void m6439c(long j) {
        this.f6848a = j;
    }

    /* renamed from: i */
    public String m6430i() {
        return this.f6849b;
    }

    /* renamed from: b */
    public void m6442b(String str) {
        this.f6849b = str;
    }

    /* renamed from: j */
    public String m6429j() {
        return this.f6850c;
    }

    /* renamed from: c */
    public void m6438c(String str) {
        this.f6850c = str;
    }

    /* renamed from: k */
    public int m6428k() {
        return this.f6851d;
    }

    /* renamed from: c */
    public void m6440c(int i) {
        this.f6851d = i;
    }

    /* renamed from: l */
    public boolean m6427l() {
        return this.f6855h;
    }

    /* renamed from: b */
    public void m6441b(boolean z) {
        this.f6855h = z;
    }

    /* renamed from: m */
    public String m6426m() {
        return this.f6856i;
    }

    /* renamed from: d */
    public void m6436d(String str) {
        this.f6856i = str;
    }

    /* renamed from: n */
    public boolean m6425n() {
        return !TextUtils.isEmpty(this.f6856i);
    }

    /* renamed from: o */
    public String m6424o() {
        return this.f6857j;
    }

    /* renamed from: e */
    public void m6435e(String str) {
        this.f6857j = str;
    }

    /* renamed from: com.tsf.extend.wallpaper.m$a */
    /* loaded from: classes.dex */
    public static class C2095a {

        /* renamed from: a */
        public String f6861a;

        /* renamed from: b */
        public long f6862b;

        public C2095a(String str, long j) {
            this.f6861a = str;
            this.f6862b = j;
        }
    }

    /* renamed from: b */
    public static List<C2094m> m6443b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList newArrayList = Lists.newArrayList();
        while (cursor.moveToNext()) {
            C2094m c2094m = new C2094m();
            m6449a(cursor, c2094m);
            newArrayList.add(c2094m);
        }
        cursor.close();
        return newArrayList;
    }

    /* renamed from: a */
    public static void m6449a(Cursor cursor, C2094m c2094m) {
        c2094m.m6439c(cursor.getInt(cursor.getColumnIndex("souce_id")));
        c2094m.m6442b(cursor.getString(cursor.getColumnIndex("thumbUrl")));
        c2094m.m6438c(cursor.getString(cursor.getColumnIndex("url")));
        c2094m.m6440c(cursor.getInt(cursor.getColumnIndex("categoryId")));
        c2094m.m6441b(cursor.getInt(cursor.getColumnIndex("user_upload")) == 1);
        c2094m.m6435e(cursor.getString(cursor.getColumnIndex("author")));
        c2094m.m6436d(cursor.getString(cursor.getColumnIndex("live_wp_down_url")));
    }

    /* renamed from: d */
    public void m6437d(long j) {
        this.f6858k = j;
    }

    /* renamed from: f */
    public void m6433f(String str) {
        this.f6859l = str;
    }

    /* renamed from: p */
    public long m6423p() {
        return this.f6858k;
    }

    /* renamed from: q */
    public String m6422q() {
        return this.f6859l;
    }

    /* renamed from: a */
    public static C2094m m6446a(JSONObject jSONObject, EnumC2057ai enumC2057ai) {
        if (jSONObject == null) {
            return null;
        }
        C2094m c2094m = new C2094m();
        c2094m.mo6450a(jSONObject.optLong("online_time"));
        c2094m.m6439c(jSONObject.optLong("souce_image_id"));
        c2094m.m6444b(jSONObject.optLong("id"));
        c2094m.m6442b(jSONObject.optString("scale_image_url"));
        c2094m.m6438c(jSONObject.optString("image_url"));
        c2094m.m6440c(jSONObject.optInt("category_id"));
        c2094m.m6448a(enumC2057ai);
        c2094m.m6445b(jSONObject.optInt("download_count"));
        c2094m.m6441b(jSONObject.optInt("is_user") == 1);
        c2094m.m6435e(jSONObject.optString("author"));
        JSONObject optJSONObject = jSONObject.optJSONObject("theme");
        if (optJSONObject != null && optJSONObject.has("theme_id")) {
            c2094m.m6437d(optJSONObject.optLong("theme_id", 0L));
            c2094m.m6433f(optJSONObject.optString("theme_icon"));
            c2094m.m6436d(optJSONObject.optString("wp_apk_url"));
        }
        return c2094m;
    }

    /* renamed from: a */
    public static C2094m m6447a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2094m c2094m = new C2094m();
        c2094m.m6439c(jSONObject.optLong("id"));
        c2094m.m6442b(jSONObject.optString("url"));
        return c2094m;
    }
}
