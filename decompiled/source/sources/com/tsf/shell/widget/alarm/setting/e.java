package com.tsf.shell.widget.alarm.setting;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tsf.shell.widget.alarm.i;
/* loaded from: classes.dex */
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

    public e(Context context) {
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
        Cursor a2 = com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, null, "_id=1", null, null);
        if (a2 != null) {
            if (a2.moveToNext()) {
                a = a2.getInt(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.a)) > 0;
                b = a2.getInt(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.b)) > 0;
                e = a2.getLong(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.e));
                c = a2.getString(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.c));
                d = a2.getString(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.d));
                j = a2.getInt(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.j));
                k = a2.getInt(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.k));
            }
            a2.close();
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
        Cursor a2 = com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, null, "_id=1", null, null);
        if (a2 != null) {
            if (a2.moveToNext()) {
                f = a2.getLong(a2.getColumnIndex(com.tsf.shell.widget.alarm.provider.a.f));
            }
            a2.close();
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
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = e;
        long j3 = f;
        i.b("Now:" + currentTimeMillis);
        i.b("Las:" + j3);
        i.b("Dur:" + j2);
        if (j2 == 0) {
            i.b("CacheSwitcher:4:Cache");
            return true;
        } else if (j3 == 0) {
            i.b("CacheSwitcher:0:NET");
            return false;
        } else if (currentTimeMillis < j3) {
            i.b("CacheSwitcher:1:NET");
            return false;
        } else if (currentTimeMillis - j3 > j2) {
            i.b("CacheSwitcher:2:NET");
            return false;
        } else {
            i.b("CacheSwitcher:3:Cache");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            r7 = this;
            r6 = 0
            android.net.Uri r1 = com.tsf.shell.widget.alarm.provider.a.l
            java.lang.String r3 = "_id = 1"
            android.content.Context r0 = r7.l     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lbd
            com.tsf.shell.widget.alarm.provider.b r0 = com.tsf.shell.widget.alarm.provider.b.a(r0)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lbd
            r2 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r2 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lbd
            if (r2 == 0) goto L9a
            int r0 = r2.getCount()     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            if (r0 != 0) goto L9a
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.<init>()     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = "_id"
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.a     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.b     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.c     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r4 = ""
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.d     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r4 = ""
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.e     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.f     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.g     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r4 = ""
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.h     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.i     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.j     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.a.k     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            android.content.Context r3 = r7.l     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            com.tsf.shell.widget.alarm.provider.b r3 = com.tsf.shell.widget.alarm.provider.b.a(r3)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r3.a(r1, r0)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
        L9a:
            if (r2 == 0) goto La8
            r2.close()
            android.content.Context r0 = r7.l
            com.tsf.shell.widget.alarm.provider.b r0 = com.tsf.shell.widget.alarm.provider.b.a(r0)
            r0.b()
        La8:
            return
        La9:
            r0 = move-exception
            r1 = r6
        Lab:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto La8
            r1.close()
            android.content.Context r0 = r7.l
            com.tsf.shell.widget.alarm.provider.b r0 = com.tsf.shell.widget.alarm.provider.b.a(r0)
            r0.b()
            goto La8
        Lbd:
            r0 = move-exception
            r2 = r6
        Lbf:
            if (r2 == 0) goto Lcd
            r2.close()
            android.content.Context r1 = r7.l
            com.tsf.shell.widget.alarm.provider.b r1 = com.tsf.shell.widget.alarm.provider.b.a(r1)
            r1.b()
        Lcd:
            throw r0
        Lce:
            r0 = move-exception
            goto Lbf
        Ld0:
            r0 = move-exception
            r2 = r1
            goto Lbf
        Ld3:
            r0 = move-exception
            r1 = r2
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.widget.alarm.setting.e.h():void");
    }
}
