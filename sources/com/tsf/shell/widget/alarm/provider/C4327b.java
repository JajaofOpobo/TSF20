package com.tsf.shell.widget.alarm.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.tsf.shell.widget.alarm.C4305i;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.tsf.shell.widget.alarm.provider.b */
/* loaded from: classes.dex */
public class C4327b {

    /* renamed from: a */
    public static final String f14041a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + C4326a.f14029a + " INTEGER," + C4326a.f14030b + " INTEGER," + C4326a.f14031c + " TEXT," + C4326a.f14032d + " TEXT," + C4326a.f14033e + " INTEGER," + C4326a.f14034f + " INTEGER," + C4326a.f14035g + " TEXT," + C4326a.f14036h + " REAL," + C4326a.f14037i + " REAL," + C4326a.f14038j + " INTEGER," + C4326a.f14039k + " INTEGER); ";

    /* renamed from: b */
    private static C4327b f14042b;

    /* renamed from: c */
    private C4328a f14043c;

    /* renamed from: d */
    private Context f14044d;

    /* renamed from: e */
    private SQLiteDatabase f14045e;

    /* renamed from: f */
    private AtomicInteger f14046f = new AtomicInteger();

    /* renamed from: a */
    public static C4327b m222a(Context context) {
        if (f14042b == null) {
            f14042b = new C4327b(context);
        }
        return f14042b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.widget.alarm.provider.b$a */
    /* loaded from: classes.dex */
    public static class C4328a extends SQLiteOpenHelper {
        C4328a(Context context) {
            super(context, "alarm_setting.db", (SQLiteDatabase.CursorFactory) null, 9);
            C4305i.m259c("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C4305i.m259c("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(C4327b.f14041a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C4305i.m259c("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
            onCreate(sQLiteDatabase);
        }
    }

    public C4327b(Context context) {
        this.f14044d = context;
        this.f14043c = new C4328a(this.f14044d);
    }

    /* renamed from: a */
    public void m221a(Uri uri, ContentValues contentValues) {
        m223a().replace("settings", "_id", contentValues);
        m218b();
    }

    /* renamed from: a */
    public Cursor m219a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return m223a().query("settings", null, str, strArr2, null, null, str2);
    }

    /* renamed from: a */
    public int m220a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = m223a().update("settings", contentValues, str, strArr);
        m218b();
        return update;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m223a() {
        if (this.f14046f.incrementAndGet() == 1) {
            this.f14045e = this.f14043c.getWritableDatabase();
        }
        C4305i.m259c("openDatabase db :" + this.f14046f.get());
        return this.f14045e;
    }

    /* renamed from: b */
    public synchronized void m218b() {
        if (this.f14046f.get() != 0) {
            if (this.f14046f.decrementAndGet() == 0) {
                this.f14045e.close();
            }
            C4305i.m259c("closeDatabase db :" + this.f14046f.get());
        }
    }
}
