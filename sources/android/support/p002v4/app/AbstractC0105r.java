package android.support.p002v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.view.AbstractC0299ac;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* renamed from: android.support.v4.app.r */
/* loaded from: classes.dex */
public abstract class AbstractC0105r extends AbstractC0299ac {

    /* renamed from: a */
    private final AbstractC0094o f338a;

    /* renamed from: b */
    private AbstractC0106s f339b = null;

    /* renamed from: c */
    private ArrayList<Fragment.SavedState> f340c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<Fragment> f341d = new ArrayList<>();

    /* renamed from: e */
    private Fragment f342e = null;

    /* renamed from: a */
    public abstract Fragment mo990a(int i);

    public AbstractC0105r(AbstractC0094o abstractC0094o) {
        this.f338a = abstractC0094o;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public void mo12948a(ViewGroup viewGroup) {
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public Object mo7036a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f341d.size() <= i || (fragment = this.f341d.get(i)) == null) {
            if (this.f339b == null) {
                this.f339b = this.f338a.mo13569a();
            }
            Fragment mo990a = mo990a(i);
            if (this.f340c.size() > i && (savedState = this.f340c.get(i)) != null) {
                mo990a.m13769a(savedState);
            }
            while (this.f341d.size() <= i) {
                this.f341d.add(null);
            }
            mo990a.m13752d(false);
            mo990a.m13751e(false);
            this.f341d.set(i, mo990a);
            this.f339b.mo13497a(viewGroup.getId(), mo990a);
            return mo990a;
        }
        return fragment;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public void mo7035a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f339b == null) {
            this.f339b = this.f338a.mo13569a();
        }
        while (this.f340c.size() <= i) {
            this.f340c.add(null);
        }
        this.f340c.set(i, fragment.m13738m() ? this.f338a.mo13556a(fragment) : null);
        this.f341d.set(i, null);
        this.f339b.mo13495a(fragment);
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public void mo12942b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f342e) {
            if (this.f342e != null) {
                this.f342e.m13752d(false);
                this.f342e.m13751e(false);
            }
            if (fragment != null) {
                fragment.m13752d(true);
                fragment.m13751e(true);
            }
            this.f342e = fragment;
        }
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public void mo12943b(ViewGroup viewGroup) {
        if (this.f339b != null) {
            this.f339b.mo13493b();
            this.f339b = null;
            this.f338a.mo13540b();
        }
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public boolean mo7037a(View view, Object obj) {
        return ((Fragment) obj).m13735p() == view;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public Parcelable mo12954a() {
        Bundle bundle = null;
        if (this.f340c.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f340c.size()];
            this.f340c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        }
        Bundle bundle2 = bundle;
        for (int i = 0; i < this.f341d.size(); i++) {
            Fragment fragment = this.f341d.get(i);
            if (fragment != null && fragment.m13738m()) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                this.f338a.mo13559a(bundle2, "f" + i, fragment);
            }
        }
        return bundle2;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public void mo12952a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f340c.clear();
            this.f341d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f340c.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment mo13560a = this.f338a.mo13560a(bundle, str);
                    if (mo13560a != null) {
                        while (this.f341d.size() <= parseInt) {
                            this.f341d.add(null);
                        }
                        mo13560a.m13752d(false);
                        this.f341d.set(parseInt, mo13560a);
                    } else {
                        Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
