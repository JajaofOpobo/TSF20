package android.support.p002v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: android.support.v4.view.ac */
/* loaded from: classes.dex */
public abstract class AbstractC0299ac {

    /* renamed from: a */
    private final DataSetObservable f747a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f748b;

    /* renamed from: a */
    public abstract boolean mo7037a(View view, Object obj);

    /* renamed from: b */
    public abstract int mo938b();

    /* renamed from: a */
    public void mo12948a(ViewGroup viewGroup) {
        m12951a((View) viewGroup);
    }

    /* renamed from: a */
    public Object mo7036a(ViewGroup viewGroup, int i) {
        return m12950a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo7035a(ViewGroup viewGroup, int i, Object obj) {
        m12949a((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void mo12942b(ViewGroup viewGroup, int i, Object obj) {
        m12944b((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void mo12943b(ViewGroup viewGroup) {
        m12945b((View) viewGroup);
    }

    /* renamed from: a */
    public void m12951a(View view) {
    }

    /* renamed from: a */
    public Object m12950a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: a */
    public void m12949a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void m12944b(View view, int i, Object obj) {
    }

    /* renamed from: b */
    public void m12945b(View view) {
    }

    /* renamed from: a */
    public Parcelable mo12954a() {
        return null;
    }

    /* renamed from: a */
    public void mo12952a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public int m12947a(Object obj) {
        return -1;
    }

    /* renamed from: c */
    public void m12941c() {
        synchronized (this) {
            if (this.f748b != null) {
                this.f748b.onChanged();
            }
        }
        this.f747a.notifyChanged();
    }

    /* renamed from: a */
    public void m12953a(DataSetObserver dataSetObserver) {
        this.f747a.registerObserver(dataSetObserver);
    }

    /* renamed from: b */
    public void m12946b(DataSetObserver dataSetObserver) {
        this.f747a.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12940c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f748b = dataSetObserver;
        }
    }

    /* renamed from: c */
    public CharSequence mo989c(int i) {
        return null;
    }

    /* renamed from: d */
    public float mo7032d(int i) {
        return 1.0f;
    }
}
