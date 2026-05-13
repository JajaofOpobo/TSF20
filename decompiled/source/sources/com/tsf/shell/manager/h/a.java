package com.tsf.shell.manager.h;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.b;
import com.tsf.shell.manager.b.e;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a {
    private static Paint b;
    private static int e;
    public boolean a;
    private Paint c;
    private Bitmap d;
    private AlertDialog f;
    private boolean g = false;
    private boolean h;
    private boolean i;

    public a() {
        this.a = false;
        this.h = false;
        this.i = false;
        boolean q = e.q();
        this.i = q;
        this.a = q;
        this.h = e.r();
    }

    public boolean a() {
        if (this.a) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.h.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.i();
                    w.a();
                }
            });
            return false;
        }
        return true;
    }

    public void b() {
        if (this.a) {
            a(true);
        } else {
            f();
        }
    }

    public void c() {
        this.g = true;
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
        if (this.g) {
            this.g = false;
        } else if (this.h && this.i) {
            f();
        }
    }

    public void a(boolean z) {
        this.a = false;
        com.tsf.shell.e.a(b.i.advanced_setting_screen_unlocked);
        if (z || !this.h) {
            this.i = false;
            e.a((Boolean) false);
        }
    }

    public void f() {
        this.a = true;
        e.a((Boolean) true);
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f == null) {
            e = com.censivn.C3DEngine.a.d().getResources().getColor(17170449);
            this.c = new Paint();
            this.c.setColor(e);
            this.c.setAntiAlias(true);
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(10.0f);
            b = new Paint();
            b.setColor(e);
            b.setAntiAlias(true);
            Bitmap a = x.a(com.censivn.C3DEngine.a.d(), b.d.lock_dialog_unlock_icon);
            Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
            Bitmap extractAlpha = a.extractAlpha();
            a.recycle();
            new Canvas(createBitmap).drawBitmap(extractAlpha, 0.0f, 0.0f, b);
            extractAlpha.recycle();
            this.d = createBitmap;
            AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
            builder.setTitle(b.i.notic_lock_desktop_notic);
            builder.setNegativeButton(x.c(b.i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.h.a.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(b.g.screen_lock_dialog, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(b.e.sliding_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.rightMargin = (int) (40.0f * com.censivn.C3DEngine.b.b.a.e);
            layoutParams.leftMargin = (int) (com.censivn.C3DEngine.b.b.a.e * 10.0f);
            relativeLayout.addView(new b(com.censivn.C3DEngine.a.d()), layoutParams);
            relativeLayout.addView(new C0128a(com.censivn.C3DEngine.a.d()), new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.addView(new c(com.censivn.C3DEngine.a.d()), new RelativeLayout.LayoutParams(120, -1));
            ((ImageView) linearLayout.findViewById(b.e.unlock_icon)).setImageBitmap(this.d);
            CheckBox checkBox = (CheckBox) linearLayout.findViewById(b.e.checkbox);
            checkBox.setChecked(e.r());
            final TextView textView = (TextView) linearLayout.findViewById(b.e.relock_notic_text);
            a(textView);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.manager.h.a.3
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    e.d(z);
                    a.this.h = z;
                    a.this.a(textView);
                }
            });
            builder.setView(linearLayout);
            this.f = builder.create();
        }
        this.f.show();
    }

    public void a(TextView textView) {
        if (e.r()) {
            textView.setText(b.i.mn_lock_relock_summary);
        } else {
            textView.setText(b.i.mn_lock_no_relock_summary);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends View {
        private float b;
        private float c;
        private int d;
        private TranslateAnimation e;
        private int f;
        private View g;

        public c(Context context) {
            super(context);
            this.d = (int) ((com.censivn.C3DEngine.b.b.a.e * 10.0f) + 10.0f);
            this.g = this;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int i = 0;
            int rawX = (int) motionEvent.getRawX();
            switch (motionEvent.getAction()) {
                case 0:
                    this.b = motionEvent.getX();
                    break;
                case 1:
                    if (this.f >= ((int) (C0128a.a - this.d))) {
                        a.this.f.dismiss();
                        a.this.c.setColor(a.e);
                        a.this.a(false);
                        break;
                    } else {
                        a.this.c.setColor(a.e);
                        this.e = new TranslateAnimation(0.0f, -this.f, 0.0f, 0.0f);
                        this.e.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.shell.manager.h.a.c.1
                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                c.this.g.clearAnimation();
                                c.this.a(0);
                            }
                        });
                        this.e.setDuration((int) ((this.f / (C0128a.a - this.d)) * 500.0f));
                        this.e.setFillAfter(true);
                        setAnimation(this.e);
                        this.e.start();
                        break;
                    }
                case 2:
                    int i2 = (int) ((rawX - this.b) - 60.0f);
                    if (i2 < 0) {
                        a.this.c.setColor(a.e);
                    } else if (i2 <= C0128a.a - this.d) {
                        a.this.c.setColor(a.e);
                        i = i2;
                    } else {
                        i = ((int) C0128a.a) - this.d;
                        a.this.c.setColor(-6039296);
                    }
                    this.f = i;
                    a(i);
                    break;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            layout(i, 0, getWidth() + i, getHeight());
            postInvalidate();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.c = getHeight();
            postInvalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawCircle(this.d, this.c / 2.0f, 23.0f * com.censivn.C3DEngine.b.b.a.b, a.this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.manager.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0128a extends View {
        public static float a;
        private float b;
        private float c;
        private float d;

        public C0128a(Context context) {
            super(context);
            this.d = (com.censivn.C3DEngine.b.b.a.e * 10.0f) + 10.0f;
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.c = getHeight();
            this.b = getWidth();
            a = this.b - (40.0f * com.censivn.C3DEngine.b.b.a.e);
            postInvalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawCircle(this.d, this.c / 2.0f, com.censivn.C3DEngine.b.b.a.b * 10.0f, a.b);
            canvas.drawCircle(a, this.c / 2.0f, com.censivn.C3DEngine.b.b.a.b * 10.0f, a.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends View {
        private static PathEffect c;
        private Paint a;
        private Path b;
        private float d;
        private float e;
        private float f;

        private static void a(float f) {
            c = new ComposePathEffect(new PathDashPathEffect(b(), 12.0f, f, PathDashPathEffect.Style.ROTATE), new CornerPathEffect(10.0f));
        }

        public b(Context context) {
            super(context);
            this.a = new Paint(1);
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setStrokeWidth(6.0f);
            this.b = a();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.f = getHeight();
            this.e = getWidth();
            this.b.lineTo(this.e, 0.0f);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            RectF rectF = new RectF();
            this.b.computeBounds(rectF, false);
            canvas.translate(0.0f, (this.f / 2.0f) - rectF.top);
            a(this.d);
            this.d -= 1.0f;
            invalidate();
            this.a.setPathEffect(c);
            this.a.setColor(a.e);
            canvas.drawPath(this.b, this.a);
            canvas.translate(0.0f, 0.0f);
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            return super.onKeyDown(i, keyEvent);
        }

        private static Path a() {
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            return path;
        }

        private static Path b() {
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, -4.0f);
            path.lineTo(8.0f, -4.0f);
            path.lineTo(12.0f, 0.0f);
            path.lineTo(8.0f, 4.0f);
            path.lineTo(0.0f, 4.0f);
            return path;
        }
    }
}
