package android.support.v4.view.a;

import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    private static final g a;
    private final Object b;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new h();
        } else {
            a = new j();
        }
    }

    public f() {
        this.b = a.a(this);
    }

    public f(Object obj) {
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public static a b() {
        return null;
    }

    public static boolean c() {
        return false;
    }

    public static List d() {
        return null;
    }
}
