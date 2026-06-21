package com.tsf.shell.plugin.fontspicker;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d {
    public static final String a = "CREATE TABLE fonts(_id INTEGER PRIMARY KEY," + c.c + " TEXT," + c.b + " TEXT," + c.a + " TEXT); ";
    private static d b;
    private e c;
    private AtomicInteger d = new AtomicInteger();
    private SQLiteDatabase e;

    public static d a(Context context) {
        if (b == null) {
            b = new d(context);
        }
        return b;
    }

    public d(Context context) {
        this.c = new e(context);
    }

    public int a(Uri uri, String str, String[] strArr) {
        int delete = a().delete("fonts", str, strArr);
        b();
        return delete;
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        long replace = a().replace("fonts", "_id", contentValues);
        b();
        if (replace > 0) {
            return ContentUris.withAppendedId(c.d, replace);
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return a().query("fonts", null, str, strArr2, null, null, str2);
    }

    public synchronized SQLiteDatabase a() {
        if (this.d.incrementAndGet() == 1) {
            this.e = this.c.getWritableDatabase();
        }
        com.tsf.shell.plugin.themepicker.g.b("openDatabase db :" + this.d.get());
        return this.e;
    }

    public synchronized void b() {
        if (this.d.get() != 0) {
            if (this.d.decrementAndGet() == 0) {
                this.e.close();
            }
            com.tsf.shell.plugin.themepicker.g.b("closeDatabase db :" + this.d.get());
        }
    }
}
