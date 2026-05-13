package android.support.p002v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.view.animation.Animation;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.widget.b */
/* loaded from: classes.dex */
public class C0482b extends ImageView {

    /* renamed from: a */
    private Animation.AnimationListener f1034a;

    /* renamed from: b */
    private int f1035b;

    public C0482b(Context context, int i, float f) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (f * f2 * 2.0f);
        int i3 = (int) (1.75f * f2);
        int i4 = (int) (0.0f * f2);
        this.f1035b = (int) (3.5f * f2);
        if (m12285a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0309ai.m12903e(this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C0483a(this.f1035b, i2));
            C0309ai.m12926a(this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer(this.f1035b, i4, i3, 503316480);
            int i5 = this.f1035b;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(i);
        setBackgroundDrawable(shapeDrawable);
    }

    /* renamed from: a */
    private boolean m12285a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m12285a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1035b * 2), getMeasuredHeight() + (this.f1035b * 2));
        }
    }

    /* renamed from: a */
    public void m12282a(Animation.AnimationListener animationListener) {
        this.f1034a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f1034a != null) {
            this.f1034a.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f1034a != null) {
            this.f1034a.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: android.support.v4.widget.b$a */
    /* loaded from: classes.dex */
    private class C0483a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f1037b;

        /* renamed from: c */
        private Paint f1038c = new Paint();

        /* renamed from: d */
        private int f1039d;

        public C0483a(int i, int i2) {
            C0482b.this.f1035b = i;
            this.f1039d = i2;
            this.f1037b = new RadialGradient(this.f1039d / 2, this.f1039d / 2, C0482b.this.f1035b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f1038c.setShader(this.f1037b);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = C0482b.this.getWidth();
            int height = C0482b.this.getHeight();
            canvas.drawCircle(width / 2, height / 2, (this.f1039d / 2) + C0482b.this.f1035b, this.f1038c);
            canvas.drawCircle(width / 2, height / 2, this.f1039d / 2, paint);
        }
    }
}
