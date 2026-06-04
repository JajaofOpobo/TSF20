package com.tsf.shell.preference;

/* loaded from: classes.dex */
final class ad implements Runnable {
    final /* synthetic */ SettingPreferenceActivity a;

    ad(SettingPreferenceActivity settingPreferenceActivity) {
        this.a = settingPreferenceActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.g.d.a(this.a, "com.tsf.shell.services.notifier");
    }
}
