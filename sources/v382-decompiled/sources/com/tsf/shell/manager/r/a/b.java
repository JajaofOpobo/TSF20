package com.tsf.shell.manager.r.a;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
class b extends ContentObserver {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(new Handler());
        this.a = aVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        com.tsf.shell.d.a aVar;
        try {
            aVar = this.a.e;
            aVar.startListening();
        } catch (Exception e) {
        }
    }
}
