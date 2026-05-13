package com.flurry.sdk;

import com.flurry.sdk.AbstractC1279fg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.flurry.sdk.eg */
/* loaded from: classes.dex */
public class C1236eg<T extends AbstractC1279fg> {

    /* renamed from: a */
    private static final String f3964a = C1236eg.class.getSimpleName();

    /* renamed from: b */
    private final C1216ds<Object, T> f3965b = new C1216ds<>();

    /* renamed from: c */
    private final HashMap<T, Object> f3966c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<T, Future<?>> f3967d = new HashMap<>();

    /* renamed from: e */
    private final ThreadPoolExecutor f3968e;

    public C1236eg(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        this.f3968e = new ThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue) { // from class: com.flurry.sdk.eg.1
            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void beforeExecute(Thread thread, Runnable runnable) {
                super.beforeExecute(thread, runnable);
                final AbstractC1279fg m9286a = C1236eg.this.m9286a(runnable);
                if (m9286a != null) {
                    new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.eg.1.1
                        @Override // com.flurry.sdk.AbstractRunnableC1278ff
                        /* renamed from: a */
                        public void mo9140a() {
                            m9286a.m9136j();
                        }
                    }.run();
                }
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                final AbstractC1279fg m9286a = C1236eg.this.m9286a(runnable);
                if (m9286a != null) {
                    synchronized (C1236eg.this.f3967d) {
                        C1236eg.this.f3967d.remove(m9286a);
                    }
                    C1236eg.this.m9285b((C1236eg) m9286a);
                    new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.eg.1.2
                        @Override // com.flurry.sdk.AbstractRunnableC1278ff
                        /* renamed from: a */
                        public void mo9140a() {
                            m9286a.m9135k();
                        }
                    }.run();
                }
            }

            @Override // java.util.concurrent.AbstractExecutorService
            protected <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
                throw new UnsupportedOperationException("Callable not supported");
            }

            @Override // java.util.concurrent.AbstractExecutorService
            protected <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
                C1235ef c1235ef = new C1235ef(runnable, v);
                synchronized (C1236eg.this.f3967d) {
                    C1236eg.this.f3967d.put((AbstractC1279fg) runnable, c1235ef);
                }
                return c1235ef;
            }
        };
        this.f3968e.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy() { // from class: com.flurry.sdk.eg.2
            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                super.rejectedExecution(runnable, threadPoolExecutor);
                final AbstractC1279fg m9286a = C1236eg.this.m9286a(runnable);
                if (m9286a != null) {
                    synchronized (C1236eg.this.f3967d) {
                        C1236eg.this.f3967d.remove(m9286a);
                    }
                    C1236eg.this.m9285b((C1236eg) m9286a);
                    new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.eg.2.1
                        @Override // com.flurry.sdk.AbstractRunnableC1278ff
                        /* renamed from: a */
                        public void mo9140a() {
                            m9286a.m9134l();
                        }
                    }.run();
                }
            }
        });
        this.f3968e.setThreadFactory(new ThreadFactoryC1270ez(str, 1));
    }

    /* renamed from: a */
    public synchronized void m9287a(Object obj, T t) {
        if (obj != null && t != null) {
            m9283b(obj, t);
            this.f3968e.submit(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public synchronized void m9288a(Object obj) {
        if (obj != null) {
            HashSet<AbstractC1279fg> hashSet = new HashSet();
            hashSet.addAll(this.f3965b.m9370a((C1216ds<Object, T>) obj));
            for (AbstractC1279fg abstractC1279fg : hashSet) {
                m9289a((C1236eg<T>) abstractC1279fg);
            }
        }
    }

    /* renamed from: a */
    public synchronized void m9289a(final T t) {
        Future<?> remove;
        if (t != null) {
            synchronized (this.f3967d) {
                remove = this.f3967d.remove(t);
            }
            m9285b((C1236eg<T>) t);
            if (remove != null) {
                remove.cancel(true);
            }
            new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.eg.3
                @Override // com.flurry.sdk.AbstractRunnableC1278ff
                /* renamed from: a */
                public void mo9140a() {
                    t.mo9138h();
                }
            }.run();
        }
    }

    /* renamed from: b */
    public synchronized long m9284b(Object obj) {
        return obj == null ? 0L : this.f3965b.m9370a((C1216ds<Object, T>) obj).size();
    }

    /* renamed from: b */
    private synchronized void m9283b(Object obj, T t) {
        this.f3965b.m9369a((C1216ds<Object, T>) obj, t);
        this.f3966c.put(t, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m9285b(T t) {
        m9282c(this.f3966c.get(t), t);
    }

    /* renamed from: c */
    private synchronized void m9282c(Object obj, T t) {
        this.f3965b.m9365b(obj, t);
        this.f3966c.remove(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public T m9286a(Runnable runnable) {
        if (runnable instanceof C1235ef) {
            return (T) ((C1235ef) runnable).m9293a();
        }
        if (runnable instanceof AbstractC1279fg) {
            return (T) runnable;
        }
        C1258eo.m9234a(6, f3964a, "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }
}
