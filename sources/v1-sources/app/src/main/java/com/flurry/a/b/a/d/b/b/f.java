package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class f extends bw {
    public f() {
        super(Class.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Class a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String k = jVar.k();
            if (k.indexOf(46) < 0) {
                if ("int".equals(k)) {
                    return Integer.TYPE;
                }
                if ("long".equals(k)) {
                    return Long.TYPE;
                }
                if ("float".equals(k)) {
                    return Float.TYPE;
                }
                if ("double".equals(k)) {
                    return Double.TYPE;
                }
                if ("boolean".equals(k)) {
                    return Boolean.TYPE;
                }
                if ("byte".equals(k)) {
                    return Byte.TYPE;
                }
                if ("char".equals(k)) {
                    return Character.TYPE;
                }
                if ("short".equals(k)) {
                    return Short.TYPE;
                }
                if ("void".equals(k)) {
                    return Void.TYPE;
                }
            }
            try {
                return Class.forName(jVar.k());
            } catch (ClassNotFoundException e2) {
                throw pVar.a(this.q, e2);
            }
        }
        throw pVar.a(this.q, e);
    }
}
