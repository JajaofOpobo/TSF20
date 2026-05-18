package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppCompatRatingBar extends RatingBar {
    private i a;
    private g b;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0012a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = g.a();
        this.a = new i(this, this.b);
        this.a.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapA = this.a.a();
        if (bitmapA != null) {
            setMeasuredDimension(ai.a(bitmapA.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
