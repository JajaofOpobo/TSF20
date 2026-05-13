package com.tsf.extend.base.widget.pulltorefresh;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class f {
    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.a(view, runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    @TargetApi(16)
    /* loaded from: classes.dex */
    static class a {
        public static void a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }
    }
}
