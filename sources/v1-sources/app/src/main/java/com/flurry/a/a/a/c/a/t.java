package com.flurry.a.a.a.c.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class t extends g implements Iterable {
    /* synthetic */ t(g[] gVarArr, byte b) {
        this(gVarArr);
    }

    @Override // com.flurry.a.a.a.c.a.g
    public final /* synthetic */ g a(Map map, Map map2) {
        t tVar = (t) map.get(this);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(new g[a()]);
        map.put(this, tVar2);
        ArrayList<m> arrayList = new ArrayList();
        map2.put(tVar2, arrayList);
        a(this.b, 0, tVar2.b, 0, map, map2);
        for (m mVar : arrayList) {
            System.arraycopy(tVar2.b, 0, mVar.a, mVar.b, tVar2.b.length);
        }
        map2.remove(tVar2);
        return tVar2;
    }

    private t(g[] gVarArr) {
        super(p.SEQUENCE, gVarArr);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    @Override // com.flurry.a.a.a.c.a.g
    public final int a() {
        return a(this.b, 0);
    }
}
