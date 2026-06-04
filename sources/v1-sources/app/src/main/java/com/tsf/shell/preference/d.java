package com.tsf.shell.preference;

import android.preference.Preference;
import com.tsf.shell.preference.widget.SeekBarPreference;

/* loaded from: classes.dex */
final class d implements Preference.OnPreferenceChangeListener {
    final /* synthetic */ SettingDrawerPreferenceActivity a;

    d(SettingDrawerPreferenceActivity settingDrawerPreferenceActivity) {
        this.a = settingDrawerPreferenceActivity;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean z;
        SeekBarPreference seekBarPreference;
        SeekBarPreference seekBarPreference2;
        this.a.d = ((Boolean) obj).booleanValue();
        z = this.a.d;
        if (z) {
            seekBarPreference = this.a.b;
            seekBarPreference.a(com.tsf.shell.workspace3D.h.a.x.W);
            seekBarPreference2 = this.a.a;
            seekBarPreference2.a(com.tsf.shell.workspace3D.h.a.x.X);
            return true;
        }
        return true;
    }
}
