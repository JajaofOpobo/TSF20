package com.flurry.a.b.a.d.b.b;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class cd extends ap {
    private static final Object[] a = new Object[0];

    public cd() {
        super(Object.class);
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        int i2;
        switch (ce.a[jVar.e().ordinal()]) {
            case 1:
                return b(jVar, pVar);
            case 2:
            case 4:
            default:
                throw pVar.b(Object.class);
            case 3:
                if (pVar.a(com.flurry.a.b.a.d.o.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    if (jVar.b() == com.flurry.a.b.a.o.END_ARRAY) {
                        return a;
                    }
                    com.flurry.a.b.a.d.i.t g = pVar.g();
                    Object[] a2 = g.a();
                    int i3 = 0;
                    do {
                        Object a3 = a(jVar, pVar);
                        if (i3 >= a2.length) {
                            a2 = g.a(a2);
                            i2 = 0;
                        } else {
                            i2 = i3;
                        }
                        i3 = i2 + 1;
                        a2[i2] = a3;
                    } while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY);
                    return g.a(a2, i3);
                }
                if (jVar.b() == com.flurry.a.b.a.o.END_ARRAY) {
                    return new ArrayList(4);
                }
                com.flurry.a.b.a.d.i.t g2 = pVar.g();
                int i4 = 0;
                Object[] a4 = g2.a();
                int i5 = 0;
                do {
                    Object a5 = a(jVar, pVar);
                    i5++;
                    if (i4 >= a4.length) {
                        a4 = g2.a(a4);
                        i = 0;
                    } else {
                        i = i4;
                    }
                    i4 = i + 1;
                    a4[i] = a5;
                } while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY);
                ArrayList arrayList = new ArrayList(i5 + (i5 >> 3) + 1);
                g2.a(a4, i4, arrayList);
                return arrayList;
            case 5:
                return b(jVar, pVar);
            case 6:
                return jVar.z();
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return jVar.k();
            case ThemeParser.TYPE_FOLDER /* 8 */:
                if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_INTEGER_FOR_INTS)) {
                    return jVar.v();
                }
                return jVar.p();
            case 9:
                if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jVar.y();
                }
                return Double.valueOf(jVar.x());
            case 10:
                return Boolean.TRUE;
            case 11:
                return Boolean.FALSE;
            case 12:
                return null;
        }
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        switch (ce.a[jVar.e().ordinal()]) {
            case 1:
            case 3:
            case 5:
                return ayVar.d(jVar, pVar);
            case 2:
            case 4:
            default:
                throw pVar.b(Object.class);
            case 6:
                return jVar.z();
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return jVar.k();
            case ThemeParser.TYPE_FOLDER /* 8 */:
                if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_INTEGER_FOR_INTS)) {
                    return jVar.v();
                }
                return Integer.valueOf(jVar.t());
            case 9:
                if (pVar.a(com.flurry.a.b.a.d.o.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jVar.y();
                }
                return Double.valueOf(jVar.x());
            case 10:
                return Boolean.TRUE;
            case 11:
                return Boolean.FALSE;
            case 12:
                return null;
        }
    }

    private Object b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        }
        if (e != com.flurry.a.b.a.o.FIELD_NAME) {
            return new LinkedHashMap(4);
        }
        String k = jVar.k();
        jVar.b();
        Object a2 = a(jVar, pVar);
        if (jVar.b() != com.flurry.a.b.a.o.FIELD_NAME) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(k, a2);
            return linkedHashMap;
        }
        String k2 = jVar.k();
        jVar.b();
        Object a3 = a(jVar, pVar);
        if (jVar.b() != com.flurry.a.b.a.o.FIELD_NAME) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(k, a2);
            linkedHashMap2.put(k2, a3);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(k, a2);
        linkedHashMap3.put(k2, a3);
        do {
            String k3 = jVar.k();
            jVar.b();
            linkedHashMap3.put(k3, a(jVar, pVar));
        } while (jVar.b() != com.flurry.a.b.a.o.END_OBJECT);
        return linkedHashMap3;
    }
}
