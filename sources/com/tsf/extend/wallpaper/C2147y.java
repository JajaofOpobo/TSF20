package com.tsf.extend.wallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.tsf.extend.wallpaper.y */
/* loaded from: classes.dex */
public class C2147y extends SQLiteOpenHelper {

    /* renamed from: a */
    private static String f7083a = "WallpaperProvider";

    /* renamed from: b */
    private static Object f7084b = new Object();

    public C2147y(Context context) {
        super(context, "wallpaper.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE wallpaper (_id INTEGER PRIMARY KEY,souce_id INTEGER,thumbUrl TEXT,url TEXT,categoryId INTEGER,user_upload INTEGER,author TEXT,fav_time INTEGER DEFAULT -1,local_time INTEGER DEFAULT -1,local_filename TEXT,live_wp_down_url TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < i2) {
            switch (i) {
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE wallpaper ADD COLUMN live_wp_down_url TEXT DEFAULT ''");
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public int m6224a(String str, String str2, String[] strArr) {
        int delete;
        synchronized (f7084b) {
            delete = getWritableDatabase().delete(str, str2, strArr);
        }
        return delete;
    }

    /* renamed from: a */
    public Cursor m6223a(String str, String[] strArr) {
        Cursor rawQuery;
        synchronized (f7084b) {
            rawQuery = getWritableDatabase().rawQuery(str, strArr);
        }
        return rawQuery;
    }

    /* renamed from: a */
    public long m6225a(String str, String str2, ContentValues contentValues) {
        long insert;
        synchronized (f7084b) {
            insert = getWritableDatabase().insert(str, str2, contentValues);
        }
        return insert;
    }

    /* renamed from: a */
    public Cursor m6222a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor query;
        synchronized (f7084b) {
            query = getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return query;
    }
}
