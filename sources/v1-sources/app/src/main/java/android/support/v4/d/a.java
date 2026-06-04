package android.support.v4.d;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {
    private static final d b;
    private Object a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            b = new c();
        } else {
            b = new b();
        }
    }

    public a(Context context) {
        this.a = b.a(context);
    }

    public final void a(int i, int i2) {
        b.a(this.a, i, i2);
    }

    public final boolean a() {
        return b.a(this.a);
    }

    public final void b() {
        b.b(this.a);
    }

    public final boolean a(float f) {
        return b.a(this.a, f);
    }

    public final boolean c() {
        return b.c(this.a);
    }

    public final boolean a(Canvas canvas) {
        return b.a(this.a, canvas);
    }
}
