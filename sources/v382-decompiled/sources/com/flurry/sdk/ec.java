package com.flurry.sdk;

import java.lang.Thread;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ec {
    private static ec a;
    private final Map c = new WeakHashMap();
    private final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();

    public static synchronized ec a() {
        ec ecVar;
        synchronized (ec.class) {
            if (a == null) {
                a = new ec();
            }
            ecVar = a;
        }
        return ecVar;
    }

    public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (this.c) {
            this.c.put(uncaughtExceptionHandler, null);
        }
    }

    private Set b() {
        Set keySet;
        synchronized (this.c) {
            keySet = this.c.keySet();
        }
        return keySet;
    }

    private ec() {
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Thread thread, Throwable th) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            try {
                ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Thread thread, Throwable th) {
        if (this.b != null) {
            this.b.uncaughtException(thread, th);
        }
    }

    final class a implements Thread.UncaughtExceptionHandler {
        private a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            ec.this.a(thread, th);
            ec.this.b(thread, th);
        }
    }
}
