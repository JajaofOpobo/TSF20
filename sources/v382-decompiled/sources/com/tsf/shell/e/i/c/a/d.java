package com.tsf.shell.e.i.c.a;

import android.os.Build;
import android.os.Process;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.message.VMessageManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class d {
    public static final Executor b;
    private static volatile Executor j;
    private static /* synthetic */ int[] k;
    private volatile f e = f.PENDING;
    private final AtomicBoolean f = new AtomicBoolean();
    private final AtomicBoolean g = new AtomicBoolean();
    private final g h = new g() { // from class: com.tsf.shell.e.i.c.a.d.2
        @Override // java.util.concurrent.Callable
        public Object call() {
            d.this.g.set(true);
            Process.setThreadPriority(10);
            return d.this.d(d.this.a(this.b));
        }
    };
    private final FutureTask i = new FutureTask(this.h) { // from class: com.tsf.shell.e.i.c.a.d.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.c(get());
            } catch (InterruptedException e) {
                j.a(e.getMessage());
            } catch (CancellationException e2) {
                d.this.c(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            }
        }
    };
    private static final BlockingQueue c = new LinkedBlockingQueue(10);
    private static final ThreadFactory d = new ThreadFactory() { // from class: com.tsf.shell.e.i.c.a.d.1
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
        }
    };
    public static final Executor a = new ThreadPoolExecutor(5, ItemInfo.APP_INTENT, 1, TimeUnit.SECONDS, c, d, new ThreadPoolExecutor.DiscardOldestPolicy());

    protected abstract Object a(Object... objArr);

    static /* synthetic */ int[] e() {
        int[] iArr = k;
        if (iArr == null) {
            iArr = new int[f.valuesCustom().length];
            try {
                iArr[f.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[f.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[f.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            k = iArr;
        }
        return iArr;
    }

    static {
        b = a() ? new e(null) : Executors.newSingleThreadExecutor(d);
        j = b;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        if (!this.g.get()) {
            d(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(final Object obj) {
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.e.i.c.a.d.4
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.d()) {
                    d.this.b(obj);
                } else {
                    d.this.a(obj);
                }
                d.this.e = f.FINISHED;
            }
        });
        return obj;
    }

    protected void b() {
    }

    protected void a(Object obj) {
    }

    protected void b(Object obj) {
        c();
    }

    protected void c() {
    }

    public final boolean d() {
        return this.f.get();
    }

    public final d b(Object... objArr) {
        return a(j, objArr);
    }

    public final d a(Executor executor, Object... objArr) {
        if (this.e != f.PENDING) {
            switch (e()[this.e.ordinal()]) {
                case 2:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case 3:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.e = f.RUNNING;
        b();
        this.h.b = objArr;
        executor.execute(this.i);
        return this;
    }
}
