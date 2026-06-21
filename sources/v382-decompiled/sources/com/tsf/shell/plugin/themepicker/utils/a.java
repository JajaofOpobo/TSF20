package com.tsf.shell.plugin.themepicker.utils;

import android.os.Process;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
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
public abstract class a {
    public static final Executor c;
    public static final Executor d;
    private static final c f;
    private static volatile Executor g;
    private static /* synthetic */ int[] m;
    private static final ThreadFactory a = new ThreadFactory() { // from class: com.tsf.shell.plugin.themepicker.utils.a.1
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
        }
    };
    private static final BlockingQueue e = new LinkedBlockingQueue(10);
    public static final Executor b = new ThreadPoolExecutor(5, ItemInfo.APP_INTENT, 1, TimeUnit.SECONDS, e, a, new ThreadPoolExecutor.DiscardOldestPolicy());
    private volatile e j = e.PENDING;
    private final AtomicBoolean k = new AtomicBoolean();
    private final AtomicBoolean l = new AtomicBoolean();
    private final f h = new f() { // from class: com.tsf.shell.plugin.themepicker.utils.a.2
        @Override // java.util.concurrent.Callable
        public Object call() {
            a.this.l.set(true);
            Process.setThreadPriority(10);
            return a.this.d(a.this.a(this.b));
        }
    };
    private final FutureTask i = new FutureTask(this.h) { // from class: com.tsf.shell.plugin.themepicker.utils.a.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                a.this.c(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException e3) {
                a.this.c((Object) null);
            } catch (ExecutionException e4) {
                throw new RuntimeException("An error occured while executing doInBackground()", e4.getCause());
            }
        }
    };

    protected abstract Object a(Object... objArr);

    static /* synthetic */ int[] d() {
        int[] iArr = m;
        if (iArr == null) {
            iArr = new int[e.valuesCustom().length];
            try {
                iArr[e.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[e.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[e.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            m = iArr;
        }
        return iArr;
    }

    static {
        c cVar = null;
        c = v.c() ? new d(null) : Executors.newSingleThreadExecutor(a);
        d = Executors.newFixedThreadPool(2, a);
        f = new c(cVar);
        g = c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        if (!this.l.get()) {
            d(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(Object obj) {
        f.obtainMessage(1, new b(this, obj)).sendToTarget();
        return obj;
    }

    protected void a() {
    }

    protected void a(Object obj) {
    }

    protected void b(Object... objArr) {
    }

    protected void b(Object obj) {
        b();
    }

    protected void b() {
    }

    public final boolean c() {
        return this.k.get();
    }

    public final boolean a(boolean z) {
        this.k.set(true);
        return this.i.cancel(z);
    }

    public final a c(Object... objArr) {
        return a(g, objArr);
    }

    public final a a(Executor executor, Object... objArr) {
        if (this.j != e.PENDING) {
            switch (d()[this.j.ordinal()]) {
                case 2:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case 3:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.j = e.RUNNING;
        a();
        this.h.b = objArr;
        executor.execute(this.i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        if (c()) {
            b(obj);
        } else {
            a(obj);
        }
        this.j = e.FINISHED;
    }
}
