package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.wallpaper.t */
/* loaded from: classes.dex */
public class View$OnClickListenerC2107t extends BaseAdapter implements View.OnClickListener {

    /* renamed from: l */
    private static int[] f6887l = {C1536f.C1543g.time_january, C1536f.C1543g.time_february, C1536f.C1543g.time_march, C1536f.C1543g.time_april, C1536f.C1543g.time_may, C1536f.C1543g.time_june, C1536f.C1543g.time_july, C1536f.C1543g.time_august, C1536f.C1543g.time_september, C1536f.C1543g.time_october, C1536f.C1543g.time_november, C1536f.C1543g.time_december};

    /* renamed from: b */
    private EnumC2057ai f6889b;

    /* renamed from: c */
    private Context f6890c;

    /* renamed from: f */
    private InterfaceC2109a f6893f;

    /* renamed from: g */
    private View$OnClickListenerC2040ad.C2044a f6894g;

    /* renamed from: h */
    private int f6895h;

    /* renamed from: i */
    private int f6896i;

    /* renamed from: j */
    private int f6897j;

    /* renamed from: k */
    private View.OnClickListener f6898k;

    /* renamed from: a */
    private List<C2112d> f6888a = Lists.newArrayList();

    /* renamed from: d */
    private List<C2111c> f6891d = Lists.newArrayList();

    /* renamed from: e */
    private C2110b f6892e = new C2110b();

    /* renamed from: com.tsf.extend.wallpaper.t$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2109a {
        /* renamed from: a */
        void mo6388a(C2111c c2111c, View view);

