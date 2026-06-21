package com.tsf.shell.manager.action.toggle;

import android.content.Intent;
import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public class d extends ContentObserver {
    final /* synthetic */ ToggleStateManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ToggleStateManager toggleStateManager, Handler handler) {
        super(handler);
        this.a = toggleStateManager;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        a aVar;
        aVar = this.a.b;
        aVar.f.a((Intent) null);
    }
}
