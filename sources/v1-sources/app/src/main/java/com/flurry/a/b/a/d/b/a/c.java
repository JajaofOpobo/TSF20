package com.flurry.a.b.a.d.b.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class c implements Iterator {
    private final b[] a;
    private b b;
    private int c;

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        b bVar = this.b;
        if (bVar == null) {
            throw new NoSuchElementException();
        }
        b bVar2 = bVar.a;
        while (bVar2 == null && this.c < this.a.length) {
            b[] bVarArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bVar2 = bVarArr[i];
        }
        this.b = bVar2;
        return bVar.c;
    }

    public c(b[] bVarArr) {
        int i;
        this.a = bVarArr;
        int i2 = 0;
        int length = this.a.length;
        while (true) {
            if (i2 >= length) {
                i = i2;
                break;
            }
            i = i2 + 1;
            b bVar = this.a[i2];
            if (bVar != null) {
                this.b = bVar;
                break;
            }
            i2 = i;
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
