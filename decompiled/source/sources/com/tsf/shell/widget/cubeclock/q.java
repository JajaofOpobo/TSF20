package com.tsf.shell.widget.cubeclock;

import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class q {
    public long a = -1;
    private Object b = new Object();
    private boolean c = false;
    private int d = 1000;
    private a e = new a();
    private c f;

    public q(c cVar) {
        this.f = cVar;
        this.e.start();
    }

    public void a() {
        this.c = true;
    }

    public void b() {
        this.c = false;
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    public void c() {
        this.e.a();
    }

    public void d() {
        a(ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
    }

    public void a(int i) {
        long currentTimeMillis = System.currentTimeMillis() + i;
        if (currentTimeMillis > this.a) {
            this.a = currentTimeMillis;
        }
    }

    public void b(int i) {
        this.a = System.currentTimeMillis() + i;
    }

    public void c(int i) {
        this.d = i;
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    /* loaded from: classes.dex */
    class a extends Thread {
        private boolean b = false;

        a() {
        }

        public void a() {
            this.b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (q.this.b) {
                    q.this.e();
                    if (!this.b) {
                        try {
                            if (q.this.c) {
                                q.this.b.wait();
                            } else {
                                q.this.b.wait(q.this.d);
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
    public void e() {
        this.f.d.post(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.q.1
            @Override // java.lang.Runnable
            public void run() {
                j.a("===========refreshTime=============");
                if (!q.this.c) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (q.this.a == -1) {
                        q.this.f.h.a(currentTimeMillis, false);
                    } else if (currentTimeMillis >= q.this.a) {
                        q.this.a = -1L;
                        q.this.f.h.a(currentTimeMillis, true);
                    }
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }
}
