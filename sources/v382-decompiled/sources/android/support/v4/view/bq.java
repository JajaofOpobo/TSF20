package android.support.v4.view;

import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
class bq implements Comparator {
    bq() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(View view, View view2) {
        ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) view.getLayoutParams();
        ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view2.getLayoutParams();
        if (layoutParams.a != layoutParams2.a) {
            return layoutParams.a ? 1 : -1;
        }
        return layoutParams.e - layoutParams2.e;
    }
}
