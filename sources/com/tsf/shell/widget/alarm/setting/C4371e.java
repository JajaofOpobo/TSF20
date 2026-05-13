package com.tsf.shell.widget.alarm.setting;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.provider.C4326a;
import com.tsf.shell.widget.alarm.provider.C4327b;
/* renamed from: com.tsf.shell.widget.alarm.setting.e */
/* loaded from: classes.dex */
public class C4371e {

    /* renamed from: a */
    public static boolean f14137a;

    /* renamed from: b */
    public static boolean f14138b;

    /* renamed from: c */
    public static String f14139c;

    /* renamed from: d */
    public static String f14140d;

    /* renamed from: e */
    public static long f14141e;

    /* renamed from: f */
    public static long f14142f;

    /* renamed from: g */
    public static String f14143g;

    /* renamed from: h */
    public static float f14144h;

    /* renamed from: i */
    public static float f14145i;

    /* renamed from: j */
    public static int f14146j;

    /* renamed from: k */
    public static int f14147k;

    /* renamed from: m */
    private static C4371e f14148m;

    /* renamed from: l */
    private Context f14149l;

    public C4371e(Context context) {
        this.f14149l = context;
        m111h();
        m117b();
        m115d();
    }

    /* renamed from: a */
    public static C4371e m118a(Context context) {
        if (f14148m == null) {
            f14148m = new C4371e(context);
        }
        return f14148m;
    }

    /* renamed from: a */
    public static void m119a() {
        C4305i.m259c("ShareObject Print:  AUTOLocation:" + f14137a);
        C4305i.m259c("ShareObject Print:  useCelsius:" + f14138b);
        C4305i.m259c("ShareObject Print:  LocationName:" + f14139c);
        C4305i.m259c("ShareObject Print:  LocationCode:" + f14140d);
        C4305i.m259c("ShareObject Print:  updateTime:" + f14142f);
        C4305i.m259c("ShareObject Print:  historySearch:" + f14143g);
        C4305i.m259c("ShareObject Print:  latitude:" + f14144h);
        C4305i.m259c("ShareObject Print:  longitude:" + f14145i);
        C4305i.m259c("ShareObject Print:  SnoozeDuration:" + f14146j);
        C4305i.m259c("ShareObject Print:  WidgetRefreshDuration:" + f14147k);
    }

    /* renamed from: b */
    public void m117b() {
        Cursor m219a = C4327b.m222a(this.f14149l).m219a(C4326a.f14040l, null, "_id=1", null, null);
        if (m219a != null) {
            if (m219a.moveToNext()) {
                f14137a = m219a.getInt(m219a.getColumnIndex(C4326a.f14029a)) > 0;
                f14138b = m219a.getInt(m219a.getColumnIndex(C4326a.f14030b)) > 0;
                f14141e = m219a.getLong(m219a.getColumnIndex(C4326a.f14033e));
                f14139c = m219a.getString(m219a.getColumnIndex(C4326a.f14031c));
                f14140d = m219a.getString(m219a.getColumnIndex(C4326a.f14032d));
                f14146j = m219a.getInt(m219a.getColumnIndex(C4326a.f14038j));
                f14147k = m219a.getInt(m219a.getColumnIndex(C4326a.f14039k));
            }
            m219a.close();
        }
        C4327b.m222a(this.f14149l).m218b();
    }

