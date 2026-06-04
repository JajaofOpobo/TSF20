package com.tsf.shell.preference;

import android.preference.Preference;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ac implements Preference.OnPreferenceChangeListener {
    final /* synthetic */ SettingPreferenceActivity a;

    ac(SettingPreferenceActivity settingPreferenceActivity) {
        this.a = settingPreferenceActivity;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (preference.getKey().equals("standard_sliding_mode")) {
            com.tsf.shell.a.t.h(booleanValue);
            bf.j().o().a(booleanValue);
            return true;
        }
        return true;
    }
}
