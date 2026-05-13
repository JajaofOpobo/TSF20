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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.wallpaper.C2077i;
import com.tsf.extend.wallpaper.View$OnClickListenerC2040ad;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.wallpaper.e */
/* loaded from: classes.dex */
public class View$OnClickListenerC2066e extends FrameLayout implements View.OnClickListener, PageActivity.InterfaceC1352a, C2077i.InterfaceC2081a {

    /* renamed from: a */
    private ListView f6739a;

    /* renamed from: b */
    private View$OnClickListenerC2107t f6740b;

    /* renamed from: c */
    private View$OnClickListenerC2040ad.C2044a f6741c;

    /* renamed from: d */
    private List<C2094m> f6742d;

    /* renamed from: e */
    private PageActivity f6743e;

    /* renamed from: f */
    private C2026aa f6744f;

    /* renamed from: g */
    private View f6745g;

    public View$OnClickListenerC2066e(Context context) {
        super(context);
        setPadding(0, context.getResources().getDimensionPixelSize(C1536f.C1539c.workspace_margin_top), 0, 0);
        setBackgroundColor(2565927);
        this.f6744f = C2026aa.m6695a();
        this.f6743e = (PageActivity) context;
        this.f6742d = Lists.newArrayList();
        LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_title_layout, this);
        TextView textView = (TextView) findViewById(C1536f.C1541e.title);
        textView.setText(C1536f.C1543g.wallpaper_mine_favorite);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View$OnClickListenerC2066e.this.f6743e.onBackPressed();
            }
        });
        this.f6739a = new ListView(context);
        this.f6739a.setBackgroundColor(-1118482);
        this.f6739a.setSelector(C1536f.C1540d.transparent_drawable);
        this.f6745g = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.no_liked_layout, (ViewGroup) null);
        this.f6745g.setBackgroundColor(-1118482);
        ((TextView) this.f6745g.findViewById(C1536f.C1541e.like_theme_text)).setText(C1536f.C1543g.wallpaper_like_no_data_tip);
        Button button = (Button) this.f6745g.findViewById(C1536f.C1541e.like_theme_button_now);
        button.setText(C1536f.C1543g.wallpaper_like_no_data_button_text);
        button.setOnClickListener(this);
        Bitmap m8676a = C1426e.m8676a(this.f6743e);
        if (m8676a != null) {
            ((ImageView) this.f6745g.findViewById(C1536f.C1541e.like_theme_image)).setImageBitmap(m8676a);
        } else {
            ((ImageView) this.f6745g.findViewById(C1536f.C1541e.like_theme_image)).setImageResource(C1536f.C1540d.wallpaper_favorite_btn);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = PersonalizationActivity.m7012a(this.f6743e, 48.0f);
        addView(this.f6745g, layoutParams);
        addView(this.f6739a, layoutParams);
        this.f6745g.setVisibility(8);
        View view = new View(getContext());
        view.setBackgroundResource(C1536f.C1540d.personal_indicator_bottom_divider);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, PersonalizationActivity.m7012a(this.f6743e, 1.0f));
        layoutParams2.topMargin = PersonalizationActivity.m7012a(this.f6743e, 48.0f);
        addView(view, layoutParams2);
        this.f6740b = new View$OnClickListenerC2107t(getContext(), EnumC2057ai.FavoriteType);
        this.f6740b.m6399a(this);
        View view2 = new View(getContext());
        View view3 = new View(getContext());
        int m7012a = PersonalizationActivity.m7012a(this.f6743e, 2.0f);
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.f6739a.addHeaderView(view2, null, false);
        view3.setLayoutParams(new AbsListView.LayoutParams(-1, m7012a));
        this.f6739a.addFooterView(view3, null, false);
        this.f6741c = this.f6740b.m6401a();
        this.f6739a.setDivider(this.f6741c);
        this.f6739a.setAdapter((ListAdapter) this.f6740b);
        this.f6744f.m6687a(this);
        setListUi(null);
        setOnClickListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6740b = new View$OnClickListenerC2107t(getContext(), EnumC2057ai.FavoriteType);
        this.f6740b.m6394a(this.f6742d);
        this.f6740b.m6399a(this);
        this.f6739a.setAdapter((ListAdapter) this.f6740b);
        this.f6744f.m6676c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6744f.m6673d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListUi(List<C2094m> list) {
        this.f6742d.clear();
        if (list == null || list.size() == 0) {
            this.f6745g.setVisibility(0);
            this.f6739a.setEmptyView(this.f6745g);
        } else {
            this.f6742d.addAll(list);
        }
        this.f6740b.m6394a(this.f6742d);
        this.f6740b.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() instanceof C2106s) {
            WallpaperDetail wallpaperDetail = (WallpaperDetail) LayoutInflater.from(view.getContext()).inflate(C1536f.C1542f.wallpaper_detail, (ViewGroup) null);
            wallpaperDetail.setType(EnumC2057ai.FavoriteType);
            ArrayList newArrayList = Lists.newArrayList();
            newArrayList.addAll(this.f6742d);
            C2058aj.m6551a(newArrayList);
            wallpaperDetail.m6854a((List<? extends C2106s>) newArrayList, (C2106s) ((C2094m) view.getTag()), false);
            this.f6743e.m8922a(wallpaperDetail);
        } else if (view.getId() == C1536f.C1541e.like_theme_button_now) {
            Intent intent = new Intent(this.f6743e, PersonalizationActivity.class);
            intent.putExtra("TARGET_PAGE", 2);
            this.f6743e.startActivity(intent);
            this.f6743e.onBackPressed();
        }
    }

    @Override // com.tsf.extend.wallpaper.C2077i.InterfaceC2081a
    /* renamed from: a */
    public void mo6477a(C2077i.InterfaceC2081a.EnumC2082a enumC2082a, final Object obj, C2077i.InterfaceC2081a.EnumC2083b enumC2083b) {
        if (enumC2082a == C2077i.InterfaceC2081a.EnumC2082a.getList) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.e.2
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC2066e.this.setListUi((List) obj);
                }
            });
        }
        if (enumC2082a == C2077i.InterfaceC2081a.EnumC2082a.notify) {
            this.f6744f.m6687a(this);
        }
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
        if (pageActivity instanceof PersonalizationActivity) {
            setPadding(0, getPaddingTop(), 0, ((PersonalizationActivity) pageActivity).f6216f);
        }
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
}
