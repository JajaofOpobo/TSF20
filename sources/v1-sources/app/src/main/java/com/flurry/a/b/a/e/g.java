package com.flurry.a.b.a.e;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {
    static final g a = new g();

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    private g() {
    }

    public static g a() {
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
