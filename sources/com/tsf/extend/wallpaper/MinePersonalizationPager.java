package com.tsf.extend.wallpaper;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.view.PagerIndicator;
/* loaded from: classes.dex */
public class MinePersonalizationPager extends LinearLayout implements ViewPager.InterfaceC1464e, PagerIndicator.InterfaceC1473a {

    /* renamed from: a */
    private PersonalizationActivity f6209a;

    /* renamed from: b */
    private ViewPager f6210b;

    /* renamed from: c */
    private PagerIndicator f6211c;

    public MinePersonalizationPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6209a = (PersonalizationActivity) getContext();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6210b = (ViewPager) findViewById(C1536f.C1541e.viewpager);
        this.f6210b.setAdapter(new C1936a());
        this.f6210b.setOnPageChangeListener(this);
        this.f6211c = (PagerIndicator) findViewById(C1536f.C1541e.wallpaper_indicator);
        this.f6211c.setTextData(new String[]{getResources().getString(C1536f.C1543g.theme_mine_tab), getResources().getString(C1536f.C1543g.wallpaper_mine_tab)});
        this.f6211c.setOnPageClickedListener(this);
        setOnClickListener(null);
    }

    /* renamed from: com.tsf.extend.wallpaper.MinePersonalizationPager$a */
    /* loaded from: classes.dex */
    private class C1936a extends AbstractC1468a {

        /* renamed from: b */
        private LinearLayout.LayoutParams f6213b;

        /* renamed from: c */
        private SparseArray<View> f6214c;

        private C1936a() {
            this.f6213b = new LinearLayout.LayoutParams(-1, -1);
            this.f6214c = new SparseArray<>();
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            return 2;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public Object mo6710a(ViewGroup viewGroup, int i) {
            View view = this.f6214c.get(i);
            if (view == null) {
                switch (i) {
                    case 1:
                        view = new View$OnClickListenerC2071h(MinePersonalizationPager.this.f6209a);
                        break;
                }
                this.f6214c.put(i, view);
            }
            viewGroup.addView(view, this.f6213b);
            return view;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public boolean mo6711a(View view, Object obj) {
            return view == obj;
        }
    }

    @Override // com.tsf.extend.base.view.PagerIndicator.InterfaceC1473a
    /* renamed from: c */
    public void mo6720c(int i) {
        if (this.f6210b != null) {
            this.f6210b.m8552a(i, true);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: b */
    public void mo6723b(int i) {
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: a */
    public void mo6727a(int i, float f, int i2) {
        if (this.f6211c != null) {
            this.f6211c.m8482a(i, f, i2);
        }
    }

    @Override // com.tsf.extend.base.support.ViewPager.InterfaceC1464e
    /* renamed from: a */
    public void mo6728a(int i) {
        if (this.f6211c != null) {
            this.f6211c.m8484a(i);
        }
    }

    public void setCurrentIndex(int i) {
        this.f6210b.setCurrentItem(i);
    }
}
