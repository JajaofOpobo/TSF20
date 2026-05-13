package com.tsf.shell.widget.alarm.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.tsf.shell.widget.alarm.i;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class SettingProvider extends ContentProvider {
    public static final String a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + com.tsf.shell.widget.alarm.provider.a.a + " INTEGER," + com.tsf.shell.widget.alarm.provider.a.b + " INTEGER," + com.tsf.shell.widget.alarm.provider.a.c + " TEXT," + com.tsf.shell.widget.alarm.provider.a.d + " TEXT," + com.tsf.shell.widget.alarm.provider.a.e + " INTEGER," + com.tsf.shell.widget.alarm.provider.a.f + " INTEGER," + com.tsf.shell.widget.alarm.provider.a.g + " TEXT," + com.tsf.shell.widget.alarm.provider.a.h + " REAL," + com.tsf.shell.widget.alarm.provider.a.i + " REAL," + com.tsf.shell.widget.alarm.provider.a.j + " INTEGER," + com.tsf.shell.widget.alarm.provider.a.k + " INTEGER); ";
    private AtomicInteger b = new AtomicInteger();
    private a c;
    private SQLiteDatabase d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        a(Context context) {
            super(context, "alarm_setting.db", (SQLiteDatabase.CursorFactory) null, 9);
            i.c("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            i.c("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(SettingProvider.a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            i.c("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.c = new a(getContext());
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
            Uri withAppendedId = ContentUris.withAppendedId(com.tsf.shell.widget.alarm.provider.a.l, replace);
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
