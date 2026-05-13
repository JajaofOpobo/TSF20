package com.tsf.extend.theme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1840e;
import com.tsf.extend.wallpaper.C2058aj;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ThemeLikedPager extends LinearLayout implements View.OnClickListener, PageActivity.InterfaceC1352a, C1840e.InterfaceC1841a {

    /* renamed from: a */
    private int f5189a;

    /* renamed from: b */
    private int f5190b;

    /* renamed from: c */
    private int f5191c;

    /* renamed from: d */
    private int f5192d;

    /* renamed from: e */
    private int f5193e;

    /* renamed from: f */
    private long f5194f;

    /* renamed from: g */
    private FrameLayout f5195g;

    /* renamed from: h */
    private View f5196h;

    /* renamed from: i */
    private TextView f5197i;

    /* renamed from: j */
    private Button f5198j;

    /* renamed from: k */
    private ListView f5199k;

    /* renamed from: l */
    private PageActivity f5200l;

    /* renamed from: m */
    private C1659ad f5201m;

    /* renamed from: n */
    private List<C1848k> f5202n;

    /* renamed from: o */
    private View$OnClickListenerC2040ad.C2044a f5203o;

    /* renamed from: p */
    private Runnable f5204p;

    public ThemeLikedPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5191c = 16;
        this.f5192d = 16;
        this.f5202n = Lists.newArrayList();
        this.f5204p = new Runnable() { // from class: com.tsf.extend.theme.ThemeLikedPager.1
            @Override // java.lang.Runnable
            public void run() {
                final List<C1848k> m7359a = C1840e.m7360a().m7359a(ThemeLikedPager.this.getContext());
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeLikedPager.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (m7359a != null && m7359a.size() > 0) {
                            ThemeLikedPager.this.f5202n.addAll(m7359a);
                            ThemeLikedPager.this.m8006h();
                            return;
                        }
                        ThemeLikedPager.this.m8005i();
                    }
                });
            }
        };
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m8007g();
    }

    /* renamed from: g */
    protected void m8007g() {
        setOnClickListener(this);
        C1840e.m7360a().m7357a(this);
        this.f5191c = PersonalizationActivity.m7012a(getContext(), this.f5191c);
        this.f5192d = PersonalizationActivity.m7012a(getContext(), this.f5192d);
        this.f5203o = new View$OnClickListenerC2040ad.C2044a(this.f5191c, this.f5192d);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5203o.setColor(0);
        }
        this.f5203o.setAlpha(77);
        this.f5189a = (getContent().getResources().getDisplayMetrics().widthPixels - (this.f5191c * 4)) / 3;
        this.f5190b = (int) (this.f5189a / 0.5f);
        this.f5193e = (int) getResources().getDimension(C1536f.C1539c.theme_name_layout_height);
        this.f5199k = new ListView(getContext());
        this.f5199k.setSelector(C1536f.C1540d.transparent_drawable);
        this.f5199k.setDivider(null);
        this.f5201m = new C1659ad(getContext());
        this.f5201m.m7908a((View.OnClickListener) this);
        this.f5201m.m7911a(this.f5189a, this.f5190b);
        this.f5201m.m7900a(this.f5203o);
        this.f5199k.setAdapter((ListAdapter) this.f5201m);
        this.f5199k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f5195g = (FrameLayout) findViewById(C1536f.C1541e.theme_liked_list_content);
        this.f5196h = findViewById(C1536f.C1541e.theme_liked_empty_data);
        this.f5195g.addView(this.f5199k);
        this.f5198j = (Button) findViewById(C1536f.C1541e.like_theme_button_now);
        this.f5198j.setOnClickListener(this);
        this.f5197i = (TextView) findViewById(C1536f.C1541e.title);
        this.f5197i.setText(C1536f.C1543g.wallpaper_mine_favorite);
        this.f5197i.setOnClickListener(this);
        Bitmap m8676a = C1426e.m8676a(getContext());
        PageActivity pageActivity = (PageActivity) getContext();
        this.f5198j.setSoundEffectsEnabled(true);
        this.f5197i.setSoundEffectsEnabled(true);
        if (m8676a != null) {
            ((ImageView) findViewById(C1536f.C1541e.like_theme_image)).setImageBitmap(m8676a);
        } else {
            ((ImageView) findViewById(C1536f.C1541e.like_theme_image)).setImageResource(C1536f.C1540d.wallpaper_favorite_btn);
        }
        C1455z.m8564a(1, this.f5204p);
        m8008a("1", "DefaultLike");
        setPadding(0, getPaddingTop(), 0, C1437p.m8615c(getContext()));
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return true;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        this.f5200l = pageActivity;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
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
        C1840e.m7360a().m7353b(this);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        return false;
    }

    /* renamed from: h */
    public void m8006h() {
        this.f5196h.setVisibility(8);
        this.f5195g.setVisibility(0);
        this.f5201m.m7899a(this.f5202n);
    }

    /* renamed from: i */
    public void m8005i() {
        this.f5196h.setVisibility(0);
        this.f5195g.setVisibility(8);
        m8008a("2", "DefaultLike");
    }

    @Override // com.tsf.extend.theme.C1840e.InterfaceC1841a
    /* renamed from: a */
    public void mo7351a(C1848k c1848k) {
        this.f5202n.add(0, c1848k);
        m8006h();
    }

    @Override // com.tsf.extend.theme.C1840e.InterfaceC1841a
    /* renamed from: b */
    public void mo7350b(C1848k c1848k) {
        if (c1848k != null && c1848k.m7300g() != null && this.f5202n.size() > 0) {
            Iterator<C1848k> it = this.f5202n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1848k next = it.next();
                if (c1848k.m7300g().equals(next.m7300g())) {
                    this.f5202n.remove(next);
                    break;
                }
            }
            this.f5201m.notifyDataSetChanged();
            if (this.f5202n.size() <= 0) {
                m8005i();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f5197i) {
            m8008a("4", "DefaultLike");
            this.f5200l.onBackPressed();
        } else if (view == this.f5198j) {
            m8008a("3", "DefaultLike");
            Intent intent = new Intent(this.f5200l, PersonalizationActivity.class);
            intent.putExtra("TARGET_PAGE", 1);
            this.f5200l.startActivity(intent);
            this.f5200l.onBackPressed();
        } else if (view != this && Math.abs(this.f5194f - System.currentTimeMillis()) > 1000) {
            this.f5194f = System.currentTimeMillis();
            C1848k c1848k = (C1848k) view.getTag();
            if (c1848k != null) {
                if (C2058aj.m6554a(getContext(), c1848k.m7300g())) {
                    this.f5200l.m8921a(false);
                    return;
                }
                m8008a("5", c1848k.m7300g());
                int mo7323a = c1848k.mo7323a();
                if (mo7323a == 3 || mo7323a == 2) {
                    DIYThemeDetail dIYThemeDetail = (DIYThemeDetail) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.diy_theme_detail, (ViewGroup) null);
                    dIYThemeDetail.m8211g();
                    dIYThemeDetail.setTheme(c1848k);
                    this.f5200l.m8922a(dIYThemeDetail);
                    return;
                }
                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
                themeDetail.m8072g();
                themeDetail.setTheme(c1848k);
                this.f5200l.m8922a(themeDetail);
            }
        }
    }

    private int getItemCount() {
        return (this.f5202n.size() % 3 == 0 ? 0 : 1) + (this.f5202n.size() / 3);
    }

    /* renamed from: a */
    private void m8008a(String str, String str2) {
        if (AbstractC1700aq.m7751r(str2) != null) {
        }
    }
}
