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
import com.tsf.shell.widget.alarm.i;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static Uri a(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("hour", (Integer) 8);
        return b.a(context).a(Alarm.a.a, contentValues);
    }

    public static Cursor b(Context context) {
        return new b(context).a(Alarm.a.a, Alarm.a.b, null, null, "_id ASC");
    }

    private static Cursor g(Context context) {
        return new b(context).a(Alarm.a.a, Alarm.a.b, "enabled=1", null, null);
    }

    public static Alarm a(Context context, int i) {
        Cursor cursorA = b.a(context).a(ContentUris.withAppendedId(Alarm.a.a, i), Alarm.a.b, null, null, null);
        if (cursorA != null) {
            alarm = cursorA.moveToFirst() ? new Alarm(cursorA) : null;
            cursorA.close();
        }
        return alarm;
    }

    public static void a(Context context, int i, boolean z, int i2, int i3, Alarm.b bVar, boolean z2, String str, String str2) {
        ContentValues contentValues = new ContentValues(8);
        long timeInMillis = 0;
        if (!bVar.c()) {
            timeInMillis = a(i2, i3, bVar).getTimeInMillis();
        }
        i.d("**  setAlarm * idx " + i + " hour " + i2 + " minutes " + i3 + " enabled " + z + " time " + timeInMillis);
        contentValues.put("enabled", Integer.valueOf(z ? 1 : 0));
        contentValues.put("hour", Integer.valueOf(i2));
        contentValues.put("minutes", Integer.valueOf(i3));
        contentValues.put("alarmtime", Long.valueOf(timeInMillis));
        contentValues.put("daysofweek", Integer.valueOf(bVar.a()));
        contentValues.put("vibrate", Boolean.valueOf(z2));
        contentValues.put("message", str);
        contentValues.put("alert", str2);
        b.a(context).a(ContentUris.withAppendedId(Alarm.a.a, i), contentValues, null, null);
        d(context);
    }

    public static void a(Context context, int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
        ContentValues contentValues = new ContentValues(8);
        Alarm.b bVar = new Alarm.b(i4);
        long timeInMillis = 0;
        if (!bVar.c()) {
            timeInMillis = a(i2, i3, bVar).getTimeInMillis();
        }
        i.d("**  setAlarm * idx " + i + " hour " + i2 + " minutes " + i3 + " enabled " + z + " time " + timeInMillis);
        contentValues.put("enabled", Integer.valueOf(z ? 1 : 0));
        contentValues.put("hour", Integer.valueOf(i2));
        contentValues.put("minutes", Integer.valueOf(i3));
        contentValues.put("alarmtime", Long.valueOf(timeInMillis));
        contentValues.put("daysofweek", Integer.valueOf(i4));
        contentValues.put("vibrate", Boolean.valueOf(z2));
        contentValues.put("message", str);
        contentValues.put("alert", str2);
        b.a(context).a(ContentUris.withAppendedId(Alarm.a.a, i), contentValues, null, null);
        d(context);
    }

    public static void a(Context context, int i, boolean z) {
        b(context, i, z);
        d(context);
    }

    private static void b(Context context, int i, boolean z) {
        a(context, a(context, i), z);
    }

    private static void a(Context context, Alarm alarm, boolean z) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("enabled", Integer.valueOf(z ? 1 : 0));
        if (z) {
            long timeInMillis = 0;
            if (!alarm.e.c()) {
                timeInMillis = a(alarm.c, alarm.d, alarm.e).getTimeInMillis();
            }
            contentValues.put("alarmtime", Long.valueOf(timeInMillis));
        }
        b.a(context).a(ContentUris.withAppendedId(Alarm.a.a, alarm.a), contentValues, null, null);
    }

    public static Alarm c(Context context) {
        Alarm alarm = null;
        long j = Long.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorG = g(context);
        if (cursorG != null) {
            if (cursorG.moveToFirst()) {
                do {
                    Alarm alarm2 = new Alarm(cursorG);
                    if (alarm2.f == 0) {
                        alarm2.f = a(alarm2.c, alarm2.d, alarm2.e).getTimeInMillis();
                    } else if (alarm2.f < jCurrentTimeMillis) {
                        a(context, alarm2, false);
                    }
                    if (alarm2.f < j) {
                        j = alarm2.f;
                        alarm = alarm2;
                    }
                } while (cursorG.moveToNext());
            }
            cursorG.close();
        }
        return alarm;
    }

    public static void d(Context context) {
        if (!h(context)) {
            Alarm alarmC = c(context);
            if (alarmC != null) {
                a(context, alarmC, alarmC.f);
            } else {
                e(context);
            }
        }
    }

    private static void a(Context context, Alarm alarm, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        i.d("** setAlert id " + alarm.a + " atTime " + j);
        Intent intent = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
        Parcel parcelObtain = Parcel.obtain();
        alarm.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        intent.putExtra("intent.extra.alarm_raw", parcelObtain.marshall());
        alarmManager.set(0, j, PendingIntent.getBroadcast(context, 0, intent, 268435456));
        a(context, true);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        a(context, b(context, calendar));
    }

    static void e(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT"), 268435456));
        a(context, false);
        a(context, "");
    }

    static void a(Context context, int i, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AlarmClock", 0).edit();
        if (i == -1) {
            a(editorEdit);
        } else {
            editorEdit.putInt("snooze_id", i);
            editorEdit.putLong("snooze_time", j);
            editorEdit.commit();
        }
        d(context);
    }

    static void b(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("AlarmClock", 0);
        int i2 = sharedPreferences.getInt("snooze_id", -1);
        if (i2 != -1 && i2 == i) {
            a(sharedPreferences.edit());
        }
    }

    private static void a(SharedPreferences.Editor editor) {
        editor.remove("snooze_id");
        editor.remove("snooze_time");
        editor.commit();
    }

    private static boolean h(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("AlarmClock", 0);
        int i = sharedPreferences.getInt("snooze_id", -1);
        if (i == -1) {
            return false;
        }
        long j = sharedPreferences.getLong("snooze_time", -1L);
        Alarm alarmA = a(context, i);
        alarmA.f = j;
        a(context, alarmA, j);
        return true;
    }

    private static void a(Context context, boolean z) {
        Intent intent = new Intent("android.intent.action.ALARM_CHANGED");
        intent.putExtra("alarmSet", z);
        context.sendBroadcast(intent);
    }

    static Calendar a(int i, int i2, Alarm.b bVar) {
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
        int iA = bVar.a(calendar);
        if (iA > 0) {
            calendar.add(7, iA);
        }
        return calendar;
    }

    static String a(Context context, Calendar calendar) {
        return calendar == null ? "" : (String) DateFormat.format(f(context) ? "kk:mm" : "h:mm aa", calendar);
    }

    private static String b(Context context, Calendar calendar) {
        return calendar == null ? "" : (String) DateFormat.format(f(context) ? "E k:mm" : "E h:mm aa", calendar);
    }

    static void a(Context context, String str) {
        Settings.System.putString(context.getContentResolver(), "next_alarm_formatted", str);
    }

    static boolean f(Context context) {
        return DateFormat.is24HourFormat(context);
    }
}
