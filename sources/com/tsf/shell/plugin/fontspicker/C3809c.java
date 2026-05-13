package com.tsf.shell.plugin.fontspicker;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.tsf.shell.plugin.themepicker.C3851e;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.tsf.shell.plugin.fontspicker.c */
/* loaded from: classes.dex */
public class C3809c {

    /* renamed from: a */
    public static final String f12546a = "CREATE TABLE fonts(_id INTEGER PRIMARY KEY," + C3808b.f12544c + " TEXT," + C3808b.f12543b + " TEXT," + C3808b.f12542a + " TEXT); ";

    /* renamed from: b */
    private static C3809c f12547b;

    /* renamed from: c */
    private C3810a f12548c;

    /* renamed from: d */
    private AtomicInteger f12549d = new AtomicInteger();

    /* renamed from: e */
    private SQLiteDatabase f12550e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.fontspicker.c$a */
    /* loaded from: classes.dex */
    public static class C3810a extends SQLiteOpenHelper {
        C3810a(Context context) {
            super(context, "fonts.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C3809c.f12546a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fonts");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public static C3809c m1389a(Context context) {
        if (f12547b == null) {
            f12547b = new C3809c(context);
        }
        return f12547b;
    }

    public C3809c(Context context) {
        this.f12548c = new C3810a(context);
    }

    /* renamed from: a */
    public int m1387a(Uri uri, String str, String[] strArr) {
        int delete = m1390a().delete("fonts", str, strArr);
        m1385b();
        return delete;
    }

    /* renamed from: a */
    public Uri m1388a(Uri uri, ContentValues contentValues) {
        long replace = m1390a().replace("fonts", "_id", contentValues);
        m1385b();
        if (replace > 0) {
            return ContentUris.withAppendedId(C3808b.f12545d, replace);
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    /* renamed from: a */
    public Cursor m1386a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return m1390a().query("fonts", null, str, strArr2, null, null, str2);
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m1390a() {
        if (this.f12549d.incrementAndGet() == 1) {
            this.f12550e = this.f12548c.getWritableDatabase();
        }
        C3851e.m1317b("openDatabase db :" + this.f12549d.get());
        return this.f12550e;
    }

    /* renamed from: b */
    public synchronized void m1385b() {
        if (this.f12549d.get() != 0) {
            if (this.f12549d.decrementAndGet() == 0) {
                this.f12550e.close();
            }
            C3851e.m1317b("closeDatabase db :" + this.f12549d.get());
        }
    }
}
