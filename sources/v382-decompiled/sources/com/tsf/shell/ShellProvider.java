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
    public static String a;
    private static ShellProvider c;
    private m b;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a = String.valueOf(getContext().getPackageName()) + ".provider";
        com.censivn.C3DEngine.a.a(getContext(), "ShellProvider");
        if (c == null) {
            c = this;
        }
        this.b = new m(getContext());
        return true;
    }

    public static ShellProvider a() {
        return c;
    }

    public int b() {
        return this.b.a();
    }

    public int c() {
        return this.b.b();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        n nVar = new n(uri, null, null);
        return TextUtils.isEmpty(nVar.b) ? "vnd.android.cursor.dir/" + nVar.a : "vnd.android.cursor.item/" + nVar.a;
    }

    public void d() {
        this.b.c();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (this) {
            n nVar = new n(uri, str, strArr2);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(nVar.a);
            query = sQLiteQueryBuilder.query(this.b.getWritableDatabase(), strArr, nVar.b, nVar.c, null, null, str2);
            query.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2 = null;
        synchronized (this) {
            long insert = this.b.getWritableDatabase().insert(new n(uri).a, null, contentValues);
            if (insert > 0) {
                uri2 = ContentUris.withAppendedId(uri, insert);
                a(uri2);
            }
        }
        return uri2;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        synchronized (this) {
            n nVar = new n(uri, str, strArr);
            delete = this.b.getWritableDatabase().delete(nVar.a, nVar.b, nVar.c);
            if (delete > 0) {
                a(uri);
            }
        }
        return delete;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        synchronized (this) {
            try {
                n nVar = new n(uri, str, strArr);
                update = this.b.getWritableDatabase().update(nVar.a, contentValues, nVar.b, nVar.c);
                if (update > 0) {
                    a(uri);
                }
            } catch (Exception e) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                String str2 = "";
                for (StackTraceElement stackTraceElement : stackTrace) {
                    str2 = String.valueOf(str2) + stackTraceElement.toString() + "  '\\'";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("update database error", str2);
                com.tsf.shell.utils.n.a("EVENT_ISSUSE_FOLDER_THEME_MANAGER", hashMap);
                return 0;
            }
        }
        return update;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0014, code lost:
    
        r3.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        r3.endTransaction();
        a(r11);
        r0 = r12.length;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int i = 0;
        synchronized (this) {
            n nVar = new n(uri);
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int length = contentValuesArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (writableDatabase.insert(nVar.a, null, contentValuesArr[i2]) < 0) {
                        break;
                    }
                    i2++;
                }
            } finally {
                writableDatabase.endTransaction();
            }
        }
        return i;
    }

    private void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("notify");
        if (queryParameter == null || "true".equals(queryParameter)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
    }
}
