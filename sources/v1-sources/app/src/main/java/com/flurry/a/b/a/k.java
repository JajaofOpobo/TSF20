package com.flurry.a.b.a;

/* loaded from: classes.dex */
public enum k {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    INTERN_FIELD_NAMES(true),
    CANONICALIZE_FIELD_NAMES(true);

    final boolean k;

    public static int a() {
        int i = 0;
        for (k kVar : values()) {
            if (kVar.k) {
                i |= 1 << kVar.ordinal();
            }
        }
        return i;
    }

    k(boolean z) {
        this.k = z;
    }

    public final int b() {
        return 1 << ordinal();
    }
}
