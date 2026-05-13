package com.tsf.shell.widget.cubeclock;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
/* loaded from: classes.dex */
public class f extends VObject3dContainer {
    public d a;
    private c g;
    private e h;
    private float c = 0.0f;
    private float d = 0.8f;
    private int e = 0;
    private int f = 0;
    int b = 0;

    public f(c cVar) {
        this.g = cVar;
        this.g.c.addObject(this);
        this.a = new d(this.g);
        addChild(this.a);
        setMouseEventListener(new VMouseEventListener(this) { // from class: com.tsf.shell.widget.cubeclock.f.1
            float a = 0.0f;
            boolean b = false;

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onDown(MotionEvent motionEvent) {
                this.b = false;
                this.a = f.this.a.rotation().x;
                f.this.c = -100.0f;
                f.this.d = 0.8f;
                VTween.killTween(f.this.a);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VTween.killTween(f.this.a);
                f.this.g.j.d();
                float y = ((motionEvent2.getY() - motionEvent.getY()) / 64.0f) * 90.0f;
                j.a("Scroll rotationX:" + (this.a + y));
                f.this.a.rotation().x = y + this.a;
                f.this.a.invalidate();
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                this.b = true;
                f.this.b(Math.round((((f2 < 0.0f ? -1.0f : 1.0f) * 900.0f) + this.a) / 90.0f), 500);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onSingleTapUp(MotionEvent motionEvent) {
                int a = f.this.a(f.this.a.rotation().x);
                j.a("hit CubeIndex:" + a);
                int b = f.this.b(a);
                if (f.this.h != null) {
                    f.this.h.b(b);
                }
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onUp(MotionEvent motionEvent) {
                f.this.c = 0.0f;
                f.this.d = 0.2f;
                f.this.g.j.d();
                if (!this.b) {
                    int round = Math.round(f.this.a.rotation().x / 90.0f);
                    j.a("EndingRotationX:" + round);
                    f.this.b(round, 500);
                }
            }
        });
        setAABBPX((-64.0f) * this.g.p, (-64.0f) * this.g.p, 64.0f * this.g.p, 64.0f * this.g.p, 64.0f * this.g.p, (-64.0f) * this.g.p);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        int b;
        int a = a(this.a.rotation().x);
        if (a != this.b) {
            a(this.b, a);
        }
        this.b = a;
        float f = (this.c - this.a.position().z) * this.d;
        this.a.position().z += f;
        if (Math.abs(f) < 0.02f) {
            this.a.position().z = this.c;
            if (this.h != null && this.f != (b = b(this.e))) {
                this.f = b;
                this.h.d(b);
            }
        }
    }

    public int a(float f) {
        return Math.round(f / 90.0f);
    }

    public void a(e eVar, g gVar) {
        this.h = eVar;
        this.h.a(this);
        this.a.d = gVar.a.id;
        b();
    }

    public void a(int i, int i2) {
        if (this.h != null) {
            if (Math.abs(i2 - i) < 2) {
                int i3 = (i2 <= i ? -2 : 2) + i;
                this.a.a(a(i3), this.h.a(b(i3)));
                return;
            }
            b();
        }
    }

    private void b() {
        if (this.h != null) {
            int a = a(this.a.rotation().x);
            this.a.a(a(a), this.h.a(b(a)));
            int a2 = a(this.a.rotation().x + 90.0f);
            this.a.a(a(a2), this.h.a(b(a2)));
            int a3 = a(this.a.rotation().x - 90.0f);
            this.a.a(a(a3), this.h.a(b(a3)));
        }
    }

    public int a(int i) {
        int i2 = i % 4;
        return i2 < 0 ? i2 + 4 : i2;
    }

    public int b(int i) {
        int a = this.h.a();
        int i2 = i % a;
        return i2 < 0 ? i2 + a : i2;
    }

    public void b(int i, int i2) {
        if (this.h != null) {
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setRotationX(i * 90);
            VTween.killTween(this.a);
            VTween.to(this.a, i2, vTweenParam);
            if (this.e != i) {
                this.h.c(b(this.e));
            }
            this.e = i;
        }
    }

    public int a() {
        return a(this.a.rotation().x);
    }
}
