package com.tsf.shell;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class g {
    private static g a;
    private LinkedList b = new LinkedList();
    private MessageQueue c = Looper.myQueue();
    private i d = new i(this, null);
    private boolean e = false;
    private String f;

    public static g a() {
        if (a == null) {
            a = new g();
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
            if (((Runnable) this.b.getFirst()) instanceof h) {
                this.c.addIdleHandler(this.d);
            } else {
                this.d.sendEmptyMessage(1);
            }
        }
    }
}
