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
/* renamed from: com.tsf.shell.plugin.themepicker.utils.a */
/* loaded from: classes.dex */
public abstract class AbstractC3929a<Params, Progress, Result> {

    /* renamed from: c */
    public static final Executor f12874c;

    /* renamed from: d */
    public static final Executor f12875d;

    /* renamed from: f */
    private static final HandlerC3935b f12877f;

    /* renamed from: g */
    private static volatile Executor f12878g;

    /* renamed from: a */
    private static final ThreadFactory f12872a = new ThreadFactory() { // from class: com.tsf.shell.plugin.themepicker.utils.a.1

        /* renamed from: a */
        private final AtomicInteger f12884a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f12884a.getAndIncrement());
        }
    };

    /* renamed from: e */
    private static final BlockingQueue<Runnable> f12876e = new LinkedBlockingQueue(10);

    /* renamed from: b */
    public static final Executor f12873b = new ThreadPoolExecutor(5, ItemInfo.APP_INTENT, 1, TimeUnit.SECONDS, f12876e, f12872a, new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: j */
    private volatile EnumC3938d f12881j = EnumC3938d.PENDING;

    /* renamed from: k */
    private final AtomicBoolean f12882k = new AtomicBoolean();

    /* renamed from: l */
    private final AtomicBoolean f12883l = new AtomicBoolean();

    /* renamed from: h */
    private final AbstractCallableC3939e<Params, Result> f12879h = new AbstractCallableC3939e<Params, Result>() { // from class: com.tsf.shell.plugin.themepicker.utils.a.2
        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC3929a.this.f12883l.set(true);
            Process.setThreadPriority(10);
            return (Result) AbstractC3929a.this.m1140d(AbstractC3929a.this.mo1015a((Object[]) this.f12898b));
        }
    };

    /* renamed from: i */
    private final FutureTask<Result> f12880i = new FutureTask<Result>(this.f12879h) { // from class: com.tsf.shell.plugin.themepicker.utils.a.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC3929a.this.m1142c((AbstractC3929a) get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException e2) {
                AbstractC3929a.this.m1142c((AbstractC3929a) null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            }
        }
    };

    /* renamed from: com.tsf.shell.plugin.themepicker.utils.a$d */
    /* loaded from: classes.dex */
    public enum EnumC3938d {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: a */
    protected abstract Result mo1015a(Params... paramsArr);

    static {
        f12874c = C3957h.m1007c() ? new ExecutorC3936c() : Executors.newSingleThreadExecutor(f12872a);
        f12875d = Executors.newFixedThreadPool(2, f12872a);
        f12877f = new HandlerC3935b();
        f12878g = f12874c;
    }

    @TargetApi(11)
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.a$c */
    /* loaded from: classes.dex */
    private static class ExecutorC3936c implements Executor {

        /* renamed from: a */
        final ArrayDeque<Runnable> f12890a;

        /* renamed from: b */
        Runnable f12891b;

        private ExecutorC3936c() {
            this.f12890a = new ArrayDeque<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f12890a.offer(new Runnable() { // from class: com.tsf.shell.plugin.themepicker.utils.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        ExecutorC3936c.this.m1138a();
                    }
                }
            });
            if (this.f12891b == null) {
                m1138a();
            }
        }

        /* renamed from: a */
        protected synchronized void m1138a() {
            Runnable poll = this.f12890a.poll();
            this.f12891b = poll;
            if (poll != null) {
                AbstractC3929a.f12873b.execute(this.f12891b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m1142c(Result result) {
        if (!this.f12883l.get()) {
            m1140d(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public Result m1140d(Result result) {
        f12877f.obtainMessage(1, new C3934a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: a */
    protected void m1152a() {
    }

    /* renamed from: a */
    protected void mo1020a(Result result) {
    }

    /* renamed from: b */
    protected void m1145b(Progress... progressArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1017b(Result result) {
        m1147b();
    }

    /* renamed from: b */
    protected void m1147b() {
    }

    /* renamed from: c */
    public final boolean m1144c() {
        return this.f12882k.get();
    }

    /* renamed from: a */
    public final boolean m1148a(boolean z) {
        this.f12882k.set(true);
        return this.f12880i.cancel(z);
    }

    /* renamed from: c */
    public final AbstractC3929a<Params, Progress, Result> m1141c(Params... paramsArr) {
        return m1149a(f12878g, paramsArr);
    }

    /* renamed from: a */
    public final AbstractC3929a<Params, Progress, Result> m1149a(Executor executor, Params... paramsArr) {
        if (this.f12881j != EnumC3938d.PENDING) {
            switch (this.f12881j) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f12881j = EnumC3938d.RUNNING;
        m1152a();
        this.f12879h.f12898b = paramsArr;
        executor.execute(this.f12880i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m1139e(Result result) {
        if (m1144c()) {
            mo1017b((AbstractC3929a<Params, Progress, Result>) result);
        } else {
            mo1020a((AbstractC3929a<Params, Progress, Result>) result);
        }
        this.f12881j = EnumC3938d.FINISHED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.a$b */
    /* loaded from: classes.dex */
    public static class HandlerC3935b extends Handler {
        private HandlerC3935b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C3934a c3934a = (C3934a) message.obj;
            switch (message.what) {
                case 1:
                    c3934a.f12888a.m1139e(c3934a.f12889b[0]);
                    return;
                case 2:
                    c3934a.f12888a.m1145b((Object[]) c3934a.f12889b);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.a$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractCallableC3939e<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f12898b;

        private AbstractCallableC3939e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.a$a */
    /* loaded from: classes.dex */
    public static class C3934a<Data> {

        /* renamed from: a */
        final AbstractC3929a f12888a;

        /* renamed from: b */
        final Data[] f12889b;

        C3934a(AbstractC3929a abstractC3929a, Data... dataArr) {
            this.f12888a = abstractC3929a;
            this.f12889b = dataArr;
        }
    }
}
