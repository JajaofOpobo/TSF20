package com.tsf.shell;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.censivn.C3DEngine.C0853a;
import java.util.LinkedList;
/* renamed from: com.tsf.shell.d */
/* loaded from: classes.dex */
public class C2234d {

    /* renamed from: a */
    private static C2234d f7327a;

    /* renamed from: b */
    private LinkedList<Runnable> f7328b = new LinkedList<>();

    /* renamed from: c */
    private MessageQueue f7329c = Looper.myQueue();

    /* renamed from: d */
    private HandlerC2237b f7330d = new HandlerC2237b(this, null);

    /* renamed from: e */
    private boolean f7331e = false;

    /* renamed from: f */
    private String f7332f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.d$b */
    /* loaded from: classes.dex */
    public class HandlerC2237b extends Handler implements MessageQueue.IdleHandler {
        private HandlerC2237b() {
        }

        /* synthetic */ HandlerC2237b(C2234d c2234d, RunnableC22351 runnableC22351) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (C2234d.this.f7328b) {
                if (C2234d.this.f7328b.size() != 0 && !C2234d.this.f7331e) {
                    ((Runnable) C2234d.this.f7328b.removeFirst()).run();
                    synchronized (C2234d.this.f7328b) {
                        C2234d.this.m6029b();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.d$a */
    /* loaded from: classes.dex */
    public class RunnableC2236a implements Runnable {

        /* renamed from: a */
        Runnable f7334a;

        @Override // java.lang.Runnable
        public void run() {
            this.f7334a.run();
        }
    }

    /* renamed from: a */
    public static C2234d m6033a() {
        if (f7327a == null) {
            f7327a = new C2234d();
        }
        return f7327a;
    }

    /* renamed from: a */
    public void m6030a(String str) {
        if (!this.f7331e) {
            this.f7331e = true;
            this.f7332f = str;
        }
    }

    /* renamed from: b */
    public void m6027b(String str) {
        if (this.f7331e && this.f7332f == str) {
            this.f7331e = false;
            if (this.f7328b.size() > 0) {
                m6029b();
            }
        }
    }

    /* renamed from: com.tsf.shell.d$1 */
    /* loaded from: classes.dex */
    class RunnableC22351 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f7333a;

        @Override // java.lang.Runnable
        public void run() {
            C0853a.m10865a().m10583c(this.f7333a);
        }
    }

    /* renamed from: a */
    public void m6031a(Runnable runnable) {
        synchronized (this.f7328b) {
            this.f7328b.add(runnable);
            if (this.f7328b.size() == 1) {
                m6029b();
            }
        }
    }

    /* renamed from: b */
    void m6029b() {
        if (this.f7328b.size() > 0) {
            if (this.f7328b.getFirst() instanceof RunnableC2236a) {
                this.f7329c.addIdleHandler(this.f7330d);
            } else {
                this.f7330d.sendEmptyMessage(1);
            }
        }
    }
}
