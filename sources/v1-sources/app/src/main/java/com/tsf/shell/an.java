package com.tsf.shell;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class an extends ContentObserver {
    final /* synthetic */ Home a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(Home home) {
        super(new Handler());
        this.a = home;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.w.startListening();
    }
}
