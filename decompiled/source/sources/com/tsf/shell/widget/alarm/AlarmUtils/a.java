package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.os.PowerManager;
import com.tsf.shell.widget.alarm.i;
/* loaded from: classes.dex */
class a {
    private static PowerManager.WakeLock a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        i.d("Acquiring cpu wake lock");
        if (a == null) {
            a = ((PowerManager) context.getSystemService("power")).newWakeLock(805306369, "Alarm LOG");
            a.acquire();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        i.d("Releasing cpu wake lock");
        if (a != null) {
            a.release();
            a = null;
        }
    }
}
