package com.tsf.extend.base.actstru.model;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.tsf.extend.base.actstru.model.f */
/* loaded from: classes.dex */
public class C1357f {

    /* renamed from: a */
    private static C1357f f4269a = new C1357f();

    /* renamed from: b */
    private BlockingQueue<C1355d> f4270b = new LinkedBlockingQueue();

    /* renamed from: c */
    private C1358a f4271c = new C1358a(this.f4270b);

    /* renamed from: d */
    private ConcurrentHashMap<String, C1360h> f4272d = new ConcurrentHashMap<>();

    /* renamed from: com.tsf.extend.base.actstru.model.f$a */
    /* loaded from: classes.dex */
    protected class C1358a extends AbstractC1354c<C1355d> {
        /* JADX WARN: Multi-variable type inference failed */
        public C1358a(BlockingQueue<C1355d> blockingQueue) {
            this.f4263a = blockingQueue;
            this.f4264b = Executors.newFixedThreadPool(C1345a.f4237b);
            setName("EventDispather");
        }

        @Override // com.tsf.extend.base.actstru.model.AbstractC1354c, com.tsf.extend.base.actstru.model.InterfaceC1359g
        /* renamed from: a */
        public C1355d mo8881a(C1355d c1355d) {
            if (c1355d != null) {
                C1361i m8910b = c1355d.m8910b();
                if (m8910b.m8893a()) {
                    C1357f.this.m8901b(c1355d);
                } else {
                    Iterator<String> it = m8910b.m8892b().iterator();
                    while (it.hasNext()) {
                        C1360h m8900b = C1357f.this.m8900b(it.next());
                        if (m8900b != null) {
                            m8900b.m8896a(c1355d);
                        }
                    }
                }
            }
            return null;
        }
    }

    private C1357f() {
        m8903a("lg://default");
        this.f4271c.start();
    }

    /* renamed from: a */
    public static C1357f m8907a() {
        return f4269a;
    }

    /* renamed from: a */
    public void m8906a(C1355d c1355d) {
        if (c1355d != null) {
            this.f4270b.add(c1355d);
        }
    }

    /* renamed from: a */
    public void m8902a(String str, InterfaceC1356e interfaceC1356e) {
        m8903a(str);
        this.f4272d.get(str).m8895a(interfaceC1356e);
    }

    /* renamed from: b */
    public void m8899b(String str, InterfaceC1356e interfaceC1356e) {
        C1360h m8900b = m8900b(str);
        if (m8900b != null) {
            m8900b.m8894b(interfaceC1356e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C1360h m8900b(String str) {
        return this.f4272d.get(str);
    }

    /* renamed from: a */
    public void m8903a(String str) {
        if (!this.f4272d.containsKey(str)) {
            this.f4272d.put(str, new C1360h(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8901b(C1355d c1355d) {
        for (Map.Entry<String, C1360h> entry : this.f4272d.entrySet()) {
            entry.getValue().m8896a(c1355d);
        }
    }
}
