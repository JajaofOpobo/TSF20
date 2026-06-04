package com.flurry.a.a.a.c.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class q extends g {
    public final g z;

    /* synthetic */ q(g gVar, g[] gVarArr, byte b) {
        this(gVar, gVarArr);
    }

    @Override // com.flurry.a.a.a.c.a.g
    public final /* synthetic */ g a(Map map, Map map2) {
        q qVar = new q(this.z, new g[a(this.b, 1)]);
        a(this.b, 1, qVar.b, 1, map, map2);
        return qVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private q(g gVar, g... gVarArr) {
        super(r0, r1);
        p pVar = p.REPEATER;
        g[] gVarArr2 = new g[gVarArr.length + 1];
        System.arraycopy(gVarArr, 0, gVarArr2, 1, gVarArr.length);
        this.z = gVar;
        this.b[0] = this;
    }
}
