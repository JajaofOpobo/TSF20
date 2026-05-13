package com.tsf.shell.widget.alarm.AlarmUtils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.provider.Settings;
import android.text.format.DateFormat;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.C4305i;
import java.util.Calendar;
import java.util.Date;
/* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.c */
/* loaded from: classes.dex */
public class C4242c {
    /* renamed from: a */
    public static Uri m441a(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("hour", (Integer) 8);
        return C4240b.m446a(context).m445a(Alarm.C4226a.f13668a, contentValues);
    }

    /* renamed from: b */
    public static Cursor m429b(Context context) {
        return new C4240b(context).m443a(Alarm.C4226a.f13668a, Alarm.C4226a.f13669b, null, null, "_id ASC");
    }

    /* renamed from: g */
    private static Cursor m421g(Context context) {
        return new C4240b(context).m443a(Alarm.C4226a.f13668a, Alarm.C4226a.f13669b, "enabled=1", null, null);
    }

    /* renamed from: a */
    public static Alarm m440a(Context context, int i) {
        Cursor m443a = C4240b.m446a(context).m443a(ContentUris.withAppendedId(Alarm.C4226a.f13668a, i), Alarm.C4226a.f13669b, null, null, null);
        if (m443a != null) {
            r3 = m443a.moveToFirst() ? new Alarm(m443a) : null;
            m443a.close();
        }
        return r3;
    }

    /* renamed from: a */
    public static void m436a(Context context, int i, boolean z, int i2, int i3, Alarm.C4227b c4227b, boolean z2, String str, String str2) {
        ContentValues contentValues = new ContentValues(8);
        long j = 0;
        if (!c4227b.m483c()) {
            j = m442a(i2, i3, c4227b).getTimeInMillis();
        }
        C4305i.m258d("**  setAlarm * idx " + i + " hour " + i2 + " minutes " + i3 + " enabled " + z + " time " + j);
        contentValues.put("enabled", Integer.valueOf(z ? 1 : 0));
        contentValues.put("hour", Integer.valueOf(i2));
        contentValues.put("minutes", Integer.valueOf(i3));
        contentValues.put("alarmtime", Long.valueOf(j));
        contentValues.put("daysofweek", Integer.valueOf(c4227b.m488a()));
        contentValues.put("vibrate", Boolean.valueOf(z2));
        contentValues.put("message", str);
        contentValues.put("alert", str2);
        C4240b.m446a(context).m444a(ContentUris.withAppendedId(Alarm.C4226a.f13668a, i), contentValues, null, null);
        m424d(context);
    }

    /* renamed from: a */
    public static void m437a(Context context, int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
        ContentValues contentValues = new ContentValues(8);
        Alarm.C4227b c4227b = new Alarm.C4227b(i4);
        long j = 0;
        if (!c4227b.m483c()) {
            j = m442a(i2, i3, c4227b).getTimeInMillis();
        }
        C4305i.m258d("**  setAlarm * idx " + i + " hour " + i2 + " minutes " + i3 + " enabled " + z + " time " + j);
        contentValues.put("enabled", Integer.valueOf(z ? 1 : 0));
        contentValues.put("hour", Integer.valueOf(i2));
        contentValues.put("minutes", Integer.valueOf(i3));
        contentValues.put("alarmtime", Long.valueOf(j));
        contentValues.put("daysofweek", Integer.valueOf(i4));
        contentValues.put("vibrate", Boolean.valueOf(z2));
        contentValues.put("message", str);
        contentValues.put("alert", str2);
        C4240b.m446a(context).m444a(ContentUris.withAppendedId(Alarm.C4226a.f13668a, i), contentValues, null, null);
        m424d(context);
    }

    /* renamed from: a */
    public static void m438a(Context context, int i, boolean z) {
        m427b(context, i, z);
        m424d(context);
    }

    /* renamed from: b */
    private static void m427b(Context context, int i, boolean z) {
        m434a(context, m440a(context, i), z);
    }

