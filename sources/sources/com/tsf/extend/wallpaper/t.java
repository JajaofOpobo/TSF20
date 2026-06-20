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
import com.tsf.extend.base.d.BaseDataProvider;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.wallpaper.ad;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class t extends BaseAdapter implements View.OnClickListener {
    private static int[] l = {ResourceIds.g.time_january, ResourceIds.g.time_february, ResourceIds.g.time_march, ResourceIds.g.time_april, ResourceIds.g.time_may, ResourceIds.g.time_june, ResourceIds.g.time_july, ResourceIds.g.time_august, ResourceIds.g.time_september, ResourceIds.g.time_october, ResourceIds.g.time_november, ResourceIds.g.time_december};
    private ai b;
    private Context c;
    private A f;
    private ad.a g;
    private int h;
    private int i;
    private int j;
    private View.OnClickListener k;
    private List<d> a = Lists.newArrayList();
    private List<c> d = Lists.newArrayList();
    private b e = new b();

    public interface a {
        void a(c cVar, View view);

        void a(c cVar, d dVar, int i);
    }

    public t(Context context, ai aiVar) {
        this.c = context;
        this.b = aiVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.h = this.c.getResources().getDimensionPixelSize(ResourceIds.c.wallpaper_list_item_padding);
        this.g = new ad.a(this.h, this.h);
        this.i = ((displayMetrics.widthPixels - this.h) - (this.c.getResources().getDimensionPixelSize(ResourceIds.c.wallpaper_list_padding_horizontal) * 2)) / 2;
        this.j = (int) (this.i / 1.1225806f);
    }

    public ad.a a() {
        return this.g;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }

    public void a(List<m> list) {
        this.a.clear();
        if (list != null && list.size() != 0) {
            this.a.addAll(c(list));
        }
    }

    public void b(List<d> list) {
        this.a.clear();
        if (list != null && list.size() != 0) {
            this.a.addAll(list);
        }
    }

    static List<d> c(List<m> list) {
        ArrayList arrayList = new ArrayList();
        int size = (list.size() / 2) + (list.size() % 2);
        for (int i = 0; i < size; i++) {
            m mVar = list.get(i * 2);
            m mVar2 = null;
            if ((i * 2) + 1 < list.size()) {
                mVar2 = list.get((i * 2) + 1);
            }
            arrayList.add(new d(mVar, mVar2));
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
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d getItem(int i) {
        if (this.a == null) {
            return null;
        }
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        if (view == null) {
            viewInflate = LayoutInflater.from(this.c).inflate(ResourceIds.C0052f.wallpaper_list_item, (ViewGroup) null);
            c cVar = new c();
            this.d.add(cVar);
            cVar.a = (ImageView) viewInflate.findViewById(ResourceIds.e.img_left);
            cVar.b = (ImageView) viewInflate.findViewById(ResourceIds.e.img_right);
            cVar.c = (TextView) viewInflate.findViewById(ResourceIds.e.download_left);
            cVar.d = (TextView) viewInflate.findViewById(ResourceIds.e.download_right);
            cVar.e = (ImageView) viewInflate.findViewById(ResourceIds.e.user_tag_left);
            cVar.f = (ImageView) viewInflate.findViewById(ResourceIds.e.user_tag_right);
            cVar.g = (ImageView) viewInflate.findViewById(ResourceIds.e.live_tag_left);
            cVar.h = (ImageView) viewInflate.findViewById(ResourceIds.e.live_tag_right);
            if (this.f != null) {
                this.ResourceIds.a(cVar, viewInflate);
            }
            cVar.a.setOnClickListener(this);
            cVar.b.setOnClickListener(this);
            a(cVar.a, getItemViewType(i));
            a(cVar.b, getItemViewType(i));
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            if (Build.VERSION.SDK_INT >= 11) {
                linearLayout.setShowDividers(2);
                linearLayout.setDividerDrawable(this.g);
            }
            viewInflate.setTag(cVar);
            if (this.b == ai.HotType) {
                cVar.c.setVisibility(0);
                cVar.d.setVisibility(0);
            }
        } else {
            viewInflate = view;
        }
        c cVar2 = (c) viewInflate.getTag();
        d item = getItem(i);
        cVar2.j = item.a;
        cVar2.k = item.b;
        a(item.a, cVar2.a);
        a(item.b, cVar2.b);
        if (this.f != null) {
            this.ResourceIds.a(cVar2, item, i);
        }
        if (this.b == ai.HotType) {
            if (item.a != null) {
                cVar2.c.setText("" + item.a.g());
            }
            if (item.b != null) {
                cVar2.d.setVisibility(0);
                cVar2.d.setText("" + item.b.g());
            } else {
                cVar2.d.setVisibility(4);
            }
        }
        if (this.b == ai.NewType) {
            cVar2.g.setVisibility(item.a != null && item.a.n() ? 0 : 8);
            cVar2.h.setVisibility(item.b != null && item.b.n() ? 0 : 8);
        } else {
            cVar2.g.setVisibility(8);
            cVar2.h.setVisibility(8);
        }
        if (item.a != null) {
            cVar2.e.setVisibility(8);
        }
        if (item.b != null) {
            cVar2.ResourceIds.setVisibility(8);
        } else {
            cVar2.ResourceIds.setVisibility(4);
        }
        return viewInflate;
    }

    private void a(m mVar, ImageView imageView) {
        imageView.setBackgroundResource(ResourceIds.b.personal_list_item_bg);
        imageView.setTag(mVar);
        if (mVar == null) {
            imageView.setBackgroundColor(0);
            imageView.setImageDrawable(null);
            return;
        }
        Bitmap bitmapR = mVar.r();
        if (bitmapR != null) {
            imageView.setImageBitmap(bitmapR);
        } else {
            imageView.setImageBitmap(null);
            z.h().a(mVar.i(), this.e);
        }
    }

    private void a(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.i;
        layoutParams.height = this.j;
    }

    public static class c {
        ImageView a;
        ImageView b;
        TextView c;
        TextView d;
        ImageView e;
        ImageView f;
        ImageView g;
        ImageView h;
        TextView i;
        private m j;
        private m k;
    }

    private class b implements com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a<Pair<String, Bitmap>> {
        private b() {
        }

        @Override // com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            a(pair);
        }

        private void a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                if (!TextUtils.isEmpty(str)) {
                    if (pair.second != null) {
                    }
                    for (c cVar : t.this.d) {
                        if (cVar.j != null && str.equals(cVar.j.i())) {
                            cVar.j.a((Bitmap) pair.second);
                            cVar.a.setImageBitmap((Bitmap) pair.second);
                        }
                        if (cVar.k != null && str.equals(cVar.k.i())) {
                            cVar.k.a((Bitmap) pair.second);
                            cVar.b.setImageBitmap((Bitmap) pair.second);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            a(pair);
        }
    }

    public void a(A aVar) {
        this.f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.k != null) {
            this.k.onClick(view);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public static class d {
        m a;
        m b;
        CharSequence c;
        boolean d = false;

        public d(m mVar, m mVar2) {
            this.a = mVar;
            this.b = mVar2;
        }
    }

    public void d() {
        if (this.d != null) {
            this.d.clear();
        }
        this.k = null;
        this.f = null;
        this.a.clear();
    }
}
