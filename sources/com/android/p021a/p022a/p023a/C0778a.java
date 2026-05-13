package com.android.p021a.p022a.p023a;
/* renamed from: com.android.a.a.a.a */
/* loaded from: classes.dex */
public class C0778a {

    /* renamed from: a */
    static final /* synthetic */ boolean f2244a;

    /* renamed from: b */
    private static final byte[] f2245b;

    /* renamed from: c */
    private static final byte[] f2246c;

    /* renamed from: d */
    private static final byte[] f2247d;

    /* renamed from: e */
    private static final byte[] f2248e;

    static {
        f2244a = !C0778a.class.desiredAssertionStatus();
        f2245b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2246c = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f2247d = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        f2248e = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private C0778a() {
    }

    /* renamed from: a */
    private static int m11048a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        if (bArr[i + 2] == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12)) >>> 16);
            return 1;
        } else if (bArr[i + 3] == 61) {
            int i3 = ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i + 2]] << 24) >>> 18);
            bArr2[i2] = (byte) (i3 >>> 16);
            bArr2[i2 + 1] = (byte) (i3 >>> 8);
            return 2;
        } else {
            int i4 = ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i + 2]] << 24) >>> 18) | ((bArr3[bArr[i + 3]] << 24) >>> 24);
            bArr2[i2] = (byte) (i4 >> 16);
            bArr2[i2 + 1] = (byte) (i4 >> 8);
            bArr2[i2 + 2] = (byte) i4;
            return 3;
        }
    }

    /* renamed from: a */
    public static byte[] m11051a(byte[] bArr) {
        return m11050a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static byte[] m11050a(byte[] bArr, int i, int i2) {
        return m11049a(bArr, i, i2, f2247d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (r2 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (r2 != 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
        throw new com.android.p021a.p022a.p023a.C0779b("single trailing character at offset " + (r14 - 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r0 = r2 + 1;
        r6[r2] = 61;
        r3 = r3 + m11048a(r6, 0, r5, r3, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
        r0 = new byte[r3];
        java.lang.System.arraycopy(r5, 0, r0, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
        return r0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m11049a(byte[] r12, int r13, int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p021a.p022a.p023a.C0778a.m11049a(byte[], int, int, byte[]):byte[]");
    }
}
