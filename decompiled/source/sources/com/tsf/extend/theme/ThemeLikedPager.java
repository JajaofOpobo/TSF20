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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import com.tsf.extend.theme.e;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.ad;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ThemeLikedPager extends LinearLayout implements View.OnClickListener, PageActivity.a, e.a {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private long f;
    private FrameLayout g;
    private View h;
    private TextView i;
    private Button j;
    private ListView k;
    private PageActivity l;
    private ad m;
    private List<k> n;
    private ad.a o;
    private Runnable p;

    public ThemeLikedPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 16;
        this.d = 16;
        this.n = Lists.newArrayList();
        this.p = new Runnable() { // from class: com.tsf.extend.theme.ThemeLikedPager.1
            @Override // java.lang.Runnable
            public void run() {
                final List<k> a = e.a().a(ThemeLikedPager.this.getContext());
                com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.theme.ThemeLikedPager.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (a != null && a.size() > 0) {
                            ThemeLikedPager.this.n.addAll(a);
                            ThemeLikedPager.this.h();
                            return;
                        }
                        ThemeLikedPager.this.i();
                    }
                });
            }
        };
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    protected void g() {
        setOnClickListener(this);
        e.a().a(this);
        this.c = PersonalizationActivity.a(getContext(), this.c);
        this.d = PersonalizationActivity.a(getContext(), this.d);
        this.o = new ad.a(this.c, this.d);
        if (Build.VERSION.SDK_INT >= 11) {
            this.o.setColor(0);
        }
        this.o.setAlpha(77);
        this.a = (getContent().getResources().getDisplayMetrics().widthPixels - (this.c * 4)) / 3;
        this.b = (int) (this.a / 0.5f);
        this.e = (int) getResources().getDimension(f.c.theme_name_layout_height);
        this.k = new ListView(getContext());
        this.k.setSelector(f.d.transparent_drawable);
        this.k.setDivider(null);
        this.m = new ad(getContext());
        this.m.a((View.OnClickListener) this);
        this.m.a(this.a, this.b);
        this.m.a(this.o);
        this.k.setAdapter((ListAdapter) this.m);
        this.k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g = (FrameLayout) findViewById(f.e.theme_liked_list_content);
        this.h = findViewById(f.e.theme_liked_empty_data);
        this.g.addView(this.k);
        this.j = (Button) findViewById(f.e.like_theme_button_now);
        this.j.setOnClickListener(this);
        this.i = (TextView) findViewById(f.e.title);
        this.i.setText(f.g.wallpaper_mine_favorite);
        this.i.setOnClickListener(this);
        Bitmap a = com.tsf.extend.base.j.e.a(getContext());
        PageActivity pageActivity = (PageActivity) getContext();
        this.j.setSoundEffectsEnabled(true);
        this.i.setSoundEffectsEnabled(true);
        if (a != null) {
            ((ImageView) findViewById(f.e.like_theme_image)).setImageBitmap(a);
        } else {
            ((ImageView) findViewById(f.e.like_theme_image)).setImageResource(f.d.wallpaper_favorite_btn);
        }
        com.tsf.extend.base.j.z.a(1, this.p);
        a("1", "DefaultLike");
        setPadding(0, getPaddingTop(), 0, com.tsf.extend.base.j.p.c(getContext()));
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return true;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        this.l = pageActivity;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
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
        e.a().b(this);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        return false;
    }

    public void h() {
        this.h.setVisibility(8);
        this.g.setVisibility(0);
        this.m.a(this.n);
    }

    public void i() {
        this.h.setVisibility(0);
        this.g.setVisibility(8);
        a("2", "DefaultLike");
    }

    @Override // com.tsf.extend.theme.e.a
    public void a(k kVar) {
        this.n.add(0, kVar);
        h();
    }

    @Override // com.tsf.extend.theme.e.a
    public void b(k kVar) {
        if (kVar != null && kVar.g() != null && this.n.size() > 0) {
            Iterator<k> it = this.n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k next = it.next();
                if (kVar.g().equals(next.g())) {
                    this.n.remove(next);
                    break;
                }
            }
            this.m.notifyDataSetChanged();
            if (this.n.size() <= 0) {
                i();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.i) {
            a("4", "DefaultLike");
            this.l.onBackPressed();
        } else if (view == this.j) {
            a("3", "DefaultLike");
            Intent intent = new Intent(this.l, PersonalizationActivity.class);
            intent.putExtra("TARGET_PAGE", 1);
            this.l.startActivity(intent);
            this.l.onBackPressed();
        } else if (view != this && Math.abs(this.f - System.currentTimeMillis()) > 1000) {
            this.f = System.currentTimeMillis();
            k kVar = (k) view.getTag();
            if (kVar != null) {
                if (com.tsf.extend.wallpaper.aj.a(getContext(), kVar.g())) {
                    this.l.a(false);
                    return;
                }
                a("5", kVar.g());
                int a = kVar.a();
                if (a == 3 || a == 2) {
                    DIYThemeDetail dIYThemeDetail = (DIYThemeDetail) LayoutInflater.from(getContext()).inflate(f.C0052f.diy_theme_detail, (ViewGroup) null);
                    dIYThemeDetail.g();
                    dIYThemeDetail.setTheme(kVar);
                    this.l.a(dIYThemeDetail);
                    return;
                }
                ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_detail, (ViewGroup) null);
                themeDetail.g();
                themeDetail.setTheme(kVar);
                this.l.a(themeDetail);
            }
        }
    }

    private int getItemCount() {
        return (this.n.size() % 3 == 0 ? 0 : 1) + (this.n.size() / 3);
    }

    private void a(String str, String str2) {
        if (aq.r(str2) != null) {
        }
    }
}
