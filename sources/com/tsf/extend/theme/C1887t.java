package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
import com.tsf.extend.base.p075e.C1399a;
import com.tsf.extend.base.p080j.C1430i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.t */
/* loaded from: classes.dex */
public class C1887t extends BaseAdapter {

    /* renamed from: a */
    protected List<C1890b> f6059a;

    /* renamed from: b */
    protected Context f6060b;

    /* renamed from: c */
    protected View.OnClickListener f6061c;

    /* renamed from: e */
    protected int f6063e;

    /* renamed from: f */
    protected int f6064f;

    /* renamed from: g */
    protected int f6065g;

    /* renamed from: h */
    protected int f6066h;

    /* renamed from: i */
    protected int f6067i;

    /* renamed from: j */
    protected int f6068j;

    /* renamed from: k */
    protected int f6069k;

    /* renamed from: l */
    protected int f6070l;

    /* renamed from: m */
    protected int f6071m;

    /* renamed from: o */
    private int f6073o;

    /* renamed from: p */
    private String f6074p;

    /* renamed from: r */
    private Drawable f6076r;

    /* renamed from: n */
    private List<C1892d> f6072n = Lists.newArrayList();

    /* renamed from: q */
    private boolean f6075q = false;

    /* renamed from: d */
    protected C1891c f6062d = mo7130b();

    /* renamed from: com.tsf.extend.theme.t$a */
    /* loaded from: classes.dex */
    public enum EnumC1889a {
        Left,
        Mid,
        Right
    }

    public C1887t(Context context, List<C1890b> list, View.OnClickListener onClickListener) {
        this.f6059a = new ArrayList();
        this.f6061c = null;
        this.f6060b = context;
        this.f6059a = list;
        this.f6061c = onClickListener;
        m7125g();
        m7126f();
    }

    /* renamed from: f */
    private void m7126f() {
        this.f6076r = this.f6060b.getResources().getDrawable(C1536f.C1540d.theme_detail_favorite_btn_checked);
        this.f6076r.setColorFilter(-3355444, PorterDuff.Mode.SRC_IN);
        int m8659a = C1430i.m8659a(15.0f);
        this.f6076r.setBounds(0, 0, m8659a, m8659a);
    }

    /* renamed from: a */
    public void m7131a(boolean z) {
        this.f6075q = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f6059a == null) {
            return 0;
        }
        return this.f6059a.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public C1890b getItem(int i) {
        if (this.f6059a == null) {
            return null;
        }
        return this.f6059a.get(i);
    }

