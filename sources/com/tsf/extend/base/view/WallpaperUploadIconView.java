package com.tsf.extend.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class WallpaperUploadIconView extends LinearLayout {

    /* renamed from: a */
    private ImageView f4593a;

    /* renamed from: b */
    private Paint f4594b;

    /* renamed from: c */
    private final int f4595c;

    /* renamed from: d */
    private RectF f4596d;

    /* renamed from: e */
    private RectF f4597e;

    /* renamed from: f */
    private RectF f4598f;

    /* renamed from: g */
    private int f4599g;

    public WallpaperUploadIconView(Context context) {
        super(context);
        this.f4594b = null;
        this.f4595c = -15360;
        this.f4596d = null;
        this.f4597e = null;
        this.f4598f = null;
        this.f4599g = 0;
    }

    public WallpaperUploadIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4594b = null;
        this.f4595c = -15360;
        this.f4596d = null;
        this.f4597e = null;
        this.f4598f = null;
        this.f4599g = 0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f4594b.setAlpha(204);
                this.f4593a.getDrawable().setAlpha(204);
                invalidate();
                break;
            case 1:
            case 3:
                this.f4594b.setAlpha(255);
                this.f4593a.getDrawable().setAlpha(255);
                invalidate();
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        setWillNotDraw(false);
        this.f4594b = new Paint();
        this.f4594b.setColor(-15360);
        this.f4594b.setAntiAlias(true);
        this.f4593a = (ImageView) findViewById(C1536f.C1541e.upload_wallpaper);
    }

    /* renamed from: a */
    public static int m8468a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4599g == 0) {
            this.f4599g = m8468a(getContext(), 44.0f);
        }
        if (this.f4596d == null) {
            this.f4596d = new RectF(0.0f, 0.0f, this.f4599g, getHeight());
        }
        if (this.f4598f == null) {
            this.f4598f = new RectF(this.f4599g / 2, 0.0f, getWidth() - (this.f4599g / 2), getHeight());
        }
        if (this.f4597e == null) {
            this.f4597e = new RectF(getWidth() - this.f4599g, 0.0f, getWidth(), getHeight());
        }
        canvas.drawArc(this.f4596d, 90.0f, 180.0f, true, this.f4594b);
        canvas.drawRect(this.f4598f, this.f4594b);
        canvas.drawArc(this.f4597e, 270.0f, 180.0f, true, this.f4594b);
    }
}
