package com.flurry.a.a.a;

/* loaded from: classes.dex */
public enum ad {
    RECORD,
    ENUM,
    ARRAY,
    MAP,
    UNION,
    FIXED,
    STRING,
    BYTES,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BOOLEAN,
    NULL;

    private String o = name().toLowerCase();

    ad() {
    }

    public final String a() {
        return this.o;
    }
}
