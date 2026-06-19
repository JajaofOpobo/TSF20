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
import com.tsf.shell.widget.alarm.AlarmState;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SettingProvider extends ContentProvider {
    public static final String a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.a + " INTEGER," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.b + " INTEGER," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.c + " TEXT," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.d + " TEXT," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.e + " INTEGER," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.f + " INTEGER," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.g + " TEXT," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.h + " REAL," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.i + " REAL," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.j + " INTEGER," + com.tsf.shell.widget.alarm.provider.AlarmProviderContract.k + " INTEGER); ";
    private AtomicInteger b = new AtomicInteger();
    private a c;
    private SQLiteDatabase d;

    private static class a extends SQLiteOpenHelper {
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
        this.c = new AlarmProviderContract(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String c() {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int iDelete = a().delete("settings", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        a();
        return iDelete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long jReplace = a().replace("settings", "_id", contentValues);
        if (jReplace > 0) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(com.tsf.shell.widget.alarm.provider.AlarmProviderContract.l, jReplace);
            getContext().getContentResolver().notifyChange(uriWithAppendedId, null);
            return uriWithAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = a().query("settings", null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate = a().update("settings", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        a();
        return iUpdate;
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
