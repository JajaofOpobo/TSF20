package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class v {
    private DataSetObservable a = new DataSetObservable();

    public abstract boolean a(View view, Object obj);

    public abstract int c();

    public Object a(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void a(Object obj) {
    }

    public void a() {
    }

    public Parcelable b() {
        return null;
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final void d() {
        this.a.notifyChanged();
    }

    final void a(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    final void b(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
