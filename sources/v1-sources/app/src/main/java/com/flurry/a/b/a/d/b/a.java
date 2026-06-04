package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ay;

/* loaded from: classes.dex */
public final class a extends com.flurry.a.b.a.d.w {
    protected final com.flurry.a.b.a.g.a a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    protected final boolean e;

    public a(com.flurry.a.b.a.g.a aVar) {
        this.a = aVar;
        Class p = aVar.p();
        this.b = p.isAssignableFrom(String.class);
        this.c = p == Boolean.TYPE || p.isAssignableFrom(Boolean.class);
        this.d = p == Integer.TYPE || p.isAssignableFrom(Integer.class);
        this.e = p == Double.TYPE || p.isAssignableFrom(Double.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, ay ayVar) {
        Object obj;
        switch (jVar.e()) {
            case VALUE_STRING:
                if (this.b) {
                    obj = jVar.k();
                    break;
                }
                obj = null;
                break;
            case VALUE_NUMBER_INT:
                if (this.d) {
                    obj = Integer.valueOf(jVar.t());
                    break;
                }
                obj = null;
                break;
            case VALUE_NUMBER_FLOAT:
                if (this.e) {
                    obj = Double.valueOf(jVar.x());
                    break;
                }
                obj = null;
                break;
            case VALUE_TRUE:
                if (this.c) {
                    obj = Boolean.TRUE;
                    break;
                }
                obj = null;
                break;
            case VALUE_FALSE:
                if (this.c) {
                    obj = Boolean.FALSE;
                    break;
                }
                obj = null;
                break;
            default:
                obj = null;
                break;
        }
        return obj != null ? obj : ayVar.a(jVar, pVar);
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        throw pVar.a(this.a.p(), "abstract types can only be instantiated with additional type information");
    }
}
