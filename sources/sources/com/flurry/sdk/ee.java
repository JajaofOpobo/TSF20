package com.flurry.sdk;

import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ee implements Comparator<Runnable> {
    private static final String a = ee.class.getSimpleName();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Runnable runnable, Runnable runnable2) {
        int iA = a(runnable);
        int iA2 = a(runnable2);
        if (iA < iA2) {
            return -1;
        }
        if (iA > iA2) {
            return 1;
        }
        return 0;
    }

    private int a(Runnable runnable) {
        int i;
        if (runnable == null) {
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof ef) {
            fg fgVar = (fg) ((ef) runnable).a();
            if (fgVar == null) {
                i = Integer.MAX_VALUE;
            } else {
                i = fgVar.i();
            }
            return i;
        }
        if (runnable instanceof fg) {
            return ((fg) runnable).i();
        }
        eo.a(6, a, "Unknown runnable class: " + runnable.getClass().getName());
        return Integer.MAX_VALUE;
    }
}
