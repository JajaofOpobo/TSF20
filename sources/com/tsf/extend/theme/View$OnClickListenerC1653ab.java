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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.support.AbstractC1468a;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.theme.C1894v;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.ab */
/* loaded from: classes.dex */
public class View$OnClickListenerC1653ab extends FrameLayout implements View.OnClickListener, PageActivity.InterfaceC1352a {

    /* renamed from: a */
    public int f5295a;

    /* renamed from: b */
    public List<ThemeImageView> f5296b;

    /* renamed from: c */
    private PageActivity f5297c;

    /* renamed from: d */
    private ViewPager f5298d;

    /* renamed from: e */
    private C1655b f5299e;

    /* renamed from: f */
    private List<Integer> f5300f;

    /* renamed from: g */
    private List<String> f5301g;

    /* renamed from: h */
    private List<String> f5302h;

    /* renamed from: i */
    private boolean f5303i;

    /* renamed from: j */
    private boolean f5304j;

    /* renamed from: k */
    private String f5305k;

    public View$OnClickListenerC1653ab(Context context) {
        super(context);
        this.f5300f = Lists.newArrayList();
        this.f5301g = Lists.newArrayList();
        this.f5302h = Lists.newArrayList();
        this.f5295a = 0;
        this.f5296b = Lists.newArrayList();
        this.f5298d = new ViewPager(getContext());
        this.f5298d.setOffscreenPageLimit(2);
        this.f5299e = new C1655b();
        this.f5298d.setBackgroundColor(-1);
        this.f5298d.setAdapter(this.f5299e);
        addView(this.f5298d, new FrameLayout.LayoutParams(-1, -1));
        setPadding(0, 0, 0, C1437p.m8615c(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.ab$b */
    /* loaded from: classes.dex */
    public class C1655b extends AbstractC1468a {

        /* renamed from: b */
        private C1654a f5308b;

        /* renamed from: c */
        private FrameLayout.LayoutParams f5309c = new FrameLayout.LayoutParams(-1, -1);

        public C1655b() {
            this.f5308b = new C1654a();
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public int mo6712a() {
            return View$OnClickListenerC1653ab.this.f5295a;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public boolean mo6711a(View view, Object obj) {
            return view == obj;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: b */
        public View mo6710a(ViewGroup viewGroup, int i) {
            final ThemeImageView themeImageView = new ThemeImageView(View$OnClickListenerC1653ab.this.getContext());
            themeImageView.setBackgroundResource(C1536f.C1540d.hourglass);
            View$OnClickListenerC1653ab.this.f5296b.add(themeImageView);
            if (View$OnClickListenerC1653ab.this.f5303i) {
                C1894v.m7069h().m7113a(((Integer) View$OnClickListenerC1653ab.this.f5300f.get(i)).intValue(), View$OnClickListenerC1653ab.this.f5305k, new AbstractC1386a.InterfaceC1396a<C1894v.C1916b>() { // from class: com.tsf.extend.theme.ab.b.1
                    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6245a(JSONObject jSONObject, C1894v.C1916b c1916b) {
                        if (themeImageView != null && c1916b != null) {
                            themeImageView.setBitmap(c1916b.f6163b);
                        }
                    }

                    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6247a(JSONObject jSONObject, int i2, C1894v.C1916b c1916b) {
                    }
                }, 0);
            } else if (View$OnClickListenerC1653ab.this.f5304j) {
                C1894v.m7069h().m7091a(View$OnClickListenerC1653ab.this.f5305k, View$OnClickListenerC1653ab.this.f5301g, new AbstractC1386a.InterfaceC1396a<C1894v.C1916b>() { // from class: com.tsf.extend.theme.ab.b.2
                    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6245a(JSONObject jSONObject, C1894v.C1916b c1916b) {
                        if (themeImageView != null && c1916b != null) {
                            themeImageView.setBitmap(c1916b.f6163b);
                        }
                    }

                    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo6247a(JSONObject jSONObject, int i2, C1894v.C1916b c1916b) {
                    }
                }, 0, i);
            } else {
                String str = (String) View$OnClickListenerC1653ab.this.f5302h.get(i);
                themeImageView.setTag(str);
                C1894v.m7069h().m7079c(str, this.f5308b);
            }
            themeImageView.setOnClickListener(View$OnClickListenerC1653ab.this);
            themeImageView.setSoundEffectsEnabled(true);
            viewGroup.addView(themeImageView, this.f5309c);
            return themeImageView;
        }

        @Override // com.tsf.extend.base.support.AbstractC1468a
        /* renamed from: a */
        public void mo6709a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            if (View$OnClickListenerC1653ab.this.f5296b != null) {
                View$OnClickListenerC1653ab.this.f5296b.remove(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.ab$a */
    /* loaded from: classes.dex */
    public class C1654a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        C1654a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                String str = (String) pair.first;
                Bitmap bitmap = (Bitmap) pair.second;
                if (!TextUtils.isEmpty(str) && bitmap != null) {
                    for (ThemeImageView themeImageView : View$OnClickListenerC1653ab.this.f5296b) {
                        if (((String) themeImageView.getTag()).equals(str)) {
                            themeImageView.setBitmap(bitmap);
                        }
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        this.f5297c = pageActivity;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
        setFullScreen(true);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
        setFullScreen(false);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        return false;
    }

    public void setFullScreen(boolean z) {
        if (z) {
            this.f5297c.getWindow().addFlags(1024);
            this.f5297c.getWindow().clearFlags(2048);
            return;
        }
        setVisibility(8);
        if (this.f5298d != null) {
            this.f5298d.setVisibility(8);
        }
        this.f5297c.getWindow().addFlags(2048);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f5297c.onBackPressed();
    }

    /* renamed from: a */
    public void m7932a(String str, List<Integer> list, int i) {
        this.f5303i = true;
        this.f5305k = str;
        this.f5300f.addAll(list);
        this.f5295a = this.f5300f.size();
        this.f5298d.setCurrentItem(i);
        this.f5299e.m8498c();
    }

    /* renamed from: a */
    public void m7931a(List<String> list, int i) {
        this.f5304j = true;
        this.f5305k = "DIY";
        this.f5301g.addAll(list);
        this.f5295a = this.f5301g.size();
        this.f5298d.setCurrentItem(i);
        this.f5299e.m8498c();
    }

    /* renamed from: b */
    public void m7929b(List<String> list, int i) {
        this.f5303i = false;
        this.f5302h.addAll(list);
        this.f5295a = this.f5302h.size();
        this.f5298d.setCurrentItem(i);
        this.f5299e.m8498c();
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }
}
