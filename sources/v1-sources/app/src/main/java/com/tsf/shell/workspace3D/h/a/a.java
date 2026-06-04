package com.tsf.shell.workspace3D.h.a;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    public static Comparator a;
    public static Comparator b;
    public static Comparator c;
    public static Comparator d;
    private static Collator e;

    public static void a() {
        e = Collator.getInstance(Locale.getDefault());
        a = new b();
        b = new c();
        c = new d();
        a(com.tsf.shell.a.t.O());
    }

    public static void a(int i) {
        switch (i) {
            case 0:
                d = a;
                break;
            case 1:
                d = c;
                break;
            case 2:
                d = b;
                break;
            default:
                d = a;
                break;
        }
    }
}
