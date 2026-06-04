package com.flurry.a.b.a.d;

/* loaded from: classes.dex */
public enum at implements aj {
    USE_ANNOTATIONS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_FIELDS(true),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    WRITE_NULL_PROPERTIES(true),
    USE_STATIC_TYPING(false),
    DEFAULT_VIEW_INCLUSION(true),
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    FAIL_ON_EMPTY_BEANS(true),
    WRAP_EXCEPTIONS(true),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true);

    final boolean x;

    at(boolean z) {
        this.x = z;
    }

    @Override // com.flurry.a.b.a.d.aj
    public final boolean a() {
        return this.x;
    }

    @Override // com.flurry.a.b.a.d.aj
    public final int b() {
        return 1 << ordinal();
    }
}
