package com.tsf.shell.widget.alarm.setting;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
public class j {
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
    private static j m;
    private Context l;

    public j(Context context) {
        this.l = context;
        h();
        b();
        d();
    }

    public static j a(Context context) {
        if (m == null) {
            m = new j(context);
        }
        return m;
    }

    public static void a() {
        u.c("ShareObject Print:  AUTOLocation:" + a);
        u.c("ShareObject Print:  useCelsius:" + b);
        u.c("ShareObject Print:  LocationName:" + c);
        u.c("ShareObject Print:  LocationCode:" + d);
        u.c("ShareObject Print:  updateTime:" + f);
        u.c("ShareObject Print:  historySearch:" + g);
        u.c("ShareObject Print:  latitude:" + h);
        u.c("ShareObject Print:  longitude:" + i);
        u.c("ShareObject Print:  SnoozeDuration:" + j);
        u.c("ShareObject Print:  WidgetRefreshDuration:" + k);
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
        u.c("Success Update data :" + com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, contentValues, "_id=1", null));
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
        u.c("ReadUpdateTimeInfo:" + f);
    }

    public void e() {
        f = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tsf.shell.widget.alarm.provider.a.f, Long.valueOf(f));
        u.c("Success Update updateTime data :" + com.tsf.shell.widget.alarm.provider.b.a(this.l).a(com.tsf.shell.widget.alarm.provider.a.l, contentValues, "_id=1", null) + " result:" + f);
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
        u.b("Now:" + currentTimeMillis);
        u.b("Las:" + j3);
        u.b("Dur:" + j2);
        if (j2 == 0) {
            u.b("CacheSwitcher:4:Cache");
            return true;
        }
        if (j3 == 0) {
            u.b("CacheSwitcher:0:NET");
            return false;
        }
        if (currentTimeMillis < j3) {
            u.b("CacheSwitcher:1:NET");
            return false;
        }
        if (currentTimeMillis - j3 > j2) {
            u.b("CacheSwitcher:2:NET");
            return false;
        }
        u.b("CacheSwitcher:3:Cache");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        Cursor cursor;
        Cursor cursor2;
        Uri uri = com.tsf.shell.widget.alarm.provider.a.l;
        try {
            cursor = com.tsf.shell.widget.alarm.provider.b.a(this.l).a(uri, null, "_id = 1", null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 0) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_id", (Integer) 1);
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.a, (Integer) 1);
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.b, (Integer) 1);
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.c, "");
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.d, "");
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.e, (Integer) 3600000);
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.f, (Integer) 0);
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.g, "");
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.h, Float.valueOf(0.0f));
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.i, Float.valueOf(0.0f));
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.j, (Integer) 10);
                        contentValues.put(com.tsf.shell.widget.alarm.provider.a.k, (Integer) 0);
                        com.tsf.shell.widget.alarm.provider.b.a(this.l).a(uri, contentValues);
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursor2 = cursor;
                    try {
                        e.printStackTrace();
                        if (cursor2 != null) {
                            cursor2.close();
                            com.tsf.shell.widget.alarm.provider.b.a(this.l).b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                            com.tsf.shell.widget.alarm.provider.b.a(this.l).b();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
                com.tsf.shell.widget.alarm.provider.b.a(this.l).b();
            }
        } catch (Exception e3) {
            e = e3;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }
}
