package com.censivn.C3DEngine.p031b.p033b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.b.d */
/* loaded from: classes.dex */
public class C0911d extends C0980j {

    /* renamed from: b */
    private C0975i f2683b;

    /* renamed from: e */
    private float f2686e;

    /* renamed from: g */
    private float f2688g;

    /* renamed from: h */
    private float f2689h;

    /* renamed from: a */
    public float f2682a = 0.1f;

    /* renamed from: c */
    private boolean f2684c = false;

    /* renamed from: d */
    private float f2685d = 0.0f;

    /* renamed from: f */
    private float f2687f = 0.0f;

    public C0911d(C0975i c0975i) {
        m10607a(c0975i);
        setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.b.d.1

            /* renamed from: a */
            float f2690a;

            /* renamed from: d */
            private C0937a f2692d;

            /* renamed from: e */
            private boolean f2693e = false;

            /* renamed from: f */
            private boolean f2694f = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C0911d.this.f2682a = 0.3f;
                float[] m601a = C4189x.m601a(motionEvent);
                C0975i hittingTarget = C0911d.this.f2683b.getHittingTarget(m601a[0], m601a[1], false);
                if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                    this.f2692d = hittingTarget.getMouseEventListener();
                    this.f2692d.mo1654e(motionEvent);
                }
                C0911d c0911d = C0911d.this;
                float f = C0911d.this.f2683b.position().f2527y;
                this.f2690a = f;
                c0911d.f2687f = f;
                C0911d.this.f2683b.setAnimationObjectState(true);
                this.f2694f = false;
                this.f2693e = true;
                C0911d.this.f2684c = true;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                this.f2693e = true;
                this.f2694f = false;
                C0911d.this.f2684c = false;
                if (this.f2692d != null) {
                    this.f2692d.mo1653f(motionEvent);
                    this.f2692d = null;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f2692d != null) {
                    this.f2692d.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f2692d != null) {
                    this.f2692d.mo502a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C0911d.this.f2682a = 0.3f;
                if (this.f2693e) {
                    this.f2693e = false;
                    if (Math.abs(f2) > Math.abs(f)) {
                        this.f2694f = true;
                    }
                }
                if (this.f2694f) {
                    C0911d.this.f2687f = this.f2690a + (motionEvent.getY() - motionEvent2.getY());
                    C0911d.this.f2687f = C2477c.m5473a(C0911d.this.f2687f, C0911d.this.f2686e, C0911d.this.f2685d);
                } else if (this.f2692d != null) {
                    this.f2692d.mo527a(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                C0911d.this.f2682a = 0.1f;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C0911d.this.f2682a = 0.1f;
                if (this.f2694f) {
                    C0911d.this.f2687f = C2477c.m5471b(C0911d.this.f2687f, f2);
                    return;
                }
                C0911d.this.f2682a = 0.1f;
            }
        });
    }

    /* renamed from: a */
    public float m10612a() {
        return this.f2685d;
    }

    /* renamed from: d */
    private void m10601d() {
        if (this.f2687f > this.f2686e) {
            this.f2687f = this.f2686e;
            this.f2683b.setAnimationObjectState(true);
        } else if (this.f2687f < this.f2685d) {
            this.f2687f = this.f2685d;
            this.f2683b.setAnimationObjectState(true);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f2683b.getAnimationObjectState()) {
            if (this.f2684c) {
                PositionNumber3d position = this.f2683b.position();
                position.f2527y = ((this.f2687f - this.f2683b.position().f2527y) * 0.7f) + position.f2527y;
                return;
            }
            float f = this.f2682a;
            if (this.f2683b.position().f2527y > this.f2686e && this.f2687f > this.f2686e) {
                this.f2687f += (this.f2686e - this.f2687f) * 0.2f;
                f = 0.15f;
            } else if (this.f2683b.position().f2527y < this.f2685d && this.f2687f < this.f2685d) {
                this.f2687f += (this.f2685d - this.f2687f) * 0.2f;
                f = 0.15f;
            }
            float f2 = f * (this.f2687f - this.f2683b.position().f2527y);
            PositionNumber3d position2 = this.f2683b.position();
            position2.f2527y = f2 + position2.f2527y;
            if (Math.abs(this.f2683b.position().f2527y - this.f2687f) < 0.15f) {
                this.f2683b.position().f2527y = this.f2687f;
                this.f2683b.setAnimationObjectState(false);
            }
        }
    }

    /* renamed from: a */
    private void m10607a(C0975i c0975i) {
        if (this.f2683b != null) {
            this.f2683b.removeFromParent();
        }
        this.f2683b = c0975i;
        m10606b();
        addChild(this.f2683b);
    }

    /* renamed from: a */
    public void m10611a(float f, float f2) {
        this.f2688g = f;
        this.f2689h = f2;
        setAABBPX((-this.f2688g) / 2.0f, -this.f2689h, 0.0f, this.f2688g / 2.0f, 0.0f, 0.0f);
        m10606b();
    }

    /* renamed from: b */
    public void m10606b() {
        float f = -this.f2683b.minY();
        if (f > this.f2689h) {
            this.f2686e = f - this.f2689h;
        } else {
            this.f2686e = 0.0f;
        }
        m10601d();
    }

    /* renamed from: b */
    public void m10605b(float f, float f2) {
        this.f2682a = f2;
        if (f > this.f2686e) {
            f = this.f2686e;
        } else if (f < this.f2685d) {
            f = this.f2685d;
        }
        this.f2687f = f;
        this.f2683b.setAnimationObjectState(true);
    }

    /* renamed from: c */
    public void m10603c() {
        PositionNumber3d position = this.f2683b.position();
        float f = this.f2685d;
        this.f2687f = f;
        position.f2527y = f;
    }
}
