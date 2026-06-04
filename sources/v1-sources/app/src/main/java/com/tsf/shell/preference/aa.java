package com.tsf.shell.preference;

import android.preference.Preference;

/* loaded from: classes.dex */
final class aa implements Preference.OnPreferenceChangeListener {
    final /* synthetic */ SettingPreferenceActivity a;

    aa(SettingPreferenceActivity settingPreferenceActivity) {
        this.a = settingPreferenceActivity;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (com.tsf.shell.a.t.E() != booleanValue) {
            com.tsf.shell.a.t.e(booleanValue);
            return true;
        }
        return true;
    }
}
