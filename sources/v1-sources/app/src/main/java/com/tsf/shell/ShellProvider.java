package com.tsf.shell;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ShellProvider extends ContentProvider {
    static final Uri a = Uri.parse("content://com.tsf.shell.settings/appWidgetReset");
    private static ShellProvider c;
    private bu b;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        c = this;
        this.b = new bu(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        bv bvVar = new bv(uri, null, null);
        return TextUtils.isEmpty(bvVar.b) ? "vnd.android.cursor.dir/" + bvVar.a : "vnd.android.cursor.item/" + bvVar.a;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        bv bvVar = new bv(uri, str, strArr2);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(bvVar.a);
        Cursor query = sQLiteQueryBuilder.query(this.b.getWritableDatabase(), strArr, bvVar.b, bvVar.c, null, null, str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long insert = this.b.getWritableDatabase().insert(new bv(uri).a, null, contentValues);
        if (insert <= 0) {
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(uri, insert);
        a(withAppendedId);
        return withAppendedId;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        bv bvVar = new bv(uri);
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            for (ContentValues contentValues : contentValuesArr) {
                if (writableDatabase.insert(bvVar.a, null, contentValues) < 0) {
                    return 0;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            a(uri);
            return contentValuesArr.length;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        bv bvVar = new bv(uri, str, strArr);
        int delete = this.b.getWritableDatabase().delete(bvVar.a, bvVar.b, bvVar.c);
        if (delete > 0) {
            a(uri);
        }
        return delete;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            bv bvVar = new bv(uri, str, strArr);
            int update = this.b.getWritableDatabase().update(bvVar.a, contentValues, bvVar.b, bvVar.c);
            if (update > 0) {
                a(uri);
                return update;
            }
            return update;
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            String str2 = "";
            for (StackTraceElement stackTraceElement : stackTrace) {
                str2 = String.valueOf(str2) + stackTraceElement.toString() + "  '\\'";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("update database error", str2);
            com.flurry.android.t.a("EVENT_ISSUSE_FOLDER_THEME_MANAGER", hashMap);
            return 0;
        }
    }

    private void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("notify");
        if (queryParameter == null || "true".equals(queryParameter)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
    }
}
