package com.flurry.a.a.a;

/* loaded from: classes.dex */
final class ab {
    private Object a;
    private Object b;

    /* synthetic */ ab(Object obj, Object obj2, byte b) {
        this(obj, obj2);
    }

    private ab(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        return this.a == ((ab) obj).a && this.b == ((ab) obj).b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) + System.identityHashCode(this.b);
    }
}
