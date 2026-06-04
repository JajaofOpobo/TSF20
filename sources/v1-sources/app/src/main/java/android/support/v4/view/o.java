package android.support.v4.view;

/* loaded from: classes.dex */
final class o implements q {
    o() {
    }

    private static int a(int i, int i2, int i3, int i4) {
        boolean z = (i2 & 1) != 0;
        int i5 = i3 | i4;
        boolean z2 = (i5 & 1) != 0;
        if (z) {
            if (z2) {
                throw new IllegalArgumentException("bad arguments");
            }
            return i & (i5 ^ (-1));
        }
        if (z2) {
            return i & (i2 ^ (-1));
        }
        return i;
    }

    private static int c(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    @Override // android.support.v4.view.q
    public final boolean a(int i) {
        return a(a(c(i) & 247, 1, 64, 128), 2, 16, 32) == 1;
    }

    @Override // android.support.v4.view.q
    public final boolean b(int i) {
        return (c(i) & 247) == 0;
    }
}
