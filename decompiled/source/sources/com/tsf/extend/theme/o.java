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
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class o extends Dialog {
    private a a;
    private LinearLayout b;
    private TextView c;

    public o(Context context) {
        this(context, f.h.SmartDialogStyle);
    }

    public o(Context context, int i) {
        super(context, i);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.6f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        a();
    }

    private void a() {
        this.a = new a(getContext());
        Drawable drawable = getContext().getResources().getDrawable(f.d.search_loading_circle_big);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b = new LinearLayout(getContext());
        this.b.setOrientation(1);
        this.b.setGravity(17);
        this.b.addView(this.a, new LinearLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth()));
        this.c = new TextView(getContext());
        this.c.setText(f.g.theme_applying_theme);
        this.c.setTextSize(2, 14.0f);
        this.c.setTextColor(getContext().getResources().getColor(f.b.white));
        this.c.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(com.tsf.extend.base.j.i.d(), -2);
        layoutParams2.topMargin = com.tsf.extend.base.j.i.a(8.0f);
        this.b.addView(this.c, layoutParams2);
        setContentView(this.b, layoutParams);
    }

    public void a(String str) {
        this.c.setText(str);
    }

    /* loaded from: classes.dex */
    public class a extends SurfaceView implements SurfaceHolder.Callback {
        private Bitmap b;
        private Paint c;
        private boolean d;
        private int e;
        private SurfaceHolder f;
        private int g;

        static /* synthetic */ int c(a aVar) {
            int i = aVar.g;
            aVar.g = i + 1;
            return i;
        }

        public a(Context context) {
            super(context);
            this.c = null;
            this.d = false;
            this.e = 0;
            this.g = 0;
            setZOrderOnTop(true);
            this.f = getHolder();
            this.f.setFormat(-3);
            this.f.setFormat(1);
            this.f.addCallback(this);
            setFocusable(false);
            c();
        }

        private void c() {
            this.c = new Paint();
            this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            try {
                this.b = BitmapFactory.decodeResource(getResources(), f.d.search_loading_circle_big);
            } catch (Throwable th) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            synchronized (this.f) {
                Canvas lockCanvas = this.f.lockCanvas();
                Bitmap bitmap = this.b;
                if (lockCanvas == null || bitmap == null || bitmap.isRecycled()) {
                    if (lockCanvas != null) {
                        try {
                            this.f.unlockCanvasAndPost(lockCanvas);
                        } catch (Exception e) {
                        }
                    }
                    return;
                }
                try {
                    lockCanvas.save();
                    lockCanvas.rotate(i, bitmap.getWidth() / 2, bitmap.getWidth() / 2);
                    lockCanvas.drawPaint(this.c);
                    lockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                } catch (Exception e2) {
                }
                lockCanvas.restore();
                try {
                    this.f.unlockCanvasAndPost(lockCanvas);
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
        public void a() {
            if (!this.d) {
                new Thread() { // from class: com.tsf.extend.theme.o.a.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        while (!a.this.d && o.this.isShowing()) {
                            a.this.a(a.this.e);
                            try {
                                sleep(30L);
                                a.c(a.this);
                                a.this.e = (((a.this.g * 360) * 30) / 800) % 360;
                                if (a.this.g == 2147483646) {
                                    a.this.g = a.this.e;
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

        public void b() {
            this.d = true;
            this.b = null;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
        }
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.a != null) {
            this.a.b();
        }
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }
}
