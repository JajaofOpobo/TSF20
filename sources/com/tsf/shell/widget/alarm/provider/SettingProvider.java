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
import com.tsf.shell.widget.alarm.C4305i;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class SettingProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f14025a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + C4326a.f14029a + " INTEGER," + C4326a.f14030b + " INTEGER," + C4326a.f14031c + " TEXT," + C4326a.f14032d + " TEXT," + C4326a.f14033e + " INTEGER," + C4326a.f14034f + " INTEGER," + C4326a.f14035g + " TEXT," + C4326a.f14036h + " REAL," + C4326a.f14037i + " REAL," + C4326a.f14038j + " INTEGER," + C4326a.f14039k + " INTEGER); ";

    /* renamed from: b */
    private AtomicInteger f14026b = new AtomicInteger();

    /* renamed from: c */
    private C4325a f14027c;

    /* renamed from: d */
    private SQLiteDatabase f14028d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.widget.alarm.provider.SettingProvider$a */
    /* loaded from: classes.dex */
    public static class C4325a extends SQLiteOpenHelper {
        C4325a(Context context) {
            super(context, "alarm_setting.db", (SQLiteDatabase.CursorFactory) null, 9);
            C4305i.m259c("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C4305i.m259c("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(SettingProvider.f14025a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C4305i.m259c("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f14027c = new C4325a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete = m225a().delete("settings", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        m224b();
        return delete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long replace = m225a().replace("settings", "_id", contentValues);
        m224b();
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(C4326a.f14040l, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = m225a().query("settings", null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = m225a().update("settings", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        m224b();
        return update;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m225a() {
        if (this.f14026b.incrementAndGet() == 1) {
            this.f14028d = this.f14027c.getWritableDatabase();
        }
        return this.f14028d;
    }

    /* renamed from: b */
    public synchronized void m224b() {
        if (this.f14026b.decrementAndGet() == 0) {
            this.f14028d.close();
        }
    }
}
