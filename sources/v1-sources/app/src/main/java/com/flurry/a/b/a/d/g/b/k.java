package com.flurry.a.b.a.d.g.b;

import java.net.InetAddress;

/* loaded from: classes.dex */
public final class k extends s {
    public static final k a = new k();

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* bridge */ /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        a((InetAddress) obj, eVar);
    }

    @Override // com.flurry.a.b.a.d.g.b.s, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        InetAddress inetAddress = (InetAddress) obj;
        azVar.a(inetAddress, eVar, InetAddress.class);
        a(inetAddress, eVar);
        azVar.d(inetAddress, eVar);
    }

    public k() {
        super(InetAddress.class);
    }

    private static void a(InetAddress inetAddress, com.flurry.a.b.a.e eVar) {
        String trim = inetAddress.toString().trim();
        int indexOf = trim.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                trim = trim.substring(1);
            } else {
                trim = trim.substring(0, indexOf);
            }
        }
        eVar.b(trim);
    }
}
