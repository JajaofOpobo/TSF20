package com.tsf.shell.tips;

import android.content.Intent;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class c implements Runnable {
    private final /* synthetic */ int a;

    c(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), TipsDialogActivity.class);
        intent.putExtra("type", this.a);
        b.f = Home.d().b(intent, b.a);
    }
}
