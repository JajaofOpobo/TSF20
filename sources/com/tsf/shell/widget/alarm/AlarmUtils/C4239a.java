package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.os.PowerManager;
import com.tsf.shell.widget.alarm.C4305i;
/* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.a */
/* loaded from: classes.dex */
class C4239a {

    /* renamed from: a */
    private static PowerManager.WakeLock f13702a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m447a(Context context) {
        C4305i.m258d("Acquiring cpu wake lock");
        if (f13702a == null) {
            f13702a = ((PowerManager) context.getSystemService("power")).newWakeLock(805306369, "Alarm LOG");
            f13702a.acquire();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m448a() {
        C4305i.m258d("Releasing cpu wake lock");
        if (f13702a != null) {
            f13702a.release();
            f13702a = null;
        }
    }
}
