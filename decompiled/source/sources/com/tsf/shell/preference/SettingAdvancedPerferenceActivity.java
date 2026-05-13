package com.tsf.shell.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.censivn.C3DEngine.a;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.b.e;
import com.tsf.shell.utils.k;
/* loaded from: classes.dex */
public class SettingAdvancedPerferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    public static void a() {
        a.a().a(new Runnable() { // from class: com.tsf.shell.preference.SettingAdvancedPerferenceActivity.1
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setClass(a.d(), SettingAdvancedPerferenceActivity.class);
                Home.b().startActivity(intent);
            }
        });
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(b.k.preferences_advanced);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("memory_pemanent");
        checkBoxPreference.setChecked(e.aA());
        checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.tsf.shell.preference.SettingAdvancedPerferenceActivity.2
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                com.tsf.shell.d.a.a(SettingAdvancedPerferenceActivity.this, ((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference("home_key_patch").setOnPreferenceClickListener(this);
        findPreference("restart_shell").setOnPreferenceClickListener(this);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        if ("home_key_patch".equals(preference.getKey())) {
            k.a(this, "com.tsf.shell.plugin.patch");
            return true;
        } else if ("restart_shell".equals(preference.getKey())) {
            b();
            return true;
        } else {
            return true;
        }
    }

    public void b() {
        if (Home.b() != null) {
            Home.b().a(100);
        }
    }
}
