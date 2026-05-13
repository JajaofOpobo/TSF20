package com.tsf.extend.base.actstru.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
/* renamed from: com.tsf.extend.base.actstru.model.c */
/* loaded from: classes.dex */
public abstract class AbstractC1354c<T> extends Thread implements InterfaceC1359g<T> {

    /* renamed from: a */
    protected BlockingQueue<T> f4263a = null;

    /* renamed from: b */
    protected ExecutorService f4264b = null;

    /* renamed from: c */
    private volatile boolean f4265c = false;

    /* renamed from: a */
    protected ExecutorService m8917a() {
        return this.f4264b;
    }

    /* renamed from: b */
    protected BlockingQueue<T> m8916b() {
        return this.f4263a;
    }

    @Override // com.tsf.extend.base.actstru.model.InterfaceC1359g
    /* renamed from: a */
    public C1355d mo8881a(T t) {
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.f4265c) {
            try {
                m8914c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    protected void m8914c() {
        m8917a().submit(new C1353b(m8916b().take(), this));
    }

    /* renamed from: b */
    public void m8915b(T t) {
        m8916b().add(t);
    }
}
