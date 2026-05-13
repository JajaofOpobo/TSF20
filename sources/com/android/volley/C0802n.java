package com.android.volley;

import com.android.volley.InterfaceC0781b;
/* renamed from: com.android.volley.n */
/* loaded from: classes.dex */
public class C0802n<T> {

    /* renamed from: a */
    public T f2320a;

    /* renamed from: b */
    public InterfaceC0781b.C0782a f2321b;

    /* renamed from: c */
    public final C0809s f2322c;

    /* renamed from: d */
    public boolean f2323d;

    /* renamed from: com.android.volley.n$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0803a {
        /* renamed from: a */
        void mo6194a(C0809s c0809s);
    }

    /* renamed from: com.android.volley.n$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0804b<T> {
        /* renamed from: a */
        void mo6192a(T t);
    }

    /* renamed from: a */
    public static <T> C0802n<T> m11000a(T t, InterfaceC0781b.C0782a c0782a) {
        return new C0802n<>(t, c0782a);
    }

    /* renamed from: a */
    public static <T> C0802n<T> m11001a(C0809s c0809s) {
        return new C0802n<>(c0809s);
    }

    /* renamed from: a */
    public boolean m11002a() {
        return this.f2322c == null;
    }

    private C0802n(T t, InterfaceC0781b.C0782a c0782a) {
        this.f2323d = false;
        this.f2320a = t;
        this.f2321b = c0782a;
        this.f2322c = null;
    }

    private C0802n(C0809s c0809s) {
        this.f2323d = false;
        this.f2320a = null;
        this.f2321b = null;
        this.f2322c = c0809s;
    }
}
