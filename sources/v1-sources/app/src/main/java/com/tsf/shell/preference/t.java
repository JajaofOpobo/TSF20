package com.tsf.shell.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class t {
    private static int a = 0;
    private static int b = 0;
    private static Preference.OnPreferenceClickListener c;
    private static PreferenceActivity d;

    public static void a(PreferenceActivity preferenceActivity) {
        d = preferenceActivity;
        if (c == null) {
            c = new u();
        }
        Preference findPreference = preferenceActivity.findPreference("preference_folder_animation");
        findPreference.setOnPreferenceClickListener(c);
        a(findPreference);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceActivity.findPreference("preference_folder_auto_close");
        checkBoxPreference.setOnPreferenceClickListener(c);
        checkBoxPreference.setChecked(com.tsf.shell.a.t.S());
    }

    public static void a() {
        d = null;
        c = null;
    }

    public static void a(Preference preference) {
        switch (com.tsf.shell.a.t.R()) {
            case 0:
                preference.setSummary(com.censivn.C3DEngine.h.a.c(R.string.mn_folder_animation_quick));
                break;
            case 1:
                preference.setSummary(com.censivn.C3DEngine.h.a.c(R.string.mn_folder_animation_normal));
                break;
        }
    }

    public static int a(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 1) {
            return 1;
        }
        return i;
    }

    static /* synthetic */ void a(Context context, Preference preference) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.mn_folder_animation);
        int R = com.tsf.shell.a.t.R();
        b = R;
        a = R;
        builder.setSingleChoiceItems(new String[]{com.censivn.C3DEngine.h.a.c(R.string.mn_folder_animation_quick), com.censivn.C3DEngine.h.a.c(R.string.mn_folder_animation_normal)}, a, new v());
        builder.setPositiveButton(R.string.public_action_ok, new w(preference));
        builder.setNegativeButton(R.string.public_action_cancel, new x());
        builder.create().show();
    }
}
