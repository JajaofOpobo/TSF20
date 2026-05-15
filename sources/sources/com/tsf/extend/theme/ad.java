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
import com.tsf.extend.base.d.a;
import com.tsf.extend.f;
import com.tsf.extend.theme.v;
import com.tsf.extend.wallpaper.ad;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ad extends BaseAdapter {
    private List<c> a = Lists.newArrayList();
    private a b = new a();
    private View.OnClickListener c;
    private ad.a d;
    private int e;
    private int f;
    private Context g;
    private List<k> h;

    public static class b {
        View a;
        View b;
        ImageView c;
        TextView d;
    }

    public static class c {
        public b a = new b();
        public b b = new b();
        public b c = new b();
    }

    public ad(Context context) {
        this.g = context;
    }

    public void a(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public void a(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public void a(ad.a aVar) {
        this.d = aVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<k> listA = a();
        int size = listA == null ? 0 : listA.size();
        return (size / 3) + (size % 3 != 0 ? 1 : 0);
    }

    public View a(int i, k kVar, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f.C0052f.theme_mine_item, (ViewGroup) null);
    }

    public c a(View view) {
        c cVar = new c();
        cVar.a.a = view.findViewById(f.e.left_layout);
        cVar.a.c = (ImageView) view.findViewById(f.e.theme_img_left);
        cVar.a.d = (TextView) view.findViewById(f.e.theme_name_left);
        cVar.a.b = view.findViewById(f.e.theme_using_left);
        if (this.c != null) {
            cVar.a.a.setOnClickListener(this.c);
        }
        b(cVar.a.a);
        cVar.b.a = view.findViewById(f.e.center_layout);
        cVar.b.c = (ImageView) view.findViewById(f.e.theme_img_center);
        cVar.b.d = (TextView) view.findViewById(f.e.theme_name_center);
        cVar.b.b = view.findViewById(f.e.theme_using_center);
        if (this.c != null) {
            cVar.b.a.setOnClickListener(this.c);
        }
        b(cVar.b.a);
        cVar.c.a = view.findViewById(f.e.right_layout);
        cVar.c.c = (ImageView) view.findViewById(f.e.theme_img_right);
        cVar.c.d = (TextView) view.findViewById(f.e.theme_name_right);
        cVar.c.b = view.findViewById(f.e.theme_using_right);
        if (this.c != null) {
            cVar.c.a.setOnClickListener(this.c);
        }
        b(cVar.c.a);
        LinearLayout linearLayout = (LinearLayout) view;
        if (Build.VERSION.SDK_INT >= 11) {
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(this.d);
        }
        cVar.a.a.setSoundEffectsEnabled(true);
        cVar.b.a.setSoundEffectsEnabled(true);
        cVar.c.a.setSoundEffectsEnabled(true);
        this.a.add(cVar);
        return cVar;
    }

    public void a(int i, View view, c cVar) {
        if (i == getCount() - 1) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingTop());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        }
        a(b(i, 0), cVar.a.c, cVar.a.d, cVar.a.b, cVar.a.a);
        a(b(i, 1), cVar.b.c, cVar.b.d, cVar.b.b, cVar.b.a);
        a(b(i, 2), cVar.c.c, cVar.c.d, cVar.c.b, cVar.c.a);
    }

    private void b(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.e;
        layoutParams.height = this.f;
        view.setLayoutParams(layoutParams);
    }

    private void a(k kVar, ImageView imageView, TextView textView, View view, View view2) {
        imageView.setBackgroundResource(f.b.personal_list_item_bg);
        imageView.setImageDrawable(null);
        view2.setTag(kVar);
        if (kVar == null) {
            imageView.setVisibility(4);
            imageView.setBackgroundColor(0);
            view.setVisibility(8);
            textView.setText("");
            textView.setVisibility(8);
            return;
        }
        imageView.setTag(kVar.g());
        imageView.setVisibility(0);
        textView.setVisibility(0);
        textView.setText(kVar.i());
        view.setVisibility(kVar.n() ? 0 : 8);
        a(imageView, kVar, this.b);
    }

    private k b(int i, int i2) {
        List<k> listA = a();
        if (listA == null || (i * 3) + i2 >= listA.size()) {
            return null;
        }
        return listA.get((i * 3) + i2);
    }

    private class a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        private a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null && pair.first != null && pair.second != null) {
                for (c cVar : ad.this.a) {
                    a(pair, cVar.a);
                    a(pair, cVar.b);
                    a(pair, cVar.c);
                }
            }
        }

        private void a(Pair<String, Bitmap> pair, b bVar) {
            if (pair != null && bVar != null && bVar.c != null && bVar.c.getTag() != null && ((String) pair.first).equals(bVar.c.getTag())) {
                bVar.c.setImageBitmap((Bitmap) pair.second);
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    private void a(aq aqVar, final ImageView imageView) {
        v.h().a(aqVar.g(), aqVar, new a.InterfaceC0048a<v.b>() { // from class: com.tsf.extend.theme.ad.1
            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, final v.b bVar) {
                if (imageView != null && bVar != null && bVar.a != null && bVar.a.equals(imageView.getTag())) {
                    imageView.post(new Runnable() { // from class: com.tsf.extend.theme.ad.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bVar.b);
                        }
                    });
                }
            }

            @Override // com.tsf.extend.base.d.a.InterfaceC0048a
            public void a(JSONObject jSONObject, int i, v.b bVar) {
            }
        }, 2, 0);
    }

    private void a(k kVar, ImageView imageView, a.InterfaceC0048a interfaceC0048a) {
        String str = null;
        if (kVar.t() != null && kVar.t().get(0) != null) {
            str = kVar.t().get(0);
        }
        if (!TextUtils.isEmpty(str)) {
            Bitmap bitmapA = v.h().a(str);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                imageView.setTag(str);
                v.h().a(str, imageView, (a.InterfaceC0048a<Pair<String, Bitmap>>) interfaceC0048a, imageView.getWidth(), imageView.getHeight());
            }
        }
    }

    public void a(k kVar, final ImageView imageView) {
        Bitmap bitmapA = v.h().a("DEFAULT_THEME");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        } else {
            com.tsf.extend.base.j.z.a(2, new Runnable() { // from class: com.tsf.extend.theme.ad.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 2;
                        options.inJustDecodeBounds = false;
                        final Bitmap bitmapA2 = com.tsf.extend.wallpaper.ab.a(imageView.getContext(), options, false, false, 0);
                        if (bitmapA2 == null) {
                            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ad.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (TextUtils.isEmpty((String) imageView.getTag()) && imageView != null) {
                                        imageView.setImageBitmap(bitmapA2);
                                    }
                                }
                            });
                            return;
                        }
                        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.drawColor(-65536);
                        canvas.drawBitmap(bitmapA2, new Rect(0, 0, bitmapA2.getWidth() / 2, bitmapA2.getHeight()), new Rect(0, 0, imageView.getWidth(), imageView.getHeight()), (Paint) null);
                        if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                            bitmapA2.recycle();
                        }
                        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ad.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (TextUtils.isEmpty((String) imageView.getTag()) && imageView != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                            }
                        });
                    } catch (OutOfMemoryError e) {
                    }
                }
            });
        }
    }

    public void a(ImageView imageView, k kVar, a.InterfaceC0048a interfaceC0048a) {
        if (kVar.o()) {
            a(kVar, imageView);
        } else if (kVar instanceof aq) {
            a((aq) kVar, imageView);
        } else {
            a(kVar, imageView, interfaceC0048a);
        }
    }

    public void a(List<k> list) {
        this.h = list;
        notifyDataSetChanged();
    }

    public List<k> a() {
        return this.h;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k getItem(int i) {
        return this.h.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVarA;
        if (view == null) {
            view = a(i, getItem(i), viewGroup);
            cVarA = a(view);
            view.setTag(cVarA);
        } else {
            cVarA = (c) view.getTag();
        }
        a(i, view, cVarA);
        return view;
    }
}
