package com.censivn.C3DEngine.b.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ZoomRenderer extends BaseRenderable {
    private IRenderable b;
    private float e;
    private float g;
    private float h;
    public float a = 0.1f;
    private boolean c = false;
    private float d = 0.0f;
    private float f = 0.0f;

    public ZoomRenderer(IRenderable iVar) {
        a(iVar);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this) { // from class: com.censivn.C3DEngine.b.b.ZoomRenderer.1
            float a;
            private com.censivn.C3DEngine.b.d.MouseEventListener d;
            private boolean e = false;
            private boolean f = false;

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void e(MotionEvent motionEvent) {
                ZoomRenderer.this.a = 0.3f;
                float[] fArrA = x.a(motionEvent);
                IRenderable hittingTarget = ZoomRenderer.this.b.getHittingTarget(fArrA[0], fArrA[1], false);
                if (hittingTarget != null && hittingTarget.getMouseEventListener() != null) {
                    this.d = hittingTarget.getMouseEventListener();
                    this.d.e(motionEvent);
                }
                ZoomRenderer dVar = ZoomRenderer.this;
                float f = ZoomRenderer.this.b.position().y;
                this.a = f;
                dVar.f = f;
                ZoomRenderer.this.b.setAnimationObjectState(true);
                this.f = false;
                this.e = true;
                ZoomRenderer.this.c = true;
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void f(MotionEvent motionEvent) {
                this.e = true;
                this.f = false;
                ZoomRenderer.this.c = false;
                if (this.d != null) {
                    this.d.f(motionEvent);
                    this.d = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.d != null) {
                    this.d.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                if (this.d != null) {
                    this.d.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ZoomRenderer.this.a = 0.3f;
                if (this.e) {
                    this.e = false;
                    if (Math.abs(f2) > Math.abs(f)) {
                        this.f = true;
                    }
                }
                if (this.f) {
                    ZoomRenderer.this.f = this.a + (motionEvent.getY() - motionEvent2.getY());
                    ZoomRenderer.this.f = com.tsf.shell.f.e.SpringEasing.a(ZoomRenderer.this.f, ZoomRenderer.this.e, ZoomRenderer.this.d);
                    return;
                }
                if (this.d != null) {
                    this.d.a(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void g(MotionEvent motionEvent) {
                ZoomRenderer.this.a = 0.1f;
            }

            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ZoomRenderer.this.a = 0.1f;
                if (this.f) {
                    ZoomRenderer.this.f = com.tsf.shell.f.e.SpringEasing.b(ZoomRenderer.this.f, f2);
                } else {
                    ZoomRenderer.this.a = 0.1f;
                }
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

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (this.b.getAnimationObjectState()) {
            if (this.c) {
                float f = (this.f - this.b.position().y) * 0.7f;
                PositionNumber3d positionNumber3dPosition = this.b.position();
                positionNumber3dPosition.y = f + positionNumber3dPosition.y;
                return;
            }
            float f2 = this.a;
            if (this.b.position().y > this.e && this.f > this.e) {
                this.f += (this.e - this.f) * 0.2f;
                f2 = 0.15f;
            } else if (this.b.position().y < this.d && this.f < this.d) {
                this.f += (this.d - this.f) * 0.2f;
                f2 = 0.15f;
            }
            float f3 = f2 * (this.f - this.b.position().y);
            PositionNumber3d positionNumber3dPosition2 = this.b.position();
            positionNumber3dPosition2.y = f3 + positionNumber3dPosition2.y;
            if (Math.abs(this.b.position().y - this.f) < 0.15f) {
                this.b.position().y = this.f;
                this.b.setAnimationObjectState(false);
            }
        }
    }

    private void a(IRenderable iVar) {
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
        PositionNumber3d positionNumber3dPosition = this.b.position();
        float f = this.d;
        this.f = f;
        positionNumber3dPosition.y = f;
    }
}
