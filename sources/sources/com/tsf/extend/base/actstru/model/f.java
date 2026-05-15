package com.tsf.extend.base.actstru.model;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f {
    private static f a = new f();
    private BlockingQueue<d> b = new LinkedBlockingQueue();
    private a c = new a(this.b);
    private ConcurrentHashMap<String, h> d = new ConcurrentHashMap<>();

    protected class a extends c<d> {
        /* JADX WARN: Multi-variable type inference failed */
        public a(BlockingQueue<d> blockingQueue) {
            this.a = blockingQueue;
            this.b = Executors.newFixedThreadPool(com.tsf.extend.base.actstru.model.a.b);
            setName("EventDispather");
        }

        @Override // com.tsf.extend.base.actstru.model.c, com.tsf.extend.base.actstru.model.g
        public d a(d dVar) {
            if (dVar != null) {
                i iVarB = dVar.b();
                if (iVarB.a()) {
                    f.this.b(dVar);
                } else {
                    Iterator<String> it = iVarB.b().iterator();
                    while (it.hasNext()) {
                        h hVarB = f.this.b(it.next());
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

    public static f a() {
        return a;
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.b.add(dVar);
        }
    }

    public void a(String str, e eVar) {
        a(str);
        this.d.get(str).a(eVar);
    }

    public void b(String str, e eVar) {
        h hVarB = b(str);
        if (hVarB != null) {
            hVarB.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h b(String str) {
        return this.d.get(str);
    }

    public void a(String str) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, new h(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar) {
        Iterator<Map.Entry<String, h>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a(dVar);
        }
    }
}
