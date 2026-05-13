package com.cm.kinfoc.a;

import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes.dex */
public class a<E> {
    private Thread a;
    private final Queue<E> b;
    private final int c;
    private final b<E> d;

    /* loaded from: classes.dex */
    public interface b<E> {
        void a(E e);
    }

    /* renamed from: com.cm.kinfoc.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0041a<E> {
        private int a = 17000;
        private b<E> b = null;

        public a<E> a() {
            return new a<>(this);
        }

        public C0041a<E> a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The wait time should be positive integer.");
            }
            this.a = i;
            return this;
        }

        public C0041a<E> a(b<E> bVar) {
            this.b = bVar;
            return this;
        }
    }

    public void a(E e) {
        if (e != null) {
            synchronized (this.b) {
                this.b.offer(e);
                if (this.a == null) {
                    a();
                }
                this.b.notify();
            }
        }
    }

    private void a() {
        this.a = new Thread() { // from class: com.cm.kinfoc.a.a.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Object poll;
                while (true) {
                    synchronized (a.this.b) {
                        if (a.this.b.isEmpty()) {
                            try {
                                a.this.b.wait(a.this.c);
                                if (a.this.b.isEmpty()) {
                                    a.this.a = null;
                                    return;
                                }
                            } catch (InterruptedException e) {
                                a.this.a = null;
                                return;
                            }
                        }
                        poll = a.this.b.poll();
                    }
                    if (a.this.d != null) {
                        a.this.d.a(poll);
                    }
                }
            }
        };
        this.a.start();
    }

    private a(C0041a<E> c0041a) {
        this.a = null;
        this.b = new LinkedList();
        this.c = ((C0041a) c0041a).a;
        this.d = ((C0041a) c0041a).b;
    }
}
