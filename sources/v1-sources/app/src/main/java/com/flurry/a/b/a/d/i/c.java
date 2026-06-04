package com.flurry.a.b.a.d.i;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class c implements Iterable, Iterator {
    private final Object[] a;
    private int b = 0;

    public c(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b >= this.a.length) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }
}
