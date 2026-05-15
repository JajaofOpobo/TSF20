package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class r extends android.support.v4.view.ac {
    private final o a;
    private s b = null;
    private ArrayList<Fragment.SavedState> c = new ArrayList<>();
    private ArrayList<Fragment> d = new ArrayList<>();
    private Fragment e = null;

    public abstract Fragment a(int i);

    public r(o oVar) {
        this.a = oVar;
    }

    @Override // android.support.v4.view.ac
    public void a(ViewGroup viewGroup) {
    }

    @Override // android.support.v4.view.ac
    public Object a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.d.size() <= i || (fragment = this.d.get(i)) == null) {
            if (this.b == null) {
                this.b = this.a.a();
            }
            Fragment fragmentA = a(i);
            if (this.c.size() > i && (savedState = this.c.get(i)) != null) {
                fragmentA.a(savedState);
            }
            while (this.d.size() <= i) {
                this.d.add(null);
            }
            fragmentA.d(false);
            fragmentA.e(false);
            this.d.set(i, fragmentA);
            this.b.a(viewGroup.getId(), fragmentA);
            return fragmentA;
        }
        return fragment;
    }

    @Override // android.support.v4.view.ac
    public void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.b == null) {
            this.b = this.a.a();
        }
        while (this.c.size() <= i) {
            this.c.add(null);
        }
        this.c.set(i, fragment.m() ? this.a.a(fragment) : null);
        this.d.set(i, null);
        this.b.a(fragment);
    }

    @Override // android.support.v4.view.ac
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.e) {
            if (this.e != null) {
                this.e.d(false);
                this.e.e(false);
            }
            if (fragment != null) {
                fragment.d(true);
                fragment.e(true);
            }
            this.e = fragment;
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
        Bundle bundle = null;
        if (this.c.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.c.size()];
            this.c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        }
        Bundle bundle2 = bundle;
        for (int i = 0; i < this.d.size(); i++) {
            Fragment fragment = this.d.get(i);
            if (fragment != null && fragment.m()) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                this.a.a(bundle2, "f" + i, fragment);
            }
        }
        return bundle2;
    }

    @Override // android.support.v4.view.ac
    public void a(Parcelable parcelable, ClassLoader classLoader) {
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
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentA = this.a.a(bundle, str);
                    if (fragmentA != null) {
                        while (this.d.size() <= i) {
                            this.d.add(null);
                        }
                        fragmentA.d(false);
                        this.d.set(i, fragmentA);
                    } else {
                        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
