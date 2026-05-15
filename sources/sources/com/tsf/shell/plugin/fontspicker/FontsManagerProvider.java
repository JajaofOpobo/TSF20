package com.tsf.shell.plugin.fontspicker;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FontsManagerProvider extends ContentProvider {
    public static final String a = "CREATE TABLE fonts(_id INTEGER PRIMARY KEY," + b.c + " TEXT," + b.b + " TEXT," + b.a + " TEXT); ";
    private a b;

    private static class a extends SQLiteOpenHelper {
        a(Context context) {
            super(context, "fonts.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(FontsManagerProvider.a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fonts");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.b = new a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete = this.b.getWritableDatabase().delete("fonts", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long jReplace = this.b.getWritableDatabase().replace("fonts", "_id", contentValues);
        if (jReplace > 0) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(b.d, jReplace);
            getContext().getContentResolver().notifyChange(uriWithAppendedId, null);
            return uriWithAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = this.b.getWritableDatabase().query("fonts", null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate = this.b.getWritableDatabase().update("fonts", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return iUpdate;
    }
}
