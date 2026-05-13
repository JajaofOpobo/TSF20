package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.flurry.sdk.dt */
/* loaded from: classes.dex */
public class C1217dt<T> {

    /* renamed from: a */
    private final List<WeakReference<T>> f3916a = new LinkedList();

    /* renamed from: a */
    public void m9362a(T t) {
        if (t != null) {
            this.f3916a.add(new WeakReference<>(t));
        }
    }

    /* renamed from: b */
    public boolean m9360b(T t) {
        if (t == null) {
            return false;
        }
        Iterator<WeakReference<T>> it = this.f3916a.iterator();
        while (it.hasNext()) {
            T t2 = it.next().get();
            if (t2 == null) {
                it.remove();
            } else if (t == t2 || t.equals(t2)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public List<T> m9363a() {
        ArrayList arrayList = new ArrayList(this.f3916a.size());
        Iterator<WeakReference<T>> it = this.f3916a.iterator();
        while (it.hasNext()) {
            T t = it.next().get();
            if (t == null) {
                it.remove();
            } else {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public int m9361b() {
        return this.f3916a.size();
    }
}
