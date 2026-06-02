package android.support.v4.view;

import android.view.ViewGroup;

public class ViewPager extends ViewGroup {
    public interface e {
        void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);
        void onPageSelected(int position);
        void onPageScrollStateChanged(int state);
    }

    public ViewPager(android.content.Context context) {
        super(context);
    }
}
