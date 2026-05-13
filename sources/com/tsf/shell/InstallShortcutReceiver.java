package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p180l.C3519a;
/* loaded from: classes.dex */
public class InstallShortcutReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private final int[] f7169a = new int[2];

    /* renamed from: a */
    public static BroadcastReceiver m6154a() {
        return new InstallShortcutReceiver();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.android.launcher.action.INSTALL_SHORTCUT".equals(intent.getAction())) {
            try {
                C3519a c3519a = C3359a.f11110x.f11627a;
                C3519a.m2148a(intent, (C3519a.C3522a) null);
            } catch (Exception e) {
            }
        }
    }
}
