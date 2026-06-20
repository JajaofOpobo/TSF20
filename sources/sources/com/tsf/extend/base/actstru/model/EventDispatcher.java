package com.tsf.extend.base.actstru.model;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EventDispatcher {
    private static EventDispatcher a = new EventDispatcher();
    private BlockingQueue<EventData> b = new LinkedBlockingQueue();
    private A c = new A(this.b);
    private ConcurrentHashMap<String, EventChannel> d = new ConcurrentHashMap<>();

    protected class A extends BaseDispatcher<EventData> {
        /* JADX WARN: Multi-variable type inference failed */
        public A(BlockingQueue<EventData> blockingQueue) {
            this.a = blockingQueue;
            this.b = Executors.newFixedThreadPool(com.tsf.extend.base.actstru.model.a.b);
            setName("EventDispather");
        }

        @Override // com.tsf.extend.base.actstru.model.BaseDispatcher, com.tsf.extend.base.actstru.model.TaskHandler
        public EventData a(EventData dVar) {
            if (dVar != null) {
                EventTarget iVarB = dVar.b();
                if (iVarB.a()) {
                    f.this.b(dVar);
                } else {
                    Iterator<String> it = iVarB.b().iterator();
                    while (it.hasNext()) {
                        EventChannel hVarB = f.this.b(it.next());
                        if (hVarB != null) {
                            hVarB.a(dVar);
                        }
                    }
                }
            }
            return null;
        }
    }

    private f() {
        a("lg://default");
        this.c.start();
    }

    public static EventDispatcher a() {
        return a;
    }

    public void a(EventData dVar) {
        if (dVar != null) {
            this.b.add(dVar);
        }
    }

    public void a(String str, EventHandler eVar) {
        a(str);
        this.d.get(str).a(eVar);
    }

    public void b(String str, EventHandler eVar) {
        EventChannel hVarB = b(str);
        if (hVarB != null) {
            hVarB.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EventChannel b(String str) {
        return this.d.get(str);
    }

    public void a(String str) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, new EventChannel(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventData dVar) {
        Iterator<Map.Entry<String, EventChannel>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a(dVar);
        }
    }
}
