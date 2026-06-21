package android.support.v4.g;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* loaded from: classes.dex */
public class a {
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

    public void a(int i, int i2) {
        b.a(this.a, i, i2);
    }

    public boolean a() {
        return b.a(this.a);
    }

    public void b() {
        b.b(this.a);
    }

    public boolean a(float f) {
        return b.a(this.a, f);
    }

    public boolean c() {
        return b.c(this.a);
    }

    public boolean a(Canvas canvas) {
        return b.a(this.a, canvas);
    }
}
