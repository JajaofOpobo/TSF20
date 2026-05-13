package com.censivn.C3DEngine.p031b.p046h.p048b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.b.h.b.g */
/* loaded from: classes.dex */
public class C1037g extends C0980j {

    /* renamed from: d */
    private float f3158d;

    /* renamed from: e */
    private float f3159e;

    /* renamed from: f */
    private float f3160f;

    /* renamed from: a */
    private int f3155a = 0;

    /* renamed from: g */
    private float f3161g = 0.0f;

    /* renamed from: h */
    private boolean f3162h = true;

    /* renamed from: i */
    private boolean f3163i = false;

    /* renamed from: j */
    private float f3164j = 0.0f;

    /* renamed from: k */
    private float f3165k = 0.0f;

    /* renamed from: l */
    private boolean f3166l = false;

    /* renamed from: m */
    private boolean f3167m = false;

    /* renamed from: b */
    private ArrayList<C0975i> f3156b = new ArrayList<>();

    /* renamed from: c */
    private C0980j f3157c = new C0980j();

    public C1037g(float f, float f2, float f3, float f4, float f5) {
        this.f3158d = 0.0f;
        this.f3159e = 0.0f;
        this.f3158d = f;
        this.f3159e = f2;
        this.f3160f = f5;
        addChild(this.f3157c);
        setAABBPX(f, f3, 0.0f, f2, f4, 0.0f);
        setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.h.b.g.1

            /* renamed from: a */
            boolean f3168a = true;

            /* renamed from: b */
            float f3169b = 0.0f;

            /* renamed from: d */
            boolean f3170d = false;

            /* renamed from: f */
            private C0975i f3172f;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                if (this.f3168a) {
                    C1037g.this.f3163i = true;
                    C1037g.this.f3162h = false;
                    C1037g.this.f3157c.setAnimationObjectState(true);
                    C1037g.this.f3157c.invalidate();
                    this.f3169b = C1037g.this.f3157c.position().f2526x;
                    this.f3168a = false;
                }
                C1037g.this.f3161g = this.f3169b + (motionEvent2.getX() - motionEvent.getX());
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                if (Math.abs(C1037g.this.f3161g - C1037g.this.f3157c.position().f2526x) < 50.0f) {
                    this.f3170d = false;
                } else {
                    this.f3170d = true;
                }
                C1037g.this.f3161g = C1037g.this.f3157c.position().f2526x;
                this.f3172f = null;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C1037g.this.f3163i = false;
                this.f3168a = true;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                C1037g.this.f3161g += f6 / 5.0f;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (!this.f3170d) {
                    float[] m601a = C4189x.m601a(motionEvent);
                    C0975i hittingTarget = C1037g.this.f3157c.getHittingTarget(m601a[0], m601a[1], true);
                    if (hittingTarget != null) {
                        C1037g.this.mo5515a(hittingTarget, hittingTarget.getDisplayTag());
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                if (!this.f3170d) {
                    float[] m601a = C4189x.m601a(motionEvent);
                    C0975i hittingTarget = C1037g.this.f3157c.getHittingTarget(m601a[0], m601a[1], true);
                    if (hittingTarget != null) {
                        this.f3172f = hittingTarget;
                        C1037g.this.m10186a(motionEvent, hittingTarget, hittingTarget.getDisplayTag());
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                if (this.f3172f != null) {
                    C1037g.this.m10180b(motionEvent, this.f3172f, this.f3172f.getDisplayTag());
                    this.f3172f = null;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f3172f != null) {
                    C1037g.this.m10187a(motionEvent, motionEvent2, this.f3172f, this.f3172f.getDisplayTag());
                }
            }
        });
        m10181b();
        m10190a();
    }

    /* renamed from: a */
    public void m10189a(float f, float f2, float f3, float f4) {
        setAABBPX(f, f2, 0.0f, f3, f4, 0.0f);
        this.f3158d = f;
        this.f3159e = f3;
        m10181b();
        m10176c();
    }

    /* renamed from: a */
    public void m10188a(int i) {
        int numChildren = this.f3157c.numChildren();
        int i2 = 0;
        while (true) {
            if (i2 >= numChildren) {
                i2 = -1;
                break;
            }
            C0975i childAt = this.f3157c.getChildAt(i2);
            if (childAt.getDisplayTag() != i) {
                i2++;
            } else {
                childAt.removeFromParent();
                this.f3156b.add(childAt);
                break;
            }
        }
        if (i2 != -1) {
            int numChildren2 = this.f3157c.numChildren();
            while (i2 < numChildren2) {
                C0975i childAt2 = this.f3157c.getChildAt(i2);
                if (i2 == numChildren2 - 1) {
                    m10185a(childAt2, i, new Runnable() { // from class: com.censivn.C3DEngine.b.h.b.g.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C1037g.this.m10171h();
                        }
                    });
                } else {
                    m10185a(childAt2, i, (Runnable) null);
                }
                i++;
                i2++;
            }
        }
    }

