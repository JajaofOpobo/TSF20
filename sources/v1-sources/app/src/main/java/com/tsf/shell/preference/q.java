package com.tsf.shell.preference;

import android.preference.CheckBoxPreference;
import android.preference.PreferenceScreen;
import com.tsf.shell.Home;
import com.tsf.shell.bd;

/* loaded from: classes.dex */
public final class q {
    private SettingPreferenceActivity a;
    private int b;
    private boolean c;
    private boolean d;

    public q(SettingPreferenceActivity settingPreferenceActivity) {
        this.a = settingPreferenceActivity;
        this.b = com.tsf.shell.a.t.a(settingPreferenceActivity);
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.a.findPreference("preference_screen_screen");
        this.c = com.tsf.shell.a.t.w();
        this.d = com.tsf.shell.a.t.v();
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) this.a.findPreference("screenOrientation");
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.a.findPreference("desktop_select_countdown");
        checkBoxPreference.setChecked(com.tsf.shell.a.t.p());
        com.tsf.shell.setting.u.a(preferenceScreen2);
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.a.findPreference("auto_hide_side_bar");
        checkBoxPreference2.setChecked(com.tsf.shell.a.t.r());
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.a.findPreference("screen_infinite_scroll");
        checkBoxPreference3.setChecked(com.tsf.shell.a.t.t());
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.a.findPreference("show_notification_bar");
        checkBoxPreference4.setChecked(this.c);
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.a.findPreference("transparent_notification_bar");
        if (com.tsf.shell.g.c.b()) {
            checkBoxPreference5.setChecked(this.d);
        } else {
            preferenceScreen.removePreference(checkBoxPreference5);
        }
        r rVar = new r(this);
        s sVar = new s(this);
        checkBoxPreference3.setOnPreferenceChangeListener(rVar);
        checkBoxPreference4.setOnPreferenceChangeListener(rVar);
        checkBoxPreference5.setOnPreferenceChangeListener(rVar);
        checkBoxPreference2.setOnPreferenceChangeListener(rVar);
        checkBoxPreference.setOnPreferenceChangeListener(rVar);
        preferenceScreen2.setOnPreferenceClickListener(sVar);
    }

    public final void a() {
        if (com.tsf.shell.a.t.w() != this.c) {
            bd.a(!this.c);
        }
        if (com.tsf.shell.g.c.b() && com.tsf.shell.a.t.v() != this.d) {
            bd.a(Home.d(), this.d, true);
        }
    }
}
