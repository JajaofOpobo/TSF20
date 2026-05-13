package com.tsf.extend.base.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class PageIndicatorMarkerCompat extends FrameLayout {

    /* renamed from: a */
    private ImageView f4553a;

    /* renamed from: b */
    private ImageView f4554b;

    /* renamed from: c */
    private boolean f4555c;

    public PageIndicatorMarkerCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorMarkerCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4555c = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        this.f4553a = (ImageView) findViewById(C1536f.C1541e.active);
        this.f4554b = (ImageView) findViewById(C1536f.C1541e.inactive);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8488a(int i, int i2) {
        Resources resources = getResources();
        this.f4553a.setImageDrawable(resources.getDrawable(i));
        this.f4554b.setImageDrawable(resources.getDrawable(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8487a(boolean z) {
        if (!this.f4555c) {
            if (z) {
                this.f4553a.animate().cancel();
                this.f4553a.setAlpha(1.0f);
                this.f4553a.setScaleX(1.0f);
                this.f4553a.setScaleY(1.0f);
                this.f4554b.animate().cancel();
                this.f4554b.setAlpha(0.0f);
            } else {
                this.f4553a.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(175L).start();
                this.f4554b.animate().alpha(0.0f).setDuration(175L).start();
            }
            this.f4555c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8486b(boolean z) {
        if (this.f4555c) {
            if (z) {
                this.f4554b.animate().cancel();
                this.f4554b.setAlpha(1.0f);
                this.f4553a.animate().cancel();
                this.f4553a.setAlpha(0.0f);
                this.f4553a.setScaleX(0.5f);
                this.f4553a.setScaleY(0.5f);
            } else {
                this.f4554b.animate().alpha(1.0f).setDuration(175L).start();
                this.f4553a.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(175L).start();
            }
            this.f4555c = false;
        }
    }
}
