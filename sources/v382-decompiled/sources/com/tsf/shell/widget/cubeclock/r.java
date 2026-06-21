package com.tsf.shell.widget.cubeclock;

import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public class r {
    public long a = -1;
    private Object b = new Object();
    private boolean c = false;
    private int d = 1000;
    private s e = new s(this);
    private c f;

    public r(c cVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f.d.post(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.r.1
            @Override // java.lang.Runnable
            public void run() {
                j.a("===========refreshTime=============");
                if (!r.this.c) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (r.this.a == -1) {
                        r.this.f.h.a(currentTimeMillis, false);
                    } else if (currentTimeMillis >= r.this.a) {
                        r.this.a = -1L;
                        r.this.f.h.a(currentTimeMillis, true);
                    }
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }
}
