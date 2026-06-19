package com.tsf.shell.widget.cubeclock;

import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CubeClockTouchHandler {
    public long a = -1;
    private Object b = new Object();
    private boolean c = false;
    private int d = 1000;
    private A e = new CubeClockDigital();
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
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i);
        if (jCurrentTimeMillis > this.a) {
            this.a = jCurrentTimeMillis;
        }
    }

    public void b(int i) {
        this.a = System.currentTimeMillis() + ((long) i);
    }

    public void c(int i) {
        this.d = i;
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    class A extends Thread {
        private boolean b = false;

        A() {
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
                            CubeClockElementBase.printStackTrace();
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
        this.f.d.post(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.CubeClockTouchHandler.1
            @Override // java.lang.Runnable
            public void run() {
                CubeClockEmpty.a("===========refreshTime=============");
                if (!q.this.c) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (q.this.a == -1) {
                        q.this.f.h.a(jCurrentTimeMillis, false);
                    } else if (jCurrentTimeMillis >= q.this.a) {
                        q.this.a = -1L;
                        q.this.f.h.a(jCurrentTimeMillis, true);
                    }
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }
}
