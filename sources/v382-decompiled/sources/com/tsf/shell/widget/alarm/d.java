package com.tsf.shell.widget.alarm;

/* loaded from: classes.dex */
class d extends Thread {
    final /* synthetic */ AlarmWidget a;
    private boolean b = false;

    d(AlarmWidget alarmWidget) {
        this.a = alarmWidget;
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
            obj = this.a.v;
            synchronized (obj) {
                this.a.invalidate();
                u.c("Timer Invalidate:" + AlarmWidget.o);
                if (!this.b) {
                    try {
                        if (AlarmWidget.o) {
                            obj3 = this.a.v;
                            obj3.wait();
                        } else {
                            obj2 = this.a.v;
                            i = this.a.w;
                            obj2.wait(i * 1000);
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
