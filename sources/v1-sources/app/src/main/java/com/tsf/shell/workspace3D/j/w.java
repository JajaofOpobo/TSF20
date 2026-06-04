package com.tsf.shell.workspace3D.j;

import com.tsf.shell.R;

/* loaded from: classes.dex */
final class w extends com.tsf.shell.setting.e {
    final /* synthetic */ n D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(n nVar, String str) {
        super(str, R.drawable.setting_tips_icon, (char) 0);
        this.D = nVar;
    }

    @Override // com.tsf.shell.setting.e
    public final void g_() {
        if (com.tsf.shell.tips.b.b()) {
            e(1);
        } else {
            e(0);
        }
    }
}
