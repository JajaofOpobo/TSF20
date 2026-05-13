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
import com.tsf.shell.plugin.themepicker.C3851e;
/* loaded from: classes.dex */
public class ThemeIconDesignerProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f12684a = "CREATE TABLE theme_packages(_id INTEGER PRIMARY KEY," + C3881g.f12710b + " TEXT," + C3881g.f12709a + " TEXT," + C3881g.f12711c + " REAL," + C3881g.f12713e + " TEXT," + C3881g.f12714f + " INTEGER," + C3881g.f12712d + " INTEGER); ";

    /* renamed from: b */
    public static final String f12685b = "CREATE TABLE theme_packages_ver_info(_id INTEGER PRIMARY KEY," + C3880f.f12706a + " TEXT UNIQUE NOT NULL," + C3880f.f12707b + " INTEGER); ";

    /* renamed from: d */
    private static final UriMatcher f12686d = new UriMatcher(-1);

    /* renamed from: c */
    private C3872a f12687c;

    static {
        f12686d.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages", 0);
        f12686d.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages_ver_info", 1);
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.icondesigner.ThemeIconDesignerProvider$a */
    /* loaded from: classes.dex */
    private static class C3872a extends SQLiteOpenHelper {
        C3872a(Context context) {
            super(context, "theme_icon_design.db", (SQLiteDatabase.CursorFactory) null, 8);
            C3851e.m1317b("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C3851e.m1317b("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(ThemeIconDesignerProvider.f12684a);
            sQLiteDatabase.execSQL(ThemeIconDesignerProvider.f12685b);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C3851e.m1317b("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages_ver_info");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f12687c = new C3872a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete = this.f12687c.getWritableDatabase().delete(m1302a(uri), str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long replace = this.f12687c.getWritableDatabase().replace(m1302a(uri), "_id", contentValues);
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(C3881g.f12715g, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = this.f12687c.getWritableDatabase().query(m1302a(uri), null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = this.f12687c.getWritableDatabase().update(m1302a(uri), contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return update;
    }

    /* renamed from: a */
    private String m1302a(Uri uri) {
        switch (f12686d.match(uri)) {
            case 0:
                return "theme_packages";
            case 1:
                return "theme_packages_ver_info";
            default:
                throw new SQLException("Table not exist");
        }
    }
}
