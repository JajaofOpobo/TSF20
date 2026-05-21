package com.tsf.extend.wallpaper;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperCategoryList extends LinearLayout implements PageActivity.a {
    private PageActivity a;
    private ad b;
    private TextView c;
    private FrameLayout d;
    private boolean e;

    public WallpaperCategoryList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(f.e.title);
        this.d = (FrameLayout) findViewById(f.e.container);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.wallpaper.WallpaperCategoryList.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WallpaperCategoryList.this.a.onBackPressed();
            }
        });
        setOnClickListener(null);
    }

    public void a(PageActivity pageActivity, w wVar, boolean z) {
        this.e = z;
        this.a = pageActivity;
        this.c.setText(z.h().a(getContext(), wVar.a()));
        this.b = new ad(pageActivity, wVar.a());
        this.b.setChooseWallpaperOnLine(z);
        this.b.setBackgroundColor(-1118482);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int iC = com.tsf.extend.base.j.p.c(getContext());
        if (iC != 0) {
            this.b.setPadding(0, 0, 0, iC);
        }
        if (this.e) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        }
        if (this.d != null) {
            this.d.addView(this.b, 0, layoutParams);
        } else {
            addView(this.b, layoutParams);
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
    public boolean e() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }
}
