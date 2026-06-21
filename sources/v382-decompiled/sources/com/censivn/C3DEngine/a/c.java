package com.censivn.C3DEngine.a;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
class c extends Handler {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, Handler handler) {
        super(handler.getLooper());
        this.a = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.a.d();
                return;
            case 2:
                this.a.b();
                return;
            case 3:
                this.a.f();
                return;
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
