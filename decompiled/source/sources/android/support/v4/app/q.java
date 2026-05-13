package android.support.v4.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class q extends android.support.v4.view.ac {
    private final o a;
    private s b = null;
    private Fragment c = null;

    public abstract Fragment a(int i);

    public q(o oVar) {
        this.a = oVar;
    }

    @Override // android.support.v4.view.ac
    public void a(ViewGroup viewGroup) {
    }

    @Override // android.support.v4.view.ac
    public Object a(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        long b = b(i);
        Fragment a = this.a.a(a(viewGroup.getId(), b));
        if (a != null) {
            this.b.c(a);
        } else {
            a = a(i);
            this.b.a(viewGroup.getId(), a, a(viewGroup.getId(), b));
        }
        if (a != this.c) {
            a.d(false);
            a.e(false);
        }
        return a;
    }

    @Override // android.support.v4.view.ac
    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        this.b.b((Fragment) obj);
    }

    @Override // android.support.v4.view.ac
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.c) {
            if (this.c != null) {
                this.c.d(false);
                this.c.e(false);
            }
            if (fragment != null) {
                fragment.d(true);
                fragment.e(true);
            }
            this.c = fragment;
        }
    }

    @Override // android.support.v4.view.ac
    public void b(ViewGroup viewGroup) {
        if (this.b != null) {
            this.b.b();
            this.b = null;
            this.a.b();
        }
    }

    @Override // android.support.v4.view.ac
    public boolean a(View view, Object obj) {
        return ((Fragment) obj).p() == view;
    }

    @Override // android.support.v4.view.ac
    public Parcelable a() {
        return null;
    }

    @Override // android.support.v4.view.ac
    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public long b(int i) {
        return i;
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
