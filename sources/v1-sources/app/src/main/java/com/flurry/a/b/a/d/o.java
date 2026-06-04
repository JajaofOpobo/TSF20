package com.flurry.a.b.a.d;

/* loaded from: classes.dex */
public enum o implements aj {
    USE_ANNOTATIONS(true),
    AUTO_DETECT_SETTERS(true),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    USE_GETTERS_AS_SETTERS(true),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    USE_BIG_DECIMAL_FOR_FLOATS(false),
    USE_BIG_INTEGER_FOR_INTS(false),
    USE_JAVA_ARRAY_FOR_JSON_ARRAY(false),
    READ_ENUMS_USING_TO_STRING(false),
    FAIL_ON_UNKNOWN_PROPERTIES(true),
    FAIL_ON_NULL_FOR_PRIMITIVES(false),
    FAIL_ON_NUMBERS_FOR_ENUMS(false),
    WRAP_EXCEPTIONS(true),
    ACCEPT_SINGLE_VALUE_AS_ARRAY(false),
    UNWRAP_ROOT_VALUE(false),
    ACCEPT_EMPTY_STRING_AS_NULL_OBJECT(false);

    final boolean r;

    o(boolean z) {
        this.r = z;
    }

    @Override // com.flurry.a.b.a.d.aj
    public final boolean a() {
        return this.r;
    }

    @Override // com.flurry.a.b.a.d.aj
    public final int b() {
        return 1 << ordinal();
    }
}
