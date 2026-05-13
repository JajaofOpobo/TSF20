package com.flurry.sdk;

import java.lang.Thread;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: com.flurry.sdk.ec */
/* loaded from: classes.dex */
public final class C1230ec {

    /* renamed from: a */
    private static C1230ec f3956a;

    /* renamed from: c */
    private final Map<Thread.UncaughtExceptionHandler, Void> f3958c = new WeakHashMap();

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f3957b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: a */
    public static synchronized C1230ec m9304a() {
        C1230ec c1230ec;
        synchronized (C1230ec.class) {
            if (f3956a == null) {
                f3956a = new C1230ec();
            }
            c1230ec = f3956a;
        }
        return c1230ec;
    }

    /* renamed from: a */
    public void m9302a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (this.f3958c) {
            this.f3958c.put(uncaughtExceptionHandler, null);
        }
    }

    /* renamed from: b */
    private Set<Thread.UncaughtExceptionHandler> m9300b() {
        Set<Thread.UncaughtExceptionHandler> keySet;
        synchronized (this.f3958c) {
            keySet = this.f3958c.keySet();
        }
        return keySet;
    }

    private C1230ec() {
        Thread.setDefaultUncaughtExceptionHandler(new C1232a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9301a(Thread thread, Throwable th) {
        for (Thread.UncaughtExceptionHandler uncaughtExceptionHandler : m9300b()) {
            try {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m9298b(Thread thread, Throwable th) {
        if (this.f3957b != null) {
            this.f3957b.uncaughtException(thread, th);
        }
    }

    /* renamed from: com.flurry.sdk.ec$a */
    /* loaded from: classes.dex */
    final class C1232a implements Thread.UncaughtExceptionHandler {
        private C1232a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C1230ec.this.m9301a(thread, th);
            C1230ec.this.m9298b(thread, th);
        }
    }
}
