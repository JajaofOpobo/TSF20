package com.tsf.extend.base.actstru.model.a;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class a {
    private static a a;
    private final String b;
    private final boolean c;

    public static void a(String str) {
        a = new a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a() {
        if (a == null) {
            throw new IllegalStateException("You must initDefault for CalligraphyConfig, if you are going to use the CalligraphyContextWrapper");
        }
        return a;
    }

    private a(String str) {
        this.b = str;
        this.c = !TextUtils.isEmpty(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.c;
    }
}
