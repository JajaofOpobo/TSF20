package com.tsf.shell.manager.p176h;

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
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.h.a */
/* loaded from: classes.dex */
public class C3490a {

    /* renamed from: b */
    private static Paint f11532b;

    /* renamed from: e */
    private static int f11533e;

    /* renamed from: a */
    public boolean f11534a;

    /* renamed from: c */
    private Paint f11535c;

    /* renamed from: d */
    private Bitmap f11536d;

    /* renamed from: f */
    private AlertDialog f11537f;

    /* renamed from: g */
    private boolean f11538g = false;

    /* renamed from: h */
    private boolean f11539h;

    /* renamed from: i */
    private boolean f11540i;

    public C3490a() {
        this.f11534a = false;
        this.f11539h = false;
        this.f11540i = false;
        boolean m2431q = C3430e.m2431q();
        this.f11540i = m2431q;
        this.f11534a = m2431q;
        this.f11539h = C3430e.m2428r();
    }

    /* renamed from: a */
    public boolean m2213a() {
        if (this.f11534a) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.h.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C3490a.this.m2199i();
                    C4187w.m616a();
                }
            });
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m2208b() {
        if (this.f11534a) {
            m2209a(true);
        } else {
            m2202f();
        }
    }

    /* renamed from: c */
    public void m2206c() {
        this.f11538g = true;
    }

    /* renamed from: d */
    public boolean m2204d() {
        return this.f11540i;
    }

    /* renamed from: e */
    public void m2203e() {
        if (this.f11538g) {
            this.f11538g = false;
        } else if (this.f11539h && this.f11540i) {
            m2202f();
        }
    }

    /* renamed from: a */
    public void m2209a(boolean z) {
        this.f11534a = false;
        C2244e.m6020a(C1306b.C1315i.advanced_setting_screen_unlocked);
        if (z || !this.f11539h) {
            this.f11540i = false;
            C3430e.m2538a((Boolean) false);
        }
    }

    /* renamed from: f */
    public void m2202f() {
        this.f11534a = true;
        C3430e.m2538a((Boolean) true);
        this.f11540i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m2199i() {
        if (this.f11537f == null) {
            f11533e = C0853a.m10856d().getResources().getColor(17170449);
            this.f11535c = new Paint();
            this.f11535c.setColor(f11533e);
            this.f11535c.setAntiAlias(true);
            this.f11535c.setStyle(Paint.Style.STROKE);
            this.f11535c.setStrokeWidth(10.0f);
            f11532b = new Paint();
            f11532b.setColor(f11533e);
            f11532b.setAntiAlias(true);
            Bitmap m605a = C4189x.m605a(C0853a.m10856d(), C1306b.C1310d.lock_dialog_unlock_icon);
            Bitmap createBitmap = Bitmap.createBitmap(m605a.getWidth(), m605a.getHeight(), Bitmap.Config.ARGB_8888);
            Bitmap extractAlpha = m605a.extractAlpha();
            m605a.recycle();
            new Canvas(createBitmap).drawBitmap(extractAlpha, 0.0f, 0.0f, f11532b);
            extractAlpha.recycle();
            this.f11536d = createBitmap;
            AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
            builder.setTitle(C1306b.C1315i.notic_lock_desktop_notic);
            builder.setNegativeButton(C4189x.m588c(C1306b.C1315i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.h.a.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.screen_lock_dialog, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(C1306b.C1311e.sliding_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.rightMargin = (int) (40.0f * C0892a.f2569e);
            layoutParams.leftMargin = (int) (C0892a.f2569e * 10.0f);
            relativeLayout.addView(new C3495b(C0853a.m10856d()), layoutParams);
            relativeLayout.addView(new C3494a(C0853a.m10856d()), new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.addView(new C3496c(C0853a.m10856d()), new RelativeLayout.LayoutParams(120, -1));
            ((ImageView) linearLayout.findViewById(C1306b.C1311e.unlock_icon)).setImageBitmap(this.f11536d);
            CheckBox checkBox = (CheckBox) linearLayout.findViewById(C1306b.C1311e.checkbox);
            checkBox.setChecked(C3430e.m2428r());
            final TextView textView = (TextView) linearLayout.findViewById(C1306b.C1311e.relock_notic_text);
            m2212a(textView);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.manager.h.a.3
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C3430e.m2477d(z);
                    C3490a.this.f11539h = z;
                    C3490a.this.m2212a(textView);
                }
            });
            builder.setView(linearLayout);
            this.f11537f = builder.create();
        }
        this.f11537f.show();
    }

    /* renamed from: a */
    public void m2212a(TextView textView) {
        if (C3430e.m2428r()) {
            textView.setText(C1306b.C1315i.mn_lock_relock_summary);
        } else {
            textView.setText(C1306b.C1315i.mn_lock_no_relock_summary);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.manager.h.a$c */
    /* loaded from: classes.dex */
    public class C3496c extends View {

        /* renamed from: b */
        private float f11556b;

        /* renamed from: c */
        private float f11557c;

        /* renamed from: d */
        private int f11558d;

        /* renamed from: e */
        private TranslateAnimation f11559e;

        /* renamed from: f */
        private int f11560f;

        /* renamed from: g */
        private View f11561g;

        public C3496c(Context context) {
            super(context);
            this.f11558d = (int) ((C0892a.f2569e * 10.0f) + 10.0f);
            this.f11561g = this;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int i = 0;
            int rawX = (int) motionEvent.getRawX();
            switch (motionEvent.getAction()) {
                case 0:
                    this.f11556b = motionEvent.getX();
                    break;
                case 1:
                    if (this.f11560f >= ((int) (C3494a.f11545a - this.f11558d))) {
                        C3490a.this.f11537f.dismiss();
                        C3490a.this.f11535c.setColor(C3490a.f11533e);
                        C3490a.this.m2209a(false);
                        break;
                    } else {
                        C3490a.this.f11535c.setColor(C3490a.f11533e);
                        this.f11559e = new TranslateAnimation(0.0f, -this.f11560f, 0.0f, 0.0f);
                        this.f11559e.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.shell.manager.h.a.c.1
                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                C3496c.this.f11561g.clearAnimation();
                                C3496c.this.m2195a(0);
                            }
                        });
                        this.f11559e.setDuration((int) ((this.f11560f / (C3494a.f11545a - this.f11558d)) * 500.0f));
                        this.f11559e.setFillAfter(true);
                        setAnimation(this.f11559e);
                        this.f11559e.start();
                        break;
                    }
                case 2:
                    int i2 = (int) ((rawX - this.f11556b) - 60.0f);
                    if (i2 < 0) {
                        C3490a.this.f11535c.setColor(C3490a.f11533e);
                    } else if (i2 <= C3494a.f11545a - this.f11558d) {
                        C3490a.this.f11535c.setColor(C3490a.f11533e);
                        i = i2;
                    } else {
                        i = ((int) C3494a.f11545a) - this.f11558d;
                        C3490a.this.f11535c.setColor(-6039296);
                    }
                    this.f11560f = i;
                    m2195a(i);
                    break;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m2195a(int i) {
            layout(i, 0, getWidth() + i, getHeight());
            postInvalidate();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.f11557c = getHeight();
            postInvalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawCircle(this.f11558d, this.f11557c / 2.0f, 23.0f * C0892a.f2566b, C3490a.this.f11535c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.manager.h.a$a */
    /* loaded from: classes.dex */
    public static class C3494a extends View {

        /* renamed from: a */
        public static float f11545a;

        /* renamed from: b */
        private float f11546b;

        /* renamed from: c */
        private float f11547c;

        /* renamed from: d */
        private float f11548d;

        public C3494a(Context context) {
            super(context);
            this.f11548d = (C0892a.f2569e * 10.0f) + 10.0f;
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.f11547c = getHeight();
            this.f11546b = getWidth();
            f11545a = this.f11546b - (40.0f * C0892a.f2569e);
            postInvalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawCircle(this.f11548d, this.f11547c / 2.0f, C0892a.f2566b * 10.0f, C3490a.f11532b);
            canvas.drawCircle(f11545a, this.f11547c / 2.0f, C0892a.f2566b * 10.0f, C3490a.f11532b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.manager.h.a$b */
    /* loaded from: classes.dex */
    public static class C3495b extends View {

        /* renamed from: c */
        private static PathEffect f11549c;

        /* renamed from: a */
        private Paint f11550a;

        /* renamed from: b */
        private Path f11551b;

        /* renamed from: d */
        private float f11552d;

        /* renamed from: e */
        private float f11553e;

        /* renamed from: f */
        private float f11554f;

        /* renamed from: a */
        private static void m2197a(float f) {
            f11549c = new ComposePathEffect(new PathDashPathEffect(m2196b(), 12.0f, f, PathDashPathEffect.Style.ROTATE), new CornerPathEffect(10.0f));
        }

        public C3495b(Context context) {
            super(context);
            this.f11550a = new Paint(1);
            this.f11550a.setStyle(Paint.Style.STROKE);
            this.f11550a.setStrokeWidth(6.0f);
            this.f11551b = m2198a();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.f11554f = getHeight();
            this.f11553e = getWidth();
            this.f11551b.lineTo(this.f11553e, 0.0f);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            RectF rectF = new RectF();
            this.f11551b.computeBounds(rectF, false);
            canvas.translate(0.0f, (this.f11554f / 2.0f) - rectF.top);
            m2197a(this.f11552d);
            this.f11552d -= 1.0f;
            invalidate();
            this.f11550a.setPathEffect(f11549c);
            this.f11550a.setColor(C3490a.f11533e);
            canvas.drawPath(this.f11551b, this.f11550a);
            canvas.translate(0.0f, 0.0f);
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            return super.onKeyDown(i, keyEvent);
        }

        /* renamed from: a */
        private static Path m2198a() {
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            return path;
        }

        /* renamed from: b */
        private static Path m2196b() {
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
