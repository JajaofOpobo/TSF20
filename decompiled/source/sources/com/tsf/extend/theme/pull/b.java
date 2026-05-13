package com.tsf.extend.theme.pull;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.tsf.extend.base.j.p;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class b {
    public static String a() {
        return String.valueOf(p.b()) + "x" + String.valueOf(p.c());
    }

    public static String b() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static void a(Context context, long j) {
    }

    public static String a(Context context) {
        return "1";
    }

    public static void a(Context context, String str) {
    }

    public static String b(Context context) {
        return "l";
    }

    public static void b(Context context, String str) {
    }

    public static int c(Context context) {
        return 1;
    }

    public static void a(Context context, int i) {
    }

    public static void a(Context context, int i, Class<?> cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        ((AlarmManager) context.getSystemService("alarm")).setRepeating(3, SystemClock.elapsedRealtime(), i, PendingIntent.getService(context, 0, intent, 134217728));
    }

    public static void a(Context context, Class<?> cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getService(context, 0, intent, 134217728));
    }
}
