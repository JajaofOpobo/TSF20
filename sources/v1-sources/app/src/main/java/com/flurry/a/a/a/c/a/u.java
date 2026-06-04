package com.flurry.a.a.a.c.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class u implements Iterator {
    final /* synthetic */ t a;
    private int b;

    u(t tVar) {
        this.a = tVar;
        this.b = this.a.b.length;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.b <= 0) {
            throw new NoSuchElementException();
        }
        g[] gVarArr = this.a.b;
        int i = this.b - 1;
        this.b = i;
        return gVarArr[i];
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
