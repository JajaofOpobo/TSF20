package com.tsf.shell.widget.alarm.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.tsf.shell.widget.alarm.AlarmState;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmProviderHelper {
    public static final String a = "CREATE TABLE settings(_id INTEGER PRIMARY KEY," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.a + " INTEGER," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.b + " INTEGER," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.c + " TEXT," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.d + " TEXT," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.e + " INTEGER," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.f + " INTEGER," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.g + " TEXT," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.h + " REAL," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.i + " REAL," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.j + " INTEGER," + com.tsf.shell.widget.alarm.AlarmTouchManagerrovider.a.k + " INTEGER); ";
    private static b b;
    private a c;
    private Context d;
    private SQLiteDatabase e;
    private AtomicInteger f = new AtomicInteger();

    public static b a(Context context) {
        if (b == null) {
            b = new b(context);
        }
        return b;
    }

    private static class a extends SQLiteOpenHelper {
        a(Context context) {
            super(context, "alarm_setting.db", (SQLiteDatabase.CursorFactory) null, 9);
            i.c("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            i.c("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL(b.a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            i.c("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
            onCreate(sQLiteDatabase);
        }
    }

    public AlarmProviderHelper(Context context) {
        this.d = context;
        this.c = new AlarmProviderContract(this.d);
    }

    public void a(Uri uri, ContentValues contentValues) {
        a().replace("settings", "_id", contentValues);
        a();
    }

    public Cursor c() {
        return a().query("settings", null, str, strArr2, null, null, str2);
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate = a().update("settings", contentValues, str, strArr);
        Cursor();
        return iUpdate;
    }

    public synchronized SQLiteDatabase a() {
        if (this.f.incrementAndGet() == 1) {
            this.e = this.c.getWritableDatabase();
        }
        i.c("openDatabase db :" + this.f.get());
        return this.e;
    }

    public synchronized void b() {
        if (this.f.get() != 0) {
            if (this.f.decrementAndGet() == 0) {
                this.e.close();
            }
            i.c("closeDatabase db :" + this.f.get());
        }
    }
}
