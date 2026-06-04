package com.flurry.a.b.a.d.h;

import java.util.StringTokenizer;

/* loaded from: classes.dex */
final class n extends StringTokenizer {
    protected final String a;
    protected int b;
    protected String c;

    public n(String str) {
        super(str, "<,>", true);
        this.a = str;
    }

    @Override // java.util.StringTokenizer
    public final boolean hasMoreTokens() {
        return this.c != null || super.hasMoreTokens();
    }

    @Override // java.util.StringTokenizer
    public final String nextToken() {
        String nextToken;
        if (this.c != null) {
            nextToken = this.c;
            this.c = null;
        } else {
            nextToken = super.nextToken();
        }
        this.b += nextToken.length();
        return nextToken;
    }

    public final void a(String str) {
        this.c = str;
        this.b -= str.length();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a.substring(this.b);
    }
}
