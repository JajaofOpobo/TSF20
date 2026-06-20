package com.tsf.extend.base.actstru.model.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CalligraphyConfig {
    private static CalligraphyConfig a;
    private final String b;
    private final boolean c;

    public static void a(String str) {
        a = new CalligraphyConfig(str);
    }

    static CalligraphyConfig a() {
        if (a == null) {
            throw new IllegalStateException("You must initDefault for CalligraphyConfig, if you are going to use the CalligraphyContextWrapper");
        }
        return a;
    }

    private CalligraphyConfig(String str) {
        this.b = str;
        this.c = !TextUtils.isEmpty(str);
    }

    String b() {
        return this.b;
    }

    boolean c() {
        return this.c;
    }
}
