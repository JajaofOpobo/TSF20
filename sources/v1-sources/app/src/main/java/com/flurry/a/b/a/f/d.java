package com.flurry.a.b.a.f;

/* loaded from: classes.dex */
final class d {
    private final String a;
    private final d b;

    public d(String str, d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final String a() {
        return this.a;
    }

    public final d b() {
        return this.b;
    }

    public final String a(char[] cArr, int i, int i2) {
        String str = this.a;
        d dVar = this.b;
        while (true) {
            if (str.length() == i2) {
                int i3 = 0;
                while (str.charAt(i3) == cArr[i + i3] && (i3 = i3 + 1) < i2) {
                }
                if (i3 == i2) {
                    return str;
                }
            }
            if (dVar != null) {
                str = dVar.a;
                dVar = dVar.b;
            } else {
                return null;
            }
        }
    }
}
