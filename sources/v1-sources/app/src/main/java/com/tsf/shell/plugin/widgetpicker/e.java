package com.tsf.shell.plugin.widgetpicker;

import java.util.Comparator;

/* loaded from: classes.dex */
final class e implements Comparator {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((j) obj).b().compareToIgnoreCase(((j) obj2).b());
    }
}
