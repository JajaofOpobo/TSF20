package com.tsf.shell.p096f.p153i.p161c.p162a;

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
/* renamed from: com.tsf.shell.f.i.c.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC3275c<Params, Result> {

    /* renamed from: b */
    public static final Executor f10807b;

    /* renamed from: j */
    private static volatile Executor f10810j;

    /* renamed from: e */
    private volatile EnumC3283b f10811e = EnumC3283b.PENDING;

    /* renamed from: f */
    private final AtomicBoolean f10812f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f10813g = new AtomicBoolean();

    /* renamed from: h */
    private final AbstractCallableC3284c<Params, Result> f10814h = new AbstractCallableC3284c<Params, Result>() { // from class: com.tsf.shell.f.i.c.a.c.2
        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC3275c.this.f10813g.set(true);
            Process.setThreadPriority(10);
            return (Result) AbstractC3275c.this.m2933d(AbstractC3275c.this.mo2846a((Object[]) this.f10830b));
        }
    };

    /* renamed from: i */
    private final FutureTask<Result> f10815i = new FutureTask<Result>(this.f10814h) { // from class: com.tsf.shell.f.i.c.a.c.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC3275c.this.m2935c(get());
            } catch (InterruptedException e) {
                C3296e.m2908a(e.getMessage());
            } catch (CancellationException e2) {
                AbstractC3275c.this.m2935c(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            }
        }
    };

    /* renamed from: c */
    private static final BlockingQueue<Runnable> f10808c = new LinkedBlockingQueue(10);

    /* renamed from: d */
    private static final ThreadFactory f10809d = new ThreadFactory() { // from class: com.tsf.shell.f.i.c.a.c.1

        /* renamed from: a */
        private final AtomicInteger f10816a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f10816a.getAndIncrement());
        }
    };

    /* renamed from: a */
    public static final Executor f10806a = new ThreadPoolExecutor(5, ItemInfo.APP_INTENT, 1, TimeUnit.SECONDS, f10808c, f10809d, new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: com.tsf.shell.f.i.c.a.c$b */
    /* loaded from: classes.dex */
    public enum EnumC3283b {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: a */
    protected abstract Result mo2846a(Params... paramsArr);

    static {
        f10807b = m2944a() ? new ExecutorC3281a() : Executors.newSingleThreadExecutor(f10809d);
        f10810j = f10807b;
    }

    /* renamed from: a */
    public static boolean m2944a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    @TargetApi(11)
    /* renamed from: com.tsf.shell.f.i.c.a.c$a */
    /* loaded from: classes.dex */
    private static class ExecutorC3281a implements Executor {

        /* renamed from: a */
        final ArrayDeque<Runnable> f10822a;

        /* renamed from: b */
        Runnable f10823b;

        private ExecutorC3281a() {
            this.f10822a = new ArrayDeque<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f10822a.offer(new Runnable() { // from class: com.tsf.shell.f.i.c.a.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        ExecutorC3281a.this.m2932a();
                    }
                }
            });
            if (this.f10823b == null) {
                m2932a();
            }
        }

        /* renamed from: a */
        protected synchronized void m2932a() {
            Runnable poll = this.f10822a.poll();
            this.f10823b = poll;
            if (poll != null) {
                AbstractC3275c.f10806a.execute(this.f10823b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m2935c(Result result) {
        if (!this.f10813g.get()) {
            m2933d(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public Result m2933d(final Result result) {
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.f.i.c.a.c.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC3275c.this.m2934d()) {
                    AbstractC3275c.this.mo2843b((AbstractC3275c) result);
                } else {
                    AbstractC3275c.this.mo2847a((AbstractC3275c) result);
                }
                AbstractC3275c.this.f10811e = EnumC3283b.FINISHED;
            }
        });
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.i.c.a.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractCallableC3284c<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f10830b;

        private AbstractCallableC3284c() {
        }
    }

    /* renamed from: b */
    protected void m2939b() {
    }

    /* renamed from: a */
    protected void mo2847a(Result result) {
    }

    /* renamed from: b */
    protected void mo2843b(Result result) {
        m2936c();
    }

    /* renamed from: c */
    protected void m2936c() {
    }

    /* renamed from: d */
    public final boolean m2934d() {
        return this.f10812f.get();
    }

    /* renamed from: b */
    public final AbstractC3275c<Params, Result> m2937b(Params... paramsArr) {
        return m2940a(f10810j, paramsArr);
    }

    /* renamed from: a */
    public final AbstractC3275c<Params, Result> m2940a(Executor executor, Params... paramsArr) {
        if (this.f10811e != EnumC3283b.PENDING) {
            switch (this.f10811e) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f10811e = EnumC3283b.RUNNING;
        m2939b();
        this.f10814h.f10830b = paramsArr;
        executor.execute(this.f10815i);
        return this;
    }
}
