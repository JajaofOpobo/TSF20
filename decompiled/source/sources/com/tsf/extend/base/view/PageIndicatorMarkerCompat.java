package com.tsf.extend.base.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class PageIndicatorMarkerCompat extends FrameLayout {
    private ImageView a;
    private ImageView b;
    private boolean c;

    public PageIndicatorMarkerCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorMarkerCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        this.a = (ImageView) findViewById(f.e.active);
        this.b = (ImageView) findViewById(f.e.inactive);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        Resources resources = getResources();
        this.a.setImageDrawable(resources.getDrawable(i));
        this.b.setImageDrawable(resources.getDrawable(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (!this.c) {
            if (z) {
                this.a.animate().cancel();
                this.a.setAlpha(1.0f);
                this.a.setScaleX(1.0f);
                this.a.setScaleY(1.0f);
                this.b.animate().cancel();
                this.b.setAlpha(0.0f);
            } else {
                this.a.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(175L).start();
                this.b.animate().alpha(0.0f).setDuration(175L).start();
            }
            this.c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        if (this.c) {
            if (z) {
                this.b.animate().cancel();
                this.b.setAlpha(1.0f);
                this.a.animate().cancel();
                this.a.setAlpha(0.0f);
                this.a.setScaleX(0.5f);
                this.a.setScaleY(0.5f);
            } else {
                this.b.animate().alpha(1.0f).setDuration(175L).start();
                this.a.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(175L).start();
            }
            this.c = false;
        }
    }
}
