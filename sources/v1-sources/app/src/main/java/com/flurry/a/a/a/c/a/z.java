package com.flurry.a.a.a.c.a;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class z {
    public final g a(com.flurry.a.a.a.c cVar, Map map) {
        switch (aa.a[cVar.a().ordinal()]) {
            case 1:
                return g.c;
            case 2:
                return g.d;
            case 3:
                return g.e;
            case 4:
                return g.f;
            case 5:
                return g.g;
            case 6:
                return g.h;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return g.i;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                return g.j;
            case 9:
                return g.b(new o(cVar.l()), g.k);
            case 10:
                return g.b(new o(cVar.c().size()), g.l);
            case 11:
                return g.b(g.a(g.o, a(cVar.i(), map)), g.n);
            case 12:
                return g.b(g.a(g.q, a(cVar.j(), map), g.i), g.p);
            case 13:
                ab abVar = new ab(cVar);
                g gVar = (g) map.get(abVar);
                if (gVar == null) {
                    g[] gVarArr = new g[cVar.b().size()];
                    g b = g.b(gVarArr);
                    map.put(abVar, b);
                    int length = gVarArr.length;
                    Iterator it = cVar.b().iterator();
                    int i = length;
                    while (it.hasNext()) {
                        i--;
                        gVarArr[i] = a(((com.flurry.a.a.a.m) it.next()).c(), map);
                    }
                    return b;
                }
                return gVar;
            case 14:
                List k = cVar.k();
                g[] gVarArr2 = new g[k.size()];
                String[] strArr = new String[k.size()];
                int i2 = 0;
                for (com.flurry.a.a.a.c cVar2 : cVar.k()) {
                    gVarArr2[i2] = a(cVar2, map);
                    strArr[i2] = cVar2.g();
                    i2++;
                }
                return g.b(g.a(gVarArr2, strArr), g.m);
            default:
                throw new RuntimeException("Unexpected schema type");
        }
    }
}
