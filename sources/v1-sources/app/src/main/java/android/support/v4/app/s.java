package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class s extends android.support.v4.view.v {
    private final l a;
    private v b = null;
    private ArrayList c = new ArrayList();
    private ArrayList d = new ArrayList();
    private Fragment e = null;

    public abstract Fragment a(int i);

    public s(l lVar) {
        this.a = lVar;
    }

    @Override // android.support.v4.view.v
    public final Object a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.d.size() <= i || (fragment = (Fragment) this.d.get(i)) == null) {
            if (this.b == null) {
                this.b = this.a.a();
            }
            Fragment a = a(i);
            if (this.c.size() > i && (savedState = (Fragment.SavedState) this.c.get(i)) != null) {
                a.a(savedState);
            }
            while (this.d.size() <= i) {
                this.d.add(null);
            }
            a.a(false);
            a.b(false);
            this.d.set(i, a);
            this.b.a(viewGroup.getId(), a);
            return a;
        }
        return fragment;
    }

    @Override // android.support.v4.view.v
    public void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.b == null) {
            this.b = this.a.a();
        }
        while (this.c.size() <= i) {
            this.c.add(null);
        }
        this.c.set(i, this.a.a(fragment));
        this.d.set(i, null);
        this.b.a(fragment);
    }

    @Override // android.support.v4.view.v
    public final void a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.e) {
            if (this.e != null) {
                this.e.a(false);
                this.e.b(false);
            }
            if (fragment != null) {
                fragment.a(true);
                fragment.b(true);
            }
            this.e = fragment;
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
        Bundle bundle = null;
        if (this.c.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.c.size()];
            this.c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        }
        Bundle bundle2 = bundle;
        for (int i = 0; i < this.d.size(); i++) {
            Fragment fragment = (Fragment) this.d.get(i);
            if (fragment != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                this.a.a(bundle2, "f" + i, fragment);
            }
        }
        return bundle2;
    }

    @Override // android.support.v4.view.v
    public final void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.c.clear();
            this.d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.c.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.a.a(bundle, str);
                    if (a != null) {
                        while (this.d.size() <= parseInt) {
                            this.d.add(null);
                        }
                        a.a(false);
                        this.d.set(parseInt, a);
                    } else {
                        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
