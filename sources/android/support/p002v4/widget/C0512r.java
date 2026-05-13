package android.support.p002v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.p012b.C0360a;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.widget.r */
/* loaded from: classes.dex */
public class C0512r extends Drawable implements Animatable {

    /* renamed from: b */
    private static final Interpolator f1059b = new LinearInterpolator();

    /* renamed from: c */
    private static final Interpolator f1060c = new C0360a();

    /* renamed from: a */
    boolean f1061a;

    /* renamed from: g */
    private float f1065g;

    /* renamed from: h */
    private Resources f1066h;

    /* renamed from: i */
    private View f1067i;

    /* renamed from: j */
    private Animation f1068j;

    /* renamed from: k */
    private float f1069k;

    /* renamed from: l */
    private double f1070l;

    /* renamed from: m */
    private double f1071m;

    /* renamed from: d */
    private final int[] f1062d = {-16777216};

    /* renamed from: e */
    private final ArrayList<Animation> f1063e = new ArrayList<>();

    /* renamed from: n */
    private final Drawable.Callback f1072n = new Drawable.Callback() { // from class: android.support.v4.widget.r.3
        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0512r.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0512r.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0512r.this.unscheduleSelf(runnable);
        }
    };

    /* renamed from: f */
    private final C0516a f1064f = new C0516a(this.f1072n);

    public C0512r(Context context, View view) {
        this.f1067i = view;
        this.f1066h = context.getResources();
        this.f1064f.m12197a(this.f1062d);
        m12221a(1);
        m12213b();
    }

    /* renamed from: a */
    private void m12226a(double d, double d2, double d3, double d4, float f, float f2) {
        C0516a c0516a = this.f1064f;
        float f3 = this.f1066h.getDisplayMetrics().density;
        this.f1070l = f3 * d;
        this.f1071m = f3 * d2;
        c0516a.m12205a(((float) d4) * f3);
        c0516a.m12206a(f3 * d3);
        c0516a.m12191c(0);
        c0516a.m12204a(f * f3, f3 * f2);
        c0516a.m12202a((int) this.f1070l, (int) this.f1071m);
    }

    /* renamed from: a */
    public void m12221a(int i) {
        if (i == 0) {
            m12226a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m12226a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public void m12215a(boolean z) {
        this.f1064f.m12198a(z);
    }

    /* renamed from: a */
    public void m12225a(float f) {
        this.f1064f.m12186e(f);
    }

    /* renamed from: a */
    public void m12224a(float f, float f2) {
        this.f1064f.m12195b(f);
        this.f1064f.m12192c(f2);
    }

    /* renamed from: b */
    public void m12212b(float f) {
        this.f1064f.m12189d(f);
    }

    /* renamed from: b */
    public void m12210b(int i) {
        this.f1064f.m12203a(i);
    }

    /* renamed from: a */
    public void m12214a(int... iArr) {
        this.f1064f.m12197a(iArr);
        this.f1064f.m12191c(0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f1071m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f1070l;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f1065g, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1064f.m12200a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1064f.m12188d(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1064f.m12193c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1064f.m12199a(colorFilter);
    }

    /* renamed from: c */
    void m12208c(float f) {
        this.f1065g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.f1063e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f1068j.reset();
        this.f1064f.m12179l();
        if (this.f1064f.m12182i() != this.f1064f.m12187e()) {
            this.f1061a = true;
            this.f1068j.setDuration(666L);
            this.f1067i.startAnimation(this.f1068j);
            return;
        }
        this.f1064f.m12191c(0);
        this.f1064f.m12178m();
        this.f1068j.setDuration(1332L);
        this.f1067i.startAnimation(this.f1068j);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1067i.clearAnimation();
        m12208c(0.0f);
        this.f1064f.m12198a(false);
        this.f1064f.m12191c(0);
        this.f1064f.m12178m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public float m12220a(C0516a c0516a) {
        return (float) Math.toRadians(c0516a.m12190d() / (6.283185307179586d * c0516a.m12181j()));
    }

    /* renamed from: a */
    private int m12223a(float f, int i, int i2) {
        int intValue = Integer.valueOf(i).intValue();
        int i3 = (intValue >> 24) & 255;
        int i4 = (intValue >> 16) & 255;
        int i5 = (intValue >> 8) & 255;
        int i6 = intValue & 255;
        int intValue2 = Integer.valueOf(i2).intValue();
        return (i6 + ((int) (((intValue2 & 255) - i6) * f))) | ((i3 + ((int) ((((intValue2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((intValue2 >> 16) & 255) - i4) * f))) << 16) | ((((int) ((((intValue2 >> 8) & 255) - i5) * f)) + i5) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12222a(float f, C0516a c0516a) {
        if (f > 0.75f) {
            c0516a.m12194b(m12223a((f - 0.75f) / 0.25f, c0516a.m12183h(), c0516a.m12207a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12211b(float f, C0516a c0516a) {
        m12222a(f, c0516a);
        float m12220a = m12220a(c0516a);
        c0516a.m12195b((((c0516a.m12184g() - m12220a) - c0516a.m12185f()) * f) + c0516a.m12185f());
        c0516a.m12192c(c0516a.m12184g());
        c0516a.m12189d(((((float) (Math.floor(c0516a.m12180k() / 0.8f) + 1.0d)) - c0516a.m12180k()) * f) + c0516a.m12180k());
    }

    /* renamed from: b */
    private void m12213b() {
        final C0516a c0516a = this.f1064f;
        Animation animation = new Animation() { // from class: android.support.v4.widget.r.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                if (C0512r.this.f1061a) {
                    C0512r.this.m12211b(f, c0516a);
                    return;
                }
                float m12220a = C0512r.this.m12220a(c0516a);
                float m12184g = c0516a.m12184g();
                float m12185f = c0516a.m12185f();
                float m12180k = c0516a.m12180k();
                C0512r.this.m12222a(f, c0516a);
                if (f <= 0.5f) {
                    c0516a.m12195b(m12185f + (C0512r.f1060c.getInterpolation(f / 0.5f) * (0.8f - m12220a)));
                }
                if (f > 0.5f) {
                    c0516a.m12192c(((0.8f - m12220a) * C0512r.f1060c.getInterpolation((f - 0.5f) / 0.5f)) + m12184g);
                }
                c0516a.m12189d((0.25f * f) + m12180k);
                C0512r.this.m12208c((216.0f * f) + (1080.0f * (C0512r.this.f1069k / 5.0f)));
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(f1059b);
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.v4.widget.r.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
                C0512r.this.f1069k = 0.0f;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
                c0516a.m12179l();
                c0516a.m12196b();
                c0516a.m12195b(c0516a.m12182i());
                if (C0512r.this.f1061a) {
                    C0512r.this.f1061a = false;
                    animation2.setDuration(1332L);
                    c0516a.m12198a(false);
                    return;
                }
                C0512r.this.f1069k = (C0512r.this.f1069k + 1.0f) % 5.0f;
            }
        });
        this.f1068j = animation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.r$a */
    /* loaded from: classes.dex */
    public static class C0516a {

        /* renamed from: d */
        private final Drawable.Callback f1081d;

        /* renamed from: j */
        private int[] f1087j;

        /* renamed from: k */
        private int f1088k;

        /* renamed from: l */
        private float f1089l;

        /* renamed from: m */
        private float f1090m;

        /* renamed from: n */
        private float f1091n;

        /* renamed from: o */
        private boolean f1092o;

        /* renamed from: p */
        private Path f1093p;

        /* renamed from: q */
        private float f1094q;

        /* renamed from: r */
        private double f1095r;

        /* renamed from: s */
        private int f1096s;

        /* renamed from: t */
        private int f1097t;

        /* renamed from: u */
        private int f1098u;

        /* renamed from: w */
        private int f1100w;

        /* renamed from: x */
        private int f1101x;

        /* renamed from: a */
        private final RectF f1078a = new RectF();

        /* renamed from: b */
        private final Paint f1079b = new Paint();

        /* renamed from: c */
        private final Paint f1080c = new Paint();

        /* renamed from: e */
        private float f1082e = 0.0f;

        /* renamed from: f */
        private float f1083f = 0.0f;

        /* renamed from: g */
        private float f1084g = 0.0f;

        /* renamed from: h */
        private float f1085h = 5.0f;

        /* renamed from: i */
        private float f1086i = 2.5f;

        /* renamed from: v */
        private final Paint f1099v = new Paint(1);

        public C0516a(Drawable.Callback callback) {
            this.f1081d = callback;
            this.f1079b.setStrokeCap(Paint.Cap.SQUARE);
            this.f1079b.setAntiAlias(true);
            this.f1079b.setStyle(Paint.Style.STROKE);
            this.f1080c.setStyle(Paint.Style.FILL);
            this.f1080c.setAntiAlias(true);
        }

        /* renamed from: a */
        public void m12203a(int i) {
            this.f1100w = i;
        }

        /* renamed from: a */
        public void m12204a(float f, float f2) {
            this.f1096s = (int) f;
            this.f1097t = (int) f2;
        }

        /* renamed from: a */
        public void m12200a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1078a;
            rectF.set(rect);
            rectF.inset(this.f1086i, this.f1086i);
            float f = (this.f1082e + this.f1084g) * 360.0f;
            float f2 = ((this.f1083f + this.f1084g) * 360.0f) - f;
            this.f1079b.setColor(this.f1101x);
            canvas.drawArc(rectF, f, f2, false, this.f1079b);
            m12201a(canvas, f, f2, rect);
            if (this.f1098u < 255) {
                this.f1099v.setColor(this.f1100w);
                this.f1099v.setAlpha(255 - this.f1098u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, this.f1099v);
            }
        }

        /* renamed from: a */
        private void m12201a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f1092o) {
                if (this.f1093p == null) {
                    this.f1093p = new Path();
                    this.f1093p.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    this.f1093p.reset();
                }
                float f3 = (((int) this.f1086i) / 2) * this.f1094q;
                float cos = (float) ((this.f1095r * Math.cos(0.0d)) + rect.exactCenterX());
                this.f1093p.moveTo(0.0f, 0.0f);
                this.f1093p.lineTo(this.f1096s * this.f1094q, 0.0f);
                this.f1093p.lineTo((this.f1096s * this.f1094q) / 2.0f, this.f1097t * this.f1094q);
                this.f1093p.offset(cos - f3, (float) ((this.f1095r * Math.sin(0.0d)) + rect.exactCenterY()));
                this.f1093p.close();
                this.f1080c.setColor(this.f1101x);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f1093p, this.f1080c);
            }
        }

        /* renamed from: a */
        public void m12197a(int[] iArr) {
            this.f1087j = iArr;
            m12191c(0);
        }

        /* renamed from: b */
        public void m12194b(int i) {
            this.f1101x = i;
        }

        /* renamed from: c */
        public void m12191c(int i) {
            this.f1088k = i;
            this.f1101x = this.f1087j[this.f1088k];
        }

        /* renamed from: a */
        public int m12207a() {
            return this.f1087j[m12177n()];
        }

        /* renamed from: n */
        private int m12177n() {
            return (this.f1088k + 1) % this.f1087j.length;
        }

        /* renamed from: b */
        public void m12196b() {
            m12191c(m12177n());
        }

        /* renamed from: a */
        public void m12199a(ColorFilter colorFilter) {
            this.f1079b.setColorFilter(colorFilter);
            m12176o();
        }

        /* renamed from: d */
        public void m12188d(int i) {
            this.f1098u = i;
        }

        /* renamed from: c */
        public int m12193c() {
            return this.f1098u;
        }

        /* renamed from: a */
        public void m12205a(float f) {
            this.f1085h = f;
            this.f1079b.setStrokeWidth(f);
            m12176o();
        }

        /* renamed from: d */
        public float m12190d() {
            return this.f1085h;
        }

        /* renamed from: b */
        public void m12195b(float f) {
            this.f1082e = f;
            m12176o();
        }

        /* renamed from: e */
        public float m12187e() {
            return this.f1082e;
        }

        /* renamed from: f */
        public float m12185f() {
            return this.f1089l;
        }

        /* renamed from: g */
        public float m12184g() {
            return this.f1090m;
        }

        /* renamed from: h */
        public int m12183h() {
            return this.f1087j[this.f1088k];
        }

        /* renamed from: c */
        public void m12192c(float f) {
            this.f1083f = f;
            m12176o();
        }

        /* renamed from: i */
        public float m12182i() {
            return this.f1083f;
        }

        /* renamed from: d */
        public void m12189d(float f) {
            this.f1084g = f;
            m12176o();
        }

        /* renamed from: a */
        public void m12202a(int i, int i2) {
            float ceil;
            float min = Math.min(i, i2);
            if (this.f1095r <= 0.0d || min < 0.0f) {
                ceil = (float) Math.ceil(this.f1085h / 2.0f);
            } else {
                ceil = (float) ((min / 2.0f) - this.f1095r);
            }
            this.f1086i = ceil;
        }

        /* renamed from: a */
        public void m12206a(double d) {
            this.f1095r = d;
        }

        /* renamed from: j */
        public double m12181j() {
            return this.f1095r;
        }

        /* renamed from: a */
        public void m12198a(boolean z) {
            if (this.f1092o != z) {
                this.f1092o = z;
                m12176o();
            }
        }

        /* renamed from: e */
        public void m12186e(float f) {
            if (f != this.f1094q) {
                this.f1094q = f;
                m12176o();
            }
        }

        /* renamed from: k */
        public float m12180k() {
            return this.f1091n;
        }

        /* renamed from: l */
        public void m12179l() {
            this.f1089l = this.f1082e;
            this.f1090m = this.f1083f;
            this.f1091n = this.f1084g;
        }

        /* renamed from: m */
        public void m12178m() {
            this.f1089l = 0.0f;
            this.f1090m = 0.0f;
            this.f1091n = 0.0f;
            m12195b(0.0f);
            m12192c(0.0f);
            m12189d(0.0f);
        }

        /* renamed from: o */
        private void m12176o() {
            this.f1081d.invalidateDrawable(null);
        }
    }
}
