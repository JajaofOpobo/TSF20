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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class s {
    @TargetApi(11)
    public static ObjectAnimator a(View view, float f, float f2) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(f, f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(f, f2);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(1.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.4f)));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setDuration(100L);
        return objectAnimatorOfPropertyValuesHolder;
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
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        view.setTag(view.getId(), valueAnimatorOfFloat);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tsf.extend.base.j.s.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                valueAnimatorOfFloat.end();
                view2.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }
        });
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.base.j.s.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.addListener(new c(100, 200L));
        valueAnimatorOfFloat.setDuration(1100L);
        valueAnimatorOfFloat.setStartDelay(100L);
        if (z) {
            valueAnimatorOfFloat.start();
        }
        return valueAnimatorOfFloat;
    }

    @TargetApi(11)
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
                    } else {
                        b.this.d = true;
                        z.a(0, new Runnable() { // from class: com.tsf.extend.base.j.s.b.1.1
                            @Override // java.lang.Runnable
                            @TargetApi(11)
                            public void run() {
                                b.this.a().reverse();
                            }
                        });
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }
            });
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.view.View.OnTouchListener
        @TargetApi(11)
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.a.start();
                    this.c = true;
                    return false;
                case 1:
                case 3:
                    if (this.c) {
                        if (!this.a.isRunning()) {
                            this.a.reverse();
                            this.d = true;
                        }
                        this.c = false;
                    }
                    return false;
                case 2:
                    if (this.c && !s.b(view, motionEvent.getX(), motionEvent.getY(), this.b)) {
                        if (!this.a.isRunning()) {
                            this.a.reverse();
                            this.d = true;
                        }
                        this.c = false;
                    }
                    return false;
                default:
                    return false;
            }
        }
    }

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
            int iWidth = bounds.width();
            int iCenterX = bounds.centerX();
            int iCenterY = bounds.centerY();
            int iA = (int) (51.0f * this.a.a(this.c));
            if (iA < 0) {
                iA = 0;
            }
            int i = iA <= 255 ? iA : 255;
            this.b.setColor(this.e);
            this.b.setAlpha(i);
            canvas.drawCircle(iCenterX, iCenterY, (iWidth * ((this.d.getInterpolation(this.c) * 0.8f) + 0.4f)) / 2.0f, this.b);
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
