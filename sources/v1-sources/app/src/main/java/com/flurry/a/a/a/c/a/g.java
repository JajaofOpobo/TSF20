package com.flurry.a.a.a.c.a;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {
    public static final g c = new w("null");
    public static final g d = new w("boolean");
    public static final g e = new w("int");
    public static final g f = new w("long");
    public static final g g = new w("float");
    public static final g h = new w("double");
    public static final g i = new w("string");
    public static final g j = new w("bytes");
    public static final g k = new w("fixed");
    public static final g l = new w("enum");
    public static final g m = new w("union");
    public static final g n = new w("array-start");
    public static final g o = new w("array-end");
    public static final g p = new w("map-start");
    public static final g q = new w("map-end");
    public static final g r = new w("item-end");
    public static final g s = new w("field-action");
    public static final g t = new n(false, (byte) 0);
    public static final g u = new n(true, (byte) 0);
    public static final g v = new n(true, (byte) 0);
    public static final g w = new n(true, (byte) 0);
    public static final g x = new n(true, (byte) 0);
    public static final g y = new w("map-key-marker");
    public final p a;
    public final g[] b;

    protected g(p pVar) {
        this(pVar, null);
    }

    protected g(p pVar, g[] gVarArr) {
        this.b = gVarArr;
        this.a = pVar;
    }

    static g a(g... gVarArr) {
        return new s(gVarArr, (byte) 0);
    }

    static g b(g... gVarArr) {
        return new t(gVarArr, (byte) 0);
    }

    static g a(g gVar, g... gVarArr) {
        return new q(gVar, gVarArr, (byte) 0);
    }

    static g a(g[] gVarArr, String[] strArr) {
        return new h(gVarArr, strArr, (byte) 0);
    }

    static g a(String str) {
        return new k(str, (byte) 0);
    }

    static g a(g gVar, g gVar2) {
        return new r(gVar, gVar2, (byte) 0);
    }

    public g a(Map map, Map map2) {
        return this;
    }

    public int a() {
        return 1;
    }

    static void a(g[] gVarArr, int i2, g[] gVarArr2, int i3, Map map, Map map2) {
        while (i2 < gVarArr.length) {
            g a = gVarArr[i2].a(map, map2);
            if (a instanceof t) {
                g[] gVarArr3 = a.b;
                List list = (List) map2.get(a);
                if (list == null) {
                    System.arraycopy(gVarArr3, 0, gVarArr2, i3, gVarArr3.length);
                } else {
                    list.add(new m(gVarArr2, i3));
                }
                i3 += gVarArr3.length;
            } else {
                gVarArr2[i3] = a;
                i3++;
            }
            i2++;
        }
    }

    protected static int a(g[] gVarArr, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i2 < gVarArr.length) {
                if (gVarArr[i2] instanceof t) {
                    i3 = ((t) gVarArr[i2]).a() + i4;
                } else {
                    i3 = i4 + 1;
                }
                i2++;
            } else {
                return i4;
            }
        }
    }
}
