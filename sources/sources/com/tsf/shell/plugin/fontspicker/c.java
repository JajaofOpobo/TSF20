package com.tsf.shell.plugin.fontspicker;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.tsf.shell.plugin.themepicker.e;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static final String a = "CREATE TABLE fonts(_id INTEGER PRIMARY KEY," + b.c + " TEXT," + b.b + " TEXT," + b.a + " TEXT); ";
    private static c b;
    private a c;
    private AtomicInteger d = new AtomicInteger();
    private SQLiteDatabase e;

    private static class a extends SQLiteOpenHelper {
        a(Context context) {
            super(context, "fonts.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(c.a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fonts");
            onCreate(sQLiteDatabase);
        }
    }

    public static c a(Context context) {
        if (b == null) {
            b = new c(context);
        }
        return b;
    }

    public c(Context context) {
        this.c = new a(context);
    }

    public int a(Uri uri, String str, String[] strArr) {
        int iDelete = a().delete("fonts", str, strArr);
        b();
        return iDelete;
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        long jReplace = a().replace("fonts", "_id", contentValues);
        b();
        if (jReplace > 0) {
            return ContentUris.withAppendedId(b.d, jReplace);
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
        e.b("openDatabase db :" + this.d.get());
        return this.e;
    }

    public synchronized void b() {
        if (this.d.get() != 0) {
            if (this.d.decrementAndGet() == 0) {
                this.e.close();
            }
            e.b("closeDatabase db :" + this.d.get());
        }
    }
}
