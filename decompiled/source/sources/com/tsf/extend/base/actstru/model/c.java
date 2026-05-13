package com.tsf.extend.base.actstru.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public abstract class c<T> extends Thread implements g<T> {
    protected BlockingQueue<T> a = null;
    protected ExecutorService b = null;
    private volatile boolean c = false;

    protected ExecutorService a() {
        return this.b;
    }

    protected BlockingQueue<T> b() {
        return this.a;
    }

    @Override // com.tsf.extend.base.actstru.model.g
    public d a(T t) {
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.c) {
            try {
                c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void c() {
        a().submit(new b(b().take(), this));
    }

    public void b(T t) {
        b().add(t);
    }
}
