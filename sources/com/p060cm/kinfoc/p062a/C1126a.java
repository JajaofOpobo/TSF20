package com.p060cm.kinfoc.p062a;

import java.util.LinkedList;
import java.util.Queue;
/* renamed from: com.cm.kinfoc.a.a */
/* loaded from: classes.dex */
public class C1126a<E> {

    /* renamed from: a */
    private Thread f3587a;

    /* renamed from: b */
    private final Queue<E> f3588b;

    /* renamed from: c */
    private final int f3589c;

    /* renamed from: d */
    private final InterfaceC1129b<E> f3590d;

    /* renamed from: com.cm.kinfoc.a.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1129b<E> {
        /* renamed from: a */
        void mo9653a(E e);
    }

    /* renamed from: com.cm.kinfoc.a.a$a */
    /* loaded from: classes.dex */
    public static class C1128a<E> {

        /* renamed from: a */
        private int f3592a = 17000;

        /* renamed from: b */
        private InterfaceC1129b<E> f3593b = null;

        /* renamed from: a */
        public C1126a<E> m9790a() {
            return new C1126a<>(this);
        }

        /* renamed from: a */
        public C1128a<E> m9789a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The wait time should be positive integer.");
            }
            this.f3592a = i;
            return this;
        }

        /* renamed from: a */
        public C1128a<E> m9787a(InterfaceC1129b<E> interfaceC1129b) {
            this.f3593b = interfaceC1129b;
            return this;
        }
    }

    /* renamed from: a */
    public void m9793a(E e) {
        if (e != null) {
            synchronized (this.f3588b) {
                this.f3588b.offer(e);
                if (this.f3587a == null) {
                    m9796a();
                }
                this.f3588b.notify();
            }
        }
    }

    /* renamed from: a */
    private void m9796a() {
        this.f3587a = new Thread() { // from class: com.cm.kinfoc.a.a.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Object poll;
                while (true) {
                    synchronized (C1126a.this.f3588b) {
                        if (C1126a.this.f3588b.isEmpty()) {
                            try {
                                C1126a.this.f3588b.wait(C1126a.this.f3589c);
                                if (C1126a.this.f3588b.isEmpty()) {
                                    C1126a.this.f3587a = null;
                                    return;
                                }
                            } catch (InterruptedException e) {
                                C1126a.this.f3587a = null;
                                return;
                            }
                        }
                        poll = C1126a.this.f3588b.poll();
                    }
                    if (C1126a.this.f3590d != null) {
                        C1126a.this.f3590d.mo9653a(poll);
                    }
                }
            }
        };
        this.f3587a.start();
    }

    private C1126a(C1128a<E> c1128a) {
        this.f3587a = null;
        this.f3588b = new LinkedList();
        this.f3589c = ((C1128a) c1128a).f3592a;
        this.f3590d = ((C1128a) c1128a).f3593b;
    }
}
