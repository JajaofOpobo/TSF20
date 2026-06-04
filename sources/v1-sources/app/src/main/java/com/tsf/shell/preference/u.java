package com.tsf.shell.preference;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;

/* loaded from: classes.dex */
final class u implements Preference.OnPreferenceClickListener {
    u() {
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        PreferenceActivity preferenceActivity;
        if ("preference_folder_animation".equals(preference.getKey())) {
            preferenceActivity = t.d;
            t.a(preferenceActivity, preference);
            return true;
        }
        if ("preference_folder_auto_close".equals(preference.getKey())) {
            com.tsf.shell.a.t.j(((CheckBoxPreference) preference).isChecked());
            return true;
        }
        return true;
    }
}
