package com.flurry.sdk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class eg {
    private static final String a = eg.class.getSimpleName();
    private final ds b = new ds();
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();
    private final ThreadPoolExecutor e;

    public eg(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        this.e = new ThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue) { // from class: com.flurry.sdk.eg.1
            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void beforeExecute(Thread thread, Runnable runnable) {
                super.beforeExecute(thread, runnable);
                final fg a2 = eg.this.a(runnable);
                if (a2 != null) {
                    new ff() { // from class: com.flurry.sdk.eg.1.1
                        @Override // com.flurry.sdk.ff
                        public void a() {
                            a2.j();
                        }
                    }.run();
                }
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                final fg a2 = eg.this.a(runnable);
                if (a2 != null) {
                    synchronized (eg.this.d) {
                        eg.this.d.remove(a2);
                    }
                    eg.this.b(a2);
                    new ff() { // from class: com.flurry.sdk.eg.1.2
                        @Override // com.flurry.sdk.ff
                        public void a() {
                            a2.k();
                        }
                    }.run();
                }
            }

            @Override // java.util.concurrent.AbstractExecutorService
            protected RunnableFuture newTaskFor(Callable callable) {
                throw new UnsupportedOperationException("Callable not supported");
            }

            @Override // java.util.concurrent.AbstractExecutorService
            protected RunnableFuture newTaskFor(Runnable runnable, Object obj) {
                ef efVar = new ef(runnable, obj);
                synchronized (eg.this.d) {
                    eg.this.d.put((fg) runnable, efVar);
                }
                return efVar;
            }
        };
        this.e.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy() { // from class: com.flurry.sdk.eg.2
            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                super.rejectedExecution(runnable, threadPoolExecutor);
                final fg a2 = eg.this.a(runnable);
                if (a2 != null) {
                    synchronized (eg.this.d) {
                        eg.this.d.remove(a2);
                    }
                    eg.this.b(a2);
                    new ff() { // from class: com.flurry.sdk.eg.2.1
                        @Override // com.flurry.sdk.ff
                        public void a() {
                            a2.l();
                        }
                    }.run();
                }
            }
        });
        this.e.setThreadFactory(new ez(str, 1));
    }

    public synchronized void a(Object obj, fg fgVar) {
        if (obj != null && fgVar != null) {
            b(obj, fgVar);
            this.e.submit(fgVar);
        }
    }

    public synchronized void a(Object obj) {
        if (obj != null) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.b.a(obj));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                a((fg) it.next());
            }
        }
    }

    public synchronized void a(final fg fgVar) {
        Future future;
        if (fgVar != null) {
            synchronized (this.d) {
                future = (Future) this.d.remove(fgVar);
            }
            b(fgVar);
            if (future != null) {
                future.cancel(true);
            }
            new ff() { // from class: com.flurry.sdk.eg.3
                @Override // com.flurry.sdk.ff
                public void a() {
                    fgVar.h();
                }
            }.run();
        }
    }

    public synchronized long b(Object obj) {
        return obj == null ? 0L : this.b.a(obj).size();
    }

    private synchronized void b(Object obj, fg fgVar) {
        this.b.a(obj, fgVar);
        this.c.put(fgVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(fg fgVar) {
        c(this.c.get(fgVar), fgVar);
    }

    private synchronized void c(Object obj, fg fgVar) {
        this.b.b(obj, fgVar);
        this.c.remove(fgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fg a(Runnable runnable) {
        if (runnable instanceof ef) {
            return (fg) ((ef) runnable).a();
        }
        if (runnable instanceof fg) {
            return (fg) runnable;
        }
        eo.a(6, a, "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }
}
