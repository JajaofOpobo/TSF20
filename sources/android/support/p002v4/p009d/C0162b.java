package android.support.p002v4.p009d;
/* renamed from: android.support.v4.d.b */
/* loaded from: classes.dex */
class C0162b {

    /* renamed from: a */
    static final int[] f428a = new int[0];

    /* renamed from: b */
    static final long[] f429b = new long[0];

    /* renamed from: c */
    static final Object[] f430c = new Object[0];

    /* renamed from: a */
    public static int m13377a(int i) {
        return m13372c(i * 4) / 4;
    }

    /* renamed from: b */
    public static int m13373b(int i) {
        return m13372c(i * 8) / 8;
    }

    /* renamed from: c */
    public static int m13372c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m13376a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m13375a(int[] iArr, int i, int i2) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m13374a(long[] jArr, int i, long j) {
        int i2 = 0;
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i2 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ (-1);
    }
}