        /* renamed from: a */
        void mo6387a(C2111c c2111c, C2112d c2112d, int i);
    }

    public View$OnClickListenerC2107t(Context context, EnumC2057ai enumC2057ai) {
        this.f6890c = context;
        this.f6889b = enumC2057ai;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f6895h = this.f6890c.getResources().getDimensionPixelSize(C1536f.C1539c.wallpaper_list_item_padding);
        this.f6894g = new View$OnClickListenerC2040ad.C2044a(this.f6895h, this.f6895h);
        this.f6896i = ((displayMetrics.widthPixels - this.f6895h) - (this.f6890c.getResources().getDimensionPixelSize(C1536f.C1539c.wallpaper_list_padding_horizontal) * 2)) / 2;
        this.f6897j = (int) (this.f6896i / 1.1225806f);
    }

    /* renamed from: a */
    public View$OnClickListenerC2040ad.C2044a m6401a() {
        return this.f6894g;
    }

    /* renamed from: b */
    public int m6393b() {
        return this.f6896i;
    }

    /* renamed from: c */
    public int m6391c() {
        return this.f6897j;
    }

    /* renamed from: a */
    public void m6394a(List<C2094m> list) {
        this.f6888a.clear();
        if (list != null && list.size() != 0) {
            this.f6888a.addAll(m6390c(list));
        }
    }

    /* renamed from: b */
    public void m6392b(List<C2112d> list) {
        this.f6888a.clear();
        if (list != null && list.size() != 0) {
            this.f6888a.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static List<C2112d> m6390c(List<C2094m> list) {
        ArrayList arrayList = new ArrayList();
        int size = (list.size() / 2) + (list.size() % 2);
        for (int i = 0; i < size; i++) {
            C2094m c2094m = list.get(i * 2);
            C2094m c2094m2 = null;
            if ((i * 2) + 1 < list.size()) {
                c2094m2 = list.get((i * 2) + 1);
            }
            arrayList.add(new C2112d(c2094m, c2094m2));
        }
        return arrayList;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == getCount() - 1) {
            return 2;
        }
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f6888a == null) {
            return 0;
        }
        return this.f6888a.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public C2112d getItem(int i) {
        if (this.f6888a == null) {
            return null;
        }
        return this.f6888a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        boolean z = true;
        if (view == null) {
            view2 = LayoutInflater.from(this.f6890c).inflate(C1536f.C1542f.wallpaper_list_item, (ViewGroup) null);
            C2111c c2111c = new C2111c();
            this.f6891d.add(c2111c);
            c2111c.f6900a = (ImageView) view2.findViewById(C1536f.C1541e.img_left);
            c2111c.f6901b = (ImageView) view2.findViewById(C1536f.C1541e.img_right);
            c2111c.f6902c = (TextView) view2.findViewById(C1536f.C1541e.download_left);
            c2111c.f6903d = (TextView) view2.findViewById(C1536f.C1541e.download_right);
            c2111c.f6904e = (ImageView) view2.findViewById(C1536f.C1541e.user_tag_left);
            c2111c.f6905f = (ImageView) view2.findViewById(C1536f.C1541e.user_tag_right);
            c2111c.f6906g = (ImageView) view2.findViewById(C1536f.C1541e.live_tag_left);
            c2111c.f6907h = (ImageView) view2.findViewById(C1536f.C1541e.live_tag_right);
            if (this.f6893f != null) {
                this.f6893f.mo6388a(c2111c, view2);
            }
            c2111c.f6900a.setOnClickListener(this);
            c2111c.f6901b.setOnClickListener(this);
            m6398a(c2111c.f6900a, getItemViewType(i));
            m6398a(c2111c.f6901b, getItemViewType(i));
            LinearLayout linearLayout = (LinearLayout) view2;
            if (Build.VERSION.SDK_INT >= 11) {
                linearLayout.setShowDividers(2);
                linearLayout.setDividerDrawable(this.f6894g);
            }
            view2.setTag(c2111c);
            if (this.f6889b == EnumC2057ai.HotType) {
                c2111c.f6902c.setVisibility(0);
                c2111c.f6903d.setVisibility(0);
            }
        } else {
            view2 = view;
        }
        C2111c c2111c2 = (C2111c) view2.getTag();
        C2112d item = getItem(i);
        c2111c2.f6909j = item.f6911a;
        c2111c2.f6910k = item.f6912b;
        m6397a(item.f6911a, c2111c2.f6900a);
        m6397a(item.f6912b, c2111c2.f6901b);
        if (this.f6893f != null) {
            this.f6893f.mo6387a(c2111c2, item, i);
        }
        if (this.f6889b == EnumC2057ai.HotType) {
            if (item.f6911a != null) {
                c2111c2.f6902c.setText("" + item.f6911a.m6432g());
            }
            if (item.f6912b != null) {
                c2111c2.f6903d.setVisibility(0);
                c2111c2.f6903d.setText("" + item.f6912b.m6432g());
            } else {
                c2111c2.f6903d.setVisibility(4);
            }
        }
        if (this.f6889b == EnumC2057ai.NewType) {
            c2111c2.f6906g.setVisibility(item.f6911a != null && item.f6911a.m6425n() ? 0 : 8);
            if (item.f6912b == null || !item.f6912b.m6425n()) {
                z = false;
            }
            c2111c2.f6907h.setVisibility(z ? 0 : 8);
        } else {
            c2111c2.f6906g.setVisibility(8);
            c2111c2.f6907h.setVisibility(8);
        }
        if (item.f6911a != null) {
            c2111c2.f6904e.setVisibility(8);
        }
        if (item.f6912b != null) {
            c2111c2.f6905f.setVisibility(8);
        } else {
            c2111c2.f6905f.setVisibility(4);
        }
        return view2;
    }

    /* renamed from: a */
    private void m6397a(C2094m c2094m, ImageView imageView) {
        imageView.setBackgroundResource(C1536f.C1538b.personal_list_item_bg);
        imageView.setTag(c2094m);
        if (c2094m == null) {
            imageView.setBackgroundColor(0);
            imageView.setImageDrawable(null);
            return;
        }
        Bitmap r = c2094m.m6403r();
        if (r != null) {
            imageView.setImageBitmap(r);
            return;
        }
        imageView.setImageBitmap(null);
        C2148z.m6199h().m8801a(c2094m.m6430i(), this.f6892e);
    }

    /* renamed from: a */
    private void m6398a(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.f6896i;
        layoutParams.height = this.f6897j;
    }

    /* renamed from: com.tsf.extend.wallpaper.t$c */
    /* loaded from: classes.dex */
    public static class C2111c {

        /* renamed from: a */
        ImageView f6900a;

        /* renamed from: b */
        ImageView f6901b;

        /* renamed from: c */
        TextView f6902c;

        /* renamed from: d */
        TextView f6903d;

        /* renamed from: e */
        ImageView f6904e;

        /* renamed from: f */
        ImageView f6905f;

        /* renamed from: g */
        ImageView f6906g;

        /* renamed from: h */
        ImageView f6907h;

        /* renamed from: i */
        TextView f6908i;

        /* renamed from: j */
        private C2094m f6909j;

        /* renamed from: k */
        private C2094m f6910k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.t$b */
    /* loaded from: classes.dex */
    public class C2110b implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        private C2110b() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            m6386a(pair);
        }

        /* renamed from: a */
        private void m6386a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                if (!TextUtils.isEmpty(str)) {
                    if (pair.second != null) {
                    }
                    for (C2111c c2111c : View$OnClickListenerC2107t.this.f6891d) {
                        if (c2111c.f6909j != null && str.equals(c2111c.f6909j.m6430i())) {
                            c2111c.f6909j.m6405a((Bitmap) pair.second);
                            c2111c.f6900a.setImageBitmap((Bitmap) pair.second);
                        }
                        if (c2111c.f6910k != null && str.equals(c2111c.f6910k.m6430i())) {
                            c2111c.f6910k.m6405a((Bitmap) pair.second);
                            c2111c.f6901b.setImageBitmap((Bitmap) pair.second);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            m6386a(pair);
        }
    }

    /* renamed from: a */
    public void m6396a(InterfaceC2109a interfaceC2109a) {
        this.f6893f = interfaceC2109a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f6898k != null) {
            this.f6898k.onClick(view);
        }
    }

    /* renamed from: a */
    public void m6399a(View.OnClickListener onClickListener) {
        this.f6898k = onClickListener;
    }

    /* renamed from: com.tsf.extend.wallpaper.t$d */
    /* loaded from: classes.dex */
    public static class C2112d {

        /* renamed from: a */
        C2094m f6911a;

        /* renamed from: b */
        C2094m f6912b;

        /* renamed from: c */
        CharSequence f6913c;

        /* renamed from: d */
        boolean f6914d = false;

        public C2112d(C2094m c2094m, C2094m c2094m2) {
            this.f6911a = c2094m;
            this.f6912b = c2094m2;
        }
    }

    /* renamed from: d */
    public void m6389d() {
        if (this.f6891d != null) {
            this.f6891d.clear();
        }
        this.f6898k = null;
        this.f6893f = null;
        this.f6888a.clear();
    }
}
