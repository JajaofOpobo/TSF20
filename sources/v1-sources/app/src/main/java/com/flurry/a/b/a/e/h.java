package com.flurry.a.b.a.e;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator {
    static final h a = new h();

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    private h() {
    }

    public static h a() {
        return a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException();
    }
}
