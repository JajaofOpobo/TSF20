package com.tsf.shell.p096f.p118e;

import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.d */
/* loaded from: classes.dex */
public class C2502d<E> {

    /* renamed from: a */
    private ArrayList<E> f8331a = new ArrayList<>();

    /* renamed from: c */
    public E m5383c() {
        return this.f8331a.isEmpty() ? mo718b() : this.f8331a.remove(0);
    }

    /* renamed from: a */
    public void m5384a(E e) {
        if (!this.f8331a.contains(e)) {
            this.f8331a.add(e);
        }
    }

    /* renamed from: b */
    public E mo718b() {
        return null;
    }
}
