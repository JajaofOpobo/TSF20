package android.support.p002v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* renamed from: android.support.v4.widget.ContentLoadingProgressBar */
/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    private long f802a;

    /* renamed from: b */
    private boolean f803b;

    /* renamed from: c */
    private boolean f804c;

    /* renamed from: d */
    private boolean f805d;

    /* renamed from: e */
    private final Runnable f806e;

    /* renamed from: f */
    private final Runnable f807f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f802a = -1L;
        this.f803b = false;
        this.f804c = false;
        this.f805d = false;
        this.f806e = new Runnable() { // from class: android.support.v4.widget.ContentLoadingProgressBar.1
            @Override // java.lang.Runnable
            public void run() {
                ContentLoadingProgressBar.this.f803b = false;
                ContentLoadingProgressBar.this.f802a = -1L;
                ContentLoadingProgressBar.this.setVisibility(8);
            }
        };
        this.f807f = new Runnable() { // from class: android.support.v4.widget.ContentLoadingProgressBar.2
            @Override // java.lang.Runnable
            public void run() {
                ContentLoadingProgressBar.this.f804c = false;
                if (!ContentLoadingProgressBar.this.f805d) {
                    ContentLoadingProgressBar.this.f802a = System.currentTimeMillis();
                    ContentLoadingProgressBar.this.setVisibility(0);
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12567a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12567a();
    }

    /* renamed from: a */
    private void m12567a() {
        removeCallbacks(this.f806e);
        removeCallbacks(this.f807f);
    }
}
