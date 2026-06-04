package com.tsf.shell.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.preference.widget.SeekBarPreference;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class SettingDrawerPreferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    private SeekBarPreference a;
    private SeekBarPreference b;
    private SeekBarPreference c;
    private boolean d = false;

    public static void a() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), SettingDrawerPreferenceActivity.class);
        Home.d().startActivity(intent);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_drawer);
        this.d = com.tsf.shell.a.t.B();
        this.a = (SeekBarPreference) findPreference("rows");
        this.b = (SeekBarPreference) findPreference("columns");
        this.c = (SeekBarPreference) findPreference("blackground_alpha");
        String str = " ( " + (com.censivn.C3DEngine.a.q ? com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_portrait) : com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_landscape)) + " )";
        this.a.setTitle(String.valueOf(com.censivn.C3DEngine.h.a.c(R.string.mn_grid_rows)) + str);
        this.b.setTitle(String.valueOf(com.censivn.C3DEngine.h.a.c(R.string.mn_grid_columns)) + str);
        this.c.c(0);
        this.c.b(100);
        this.b.c(com.tsf.shell.workspace3D.h.a.x.S);
        this.b.b(com.tsf.shell.workspace3D.h.a.x.T);
        this.a.c(com.tsf.shell.workspace3D.h.a.x.U);
        this.a.b(com.tsf.shell.workspace3D.h.a.x.V);
        this.b.a(com.tsf.shell.workspace3D.h.a.x.M);
        this.a.a(com.tsf.shell.workspace3D.h.a.x.N);
        this.c.a(com.tsf.shell.workspace3D.a.a);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("auto_size");
        checkBoxPreference.setChecked(this.d);
        checkBoxPreference.setOnPreferenceChangeListener(new d(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        int a = this.c.a();
        if (a != com.tsf.shell.workspace3D.a.a) {
            com.tsf.shell.a.t.h(a);
        }
        if (this.d) {
            if (com.tsf.shell.a.t.B() != this.d) {
                com.tsf.shell.a.t.d(this.d);
                if (com.tsf.shell.workspace3D.h.a.x.M != this.b.a() || com.tsf.shell.workspace3D.h.a.x.N != this.a.a()) {
                    bf.j().p().bD();
                }
            }
        } else {
            if (com.tsf.shell.a.t.B() != this.d) {
                com.tsf.shell.a.t.d(this.d);
            }
            if (com.tsf.shell.workspace3D.h.a.x.M != this.b.a()) {
                b();
            } else if (com.tsf.shell.workspace3D.h.a.x.N != this.a.a()) {
                b();
            }
        }
        super.onPause();
    }

    private void b() {
        int a = this.a.a();
        int a2 = this.b.a();
        com.tsf.shell.a.t.a(a, a2);
        bf.j().p().a(a2, a);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        return true;
    }
}
