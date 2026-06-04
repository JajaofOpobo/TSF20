package com.tsf.shell.theme.inside;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class a extends BroadcastReceiver {
    final /* synthetic */ ThemeManager a;

    a(ThemeManager themeManager) {
        this.a = themeManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!ThemeManager.ACTION_APPLY_THEME.equals(intent.getAction())) {
            return;
        }
        this.a.setTheme(intent.getStringExtra("applyTheme"));
    }
}
