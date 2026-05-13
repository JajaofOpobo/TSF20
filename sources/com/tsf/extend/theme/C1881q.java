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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.theme.C1887t;
import java.util.List;
/* renamed from: com.tsf.extend.theme.q */
/* loaded from: classes.dex */
public class C1881q extends C1887t {

    /* renamed from: n */
    private static int f6039n;

    /* renamed from: o */
    private static int f6040o;

    /* renamed from: p */
    private static int f6041p;

    /* renamed from: q */
    private static int f6042q;

    /* renamed from: r */
    private int f6043r;

    /* renamed from: s */
    private List<C1883b> f6044s;

    public C1881q(Context context, List<C1887t.C1890b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
        this.f6043r = 0;
        this.f6044s = Lists.newArrayList();
        int m8619b = C1437p.m8619b();
        f6039n = context.getResources().getDimensionPixelSize(C1536f.C1539c.theme_category_ball_size);
        f6040o = context.getResources().getDimensionPixelSize(C1536f.C1539c.theme_category_ball_margin);
        f6041p = context.getResources().getDimensionPixelSize(C1536f.C1539c.theme_category_lable_height);
        f6042q = context.getResources().getDimensionPixelSize(C1536f.C1539c.theme_category_lable_width);
        this.f6043r = m8619b / (f6039n + f6040o);
    }

    @Override // com.tsf.extend.theme.C1887t, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1883b c1883b;
        if (view == null) {
            view = LayoutInflater.from(this.f6060b).inflate(C1536f.C1542f.theme_category_item, (ViewGroup) null);
            C1883b c1883b2 = new C1883b();
            c1883b2.f6050e = (ImageView) view.findViewById(C1536f.C1541e.theme_category_img_left);
            c1883b2.f6053h = (ImageView) view.findViewById(C1536f.C1541e.theme_category_img_right);
            c1883b2.f6051f = (TextView) view.findViewById(C1536f.C1541e.theme_category_name_left);
            c1883b2.f6054i = (TextView) view.findViewById(C1536f.C1541e.theme_category_name_right);
            c1883b2.f6046a = (FrameLayout) view.findViewById(C1536f.C1541e.theme_color);
            c1883b2.f6047b = (LinearLayout) view.findViewById(C1536f.C1541e.theme_color_layout);
            c1883b2.f6048c = (LinearLayout) view.findViewById(C1536f.C1541e.theme_lable);
            c1883b2.f6049d = (FrameLayout) view.findViewById(C1536f.C1541e.theme_category_item_left);
            c1883b2.f6052g = (FrameLayout) view.findViewById(C1536f.C1541e.theme_category_item_right);
            c1883b2.f6049d.setOnClickListener(this.f6061c);
            c1883b2.f6052g.setOnClickListener(this.f6061c);
            view.setTag(c1883b2);
            this.f6044s.add(c1883b2);
            c1883b = c1883b2;
        } else {
            c1883b = (C1883b) view.getTag();
        }
        C1887t.C1890b a = getItem(i);
        int size = a.m7119d().size();
        if (size > 0) {
            c1883b.f6048c.setVisibility(4);
            c1883b.f6046a.setVisibility(0);
            for (int i2 = 0; i2 < size; i2++) {
                View childAt = c1883b.f6047b.getChildAt(i2);
                if (i2 < this.f6043r) {
                    if (childAt == null) {
                        childAt = new ImageView(this.f6060b);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6039n, f6039n);
                        layoutParams.leftMargin = f6040o;
                        c1883b.f6047b.addView(childAt, layoutParams);
                    }
                    childAt.setOnClickListener(this.f6061c);
                    childAt.setVisibility(0);
                    childAt.setTag(a.m7119d().get(i2));
                    C1894v.m7069h().m7079c(a.m7119d().get(i2).m7273u(), this.f6062d);
                } else if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
        } else {
            c1883b.f6048c.setVisibility(0);
            c1883b.f6046a.setVisibility(4);
            c1883b.f6049d.setTag(a.f6082a);
            c1883b.f6050e.setImageBitmap(null);
            C1894v.m7069h().m7094a(a.f6082a.m7273u(), (View) null, this.f6062d, f6042q, f6041p);
            if (a.f6084c != null) {
                c1883b.f6052g.setVisibility(0);
                c1883b.f6052g.setTag(a.f6084c);
                c1883b.f6053h.setImageBitmap(null);
                C1894v.m7069h().m7094a(a.f6084c.m7273u(), (View) null, this.f6062d, f6042q, f6041p);
            } else {
                c1883b.f6052g.setVisibility(4);
            }
        }
        return view;
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: a */
    public void mo7141a() {
        super.mo7141a();
        this.f6044s.clear();
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: b */
    protected C1887t.C1891c mo7130b() {
        return new C1882a();
    }

    /* renamed from: com.tsf.extend.theme.q$a */
    /* loaded from: classes.dex */
    protected class C1882a extends C1887t.C1891c {
        protected C1882a() {
            super();
        }

        @Override // com.tsf.extend.theme.C1887t.C1891c
        /* renamed from: a */
        protected void mo7117a(Pair<String, Bitmap> pair) {
            String str = (String) pair.first;
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty(str) && bitmap != null) {
                for (C1883b c1883b : C1881q.this.f6044s) {
                    if (c1883b.f6049d != null && c1883b.f6049d.getTag() != null && c1883b.f6050e != null) {
                        Object tag = c1883b.f6049d.getTag();
                        if ((tag instanceof C1848k) && str.equals(((C1848k) tag).m7273u())) {
                            c1883b.f6050e.setImageBitmap(bitmap);
                            m7147a(c1883b.f6051f, ((C1848k) tag).m7294i());
                        }
                    }
                    if (c1883b.f6052g != null && c1883b.f6052g.getTag() != null && c1883b.f6053h != null) {
                        Object tag2 = c1883b.f6052g.getTag();
                        if ((tag2 instanceof C1848k) && str.equals(((C1848k) tag2).m7273u())) {
                            c1883b.f6053h.setImageBitmap(bitmap);
                            m7147a(c1883b.f6054i, ((C1848k) tag2).m7294i());
                        }
                    }
                    if (c1883b.f6047b != null && c1883b.f6047b.getChildCount() > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 < c1883b.f6047b.getChildCount()) {
                                ImageView imageView = (ImageView) c1883b.f6047b.getChildAt(i2);
                                Object tag3 = imageView.getTag();
                                if (imageView != null && tag3 != null && (tag3 instanceof C1848k) && str.equals(((C1848k) tag3).m7273u())) {
                                    imageView.setImageBitmap(bitmap);
                                }
                                i = i2 + 1;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private void m7147a(TextView textView, String str) {
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

    /* renamed from: com.tsf.extend.theme.q$b */
    /* loaded from: classes.dex */
    public class C1883b {

        /* renamed from: a */
        public FrameLayout f6046a;

        /* renamed from: b */
        public LinearLayout f6047b;

        /* renamed from: c */
        public LinearLayout f6048c;

        /* renamed from: d */
        public FrameLayout f6049d;

        /* renamed from: e */
        public ImageView f6050e;

        /* renamed from: f */
        public TextView f6051f;

        /* renamed from: g */
        public FrameLayout f6052g;

        /* renamed from: h */
        public ImageView f6053h;

        /* renamed from: i */
        public TextView f6054i;

        public C1883b() {
        }
    }
}
