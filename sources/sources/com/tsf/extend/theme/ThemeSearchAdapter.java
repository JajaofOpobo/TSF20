package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.theme.ThemeBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeSearchAdapter extends ThemeBaseAdapter {
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private int r;
    private List<b> s;

    public ThemeSearchAdapter(Context context, List<ThemeBaseAdapter.b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
        this.r = 0;
        this.s = Lists.newArrayList();
        int iB = com.tsf.extend.base.j.StorageUtils.b();
        n = context.getResources().getDimensionPixelSize(ResourceIds.c.theme_category_ball_size);
        o = context.getResources().getDimensionPixelSize(ResourceIds.c.theme_category_ball_margin);
        p = context.getResources().getDimensionPixelSize(ResourceIds.c.theme_category_lable_height);
        q = context.getResources().getDimensionPixelSize(ResourceIds.c.theme_category_lable_width);
        this.r = iB / (n + o);
    }

    @Override // com.tsf.extend.theme.ThemeBaseAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        B bVar;
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(ResourceIds.C0052f.theme_category_item, (ViewGroup) null);
            B bVar2 = new B();
            bVar2.e = (ImageView) view.findViewById(ResourceIds.e.theme_category_img_left);
            bVar2.h = (ImageView) view.findViewById(ResourceIds.e.theme_category_img_right);
            bVar2.f = (TextView) view.findViewById(ResourceIds.e.theme_category_name_left);
            bVar2.i = (TextView) view.findViewById(ResourceIds.e.theme_category_name_right);
            bVar2.a = (FrameLayout) view.findViewById(ResourceIds.e.theme_color);
            bVar2.b = (LinearLayout) view.findViewById(ResourceIds.e.theme_color_layout);
            bVar2.c = (LinearLayout) view.findViewById(ResourceIds.e.theme_lable);
            bVar2.d = (FrameLayout) view.findViewById(ResourceIds.e.theme_category_item_left);
            bVar2.g = (FrameLayout) view.findViewById(ResourceIds.e.theme_category_item_right);
            bVar2.d.setOnClickListener(this.c);
            bVar2.g.setOnClickListener(this.c);
            view.setTag(bVar2);
            this.s.add(bVar2);
            bVar = bVar2;
        } else {
            bVar = (B) view.getTag();
        }
        ThemeBaseAdapter.b bVarA = getItem(i);
        int size = bVarA.d().size();
        if (size > 0) {
            bVar.c.setVisibility(4);
            bVar.a.setVisibility(0);
            for (int i2 = 0; i2 < size; i2++) {
                View childAt = bVar.b.getChildAt(i2);
                if (i2 < this.r) {
                    if (childAt == null) {
                        childAt = new ImageView(this.b);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n, n);
                        layoutParams.leftMargin = o;
                        bVar.b.addView(childAt, layoutParams);
                    }
                    childAt.setOnClickListener(this.c);
                    childAt.setVisibility(0);
                    childAt.setTag(bVarA.d().get(i2));
                    ThemeDataProvider.h().c(bVarA.d().get(i2).u(), this.d);
                } else if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
        } else {
            bVar.c.setVisibility(0);
            bVar.a.setVisibility(4);
            bVar.d.setTag(bVarA.a);
            bVar.e.setImageBitmap(null);
            ThemeDataProvider.h().a(bVarA.a.u(), (View) null, this.d, q, p);
            if (bVarA.c != null) {
                bVar.g.setVisibility(0);
                bVar.g.setTag(bVarA.c);
                bVar.h.setImageBitmap(null);
                ThemeDataProvider.h().a(bVarA.c.u(), (View) null, this.d, q, p);
            } else {
                bVar.g.setVisibility(4);
            }
        }
        return view;
    }

    @Override // com.tsf.extend.theme.ThemeBaseAdapter
    public void a() {
        super.a();
        this.s.clear();
    }

    @Override // com.tsf.extend.theme.ThemeBaseAdapter
    protected C b() {
        return new A();
    }

    protected class A extends ThemeCategoryListModel {
        protected A() {
            super();
        }

        @Override // com.tsf.extend.theme.ThemeBaseAdapter.c
        protected void a(Pair<String, Bitmap> pair) {
            String str = (String) pair.first;
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty(str) && bitmap != null) {
                for (B bVar : q.this.s) {
                    if (bVar.d != null && bVar.d.getTag() != null && bVar.e != null) {
                        Object tag = bVar.d.getTag();
                        if ((tag instanceof ThemeModel) && str.equals(((ThemeModel) tag).u())) {
                            bVar.e.setImageBitmap(bitmap);
                            a(bVar.f, ((ThemeModel) tag).i());
                        }
                    }
                    if (bVar.g != null && bVar.g.getTag() != null && bVar.h != null) {
                        Object tag2 = bVar.g.getTag();
                        if ((tag2 instanceof ThemeModel) && str.equals(((ThemeModel) tag2).u())) {
                            bVar.h.setImageBitmap(bitmap);
                            a(bVar.i, ((ThemeModel) tag2).i());
                        }
                    }
                    if (bVar.b != null && bVar.b.getChildCount() > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 < bVar.b.getChildCount()) {
                                ImageView imageView = (ImageView) bVar.b.getChildAt(i2);
                                Object tag3 = imageView.getTag();
                                if (imageView != null && tag3 != null && (tag3 instanceof ThemeModel) && str.equals(((ThemeModel) tag3).u())) {
                                    imageView.setImageBitmap(bitmap);
                                }
                                i = i2 + 1;
                            }
                        }
                    }
                }
            }
        }

        private void a(TextView textView, String str) {
            if (textView != null && str != null) {
                int length = str.length();
                if (length > 15) {
                    textView.setTextSize(15.0f);
                    if (length > 17) {
                        str = str.substring(0, 17);
                    }
                } else {
                    textView.setTextSize(18.0f);
                }
                textView.setText(str);
            }
        }
    }

    public class b {
        public FrameLayout a;
        public LinearLayout b;
        public LinearLayout c;
        public FrameLayout d;
        public ImageView e;
        public TextView f;
        public FrameLayout g;
        public ImageView h;
        public TextView i;

        public b() {
        }
    }
}
