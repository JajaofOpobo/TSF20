package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class em extends eg<en> {
    private static em a = null;

    public static synchronized em a() {
        em emVar;
        synchronized (em.class) {
            if (a == null) {
                a = new em();
            }
            emVar = a;
        }
        return emVar;
    }

    protected em() {
        super(em.class.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new ee()));
    }
}