    /* renamed from: c */
    public void m116c() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C4326a.f14029a, Boolean.valueOf(f14137a));
        contentValues.put(C4326a.f14030b, Boolean.valueOf(f14138b));
        contentValues.put(C4326a.f14031c, f14139c);
        contentValues.put(C4326a.f14032d, f14140d);
        contentValues.put(C4326a.f14033e, Long.valueOf(f14141e));
        contentValues.put(C4326a.f14038j, Integer.valueOf(f14146j));
        contentValues.put(C4326a.f14039k, Integer.valueOf(f14147k));
        C4305i.m259c("Success Update data :" + C4327b.m222a(this.f14149l).m220a(C4326a.f14040l, contentValues, "_id=1", null));
    }

    /* renamed from: d */
    public void m115d() {
        Cursor m219a = C4327b.m222a(this.f14149l).m219a(C4326a.f14040l, null, "_id=1", null, null);
        if (m219a != null) {
            if (m219a.moveToNext()) {
                f14142f = m219a.getLong(m219a.getColumnIndex(C4326a.f14034f));
            }
            m219a.close();
        }
        C4327b.m222a(this.f14149l).m218b();
        C4305i.m259c("ReadUpdateTimeInfo:" + f14142f);
    }

    /* renamed from: e */
    public void m114e() {
        f14142f = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C4326a.f14034f, Long.valueOf(f14142f));
        C4305i.m259c("Success Update updateTime data :" + C4327b.m222a(this.f14149l).m220a(C4326a.f14040l, contentValues, "_id=1", null) + " result:" + f14142f);
    }

    /* renamed from: f */
    public void m113f() {
        Intent intent = new Intent();
        intent.setAction("com.tsf.shell.widget.alarm.SettingOnChange");
        this.f14149l.sendBroadcast(intent);
    }

    /* renamed from: g */
    public static boolean m112g() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = f14141e;
        long j2 = f14142f;
        C4305i.m260b("Now:" + currentTimeMillis);
        C4305i.m260b("Las:" + j2);
        C4305i.m260b("Dur:" + j);
        if (j == 0) {
            C4305i.m260b("CacheSwitcher:4:Cache");
            return true;
        } else if (j2 == 0) {
            C4305i.m260b("CacheSwitcher:0:NET");
            return false;
        } else if (currentTimeMillis < j2) {
            C4305i.m260b("CacheSwitcher:1:NET");
            return false;
        } else if (currentTimeMillis - j2 > j) {
            C4305i.m260b("CacheSwitcher:2:NET");
            return false;
        } else {
            C4305i.m260b("CacheSwitcher:3:Cache");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m111h() {
        /*
            r7 = this;
            r6 = 0
            android.net.Uri r1 = com.tsf.shell.widget.alarm.provider.C4326a.f14040l
            java.lang.String r3 = "_id = 1"
            android.content.Context r0 = r7.f14149l     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lbd
            com.tsf.shell.widget.alarm.provider.b r0 = com.tsf.shell.widget.alarm.provider.C4327b.m222a(r0)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lbd
            r2 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r2 = r0.m219a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lbd
            if (r2 == 0) goto L9a
            int r0 = r2.getCount()     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            if (r0 != 0) goto L9a
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.<init>()     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = "_id"
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14029a     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14030b     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14031c     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r4 = ""
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14032d     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r4 = ""
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14033e     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14034f     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14035g     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r4 = ""
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14036h     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14037i     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14038j     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            java.lang.String r3 = com.tsf.shell.widget.alarm.provider.C4326a.f14039k     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            android.content.Context r3 = r7.f14149l     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            com.tsf.shell.widget.alarm.provider.b r3 = com.tsf.shell.widget.alarm.provider.C4327b.m222a(r3)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
            r3.m221a(r1, r0)     // Catch: java.lang.Throwable -> Lce java.lang.Exception -> Ld3
        L9a:
            if (r2 == 0) goto La8
            r2.close()
            android.content.Context r0 = r7.f14149l
            com.tsf.shell.widget.alarm.provider.b r0 = com.tsf.shell.widget.alarm.provider.C4327b.m222a(r0)
            r0.m218b()
        La8:
            return
        La9:
            r0 = move-exception
            r1 = r6
        Lab:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto La8
            r1.close()
            android.content.Context r0 = r7.f14149l
            com.tsf.shell.widget.alarm.provider.b r0 = com.tsf.shell.widget.alarm.provider.C4327b.m222a(r0)
            r0.m218b()
            goto La8
        Lbd:
            r0 = move-exception
            r2 = r6
        Lbf:
            if (r2 == 0) goto Lcd
            r2.close()
            android.content.Context r1 = r7.f14149l
            com.tsf.shell.widget.alarm.provider.b r1 = com.tsf.shell.widget.alarm.provider.C4327b.m222a(r1)
            r1.m218b()
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.widget.alarm.setting.C4371e.m111h():void");
    }
}
