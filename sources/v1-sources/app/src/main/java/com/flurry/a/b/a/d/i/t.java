package com.flurry.a.b.a.d.i;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    private u a;
    private u b;
    private int c;
    private Object[] d;

    public final Object[] a() {
        c();
        return this.d == null ? new Object[12] : this.d;
    }

    public final Object[] a(Object[] objArr) {
        int i;
        u uVar = new u(objArr);
        if (this.a == null) {
            this.b = uVar;
            this.a = uVar;
        } else {
            u uVar2 = this.b;
            if (uVar2.b != null) {
                throw new IllegalStateException();
            }
            uVar2.b = uVar;
            this.b = uVar;
        }
        int length = objArr.length;
        this.c += length;
        if (length < 16384) {
            i = length + length;
        } else {
            i = length + (length >> 2);
        }
        return new Object[i];
    }

    public final Object[] a(Object[] objArr, int i) {
        int i2 = this.c + i;
        Object[] objArr2 = new Object[i2];
        a(objArr2, i2, objArr, i);
        return objArr2;
    }

    public final Object[] a(Object[] objArr, int i, Class cls) {
        int i2 = i + this.c;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, i2);
        a(objArr2, i2, objArr, i);
        c();
        return objArr2;
    }

    public final void a(Object[] objArr, int i, List list) {
        for (u uVar = this.a; uVar != null; uVar = uVar.b) {
            for (Object obj : uVar.a) {
                list.add(obj);
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            list.add(objArr[i2]);
        }
    }

    public final int b() {
        if (this.d == null) {
            return 0;
        }
        return this.d.length;
    }

    private void c() {
        if (this.b != null) {
            this.d = this.b.a;
        }
        this.b = null;
        this.a = null;
        this.c = 0;
    }

    private void a(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (u uVar = this.a; uVar != null; uVar = uVar.b) {
            Object[] objArr2 = uVar.a;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
        }
    }
}
