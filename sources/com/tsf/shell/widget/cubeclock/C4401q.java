package com.tsf.shell.widget.cubeclock;

import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.widget.cubeclock.q */
/* loaded from: classes.dex */
public class C4401q {

    /* renamed from: a */
    public long f14283a = -1;

    /* renamed from: b */
    private Object f14284b = new Object();

    /* renamed from: c */
    private boolean f14285c = false;

    /* renamed from: d */
    private int f14286d = 1000;

    /* renamed from: e */
    private C4403a f14287e = new C4403a();

    /* renamed from: f */
    private C4382c f14288f;

    public C4401q(C4382c c4382c) {
        this.f14288f = c4382c;
        this.f14287e.start();
    }

    /* renamed from: a */
    public void m35a() {
        this.f14285c = true;
    }

    /* renamed from: b */
    public void m32b() {
        this.f14285c = false;
        synchronized (this.f14284b) {
            this.f14284b.notifyAll();
        }
    }

    /* renamed from: c */
    public void m29c() {
        this.f14287e.m22a();
    }

    /* renamed from: d */
    public void m26d() {
        m34a(ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
    }

    /* renamed from: a */
    public void m34a(int i) {
        long currentTimeMillis = System.currentTimeMillis() + i;
        if (currentTimeMillis > this.f14283a) {
            this.f14283a = currentTimeMillis;
        }
    }

    /* renamed from: b */
    public void m31b(int i) {
        this.f14283a = System.currentTimeMillis() + i;
    }

    /* renamed from: c */
    public void m28c(int i) {
        this.f14286d = i;
        synchronized (this.f14284b) {
            this.f14284b.notifyAll();
        }
    }

    /* renamed from: com.tsf.shell.widget.cubeclock.q$a */
    /* loaded from: classes.dex */
    class C4403a extends Thread {

        /* renamed from: b */
        private boolean f14291b = false;

        C4403a() {
        }

        /* renamed from: a */
        public void m22a() {
            this.f14291b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (C4401q.this.f14284b) {
                    C4401q.this.m24e();
                    if (!this.f14291b) {
                        try {
                            if (C4401q.this.f14285c) {
                                C4401q.this.f14284b.wait();
                            } else {
                                C4401q.this.f14284b.wait(C4401q.this.f14286d);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m24e() {
        this.f14288f.f14196d.post(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.q.1
            @Override // java.lang.Runnable
            public void run() {
                C4390j.m53a("===========refreshTime=============");
                if (!C4401q.this.f14285c) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C4401q.this.f14283a == -1) {
                        C4401q.this.f14288f.f14200h.m50a(currentTimeMillis, false);
                    } else if (currentTimeMillis >= C4401q.this.f14283a) {
                        C4401q.this.f14283a = -1L;
                        C4401q.this.f14288f.f14200h.m50a(currentTimeMillis, true);
                    }
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }
}
