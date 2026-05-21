package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.os.PowerManager;
import com.tsf.shell.widget.alarm.i;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class a {
    private static PowerManager.WakeLock a;

    static void a(Context context) {
        i.d("Acquiring cpu wake lock");
        if (a == null) {
            a = ((PowerManager) context.getSystemService("power")).newWakeLock(805306369, "Alarm LOG");
            a.acquire();
        }
    }

    static void a() {
        i.d("Releasing cpu wake lock");
        if (a != null) {
            a.release();
            a = null;
        }
    }
}
