package com.tsf.extend.base.j;

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
/* loaded from: classes.dex */
public class s {
    @TargetApi(11)
    public static ObjectAnimator a(View view, float f, float f2) {
        Keyframe ofFloat = Keyframe.ofFloat(f, f);
        Keyframe ofFloat2 = Keyframe.ofFloat(f, f2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(1.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.4f)));
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(100L);
        return ofPropertyValuesHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public static void b(View view, float f, float f2) {
        view.setOnTouchListener(new b(a(view, f, f2), ViewConfiguration.get(view.getContext()).getScaledTouchSlop()));
    }

    @TargetApi(12)
    public static Animator a(View view, boolean z) {
        final a aVar = new a();
        com.tsf.extend.base.j.b.a(view, aVar);
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
                a.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new c(100, 200L));
        ofFloat.setDuration(1100L);
        ofFloat.setStartDelay(100L);
        if (z) {
            ofFloat.start();
        }
        return ofFloat;
    }

    @TargetApi(11)
    /* loaded from: classes.dex */
    private static class c implements Animator.AnimatorListener {
        private int a;
        private int b = 0;
        private long c;

        public c(int i, long j) {
            this.a = 0;
            this.c = 0L;
            this.a = i;
            this.c = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b++;
            if (this.b < this.a) {
                animator.setStartDelay(this.c);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = 0;
            animator.end();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    private static class b implements View.OnTouchListener {
        private ObjectAnimator a;
        private int b;
        private boolean c = false;
        private boolean d = false;

        /* JADX INFO: Access modifiers changed from: private */
        public ObjectAnimator a() {
            return this.a;
        }

        @TargetApi(11)
        public b(ObjectAnimator objectAnimator, int i) {
            this.a = objectAnimator;
            this.b = i;
            this.a.addListener(new Animator.AnimatorListener() { // from class: com.tsf.extend.base.j.s.b.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (b.this.c || b.this.d) {
                        b.this.d = false;
                        return;
                    }
                    b.this.d = true;
                    z.a(0, new Runnable() { // from class: com.tsf.extend.base.j.s.b.1.1
                        @Override // java.lang.Runnable
                        @TargetApi(11)
                        public void run() {
                            b.this.a().reverse();
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
                    this.a.start();
                    this.c = true;
                    break;
                case 1:
                case 3:
                    if (this.c) {
                        if (!this.a.isRunning()) {
                            this.a.reverse();
                            this.d = true;
                        }
                        this.c = false;
                        break;
                    }
                    break;
                case 2:
                    if (this.c && !s.b(view, motionEvent.getX(), motionEvent.getY(), this.b)) {
                        if (!this.a.isRunning()) {
                            this.a.reverse();
                            this.d = true;
                        }
                        this.c = false;
                        break;
                    }
                    break;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    private static class a extends Drawable {
        private final com.tsf.extend.base.view.a a;
        private float c = 0.0f;
        private DecelerateInterpolator d = new DecelerateInterpolator();
        private int e = Color.parseColor("#4480F7");
        private Paint b = new Paint();

        public a() {
            this.b.setColor(this.e);
            this.a = new com.tsf.extend.base.view.a(new float[]{0.0f, 0.0f, 0.3f, 0.9f, 0.33f, 1.0f, 0.35f, 0.75f, 0.95f, 0.0f, 1.0f, 0.0f}, 300);
        }

        public void a(float f) {
            this.c = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            int a = (int) (51.0f * this.a.a(this.c));
            if (a < 0) {
                a = 0;
            }
            int i = a <= 255 ? a : 255;
            this.b.setColor(this.e);
            this.b.setAlpha(i);
            canvas.drawCircle(centerX, centerY, (width * ((this.d.getInterpolation(this.c) * 0.8f) + 0.4f)) / 2.0f, this.b);
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
