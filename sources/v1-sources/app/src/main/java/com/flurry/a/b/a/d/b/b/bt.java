package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class bt extends bf {
    private static final bt b = new bt(String.class);
    private static final bt c = new bt(Object.class);

    @Override // com.flurry.a.b.a.d.b.b.bf
    public final /* bridge */ /* synthetic */ Object b(String str, com.flurry.a.b.a.d.p pVar) {
        return str;
    }

    private bt(Class cls) {
        super(cls);
    }

    public static bt a(Class cls) {
        if (cls == String.class) {
            return b;
        }
        if (cls == Object.class) {
            return c;
        }
        return new bt(cls);
    }
}
