package com.tsf.shell.services;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class b implements ServiceConnection {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0012 */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a.a = com.tsf.shell.services.a.b.a(iBinder);
        while (arrayList.size() > 0) {
            arrayList2 = this.a.e;
            ((Runnable) arrayList2.remove(0)).run();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a = null;
    }
}
