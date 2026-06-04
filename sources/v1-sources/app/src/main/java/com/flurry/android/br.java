package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class br {
    private final j a;
    private final String b;

    public abstract void a(Context context, ViewGroup viewGroup);

    public br(j jVar) {
        this.a = jVar;
        this.b = jVar != null ? jVar.b().toString() : null;
    }

    public final j a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
