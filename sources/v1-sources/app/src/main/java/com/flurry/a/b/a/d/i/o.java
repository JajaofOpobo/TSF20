package com.flurry.a.b.a.d.i;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
final class o {
    final /* synthetic */ Object a;
    final /* synthetic */ int b;

    o(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.a.getClass() || Array.getLength(obj) != this.b) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            Object obj2 = Array.get(this.a, i);
            Object obj3 = Array.get(obj, i);
            if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }
}
