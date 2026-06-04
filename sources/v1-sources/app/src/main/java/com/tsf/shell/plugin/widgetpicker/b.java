package com.tsf.shell.plugin.widgetpicker;

import java.util.Comparator;

/* loaded from: classes.dex */
final class b implements Comparator {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((j) obj).b().compareToIgnoreCase(((j) obj2).b());
    }
}
