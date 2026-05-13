package com.tsf.shell.p096f.p131f.p132a.p133a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0965b;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.f.a.a.a */
/* loaded from: classes.dex */
public class C2680a extends C0965b {

    /* renamed from: a */
    private float f8822a;

    /* renamed from: b */
    private float f8823b;

    /* renamed from: c */
    private float f8824c;

    /* renamed from: d */
    private float f8825d;

    /* renamed from: e */
    private int f8826e = 1;

    /* renamed from: f */
    private float f8827f = C0892a.m10742a(50.0f);

    /* renamed from: g */
    private float f8828g = C0892a.m10742a(30.0f);

    /* renamed from: h */
    private float f8829h = C0892a.m10742a(30.0f);

    /* renamed from: i */
    private C3222g f8830i;

    public C2680a() {
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.f.a.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                float[] m601a = C4189x.m601a(motionEvent);
                C0975i m4946b = C2680a.this.m4946b(m601a[0], m601a[1]);
                if (m4946b != null && (m4946b instanceof C3222g)) {
                    C2680a.this.f8830i = (C3222g) m4946b;
                    C2680a.this.f8830i.mo3128aP();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C2680a.this.f8830i != null) {
                    C2680a.this.f8830i.mo3114aV();
                }
            }
        });
    }

    /* renamed from: a */
    public int m4952a() {
        return this.f8826e;
    }

    /* renamed from: a */
    public void m4951a(float f, float f2) {
        this.f8823b = f;
        this.f8824c = f2;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onMeasure(int i, int i2) {
        this.f8822a = i - this.f8827f;
        maxX(this.f8822a);
        m4944c();
    }

    /* renamed from: b */
    public C0975i m4946b(float f, float f2) {
        if (!visible()) {
            return null;
        }
        int size = children().size() - 1;
        while (true) {
            int i = size;
            if (i <= -1) {
                return null;
            }
            C0975i c0975i = children().get(i);
            if (c0975i instanceof C3222g) {
                C3222g c3222g = (C3222g) c0975i;
                if (c3222g.m3486z() != null) {
                    float f3 = c3222g.m3486z().f9541g;
                    c3222g.m3486z().f9541g = 0.0f;
                    boolean calTouchCollision = c0975i.calTouchCollision(f, f2);
                    c3222g.m3486z().f9541g = f3;
                    if (calTouchCollision) {
                        return c0975i;
                    }
                } else if (c0975i.calTouchCollision(f, f2)) {
                    return c0975i;
                }
            }
            size = i - 1;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0965b
    /* renamed from: a */
    public void mo4950a(Number3d number3d, int i) {
        m4945b(number3d, i);
    }

    /* renamed from: c */
    private void m4944c() {
        this.f8826e = (int) (this.f8822a / this.f8823b);
        this.f8826e = this.f8826e == 0 ? 1 : this.f8826e;
        this.f8825d = this.f8826e == 1 ? 0.0f : (this.f8822a - this.f8823b) / (this.f8826e - 1);
        m4947b();
        for (int i = 0; i < numChildren(); i++) {
            m4945b(m10394b(i), i);
        }
    }

    /* renamed from: b */
    public void m4947b() {
        int numChildren = (numChildren() - 1) / this.f8826e;
        minY(-((numChildren * (this.f8829h + this.f8824c)) + this.f8824c));
    }

    /* renamed from: b */
    private void m4945b(Number3d number3d, int i) {
        number3d.f2526x = ((i % this.f8826e) * this.f8825d) + (this.f8823b / 2.0f);
        number3d.f2527y = ((-this.f8824c) / 2.0f) - ((i / this.f8826e) * (this.f8824c + this.f8829h));
    }
}
