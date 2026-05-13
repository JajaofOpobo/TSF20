package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/* renamed from: com.flurry.sdk.ef */
/* loaded from: classes.dex */
public class C1235ef<V> extends FutureTask<V> {

    /* renamed from: a */
    private final WeakReference<Callable<V>> f3962a;

    /* renamed from: b */
    private final WeakReference<Runnable> f3963b;

    public C1235ef(Runnable runnable, V v) {
        super(runnable, v);
        this.f3962a = null;
        this.f3963b = new WeakReference<>(runnable);
    }

    /* renamed from: a */
    public Runnable m9293a() {
        return this.f3963b.get();
    }
}
