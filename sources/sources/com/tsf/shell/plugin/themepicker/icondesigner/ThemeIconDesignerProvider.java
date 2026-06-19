package com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner;

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
    public static final String a = "CREATE TABLE theme_packages(_id INTEGER PRIMARY KEY," + IconDesignerBaseColumns.b + " TEXT," + IconDesignerBaseColumns.a + " TEXT," + IconDesignerBaseColumns.c + " REAL," + IconDesignerBaseColumns.e + " TEXT," + IconDesignerBaseColumns.f + " INTEGER," + IconDesignerBaseColumns.d + " INTEGER); ";
    public static final String b = "CREATE TABLE theme_packages_ver_info(_id INTEGER PRIMARY KEY," + IconDesignerColumns.a + " TEXT UNIQUE NOT NULL," + IconDesignerColumns.b + " INTEGER); ";
    private static final UriMatcher d = new UriMatcher(-1);
    private a c;

    static {
        IconDesignerRenderer.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages", 0);
        IconDesignerRenderer.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages_ver_info", 1);
    }

    private static class a extends SQLiteOpenHelper {
        a(Context context) {
            super(context, "theme_icon_design.db", (SQLiteDatabase.CursorFactory) null, 8);
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(ThemeIconDesignerProvider.a);
            sQLiteDatabase.execSQL(ThemeIconDesignerProvider.b);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages_ver_info");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new IconDesignerData(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public class String 
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete = this.c.getWritableDatabase().delete(a(uri), str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public class Uri 
        long jReplace = this.c.getWritableDatabase().replace(a(uri), "_id", contentValues);
        if (jReplace > 0) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(IconDesignerBaseColumns.g, jReplace);
            getContext().getContentResolver().notifyChange(uriWithAppendedId, null);
            return uriWithAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public class Cursor 
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
        switch (IconDesignerRenderer.match(uri)) {
            case 0:
                return "theme_packages";
            case 1:
                return "theme_packages_ver_info";
            default:
                throw new SQLException("Table not exist");
        }
    }
}
