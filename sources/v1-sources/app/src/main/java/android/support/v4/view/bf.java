package android.support.v4.view;

import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
final class bf implements Comparator {
    bf() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) ((View) obj).getLayoutParams();
        ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) ((View) obj2).getLayoutParams();
        return layoutParams.a != layoutParams2.a ? layoutParams.a ? 1 : -1 : layoutParams.e - layoutParams2.e;
    }
}
