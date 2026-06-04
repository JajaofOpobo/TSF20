package com.tsf.shell.g;

import android.os.Vibrator;
import com.tsf.shell.Home;
import com.tsf.shell.a.t;

/* loaded from: classes.dex */
public final class h {
    private static Vibrator a = (Vibrator) Home.d().getSystemService("vibrator");

    public static void a() {
        if (t.E()) {
            a.vibrate(8L);
        }
    }

    public static void b() {
        if (t.E()) {
            a.vibrate(3L);
        }
    }

    public static void c() {
        b();
    }
}
