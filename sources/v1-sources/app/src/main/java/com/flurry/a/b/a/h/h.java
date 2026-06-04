package com.flurry.a.b.a.h;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements com.flurry.a.b.a.b.a {
    static final String a;
    static final char[] b;

    static {
        String str = null;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable th) {
        }
        if (str == null) {
            str = "\n";
        }
        a = str;
        char[] cArr = new char[64];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    @Override // com.flurry.a.b.a.b.a
    public final boolean a() {
        return false;
    }

    @Override // com.flurry.a.b.a.b.a
    public final void a(com.flurry.a.b.a.e eVar, int i) {
        eVar.c(a);
        int i2 = i + i;
        while (i2 > 64) {
            eVar.a(b, 64);
            i2 -= b.length;
        }
        eVar.a(b, i2);
    }
}
