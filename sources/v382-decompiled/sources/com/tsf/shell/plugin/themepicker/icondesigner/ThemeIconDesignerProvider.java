package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;

/* loaded from: classes.dex */
public class ThemeIconDesignerProvider extends ContentProvider {
    public static final String a = "CREATE TABLE theme_packages(_id INTEGER PRIMARY KEY," + h.b + " TEXT," + h.a + " TEXT," + h.c + " REAL," + h.e + " TEXT," + h.f + " INTEGER," + h.d + " INTEGER); ";
    public static final String b = "CREATE TABLE theme_packages_ver_info(_id INTEGER PRIMARY KEY," + g.a + " TEXT UNIQUE NOT NULL," + g.b + " INTEGER); ";
    private static final UriMatcher d = new UriMatcher(-1);
    private i c;

    static {
        d.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages", 0);
        d.addURI("com.tsf.shell.plugin.icondesigner.provider", "theme_packages_ver_info", 1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new i(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete = this.c.getWritableDatabase().delete(a(uri), str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long replace = this.c.getWritableDatabase().replace(a(uri), "_id", contentValues);
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(h.g, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = this.c.getWritableDatabase().query(a(uri), null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = this.c.getWritableDatabase().update(a(uri), contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return update;
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
