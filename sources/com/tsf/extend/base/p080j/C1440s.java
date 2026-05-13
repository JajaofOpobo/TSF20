package com.tsf.extend.base.p080j;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import com.tsf.extend.base.view.C1475a;
/* renamed from: com.tsf.extend.base.j.s */
/* loaded from: classes.dex */
public class C1440s {
    @TargetApi(11)
    /* renamed from: a */
    public static ObjectAnimator m8602a(View view, float f, float f2) {
        Keyframe ofFloat = Keyframe.ofFloat(f, f);
        Keyframe ofFloat2 = Keyframe.ofFloat(f, f2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(1.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.4f)));
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(100L);
        return ofPropertyValuesHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m8598b(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: b */
    public static void m8599b(View view, float f, float f2) {
        view.setOnTouchListener(new View$OnTouchListenerC1444b(m8602a(view, f, f2), ViewConfiguration.get(view.getContext()).getScaledTouchSlop()));
    }

    @TargetApi(12)
    /* renamed from: a */
    public static Animator m8600a(View view, boolean z) {
        final C1443a c1443a = new C1443a();
        C1421b.m8699a(view, c1443a);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        view.setTag(view.getId(), ofFloat);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tsf.extend.base.j.s.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                ofFloat.end();
                view2.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.base.j.s.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1443a.this.m8597a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new C1447c(100, 200L));
        ofFloat.setDuration(1100L);
        ofFloat.setStartDelay(100L);
        if (z) {
            ofFloat.start();
        }
        return ofFloat;
    }

    @TargetApi(11)
    /* renamed from: com.tsf.extend.base.j.s$c */
    /* loaded from: classes.dex */
    private static class C1447c implements Animator.AnimatorListener {

        /* renamed from: a */
        private int f4454a;

        /* renamed from: b */
        private int f4455b = 0;

        /* renamed from: c */
        private long f4456c;

        public C1447c(int i, long j) {
            this.f4454a = 0;
            this.f4456c = 0L;
            this.f4454a = i;
            this.f4456c = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4455b++;
            if (this.f4455b < this.f4454a) {
                animator.setStartDelay(this.f4456c);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4454a = 0;
            animator.end();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* renamed from: com.tsf.extend.base.j.s$b */
    /* loaded from: classes.dex */
    private static class View$OnTouchListenerC1444b implements View.OnTouchListener {

        /* renamed from: a */
        private ObjectAnimator f4448a;

        /* renamed from: b */
        private int f4449b;

        /* renamed from: c */
        private boolean f4450c = false;

        /* renamed from: d */
        private boolean f4451d = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public ObjectAnimator m8596a() {
            return this.f4448a;
        }

        @TargetApi(11)
        public View$OnTouchListenerC1444b(ObjectAnimator objectAnimator, int i) {
            this.f4448a = objectAnimator;
            this.f4449b = i;
            this.f4448a.addListener(new Animator.AnimatorListener() { // from class: com.tsf.extend.base.j.s.b.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (View$OnTouchListenerC1444b.this.f4450c || View$OnTouchListenerC1444b.this.f4451d) {
                        View$OnTouchListenerC1444b.this.f4451d = false;
                        return;
                    }
                    View$OnTouchListenerC1444b.this.f4451d = true;
                    C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.base.j.s.b.1.1
                        @Override // java.lang.Runnable
                        @TargetApi(11)
                        public void run() {
                            View$OnTouchListenerC1444b.this.m8596a().reverse();
                        }
                    });
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }
            });
        }

        @Override // android.view.View.OnTouchListener
        @TargetApi(11)
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f4448a.start();
                    this.f4450c = true;
                    break;
                case 1:
                case 3:
                    if (this.f4450c) {
                        if (!this.f4448a.isRunning()) {
                            this.f4448a.reverse();
                            this.f4451d = true;
                        }
                        this.f4450c = false;
                        break;
                    }
                    break;
                case 2:
                    if (this.f4450c && !C1440s.m8598b(view, motionEvent.getX(), motionEvent.getY(), this.f4449b)) {
                        if (!this.f4448a.isRunning()) {
                            this.f4448a.reverse();
                            this.f4451d = true;
                        }
                        this.f4450c = false;
                        break;
                    }
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.tsf.extend.base.j.s$a */
    /* loaded from: classes.dex */
    private static class C1443a extends Drawable {

        /* renamed from: a */
        private final C1475a f4443a;

        /* renamed from: c */
        private float f4445c = 0.0f;

        /* renamed from: d */
        private DecelerateInterpolator f4446d = new DecelerateInterpolator();

        /* renamed from: e */
        private int f4447e = Color.parseColor("#4480F7");

        /* renamed from: b */
        private Paint f4444b = new Paint();

        public C1443a() {
            this.f4444b.setColor(this.f4447e);
            this.f4443a = new C1475a(new float[]{0.0f, 0.0f, 0.3f, 0.9f, 0.33f, 1.0f, 0.35f, 0.75f, 0.95f, 0.0f, 1.0f, 0.0f}, 300);
        }

        /* renamed from: a */
        public void m8597a(float f) {
            this.f4445c = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            int m8467a = (int) (51.0f * this.f4443a.m8467a(this.f4445c));
            if (m8467a < 0) {
                m8467a = 0;
            }
            int i = m8467a <= 255 ? m8467a : 255;
            this.f4444b.setColor(this.f4447e);
            this.f4444b.setAlpha(i);
            canvas.drawCircle(centerX, centerY, (width * ((this.f4446d.getInterpolation(this.f4445c) * 0.8f) + 0.4f)) / 2.0f, this.f4444b);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return 0;
        }
    }
}
