package com.tsf.shell.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.utils.l;

/* loaded from: classes.dex */
public class SettingAdvancedPerferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    public static void a() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.SettingAdvancedPerferenceActivity.1
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.a.d(), SettingAdvancedPerferenceActivity.class);
                Home.b().startActivity(intent);
            }
        });
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_advanced);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("memory_pemanent");
        checkBoxPreference.setChecked(g.ay());
        checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.tsf.shell.preference.SettingAdvancedPerferenceActivity.2
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                com.tsf.shell.c.a.a(SettingAdvancedPerferenceActivity.this, ((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference("home_key_patch").setOnPreferenceClickListener(this);
        findPreference("restart_shell").setOnPreferenceClickListener(this);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        if ("home_key_patch".equals(preference.getKey())) {
            l.a(this, "com.tsf.shell.plugin.patch");
            return true;
        }
        if ("restart_shell".equals(preference.getKey())) {
            b();
            return true;
        }
        return true;
    }

    public void b() {
        if (Home.b() != null) {
            Home.b().a(100);
        }
    }
}
