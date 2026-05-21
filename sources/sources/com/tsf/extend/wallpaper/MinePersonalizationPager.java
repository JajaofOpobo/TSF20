package com.tsf.extend.wallpaper;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PagerIndicator;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MinePersonalizationPager extends LinearLayout implements ViewPager.e, PagerIndicator.a {
    private PersonalizationActivity a;
    private ViewPager b;
    private PagerIndicator c;

    public MinePersonalizationPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = (PersonalizationActivity) getContext();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ViewPager) findViewById(f.e.viewpager);
        this.b.setAdapter(new a());
        this.b.setOnPageChangeListener(this);
        this.c = (PagerIndicator) findViewById(f.e.wallpaper_indicator);
        this.c.setTextData(new String[]{getResources().getString(f.g.theme_mine_tab), getResources().getString(f.g.wallpaper_mine_tab)});
        this.c.setOnPageClickedListener(this);
        setOnClickListener(null);
    }

    private class a extends com.tsf.extend.base.support.a {
        private LinearLayout.LayoutParams b;
        private SparseArray<View> c;

        private a() {
            this.b = new LinearLayout.LayoutParams(-1, -1);
            this.c = new SparseArray<>();
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            return 2;
        }

        @Override // com.tsf.extend.base.support.a
        public Object a(ViewGroup viewGroup, int i) {
            View hVar = this.c.get(i);
            if (hVar == null) {
                switch (i) {
                    case 1:
                        hVar = new h(MinePersonalizationPager.this.a);
                        break;
                }
                this.c.put(i, hVar);
            }
            viewGroup.addView(hVar, this.b);
            return hVar;
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }
    }

    @Override // com.tsf.extend.base.view.PagerIndicator.a
    public void c(int i) {
        if (this.b != null) {
            this.b.a(i, true);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void b(int i) {
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void a(int i, float f, int i2) {
        if (this.c != null) {
            this.c.a(i, f, i2);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.e
    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void setCurrentIndex(int i) {
        this.b.setCurrentItem(i);
    }
}
