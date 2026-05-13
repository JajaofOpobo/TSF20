package com.tsf.extend.theme;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.tsf.extend.theme.u */
/* loaded from: classes.dex */
public class C1893u extends SQLiteOpenHelper {

    /* renamed from: a */
    private static Object f6110a = new Object();

    public C1893u(Context context) {
        super(context, "theme.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private String m7114a() {
        return "CREATE TABLE IF NOT EXISTS favorite_theme (_id INTEGER PRIMARY KEY,package_name TEXT,theme_id LONG,name TEXT,download INTEGER,favorite INTEGER,url TEXT,image_url TEXT,cover_url TEXT,size TEXT,author TEXT,version_code INTEGER,version_name TEXT,preview_urls TEXT,theme_type INTEGER,extend_data TEXT);";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(m7114a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
