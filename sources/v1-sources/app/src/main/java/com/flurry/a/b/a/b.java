package com.flurry.a.b.a;

/* loaded from: classes.dex */
public final class b {
    public static final a a = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
    public static final a b = new a(a, "MIME-NO-LINEFEEDS");
    public static final a c = new a(a, "PEM", true, '=', 64);
    public static final a d;

    static {
        StringBuffer stringBuffer = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        stringBuffer.setCharAt(stringBuffer.indexOf("+"), '-');
        stringBuffer.setCharAt(stringBuffer.indexOf("/"), '_');
        d = new a("MODIFIED-FOR-URL", stringBuffer.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static a a() {
        return b;
    }
}
