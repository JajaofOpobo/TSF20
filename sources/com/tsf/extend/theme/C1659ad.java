package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.wallpaper.C2035ab;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.ad */
/* loaded from: classes.dex */
public class C1659ad extends BaseAdapter {

    /* renamed from: a */
    private List<C1667c> f5315a = Lists.newArrayList();

    /* renamed from: b */
    private C1665a f5316b = new C1665a();

    /* renamed from: c */
    private View.OnClickListener f5317c;

    /* renamed from: d */
    private View$OnClickListenerC2040ad.C2044a f5318d;

    /* renamed from: e */
    private int f5319e;

    /* renamed from: f */
    private int f5320f;

    /* renamed from: g */
    private Context f5321g;

    /* renamed from: h */
    private List<C1848k> f5322h;

    /* renamed from: com.tsf.extend.theme.ad$b */
    /* loaded from: classes.dex */
    public static class C1666b {

        /* renamed from: a */
        View f5334a;

        /* renamed from: b */
        View f5335b;

        /* renamed from: c */
        ImageView f5336c;

        /* renamed from: d */
        TextView f5337d;
    }

    /* renamed from: com.tsf.extend.theme.ad$c */
    /* loaded from: classes.dex */
    public static class C1667c {

        /* renamed from: a */
        public C1666b f5338a = new C1666b();

        /* renamed from: b */
        public C1666b f5339b = new C1666b();

        /* renamed from: c */
        public C1666b f5340c = new C1666b();
    }

    public C1659ad(Context context) {
        this.f5321g = context;
    }

    /* renamed from: a */
    public void m7908a(View.OnClickListener onClickListener) {
        this.f5317c = onClickListener;
    }

    /* renamed from: a */
    public void m7911a(int i, int i2) {
        this.f5319e = i;
        this.f5320f = i2;
    }

    /* renamed from: a */
    public void m7900a(View$OnClickListenerC2040ad.C2044a c2044a) {
        this.f5318d = c2044a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<C1848k> m7913a = m7913a();
        int size = m7913a == null ? 0 : m7913a.size();
        return (size / 3) + (size % 3 != 0 ? 1 : 0);
    }

