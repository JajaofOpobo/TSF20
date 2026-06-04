package com.flurry.android;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
final class di {
    final String a;
    final Map b;
    final Context c;
    final j d;
    final dl e;
    final int f;

    di(String str, Map map, Context context, j jVar, dl dlVar, int i) {
        this.a = str;
        this.b = map;
        this.c = context;
        this.d = jVar;
        this.e = dlVar;
        this.f = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("event=").append(this.a);
        sb.append(",params=").append(this.b);
        sb.append(",adspace=").append(this.d.b());
        return sb.toString();
    }
}
