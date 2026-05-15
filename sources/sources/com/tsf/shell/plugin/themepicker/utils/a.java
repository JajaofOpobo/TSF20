package com.tsf.shell.plugin.themepicker.utils;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
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
public abstract class a<Params, Progress, Result> {
    public static final Executor c;
    public static final Executor d;
    private static final b f;
    private static volatile Executor g;
    private static final ThreadFactory a = new ThreadFactory() { // from class: com.tsf.shell.plugin.themepicker.utils.a.1
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> e = new LinkedBlockingQueue(10);
    public static final Executor b = new ThreadPoolExecutor(5, ItemInfo.APP_INTENT, 1, TimeUnit.SECONDS, e, a, new ThreadPoolExecutor.DiscardOldestPolicy());
    private volatile d j = d.PENDING;
    private final AtomicBoolean k = new AtomicBoolean();
    private final AtomicBoolean l = new AtomicBoolean();
    private final e<Params, Result> h = new e<Params, Result>() { // from class: com.tsf.shell.plugin.themepicker.utils.a.2
        @Override // java.util.concurrent.Callable
        public Result call() {
            a.this.l.set(true);
            Process.setThreadPriority(10);
            return (Result) a.this.d(a.this.a((Object[]) this.b));
        }
    };
    private final FutureTask<Result> i = new FutureTask<Result>(this.h) { // from class: com.tsf.shell.plugin.themepicker.utils.a.3
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

    public enum d {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result a(Params... paramsArr);

    static {
        c = h.c() ? new c() : Executors.newSingleThreadExecutor(a);
        d = Executors.newFixedThreadPool(2, a);
        f = new b();
        g = c;
    }

    @TargetApi(11)
    private static class c implements Executor {
        final ArrayDeque<Runnable> a;
        Runnable b;

        private c() {
            this.a = new ArrayDeque<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.utils.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        c.this.a();
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
                a.b.execute(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Result result) {
        if (!this.l.get()) {
            d(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result d(Result result) {
        f.obtainMessage(1, new C0157a(this, result)).sendToTarget();
        return result;
    }

    protected void a() {
    }

    protected void a(Result result) {
    }

    protected void b(Progress... progressArr) {
    }

    protected void b(Result result) {
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

    public final a<Params, Progress, Result> c(Params... paramsArr) {
        return a(g, paramsArr);
    }

    public final a<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.j != d.PENDING) {
            switch (this.j) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.j = d.RUNNING;
        a();
        this.h.b = paramsArr;
        executor.execute(this.i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Result result) {
        if (c()) {
            b(result);
        } else {
            a(result);
        }
        this.j = d.FINISHED;
    }

    private static class b extends Handler {
        private b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0157a c0157a = (C0157a) message.obj;
            switch (message.what) {
                case 1:
                    c0157a.a.e(c0157a.b[0]);
                    break;
                case 2:
                    c0157a.a.b((Object[]) c0157a.b);
                    break;
            }
        }
    }

    private static abstract class e<Params, Result> implements Callable<Result> {
        Params[] b;

        private e() {
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.plugin.themepicker.utils.a$a, reason: collision with other inner class name */
    private static class C0157a<Data> {
        final a a;
        final Data[] b;

        C0157a(a aVar, Data... dataArr) {
            this.a = aVar;
            this.b = dataArr;
        }
    }
}
