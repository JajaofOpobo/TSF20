package com.censivn.C3DEngine.api.message;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.LinkedList;

/* loaded from: classes.dex */
class a extends Handler implements MessageQueue.IdleHandler {
    final /* synthetic */ VMessageQueueManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(VMessageQueueManager vMessageQueueManager, Looper looper) {
        super(looper);
        this.a = vMessageQueueManager;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        LinkedList linkedList;
        LinkedList linkedList2;
        boolean z;
        LinkedList linkedList3;
        LinkedList linkedList4;
        linkedList = this.a.mQueue;
        synchronized (linkedList) {
            linkedList2 = this.a.mQueue;
            if (linkedList2.size() != 0) {
                z = this.a.isPaused;
                if (!z) {
                    linkedList3 = this.a.mQueue;
                    ((Runnable) linkedList3.removeFirst()).run();
                    linkedList4 = this.a.mQueue;
                    synchronized (linkedList4) {
                        this.a.scheduleNextLocked();
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