    /* renamed from: a */
    public View m7909a(int i, C1848k c1848k, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C1536f.C1542f.theme_mine_item, (ViewGroup) null);
    }

    /* renamed from: a */
    public C1667c m7907a(View view) {
        C1667c c1667c = new C1667c();
        c1667c.f5338a.f5334a = view.findViewById(C1536f.C1541e.left_layout);
        c1667c.f5338a.f5336c = (ImageView) view.findViewById(C1536f.C1541e.theme_img_left);
        c1667c.f5338a.f5337d = (TextView) view.findViewById(C1536f.C1541e.theme_name_left);
        c1667c.f5338a.f5335b = view.findViewById(C1536f.C1541e.theme_using_left);
        if (this.f5317c != null) {
            c1667c.f5338a.f5334a.setOnClickListener(this.f5317c);
        }
        m7897b(c1667c.f5338a.f5334a);
        c1667c.f5339b.f5334a = view.findViewById(C1536f.C1541e.center_layout);
        c1667c.f5339b.f5336c = (ImageView) view.findViewById(C1536f.C1541e.theme_img_center);
        c1667c.f5339b.f5337d = (TextView) view.findViewById(C1536f.C1541e.theme_name_center);
        c1667c.f5339b.f5335b = view.findViewById(C1536f.C1541e.theme_using_center);
        if (this.f5317c != null) {
            c1667c.f5339b.f5334a.setOnClickListener(this.f5317c);
        }
        m7897b(c1667c.f5339b.f5334a);
        c1667c.f5340c.f5334a = view.findViewById(C1536f.C1541e.right_layout);
        c1667c.f5340c.f5336c = (ImageView) view.findViewById(C1536f.C1541e.theme_img_right);
        c1667c.f5340c.f5337d = (TextView) view.findViewById(C1536f.C1541e.theme_name_right);
        c1667c.f5340c.f5335b = view.findViewById(C1536f.C1541e.theme_using_right);
        if (this.f5317c != null) {
            c1667c.f5340c.f5334a.setOnClickListener(this.f5317c);
        }
        m7897b(c1667c.f5340c.f5334a);
        LinearLayout linearLayout = (LinearLayout) view;
        if (Build.VERSION.SDK_INT >= 11) {
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(this.f5318d);
        }
        PageActivity pageActivity = (PageActivity) this.f5321g;
        c1667c.f5338a.f5334a.setSoundEffectsEnabled(true);
        c1667c.f5339b.f5334a.setSoundEffectsEnabled(true);
        c1667c.f5340c.f5334a.setSoundEffectsEnabled(true);
        this.f5315a.add(c1667c);
        return c1667c;
    }

    /* renamed from: a */
    public void m7910a(int i, View view, C1667c c1667c) {
        if (i == getCount() - 1) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingTop());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        }
        m7902a(m7898b(i, 0), c1667c.f5338a.f5336c, c1667c.f5338a.f5337d, c1667c.f5338a.f5335b, c1667c.f5338a.f5334a);
        m7902a(m7898b(i, 1), c1667c.f5339b.f5336c, c1667c.f5339b.f5337d, c1667c.f5339b.f5335b, c1667c.f5339b.f5334a);
        m7902a(m7898b(i, 2), c1667c.f5340c.f5336c, c1667c.f5340c.f5337d, c1667c.f5340c.f5335b, c1667c.f5340c.f5334a);
    }

    /* renamed from: b */
    private void m7897b(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.f5319e;
        layoutParams.height = this.f5320f;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m7902a(C1848k c1848k, ImageView imageView, TextView textView, View view, View view2) {
        imageView.setBackgroundResource(C1536f.C1538b.personal_list_item_bg);
        imageView.setImageDrawable(null);
        view2.setTag(c1848k);
        if (c1848k == null) {
            imageView.setVisibility(4);
            imageView.setBackgroundColor(0);
            view.setVisibility(8);
            textView.setText("");
            textView.setVisibility(8);
            return;
        }
        imageView.setTag(c1848k.m7300g());
        imageView.setVisibility(0);
        textView.setVisibility(0);
        textView.setText(c1848k.m7294i());
        view.setVisibility(c1848k.m7283n() ? 0 : 8);
        m7906a(imageView, c1848k, this.f5316b);
    }

    /* renamed from: b */
    private C1848k m7898b(int i, int i2) {
        List<C1848k> m7913a = m7913a();
        if (m7913a == null || (i * 3) + i2 >= m7913a.size()) {
            return null;
        }
        return m7913a.get((i * 3) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.ad$a */
    /* loaded from: classes.dex */
    public class C1665a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        private C1665a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null && pair.first != null && pair.second != null) {
                for (C1667c c1667c : C1659ad.this.f5315a) {
                    m7894a(pair, c1667c.f5338a);
                    m7894a(pair, c1667c.f5339b);
                    m7894a(pair, c1667c.f5340c);
                }
            }
        }

        /* renamed from: a */
        private void m7894a(Pair<String, Bitmap> pair, C1666b c1666b) {
            if (pair != null && c1666b != null && c1666b.f5336c != null && c1666b.f5336c.getTag() != null && ((String) pair.first).equals(c1666b.f5336c.getTag())) {
                c1666b.f5336c.setImageBitmap((Bitmap) pair.second);
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    /* renamed from: a */
    private void m7904a(AbstractC1700aq abstractC1700aq, final ImageView imageView) {
        C1894v.m7069h().m7092a(abstractC1700aq.m7300g(), abstractC1700aq, new AbstractC1386a.InterfaceC1396a<C1894v.C1916b>() { // from class: com.tsf.extend.theme.ad.1
            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6245a(JSONObject jSONObject, final C1894v.C1916b c1916b) {
                if (imageView != null && c1916b != null && c1916b.f6162a != null && c1916b.f6162a.equals(imageView.getTag())) {
                    imageView.post(new Runnable() { // from class: com.tsf.extend.theme.ad.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(c1916b.f6163b);
                        }
                    });
                }
            }

            @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo6247a(JSONObject jSONObject, int i, C1894v.C1916b c1916b) {
            }
        }, 2, 0);
    }

    /* renamed from: a */
    private void m7901a(C1848k c1848k, ImageView imageView, AbstractC1386a.InterfaceC1396a interfaceC1396a) {
        String str = null;
        if (c1848k.m7274t() != null && c1848k.m7274t().get(0) != null) {
            str = c1848k.m7274t().get(0);
        }
        if (!TextUtils.isEmpty(str)) {
            Bitmap a = C1894v.m7069h().m8804a(str);
            if (a != null) {
                imageView.setImageBitmap(a);
                return;
            }
            imageView.setTag(str);
            C1894v.m7069h().m7094a(str, imageView, interfaceC1396a, imageView.getWidth(), imageView.getHeight());
        }
    }

    /* renamed from: a */
    public void m7903a(C1848k c1848k, final ImageView imageView) {
        Bitmap a = C1894v.m7069h().m8804a("DEFAULT_THEME");
        if (a != null) {
            imageView.setImageBitmap(a);
        } else {
            C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.ad.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 2;
                        options.inJustDecodeBounds = false;
                        final Bitmap m6662a = C2035ab.m6662a(imageView.getContext(), options, false, false, 0);
                        if (m6662a == null) {
                            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ad.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (TextUtils.isEmpty((String) imageView.getTag()) && imageView != null) {
                                        imageView.setImageBitmap(m6662a);
                                    }
                                }
                            });
                            return;
                        }
                        final Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawColor(-65536);
                        canvas.drawBitmap(m6662a, new Rect(0, 0, m6662a.getWidth() / 2, m6662a.getHeight()), new Rect(0, 0, imageView.getWidth(), imageView.getHeight()), (Paint) null);
                        if (m6662a != null && !m6662a.isRecycled()) {
                            m6662a.recycle();
                        }
                        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ad.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (TextUtils.isEmpty((String) imageView.getTag()) && imageView != null) {
                                    imageView.setImageBitmap(createBitmap);
                                }
                            }
                        });
                    } catch (OutOfMemoryError e) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m7906a(ImageView imageView, C1848k c1848k, AbstractC1386a.InterfaceC1396a interfaceC1396a) {
        if (c1848k.m7281o()) {
            m7903a(c1848k, imageView);
        } else if (c1848k instanceof AbstractC1700aq) {
            m7904a((AbstractC1700aq) c1848k, imageView);
        } else {
            m7901a(c1848k, imageView, interfaceC1396a);
        }
    }

    /* renamed from: a */
    public void m7899a(List<C1848k> list) {
        this.f5322h = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public List<C1848k> m7913a() {
        return this.f5322h;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public C1848k getItem(int i) {
        return this.f5322h.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1667c c1667c;
        if (view == null) {
            view = m7909a(i, getItem(i), viewGroup);
            c1667c = m7907a(view);
            view.setTag(c1667c);
        } else {
            c1667c = (C1667c) view.getTag();
        }
        m7910a(i, view, c1667c);
        return view;
    }
}
