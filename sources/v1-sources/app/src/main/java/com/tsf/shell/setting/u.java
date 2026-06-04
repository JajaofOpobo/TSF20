package com.tsf.shell.setting;

import android.app.AlertDialog;
import android.content.Context;
import android.preference.Preference;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class u {
    private static int a = 0;
    private static int b = 0;

    public static void a(Preference preference) {
        switch (com.tsf.shell.a.t.a(com.censivn.C3DEngine.a.c())) {
            case 0:
                preference.setSummary(com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_system));
                break;
            case 1:
                preference.setSummary(com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_portrait));
                break;
            case 2:
                preference.setSummary(com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_landscape));
                break;
        }
    }

    public static void a(Context context, Preference preference) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.mn_screen_orientation);
        String[] strArr = {com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_system), com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_portrait), com.censivn.C3DEngine.h.a.c(R.string.mn_orientation_landscape)};
        int a2 = com.tsf.shell.a.t.a(context);
        b = a2;
        a = a2;
        builder.setSingleChoiceItems(strArr, a, new v());
        builder.setPositiveButton(R.string.public_action_ok, new w(preference));
        builder.setNegativeButton(R.string.public_action_cancel, new x());
        builder.create().show();
    }
}
