package com.flurry.sdk;

import java.util.Comparator;
/* renamed from: com.flurry.sdk.ee */
/* loaded from: classes.dex */
public class C1234ee implements Comparator<Runnable> {

    /* renamed from: a */
    private static final String f3961a = C1234ee.class.getSimpleName();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Runnable runnable, Runnable runnable2) {
        int m9295a = m9295a(runnable);
        int m9295a2 = m9295a(runnable2);
        if (m9295a < m9295a2) {
            return -1;
        }
        if (m9295a > m9295a2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private int m9295a(Runnable runnable) {
        int i;
        if (runnable == null) {
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof C1235ef) {
            AbstractC1279fg abstractC1279fg = (AbstractC1279fg) ((C1235ef) runnable).m9293a();
            if (abstractC1279fg == null) {
                i = Integer.MAX_VALUE;
            } else {
                i = abstractC1279fg.m9137i();
            }
            return i;
        } else if (runnable instanceof AbstractC1279fg) {
            return ((AbstractC1279fg) runnable).m9137i();
        } else {
            C1258eo.m9234a(6, f3961a, "Unknown runnable class: " + runnable.getClass().getName());
            return Integer.MAX_VALUE;
        }
    }
}