    /* renamed from: b */
    private int m7129b(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1892d c1892d;
        if (view == null) {
            view = LayoutInflater.from(this.f6060b).inflate(mo7038c(), (ViewGroup) null);
            c1892d = new C1892d();
            c1892d.f6089b = (ImageView) view.findViewById(C1536f.C1541e.theme_img_left);
            c1892d.f6090c = (TextView) view.findViewById(C1536f.C1541e.theme_down_left);
            c1892d.f6091d = (ImageView) view.findViewById(C1536f.C1541e.suggest_left);
            c1892d.f6092e = view.findViewById(C1536f.C1541e.theme_download_left);
            c1892d.f6093f = view.findViewById(C1536f.C1541e.theme_item_left);
            c1892d.f6093f.setOnClickListener(this.f6061c);
            c1892d.f6093f.setTag(c1892d);
            View findViewById = view.findViewById(C1536f.C1541e.theme_item_download_layout_left);
            findViewById.setOnClickListener(this.f6061c);
            findViewById.setTag(c1892d);
            c1892d.f6096i = (ImageView) view.findViewById(C1536f.C1541e.theme_img_right);
            c1892d.f6097j = (TextView) view.findViewById(C1536f.C1541e.theme_down_right);
            c1892d.f6098k = (ImageView) view.findViewById(C1536f.C1541e.suggest_right);
            c1892d.f6099l = view.findViewById(C1536f.C1541e.theme_download_right);
            c1892d.f6100m = view.findViewById(C1536f.C1541e.theme_item_right);
            c1892d.f6100m.setOnClickListener(this.f6061c);
            c1892d.f6100m.setTag(c1892d);
            View findViewById2 = view.findViewById(C1536f.C1541e.theme_item_download_layout_right);
            findViewById2.setOnClickListener(this.f6061c);
            findViewById2.setTag(c1892d);
            c1892d.f6103p = (ImageView) view.findViewById(C1536f.C1541e.theme_img_mid);
            c1892d.f6104q = (TextView) view.findViewById(C1536f.C1541e.theme_down_mid);
            c1892d.f6105r = (ImageView) view.findViewById(C1536f.C1541e.suggest_mid);
            c1892d.f6106s = view.findViewById(C1536f.C1541e.theme_download_mid);
            c1892d.f6107t = view.findViewById(C1536f.C1541e.theme_item_mid);
            c1892d.f6107t.setOnClickListener(this.f6061c);
            c1892d.f6107t.setTag(c1892d);
            View findViewById3 = view.findViewById(C1536f.C1541e.theme_item_download_layout_mid);
            findViewById3.setOnClickListener(this.f6061c);
            findViewById3.setTag(c1892d);
            mo7136a(c1892d, view);
            if (c1892d.f6094g != null) {
                c1892d.f6094g.setTypeface(C1399a.m8772a().m8770b());
            }
            if (c1892d.f6108u != null) {
                c1892d.f6108u.setTypeface(C1399a.m8772a().m8770b());
            }
            if (c1892d.f6101n != null) {
                c1892d.f6101n.setTypeface(C1399a.m8772a().m8770b());
            }
            PageActivity pageActivity = (PageActivity) this.f6060b;
            findViewById2.setSoundEffectsEnabled(true);
            findViewById.setSoundEffectsEnabled(true);
            findViewById3.setSoundEffectsEnabled(true);
            c1892d.f6100m.setSoundEffectsEnabled(true);
            c1892d.f6093f.setSoundEffectsEnabled(true);
            c1892d.f6107t.setSoundEffectsEnabled(true);
            m7139a(c1892d.f6093f, EnumC1889a.Left, m7129b(i));
            m7139a(c1892d.f6100m, EnumC1889a.Right, m7129b(i));
            m7139a(c1892d.f6107t, EnumC1889a.Mid, m7129b(i));
            view.setTag(c1892d);
            this.f6072n.add(c1892d);
        } else {
            c1892d = (C1892d) view.getTag();
        }
        C1890b item = getItem(i);
        mo7135a(c1892d, item);
        c1892d.f6088a = item.f6082a;
        c1892d.f6089b.setImageBitmap(null);
        if (this.f6074p == "DATA_DIY") {
            c1892d.f6090c.setText("by " + item.f6082a.m7277q());
        } else {
            m7138a(c1892d.f6090c, item.f6082a.m7271w());
        }
        if (item.f6082a.m7270x() == 1) {
            c1892d.f6091d.setVisibility(0);
            c1892d.f6091d.setImageResource(C1536f.C1540d.theme_recommend);
        } else if (item.f6082a.m7270x() == 2) {
            c1892d.f6091d.setVisibility(0);
            c1892d.f6091d.setImageResource(C1536f.C1540d.theme_recommend_3d);
        } else {
            c1892d.f6091d.setVisibility(8);
        }
        ((ImageView) c1892d.f6092e).setImageResource(item.f6082a.m7272v() ? C1536f.C1540d.theme_downloaded_icon : C1536f.C1540d.theme_downloads_icon);
        c1892d.f6092e.setTag(item.f6082a);
        if (!TextUtils.isEmpty(item.f6082a.m7285m())) {
            C1894v.m7069h().m7079c(item.f6082a.m7285m(), this.f6062d);
        }
        if (item.f6083b != null) {
            c1892d.f6107t.setVisibility(0);
            c1892d.f6102o = item.f6083b;
            c1892d.f6103p.setImageBitmap(null);
            if (this.f6074p == "DATA_DIY") {
                c1892d.f6104q.setText("by " + item.f6083b.m7277q());
            } else {
                m7138a(c1892d.f6104q, item.f6083b.m7271w());
            }
            if (item.f6083b.m7270x() == 1) {
                c1892d.f6105r.setVisibility(0);
                c1892d.f6105r.setImageResource(C1536f.C1540d.theme_recommend);
            } else if (item.f6083b.m7270x() == 2) {
                c1892d.f6105r.setVisibility(0);
                c1892d.f6105r.setImageResource(C1536f.C1540d.theme_recommend_3d);
            } else {
                c1892d.f6105r.setVisibility(8);
            }
            ((ImageView) c1892d.f6106s).setImageResource(item.f6083b.m7272v() ? C1536f.C1540d.theme_downloaded_icon : C1536f.C1540d.theme_downloads_icon);
            c1892d.f6106s.setTag(item.f6083b);
            if (!TextUtils.isEmpty(item.f6083b.m7285m())) {
                C1894v.m7069h().m7079c(item.f6083b.m7285m(), this.f6062d);
            }
        } else {
            c1892d.f6107t.setVisibility(4);
        }
        if (item.f6084c != null) {
            c1892d.f6100m.setVisibility(0);
            c1892d.f6095h = item.f6084c;
            c1892d.f6096i.setImageBitmap(null);
            if (this.f6074p == "DATA_DIY") {
                c1892d.f6097j.setText("by " + item.f6084c.m7277q());
            } else {
                m7138a(c1892d.f6097j, item.f6084c.m7271w());
            }
            if (item.f6084c.m7270x() == 1) {
                c1892d.f6098k.setVisibility(0);
                c1892d.f6098k.setImageResource(C1536f.C1540d.theme_recommend);
            } else if (item.f6084c.m7270x() == 2) {
                c1892d.f6098k.setVisibility(0);
                c1892d.f6098k.setImageResource(C1536f.C1540d.theme_recommend_3d);
            } else {
                c1892d.f6098k.setVisibility(8);
            }
            ((ImageView) c1892d.f6099l).setImageResource(item.f6084c.m7272v() ? C1536f.C1540d.theme_downloaded_icon : C1536f.C1540d.theme_downloads_icon);
            c1892d.f6099l.setTag(item.f6084c);
            if (!TextUtils.isEmpty(item.f6084c.m7285m())) {
                C1894v.m7069h().m7079c(item.f6084c.m7285m(), this.f6062d);
            }
        } else {
            c1892d.f6100m.setVisibility(4);
        }
        return view;
    }

