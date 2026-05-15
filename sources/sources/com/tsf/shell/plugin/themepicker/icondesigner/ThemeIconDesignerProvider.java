package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeIconDesignerProvider extends ContentProvider {
    public static final String a = "CREATE TABLE theme_packages(_id INTEGER PRIMARY KEY," + g.b + " TEXT," + g.a + " TEXT," + g.c + " REAL," + g.e + " TEXT," + g.f + " INTEGER," + g.d + " INTEGER); ";
    public static final String b = "CREATE TABLE theme_packages_ver_info(_id INTEGER PRIMARY KEY," + f.a + " TEXT UNIQUE NOT NULL," + f.b + " INTEGER); ";
    private static final UriMatcher d = new UriMatcher(-1);
    private a c;

    static {
        d.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages", 0);
        d.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages_ver_info", 1);
    }

    private static class a extends SQLiteOpenHelper {
        a(Context context) {
            super(context, "theme_icon_design.db", (SQLiteDatabase.CursorFactory) null, 8);
            com.tsf.shell.plugin.themepicker.e.b("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            com.tsf.shell.plugin.themepicker.e.b("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(ThemeIconDesignerProvider.a);
            sQLiteDatabase.execSQL(ThemeIconDesignerProvider.b);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            com.tsf.shell.plugin.themepicker.e.b("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages_ver_info");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete = this.c.getWritableDatabase().delete(a(uri), str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long jReplace = this.c.getWritableDatabase().replace(a(uri), "_id", contentValues);
        if (jReplace > 0) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(g.g, jReplace);
            getContext().getContentResolver().notifyChange(uriWithAppendedId, null);
            return uriWithAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = this.c.getWritableDatabase().query(a(uri), null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate = this.c.getWritableDatabase().update(a(uri), contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return iUpdate;
    }

    private String a(Uri uri) {
        switch (d.match(uri)) {
            case 0:
                return "theme_packages";
            case 1:
                return "theme_packages_ver_info";
            default:
                throw new SQLException("Table not exist");
        }
    }
}
