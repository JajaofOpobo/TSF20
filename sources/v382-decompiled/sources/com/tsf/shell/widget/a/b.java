package com.tsf.shell.widget.a;

/* loaded from: classes.dex */
class b extends Thread {
    final /* synthetic */ a a;
    private boolean b = false;

    b(a aVar) {
        this.a = aVar;
    }

    public void a() {
        this.b = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        while (true) {
            obj = this.a.C;
            synchronized (obj) {
                this.a.invalidate();
                g.a("Timer Invalidate:" + this.a.b);
                if (!this.b) {
                    try {
                        if (this.a.b) {
                            obj3 = this.a.C;
                            obj3.wait();
                        } else {
                            obj2 = this.a.C;
                            obj2.wait(1000L);
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
