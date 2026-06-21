package android.support.v4.b;

/* loaded from: classes.dex */
public class a {
    public static int a(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (16777215 & i) | (i2 << 24);
    }
}
