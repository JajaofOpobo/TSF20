package com.tsf.shell.preference;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.util.DisplayMetrics;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.VersionDetailActivity;
import com.tsf.shell.au;
import com.tsf.shell.preference.video.VideoViwerActivity;
import com.tsf.shell.preference.widget.VideoPreference;

/* loaded from: classes.dex */
public class SettingPreferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    public static SettingPreferenceActivity a;
    private q b;

    public static void a() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), SettingPreferenceActivity.class);
        Home.d().startActivity(intent);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a = this;
        if (com.censivn.C3DEngine.a.c() == null) {
            com.censivn.C3DEngine.a.a((Context) this);
        }
        addPreferencesFromResource(R.xml.preferences);
        findPreference("emailPref").setOnPreferenceClickListener(this);
        findPreference("restartShell").setOnPreferenceClickListener(this);
        findPreference("unread").setOnPreferenceClickListener(this);
        findPreference("version").setTitle(b());
        findPreference("version_detail").setTitle("V1.9.9.7.6 " + com.censivn.C3DEngine.h.a.c(R.string.mn_version_detail));
        findPreference("version_detail").setSummary(String.valueOf(com.censivn.C3DEngine.h.a.c(R.string.mn_version_detail_summary)) + " 2013/9/25");
        findPreference("version_detail").setOnPreferenceClickListener(this);
        findPreference("db_export").setOnPreferenceClickListener(this);
        findPreference("db_import").setOnPreferenceClickListener(this);
        findPreference("db_reset").setOnPreferenceClickListener(this);
        findPreference("about").setOnPreferenceClickListener(this);
        findPreference("version").setOnPreferenceClickListener(this);
        findPreference("rate").setOnPreferenceClickListener(this);
        findPreference("db_import").setSummary("← /sdcard/TSFShell_data/");
        findPreference("db_export").setSummary("→ /sdcard/TSFShell_data/");
        ((VideoPreference) findPreference("video")).setOnPreferenceClickListener(this);
        t.a(this);
        y.a(this);
        this.b = new q(this);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("standard_sliding_mode");
        checkBoxPreference.setChecked(com.tsf.shell.a.t.H());
        checkBoxPreference.setOnPreferenceChangeListener(new ac(this));
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("indicator_mode");
        checkBoxPreference2.setChecked(com.tsf.shell.a.t.F());
        checkBoxPreference2.setOnPreferenceChangeListener(new ab(this));
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference("vibration_feedback");
        checkBoxPreference3.setChecked(com.tsf.shell.a.t.E());
        checkBoxPreference3.setOnPreferenceChangeListener(new aa(this));
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        t.a();
        y.a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Home.d() == null || !Home.d().b()) {
            y.b();
        }
        this.b.a();
        super.onPause();
    }

    private String b() {
        String string = getString(R.string.mn_version);
        try {
            return String.valueOf(string) + ":" + getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return string;
        }
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        if ("emailPref".equals(preference.getKey())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"service@tsfui.com", ""});
            String a2 = com.tsf.shell.b.a.a(this);
            intent.putExtra("android.intent.extra.SUBJECT", String.valueOf(a2) + " " + getString(R.string.mn_feedback));
            intent.putExtra("android.intent.extra.TITLE", String.valueOf(a2) + " " + getString(R.string.mn_feedback));
            String str = "\n\n\n\n\n=====================\n";
            try {
                String a3 = com.tsf.shell.b.a.a(com.tsf.shell.b.a.b(this, com.tsf.shell.b.a.a(this, String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(com.tsf.shell.b.a.b("\n\n\n\n\n=====================\n")) + "AndroidVersion:" + Build.VERSION.RELEASE + "\n") + "SDKVersion:" + Build.VERSION.SDK + "\n") + "DeviceModel:" + Build.MODEL + "\n") + "Product:" + Build.PRODUCT + "\n") + "Device:" + Build.DEVICE + "\n") + "Board:" + Build.BOARD + "\n") + "Rom:" + Build.DISPLAY + "\n")));
                new DisplayMetrics();
                str = String.valueOf(a3) + "Density:" + getResources().getDisplayMetrics().density + "\n";
            } catch (Exception e) {
            }
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "Email"));
        } else if ("restartShell".equals(preference.getKey())) {
            Home.d().c();
        } else if ("db_export".equals(preference.getKey())) {
            com.tsf.shell.a.l.b(this);
        } else if ("db_import".equals(preference.getKey())) {
            com.tsf.shell.a.l.a(this);
        } else if ("db_reset".equals(preference.getKey())) {
            com.tsf.shell.a.l.c(this);
        } else if ("video".equals(preference.getKey())) {
            VideoViwerActivity.a(this);
        } else if ("version_detail".equals(preference.getKey())) {
            VersionDetailActivity.a(this);
        } else if ("unread".equals(preference.getKey())) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.tsf.shell.services.notifier", "com.tsf.shell.services.notifier.MainActivity"));
            intent2.setAction("android.intent.action.VIEW");
            try {
                startActivity(intent2);
            } catch (Exception e2) {
                au.a(a, new ad(this));
            }
        } else if ("about".equals(preference.getKey())) {
            AboutActivity.a(this);
        } else if ("version".equals(preference.getKey())) {
            com.tsf.shell.g.d.a(this, "com.tsf.shell");
        } else if ("rate".equals(preference.getKey())) {
            com.tsf.shell.g.d.a(this, "com.tsf.shell");
        }
        return true;
    }
}
