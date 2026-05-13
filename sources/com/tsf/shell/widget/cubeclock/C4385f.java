package com.tsf.shell.widget.cubeclock;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
/* renamed from: com.tsf.shell.widget.cubeclock.f */
/* loaded from: classes.dex */
public class C4385f extends VObject3dContainer {

    /* renamed from: a */
    public C4383d f14230a;

    /* renamed from: g */
    private C4382c f14236g;

    /* renamed from: h */
    private AbstractC4384e f14237h;

    /* renamed from: c */
    private float f14232c = 0.0f;

    /* renamed from: d */
    private float f14233d = 0.8f;

    /* renamed from: e */
    private int f14234e = 0;

    /* renamed from: f */
    private int f14235f = 0;

    /* renamed from: b */
    int f14231b = 0;

    public C4385f(C4382c c4382c) {
        this.f14236g = c4382c;
        this.f14236g.f14195c.addObject(this);
        this.f14230a = new C4383d(this.f14236g);
        addChild(this.f14230a);
        setMouseEventListener(new VMouseEventListener(this) { // from class: com.tsf.shell.widget.cubeclock.f.1

            /* renamed from: a */
            float f14238a = 0.0f;

            /* renamed from: b */
            boolean f14239b = false;

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onDown(MotionEvent motionEvent) {
                this.f14239b = false;
                this.f14238a = C4385f.this.f14230a.rotation().f2526x;
                C4385f.this.f14232c = -100.0f;
                C4385f.this.f14233d = 0.8f;
                VTween.killTween(C4385f.this.f14230a);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VTween.killTween(C4385f.this.f14230a);
                C4385f.this.f14236g.f14202j.m26d();
                float y = ((motionEvent2.getY() - motionEvent.getY()) / 64.0f) * 90.0f;
                C4390j.m53a("Scroll rotationX:" + (this.f14238a + y));
                C4385f.this.f14230a.rotation().f2526x = y + this.f14238a;
                C4385f.this.f14230a.invalidate();
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                this.f14239b = true;
                C4385f.this.m56b(Math.round((((f2 < 0.0f ? -1.0f : 1.0f) * 900.0f) + this.f14238a) / 90.0f), 500);
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onSingleTapUp(MotionEvent motionEvent) {
                int m64a = C4385f.this.m64a(C4385f.this.f14230a.rotation().f2526x);
                C4390j.m53a("hit CubeIndex:" + m64a);
                int m57b = C4385f.this.m57b(m64a);
                if (C4385f.this.f14237h != null) {
                    C4385f.this.f14237h.mo68b(m57b);
                }
            }

            @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
            public void onUp(MotionEvent motionEvent) {
                C4385f.this.f14232c = 0.0f;
                C4385f.this.f14233d = 0.2f;
                C4385f.this.f14236g.f14202j.m26d();
                if (!this.f14239b) {
                    int round = Math.round(C4385f.this.f14230a.rotation().f2526x / 90.0f);
                    C4390j.m53a("EndingRotationX:" + round);
                    C4385f.this.m56b(round, 500);
                }
            }
        });
        setAABBPX((-64.0f) * this.f14236g.f14208p, (-64.0f) * this.f14236g.f14208p, 64.0f * this.f14236g.f14208p, 64.0f * this.f14236g.f14208p, 64.0f * this.f14236g.f14208p, (-64.0f) * this.f14236g.f14208p);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        int m57b;
        int m64a = m64a(this.f14230a.rotation().f2526x);
        if (m64a != this.f14231b) {
            m62a(this.f14231b, m64a);
        }
        this.f14231b = m64a;
        float f = (this.f14232c - this.f14230a.position().f2528z) * this.f14233d;
        this.f14230a.position().f2528z += f;
        if (Math.abs(f) < 0.02f) {
            this.f14230a.position().f2528z = this.f14232c;
            if (this.f14237h != null && this.f14235f != (m57b = m57b(this.f14234e))) {
                this.f14235f = m57b;
                this.f14237h.mo66d(m57b);
            }
        }
    }

    /* renamed from: a */
    public int m64a(float f) {
        return Math.round(f / 90.0f);
    }

    /* renamed from: a */
    public void m61a(AbstractC4384e abstractC4384e, AbstractC4387g abstractC4387g) {
        this.f14237h = abstractC4384e;
        this.f14237h.m69a(this);
        this.f14230a.f14213d = abstractC4387g.f14241a.f2529id;
        m58b();
    }

    /* renamed from: a */
    public void m62a(int i, int i2) {
        if (this.f14237h != null) {
            if (Math.abs(i2 - i) < 2) {
                int i3 = (i2 <= i ? -2 : 2) + i;
                this.f14230a.m75a(m63a(i3), this.f14237h.mo13a(m57b(i3)));
                return;
            }
            m58b();
        }
    }

    /* renamed from: b */
    private void m58b() {
        if (this.f14237h != null) {
            int m64a = m64a(this.f14230a.rotation().f2526x);
            this.f14230a.m75a(m63a(m64a), this.f14237h.mo13a(m57b(m64a)));
            int m64a2 = m64a(this.f14230a.rotation().f2526x + 90.0f);
            this.f14230a.m75a(m63a(m64a2), this.f14237h.mo13a(m57b(m64a2)));
            int m64a3 = m64a(this.f14230a.rotation().f2526x - 90.0f);
            this.f14230a.m75a(m63a(m64a3), this.f14237h.mo13a(m57b(m64a3)));
        }
    }

    /* renamed from: a */
    public int m63a(int i) {
        int i2 = i % 4;
        return i2 < 0 ? i2 + 4 : i2;
    }

    /* renamed from: b */
    public int m57b(int i) {
        int mo14a = this.f14237h.mo14a();
        int i2 = i % mo14a;
        return i2 < 0 ? i2 + mo14a : i2;
    }

    /* renamed from: b */
    public void m56b(int i, int i2) {
        if (this.f14237h != null) {
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setRotationX(i * 90);
            VTween.killTween(this.f14230a);
            VTween.m10747to(this.f14230a, i2, vTweenParam);
            if (this.f14234e != i) {
                this.f14237h.mo67c(m57b(this.f14234e));
            }
            this.f14234e = i;
        }
    }

    /* renamed from: a */
    public int m65a() {
        return m64a(this.f14230a.rotation().f2526x);
    }
}
