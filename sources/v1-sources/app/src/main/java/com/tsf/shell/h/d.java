package com.tsf.shell.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class d extends FrameLayout {
    private static Bitmap g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public g a;
    public com.tsf.shell.workspace3D.k.a b;
    public boolean c;
    public Canvas d;
    private Object e;
    private SoftReference f;
    private Runnable h;

    public d(Context context, g gVar, com.tsf.shell.workspace3D.k.a aVar) {
        super(context);
        this.c = false;
        this.e = new Object();
        this.a = gVar;
        this.b = aVar;
        this.e = new Object();
        this.d = new Canvas();
        this.h = new e(this);
        addView(gVar);
    }

    public final void a(g gVar) {
        removeView(this.a);
        this.a = gVar;
        addView(gVar);
    }

    public final void a(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.updateAppWidgetSize(null, i, i2, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).cancelLongPress();
        }
    }

    public final void a() {
        this.c = true;
        setVisibility(8);
    }

    public final void b() {
        this.c = false;
        setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap createBitmap;
        if (!this.b.a) {
            synchronized (this.e) {
                if (this.f != null && this.f.get() != null) {
                    createBitmap = (Bitmap) this.f.get();
                    if (createBitmap.getWidth() != getWidth() || createBitmap.getHeight() != getHeight()) {
                        createBitmap.recycle();
                        createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        this.f.clear();
                        this.f = new SoftReference(createBitmap);
                    }
                } else {
                    createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.f = new SoftReference(createBitmap);
                }
                System.currentTimeMillis();
                this.d.setBitmap(createBitmap);
                this.d.drawColor(-1, PorterDuff.Mode.CLEAR);
                this.a.draw(this.d);
                this.d.setBitmap(g);
                if (this.b.bc() != null) {
                    this.b.bc().aV();
                }
            }
            synchronized (this.b.E) {
                this.b.F = this.h;
                com.tsf.shell.workspace3D.k.a aVar = this.b;
                com.tsf.shell.workspace3D.k.a.u();
            }
            if (this.b.D == null) {
                com.censivn.C3DEngine.a.a().c(new f(this));
            }
        }
        return super.drawChild(canvas, this.a, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate(rect);
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.c) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        if (!this.c) {
            super.invalidate(rect);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (!this.c) {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
