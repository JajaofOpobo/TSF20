package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;
/* renamed from: com.tsf.shell.f.i.c.a.a.h */
/* loaded from: classes.dex */
public class C3252h extends VObject3dContainer {

    /* renamed from: e */
    public static boolean f10683e = false;

    /* renamed from: a */
    public C3250f f10684a;

    /* renamed from: b */
    public C3250f f10685b;

    /* renamed from: c */
    public C3250f f10686c;

    /* renamed from: d */
    public C3250f f10687d;

    /* renamed from: f */
    private float f10688f;

    /* renamed from: g */
    private float f10689g;

    /* renamed from: h */
    private C3253a f10690h;

    public C3252h(float f, float f2) {
        this.f10688f = f;
        this.f10689g = f2;
        setAnimationObjectState(false);
        m2997c();
        calAABB();
    }

    /* renamed from: a */
    public void m2999a() {
        this.f10684a.textures().removeAll();
        this.f10685b.textures().removeAll();
        this.f10686c.textures().removeAll();
        this.f10687d.textures().removeAll();
    }

    /* renamed from: c */
    private void m2997c() {
        this.f10684a = new C3250f(this.f10689g * 64.0f, this.f10689g * 64.0f, 0.0f);
        this.f10685b = new C3250f(this.f10689g * 256.0f, this.f10689g * 192.0f, 10.0f);
        this.f10685b.moveAllPointsPX(this.f10688f * 0.0f, this.f10688f * (-40.0f), 0.0f);
        this.f10686c = new C3250f(this.f10689g * 256.0f, this.f10689g * 192.0f, 25.0f);
        this.f10686c.moveAllPointsPX((-10.0f) * this.f10688f, this.f10688f * (-40.0f), 0.0f);
        this.f10687d = new C3250f(this.f10689g * 256.0f, this.f10689g * 192.0f, -5.0f);
        this.f10687d.moveAllPointsPX(0.0f, this.f10688f * (-40.0f), 0.0f);
        addChild(this.f10685b);
        addChild(this.f10686c);
        addChild(this.f10687d);
        addChild(this.f10684a);
        this.f10690h = new C3253a(this);
        setMouseEventListener(this.f10690h);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.c.a.a.h$a */
    /* loaded from: classes.dex */
    public class C3253a extends VMouseEventListener {

        /* renamed from: a */
        Number3d f10691a;

        /* renamed from: b */
        float f10692b;

        /* renamed from: c */
        float f10693c;

        /* renamed from: e */
        private boolean f10695e;

        C3253a(VObject3d vObject3d) {
            super(vObject3d);
            this.f10691a = new Number3d(0.0f, 0.0f, 0.0f);
            this.f10692b = 0.0f;
            this.f10693c = 0.0f;
            this.f10695e = false;
        }

        /* renamed from: a */
        private Number3d m2996a(MotionEvent motionEvent) {
            this.f10691a.f2526x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.f10691a.f2527y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.f10691a.f2528z = 0.0f;
            Number3d globalToLocal = C3252h.this.globalToLocal(this.f10691a);
            globalToLocal.f2527y -= 112.0f;
            return globalToLocal;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            this.f10695e = false;
            C3252h.this.f10687d.f10679a = 0.0f;
            Number3d m2996a = m2996a(motionEvent);
            this.f10693c = (float) Math.atan2(m2996a.f2527y, m2996a.f2526x);
            this.f10692b = C3252h.this.f10687d.f10680b;
            C3252h.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            if (!this.f10695e) {
                C3252h.this.f10687d.f10679a = 2.0E-4f;
                C3252h.this.invalidate();
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Number3d m2996a = m2996a(motionEvent2);
            double d = this.f10693c;
            C3252h.this.f10687d.f10681c = (float) (this.f10692b - Math.toDegrees((float) (d - ((float) Math.atan2(m2996a.f2527y, m2996a.f2526x)))));
            C3252h.this.invalidate();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.f10695e = true;
            float sqrt = (float) ((Math.sqrt((f * f) + (f2 * f2)) / 2000.0d) * 5.0d);
            if (f > 0.0f) {
                C3252h.this.f10685b.f10679a += sqrt;
                C3252h.this.f10686c.f10679a += sqrt * 0.9f;
                C3250f c3250f = C3252h.this.f10687d;
                c3250f.f10679a = (sqrt * 0.8f) + c3250f.f10679a;
            } else {
                C3252h.this.f10685b.f10679a -= sqrt;
                C3252h.this.f10686c.f10679a -= sqrt * 0.9f;
                C3252h.this.f10687d.f10679a -= sqrt * 0.8f;
            }
            C3252h.this.invalidate();
        }
    }

    /* renamed from: b */
    public void m2998b() {
        C3250f c3250f = this.f10685b;
        c3250f.f10679a = ((float) ((Math.random() * 20.0d) - 10.0d)) + c3250f.f10679a;
        C3250f c3250f2 = this.f10686c;
        c3250f2.f10679a = (((float) ((Math.random() * 20.0d) - 10.0d)) * 0.9f) + c3250f2.f10679a;
        this.f10687d.f10679a += ((float) ((Math.random() * 20.0d) - 10.0d)) * 0.8f;
        invalidate();
    }
}
