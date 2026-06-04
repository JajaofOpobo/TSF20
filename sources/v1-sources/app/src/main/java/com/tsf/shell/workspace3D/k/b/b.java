package com.tsf.shell.workspace3D.k.b;

import com.tsf.shell.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {
    public static HashMap a;

    public static boolean a(com.tsf.shell.workspace3D.k.s sVar, boolean z) {
        boolean b = sVar.b();
        boolean z2 = sVar.j <= 4;
        Integer num = (Integer) a.get(sVar.a);
        boolean z3 = num == null || sVar.j >= num.intValue();
        if (b && z2 && z3) {
            return true;
        }
        if (z) {
            if (!b) {
                com.tsf.shell.au.a(R.string.notic_widget_exists);
            }
            if (!z2) {
                com.tsf.shell.au.a(R.string.notic_load_widget_error_update_shell, R.string.public_action_update, new c(), null);
            }
            if (!z3) {
                com.tsf.shell.au.a(R.string.notic_load_widget_error_update_widget, R.string.public_action_update, new d(sVar.a), null);
            }
        }
        return false;
    }
}
