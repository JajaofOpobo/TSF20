package com.tsf.shell;

import android.app.AlertDialog;
import android.content.Context;

/* loaded from: classes.dex */
final class ax implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ Runnable e;
    private final /* synthetic */ Runnable f;

    ax(Context context, String str, String str2, String str3, Runnable runnable, Runnable runnable2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = runnable;
        this.f = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setMessage(this.b).setCancelable(false).setPositiveButton(this.c, new ay(this, this.e));
        builder.setNegativeButton(this.d, new az(this, this.f));
        builder.create().show();
    }
}
