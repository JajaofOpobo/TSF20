package com.ksmobile.p063a.p065b;
/* renamed from: com.ksmobile.a.b.c */
/* loaded from: classes.dex */
public class C1284c {

    /* renamed from: a */
    public static final boolean[] f4065a = new boolean[0];

    /* renamed from: b */
    public static final int[] f4066b = new int[0];

    /* renamed from: c */
    public static final long[] f4067c = new long[0];

    /* renamed from: d */
    public static final Object[] f4068d = new Object[0];

    /* renamed from: a */
    public static int m9121a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return i3 ^ (-1);
    }
}
