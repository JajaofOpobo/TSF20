package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class m {
    private AtomicInteger a;
    private final Map<String, Queue<l<?>>> b;
    private final Set<l<?>> c;
    private final PriorityBlockingQueue<l<?>> d;
    private final PriorityBlockingQueue<l<?>> e;
    private final com.android.volley.b f;
    private final f g;
    private final o h;
    private g[] i;
    private c j;
    private List<b> k;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(l<?> lVar);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(l<T> lVar);
    }

    public m(com.android.volley.b bVar, f fVar, int i, o oVar) {
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue<>();
        this.e = new PriorityBlockingQueue<>();
        this.k = new ArrayList();
        this.f = bVar;
        this.g = fVar;
        this.i = new g[i];
        this.h = oVar;
    }

    public m(com.android.volley.b bVar, f fVar, int i) {
        this(bVar, fVar, i, new e(new Handler(Looper.getMainLooper())));
    }

    public m(com.android.volley.b bVar, f fVar) {
        this(bVar, fVar, 4);
    }

    public void a() {
        b();
        this.j = new c(this.d, this.e, this.f, this.h);
        this.j.start();
        for (int i = 0; i < this.i.length; i++) {
            g gVar = new g(this.e, this.g, this.f, this.h);
            this.i[i] = gVar;
            gVar.start();
        }
    }

    public void b() {
        if (this.j != null) {
            this.j.a();
        }
        for (int i = 0; i < this.i.length; i++) {
            if (this.i[i] != null) {
                this.i[i].a();
            }
        }
    }

    public int c() {
        return this.a.incrementAndGet();
    }

    public com.android.volley.b d() {
        return this.f;
    }

    public void a(a aVar) {
        synchronized (this.c) {
            for (l<?> lVar : this.c) {
                if (aVar.a(lVar)) {
                    lVar.g();
                }
            }
        }
    }

    public void a(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        a(new a() { // from class: com.android.volley.m.1
            @Override // com.android.volley.m.a
            public boolean a(l<?> lVar) {
                return lVar.b() == obj;
            }
        });
    }

    public <T> l<T> a(l<T> lVar) {
        lVar.a(this);
        synchronized (this.c) {
            this.c.add(lVar);
        }
        lVar.a(c());
        lVar.a("add-to-queue");
        if (!lVar.r()) {
            this.e.add(lVar);
        } else {
            synchronized (this.b) {
                String e = lVar.e();
                if (this.b.containsKey(e)) {
                    Queue<l<?>> queue = this.b.get(e);
                    if (queue == null) {
                        queue = new LinkedList<>();
                    }
                    queue.add(lVar);
                    this.b.put(e, queue);
                    if (t.b) {
                        t.a("Request for cacheKey=%s is in flight, putting on hold.", e);
                    }
                } else {
                    this.b.put(e, null);
                    this.d.add(lVar);
                }
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void b(l<T> lVar) {
        synchronized (this.c) {
            this.c.remove(lVar);
        }
        synchronized (this.k) {
            for (b bVar : this.k) {
                bVar.a(lVar);
            }
        }
        if (lVar.r()) {
            synchronized (this.b) {
                String e = lVar.e();
                Queue<l<?>> remove = this.b.remove(e);
                if (remove != null) {
                    if (t.b) {
                        t.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), e);
                    }
                    this.d.addAll(remove);
                }
            }
        }
    }
}
