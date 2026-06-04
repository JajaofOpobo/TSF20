package com.tsf.shell.setting;

import android.content.DialogInterface;
import android.preference.Preference;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class w implements DialogInterface.OnClickListener {
    private final /* synthetic */ Preference a;

    w(Preference preference) {
        this.a = preference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        int i3;
        int i4;
        i2 = u.a;
        i3 = u.b;
        if (i2 != i3) {
            i4 = u.b;
            com.tsf.shell.a.t.a(i4, Home.d());
            u.a(this.a);
        }
    }
}
