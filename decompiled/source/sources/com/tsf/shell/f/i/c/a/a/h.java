package com.tsf.shell.f.i.c.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;
/* loaded from: classes.dex */
public class h extends VObject3dContainer {
    public static boolean e = false;
    public f a;
    public f b;
    public f c;
    public f d;
    private float f;
    private float g;
    private a h;

    public h(float f, float f2) {
        this.f = f;
        this.g = f2;
        setAnimationObjectState(false);
        c();
        calAABB();
    }

    public void a() {
        this.a.textures().removeAll();
        this.b.textures().removeAll();
        this.c.textures().removeAll();
        this.d.textures().removeAll();
    }

    private void c() {
        this.a = new f(this.g * 64.0f, this.g * 64.0f, 0.0f);
        this.b = new f(this.g * 256.0f, this.g * 192.0f, 10.0f);
        this.b.moveAllPointsPX(this.f * 0.0f, this.f * (-40.0f), 0.0f);
        this.c = new f(this.g * 256.0f, this.g * 192.0f, 25.0f);
        this.c.moveAllPointsPX((-10.0f) * this.f, this.f * (-40.0f), 0.0f);
        this.d = new f(this.g * 256.0f, this.g * 192.0f, -5.0f);
        this.d.moveAllPointsPX(0.0f, this.f * (-40.0f), 0.0f);
        addChild(this.b);
        addChild(this.c);
        addChild(this.d);
        addChild(this.a);
        this.h = new a(this);
        setMouseEventListener(this.h);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends VMouseEventListener {
        Number3d a;
        float b;
        float c;
        private boolean e;

        a(VObject3d vObject3d) {
            super(vObject3d);
            this.a = new Number3d(0.0f, 0.0f, 0.0f);
            this.b = 0.0f;
            this.c = 0.0f;
            this.e = false;
        }

        private Number3d a(MotionEvent motionEvent) {
            this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.a.y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.a.z = 0.0f;
            Number3d globalToLocal = h.this.globalToLocal(this.a);
            globalToLocal.y -= 112.0f;
            return globalToLocal;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            this.e = false;
            h.this.d.a = 0.0f;
            Number3d a = a(motionEvent);
            this.c = (float) Math.atan2(a.y, a.x);
            this.b = h.this.d.b;
            h.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            if (!this.e) {
                h.this.d.a = 2.0E-4f;
                h.this.invalidate();
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Number3d a = a(motionEvent2);
            double d = this.c;
            h.this.d.c = (float) (this.b - Math.toDegrees((float) (d - ((float) Math.atan2(a.y, a.x)))));
            h.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.e = true;
            float sqrt = (float) ((Math.sqrt((f * f) + (f2 * f2)) / 2000.0d) * 5.0d);
            if (f > 0.0f) {
                h.this.b.a += sqrt;
                h.this.c.a += sqrt * 0.9f;
                f fVar = h.this.d;
                fVar.a = (sqrt * 0.8f) + fVar.a;
            } else {
                h.this.b.a -= sqrt;
                h.this.c.a -= sqrt * 0.9f;
                h.this.d.a -= sqrt * 0.8f;
            }
            h.this.invalidate();
        }
    }

    public void b() {
        f fVar = this.b;
        fVar.a = ((float) ((Math.random() * 20.0d) - 10.0d)) + fVar.a;
        f fVar2 = this.c;
        fVar2.a = (((float) ((Math.random() * 20.0d) - 10.0d)) * 0.9f) + fVar2.a;
        this.d.a += ((float) ((Math.random() * 20.0d) - 10.0d)) * 0.8f;
        invalidate();
    }
}
