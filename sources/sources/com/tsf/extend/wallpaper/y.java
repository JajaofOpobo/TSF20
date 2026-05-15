package com.tsf.extend.wallpaper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class y extends SQLiteOpenHelper {
    private static String a = "WallpaperProvider";
    private static Object b = new Object();

    public y(Context context) {
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
                    break;
            }
        }
    }

    public int a(String str, String str2, String[] strArr) {
        int iDelete;
        synchronized (b) {
            iDelete = getWritableDatabase().delete(str, str2, strArr);
        }
        return iDelete;
    }

    public Cursor a(String str, String[] strArr) {
        Cursor cursorRawQuery;
        synchronized (b) {
            cursorRawQuery = getWritableDatabase().rawQuery(str, strArr);
        }
        return cursorRawQuery;
    }

    public long a(String str, String str2, ContentValues contentValues) {
        long jInsert;
        synchronized (b) {
            jInsert = getWritableDatabase().insert(str, str2, contentValues);
        }
        return jInsert;
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor cursorQuery;
        synchronized (b) {
            cursorQuery = getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return cursorQuery;
    }
}
