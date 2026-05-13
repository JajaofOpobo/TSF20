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
/* renamed from: com.android.volley.m */
/* loaded from: classes.dex */
public class C0798m {

    /* renamed from: a */
    private AtomicInteger f2307a;

    /* renamed from: b */
    private final Map<String, Queue<AbstractC0795l<?>>> f2308b;

    /* renamed from: c */
    private final Set<AbstractC0795l<?>> f2309c;

    /* renamed from: d */
    private final PriorityBlockingQueue<AbstractC0795l<?>> f2310d;

    /* renamed from: e */
    private final PriorityBlockingQueue<AbstractC0795l<?>> f2311e;

    /* renamed from: f */
    private final InterfaceC0781b f2312f;

    /* renamed from: g */
    private final InterfaceC0789f f2313g;

    /* renamed from: h */
    private final InterfaceC0805o f2314h;

    /* renamed from: i */
    private C0790g[] f2315i;

    /* renamed from: j */
    private C0783c f2316j;

    /* renamed from: k */
    private List<InterfaceC0801b> f2317k;

    /* renamed from: com.android.volley.m$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0800a {
        /* renamed from: a */
        boolean mo6193a(AbstractC0795l<?> abstractC0795l);
    }

    /* renamed from: com.android.volley.m$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0801b<T> {
        /* renamed from: a */
        void m11003a(AbstractC0795l<T> abstractC0795l);
    }

    public C0798m(InterfaceC0781b interfaceC0781b, InterfaceC0789f interfaceC0789f, int i, InterfaceC0805o interfaceC0805o) {
        this.f2307a = new AtomicInteger();
        this.f2308b = new HashMap();
        this.f2309c = new HashSet();
        this.f2310d = new PriorityBlockingQueue<>();
        this.f2311e = new PriorityBlockingQueue<>();
        this.f2317k = new ArrayList();
        this.f2312f = interfaceC0781b;
        this.f2313g = interfaceC0789f;
        this.f2315i = new C0790g[i];
        this.f2314h = interfaceC0805o;
    }

    public C0798m(InterfaceC0781b interfaceC0781b, InterfaceC0789f interfaceC0789f, int i) {
        this(interfaceC0781b, interfaceC0789f, i, new C0786e(new Handler(Looper.getMainLooper())));
    }

    public C0798m(InterfaceC0781b interfaceC0781b, InterfaceC0789f interfaceC0789f) {
        this(interfaceC0781b, interfaceC0789f, 4);
    }

    /* renamed from: a */
    public void m11011a() {
        m11007b();
        this.f2316j = new C0783c(this.f2310d, this.f2311e, this.f2312f, this.f2314h);
        this.f2316j.start();
        for (int i = 0; i < this.f2315i.length; i++) {
            C0790g c0790g = new C0790g(this.f2311e, this.f2313g, this.f2312f, this.f2314h);
            this.f2315i[i] = c0790g;
            c0790g.start();
        }
    }

    /* renamed from: b */
    public void m11007b() {
        if (this.f2316j != null) {
            this.f2316j.m11045a();
        }
        for (int i = 0; i < this.f2315i.length; i++) {
            if (this.f2315i[i] != null) {
                this.f2315i[i].m11042a();
            }
        }
    }

    /* renamed from: c */
    public int m11005c() {
        return this.f2307a.incrementAndGet();
    }

    /* renamed from: d */
    public InterfaceC0781b m11004d() {
        return this.f2312f;
    }

    /* renamed from: a */
    public void m11009a(InterfaceC0800a interfaceC0800a) {
        synchronized (this.f2309c) {
            for (AbstractC0795l<?> abstractC0795l : this.f2309c) {
                if (interfaceC0800a.mo6193a(abstractC0795l)) {
                    abstractC0795l.m11022g();
                }
            }
        }
    }

    /* renamed from: a */
    public void m11008a(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        m11009a(new InterfaceC0800a() { // from class: com.android.volley.m.1
            @Override // com.android.volley.C0798m.InterfaceC0800a
            /* renamed from: a */
            public boolean mo6193a(AbstractC0795l<?> abstractC0795l) {
                return abstractC0795l.m11031b() == obj;
            }
        });
    }

    /* renamed from: a */
    public <T> AbstractC0795l<T> m11010a(AbstractC0795l<T> abstractC0795l) {
        abstractC0795l.m11035a(this);
        synchronized (this.f2309c) {
            this.f2309c.add(abstractC0795l);
        }
        abstractC0795l.m11038a(m11005c());
        abstractC0795l.mo6644a("add-to-queue");
        if (!abstractC0795l.m11016r()) {
            this.f2311e.add(abstractC0795l);
        } else {
            synchronized (this.f2308b) {
                String m11024e = abstractC0795l.m11024e();
                if (this.f2308b.containsKey(m11024e)) {
                    Queue<AbstractC0795l<?>> queue = this.f2308b.get(m11024e);
                    if (queue == null) {
                        queue = new LinkedList<>();
                    }
                    queue.add(abstractC0795l);
                    this.f2308b.put(m11024e, queue);
                    if (C0810t.f2327b) {
                        C0810t.m10992a("Request for cacheKey=%s is in flight, putting on hold.", m11024e);
                    }
                } else {
                    this.f2308b.put(m11024e, null);
                    this.f2310d.add(abstractC0795l);
                }
            }
        }
        return abstractC0795l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void m11006b(AbstractC0795l<T> abstractC0795l) {
        synchronized (this.f2309c) {
            this.f2309c.remove(abstractC0795l);
        }
        synchronized (this.f2317k) {
            for (InterfaceC0801b interfaceC0801b : this.f2317k) {
                interfaceC0801b.m11003a(abstractC0795l);
            }
        }
        if (abstractC0795l.m11016r()) {
            synchronized (this.f2308b) {
                String m11024e = abstractC0795l.m11024e();
                Queue<AbstractC0795l<?>> remove = this.f2308b.remove(m11024e);
                if (remove != null) {
                    if (C0810t.f2327b) {
                        C0810t.m10992a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m11024e);
                    }
                    this.f2310d.addAll(remove);
                }
            }
        }
    }
}
