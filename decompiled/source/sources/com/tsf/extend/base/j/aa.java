package com.tsf.extend.base.j;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public class aa {
    static final /* synthetic */ boolean a;
    private static final Object b;
    private static boolean c;
    private static Handler d;

    static {
        a = !aa.class.desiredAssertionStatus();
        b = new Object();
        c = false;
        d = null;
    }

    private static Handler b() {
        Handler handler;
        synchronized (b) {
            if (d == null) {
                if (c) {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
                d = new Handler(Looper.getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public static <T> T a(Callable<T> callable) {
        try {
            return (T) b(callable);
        } catch (ExecutionException e) {
            throw new RuntimeException("Error occured waiting for callable", e);
        }
    }

    public static <T> T b(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        a(futureTask);
        try {
            return (T) futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted waiting for callable", e);
        }
    }

    public static <T> FutureTask<T> a(FutureTask<T> futureTask) {
        if (a()) {
            futureTask.run();
        } else {
            b(futureTask);
        }
        return futureTask;
    }

    public static void a(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            b().post(runnable);
        }
    }

    public static <T> FutureTask<T> b(FutureTask<T> futureTask) {
        b().post(futureTask);
        return futureTask;
    }

    public static void a(Runnable runnable, long j) {
        b().postDelayed(runnable, j);
    }

    public static boolean a() {
        return b().getLooper() == Looper.myLooper();
    }
}
