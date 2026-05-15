package com.tsf.shell;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.LinkedList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static d a;
    private LinkedList<Runnable> b = new LinkedList<>();
    private MessageQueue c = Looper.myQueue();
    private b d = new b(this, null);
    private boolean e = false;
    private String f;

    private class b extends Handler implements MessageQueue.IdleHandler {
        private b() {
        }

        /* synthetic */ b(d dVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (d.this.b) {
                if (d.this.b.size() != 0 && !d.this.e) {
                    ((Runnable) d.this.b.removeFirst()).run();
                    synchronized (d.this.b) {
                        d.this.b();
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

    private class a implements Runnable {
        Runnable a;

        @Override // java.lang.Runnable
        public void run() {
            this.a.run();
        }
    }

    public static d a() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    public void a(String str) {
        if (!this.e) {
            this.e = true;
            this.f = str;
        }
    }

    public void b(String str) {
        if (this.e && this.f == str) {
            this.e = false;
            if (this.b.size() > 0) {
                b();
            }
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.d$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Runnable a;

        @Override // java.lang.Runnable
        public void run() {
            com.censivn.C3DEngine.a.a().c(this.a);
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.b) {
            this.b.add(runnable);
            if (this.b.size() == 1) {
                b();
            }
        }
    }

    void b() {
        if (this.b.size() > 0) {
            if (this.b.getFirst() instanceof a) {
                this.c.addIdleHandler(this.d);
            } else {
                this.d.sendEmptyMessage(1);
            }
        }
    }
}
