package android.support.p002v4.app;

import android.os.Parcelable;
import android.support.p002v4.view.AbstractC0299ac;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: android.support.v4.app.q */
/* loaded from: classes.dex */
public abstract class AbstractC0104q extends AbstractC0299ac {

    /* renamed from: a */
    private final AbstractC0094o f335a;

    /* renamed from: b */
    private AbstractC0106s f336b = null;

    /* renamed from: c */
    private Fragment f337c = null;

    /* renamed from: a */
    public abstract Fragment mo941a(int i);

    public AbstractC0104q(AbstractC0094o abstractC0094o) {
        this.f335a = abstractC0094o;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public void mo12948a(ViewGroup viewGroup) {
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public Object mo7036a(ViewGroup viewGroup, int i) {
        if (this.f336b == null) {
            this.f336b = this.f335a.mo13569a();
        }
        long m13499b = m13499b(i);
        Fragment mo13542a = this.f335a.mo13542a(m13500a(viewGroup.getId(), m13499b));
        if (mo13542a != null) {
            this.f336b.mo13491c(mo13542a);
        } else {
            mo13542a = mo941a(i);
            this.f336b.mo13496a(viewGroup.getId(), mo13542a, m13500a(viewGroup.getId(), m13499b));
        }
        if (mo13542a != this.f337c) {
            mo13542a.m13752d(false);
            mo13542a.m13751e(false);
        }
        return mo13542a;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public void mo7035a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f336b == null) {
            this.f336b = this.f335a.mo13569a();
        }
        this.f336b.mo13492b((Fragment) obj);
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public void mo12942b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f337c) {
            if (this.f337c != null) {
                this.f337c.m13752d(false);
                this.f337c.m13751e(false);
            }
            if (fragment != null) {
                fragment.m13752d(true);
                fragment.m13751e(true);
            }
            this.f337c = fragment;
        }
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public void mo12943b(ViewGroup viewGroup) {
        if (this.f336b != null) {
            this.f336b.mo13493b();
            this.f336b = null;
            this.f335a.mo13540b();
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
        return null;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: a */
    public void mo12952a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public long m13499b(int i) {
        return i;
    }

    /* renamed from: a */
    private static String m13500a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
