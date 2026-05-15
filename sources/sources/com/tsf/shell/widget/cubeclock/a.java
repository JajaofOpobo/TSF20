package com.tsf.shell.widget.cubeclock;

import com.censivn.C3DEngine.api.message.VMessageQueueManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends e {
    public a(c cVar) {
        super(cVar);
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public int a() {
        return 5;
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public float[] a(int i) {
        return this.c.f.a(i);
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public void b(int i) {
        switch (i) {
            case 2:
                this.c.l.b();
                this.c.m.setZOrderOnTop();
                break;
        }
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public void c(int i) {
        switch (i) {
            case 2:
                this.c.l.d();
                break;
        }
    }

    @Override // com.tsf.shell.widget.cubeclock.e
    public void d(int i) {
        j.a("onItemSelect:" + i);
        switch (i) {
            case 2:
                this.c.l.a();
                this.c.d.post(new Runnable() { // from class: com.tsf.shell.widget.cubeclock.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.c.m.setZOrderOnTop();
                    }
                }, VMessageQueueManager.TYPE_GL_THREAD);
                break;
            case 3:
                this.c.h.a(1);
                break;
            case 4:
                this.c.h.a(0);
                break;
        }
    }
}
