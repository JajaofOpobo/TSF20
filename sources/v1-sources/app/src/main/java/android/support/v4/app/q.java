package android.support.v4.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class q extends android.support.v4.view.v {
    private final l a;
    private v b = null;
    private Fragment c = null;

    public abstract Fragment a(int i);

    public q(l lVar) {
        this.a = lVar;
    }

    @Override // android.support.v4.view.v
    public final Object a(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        long j = i;
        Fragment a = this.a.a(a(viewGroup.getId(), j));
        if (a != null) {
            this.b.c(a);
        } else {
            a = a(i);
            this.b.a(viewGroup.getId(), a, a(viewGroup.getId(), j));
        }
        if (a != this.c) {
            a.a(false);
            a.b(false);
        }
        return a;
    }

    @Override // android.support.v4.view.v
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        this.b.b((Fragment) obj);
    }

    @Override // android.support.v4.view.v
    public final void a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.c) {
            if (this.c != null) {
                this.c.a(false);
                this.c.b(false);
            }
            if (fragment != null) {
                fragment.a(true);
                fragment.b(true);
            }
            this.c = fragment;
        }
    }

    @Override // android.support.v4.view.v
    public final void a() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
            this.a.b();
        }
    }

    @Override // android.support.v4.view.v
    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).m() == view;
    }

    @Override // android.support.v4.view.v
    public final Parcelable b() {
        return null;
    }

    @Override // android.support.v4.view.v
    public final void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
