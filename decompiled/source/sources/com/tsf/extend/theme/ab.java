package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.f;
import com.tsf.extend.theme.v;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ab extends FrameLayout implements View.OnClickListener, PageActivity.a {
    public int a;
    public List<ThemeImageView> b;
    private PageActivity c;
    private ViewPager d;
    private b e;
    private List<Integer> f;
    private List<String> g;
    private List<String> h;
    private boolean i;
    private boolean j;
    private String k;

    public ab(Context context) {
        super(context);
        this.f = Lists.newArrayList();
        this.g = Lists.newArrayList();
        this.h = Lists.newArrayList();
        this.a = 0;
        this.b = Lists.newArrayList();
        this.d = new ViewPager(getContext());
        this.d.setOffscreenPageLimit(2);
        this.e = new b();
        this.d.setBackgroundColor(-1);
        this.d.setAdapter(this.e);
        addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        setPadding(0, 0, 0, com.tsf.extend.base.j.p.c(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends com.tsf.extend.base.support.a {
        private a b;
        private FrameLayout.LayoutParams c = new FrameLayout.LayoutParams(-1, -1);

        public b() {
            this.b = new a();
        }

        @Override // com.tsf.extend.base.support.a
        public int a() {
            return ab.this.a;
        }

        @Override // com.tsf.extend.base.support.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }

        @Override // com.tsf.extend.base.support.a
        /* renamed from: b */
        public View a(ViewGroup viewGroup, int i) {
            final ThemeImageView themeImageView = new ThemeImageView(ab.this.getContext());
            themeImageView.setBackgroundResource(f.d.hourglass);
            ab.this.b.add(themeImageView);
            if (ab.this.i) {
                v.h().a(((Integer) ab.this.f.get(i)).intValue(), ab.this.k, new a.InterfaceC0048a<v.b>() { // from class: com.tsf.extend.theme.ab.b.1
                    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                    public void a(JSONObject jSONObject, v.b bVar) {
                        if (themeImageView != null && bVar != null) {
                            themeImageView.setBitmap(bVar.b);
                        }
                    }

                    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                    public void a(JSONObject jSONObject, int i2, v.b bVar) {
                    }
                }, 0);
            } else if (ab.this.j) {
                v.h().a(ab.this.k, ab.this.g, new a.InterfaceC0048a<v.b>() { // from class: com.tsf.extend.theme.ab.b.2
                    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                    public void a(JSONObject jSONObject, v.b bVar) {
                        if (themeImageView != null && bVar != null) {
                            themeImageView.setBitmap(bVar.b);
                        }
                    }

                    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
                    public void a(JSONObject jSONObject, int i2, v.b bVar) {
                    }
                }, 0, i);
            } else {
                String str = (String) ab.this.h.get(i);
                themeImageView.setTag(str);
                v.h().c(str, this.b);
            }
            themeImageView.setOnClickListener(ab.this);
            themeImageView.setSoundEffectsEnabled(true);
            viewGroup.addView(themeImageView, this.c);
            return themeImageView;
        }

        @Override // com.tsf.extend.base.support.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            if (ab.this.b != null) {
                ab.this.b.remove(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (ThemeImageView themeImageView : ab.this.b) {
                        if (((String) themeImageView.getTag()).equals(str)) {
                            themeImageView.setBitmap(bitmap);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        this.c = pageActivity;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
        setFullScreen(true);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
        setFullScreen(false);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        return false;
    }

    public void setFullScreen(boolean z) {
        if (z) {
            this.c.getWindow().addFlags(1024);
            this.c.getWindow().clearFlags(2048);
            return;
        }
        setVisibility(8);
        if (this.d != null) {
            this.d.setVisibility(8);
        }
        this.c.getWindow().addFlags(2048);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.c.onBackPressed();
    }

    public void a(String str, List<Integer> list, int i) {
        this.i = true;
        this.k = str;
        this.f.addAll(list);
        this.a = this.f.size();
        this.d.setCurrentItem(i);
        this.e.c();
    }

    public void a(List<String> list, int i) {
        this.j = true;
        this.k = "DIY";
        this.g.addAll(list);
        this.a = this.g.size();
        this.d.setCurrentItem(i);
        this.e.c();
    }

    public void b(List<String> list, int i) {
        this.i = false;
        this.h.addAll(list);
        this.a = this.h.size();
        this.d.setCurrentItem(i);
        this.e.c();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }
}
