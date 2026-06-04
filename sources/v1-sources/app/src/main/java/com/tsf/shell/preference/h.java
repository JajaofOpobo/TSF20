package com.tsf.shell.preference;

import android.widget.Toast;
import com.tsf.shell.Home;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ SettingGesturePreferenceActivity a;

    h(SettingGesturePreferenceActivity settingGesturePreferenceActivity) {
        this.a = settingGesturePreferenceActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(Home.d(), R.string.activity_not_found, 0).show();
    }
}
