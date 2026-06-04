package com.flurry.a.b.a;

/* loaded from: classes.dex */
public enum f {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    WRITE_NUMBERS_AS_STRINGS(false),
    FLUSH_PASSED_TO_STREAM(true),
    ESCAPE_NON_ASCII(false);

    final boolean h;
    final int i = 1 << ordinal();

    public static int a() {
        int i = 0;
        for (f fVar : values()) {
            if (fVar.h) {
                i |= fVar.i;
            }
        }
        return i;
    }

    f(boolean z) {
        this.h = z;
    }

    public final int b() {
        return this.i;
    }
}
