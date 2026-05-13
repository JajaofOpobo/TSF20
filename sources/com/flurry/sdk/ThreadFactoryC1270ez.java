package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.flurry.sdk.ez */
/* loaded from: classes.dex */
public class ThreadFactoryC1270ez implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f4036a;

    /* renamed from: b */
    private final int f4037b;

    public ThreadFactoryC1270ez(String str, int i) {
        this.f4036a = new ThreadGroup(str);
        this.f4037b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f4036a, runnable);
        thread.setName(this.f4036a.getName() + ":" + thread.getId());
        thread.setPriority(this.f4037b);
        return thread;
    }
}
