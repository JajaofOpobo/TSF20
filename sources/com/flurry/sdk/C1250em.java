package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: com.flurry.sdk.em */
/* loaded from: classes.dex */
public final class C1250em extends C1236eg<C1251en> {

    /* renamed from: a */
    private static C1250em f3988a = null;

    /* renamed from: a */
    public static synchronized C1250em m9265a() {
        C1250em c1250em;
        synchronized (C1250em.class) {
            if (f3988a == null) {
                f3988a = new C1250em();
            }
            c1250em = f3988a;
        }
        return c1250em;
    }

    protected C1250em() {
        super(C1250em.class.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C1234ee()));
    }
}
