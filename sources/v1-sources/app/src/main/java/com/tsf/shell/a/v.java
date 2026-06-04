package com.tsf.shell.a;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class v implements Runnable {
    private final /* synthetic */ int a;

    v(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor Z = t.Z();
        Z.putInt("screen", this.a);
        Z.commit();
    }
}
