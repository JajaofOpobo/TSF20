package com.tsf.extend.base.actstru.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public class k {
    private static k a = new k();
    private BlockingQueue<j> b = new LinkedBlockingQueue(com.tsf.extend.base.actstru.model.a.e);
    private BlockingQueue<FutureTask<d>> c = new LinkedBlockingQueue();
    private b d = new b(this.b);
    private a e = new a(this.c);
    private ExecutorService f = Executors.newFixedThreadPool(com.tsf.extend.base.actstru.model.a.d);

    /* loaded from: classes.dex */
    class b extends c<j> {
        /* JADX WARN: Multi-variable type inference failed */
        public b(BlockingQueue<j> blockingQueue) {
            this.a = blockingQueue;
            this.b = Executors.newFixedThreadPool(com.tsf.extend.base.actstru.model.a.c);
            setName("TaskDispather");
        }

        @Override // com.tsf.extend.base.actstru.model.c, com.tsf.extend.base.actstru.model.g
        public d a(j jVar) {
            FutureTask<d> futureTask = new FutureTask<>(jVar);
            k.this.a(futureTask);
            k.this.f.submit(futureTask);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c<FutureTask<d>> {
        /* JADX WARN: Multi-variable type inference failed */
        public a(BlockingQueue<FutureTask<d>> blockingQueue) {
            this.a = blockingQueue;
            this.b = Executors.newFixedThreadPool(1);
            setName("PendingEventDispatcher");
        }

        @Override // com.tsf.extend.base.actstru.model.c, com.tsf.extend.base.actstru.model.g
        public d a(FutureTask<d> futureTask) {
            try {
                f.a().a(futureTask.get());
                return null;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            } catch (ExecutionException e2) {
                e2.printStackTrace();
                return null;
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
    }

    private k() {
        this.d.start();
        this.e.start();
    }

    public static k a() {
        return a;
    }

    public void a(FutureTask<d> futureTask) {
        this.e.b(futureTask);
    }
}
