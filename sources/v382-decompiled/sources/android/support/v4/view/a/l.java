package android.support.v4.view.a;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public class l {
    private static final m a;
    private final Object b;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new o();
        } else if (Build.VERSION.SDK_INT >= 16) {
            a = new n();
        } else {
            a = new p();
        }
    }

    public l() {
        this.b = a.a(this);
    }

    public l(Object obj) {
        this.b = obj;
    }

    public Object a() {
        return this.b;
    }

    public a a(int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public List a(String str, int i) {
        return null;
    }

    public a b(int i) {
        return null;
    }
}
