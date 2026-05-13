package com.tsf.extend.base.widget.pulltorefresh;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.f */
/* loaded from: classes.dex */
public class C1520f {
    /* renamed from: a */
    public static void m8338a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1521a.m8337a(view, runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    @TargetApi(16)
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.f$a */
    /* loaded from: classes.dex */
    static class C1521a {
        /* renamed from: a */
        public static void m8337a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }
    }
}
