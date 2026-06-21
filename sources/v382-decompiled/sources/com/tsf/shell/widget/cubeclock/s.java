package com.tsf.shell.widget.cubeclock;

/* loaded from: classes.dex */
class s extends Thread {
    final /* synthetic */ r a;
    private boolean b = false;

    s(r rVar) {
        this.a = rVar;
    }

    public void a() {
        this.b = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        while (true) {
            obj = this.a.b;
            synchronized (obj) {
                this.a.e();
                if (!this.b) {
                    try {
                        if (this.a.c) {
                            obj3 = this.a.b;
                            obj3.wait();
                        } else {
                            obj2 = this.a.b;
                            i = this.a.d;
                            obj2.wait(i);
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
