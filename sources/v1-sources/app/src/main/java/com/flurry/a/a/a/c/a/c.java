package com.flurry.a.a.a.c.a;

import com.flurry.a.a.a.ad;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends z {
    private static com.flurry.a.a.a.c.u a = new com.flurry.a.a.a.c.u().b();
    private static /* synthetic */ int[] b;

    private static /* synthetic */ int[] a() {
        int[] iArr = b;
        if (iArr == null) {
            iArr = new int[ad.values().length];
            try {
                iArr[ad.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ad.BOOLEAN.ordinal()] = 13;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ad.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ad.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[ad.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[ad.FIXED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[ad.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ad.INT.ordinal()] = 9;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ad.LONG.ordinal()] = 10;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ad.MAP.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[ad.NULL.ordinal()] = 14;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[ad.RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[ad.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[ad.UNION.ordinal()] = 5;
            } catch (NoSuchFieldError e14) {
            }
            b = iArr;
        }
        return iArr;
    }

    public final g a(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2) {
        return g.a(a(cVar, cVar2, new HashMap()));
    }

    private g a(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2, Map map) {
        ad a2 = cVar.a();
        ad a3 = cVar2.a();
        if (a2 == a3) {
            switch (a()[a2.ordinal()]) {
                case 1:
                    return c(cVar, cVar2, map);
                case 2:
                    if (cVar.g() == null || cVar.g().equals(cVar2.g())) {
                        g[] gVarArr = new g[2];
                        List c = cVar.c();
                        List c2 = cVar2.c();
                        Object[] objArr = new Object[c.size()];
                        for (int i = 0; i < objArr.length; i++) {
                            int indexOf = c2.indexOf(c.get(i));
                            objArr[i] = indexOf == -1 ? "No match for " + ((String) c.get(i)) : new Integer(indexOf);
                        }
                        gVarArr[0] = new j(c2.size(), objArr);
                        gVarArr[1] = g.l;
                        return g.b(gVarArr);
                    }
                    break;
                case 3:
                    return g.b(g.a(g.o, a(cVar.i(), cVar2.i(), map)), g.n);
                case 4:
                    return g.b(g.a(g.q, a(cVar.j(), cVar2.j(), map), g.i), g.p);
                case 5:
                    return b(cVar, cVar2, map);
                case 6:
                    if (cVar.g().equals(cVar2.g()) && cVar.l() == cVar2.l()) {
                        return g.b(new o(cVar.l()), g.k);
                    }
                    break;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    return g.i;
                case ThemeParser.TYPE_FOLDER /* 8 */:
                    return g.j;
                case 9:
                    return g.e;
                case 10:
                    return g.f;
                case 11:
                    return g.g;
                case 12:
                    return g.h;
                case 13:
                    return g.d;
                case 14:
                    return g.c;
                default:
                    throw new com.flurry.a.a.a.b("Unkown type for schema: " + a2);
            }
        } else {
            if (a2 == ad.UNION) {
                return b(cVar, cVar2, map);
            }
            switch (a()[a3.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                case ThemeParser.TYPE_FOLDER /* 8 */:
                case 9:
                case 13:
                case 14:
                    break;
                case 5:
                    int b2 = b(cVar2, cVar);
                    if (b2 >= 0) {
                        return g.b(new x(b2, a(cVar, (com.flurry.a.a.a.c) cVar2.k().get(b2), map)), g.m);
                    }
                    break;
                case 6:
                default:
                    throw new RuntimeException("Unexpected schema type: " + a3);
                case 10:
                    switch (a()[a2.ordinal()]) {
                        case 9:
                            return g.a(super.a(cVar, map), g.f);
                    }
                case 11:
                    switch (a()[a2.ordinal()]) {
                        case 9:
                        case 10:
                            return g.a(super.a(cVar, map), g.g);
                    }
                case 12:
                    switch (a()[a2.ordinal()]) {
                        case 9:
                        case 10:
                        case 11:
                            return g.a(super.a(cVar, map), g.h);
                    }
            }
        }
        return g.a("Found " + cVar.a(true) + ", expecting " + cVar2.a(true));
    }

    private g b(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2, Map map) {
        List<com.flurry.a.a.a.c> k = cVar.k();
        int size = k.size();
        g[] gVarArr = new g[size];
        String[] strArr = new String[size];
        int i = 0;
        for (com.flurry.a.a.a.c cVar3 : k) {
            gVarArr[i] = a(cVar3, cVar2, map);
            strArr[i] = cVar3.g();
            i++;
        }
        return g.b(g.a(gVarArr, strArr), new y());
    }

    private g c(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2, Map map) {
        d dVar = new d(cVar, cVar2);
        g gVar = (g) map.get(dVar);
        if (gVar == null) {
            List<com.flurry.a.a.a.m> b2 = cVar.b();
            List<com.flurry.a.a.a.m> b3 = cVar2.b();
            com.flurry.a.a.a.m[] mVarArr = new com.flurry.a.a.a.m[b3.size()];
            int size = b2.size() + 1;
            Iterator it = b2.iterator();
            int i = 0;
            while (it.hasNext()) {
                com.flurry.a.a.a.m b4 = cVar2.b(((com.flurry.a.a.a.m) it.next()).a());
                if (b4 != null) {
                    mVarArr[i] = b4;
                    i++;
                }
            }
            int i2 = i;
            int i3 = size;
            for (com.flurry.a.a.a.m mVar : b3) {
                if (cVar.b(mVar.a()) == null) {
                    if (mVar.e() == null) {
                        g a2 = g.a("Found " + cVar.a(true) + ", expecting " + cVar2.a(true));
                        map.put(dVar, a2);
                        return a2;
                    }
                    mVarArr[i2] = mVar;
                    i3 += 3;
                    i2++;
                }
            }
            g[] gVarArr = new g[i3];
            int i4 = i3 - 1;
            gVarArr[i4] = new l(mVarArr);
            g b5 = g.b(gVarArr);
            map.put(dVar, b5);
            int i5 = i4;
            for (com.flurry.a.a.a.m mVar2 : b2) {
                com.flurry.a.a.a.m b6 = cVar2.b(mVar2.a());
                if (b6 == null) {
                    i5--;
                    gVarArr[i5] = new v(a(mVar2.c(), mVar2.c(), map));
                } else {
                    i5--;
                    gVarArr[i5] = a(mVar2.c(), b6.c(), map);
                }
            }
            for (com.flurry.a.a.a.m mVar3 : b3) {
                if (cVar.b(mVar3.a()) == null) {
                    com.flurry.a.a.a.c c = mVar3.c();
                    com.flurry.a.b.a.h e = mVar3.e();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    com.flurry.a.a.a.c.k a3 = a.a(byteArrayOutputStream, null);
                    a(a3, c, e);
                    a3.flush();
                    int i6 = i5 - 1;
                    gVarArr[i6] = new i(byteArrayOutputStream.toByteArray());
                    int i7 = i6 - 1;
                    gVarArr[i7] = a(mVar3.c(), mVar3.c(), map);
                    i5 = i7 - 1;
                    gVarArr[i5] = g.x;
                }
            }
            return b5;
        }
        return gVar;
    }

    public static void a(com.flurry.a.a.a.c.t tVar, com.flurry.a.a.a.c cVar, com.flurry.a.b.a.h hVar) {
        byte[] bArr;
        while (true) {
            switch (a()[cVar.a().ordinal()]) {
                case 1:
                    for (com.flurry.a.a.a.m mVar : cVar.b()) {
                        String a2 = mVar.a();
                        com.flurry.a.b.a.h a3 = hVar.a(a2);
                        if (a3 == null) {
                            a3 = mVar.e();
                        }
                        if (a3 == null) {
                            throw new com.flurry.a.a.a.b("No default value for: " + a2);
                        }
                        a(tVar, mVar.c(), a3);
                    }
                    return;
                case 2:
                    tVar.a(cVar.c(hVar.h()));
                    return;
                case 3:
                    tVar.b();
                    tVar.a(hVar.p());
                    com.flurry.a.a.a.c i = cVar.i();
                    Iterator it = hVar.iterator();
                    while (it.hasNext()) {
                        com.flurry.a.b.a.h hVar2 = (com.flurry.a.b.a.h) it.next();
                        tVar.c();
                        a(tVar, i, hVar2);
                    }
                    tVar.d();
                    return;
                case 4:
                    tVar.e();
                    tVar.a(hVar.p());
                    com.flurry.a.a.a.c j = cVar.j();
                    Iterator r = hVar.r();
                    while (r.hasNext()) {
                        tVar.c();
                        String str = (String) r.next();
                        tVar.a(str);
                        a(tVar, j, hVar.a(str));
                    }
                    tVar.f();
                    return;
                case 5:
                    tVar.b(0);
                    cVar = (com.flurry.a.a.a.c) cVar.k().get(0);
                case 6:
                    if (!hVar.e()) {
                        throw new com.flurry.a.a.a.b("Non-string default value for fixed: " + hVar);
                    }
                    byte[] bytes = hVar.h().getBytes("ISO-8859-1");
                    if (bytes.length != cVar.l()) {
                        byte[] bArr2 = new byte[cVar.l()];
                        System.arraycopy(bytes, 0, bArr2, 0, cVar.l() > bytes.length ? bytes.length : cVar.l());
                        bArr = bArr2;
                    } else {
                        bArr = bytes;
                    }
                    tVar.b(bArr);
                    return;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    if (!hVar.e()) {
                        throw new com.flurry.a.a.a.b("Non-string default value for string: " + hVar);
                    }
                    tVar.a(hVar.h());
                    return;
                case ThemeParser.TYPE_FOLDER /* 8 */:
                    if (!hVar.e()) {
                        throw new com.flurry.a.a.a.b("Non-string default value for bytes: " + hVar);
                    }
                    tVar.a(hVar.h().getBytes("ISO-8859-1"));
                    return;
                case 9:
                    if (!hVar.c()) {
                        throw new com.flurry.a.a.a.b("Non-numeric default value for int: " + hVar);
                    }
                    tVar.c(hVar.j());
                    return;
                case 10:
                    if (!hVar.c()) {
                        throw new com.flurry.a.a.a.b("Non-numeric default value for long: " + hVar);
                    }
                    tVar.b(hVar.k());
                    return;
                case 11:
                    if (!hVar.c()) {
                        throw new com.flurry.a.a.a.b("Non-numeric default value for float: " + hVar);
                    }
                    tVar.a((float) hVar.l());
                    return;
                case 12:
                    if (!hVar.c()) {
                        throw new com.flurry.a.a.a.b("Non-numeric default value for double: " + hVar);
                    }
                    tVar.a(hVar.l());
                    return;
                case 13:
                    if (!hVar.f()) {
                        throw new com.flurry.a.a.a.b("Non-boolean default for boolean: " + hVar);
                    }
                    tVar.a(hVar.i());
                    return;
                case 14:
                    if (!hVar.g()) {
                        throw new com.flurry.a.a.a.b("Non-null default value for null type: " + hVar);
                    }
                    tVar.a();
                    return;
                default:
                    return;
            }
        }
    }

    private static int b(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2) {
        int i = 0;
        ad a2 = cVar2.a();
        int i2 = 0;
        for (com.flurry.a.a.a.c cVar3 : cVar.k()) {
            if (a2 == cVar3.a()) {
                if (a2 != ad.RECORD && a2 != ad.ENUM && a2 != ad.FIXED) {
                    return i2;
                }
                String g = cVar2.g();
                String g2 = cVar3.g();
                if (g != null && g.equals(g2)) {
                    return i2;
                }
                if (g == g2 && a2 == ad.RECORD) {
                    return i2;
                }
            }
            i2++;
        }
        for (com.flurry.a.a.a.c cVar4 : cVar.k()) {
            switch (a()[a2.ordinal()]) {
                case 9:
                    switch (a()[cVar4.a().ordinal()]) {
                        case 10:
                        case 12:
                            return i;
                    }
                case 10:
                case 11:
                    switch (a()[cVar4.a().ordinal()]) {
                        case 12:
                            return i;
                    }
            }
            i++;
        }
        return -1;
    }
}
