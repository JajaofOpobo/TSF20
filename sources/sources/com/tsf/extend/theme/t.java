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
import com.tsf.extend.base.d.a;
import com.tsf.extend.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class t extends BaseAdapter {
    protected List<b> a;
    protected Context b;
    protected View.OnClickListener c;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    private int o;
    private String p;
    private Drawable r;
    private List<d> n = Lists.newArrayList();
    private boolean q = false;
    protected c d = b();

    public enum a {
        Left,
        Mid,
        Right
    }

    public t(Context context, List<b> list, View.OnClickListener onClickListener) {
        this.a = new ArrayList();
        this.c = null;
        this.b = context;
        this.a = list;
        this.c = onClickListener;
        g();
        f();
    }

    private void f() {
        this.r = this.b.getResources().getDrawable(f.d.theme_detail_favorite_btn_checked);
        this.r.setColorFilter(-3355444, PorterDuff.Mode.SRC_IN);
        int iA = com.tsf.extend.base.j.i.a(15.0f);
        this.r.setBounds(0, 0, iA, iA);
    }

    public void a(boolean z) {
        this.q = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b getItem(int i) {
        if (this.a == null) {
            return null;
        }
        return this.a.get(i);
    }

    private int b(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar;
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(c(), (ViewGroup) null);
            dVar = new d();
            dVar.b = (ImageView) view.findViewById(f.e.theme_img_left);
            dVar.c = (TextView) view.findViewById(f.e.theme_down_left);
            dVar.d = (ImageView) view.findViewById(f.e.suggest_left);
            dVar.e = view.findViewById(f.e.theme_download_left);
            dVar.f = view.findViewById(f.e.theme_item_left);
            dVar.f.setOnClickListener(this.c);
            dVar.f.setTag(dVar);
            View viewFindViewById = view.findViewById(f.e.theme_item_download_layout_left);
            viewFindViewById.setOnClickListener(this.c);
            viewFindViewById.setTag(dVar);
            dVar.i = (ImageView) view.findViewById(f.e.theme_img_right);
            dVar.j = (TextView) view.findViewById(f.e.theme_down_right);
            dVar.k = (ImageView) view.findViewById(f.e.suggest_right);
            dVar.l = view.findViewById(f.e.theme_download_right);
            dVar.m = view.findViewById(f.e.theme_item_right);
            dVar.m.setOnClickListener(this.c);
            dVar.m.setTag(dVar);
            View viewFindViewById2 = view.findViewById(f.e.theme_item_download_layout_right);
            viewFindViewById2.setOnClickListener(this.c);
            viewFindViewById2.setTag(dVar);
            dVar.p = (ImageView) view.findViewById(f.e.theme_img_mid);
            dVar.q = (TextView) view.findViewById(f.e.theme_down_mid);
            dVar.r = (ImageView) view.findViewById(f.e.suggest_mid);
            dVar.s = view.findViewById(f.e.theme_download_mid);
            dVar.t = view.findViewById(f.e.theme_item_mid);
            dVar.t.setOnClickListener(this.c);
            dVar.t.setTag(dVar);
            View viewFindViewById3 = view.findViewById(f.e.theme_item_download_layout_mid);
            viewFindViewById3.setOnClickListener(this.c);
            viewFindViewById3.setTag(dVar);
            a(dVar, view);
            if (dVar.g != null) {
                dVar.g.setTypeface(com.tsf.extend.base.e.a.a().b());
            }
            if (dVar.u != null) {
                dVar.u.setTypeface(com.tsf.extend.base.e.a.a().b());
            }
            if (dVar.n != null) {
                dVar.n.setTypeface(com.tsf.extend.base.e.a.a().b());
            }
            viewFindViewById2.setSoundEffectsEnabled(true);
            viewFindViewById.setSoundEffectsEnabled(true);
            viewFindViewById3.setSoundEffectsEnabled(true);
            dVar.m.setSoundEffectsEnabled(true);
            dVar.f.setSoundEffectsEnabled(true);
            dVar.t.setSoundEffectsEnabled(true);
            a(dVar.f, a.Left, b(i));
            a(dVar.m, a.Right, b(i));
            a(dVar.t, a.Mid, b(i));
            view.setTag(dVar);
            this.n.add(dVar);
        } else {
            dVar = (d) view.getTag();
        }
        b item = getItem(i);
        a(dVar, item);
        dVar.a = item.a;
        dVar.b.setImageBitmap(null);
        if (this.p == "DATA_DIY") {
            dVar.c.setText("by " + item.a.q());
        } else {
            a(dVar.c, item.a.w());
        }
        if (item.a.x() == 1) {
            dVar.d.setVisibility(0);
            dVar.d.setImageResource(f.d.theme_recommend);
        } else if (item.a.x() == 2) {
            dVar.d.setVisibility(0);
            dVar.d.setImageResource(f.d.theme_recommend_3d);
        } else {
            dVar.d.setVisibility(8);
        }
        ((ImageView) dVar.e).setImageResource(item.a.v() ? f.d.theme_downloaded_icon : f.d.theme_downloads_icon);
        dVar.e.setTag(item.a);
        if (!TextUtils.isEmpty(item.a.m())) {
            v.h().c(item.a.m(), this.d);
        }
        if (item.b != null) {
            dVar.t.setVisibility(0);
            dVar.o = item.b;
            dVar.p.setImageBitmap(null);
            if (this.p == "DATA_DIY") {
                dVar.q.setText("by " + item.b.q());
            } else {
                a(dVar.q, item.b.w());
            }
            if (item.b.x() == 1) {
                dVar.r.setVisibility(0);
                dVar.r.setImageResource(f.d.theme_recommend);
            } else if (item.b.x() == 2) {
                dVar.r.setVisibility(0);
                dVar.r.setImageResource(f.d.theme_recommend_3d);
            } else {
                dVar.r.setVisibility(8);
            }
            ((ImageView) dVar.s).setImageResource(item.b.v() ? f.d.theme_downloaded_icon : f.d.theme_downloads_icon);
            dVar.s.setTag(item.b);
            if (!TextUtils.isEmpty(item.b.m())) {
                v.h().c(item.b.m(), this.d);
            }
        } else {
            dVar.t.setVisibility(4);
        }
        if (item.c != null) {
            dVar.m.setVisibility(0);
            dVar.h = item.c;
            dVar.i.setImageBitmap(null);
            if (this.p == "DATA_DIY") {
                dVar.j.setText("by " + item.c.q());
            } else {
                a(dVar.j, item.c.w());
            }
            if (item.c.x() == 1) {
                dVar.k.setVisibility(0);
                dVar.k.setImageResource(f.d.theme_recommend);
            } else if (item.c.x() == 2) {
                dVar.k.setVisibility(0);
                dVar.k.setImageResource(f.d.theme_recommend_3d);
            } else {
                dVar.k.setVisibility(8);
            }
            ((ImageView) dVar.l).setImageResource(item.c.v() ? f.d.theme_downloaded_icon : f.d.theme_downloads_icon);
            dVar.l.setTag(item.c);
            if (!TextUtils.isEmpty(item.c.m())) {
                v.h().c(item.c.m(), this.d);
            }
        } else {
            dVar.m.setVisibility(4);
        }
        return view;
    }

    protected int c() {
        return f.C0052f.theme_all_item_new_style;
    }

    protected void a(d dVar, View view) {
    }

    protected void a(d dVar, b bVar) {
    }

    private void g() {
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        this.e = (int) (displayMetrics.widthPixels * 0.30556f);
        this.f = d() + ((int) ((this.e * 4.0f) / 3.0f));
        this.g = (int) (displayMetrics.widthPixels * 0.025f);
        this.h = (int) (displayMetrics.widthPixels * 0.00833f);
        this.l = (int) (displayMetrics.widthPixels * 0.00833f);
        this.i = (int) (displayMetrics.density * 1.0f);
        this.k = (int) (displayMetrics.density * 1.0f);
        this.j = (int) (displayMetrics.density * 8.0f);
        this.m = this.e;
        this.o = (int) ((this.e * 4.0f) / 3.0f);
    }

    protected int d() {
        return this.b.getResources().getDimensionPixelSize(f.c.theme_download_layout_height);
    }

    private void a(View view, a aVar, int i) {
        View view2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.e, this.f);
        int i2 = this.i;
        if (i == 0) {
            i2 = this.j;
        }
        switch (aVar) {
            case Left:
                View viewFindViewById = view.findViewById(f.e.theme_img_left);
                layoutParams.setMargins(this.g, i2, this.h, this.k);
                view2 = viewFindViewById;
                break;
            case Mid:
                View viewFindViewById2 = view.findViewById(f.e.theme_img_mid);
                layoutParams.setMargins(this.l, i2, this.l, this.k);
                view2 = viewFindViewById2;
                break;
            case Right:
                View viewFindViewById3 = view.findViewById(f.e.theme_img_right);
                layoutParams.setMargins(this.h, i2, this.g, this.k);
                view2 = viewFindViewById3;
                break;
            default:
                view2 = null;
                break;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = this.m;
        layoutParams2.height = this.o;
        view.setLayoutParams(layoutParams);
    }

    private void a(TextView textView, int i) {
        textView.setText(k.e(i));
        textView.setCompoundDrawables(null, null, this.r, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public void a(List<b> list, List<k> list2) {
        b bVar;
        b bVar2 = list.size() > 0 ? list.get(list.size() - 1) : null;
        if (bVar2 != null && bVar2.b() == null && 1 < list2.size()) {
            k kVarRemove = list2.remove(0);
            kVarRemove.f(bVar2.a().z() + 1);
            bVar2.a(kVarRemove);
        }
        if (bVar2 != null && bVar2.c() == null && 1 < list2.size()) {
            k kVarRemove2 = list2.remove(0);
            kVarRemove2.f(bVar2.a().z() + 2);
            bVar2.b(kVarRemove2);
        }
        for (int i = 0; i < list2.size() / 3; i++) {
            int size = (list.size() + 1) * 10;
            k kVar = list2.get(i * 3);
            kVar.f(size + 1);
            k kVar2 = list2.get((i * 3) + 1);
            kVar2.f(size + 2);
            k kVar3 = list2.get((i * 3) + 2);
            kVar3.f(size + 3);
            list.add(new b(kVar, kVar2, kVar3));
        }
        int size2 = list2.size() % 3;
        if (size2 != 0) {
            if (size2 == 1) {
                k kVar4 = list2.get(list2.size() - 1);
                kVar4.f(((list.size() + 1) * 10) + 1);
                bVar = new b(kVar4, null, null);
            } else if (size2 == 2) {
                int size3 = (list.size() + 1) * 10;
                k kVar5 = list2.get(list2.size() - 2);
                kVar5.f(size3 + 1);
                k kVar6 = list2.get(list2.size() - 1);
                kVar6.f(size3 + 2);
                bVar = new b(kVar5, kVar6, null);
            } else {
                bVar = null;
            }
            list.add(bVar);
        }
    }

    public static class b {
        k a;
        k b;
        k c;
        List<k> d;
        k e;

        public b(k kVar, k kVar2, k kVar3) {
            this.d = new ArrayList();
            this.a = kVar;
            this.b = kVar2;
            this.c = kVar3;
        }

        public b(List<k> list) {
            this.d = new ArrayList();
            this.d = list;
        }

        public b(k kVar) {
            this.d = new ArrayList();
            this.e = kVar;
        }

        public k a() {
            return this.a;
        }

        public k b() {
            return this.b;
        }

        public void a(k kVar) {
            this.b = kVar;
        }

        public k c() {
            return this.c;
        }

        public void b(k kVar) {
            this.c = kVar;
        }

        public List<k> d() {
            return this.d;
        }

        public k e() {
            return this.e;
        }
    }

    public class d {
        public k a;
        public ImageView b;
        public TextView c;
        public ImageView d;
        public View e;
        public View f;
        public TextView g;
        public k h;
        public ImageView i;
        public TextView j;
        public ImageView k;
        public View l;
        public View m;
        public TextView n;
        public k o;
        public ImageView p;
        public TextView q;
        public ImageView r;
        public View s;
        public View t;
        public TextView u;

        public d() {
        }
    }

    protected class c implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        protected c() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            a(pair);
        }

        protected void a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (d dVar : t.this.n) {
                        if (dVar.a != null && str.equals(dVar.a.m())) {
                            dVar.b.setImageBitmap(bitmap);
                        }
                        if (dVar.h != null && str.equals(dVar.h.m())) {
                            dVar.i.setImageBitmap(bitmap);
                        }
                        if (dVar.o != null && str.equals(dVar.o.m())) {
                            dVar.p.setImageBitmap(bitmap);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            a(pair);
        }
    }

    public void a() {
        this.n.clear();
    }

    public void a(String str) {
        this.p = str;
    }

    public String e() {
        return this.p;
    }

    protected c b() {
        return new c();
    }

    public boolean a(k kVar) {
        if (kVar == null) {
            return false;
        }
        if (this.n != null) {
            for (d dVar : this.n) {
                if (dVar.a != null && dVar.a.h() == kVar.h()) {
                    return true;
                }
                if (dVar.o != null && dVar.o.h() == kVar.h()) {
                    return true;
                }
                if (dVar.h != null && dVar.h.h() == kVar.h()) {
                    return true;
                }
            }
        }
        return false;
    }
}
