package com.tsf.shell.widget.alarm.setting;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tsf.shell.widget.alarm.i;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    public static boolean a;
    public static boolean b;
    public static String c;
    public static String d;
    public static long e;
    public static long f;
    public static String g;
    public static float h;
    public static float i;
    public static int j;
    public static int k;
    private static e m;
    private Context l;

    public e(Context context) throws Throwable {
        this.l = context;
        h();
        b();
        d();
    }

    public static e a(Context context) {
        if (m == null) {
            m = new e(context);
        }
        return m;
    }

    public static void a() {
        i.c("ShareObject Print:  AUTOLocation:" + a);
        i.c("ShareObject Print:  useCelsius:" + b);
        i.c("ShareObject Print:  LocationName:" + c);
        i.c("ShareObject Print:  LocationCode:" + d);
        i.c("ShareObject Print:  updateTime:" + f);
        i.c("ShareObject Print:  historySearch:" + g);
        i.c("ShareObject Print:  latitude:" + h);
        i.c("ShareObject Print:  longitude:" + i);
        i.c("ShareObject Print:  SnoozeDuration:" + j);
        i.c("ShareObject Print:  WidgetRefreshDuration:" + k);
    }

    public void b() {
        Cursor cursorA = com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, null, "_id=1", null, null);
        if (cursorA != null) {
            if (cursorA.moveToNext()) {
                a = cursorA.getInt(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.a)) > 0;
                b = cursorA.getInt(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.b)) > 0;
                e = cursorA.getLong(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.e));
                c = cursorA.getString(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.c));
                d = cursorA.getString(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.d));
                j = cursorA.getInt(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.j));
                k = cursorA.getInt(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.k));
            }
            cursorA.close();
        }
        com.tsf.shell.widget.alarm.provider.b.a(this.l).b();
    }

    public void c() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.a, Boolean.valueOf(a));
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.b, Boolean.valueOf(b));
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.c, c);
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.d, d);
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.e, Long.valueOf(e));
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.j, Integer.valueOf(j));
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.k, Integer.valueOf(k));
        i.c("Success Update data :" + com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, contentValues, "_id=1", null));
    }

    public void d() {
        Cursor cursorA = com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, null, "_id=1", null, null);
        if (cursorA != null) {
            if (cursorA.moveToNext()) {
                f = cursorA.getLong(cursorA.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.f));
            }
            cursorA.close();
        }
        com.tsf.shell.widget.alarm.provider.b.a(this.l).b();
        i.c("ReadUpdateTimeInfo:" + f);
    }

    public void e() {
        f = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.f, Long.valueOf(f));
        i.c("Success Update updateTime data :" + com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, contentValues, "_id=1", null) + " result:" + f);
    }

    public void f() {
        Intent intent = new Intent();
        intent.setAction("com.tsf.shell.widget.alarm.SettingOnChange");
        this.l.sendBroadcast(intent);
    }

    public static boolean g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = e;
        long j3 = f;
        i.b("Now:" + jCurrentTimeMillis);
        i.b("Las:" + j3);
        i.b("Dur:" + j2);
        if (j2 == 0) {
            i.b("CacheSwitcher:4:Cache");
            return true;
        }
        if (j3 == 0) {
            i.b("CacheSwitcher:0:NET");
            return false;
        }
        if (jCurrentTimeMillis < j3) {
            i.b("CacheSwitcher:1:NET");
            return false;
        }
        if (jCurrentTimeMillis - j3 > j2) {
            i.b("CacheSwitcher:2:NET");
            return false;
        }
        i.b("CacheSwitcher:3:Cache");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.widget.alarm.setting.e.h():void");
    }
}
