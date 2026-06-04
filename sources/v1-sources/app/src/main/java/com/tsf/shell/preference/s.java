package com.tsf.shell.preference;

import android.preference.Preference;

/* loaded from: classes.dex */
final class s implements Preference.OnPreferenceClickListener {
    final /* synthetic */ q a;

    s(q qVar) {
        this.a = qVar;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        SettingPreferenceActivity settingPreferenceActivity;
        SettingPreferenceActivity settingPreferenceActivity2;
        if ("screenOrientation".equals(preference.getKey())) {
            settingPreferenceActivity = this.a.a;
            settingPreferenceActivity2 = this.a.a;
            com.tsf.shell.setting.u.a(settingPreferenceActivity, settingPreferenceActivity2.findPreference("screenOrientation"));
            return true;
        }
        return true;
    }
}
