package com.tsf.extend.base.widget.pulltorefresh;

import android.annotation.TargetApi;
import android.view.View;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
@TargetApi(9)
/* loaded from: classes.dex */
public final class c {
    public static void a(PullToRefreshBase<?> pullToRefreshBase, int i, int i2, int i3, int i4, boolean z) {
        a(pullToRefreshBase, i, i2, i3, i4, 0, z);
    }

    public static void a(PullToRefreshBase<?> pullToRefreshBase, int i, int i2, int i3, int i4, int i5, boolean z) {
        a(pullToRefreshBase, i, i2, i3, i4, i5, 0, 1.0f, z);
    }

    public static void a(PullToRefreshBase<?> pullToRefreshBase, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z) {
        int scrollX;
        switch (pullToRefreshBase.getPullToRefreshScrollDirection()) {
            case HORIZONTAL:
                scrollX = pullToRefreshBase.getScrollX();
                break;
            default:
                scrollX = pullToRefreshBase.getScrollY();
                i2 = i4;
                i = i3;
                break;
        }
        if (pullToRefreshBase.h() && !pullToRefreshBase.i()) {
            PullToRefreshBase.b mode = pullToRefreshBase.getMode();
            if (mode.b() && !z && i != 0) {
                int i7 = i + i2;
                if (i7 < 0 - i6) {
                    if (mode.c()) {
                        if (scrollX == 0) {
                            pullToRefreshBase.a(PullToRefreshBase.j.OVERSCROLLING, new boolean[0]);
                        }
                        pullToRefreshBase.setHeaderScroll((int) ((scrollX + i7) * f));
                    }
                } else if (i7 > i5 + i6) {
                    if (mode.d()) {
                        if (scrollX == 0) {
                            pullToRefreshBase.a(PullToRefreshBase.j.OVERSCROLLING, new boolean[0]);
                        }
                        pullToRefreshBase.setHeaderScroll((int) (((scrollX + i7) - i5) * f));
                    }
                } else if (Math.abs(i7) <= i6 || Math.abs(i7 - i5) <= i6) {
                    pullToRefreshBase.a(PullToRefreshBase.j.RESET, new boolean[0]);
                }
            } else if (z && PullToRefreshBase.j.OVERSCROLLING == pullToRefreshBase.getState()) {
                pullToRefreshBase.a(PullToRefreshBase.j.RESET, new boolean[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        return view.getOverScrollMode() != 2;
    }
}