    /* renamed from: c */
    protected int mo7038c() {
        return C1536f.C1542f.theme_all_item_new_style;
    }

    /* renamed from: a */
    protected void mo7136a(C1892d c1892d, View view) {
    }

    /* renamed from: a */
    protected void mo7135a(C1892d c1892d, C1890b c1890b) {
    }

    /* renamed from: g */
    private void m7125g() {
        DisplayMetrics displayMetrics = this.f6060b.getResources().getDisplayMetrics();
        this.f6063e = (int) (displayMetrics.widthPixels * 0.30556f);
        this.f6064f = mo7128d() + ((int) ((this.f6063e * 4.0f) / 3.0f));
        this.f6065g = (int) (displayMetrics.widthPixels * 0.025f);
        this.f6066h = (int) (displayMetrics.widthPixels * 0.00833f);
        this.f6070l = (int) (displayMetrics.widthPixels * 0.00833f);
        this.f6067i = (int) (displayMetrics.density * 1.0f);
        this.f6069k = (int) (displayMetrics.density * 1.0f);
        this.f6068j = (int) (displayMetrics.density * 8.0f);
        this.f6071m = this.f6063e;
        this.f6073o = (int) ((this.f6063e * 4.0f) / 3.0f);
    }

    /* renamed from: d */
    protected int mo7128d() {
        return this.f6060b.getResources().getDimensionPixelSize(C1536f.C1539c.theme_download_layout_height);
    }

