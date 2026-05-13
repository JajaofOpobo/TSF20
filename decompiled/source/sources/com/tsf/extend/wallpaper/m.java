package com.tsf.extend.wallpaper;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m extends s implements Serializable {
    private long a;
    private String b;
    private String c;
    private int d;
    private int e;
    private long f;
    private long g;
    private boolean h;
    private String j;
    private String l;
    private ai m;
    private String i = "";
    private long k = 0;

    public long f() {
        return this.g;
    }

    public void b(long j) {
        this.g = j;
    }

    public long a() {
        return this.f;
    }

    public void a(long j) {
        this.f = j;
    }

    public int g() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public void a(ai aiVar) {
        this.m = aiVar;
    }

    public long h() {
        return this.a;
    }

    public void c(long j) {
        this.a = j;
    }

    public String i() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public String j() {
        return this.c;
    }

    public void c(String str) {
        this.c = str;
    }

    public int k() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public boolean l() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public String m() {
        return this.i;
    }

    public void d(String str) {
        this.i = str;
    }

    public boolean n() {
        return !TextUtils.isEmpty(this.i);
    }

    public String o() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public static List<m> b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList newArrayList = Lists.newArrayList();
        while (cursor.moveToNext()) {
            m mVar = new m();
            a(cursor, mVar);
            newArrayList.add(mVar);
        }
        cursor.close();
        return newArrayList;
    }

    public static void a(Cursor cursor, m mVar) {
        mVar.c(cursor.getInt(cursor.getColumnIndex("souce_id")));
        mVar.b(cursor.getString(cursor.getColumnIndex("thumbUrl")));
        mVar.c(cursor.getString(cursor.getColumnIndex("url")));
        mVar.c(cursor.getInt(cursor.getColumnIndex("categoryId")));
        mVar.b(cursor.getInt(cursor.getColumnIndex("user_upload")) == 1);
        mVar.e(cursor.getString(cursor.getColumnIndex("author")));
        mVar.d(cursor.getString(cursor.getColumnIndex("live_wp_down_url")));
    }

    public void d(long j) {
        this.k = j;
    }

    public void f(String str) {
        this.l = str;
    }

    public long p() {
        return this.k;
    }

    public String q() {
        return this.l;
    }

    public static m a(JSONObject jSONObject, ai aiVar) {
        if (jSONObject == null) {
            return null;
        }
        m mVar = new m();
        mVar.a(jSONObject.optLong("online_time"));
        mVar.c(jSONObject.optLong("souce_image_id"));
        mVar.b(jSONObject.optLong("id"));
        mVar.b(jSONObject.optString("scale_image_url"));
        mVar.c(jSONObject.optString("image_url"));
        mVar.c(jSONObject.optInt("category_id"));
        mVar.a(aiVar);
        mVar.b(jSONObject.optInt("download_count"));
        mVar.b(jSONObject.optInt("is_user") == 1);
        mVar.e(jSONObject.optString("author"));
        JSONObject optJSONObject = jSONObject.optJSONObject("theme");
        if (optJSONObject != null && optJSONObject.has("theme_id")) {
            mVar.d(optJSONObject.optLong("theme_id", 0L));
            mVar.f(optJSONObject.optString("theme_icon"));
            mVar.d(optJSONObject.optString("wp_apk_url"));
        }
        return mVar;
    }

    public static m a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        m mVar = new m();
        mVar.c(jSONObject.optLong("id"));
        mVar.b(jSONObject.optString("url"));
        return mVar;
    }
}
