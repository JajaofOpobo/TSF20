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
import com.tsf.extend.f;
import com.tsf.extend.theme.t;
import java.util.List;
/* loaded from: classes.dex */
public class q extends t {
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private int r;
    private List<b> s;

    public q(Context context, List<t.b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
        this.r = 0;
        this.s = Lists.newArrayList();
        int b2 = com.tsf.extend.base.j.p.b();
        n = context.getResources().getDimensionPixelSize(f.c.theme_category_ball_size);
        o = context.getResources().getDimensionPixelSize(f.c.theme_category_ball_margin);
        p = context.getResources().getDimensionPixelSize(f.c.theme_category_lable_height);
        q = context.getResources().getDimensionPixelSize(f.c.theme_category_lable_width);
        this.r = b2 / (n + o);
    }

    @Override // com.tsf.extend.theme.t, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(f.C0052f.theme_category_item, (ViewGroup) null);
            b bVar2 = new b();
            bVar2.e = (ImageView) view.findViewById(f.e.theme_category_img_left);
            bVar2.h = (ImageView) view.findViewById(f.e.theme_category_img_right);
            bVar2.f = (TextView) view.findViewById(f.e.theme_category_name_left);
            bVar2.i = (TextView) view.findViewById(f.e.theme_category_name_right);
            bVar2.a = (FrameLayout) view.findViewById(f.e.theme_color);
            bVar2.b = (LinearLayout) view.findViewById(f.e.theme_color_layout);
            bVar2.c = (LinearLayout) view.findViewById(f.e.theme_lable);
            bVar2.d = (FrameLayout) view.findViewById(f.e.theme_category_item_left);
            bVar2.g = (FrameLayout) view.findViewById(f.e.theme_category_item_right);
            bVar2.d.setOnClickListener(this.c);
            bVar2.g.setOnClickListener(this.c);
            view.setTag(bVar2);
            this.s.add(bVar2);
            bVar = bVar2;
        } else {
            bVar = (b) view.getTag();
        }
        t.b a2 = getItem(i);
        int size = a2.d().size();
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
                    childAt.setTag(a2.d().get(i2));
                    v.h().c(a2.d().get(i2).u(), this.d);
                } else if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
        } else {
            bVar.c.setVisibility(0);
            bVar.a.setVisibility(4);
            bVar.d.setTag(a2.a);
            bVar.e.setImageBitmap(null);
            v.h().a(a2.a.u(), (View) null, this.d, q, p);
            if (a2.c != null) {
                bVar.g.setVisibility(0);
                bVar.g.setTag(a2.c);
                bVar.h.setImageBitmap(null);
                v.h().a(a2.c.u(), (View) null, this.d, q, p);
            } else {
                bVar.g.setVisibility(4);
            }
        }
        return view;
    }

    @Override // com.tsf.extend.theme.t
    public void a() {
        super.a();
        this.s.clear();
    }

    @Override // com.tsf.extend.theme.t
    protected t.c b() {
        return new a();
    }

    /* loaded from: classes.dex */
    protected class a extends t.c {
        protected a() {
            super();
        }

        @Override // com.tsf.extend.theme.t.c
        protected void a(Pair<String, Bitmap> pair) {
            String str = (String) pair.first;
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty(str) && bitmap != null) {
                for (b bVar : q.this.s) {
                    if (bVar.d != null && bVar.d.getTag() != null && bVar.e != null) {
                        Object tag = bVar.d.getTag();
                        if ((tag instanceof k) && str.equals(((k) tag).u())) {
                            bVar.e.setImageBitmap(bitmap);
                            a(bVar.f, ((k) tag).i());
                        }
                    }
                    if (bVar.g != null && bVar.g.getTag() != null && bVar.h != null) {
                        Object tag2 = bVar.g.getTag();
                        if ((tag2 instanceof k) && str.equals(((k) tag2).u())) {
                            bVar.h.setImageBitmap(bitmap);
                            a(bVar.i, ((k) tag2).i());
                        }
                    }
                    if (bVar.b != null && bVar.b.getChildCount() > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 < bVar.b.getChildCount()) {
                                ImageView imageView = (ImageView) bVar.b.getChildAt(i2);
                                Object tag3 = imageView.getTag();
                                if (imageView != null && tag3 != null && (tag3 instanceof k) && str.equals(((k) tag3).u())) {
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

    /* loaded from: classes.dex */
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
