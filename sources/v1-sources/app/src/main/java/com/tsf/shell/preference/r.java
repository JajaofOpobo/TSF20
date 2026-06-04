package com.tsf.shell.preference;

import android.preference.Preference;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class r implements Preference.OnPreferenceChangeListener {
    final /* synthetic */ q a;

    r(q qVar) {
        this.a = qVar;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (preference.getKey().equals("screen_infinite_scroll")) {
            if (com.tsf.shell.a.t.t() != booleanValue) {
                com.tsf.shell.a.t.c(Boolean.valueOf(booleanValue));
                bf.j().d();
                return true;
            }
            return true;
        }
        if (preference.getKey().equals("transparent_notification_bar")) {
            this.a.d = booleanValue;
            return true;
        }
        if (preference.getKey().equals("show_notification_bar")) {
            this.a.c = booleanValue;
            return true;
        }
        if (preference.getKey().equals("auto_hide_side_bar")) {
            if (com.tsf.shell.a.t.r() != booleanValue) {
                com.tsf.shell.a.t.b(Boolean.valueOf(booleanValue));
                return true;
            }
            return true;
        }
        if (preference.getKey().equals("desktop_select_countdown") && com.tsf.shell.a.t.p() != booleanValue) {
            com.tsf.shell.a.t.c(booleanValue);
            return true;
        }
        return true;
    }
}
