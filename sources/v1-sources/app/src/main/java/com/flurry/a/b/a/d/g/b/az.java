package com.flurry.a.b.a.d.g.b;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class az extends s {
    public static final az a = new az();

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* bridge */ /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        a((TimeZone) obj, eVar);
    }

    @Override // com.flurry.a.b.a.d.g.b.s, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        TimeZone timeZone = (TimeZone) obj;
        azVar.a(timeZone, eVar, TimeZone.class);
        a(timeZone, eVar);
        azVar.d(timeZone, eVar);
    }

    public az() {
        super(TimeZone.class);
    }

    private static void a(TimeZone timeZone, com.flurry.a.b.a.e eVar) {
        eVar.b(timeZone.getID());
    }
}
