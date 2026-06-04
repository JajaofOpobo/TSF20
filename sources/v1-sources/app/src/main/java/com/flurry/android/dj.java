package com.flurry.android;

/* loaded from: classes.dex */
final class dj {
    static dl a(s sVar, String str) {
        long e = sVar.e();
        sVar.g();
        dl dlVar = new dl(e, str);
        sVar.a(dlVar);
        return dlVar;
    }

    static a a(i iVar) {
        return new a(iVar.c().intValue(), iVar.b().intValue(), iVar.e().toString(), iVar.d().toString(), iVar.f().toString());
    }
}
