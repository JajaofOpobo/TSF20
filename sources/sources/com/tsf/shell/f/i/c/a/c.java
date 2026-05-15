package com.tsf.shell.f.i.c.a;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Process;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.message.VMessageManager;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class c<Params, Result> {
    public static final Executor b;
    private static volatile Executor j;
    private volatile b e = b.PENDING;
    private final AtomicBoolean f = new AtomicBoolean();
    private final AtomicBoolean g = new AtomicBoolean();
    private final AbstractCallableC0118c<Params, Result> h = new AbstractCallableC0118c<Params, Result>() { // from class: com.tsf.shell.f.i.c.a.c.2
        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.g.set(true);
            Process.setThreadPriority(10);
            return (Result) c.this.d(c.this.a((Object[]) this.b));
        }
    };
    private final FutureTask<Result> i = new FutureTask<Result>(this.h) { // from class: com.tsf.shell.f.i.c.a.c.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.c(get());
            } catch (InterruptedException e) {
                e.a(e.getMessage());
            } catch (CancellationException e2) {
                c.this.c(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            }
        }
    };
    private static final BlockingQueue<Runnable> c = new LinkedBlockingQueue(10);
    private static final ThreadFactory d = new ThreadFactory() { // from class: com.tsf.shell.f.i.c.a.c.1
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
        }
    };
    public static final Executor a = new ThreadPoolExecutor(5, ItemInfo.APP_INTENT, 1, TimeUnit.SECONDS, c, d, new ThreadPoolExecutor.DiscardOldestPolicy());

    public enum b {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result a(Params... paramsArr);

    static {
        b = a() ? new a() : Executors.newSingleThreadExecutor(d);
        j = b;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    @TargetApi(11)
    private static class a implements Executor {
        final ArrayDeque<Runnable> a;
        Runnable b;

        private a() {
            this.a = new ArrayDeque<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() { // from class: com.tsf.shell.f.i.c.a.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }

        protected synchronized void a() {
            Runnable runnablePoll = this.a.poll();
            this.b = runnablePoll;
            if (runnablePoll != null) {
                c.a.execute(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Result result) {
        if (!this.g.get()) {
            d(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result d(final Result result) {
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.f.i.c.a.c.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.d()) {
                    c.this.b(result);
                } else {
                    c.this.a(result);
                }
                c.this.e = b.FINISHED;
            }
        });
        return result;
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.i.c.a.c$c, reason: collision with other inner class name */
    private static abstract class AbstractCallableC0118c<Params, Result> implements Callable<Result> {
        Params[] b;

        private AbstractCallableC0118c() {
        }
    }

    protected void b() {
    }

    protected void a(Result result) {
    }

    protected void b(Result result) {
        c();
    }

    protected void c() {
    }

    public final boolean d() {
        return this.f.get();
    }

    public final c<Params, Result> b(Params... paramsArr) {
        return a(j, paramsArr);
    }

    public final c<Params, Result> a(Executor executor, Params... paramsArr) {
        if (this.e != b.PENDING) {
            switch (this.e) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.e = b.RUNNING;
        b();
        this.h.b = paramsArr;
        executor.execute(this.i);
        return this;
    }
}
