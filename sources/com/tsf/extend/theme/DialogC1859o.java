package com.tsf.extend.theme;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1430i;
/* renamed from: com.tsf.extend.theme.o */
/* loaded from: classes.dex */
public class DialogC1859o extends Dialog {

    /* renamed from: a */
    private SurfaceHolder$CallbackC1860a f5986a;

    /* renamed from: b */
    private LinearLayout f5987b;

    /* renamed from: c */
    private TextView f5988c;

    public DialogC1859o(Context context) {
        this(context, C1536f.C1544h.SmartDialogStyle);
    }

    public DialogC1859o(Context context, int i) {
        super(context, i);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.6f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        m7233a();
    }

    /* renamed from: a */
    private void m7233a() {
        this.f5986a = new SurfaceHolder$CallbackC1860a(getContext());
        Drawable drawable = getContext().getResources().getDrawable(C1536f.C1540d.search_loading_circle_big);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f5987b = new LinearLayout(getContext());
        this.f5987b.setOrientation(1);
        this.f5987b.setGravity(17);
        this.f5987b.addView(this.f5986a, new LinearLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth()));
        this.f5988c = new TextView(getContext());
        this.f5988c.setText(C1536f.C1543g.theme_applying_theme);
        this.f5988c.setTextSize(2, 14.0f);
        this.f5988c.setTextColor(getContext().getResources().getColor(C1536f.C1538b.white));
        this.f5988c.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C1430i.m8655d(), -2);
        layoutParams2.topMargin = C1430i.m8659a(8.0f);
        this.f5987b.addView(this.f5988c, layoutParams2);
        setContentView(this.f5987b, layoutParams);
    }

    /* renamed from: a */
    public void m7232a(String str) {
        this.f5988c.setText(str);
    }

    /* renamed from: com.tsf.extend.theme.o$a */
    /* loaded from: classes.dex */
    public class SurfaceHolder$CallbackC1860a extends SurfaceView implements SurfaceHolder.Callback {

        /* renamed from: b */
        private Bitmap f5990b;

        /* renamed from: c */
        private Paint f5991c;

        /* renamed from: d */
        private boolean f5992d;

        /* renamed from: e */
        private int f5993e;

        /* renamed from: f */
        private SurfaceHolder f5994f;

        /* renamed from: g */
        private int f5995g;

        /* renamed from: c */
        static /* synthetic */ int m7223c(SurfaceHolder$CallbackC1860a surfaceHolder$CallbackC1860a) {
            int i = surfaceHolder$CallbackC1860a.f5995g;
            surfaceHolder$CallbackC1860a.f5995g = i + 1;
            return i;
        }

        public SurfaceHolder$CallbackC1860a(Context context) {
            super(context);
            this.f5991c = null;
            this.f5992d = false;
            this.f5993e = 0;
            this.f5995g = 0;
            setZOrderOnTop(true);
            this.f5994f = getHolder();
            this.f5994f.setFormat(-3);
            this.f5994f.setFormat(1);
            this.f5994f.addCallback(this);
            setFocusable(false);
            m7224c();
        }

        /* renamed from: c */
        private void m7224c() {
            this.f5991c = new Paint();
            this.f5991c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            try {
                this.f5990b = BitmapFactory.decodeResource(getResources(), C1536f.C1540d.search_loading_circle_big);
            } catch (Throwable th) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m7230a(int i) {
            synchronized (this.f5994f) {
                Canvas lockCanvas = this.f5994f.lockCanvas();
                Bitmap bitmap = this.f5990b;
                if (lockCanvas == null || bitmap == null || bitmap.isRecycled()) {
                    if (lockCanvas != null) {
                        try {
                            this.f5994f.unlockCanvasAndPost(lockCanvas);
                        } catch (Exception e) {
                        }
                    }
                    return;
                }
                try {
                    lockCanvas.save();
                    lockCanvas.rotate(i, bitmap.getWidth() / 2, bitmap.getWidth() / 2);
                    lockCanvas.drawPaint(this.f5991c);
                    lockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                } catch (Exception e2) {
                }
                lockCanvas.restore();
                try {
                    this.f5994f.unlockCanvasAndPost(lockCanvas);
                } catch (Exception e3) {
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.tsf.extend.theme.o$a$1] */
        /* renamed from: a */
        public void m7231a() {
            if (!this.f5992d) {
                new Thread() { // from class: com.tsf.extend.theme.o.a.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        while (!SurfaceHolder$CallbackC1860a.this.f5992d && DialogC1859o.this.isShowing()) {
                            SurfaceHolder$CallbackC1860a.this.m7230a(SurfaceHolder$CallbackC1860a.this.f5993e);
                            try {
                                sleep(30L);
                                SurfaceHolder$CallbackC1860a.m7223c(SurfaceHolder$CallbackC1860a.this);
                                SurfaceHolder$CallbackC1860a.this.f5993e = (((SurfaceHolder$CallbackC1860a.this.f5995g * 360) * 30) / 800) % 360;
                                if (SurfaceHolder$CallbackC1860a.this.f5995g == 2147483646) {
                                    SurfaceHolder$CallbackC1860a.this.f5995g = SurfaceHolder$CallbackC1860a.this.f5993e;
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                }.start();
            }
        }

        /* renamed from: b */
        public void m7227b() {
            this.f5992d = true;
            this.f5990b = null;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
        }
        if (this.f5986a != null) {
            this.f5986a.m7231a();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f5986a != null) {
            this.f5986a.m7227b();
        }
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }
}
