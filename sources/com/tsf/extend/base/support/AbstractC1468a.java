package com.tsf.extend.base.support;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.tsf.extend.base.support.a */
/* loaded from: classes.dex */
public abstract class AbstractC1468a {

    /* renamed from: a */
    private DataSetObservable f4537a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo6712a();

    /* renamed from: a */
    public abstract boolean mo6711a(View view, Object obj);

    /* renamed from: a */
    public void m8506a(ViewGroup viewGroup) {
        m8509a((View) viewGroup);
    }

    /* renamed from: a */
    public Object mo6710a(ViewGroup viewGroup, int i) {
        return m8508a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
        m8507a((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void m8499b(ViewGroup viewGroup, int i, Object obj) {
        m8501b((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void m8500b(ViewGroup viewGroup) {
        m8502b((View) viewGroup);
    }

    /* renamed from: a */
    public void m8509a(View view) {
    }

    /* renamed from: a */
    public Object m8508a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: a */
    public void m8507a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void m8501b(View view, int i, Object obj) {
    }

    /* renamed from: b */
    public void m8502b(View view) {
    }

    /* renamed from: b */
    public Parcelable m8504b() {
        return null;
    }

    /* renamed from: a */
    public void m8510a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public int m8505a(Object obj) {
        return -1;
    }

    /* renamed from: c */
    public void m8498c() {
        this.f4537a.notifyChanged();
    }

    /* renamed from: a */
    public void m8511a(DataSetObserver dataSetObserver) {
        this.f4537a.registerObserver(dataSetObserver);
    }

    /* renamed from: b */
    public void m8503b(DataSetObserver dataSetObserver) {
        this.f4537a.unregisterObserver(dataSetObserver);
    }

    /* renamed from: a */
    public float mo8176a(int i) {
        return 1.0f;
    }
}
