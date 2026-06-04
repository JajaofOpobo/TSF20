package com.flurry.a.b.a.d.b.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a {
    private final b[] a;
    private final int b;
    private final int c;

    public a(Collection collection) {
        this.c = collection.size();
        int a = a(this.c);
        this.b = a - 1;
        b[] bVarArr = new b[a];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.b.k kVar = (com.flurry.a.b.a.d.b.k) it.next();
            String c = kVar.c();
            int hashCode = c.hashCode() & this.b;
            bVarArr[hashCode] = new b(bVarArr[hashCode], c, kVar);
        }
        this.a = bVarArr;
    }

    public final void a() {
        int i = 0;
        for (b bVar : this.a) {
            while (bVar != null) {
                bVar.c.a(i);
                bVar = bVar.a;
                i++;
            }
        }
    }

    private static final int a(int i) {
        int i2 = 2;
        while (i2 < (i <= 32 ? i + i : (i >> 2) + i)) {
            i2 += i2;
        }
        return i2;
    }

    public final int b() {
        return this.c;
    }

    public final Iterator c() {
        return new c(this.a);
    }

    public final com.flurry.a.b.a.d.b.k a(String str) {
        int hashCode = this.b & str.hashCode();
        b bVar = this.a[hashCode];
        if (bVar == null) {
            return null;
        }
        if (bVar.b == str) {
            return bVar.c;
        }
        do {
            bVar = bVar.a;
            if (bVar == null) {
                for (b bVar2 = this.a[hashCode]; bVar2 != null; bVar2 = bVar2.a) {
                    if (str.equals(bVar2.b)) {
                        return bVar2.c;
                    }
                }
                return null;
            }
        } while (bVar.b != str);
        return bVar.c;
    }

    public final void a(com.flurry.a.b.a.d.b.k kVar) {
        String c = kVar.c();
        int hashCode = c.hashCode() & (this.a.length - 1);
        boolean z = false;
        b bVar = null;
        for (b bVar2 = this.a[hashCode]; bVar2 != null; bVar2 = bVar2.a) {
            if (!z && bVar2.b.equals(c)) {
                z = true;
            } else {
                bVar = new b(bVar, bVar2.b, bVar2.c);
            }
        }
        if (!z) {
            throw new NoSuchElementException("No entry '" + kVar + "' found, can't replace");
        }
        this.a[hashCode] = new b(bVar, c, kVar);
    }

    public final void b(com.flurry.a.b.a.d.b.k kVar) {
        String c = kVar.c();
        int hashCode = c.hashCode() & (this.a.length - 1);
        boolean z = false;
        b bVar = null;
        for (b bVar2 = this.a[hashCode]; bVar2 != null; bVar2 = bVar2.a) {
            if (!z && bVar2.b.equals(c)) {
                z = true;
            } else {
                bVar = new b(bVar, bVar2.b, bVar2.c);
            }
        }
        if (!z) {
            throw new NoSuchElementException("No entry '" + kVar + "' found, can't remove");
        }
        this.a[hashCode] = bVar;
    }
}
