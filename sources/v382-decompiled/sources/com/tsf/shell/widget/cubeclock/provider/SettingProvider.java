package com.tsf.shell.widget.cubeclock.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SettingProvider extends ContentProvider {
    private static HashMap a;
    private static final UriMatcher b = new UriMatcher(-1);
    private c c;

    static {
        b.addURI("com.tsf.shell.widget.cubeclock.provider", "settings", 1);
        b.addURI("com.tsf.shell.widget.cubeclock.provider", "settings/#", 2);
        a = new HashMap();
        a.put("_id", "_id");
        a.put("widgetid", "widgetid");
        a.put("color", "color");
        a.put("created", "created");
        a.put("modified", "modified");
        a.put("mode", "mode");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new c(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        switch (b.match(uri)) {
            case 1:
                delete = writableDatabase.delete("settings", str, strArr);
                break;
            case 2:
                delete = writableDatabase.delete("settings", "_id=" + uri.getPathSegments().get(1) + (!TextUtils.isEmpty(str) ? " AND (" + str + ')' : ""), strArr);
                break;
            default:
                throw new IllegalArgumentException("Unnown URI" + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        ContentValues contentValues2;
        if (b.match(uri) != 1) {
            throw new IllegalArgumentException("Unknown URI " + uri);
        }
        if (contentValues != null) {
            contentValues2 = new ContentValues(contentValues);
        } else {
            contentValues2 = new ContentValues();
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (!contentValues2.containsKey("created")) {
            contentValues2.put("created", valueOf);
        }
        if (!contentValues2.containsKey("modified")) {
            contentValues2.put("modified", valueOf);
        }
        long replace = this.c.getWritableDatabase().replace("settings", "widgetid", contentValues2);
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(b.a, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        switch (b.match(uri)) {
            case 1:
                sQLiteQueryBuilder.setTables("settings");
                sQLiteQueryBuilder.setProjectionMap(a);
                break;
            case 2:
                sQLiteQueryBuilder.setTables("settings");
                sQLiteQueryBuilder.setProjectionMap(a);
                sQLiteQueryBuilder.appendWhere("_id=" + uri.getPathSegments().get(1));
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        Cursor query = sQLiteQueryBuilder.query(this.c.getReadableDatabase(), strArr, str, strArr2, null, null, TextUtils.isEmpty(str2) ? "modified DESC" : str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        switch (b.match(uri)) {
            case 1:
                return writableDatabase.update("settings", contentValues, str, strArr);
            case 2:
                return writableDatabase.update("settings", contentValues, "_id=" + uri.getPathSegments().get(1) + (!TextUtils.isEmpty(str) ? " AND (" + str + ')' : ""), strArr);
            default:
                throw new IllegalArgumentException("Unknow URI " + uri);
        }
    }
}
