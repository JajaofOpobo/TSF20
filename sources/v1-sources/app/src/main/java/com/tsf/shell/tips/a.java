package com.tsf.shell.tips;

import android.view.View;

/* loaded from: classes.dex */
final class a implements View.OnClickListener {
    final /* synthetic */ TipsDialogActivity a;

    a(TipsDialogActivity tipsDialogActivity) {
        this.a = tipsDialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
