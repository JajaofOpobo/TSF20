package com.tsf.shell.widget.alarm.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.tsf.shell.widget.alarm.u;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b {
    public static final String a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + a.a + " INTEGER," + a.b + " INTEGER," + a.c + " TEXT," + a.d + " TEXT," + a.e + " INTEGER," + a.f + " INTEGER," + a.g + " TEXT," + a.h + " REAL," + a.i + " REAL," + a.j + " INTEGER," + a.k + " INTEGER); ";
    private static b b;
    private c c;
    private Context d;
    private SQLiteDatabase e;
    private AtomicInteger f = new AtomicInteger();

    public static b a(Context context) {
        if (b == null) {
            b = new b(context);
        }
        return b;
    }

    public b(Context context) {
        this.d = context;
        this.c = new c(this.d);
    }

    public void a(Uri uri, ContentValues contentValues) {
        a().replace("settings", "_id", contentValues);
        b();
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return a().query("settings", null, str, strArr2, null, null, str2);
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = a().update("settings", contentValues, str, strArr);
        b();
        return update;
    }

    public synchronized SQLiteDatabase a() {
        if (this.f.incrementAndGet() == 1) {
            this.e = this.c.getWritableDatabase();
        }
        u.c("openDatabase db :" + this.f.get());
        return this.e;
    }

    public synchronized void b() {
        if (this.f.get() != 0) {
            if (this.f.decrementAndGet() == 0) {
                this.e.close();
            }
            u.c("closeDatabase db :" + this.f.get());
        }
    }
}
