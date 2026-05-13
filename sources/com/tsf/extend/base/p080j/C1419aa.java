package com.tsf.extend.base.p080j;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* renamed from: com.tsf.extend.base.j.aa */
/* loaded from: classes.dex */
public class C1419aa {

    /* renamed from: a */
    static final /* synthetic */ boolean f4401a;

    /* renamed from: b */
    private static final Object f4402b;

    /* renamed from: c */
    private static boolean f4403c;

    /* renamed from: d */
    private static Handler f4404d;

    static {
        f4401a = !C1419aa.class.desiredAssertionStatus();
        f4402b = new Object();
        f4403c = false;
        f4404d = null;
    }

    /* renamed from: b */
    private static Handler m8703b() {
        Handler handler;
        synchronized (f4402b) {
            if (f4404d == null) {
                if (f4403c) {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
                f4404d = new Handler(Looper.getMainLooper());
            }
            handler = f4404d;
        }
        return handler;
    }

    /* renamed from: a */
    public static <T> T m8705a(Callable<T> callable) {
        try {
            return (T) m8702b(callable);
        } catch (ExecutionException e) {
            throw new RuntimeException("Error occured waiting for callable", e);
        }
    }

    /* renamed from: b */
    public static <T> T m8702b(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        m8704a(futureTask);
        try {
            return (T) futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted waiting for callable", e);
        }
    }

    /* renamed from: a */
    public static <T> FutureTask<T> m8704a(FutureTask<T> futureTask) {
        if (m8708a()) {
            futureTask.run();
        } else {
            m8701b(futureTask);
        }
        return futureTask;
    }

    /* renamed from: a */
    public static void m8707a(Runnable runnable) {
        if (m8708a()) {
            runnable.run();
        } else {
            m8703b().post(runnable);
        }
    }

    /* renamed from: b */
    public static <T> FutureTask<T> m8701b(FutureTask<T> futureTask) {
        m8703b().post(futureTask);
        return futureTask;
    }

    /* renamed from: a */
    public static void m8706a(Runnable runnable, long j) {
        m8703b().postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static boolean m8708a() {
        return m8703b().getLooper() == Looper.myLooper();
    }
}
