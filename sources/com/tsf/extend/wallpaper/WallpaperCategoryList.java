package com.tsf.extend.wallpaper;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p080j.C1437p;
/* loaded from: classes.dex */
public class WallpaperCategoryList extends LinearLayout implements PageActivity.InterfaceC1352a {

    /* renamed from: a */
    private PageActivity f6297a;

    /* renamed from: b */
    private View$OnClickListenerC2040ad f6298b;

    /* renamed from: c */
    private TextView f6299c;

    /* renamed from: d */
    private FrameLayout f6300d;

    /* renamed from: e */
    private boolean f6301e;

    public WallpaperCategoryList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6301e = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6299c = (TextView) findViewById(C1536f.C1541e.title);
        this.f6300d = (FrameLayout) findViewById(C1536f.C1541e.container);
        this.f6299c.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperCategoryList.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WallpaperCategoryList.this.f6297a.onBackPressed();
            }
        });
        setOnClickListener(null);
    }

    /* renamed from: a */
    public void m6922a(PageActivity pageActivity, C2145w c2145w, boolean z) {
        this.f6301e = z;
        this.f6297a = pageActivity;
        this.f6299c.setText(C2148z.m6199h().m6218a(getContext(), c2145w.m6244a()));
        this.f6298b = new View$OnClickListenerC2040ad(pageActivity, c2145w.m6244a());
        this.f6298b.setChooseWallpaperOnLine(z);
        this.f6298b.setBackgroundColor(-1118482);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int m8615c = C1437p.m8615c(getContext());
        if (m8615c != 0) {
            this.f6298b.setPadding(0, 0, 0, m8615c);
        }
        if (this.f6301e) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        }
        if (this.f6300d != null) {
            this.f6300d.addView(this.f6298b, 0, layoutParams);
        } else {
            addView(this.f6298b, layoutParams);
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
    /* renamed from: e */
    public boolean mo6529e() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }
}
