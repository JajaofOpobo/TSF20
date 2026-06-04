package com.flurry.a.b.a;

/* loaded from: classes.dex */
public enum o {
    NOT_AVAILABLE(null),
    START_OBJECT("{"),
    END_OBJECT("}"),
    START_ARRAY("["),
    END_ARRAY("]"),
    FIELD_NAME(null),
    VALUE_EMBEDDED_OBJECT(null),
    VALUE_STRING(null),
    VALUE_NUMBER_INT(null),
    VALUE_NUMBER_FLOAT(null),
    VALUE_TRUE("true"),
    VALUE_FALSE("false"),
    VALUE_NULL("null");

    final String n;
    final char[] o;
    final byte[] p;

    o(String str) {
        if (str == null) {
            this.n = null;
            this.o = null;
            this.p = null;
            return;
        }
        this.n = str;
        this.o = str.toCharArray();
        int length = this.o.length;
        this.p = new byte[length];
        for (int i = 0; i < length; i++) {
            this.p[i] = (byte) this.o[i];
        }
    }

    public final String a() {
        return this.n;
    }

    public final char[] b() {
        return this.o;
    }

    public final boolean c() {
        return this == VALUE_NUMBER_INT || this == VALUE_NUMBER_FLOAT;
    }

    public final boolean d() {
        return ordinal() >= VALUE_EMBEDDED_OBJECT.ordinal();
    }
}
