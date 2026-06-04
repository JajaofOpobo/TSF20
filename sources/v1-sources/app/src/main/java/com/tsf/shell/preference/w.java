package com.tsf.shell.preference;

import android.content.DialogInterface;
import android.preference.Preference;

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
        i2 = t.a;
        i3 = t.b;
        if (i2 != i3) {
            i4 = t.b;
            com.tsf.shell.a.t.m(i4);
            t.a(this.a);
        }
    }
}
