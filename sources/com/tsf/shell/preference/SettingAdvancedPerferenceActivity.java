package com.tsf.shell.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p094d.C2238a;
import com.tsf.shell.utils.C4175k;
/* loaded from: classes.dex */
public class SettingAdvancedPerferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    /* renamed from: a */
    public static void m933a() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.SettingAdvancedPerferenceActivity.1
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setClass(C0853a.m10856d(), SettingAdvancedPerferenceActivity.class);
                Home.m6177b().startActivity(intent);
            }
        });
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(C1306b.C1317k.preferences_advanced);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("memory_pemanent");
        checkBoxPreference.setChecked(C3430e.m2535aA());
        checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.tsf.shell.preference.SettingAdvancedPerferenceActivity.2
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                C2238a.m6026a(SettingAdvancedPerferenceActivity.this, ((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference("home_key_patch").setOnPreferenceClickListener(this);
        findPreference("restart_shell").setOnPreferenceClickListener(this);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        if ("home_key_patch".equals(preference.getKey())) {
            C4175k.m671a(this, "com.tsf.shell.plugin.patch");
            return true;
        } else if ("restart_shell".equals(preference.getKey())) {
            m932b();
            return true;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public void m932b() {
        if (Home.m6177b() != null) {
            Home.m6177b().m6186a(100);
        }
    }
}
