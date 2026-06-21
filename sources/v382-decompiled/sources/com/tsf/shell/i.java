package com.tsf.shell;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import java.util.LinkedList;

/* loaded from: classes.dex */
class i extends Handler implements MessageQueue.IdleHandler {
    final /* synthetic */ g a;

    private i(g gVar) {
        this.a = gVar;
    }

    /* synthetic */ i(g gVar, i iVar) {
        this(gVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
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
                        this.a.b();
                    }
                }
            }
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        handleMessage(null);
        return false;
    }
}
