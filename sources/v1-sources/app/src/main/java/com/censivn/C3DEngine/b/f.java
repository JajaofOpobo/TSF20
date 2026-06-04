package com.censivn.C3DEngine.b;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
final class f extends Handler {
    final /* synthetic */ b a;

    f(b bVar) {
        this.a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                b.a(this.a);
                return;
            case 2:
                b.b(this.a);
                return;
            case 3:
                com.censivn.C3DEngine.a.a().c(new e(this.a));
                return;
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
