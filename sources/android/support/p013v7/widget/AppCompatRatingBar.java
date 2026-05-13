package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.RatingBar;
/* renamed from: android.support.v7.widget.AppCompatRatingBar */
/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    private C0749i f1773a;

    /* renamed from: b */
    private C0742g f1774b;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1774b = C0742g.m11215a();
        this.f1773a = new C0749i(this, this.f1774b);
        this.f1773a.mo11172a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m11176a = this.f1773a.m11176a();
        if (m11176a != null) {
            setMeasuredDimension(C0309ai.m12932a(m11176a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
