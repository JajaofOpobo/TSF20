package com.tsf.extend.wallpaper;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.ad;
import com.tsf.extend.wallpaper.i;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class e extends FrameLayout implements View.OnClickListener, PageActivity.a, i.a {
    private ListView a;
    private t b;
    private ad.a c;
    private List<m> d;
    private PageActivity e;
    private aa f;
    private View g;

    public e(Context context) {
        super(context);
        setPadding(0, context.getResources().getDimensionPixelSize(f.c.workspace_margin_top), 0, 0);
        setBackgroundColor(2565927);
        this.f = aa.a();
        this.e = (PageActivity) context;
        this.d = Lists.newArrayList();
        LayoutInflater.from(getContext()).inflate(f.C0052f.wallpaper_title_layout, this);
        TextView textView = (TextView) findViewById(f.e.title);
        textView.setText(f.g.wallpaper_mine_favorite);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.e.onBackPressed();
            }
        });
        this.a = new ListView(context);
        this.a.setBackgroundColor(-1118482);
        this.a.setSelector(f.d.transparent_drawable);
        this.g = LayoutInflater.from(getContext()).inflate(f.C0052f.no_liked_layout, (ViewGroup) null);
        this.g.setBackgroundColor(-1118482);
        ((TextView) this.g.findViewById(f.e.like_theme_text)).setText(f.g.wallpaper_like_no_data_tip);
        Button button = (Button) this.g.findViewById(f.e.like_theme_button_now);
        button.setText(f.g.wallpaper_like_no_data_button_text);
        button.setOnClickListener(this);
        Bitmap a = com.tsf.extend.base.j.e.a(this.e);
        if (a != null) {
            ((ImageView) this.g.findViewById(f.e.like_theme_image)).setImageBitmap(a);
        } else {
            ((ImageView) this.g.findViewById(f.e.like_theme_image)).setImageResource(f.d.wallpaper_favorite_btn);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = PersonalizationActivity.a(this.e, 48.0f);
        addView(this.g, layoutParams);
        addView(this.a, layoutParams);
        this.g.setVisibility(8);
        View view = new View(getContext());
        view.setBackgroundResource(f.d.personal_indicator_bottom_divider);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, PersonalizationActivity.a(this.e, 1.0f));
        layoutParams2.topMargin = PersonalizationActivity.a(this.e, 48.0f);
        addView(view, layoutParams2);
        this.b = new t(getContext(), ai.FavoriteType);
        this.b.a(this);
        View view2 = new View(getContext());
        View view3 = new View(getContext());
        int a2 = PersonalizationActivity.a(this.e, 2.0f);
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.a.addHeaderView(view2, null, false);
        view3.setLayoutParams(new AbsListView.LayoutParams(-1, a2));
        this.a.addFooterView(view3, null, false);
        this.c = this.b.a();
        this.a.setDivider(this.c);
        this.a.setAdapter((ListAdapter) this.b);
        this.f.a(this);
        setListUi(null);
        setOnClickListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = new t(getContext(), ai.FavoriteType);
        this.b.a(this.d);
        this.b.a(this);
        this.a.setAdapter((ListAdapter) this.b);
        this.f.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListUi(List<m> list) {
        this.d.clear();
        if (list == null || list.size() == 0) {
            this.g.setVisibility(0);
            this.a.setEmptyView(this.g);
        } else {
            this.d.addAll(list);
        }
        this.b.a(this.d);
        this.b.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() instanceof s) {
            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(f.C0052f.wallpaper_detail, (ViewGroup) null);
            wallpaperDetail.setType(ai.FavoriteType);
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.addAll(this.d);
            aj.a(newArrayList);
            wallpaperDetail.a((List<? extends s>) newArrayList, (s) ((m) view.getTag()), false);
            this.e.a(wallpaperDetail);
        } else if (view.getId() == f.e.like_theme_button_now) {
            Intent intent = new Intent(this.e, PersonalizationActivity.class);
            intent.putExtra("TARGET_PAGE", 2);
            this.e.startActivity(intent);
            this.e.onBackPressed();
        }
    }

    @Override // com.tsf.extend.wallpaper.i.a
    public void a(i.a.EnumC0069a enumC0069a, final Object obj, i.a.b bVar) {
        if (enumC0069a == i.a.EnumC0069a.getList) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.setListUi((List) obj);
                }
            });
        }
        if (enumC0069a == i.a.EnumC0069a.notify) {
            this.f.a(this);
        }
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
        if (pageActivity instanceof PersonalizationActivity) {
            setPadding(0, getPaddingTop(), 0, ((PersonalizationActivity) pageActivity).f);
        }
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
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        return false;
    }
}
