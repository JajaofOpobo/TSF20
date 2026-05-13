package com.tsf.shell.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.tsf.shell.utils.m;
import java.lang.ref.SoftReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b extends FrameLayout {
    private static Bitmap g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public c a;
    public com.tsf.shell.f.i.b.b.a b;
    public Canvas c;
    private boolean d;
    private Object e;
    private SoftReference<Bitmap> f;
    private Runnable h;

    public b(Context context, c cVar, com.tsf.shell.f.i.b.b.a aVar) {
        super(context);
        this.d = false;
        this.e = new Object();
        this.a = cVar;
        this.b = aVar;
        this.e = new Object();
        this.c = new Canvas();
        this.h = new Runnable() { // from class: com.tsf.shell.e.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (!b.this.b.a) {
                    synchronized (b.this.e) {
                        if (b.this.f != null) {
                            Bitmap bitmap = (Bitmap) b.this.f.get();
                            if (bitmap == null) {
                                if (b.this.c()) {
                                    com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.b.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            b.this.invalidate();
                                        }
                                    });
                                }
                            } else {
                                b.this.b.a(bitmap);
                            }
                        }
                    }
                }
            }
        };
        addView(cVar);
    }

    public void a(c cVar) {
        removeView(this.a);
        this.a = cVar;
        addView(cVar);
    }

    @SuppressLint({"NewApi"})
    public void a(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                float f = com.censivn.C3DEngine.a.d().getResources().getDisplayMetrics().density;
                int i3 = (int) (i / f);
                int i4 = (int) (i2 / f);
                this.b.g.a.updateAppWidgetSize(null, i3, i4, i3, i4);
                this.a.updateAppWidgetSize(null, i3, i4, i3, i4);
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                String str = "";
                if (this.b != null) {
                    String str2 = "packagename:" + this.b.f;
                    ItemInfo K = this.b.K();
                    str = (K == null || !(K instanceof LauncherAppWidgetInfo)) ? str2 : str2 + "   launcherinfo:    " + ((LauncherAppWidgetInfo) K).providerName;
                }
                hashMap.put("error", str);
                m.a("EVENT_ISSUSE_UPDATE_APP_WIDGET_SIZE", hashMap);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).cancelLongPress();
        }
    }

    public void a() {
        this.d = true;
        if (!c()) {
            setVisibility(8);
        }
    }

    public void b() {
        this.d = false;
        setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap createBitmap;
        if (!c() && this.d && getVisibility() != 8) {
            setVisibility(8);
        }
        if (!this.b.a) {
            synchronized (this.e) {
                if (this.f != null && this.f.get() != null) {
                    createBitmap = this.f.get();
                    if (createBitmap.getWidth() != getWidth() || createBitmap.getHeight() != getHeight()) {
                        createBitmap.recycle();
                        createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        this.f.clear();
                        this.f = new SoftReference<>(createBitmap);
                    }
                } else if (getWidth() == 0 || getHeight() == 0) {
                    return super.drawChild(canvas, this.a, j);
                } else {
                    createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.f = new SoftReference<>(createBitmap);
                }
                this.c.setBitmap(createBitmap);
                this.c.drawColor(-1, PorterDuff.Mode.CLEAR);
                this.a.draw(this.c);
                this.c.setBitmap(g);
                if (this.b.A() != null) {
                    this.b.A().b(this.b);
                }
                synchronized (this.b.i) {
                    this.b.j = this.h;
                    this.b.invalidate();
                }
                if (this.b.h == null) {
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.b.2
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.b.onDrawStart();
                        }
                    });
                }
            }
        }
        return super.drawChild(canvas, this.a, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate(rect);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return this.b != null && this.b.h == null;
    }

    private boolean d() {
        return !this.d || c();
    }

    @Override // android.view.View
    public void invalidate() {
        if (d()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        if (d()) {
            super.invalidate(rect);
        }
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        if (d()) {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
