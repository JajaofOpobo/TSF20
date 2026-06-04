package com.tsf.shell.preference;

import android.preference.Preference;

/* loaded from: classes.dex */
final class ab implements Preference.OnPreferenceChangeListener {
    final /* synthetic */ SettingPreferenceActivity a;

    ab(SettingPreferenceActivity settingPreferenceActivity) {
        this.a = settingPreferenceActivity;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (com.tsf.shell.a.t.F() != booleanValue) {
            com.tsf.shell.a.t.f(booleanValue);
            return true;
        }
        return true;
    }
}
