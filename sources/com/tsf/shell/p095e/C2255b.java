package com.tsf.shell.p095e;

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
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import com.tsf.shell.utils.C4177m;
import java.lang.ref.SoftReference;
import java.util.HashMap;
/* renamed from: com.tsf.shell.e.b */
/* loaded from: classes.dex */
public class C2255b extends FrameLayout {

    /* renamed from: g */
    private static Bitmap f7359g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: a */
    public C2259c f7360a;

    /* renamed from: b */
    public C3124a f7361b;

    /* renamed from: c */
    public Canvas f7362c;

    /* renamed from: d */
    private boolean f7363d;

    /* renamed from: e */
    private Object f7364e;

    /* renamed from: f */
    private SoftReference<Bitmap> f7365f;

    /* renamed from: h */
    private Runnable f7366h;

    public C2255b(Context context, C2259c c2259c, C3124a c3124a) {
        super(context);
        this.f7363d = false;
        this.f7364e = new Object();
        this.f7360a = c2259c;
        this.f7361b = c3124a;
        this.f7364e = new Object();
        this.f7362c = new Canvas();
        this.f7366h = new Runnable() { // from class: com.tsf.shell.e.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (!C2255b.this.f7361b.f10160a) {
                    synchronized (C2255b.this.f7364e) {
                        if (C2255b.this.f7365f != null) {
                            Bitmap bitmap = (Bitmap) C2255b.this.f7365f.get();
                            if (bitmap == null) {
                                if (C2255b.this.m6004c()) {
                                    C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.e.b.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            C2255b.this.invalidate();
                                        }
                                    });
                                }
                            } else {
                                C2255b.this.f7361b.m3463a(bitmap);
                            }
                        }
                    }
                }
            }
        };
        addView(c2259c);
    }

    /* renamed from: a */
    public void m6007a(C2259c c2259c) {
        removeView(this.f7360a);
        this.f7360a = c2259c;
        addView(c2259c);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m6009a(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                float f = C0853a.m10856d().getResources().getDisplayMetrics().density;
                int i3 = (int) (i / f);
                int i4 = (int) (i2 / f);
                this.f7361b.f10163g.f7360a.updateAppWidgetSize(null, i3, i4, i3, i4);
                this.f7360a.updateAppWidgetSize(null, i3, i4, i3, i4);
            } catch (Exception e) {
                HashMap hashMap = new HashMap();
                String str = "";
                if (this.f7361b != null) {
                    String str2 = "packagename:" + this.f7361b.f10162f;
                    ItemInfo K = this.f7361b.m3534K();
                    str = (K == null || !(K instanceof LauncherAppWidgetInfo)) ? str2 : str2 + "   launcherinfo:    " + ((LauncherAppWidgetInfo) K).providerName;
                }
                hashMap.put("error", str);
                C4177m.m667a("EVENT_ISSUSE_UPDATE_APP_WIDGET_SIZE", hashMap);
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

    /* renamed from: a */
    public void m6010a() {
        this.f7363d = true;
        if (!m6004c()) {
            setVisibility(8);
        }
    }

    /* renamed from: b */
    public void m6006b() {
        this.f7363d = false;
        setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap createBitmap;
        if (!m6004c() && this.f7363d && getVisibility() != 8) {
            setVisibility(8);
        }
        if (!this.f7361b.f10160a) {
            synchronized (this.f7364e) {
                if (this.f7365f != null && this.f7365f.get() != null) {
                    createBitmap = this.f7365f.get();
                    if (createBitmap.getWidth() != getWidth() || createBitmap.getHeight() != getHeight()) {
                        createBitmap.recycle();
                        createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        this.f7365f.clear();
                        this.f7365f = new SoftReference<>(createBitmap);
                    }
                } else if (getWidth() == 0 || getHeight() == 0) {
                    return super.drawChild(canvas, this.f7360a, j);
                } else {
                    createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.f7365f = new SoftReference<>(createBitmap);
                }
                this.f7362c.setBitmap(createBitmap);
                this.f7362c.drawColor(-1, PorterDuff.Mode.CLEAR);
                this.f7360a.draw(this.f7362c);
                this.f7362c.setBitmap(f7359g);
                if (this.f7361b.m3541A() != null) {
                    this.f7361b.m3541A().mo3300b(this.f7361b);
                }
                synchronized (this.f7361b.f10165i) {
                    this.f7361b.f10166j = this.f7366h;
                    this.f7361b.invalidate();
                }
                if (this.f7361b.f10164h == null) {
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.e.b.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C2255b.this.f7361b.onDrawStart();
                        }
                    });
                }
            }
        }
        return super.drawChild(canvas, this.f7360a, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate(rect);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m6004c() {
        return this.f7361b != null && this.f7361b.f10164h == null;
    }

    /* renamed from: d */
    private boolean m6002d() {
        return !this.f7363d || m6004c();
    }

    @Override // android.view.View
    public void invalidate() {
        if (m6002d()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        if (m6002d()) {
            super.invalidate(rect);
        }
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        if (m6002d()) {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
