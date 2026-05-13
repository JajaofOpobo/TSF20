package com.tsf.extend.base.actstru.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.tsf.extend.base.actstru.model.k */
/* loaded from: classes.dex */
public class C1363k {

    /* renamed from: a */
    private static C1363k f4284a = new C1363k();

    /* renamed from: b */
    private BlockingQueue<CallableC1362j> f4285b = new LinkedBlockingQueue(C1345a.f4240e);

    /* renamed from: c */
    private BlockingQueue<FutureTask<C1355d>> f4286c = new LinkedBlockingQueue();

    /* renamed from: d */
    private C1365b f4287d = new C1365b(this.f4285b);

    /* renamed from: e */
    private C1364a f4288e = new C1364a(this.f4286c);

    /* renamed from: f */
    private ExecutorService f4289f = Executors.newFixedThreadPool(C1345a.f4239d);

    /* renamed from: com.tsf.extend.base.actstru.model.k$b */
    /* loaded from: classes.dex */
    class C1365b extends AbstractC1354c<CallableC1362j> {
        /* JADX WARN: Multi-variable type inference failed */
        public C1365b(BlockingQueue<CallableC1362j> blockingQueue) {
            this.f4263a = blockingQueue;
            this.f4264b = Executors.newFixedThreadPool(C1345a.f4238c);
            setName("TaskDispather");
        }

        @Override // com.tsf.extend.base.actstru.model.AbstractC1354c, com.tsf.extend.base.actstru.model.InterfaceC1359g
        /* renamed from: a */
        public C1355d mo8881a(CallableC1362j callableC1362j) {
            FutureTask<C1355d> futureTask = new FutureTask<>(callableC1362j);
            C1363k.this.m8884a(futureTask);
            C1363k.this.f4289f.submit(futureTask);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.actstru.model.k$a */
    /* loaded from: classes.dex */
    public class C1364a extends AbstractC1354c<FutureTask<C1355d>> {
        /* JADX WARN: Multi-variable type inference failed */
        public C1364a(BlockingQueue<FutureTask<C1355d>> blockingQueue) {
            this.f4263a = blockingQueue;
            this.f4264b = Executors.newFixedThreadPool(1);
            setName("PendingEventDispatcher");
        }

        @Override // com.tsf.extend.base.actstru.model.AbstractC1354c, com.tsf.extend.base.actstru.model.InterfaceC1359g
        /* renamed from: a */
        public C1355d mo8881a(FutureTask<C1355d> futureTask) {
            try {
                C1357f.m8907a().m8906a(futureTask.get());
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

    private C1363k() {
        this.f4287d.start();
        this.f4288e.start();
    }

    /* renamed from: a */
    public static C1363k m8886a() {
        return f4284a;
    }

    /* renamed from: a */
    public void m8884a(FutureTask<C1355d> futureTask) {
        this.f4288e.m8915b(futureTask);
    }
}
