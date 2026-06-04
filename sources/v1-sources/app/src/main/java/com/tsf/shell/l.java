package com.tsf.shell;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class l extends Handler implements MessageQueue.IdleHandler {
    final /* synthetic */ i a;

    private l(i iVar) {
        this.a = iVar;
    }

    /* synthetic */ l(i iVar, byte b) {
        this(iVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        LinkedList linkedList;
        LinkedList linkedList2;
        boolean z;
        LinkedList linkedList3;
        LinkedList linkedList4;
        linkedList = this.a.b;
        synchronized (linkedList) {
            linkedList2 = this.a.b;
            if (linkedList2.size() != 0) {
                z = this.a.e;
                if (!z) {
                    linkedList3 = this.a.b;
                    ((Runnable) linkedList3.removeFirst()).run();
                    linkedList4 = this.a.b;
                    synchronized (linkedList4) {
                        this.a.c();
                    }
                }
            }
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        handleMessage(null);
        return false;
    }
}
