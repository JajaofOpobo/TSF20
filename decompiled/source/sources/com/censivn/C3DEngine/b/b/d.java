package com.censivn.C3DEngine.b.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class d extends j {
    private i b;
    private float e;
    private float g;
    private float h;
    public float a = 0.1f;
    private boolean c = false;
    private float d = 0.0f;
    private float f = 0.0f;

    public d(i iVar) {
        a(iVar);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.b.d.1
            float a;
            private com.censivn.C3DEngine.b.d.a d;
            private boolean e = false;
            private boolean f = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                d.this.a = 0.3f;
                float[] a = x.a(motionEvent);
                i hittingTarget = d.this.b.getHittingTarget(a[0], a[1], false);
                if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                    this.d = hittingTarget.getMouseEventListener();
                    this.d.e(motionEvent);
                }
                d dVar = d.this;
                float f = d.this.b.position().y;
                this.a = f;
                dVar.f = f;
                d.this.b.setAnimationObjectState(true);
                this.f = false;
                this.e = true;
                d.this.c = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                this.e = true;
                this.f = false;
                d.this.c = false;
                if (this.d != null) {
                    this.d.f(motionEvent);
                    this.d = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.d != null) {
                    this.d.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                d.this.a = 0.3f;
                if (this.e) {
                    this.e = false;
                    if (Math.abs(f2) > Math.abs(f)) {
                        this.f = true;
                    }
                }
                if (this.f) {
                    d.this.f = this.a + (motionEvent.getY() - motionEvent2.getY());
                    d.this.f = com.tsf.shell.f.e.c.a(d.this.f, d.this.e, d.this.d);
                } else if (this.d != null) {
                    this.d.a(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                d.this.a = 0.1f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                d.this.a = 0.1f;
                if (this.f) {
                    d.this.f = com.tsf.shell.f.e.c.b(d.this.f, f2);
                    return;
                }
                d.this.a = 0.1f;
            }
        });
    }

    public float a() {
        return this.d;
    }

    private void d() {
        if (this.f > this.e) {
            this.f = this.e;
            this.b.setAnimationObjectState(true);
        } else if (this.f < this.d) {
            this.f = this.d;
            this.b.setAnimationObjectState(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.b.getAnimationObjectState()) {
            if (this.c) {
                PositionNumber3d position = this.b.position();
                position.y = ((this.f - this.b.position().y) * 0.7f) + position.y;
                return;
            }
            float f = this.a;
            if (this.b.position().y > this.e && this.f > this.e) {
                this.f += (this.e - this.f) * 0.2f;
                f = 0.15f;
            } else if (this.b.position().y < this.d && this.f < this.d) {
                this.f += (this.d - this.f) * 0.2f;
                f = 0.15f;
            }
            float f2 = f * (this.f - this.b.position().y);
            PositionNumber3d position2 = this.b.position();
            position2.y = f2 + position2.y;
            if (Math.abs(this.b.position().y - this.f) < 0.15f) {
                this.b.position().y = this.f;
                this.b.setAnimationObjectState(false);
            }
        }
    }

    private void a(i iVar) {
        if (this.b != null) {
            this.b.removeFromParent();
        }
        this.b = iVar;
        b();
        addChild(this.b);
    }

    public void a(float f, float f2) {
        this.g = f;
        this.h = f2;
        setAABBPX((-this.g) / 2.0f, -this.h, 0.0f, this.g / 2.0f, 0.0f, 0.0f);
        b();
    }

    public void b() {
        float f = -this.b.minY();
        if (f > this.h) {
            this.e = f - this.h;
        } else {
            this.e = 0.0f;
        }
        d();
    }

    public void b(float f, float f2) {
        this.a = f2;
        if (f > this.e) {
            f = this.e;
        } else if (f < this.d) {
            f = this.d;
        }
        this.f = f;
        this.b.setAnimationObjectState(true);
    }

    public void c() {
        PositionNumber3d position = this.b.position();
        float f = this.d;
        this.f = f;
        position.y = f;
    }
}
