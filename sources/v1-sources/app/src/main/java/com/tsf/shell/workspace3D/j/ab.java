package com.tsf.shell.workspace3D.j;

import com.tsf.shell.R;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ab extends com.tsf.shell.setting.e {
    final /* synthetic */ n D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(n nVar, String str) {
        super(str, R.drawable.setting_360_icon, (char) 0);
        this.D = nVar;
    }

    @Override // com.tsf.shell.setting.e
    public final void g_() {
        if (bf.i().c()) {
            e(1);
        } else {
            e(0);
        }
    }
}
