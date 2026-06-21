package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.os.PowerManager;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
class e {
    private static PowerManager.WakeLock a;

    static void a(Context context) {
        u.d("Acquiring cpu wake lock");
        if (a == null) {
            a = ((PowerManager) context.getSystemService("power")).newWakeLock(805306369, "Alarm LOG");
            a.acquire();
        }
    }

    static void a() {
        u.d("Releasing cpu wake lock");
        if (a != null) {
            a.release();
            a = null;
        }
    }
}
