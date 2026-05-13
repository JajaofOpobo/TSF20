package com.tsf.extend.base.widget.pulltorefresh;

import android.annotation.TargetApi;
import android.view.View;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
@TargetApi(9)
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.c */
/* loaded from: classes.dex */
public final class C1516c {
    /* renamed from: a */
    public static void m8342a(PullToRefreshBase<?> pullToRefreshBase, int i, int i2, int i3, int i4, boolean z) {
        m8343a(pullToRefreshBase, i, i2, i3, i4, 0, z);
    }

    /* renamed from: a */
    public static void m8343a(PullToRefreshBase<?> pullToRefreshBase, int i, int i2, int i3, int i4, int i5, boolean z) {
        m8344a(pullToRefreshBase, i, i2, i3, i4, i5, 0, 1.0f, z);
    }

    /* renamed from: a */
    public static void m8344a(PullToRefreshBase<?> pullToRefreshBase, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z) {
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
        if (pullToRefreshBase.m8404h() && !pullToRefreshBase.m8403i()) {
            PullToRefreshBase.EnumC1491b mode = pullToRefreshBase.getMode();
            if (mode.m8389b() && !z && i != 0) {
                int i7 = i + i2;
                if (i7 < 0 - i6) {
                    if (mode.m8388c()) {
                        if (scrollX == 0) {
                            pullToRefreshBase.m8415a(PullToRefreshBase.EnumC1499j.OVERSCROLLING, new boolean[0]);
                        }
                        pullToRefreshBase.setHeaderScroll((int) ((scrollX + i7) * f));
                    }
                } else if (i7 > i5 + i6) {
                    if (mode.m8387d()) {
                        if (scrollX == 0) {
                            pullToRefreshBase.m8415a(PullToRefreshBase.EnumC1499j.OVERSCROLLING, new boolean[0]);
                        }
                        pullToRefreshBase.setHeaderScroll((int) (((scrollX + i7) - i5) * f));
                    }
                } else if (Math.abs(i7) <= i6 || Math.abs(i7 - i5) <= i6) {
                    pullToRefreshBase.m8415a(PullToRefreshBase.EnumC1499j.RESET, new boolean[0]);
                }
            } else if (z && PullToRefreshBase.EnumC1499j.OVERSCROLLING == pullToRefreshBase.getState()) {
                pullToRefreshBase.m8415a(PullToRefreshBase.EnumC1499j.RESET, new boolean[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m8345a(View view) {
        return view.getOverScrollMode() != 2;
    }
}
