package com.flurry.a.a.a.c.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class h extends g {
    public final String[] A;
    public final g[] z;

    /* synthetic */ h(g[] gVarArr, String[] strArr, byte b) {
        this(gVarArr, strArr);
    }

    @Override // com.flurry.a.a.a.c.a.g
    public final /* synthetic */ g a(Map map, Map map2) {
        g[] gVarArr = new g[this.z.length];
        for (int i = 0; i < gVarArr.length; i++) {
            gVarArr[i] = this.z[i].a(map, map2);
        }
        return new h(gVarArr, this.A);
    }

    private h(g[] gVarArr, String[] strArr) {
        super(p.ALTERNATIVE);
        this.z = gVarArr;
        this.A = strArr;
    }

    public final g a(int i) {
        return this.z[i];
    }
}
