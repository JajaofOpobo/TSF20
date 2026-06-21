package android.support.v4.view.a;

import android.os.Build;

/* loaded from: classes.dex */
public class u {
    private static final x a;
    private final Object b;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new y();
            return;
        }
        if (Build.VERSION.SDK_INT >= 15) {
            a = new w();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new v();
        } else {
            a = new z();
        }
    }

    public u(Object obj) {
        this.b = obj;
    }

    public static u a() {
        return new u(a.a());
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    public void a(int i) {
        a.b(this.b, i);
    }

    public void b(int i) {
        a.a(this.b, i);
    }

    public void c(int i) {
        a.c(this.b, i);
    }

    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u uVar = (u) obj;
            return this.b == null ? uVar.b == null : this.b.equals(uVar.b);
        }
        return false;
    }
}
