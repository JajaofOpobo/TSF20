package com.tsf.extend.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperUploadIconView extends LinearLayout {
    private ImageView a;
    private Paint b;
    private final int c;
    private RectF d;
    private RectF e;
    private RectF f;
    private int g;

    public WallpaperUploadIconView(Context context) {
        super(context);
        this.b = null;
        this.c = -15360;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    public WallpaperUploadIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.c = -15360;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.b.setAlpha(204);
                this.a.getDrawable().setAlpha(204);
                invalidate();
                break;
            case 1:
            case 3:
                this.b.setAlpha(255);
                this.a.getDrawable().setAlpha(255);
                invalidate();
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        setWillNotDraw(false);
        this.b = new Paint();
        this.b.setColor(-15360);
        this.b.setAntiAlias(true);
        this.a = (ImageView) findViewById(f.e.upload_wallpaper);
    }

    public static int a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.g == 0) {
            this.g = a(getContext(), 44.0f);
        }
        if (this.d == null) {
            this.d = new RectF(0.0f, 0.0f, this.g, getHeight());
        }
        if (this.f == null) {
            this.f = new RectF(this.g / 2, 0.0f, getWidth() - (this.g / 2), getHeight());
        }
        if (this.e == null) {
            this.e = new RectF(getWidth() - this.g, 0.0f, getWidth(), getHeight());
        }
        canvas.drawArc(this.d, 90.0f, 180.0f, true, this.b);
        canvas.drawRect(this.f, this.b);
        canvas.drawArc(this.e, 270.0f, 180.0f, true, this.b);
    }
}
