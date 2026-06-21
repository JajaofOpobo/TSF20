package com.tsf.shell.widget.alarm.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SettingProvider extends ContentProvider {
    public static final String a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + a.a + " INTEGER," + a.b + " INTEGER," + a.c + " TEXT," + a.d + " TEXT," + a.e + " INTEGER," + a.f + " INTEGER," + a.g + " TEXT," + a.h + " REAL," + a.i + " REAL," + a.j + " INTEGER," + a.k + " INTEGER); ";
    private AtomicInteger b = new AtomicInteger();
    private d c;
    private SQLiteDatabase d;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new d(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete = a().delete("settings", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        b();
        return delete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long replace = a().replace("settings", "_id", contentValues);
        b();
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(a.l, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = a().query("settings", null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = a().update("settings", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        b();
        return update;
    }

    public synchronized SQLiteDatabase a() {
        if (this.b.incrementAndGet() == 1) {
            this.d = this.c.getWritableDatabase();
        }
        return this.d;
    }

    public synchronized void b() {
        if (this.b.decrementAndGet() == 0) {
            this.d.close();
        }
    }
}
