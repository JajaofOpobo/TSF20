package com.flurry.android;

import java.util.Map;

/* loaded from: classes.dex */
final class aq {
    final String a;
    final Map b;
    final di c;

    aq(String str, Map map, di diVar) {
        this.a = str;
        this.b = map;
        this.c = diVar;
    }

    public final String toString() {
        return "action=" + this.a + ",params=" + this.b + "," + this.c;
    }
}
