package com.tsf.shell.setting;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class q extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(l lVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = lVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        if (Build.VERSION.SDK_INT > 16) {
            Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
            Home d = Home.d();
            Integer.valueOf(0);
            d.b(intent);
            return;
        }
        if (Settings.System.getString(contentResolver, "airplane_mode_on").equals("0")) {
            Settings.System.putString(contentResolver, "airplane_mode_on", "1");
            com.censivn.C3DEngine.a.c().sendBroadcast(new Intent("android.intent.action.AIRPLANE_MODE"));
        } else {
            Settings.System.putString(contentResolver, "airplane_mode_on", "0");
            com.censivn.C3DEngine.a.c().sendBroadcast(new Intent("android.intent.action.AIRPLANE_MODE"));
        }
    }
}
