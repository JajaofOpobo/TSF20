package com.tsf.extend.theme.pull;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.tsf.extend.base.p080j.C1437p;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.tsf.extend.theme.pull.b */
/* loaded from: classes.dex */
public class C1873b {
    /* renamed from: a */
    public static String m7174a() {
        return String.valueOf(C1437p.m8619b()) + "x" + String.valueOf(C1437p.m8616c());
    }

    /* renamed from: b */
    public static String m7167b() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    /* renamed from: c */
    public static boolean m7164c() {
        return Build.VERSION.SDK_INT >= 16;
    }

    /* renamed from: a */
    public static void m7170a(Context context, long j) {
    }

    /* renamed from: a */
    public static String m7173a(Context context) {
        return "1";
    }

    /* renamed from: a */
    public static void m7168a(Context context, String str) {
    }

    /* renamed from: b */
    public static String m7166b(Context context) {
        return "l";
    }

    /* renamed from: b */
    public static void m7165b(Context context, String str) {
    }

    /* renamed from: c */
    public static int m7163c(Context context) {
        return 1;
    }

    /* renamed from: a */
    public static void m7172a(Context context, int i) {
    }

    /* renamed from: a */
    public static void m7171a(Context context, int i, Class<?> cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        ((AlarmManager) context.getSystemService("alarm")).setRepeating(3, SystemClock.elapsedRealtime(), i, PendingIntent.getService(context, 0, intent, 134217728));
    }

    /* renamed from: a */
    public static void m7169a(Context context, Class<?> cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getService(context, 0, intent, 134217728));
    }
}
