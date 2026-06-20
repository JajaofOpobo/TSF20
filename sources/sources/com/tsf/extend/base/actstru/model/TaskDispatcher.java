package com.tsf.extend.base.actstru.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TaskDispatcher {
    private static TaskDispatcher a = new TaskDispatcher();
    private BlockingQueue<Task> b = new LinkedBlockingQueue(com.tsf.extend.base.actstru.model.a.e);
    private BlockingQueue<FutureTask<EventData>> c = new LinkedBlockingQueue();
    private b d = new b(this.b);
    private A e = new A(this.c);
    private ExecutorService f = Executors.newFixedThreadPool(com.tsf.extend.base.actstru.model.a.d);

    class b extends BaseDispatcher<Task> {
        /* JADX WARN: Multi-variable type inference failed */
        public b(BlockingQueue<Task> blockingQueue) {
            this.a = blockingQueue;
            this.b = Executors.newFixedThreadPool(com.tsf.extend.base.actstru.model.a.c);
            setName("TaskDispather");
        }

        @Override // com.tsf.extend.base.actstru.model.BaseDispatcher, com.tsf.extend.base.actstru.model.TaskHandler
        public EventData a(Task jVar) {
            FutureTask<EventData> futureTask = new FutureTask<>(jVar);
            TaskDispatcher.this.a(futureTask);
            TaskDispatcher.this.f.submit(futureTask);
            return null;
        }
    }

    class A extends BaseDispatcher<FutureTask<EventData>> {
        /* JADX WARN: Multi-variable type inference failed */
        public A(BlockingQueue<FutureTask<EventData>> blockingQueue) {
            this.a = blockingQueue;
            this.b = Executors.newFixedThreadPool(1);
            setName("PendingEventDispatcher");
        }

        @Override // com.tsf.extend.base.actstru.model.BaseDispatcher, com.tsf.extend.base.actstru.model.TaskHandler
        public EventData a(FutureTask<EventData> futureTask) {
            try {
                EventDispatcher.a().a(futureTask.get());
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

    private TaskDispatcher() {
        this.d.start();
        this.e.start();
    }

    public static TaskDispatcher a() {
        return a;
    }

    public void a(FutureTask<EventData> futureTask) {
        this.e.b(futureTask);
    }
}
