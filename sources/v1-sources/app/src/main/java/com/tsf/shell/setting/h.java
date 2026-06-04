package com.tsf.shell.setting;

import android.content.DialogInterface;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class h implements DialogInterface.OnClickListener {
    h() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        float f;
        float f2;
        boolean z;
        float f3;
        boolean z2;
        boolean z3;
        f = f.b;
        f2 = f.d;
        if (f == f2) {
            z2 = f.c;
            z3 = f.e;
            if (z2 == z3) {
                return;
            }
        }
        z = f.e;
        if (!z) {
            f3 = f.d;
            com.tsf.shell.a.t.c(f3);
        } else {
            com.tsf.shell.a.t.c(0.0f);
        }
        Home.d().c();
    }
}