    /* renamed from: a */
    public void m10190a() {
        PositionNumber3d position = this.f3157c.position();
        float f = this.f3164j;
        this.f3161g = f;
        position.f2526x = f;
        while (!this.f3157c.children().isEmpty()) {
            this.f3156b.add(this.f3157c.removeChildAt(0));
        }
    }

    /* renamed from: b */
    public void m10181b() {
        this.f3166l = true;
    }

    /* renamed from: f */
    private void m10173f() {
        if (this.f3166l) {
            this.f3166l = false;
            this.f3155a = mo5514e() - 1;
            this.f3164j = (int) (C0892a.f2590z + (this.f3160f / 2.0f));
            this.f3165k = (int) ((((-this.f3155a) * this.f3160f) + C0892a.f2550A) - (this.f3160f / 2.0f));
            this.f3162h = false;
            this.f3157c.setAnimationObjectState(true);
            this.f3157c.invalidate();
            int numChildren = this.f3157c.numChildren();
            for (int i = 0; i < numChildren; i++) {
                C0975i childAt = this.f3157c.getChildAt(i);
                if (i > this.f3155a) {
                    childAt.removeFromParent();
                    this.f3156b.add(childAt);
                } else if (childAt.getDisplayTag() > this.f3155a) {
                    childAt.removeFromParent();
                    this.f3156b.add(childAt);
                } else {
                    mo5516a(childAt.getDisplayTag(), childAt);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        m10173f();
        m10174d();
        if (!this.f3162h) {
            if (this.f3163i) {
                PositionNumber3d position = this.f3157c.position();
                position.f2526x = ((this.f3161g - this.f3157c.position().f2526x) * 0.5f) + position.f2526x;
            } else {
                PositionNumber3d position2 = this.f3157c.position();
                position2.f2526x = ((this.f3161g - this.f3157c.position().f2526x) * 0.1f) + position2.f2526x;
                if (this.f3157c.position().f2526x > this.f3164j && this.f3161g > this.f3164j) {
                    this.f3161g += (this.f3164j - this.f3161g) * 0.2f;
                } else if (this.f3157c.position().f2526x < this.f3165k && this.f3161g < this.f3165k) {
                    this.f3161g += (this.f3165k - this.f3161g) * 0.2f;
                }
                if (Math.abs(this.f3157c.position().f2526x - this.f3161g) < 0.5f) {
                    this.f3157c.position().f2526x = this.f3161g;
                    this.f3157c.setAnimationObjectState(false);
                    this.f3162h = true;
                }
            }
            m10176c();
        }
    }

    /* renamed from: g */
    private int m10172g() {
        int i = (int) ((this.f3158d - this.f3157c.position().f2526x) / this.f3160f);
        if ((this.f3158d - this.f3157c.position().f2526x) % this.f3160f == 0.0f) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: c */
    public void m10176c() {
        this.f3167m = true;
    }

    /* renamed from: d */
    public void m10174d() {
        if (this.f3167m) {
            this.f3167m = false;
            m10170i();
            m10171h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m10171h() {
        C0975i mo5516a;
        if (this.f3155a >= 0) {
            int m10172g = m10172g();
            if (m10172g < 0) {
                m10172g = 0;
            } else if (m10172g > this.f3155a) {
                m10172g = this.f3155a;
            }
            int numChildren = this.f3157c.numChildren();
            int i = m10172g;
            for (int i2 = 0; i2 < numChildren; i2++) {
                C0975i childAt = this.f3157c.getChildAt(i2);
                if (i2 == numChildren - 1 && childAt.getDisplayTag() != this.f3155a) {
                    if (childAt.position().f2526x + this.f3157c.position().f2526x < this.f3159e + this.f3160f && i < this.f3155a) {
                        C0975i mo5516a2 = mo5516a(i + 1, m10169j());
                        mo5516a2.removeFromParent();
                        this.f3157c.addChild(mo5516a2);
                        mo5516a2.position().f2526x = childAt.position().f2526x + this.f3160f;
                        m10176c();
                        return;
                    }
                } else if (i2 == 0 && childAt.position().f2526x + this.f3157c.position().f2526x > this.f3158d && childAt.getDisplayTag() != 0 && (mo5516a = mo5516a(i, m10169j())) != null) {
                    mo5516a.removeFromParent();
                    this.f3157c.addChildAt(mo5516a, 0);
                    mo5516a.position().f2526x = childAt.position().f2526x - this.f3160f;
                    m10176c();
                    return;
                }
                m10179b(childAt, i);
                i++;
            }
            if (numChildren == 0) {
                C0975i mo5516a3 = mo5516a(i, m10169j());
                mo5516a3.removeFromParent();
                m10179b(mo5516a3, i);
                this.f3157c.addChild(mo5516a3);
                m10171h();
            }
        }
    }

    /* renamed from: i */
    private void m10170i() {
        int numChildren = this.f3157c.numChildren();
        for (int i = 0; i < numChildren; i++) {
            C0975i childAt = this.f3157c.getChildAt(i);
            if (i == numChildren - 1) {
                if (childAt.position().f2526x + this.f3157c.position().f2526x > this.f3159e + (this.f3160f * 2.0f)) {
                    this.f3157c.removeChildAt(i);
                    this.f3156b.add(childAt);
                    m10170i();
                    return;
                }
            } else if (i == 0 && childAt.position().f2526x + this.f3157c.position().f2526x < this.f3158d - this.f3160f) {
                this.f3157c.removeChildAt(i);
                this.f3156b.add(childAt);
                m10170i();
                return;
            }
        }
    }

    /* renamed from: j */
    private C0975i m10169j() {
        int size = this.f3156b.size();
        if (size == 0) {
            return null;
        }
        return this.f3156b.remove(size - 1);
    }

    /* renamed from: a */
    private void m10185a(C0975i c0975i, int i, Runnable runnable) {
        C0975i mo5516a;
        if (c0975i.getDisplayTag() != i && (mo5516a = mo5516a(i, c0975i)) != null) {
            mo5516a.setDisplayTag(i);
            C1017d c1017d = new C1017d();
            c1017d.m10311a(runnable);
            c1017d.mo10301f(i * this.f3160f);
            C1014c.m10326a(mo5516a);
            C1014c.m10325a(mo5516a, 300, c1017d);
        }
    }

    /* renamed from: b */
    private void m10179b(C0975i c0975i, int i) {
        C0975i mo5516a;
        if (c0975i.getDisplayTag() != i && (mo5516a = mo5516a(i, c0975i)) != null) {
            mo5516a.setDisplayTag(i);
            mo5516a.position().f2526x = i * this.f3160f;
        }
    }

    /* renamed from: a */
    public void mo5515a(C0975i c0975i, int i) {
    }

    /* renamed from: a */
    public void m10186a(MotionEvent motionEvent, C0975i c0975i, int i) {
    }

    /* renamed from: b */
    public void m10180b(MotionEvent motionEvent, C0975i c0975i, int i) {
    }

    /* renamed from: a */
    public void m10187a(MotionEvent motionEvent, MotionEvent motionEvent2, C0975i c0975i, int i) {
    }

    /* renamed from: e */
    public int mo5514e() {
        return 0;
    }

    /* renamed from: a */
    public C0975i mo5516a(int i, C0975i c0975i) {
        return null;
    }
}