    /* renamed from: a */
    private static void m434a(Context context, Alarm alarm, boolean z) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("enabled", Integer.valueOf(z ? 1 : 0));
        if (z) {
            long j = 0;
            if (!alarm.f13662e.m483c()) {
                j = m442a(alarm.f13660c, alarm.f13661d, alarm.f13662e).getTimeInMillis();
            }
            contentValues.put("alarmtime", Long.valueOf(j));
        }
        C4240b.m446a(context).m444a(ContentUris.withAppendedId(Alarm.C4226a.f13668a, alarm.f13658a), contentValues, null, null);
    }

    /* renamed from: c */
    public static Alarm m425c(Context context) {
        Alarm alarm = null;
        long j = Long.MAX_VALUE;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor m421g = m421g(context);
        if (m421g != null) {
            if (m421g.moveToFirst()) {
                do {
                    Alarm alarm2 = new Alarm(m421g);
                    if (alarm2.f13663f == 0) {
                        alarm2.f13663f = m442a(alarm2.f13660c, alarm2.f13661d, alarm2.f13662e).getTimeInMillis();
                    } else if (alarm2.f13663f < currentTimeMillis) {
                        m434a(context, alarm2, false);
                    }
                    if (alarm2.f13663f < j) {
                        j = alarm2.f13663f;
                        alarm = alarm2;
                    }
                } while (m421g.moveToNext());
                m421g.close();
            } else {
                m421g.close();
            }
        }
        return alarm;
    }

    /* renamed from: d */
    public static void m424d(Context context) {
        if (!m420h(context)) {
            Alarm m425c = m425c(context);
            if (m425c != null) {
                m435a(context, m425c, m425c.f13663f);
            } else {
                m423e(context);
            }
        }
    }

    /* renamed from: a */
    private static void m435a(Context context, Alarm alarm, long j) {
        C4305i.m258d("** setAlert id " + alarm.f13658a + " atTime " + j);
        Intent intent = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
        Parcel obtain = Parcel.obtain();
        alarm.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        intent.putExtra("intent.extra.alarm_raw", obtain.marshall());
        ((AlarmManager) context.getSystemService("alarm")).set(0, j, PendingIntent.getBroadcast(context, 0, intent, 268435456));
        m431a(context, true);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        m433a(context, m426b(context, calendar));
    }

    /* renamed from: e */
    static void m423e(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT"), 268435456));
        m431a(context, false);
        m433a(context, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m439a(Context context, int i, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("AlarmClock", 0).edit();
        if (i == -1) {
            m430a(edit);
        } else {
            edit.putInt("snooze_id", i);
            edit.putLong("snooze_time", j);
            edit.commit();
        }
        m424d(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m428b(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("AlarmClock", 0);
        int i2 = sharedPreferences.getInt("snooze_id", -1);
        if (i2 != -1 && i2 == i) {
            m430a(sharedPreferences.edit());
        }
    }

    /* renamed from: a */
    private static void m430a(SharedPreferences.Editor editor) {
        editor.remove("snooze_id");
        editor.remove("snooze_time");
        editor.commit();
    }

    /* renamed from: h */
    private static boolean m420h(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("AlarmClock", 0);
        int i = sharedPreferences.getInt("snooze_id", -1);
        if (i == -1) {
            return false;
        }
        long j = sharedPreferences.getLong("snooze_time", -1L);
        Alarm m440a = m440a(context, i);
        m440a.f13663f = j;
        m435a(context, m440a, j);
        return true;
    }

    /* renamed from: a */
    private static void m431a(Context context, boolean z) {
        Intent intent = new Intent("android.intent.action.ALARM_CHANGED");
        intent.putExtra("alarmSet", z);
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    static Calendar m442a(int i, int i2, Alarm.C4227b c4227b) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        if (i < i3 || (i == i3 && i2 <= i4)) {
            calendar.add(6, 1);
        }
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int m485a = c4227b.m485a(calendar);
        if (m485a > 0) {
            calendar.add(7, m485a);
        }
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m432a(Context context, Calendar calendar) {
        return calendar == null ? "" : (String) DateFormat.format(m422f(context) ? "kk:mm" : "h:mm aa", calendar);
    }

    /* renamed from: b */
    private static String m426b(Context context, Calendar calendar) {
        return calendar == null ? "" : (String) DateFormat.format(m422f(context) ? "E k:mm" : "E h:mm aa", calendar);
    }

    /* renamed from: a */
    static void m433a(Context context, String str) {
        Settings.System.putString(context.getContentResolver(), "next_alarm_formatted", str);
    }

    /* renamed from: f */
    static boolean m422f(Context context) {
        return DateFormat.is24HourFormat(context);
    }
}
