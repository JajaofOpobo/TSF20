package com.flurry.a.a.a.b;

import java.util.Iterator;

/* loaded from: classes.dex */
final class f implements Iterator {
    final /* synthetic */ e a;
    private int b = 0;

    f(e eVar) {
        this.a = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.b;
        i = this.a.c;
        return i2 < i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        objArr = this.a.d;
        int i = this.b;
        this.b = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
