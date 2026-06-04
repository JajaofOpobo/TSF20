package com.flurry.a.b.a.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends j {
    protected final com.flurry.a.b.a.j[] e;
    protected int f;

    private k(com.flurry.a.b.a.j[] jVarArr) {
        super(jVarArr[0]);
        this.e = jVarArr;
        this.f = 1;
    }

    public static k a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.j jVar2) {
        if (!(jVar instanceof k) && !(jVar2 instanceof k)) {
            return new k(new com.flurry.a.b.a.j[]{jVar, jVar2});
        }
        ArrayList arrayList = new ArrayList();
        if (jVar instanceof k) {
            ((k) jVar).a(arrayList);
        } else {
            arrayList.add(jVar);
        }
        if (jVar2 instanceof k) {
            ((k) jVar2).a(arrayList);
        } else {
            arrayList.add(jVar2);
        }
        return new k((com.flurry.a.b.a.j[]) arrayList.toArray(new com.flurry.a.b.a.j[arrayList.size()]));
    }

    private void a(List list) {
        int i = this.f - 1;
        int length = this.e.length;
        for (int i2 = i; i2 < length; i2++) {
            com.flurry.a.b.a.j jVar = this.e[i2];
            if (jVar instanceof k) {
                ((k) jVar).a(list);
            } else {
                list.add(jVar);
            }
        }
    }

    @Override // com.flurry.a.b.a.h.j, com.flurry.a.b.a.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        do {
            this.d.close();
        } while (A());
    }

    @Override // com.flurry.a.b.a.h.j, com.flurry.a.b.a.j
    public final com.flurry.a.b.a.o b() {
        com.flurry.a.b.a.o b = this.d.b();
        if (b == null) {
            while (A()) {
                com.flurry.a.b.a.o b2 = this.d.b();
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        }
        return b;
    }

    private boolean A() {
        if (this.f >= this.e.length) {
            return false;
        }
        com.flurry.a.b.a.j[] jVarArr = this.e;
        int i = this.f;
        this.f = i + 1;
        this.d = jVarArr[i];
        return true;
    }
}
