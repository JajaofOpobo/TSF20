package com.flurry.a.b.a.d.b.b;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;

/* loaded from: classes.dex */
abstract class c extends ap {
    public c(Class cls) {
        super(cls);
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.d(jVar, pVar);
    }

    protected final com.flurry.a.b.a.e.p a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.e.l lVar) {
        com.flurry.a.b.a.h a;
        com.flurry.a.b.a.e.p c = lVar.c();
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        }
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            switch (jVar.b()) {
                case START_OBJECT:
                    a = a(jVar, pVar, lVar);
                    break;
                case START_ARRAY:
                    a = b(jVar, pVar, lVar);
                    break;
                case VALUE_STRING:
                    a = com.flurry.a.b.a.e.l.a(jVar.k());
                    break;
                default:
                    a = c(jVar, pVar, lVar);
                    break;
            }
            c.a(g, a);
            e = jVar.b();
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.flurry.a.b.a.e.a b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.e.l lVar) {
        com.flurry.a.b.a.e.a b = lVar.b();
        while (true) {
            switch (jVar.b()) {
                case START_OBJECT:
                    b.a(a(jVar, pVar, lVar));
                    break;
                case START_ARRAY:
                    b.a(b(jVar, pVar, lVar));
                    break;
                case VALUE_STRING:
                    b.a(com.flurry.a.b.a.e.l.a(jVar.k()));
                    break;
                case END_ARRAY:
                    break;
                default:
                    b.a(c(jVar, pVar, lVar));
                    break;
            }
        }
    }

    protected final com.flurry.a.b.a.h c(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.e.l lVar) {
        switch (d.a[jVar.e().ordinal()]) {
            case 1:
                return a(jVar, pVar, lVar);
            case 2:
                return b(jVar, pVar, lVar);
            case 3:
                return com.flurry.a.b.a.e.l.a(jVar.k());
            case 4:
            default:
                throw pVar.b(d());
            case 5:
                return a(jVar, pVar, lVar);
            case 6:
                Object z = jVar.z();
                if (z == null) {
                    return com.flurry.a.b.a.e.l.a();
                }
                if (z.getClass() == byte[].class) {
                    return com.flurry.a.b.a.e.l.a((byte[]) z);
                }
                return com.flurry.a.b.a.e.l.a(z);
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                com.flurry.a.b.a.l q = jVar.q();
                if (q == com.flurry.a.b.a.l.BIG_INTEGER || pVar.a(com.flurry.a.b.a.d.o.USE_BIG_INTEGER_FOR_INTS)) {
                    return com.flurry.a.b.a.e.l.a(jVar.v());
                }
                if (q == com.flurry.a.b.a.l.INT) {
                    return com.flurry.a.b.a.e.l.a(jVar.t());
                }
                return com.flurry.a.b.a.e.l.a(jVar.u());
            case ThemeParser.TYPE_FOLDER /* 8 */:
                if (jVar.q() == com.flurry.a.b.a.l.BIG_DECIMAL || pVar.a(com.flurry.a.b.a.d.o.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return com.flurry.a.b.a.e.l.a(jVar.y());
                }
                return com.flurry.a.b.a.e.l.a(jVar.x());
            case 9:
                return com.flurry.a.b.a.e.l.a(true);
            case 10:
                return com.flurry.a.b.a.e.l.a(false);
            case 11:
                return com.flurry.a.b.a.e.l.a();
        }
    }
}
