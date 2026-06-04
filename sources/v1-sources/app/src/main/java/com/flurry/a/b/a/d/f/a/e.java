package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.a.v;
import com.flurry.a.b.a.d.w;

/* loaded from: classes.dex */
public final class e extends a {
    protected final String a;

    public e(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f.c cVar, com.flurry.a.b.a.d.f fVar, Class cls, String str) {
        super(aVar, cVar, fVar, cls);
        this.a = str;
    }

    @Override // com.flurry.a.b.a.d.f.a.a, com.flurry.a.b.a.d.ay
    public final v a() {
        return v.PROPERTY;
    }

    @Override // com.flurry.a.b.a.d.f.a.o, com.flurry.a.b.a.d.ay
    public final String b() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.f.a.a, com.flurry.a.b.a.d.ay
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        } else {
            if (e == com.flurry.a.b.a.o.START_ARRAY) {
                return a(jVar, pVar, null);
            }
            if (e != com.flurry.a.b.a.o.FIELD_NAME) {
                return a(jVar, pVar, null);
            }
        }
        com.flurry.a.b.a.o oVar = e;
        com.flurry.a.b.a.h.m mVar = null;
        while (oVar == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            jVar.b();
            if (this.a.equals(g)) {
                w a = a(pVar, jVar.k());
                if (mVar != null) {
                    jVar = com.flurry.a.b.a.h.k.a(mVar.a(jVar), jVar);
                }
                jVar.b();
                return a.a(jVar, pVar);
            }
            if (mVar == null) {
                mVar = new com.flurry.a.b.a.h.m(null);
            }
            mVar.a(g);
            mVar.b(jVar);
            oVar = jVar.b();
        }
        return a(jVar, pVar, mVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.h.m mVar) {
        Object obj;
        if (this.e != null) {
            w a = a(pVar);
            if (mVar != null) {
                mVar.e();
                jVar = mVar.a(jVar);
                jVar.b();
            }
            return a.a(jVar, pVar);
        }
        switch (jVar.e()) {
            case VALUE_STRING:
                if (this.c.p().isAssignableFrom(String.class)) {
                    obj = jVar.k();
                    break;
                }
                obj = null;
                break;
            case VALUE_NUMBER_INT:
                if (this.c.p().isAssignableFrom(Integer.class)) {
                    obj = Integer.valueOf(jVar.t());
                    break;
                }
                obj = null;
                break;
            case VALUE_NUMBER_FLOAT:
                if (this.c.p().isAssignableFrom(Double.class)) {
                    obj = Double.valueOf(jVar.x());
                    break;
                }
                obj = null;
                break;
            case VALUE_TRUE:
                if (this.c.p().isAssignableFrom(Boolean.class)) {
                    obj = Boolean.TRUE;
                    break;
                }
                obj = null;
                break;
            case VALUE_FALSE:
                if (this.c.p().isAssignableFrom(Boolean.class)) {
                    obj = Boolean.FALSE;
                    break;
                }
                obj = null;
                break;
            default:
                obj = null;
                break;
        }
        if (obj == null) {
            if (jVar.e() == com.flurry.a.b.a.o.START_ARRAY) {
                return super.d(jVar, pVar);
            }
            throw pVar.a(jVar, com.flurry.a.b.a.o.FIELD_NAME, "missing property '" + this.a + "' that is to contain type id  (for class " + c() + ")");
        }
        return obj;
    }

    @Override // com.flurry.a.b.a.d.f.a.a, com.flurry.a.b.a.d.ay
    public final Object d(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return jVar.e() == com.flurry.a.b.a.o.START_ARRAY ? super.b(jVar, pVar) : a(jVar, pVar);
    }
}
