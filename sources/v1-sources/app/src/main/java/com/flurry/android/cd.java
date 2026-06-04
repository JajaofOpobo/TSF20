package com.flurry.android;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class cd implements cc {
    private final List a;

    public cd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dk());
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // com.flurry.android.cc
    public final az a(Context context, s sVar, dl dlVar, j jVar) {
        az azVar = null;
        Iterator it = this.a.iterator();
        while (it.hasNext() && (azVar = ((cc) it.next()).a(context, sVar, dlVar, jVar)) == null) {
        }
        return azVar;
    }
}
