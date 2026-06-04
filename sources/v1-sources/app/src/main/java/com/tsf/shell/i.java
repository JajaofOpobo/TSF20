package com.tsf.shell;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class i {
    private static i a;
    private LinkedList b = new LinkedList();
    private MessageQueue c = Looper.myQueue();
    private l d = new l(this, 0);
    private boolean e = false;
    private String f;

    public static i a() {
        if (a == null) {
            a = new i();
        }
        return a;
    }

    public final boolean b() {
        return !this.e;
    }

    public final void a(String str) {
        if (!this.e) {
            this.e = true;
            this.f = str;
        }
    }

    public final void b(String str) {
        if (this.e && this.f == str) {
            this.e = false;
            if (this.b.size() > 0) {
                c();
            }
        }
    }

    public final void a(Runnable runnable) {
        j jVar = new j(this, runnable);
        synchronized (this.b) {
            this.b.add(jVar);
            if (this.b.size() == 1) {
                c();
            }
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.b) {
            this.b.add(runnable);
            if (this.b.size() == 1) {
                c();
            }
        }
    }

    final void c() {
        if (this.b.size() > 0) {
            if (((Runnable) this.b.getFirst()) instanceof k) {
                this.c.addIdleHandler(this.d);
            } else {
                this.d.sendEmptyMessage(1);
            }
        }
    }
}