    /* renamed from: a */
    private void m7139a(View view, EnumC1889a enumC1889a, int i) {
        View view2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f6063e, this.f6064f);
        int i2 = this.f6067i;
        if (i == 0) {
            i2 = this.f6068j;
        }
        switch (enumC1889a) {
            case Left:
                View findViewById = view.findViewById(C1536f.C1541e.theme_img_left);
                layoutParams.setMargins(this.f6065g, i2, this.f6066h, this.f6069k);
                view2 = findViewById;
                break;
            case Mid:
                View findViewById2 = view.findViewById(C1536f.C1541e.theme_img_mid);
                layoutParams.setMargins(this.f6070l, i2, this.f6070l, this.f6069k);
                view2 = findViewById2;
                break;
            case Right:
                View findViewById3 = view.findViewById(C1536f.C1541e.theme_img_right);
                layoutParams.setMargins(this.f6066h, i2, this.f6065g, this.f6069k);
                view2 = findViewById3;
                break;
            default:
                view2 = null;
                break;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = this.f6071m;
        layoutParams2.height = this.f6073o;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m7138a(TextView textView, int i) {
        textView.setText(C1848k.m7305e(i));
        textView.setCompoundDrawables(null, null, this.f6076r, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    /* renamed from: a */
    public void m7132a(List<C1890b> list, List<C1848k> list2) {
        C1890b c1890b;
        C1890b c1890b2 = list.size() > 0 ? list.get(list.size() - 1) : null;
        if (c1890b2 != null && c1890b2.m7122b() == null && 1 < list2.size()) {
            C1848k remove = list2.remove(0);
            remove.m7302f(c1890b2.m7124a().m7268z() + 1);
            c1890b2.m7123a(remove);
        }
        if (c1890b2 != null && c1890b2.m7120c() == null && 1 < list2.size()) {
            C1848k remove2 = list2.remove(0);
            remove2.m7302f(c1890b2.m7124a().m7268z() + 2);
            c1890b2.m7121b(remove2);
        }
        for (int i = 0; i < list2.size() / 3; i++) {
            int size = (list.size() + 1) * 10;
            C1848k c1848k = list2.get(i * 3);
            c1848k.m7302f(size + 1);
            C1848k c1848k2 = list2.get((i * 3) + 1);
            c1848k2.m7302f(size + 2);
            C1848k c1848k3 = list2.get((i * 3) + 2);
            c1848k3.m7302f(size + 3);
            list.add(new C1890b(c1848k, c1848k2, c1848k3));
        }
        int size2 = list2.size() % 3;
        if (size2 != 0) {
            if (size2 == 1) {
                C1848k c1848k4 = list2.get(list2.size() - 1);
                c1848k4.m7302f(((list.size() + 1) * 10) + 1);
                c1890b = new C1890b(c1848k4, null, null);
            } else if (size2 == 2) {
                int size3 = (list.size() + 1) * 10;
                C1848k c1848k5 = list2.get(list2.size() - 2);
                c1848k5.m7302f(size3 + 1);
                C1848k c1848k6 = list2.get(list2.size() - 1);
                c1848k6.m7302f(size3 + 2);
                c1890b = new C1890b(c1848k5, c1848k6, null);
            } else {
                c1890b = null;
            }
            list.add(c1890b);
        }
    }

    /* renamed from: com.tsf.extend.theme.t$b */
    /* loaded from: classes.dex */
    public static class C1890b {

        /* renamed from: a */
        C1848k f6082a;

        /* renamed from: b */
        C1848k f6083b;

        /* renamed from: c */
        C1848k f6084c;

        /* renamed from: d */
        List<C1848k> f6085d;

        /* renamed from: e */
        C1848k f6086e;

        public C1890b(C1848k c1848k, C1848k c1848k2, C1848k c1848k3) {
            this.f6085d = new ArrayList();
            this.f6082a = c1848k;
            this.f6083b = c1848k2;
            this.f6084c = c1848k3;
        }

        public C1890b(List<C1848k> list) {
            this.f6085d = new ArrayList();
            this.f6085d = list;
        }

        public C1890b(C1848k c1848k) {
            this.f6085d = new ArrayList();
            this.f6086e = c1848k;
        }

        /* renamed from: a */
        public C1848k m7124a() {
            return this.f6082a;
        }

        /* renamed from: b */
        public C1848k m7122b() {
            return this.f6083b;
        }

        /* renamed from: a */
        public void m7123a(C1848k c1848k) {
            this.f6083b = c1848k;
        }

        /* renamed from: c */
        public C1848k m7120c() {
            return this.f6084c;
        }

        /* renamed from: b */
        public void m7121b(C1848k c1848k) {
            this.f6084c = c1848k;
        }

        /* renamed from: d */
        public List<C1848k> m7119d() {
            return this.f6085d;
        }

        /* renamed from: e */
        public C1848k m7118e() {
            return this.f6086e;
        }
    }

    /* renamed from: com.tsf.extend.theme.t$d */
    /* loaded from: classes.dex */
    public class C1892d {

        /* renamed from: a */
        public C1848k f6088a;

        /* renamed from: b */
        public ImageView f6089b;

        /* renamed from: c */
        public TextView f6090c;

        /* renamed from: d */
        public ImageView f6091d;

        /* renamed from: e */
        public View f6092e;

        /* renamed from: f */
        public View f6093f;

        /* renamed from: g */
        public TextView f6094g;

        /* renamed from: h */
        public C1848k f6095h;

        /* renamed from: i */
        public ImageView f6096i;

        /* renamed from: j */
        public TextView f6097j;

        /* renamed from: k */
        public ImageView f6098k;

        /* renamed from: l */
        public View f6099l;

        /* renamed from: m */
        public View f6100m;

        /* renamed from: n */
        public TextView f6101n;

        /* renamed from: o */
        public C1848k f6102o;

        /* renamed from: p */
        public ImageView f6103p;

        /* renamed from: q */
        public TextView f6104q;

        /* renamed from: r */
        public ImageView f6105r;

        /* renamed from: s */
        public View f6106s;

        /* renamed from: t */
        public View f6107t;

        /* renamed from: u */
        public TextView f6108u;

        public C1892d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.tsf.extend.theme.t$c */
    /* loaded from: classes.dex */
    public class C1891c implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        /* JADX INFO: Access modifiers changed from: protected */
        public C1891c() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            mo7117a(pair);
        }

        /* renamed from: a */
        protected void mo7117a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (C1892d c1892d : C1887t.this.f6072n) {
                        if (c1892d.f6088a != null && str.equals(c1892d.f6088a.m7285m())) {
                            c1892d.f6089b.setImageBitmap(bitmap);
                        }
                        if (c1892d.f6095h != null && str.equals(c1892d.f6095h.m7285m())) {
                            c1892d.f6096i.setImageBitmap(bitmap);
                        }
                        if (c1892d.f6102o != null && str.equals(c1892d.f6102o.m7285m())) {
                            c1892d.f6103p.setImageBitmap(bitmap);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            mo7117a(pair);
        }
    }

    /* renamed from: a */
    public void mo7141a() {
        this.f6072n.clear();
    }

    /* renamed from: a */
    public void m7133a(String str) {
        this.f6074p = str;
    }

    /* renamed from: e */
    public String m7127e() {
        return this.f6074p;
    }

    /* renamed from: b */
    protected C1891c mo7130b() {
        return new C1891c();
    }

    /* renamed from: a */
    public boolean m7137a(C1848k c1848k) {
        if (c1848k == null) {
            return false;
        }
        if (this.f6072n != null) {
            for (C1892d c1892d : this.f6072n) {
                if (c1892d.f6088a != null && c1892d.f6088a.m7297h() == c1848k.m7297h()) {
                    return true;
                }
                if (c1892d.f6102o != null && c1892d.f6102o.m7297h() == c1848k.m7297h()) {
                    return true;
                }
                if (c1892d.f6095h != null && c1892d.f6095h.m7297h() == c1848k.m7297h()) {
                    return true;
                }
            }
        }
        return false;
    }
}
