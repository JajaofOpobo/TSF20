package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ez implements ThreadFactory {
    private final ThreadGroup a;
    private final int b;

    public ez(String str, int i) {
        this.a = new ThreadGroup(str);
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.a, runnable);
        thread.setName(this.a.getName() + ":" + thread.getId());
        thread.setPriority(this.b);
        return thread;
    }
}
