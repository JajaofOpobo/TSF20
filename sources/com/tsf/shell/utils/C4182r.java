package com.tsf.shell.utils;

import android.content.Context;
/* renamed from: com.tsf.shell.utils.r */
/* loaded from: classes.dex */
public class C4182r {

    /* renamed from: a */
    public static int[] f13494a = new int[2];

    /* renamed from: a */
    public static int m632a(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static int m631a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }
}
