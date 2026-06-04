package com.tsf.shell;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class bk extends ContentObserver {
    final /* synthetic */ ShellApplication a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(ShellApplication shellApplication, Handler handler) {
        super(handler);
        this.a = shellApplication;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
    }
}
