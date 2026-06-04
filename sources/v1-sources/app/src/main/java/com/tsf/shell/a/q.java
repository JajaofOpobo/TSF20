package com.tsf.shell.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class q {
    public static void a(boolean z) {
        SharedPreferences.Editor Z = t.Z();
        Z.putBoolean("startupError", z);
        Z.commit();
    }

    public static void a() {
        SharedPreferences.Editor Z = t.Z();
        Z.putBoolean("startupError", false);
        Z.putInt("startupErrorTimes", 0);
        Z.commit();
    }
}
