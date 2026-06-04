package com.flurry.a.b.a.d.b.b;

import java.util.Locale;

/* loaded from: classes.dex */
public final class r extends n {
    @Override // com.flurry.a.b.a.d.b.b.n
    protected final /* synthetic */ Object a(String str) {
        int indexOf = str.indexOf(95);
        if (indexOf < 0) {
            return new Locale(str);
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        int indexOf2 = substring2.indexOf(95);
        return indexOf2 < 0 ? new Locale(substring, substring2) : new Locale(substring, substring2.substring(0, indexOf2), substring2.substring(indexOf2 + 1));
    }

    public r() {
        super(Locale.class);
    }
}
