package com.flurry.a.b.a.d.g.b;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public final class at {
    protected static final com.flurry.a.b.a.d.ac a = new as();
    protected static final com.flurry.a.b.a.d.ac b = new aw();

    public static com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.g.a aVar) {
        if (aVar == null) {
            return a;
        }
        Class p = aVar.p();
        if (p == String.class) {
            return b;
        }
        if (p == Object.class) {
            return a;
        }
        if (Date.class.isAssignableFrom(p)) {
            return av.a;
        }
        if (Calendar.class.isAssignableFrom(p)) {
            return au.a;
        }
        return a;
    }
}
