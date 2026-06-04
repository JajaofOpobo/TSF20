package com.flurry.android;

import android.content.Context;

/* loaded from: classes.dex */
abstract class az {
    static final String a = az.class.getSimpleName();
    private final Context b;
    private final s c;
    private final dl d;
    private final j e;

    public abstract void a();

    public az(Context context, s sVar, dl dlVar, j jVar) {
        this.b = context;
        this.c = sVar;
        this.d = dlVar;
        this.e = jVar;
    }

    public final Context b() {
        return this.b;
    }

    public final s c() {
        return this.c;
    }

    public final j d() {
        return this.e;
    }
}
