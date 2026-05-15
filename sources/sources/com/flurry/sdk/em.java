package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class em extends eg<en> {
    private static em a = null;

    public static synchronized em a() {
        if (a == null) {
            a = new em();
        }
        return a;
    }

    protected em() {
        super(em.class.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new ee()));
    }
}
