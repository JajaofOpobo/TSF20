package com.censivn.C3DEngine.p031b.p046h.p048b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p118e.C2477c;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.h.b.h */
/* loaded from: classes.dex */
public class C1040h extends C0980j {

    /* renamed from: a */
    public static float f3174a = 0.15f;

    /* renamed from: D */
    private C1024b f3178D;

    /* renamed from: E */
    private C1036f f3179E;

    /* renamed from: f */
    private float f3190f;

    /* renamed from: g */
    private float f3191g;

    /* renamed from: h */
    private float f3192h;

    /* renamed from: i */
    private float f3193i;

    /* renamed from: j */
    private float f3194j;

    /* renamed from: k */
    private float f3195k;

    /* renamed from: l */
    private float f3196l;

    /* renamed from: m */
    private float f3197m;

    /* renamed from: n */
    private float f3198n;

    /* renamed from: o */
    private float f3199o;

    /* renamed from: p */
    private int f3200p;

    /* renamed from: q */
    private int f3201q;

    /* renamed from: r */
    private int f3202r;

    /* renamed from: s */
    private C0981k f3203s;

    /* renamed from: t */
    private C0981k f3204t;

    /* renamed from: u */
    private TextureElement f3205u;

    /* renamed from: z */
    private int f3210z;

    /* renamed from: e */
    private int f3189e = 0;

    /* renamed from: v */
    private float f3206v = 0.0f;

    /* renamed from: w */
    private float f3207w = 0.0f;

    /* renamed from: x */
    private float f3208x = 0.0f;

    /* renamed from: y */
    private int f3209y = -1;

    /* renamed from: A */
    private boolean f3175A = false;

    /* renamed from: F */
    private boolean f3180F = false;

    /* renamed from: G */
    private Number3d f3181G = new Number3d();

    /* renamed from: H */
    private ArrayList<C0975i> f3182H = new ArrayList<>();

    /* renamed from: I */
    private ArrayList<Integer> f3183I = new ArrayList<>();

    /* renamed from: J */
    private ArrayList<Integer> f3184J = new ArrayList<>();

    /* renamed from: K */
    private ArrayList<C0975i> f3185K = new ArrayList<>();

    /* renamed from: B */
    private ArrayList<C1048a> f3176B = new ArrayList<>();

    /* renamed from: C */
    private ArrayList<C1048a> f3177C = new ArrayList<>();

    /* renamed from: d */
    private C0980j f3188d = new C0980j();

    /* renamed from: b */
    private C0980j f3186b = new C0980j();

    /* renamed from: c */
    private C0980j f3187c = new C0980j() { // from class: com.censivn.C3DEngine.b.h.b.h.2
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            C1040h.this.m10138f();
        }
    };

    /* renamed from: a */
    public void m10166a(final float f, final float f2, final float f3, final float f4) {
        if (C0869e.m10758l()) {
            m10145c(f3 - f, f4 - f2);
            return;
        }
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.b.h.1
            @Override // java.lang.Runnable
            public void run() {
                C1040h.this.m10145c(f3 - f, f4 - f2);
            }
        });
    }

    /* renamed from: a */
    public C0980j m10168a() {
        return this.f3186b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m10145c(float f, float f2) {
        this.f3190f = f;
        this.f3191g = f2;
        this.f3186b.setAABBPX((-this.f3190f) / 2.0f, (-this.f3191g) / 2.0f, 0.0f, this.f3190f / 2.0f, this.f3191g / 2.0f, 1.0f);
        this.f3203s.position().f2526x = ((-this.f3190f) / 2.0f) + this.f3203s.mo10366b();
        this.f3204t.position().f2526x = (this.f3190f / 2.0f) - this.f3203s.mo10366b();
        this.f3192h = this.f3190f - (this.f3194j * 2.0f);
        this.f3193i = this.f3191g - (this.f3195k * 2.0f);
        this.f3200p = (int) (this.f3192h / this.f3196l);
        this.f3201q = (int) (this.f3193i / this.f3197m);
        this.f3200p = this.f3200p < 1 ? 1 : this.f3200p;
        this.f3201q = this.f3201q < 1 ? 1 : this.f3201q;
        this.f3202r = this.f3200p * this.f3201q;
        this.f3198n = this.f3200p == 1 ? 0.0f : (this.f3192h - (this.f3200p * this.f3196l)) / (this.f3200p - 1);
        this.f3199o = this.f3201q != 1 ? (this.f3193i - (this.f3201q * this.f3197m)) / (this.f3201q - 1) : 0.0f;
        m10136g();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f3176B.size()) {
                m10162a(i2, this.f3176B.get(i2));
                i = i2 + 1;
            } else {
                m10143d();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m10167a(float f, float f2) {
        this.f3196l = f;
        this.f3197m = f2;
    }

    /* renamed from: g */
    private void m10136g() {
        int size = this.f3176B.size();
        this.f3210z = size % this.f3202r == 0 ? size / this.f3202r : (size / this.f3202r) + 1;
        this.f3207w = 0.0f;
        this.f3206v = ((-this.f3210z) * this.f3190f) + this.f3190f;
        this.f3206v = this.f3206v > 0.0f ? 0.0f : this.f3206v;
        m10134h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m10134h() {
        int i = -((int) ((this.f3187c.position().f2526x - (this.f3190f / 2.0f)) / this.f3190f));
        if (i > this.f3210z - 1) {
            i = this.f3210z - 1;
        }
        if (i < 0) {
            i = 0;
        }
        m10165a(i);
    }

    /* renamed from: a */
    private void m10165a(int i) {
        if (i != this.f3209y) {
            this.f3209y = i;
        }
        m10118p();
        this.f3208x = (-this.f3209y) * this.f3190f;
        this.f3187c.setAnimationObjectState(true);
    }

    /* renamed from: b */
    public void m10151b(float f, float f2) {
        PositionNumber3d position = this.f3187c.position();
        this.f3188d.position().f2526x = f;
        position.f2526x = f;
        PositionNumber3d position2 = this.f3187c.position();
        this.f3188d.position().f2527y = f2;
        position2.f2527y = f2;
    }

    /* renamed from: a */
    public void m10160a(C1024b c1024b) {
        this.f3178D = c1024b;
        m10143d();
    }

    /* renamed from: b */
    public void m10152b() {
        this.f3189e = 0;
        m10140e();
        m10146c();
    }

    /* renamed from: c */
    public void m10146c() {
        while (!this.f3187c.children().isEmpty()) {
            C0975i removeChildAt = this.f3187c.removeChildAt(0);
            this.f3182H.add(removeChildAt);
            this.f3185K.add(removeChildAt);
        }
    }

    /* renamed from: a */
    public void m10159a(C1036f c1036f) {
        this.f3179E = c1036f;
    }

    /* renamed from: d */
    public void m10143d() {
        this.f3180F = true;
        if (this.f3178D != null) {
            Iterator<C0975i> it = this.f3187c.children().iterator();
            while (it.hasNext()) {
                it.next().setDisplayTag(-1);
            }
            Iterator<C0975i> it2 = this.f3182H.iterator();
            while (it2.hasNext()) {
                it2.next().setDisplayTag(-1);
            }
        }
    }

    /* renamed from: e */
    public void m10140e() {
        m10165a(0);
        this.f3187c.position().f2526x = this.f3208x;
    }

    /* renamed from: i */
    private void m10132i() {
        int i = 0;
        if (this.f3180F) {
            this.f3180F = false;
            this.f3189e = this.f3178D.mo725a();
            if (this.f3176B.size() < this.f3189e) {
                int size = this.f3189e - this.f3176B.size();
                while (i < size) {
                    m10130j();
                    i++;
                }
            } else if (this.f3176B.size() > this.f3189e) {
                int size2 = this.f3176B.size() - this.f3189e;
                while (i < size2) {
                    m10128k();
                    i++;
                }
            }
            m10136g();
            this.f3187c.setAnimationObjectState(true);
        }
    }

    /* renamed from: j */
    private void m10130j() {
        C1048a remove;
        int size = this.f3176B.size();
        if (this.f3177C.isEmpty()) {
            remove = new C1048a();
        } else {
            remove = this.f3177C.remove(0);
        }
        m10162a(size, remove);
        this.f3176B.add(remove);
    }

    /* renamed from: k */
    private void m10128k() {
        this.f3177C.add(this.f3176B.remove(this.f3176B.size() - 1));
    }

    /* renamed from: a */
    private void m10162a(int i, C1048a c1048a) {
        float f;
        int i2 = i / this.f3202r;
        int i3 = i - (this.f3202r * i2);
        int i4 = i3 % this.f3200p;
        int i5 = i3 / this.f3200p;
        if (this.f3200p == 1) {
            f = i2 * this.f3190f;
        } else {
            f = (i2 * this.f3190f) + ((-this.f3192h) / 2.0f) + (this.f3196l / 2.0f) + (i4 * (this.f3198n + this.f3196l));
        }
        c1048a.m10117a(f, ((this.f3193i / 2.0f) - (this.f3201q < 2 ? this.f3193i / 2.0f : this.f3197m / 2.0f)) - ((this.f3199o + this.f3197m) * i5));
    }

    /* renamed from: a */
    private void m10163a(int i, C0975i c0975i) {
        C1048a c1048a = this.f3176B.get(i);
        c0975i.position().f2526x = c1048a.f3225a;
        c0975i.position().f2527y = c1048a.f3226b;
    }

    /* renamed from: b */
    private void m10150b(int i, C0975i c0975i) {
        c0975i.setDisplayTag(i);
        this.f3187c.addChild(c0975i);
        m10163a(i, c0975i);
    }

    public C1040h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3194j = 0.0f;
        this.f3195k = 0.0f;
        this.f3194j = f3;
        this.f3195k = f4;
        this.f3196l = f5;
        this.f3197m = f6;
        this.f3186b.addChild(this.f3187c);
        super.addChild(this.f3186b);
        super.addChild(this.f3188d);
        this.f3186b.setMouseEventListener(new C0937a(this.f3186b) { // from class: com.censivn.C3DEngine.b.h.b.h.3

            /* renamed from: a */
            float f3217a;

            /* renamed from: d */
            private C0975i f3219d = null;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C1040h.this.f3175A = true;
                this.f3217a = C1040h.this.f3187c.position().f2526x;
                C1040h.this.f3187c.setAnimationObjectState(true);
                C1040h.this.f3208x = this.f3217a;
                float[] m601a = C4189x.m601a(motionEvent);
                C1040h.this.f3181G.reset();
                C1040h.this.f3181G.f2526x = m601a[0];
                C1040h.this.f3181G.f2527y = m601a[1];
                C1040h.this.f3181G = C1040h.this.f3187c.globalToLocal(C1040h.this.f3181G);
                int m10142d = C1040h.this.m10142d(C1040h.this.f3181G.f2526x, C1040h.this.f3181G.f2527y);
                this.f3219d = null;
                if (m10142d != -1) {
                    Iterator<C0975i> it = C1040h.this.f3187c.children().iterator();
                    while (it.hasNext()) {
                        C0975i next = it.next();
                        if (next.getDisplayTag() == m10142d) {
                            this.f3219d = next;
                            return;
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C1040h.this.f3175A = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                C1040h.f3174a = 0.3f;
                C1040h.this.f3208x = this.f3217a + (motionEvent2.getX() - motionEvent.getX());
                C1040h.this.f3208x = C2477c.m5473a(C1040h.this.f3208x, C1040h.this.f3207w, C1040h.this.f3206v);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (C1040h.this.f3179E != null && this.f3219d != null) {
                    C1040h.this.f3179E.mo1699a(this.f3219d, this.f3219d.getDisplayTag(), motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                C1040h.this.f3175A = false;
                C1040h.f3174a = 0.15f;
                if (C1040h.this.f3179E != null && this.f3219d != null) {
                    C1040h.this.f3179E.mo1698b(this.f3219d, this.f3219d.getDisplayTag(), motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                C1040h.this.f3175A = false;
                C1040h.f3174a = 0.15f;
                if (C1040h.this.f3179E != null && this.f3219d != null) {
                    C1040h.this.f3179E.mo1697c(this.f3219d, this.f3219d.getDisplayTag(), motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C1040h.this.f3179E != null && this.f3219d != null) {
                    C1040h.this.f3179E.mo723a(this.f3219d, this.f3219d.getDisplayTag(), motionEvent);
                }
                C1040h.this.f3175A = false;
                C1040h.f3174a = 0.15f;
                C1040h.this.m10134h();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                C1040h.this.f3175A = false;
                C1040h.f3174a = 0.15f;
                C1040h.this.m10134h();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                C1040h.this.f3175A = false;
                C1040h.f3174a = 0.15f;
                if (Math.abs(f7) < 100.0f) {
                    C1040h.this.m10134h();
                } else if (f7 > 0.0f && C1040h.this.f3209y > 0) {
                    C1040h.this.m10124m();
                } else if (f7 >= 0.0f || C1040h.this.f3209y >= C1040h.this.f3210z - 1) {
                    C1040h.this.m10134h();
                } else {
                    C1040h.this.m10126l();
                }
            }
        });
        m10122n();
        m10145c(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m10126l() {
        if (this.f3209y < this.f3210z - 1) {
            m10165a(this.f3209y + 1);
        } else {
            m10134h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m10124m() {
        if (this.f3209y > 0) {
            m10165a(this.f3209y - 1);
        } else {
            m10134h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public int m10142d(float f, float f2) {
        float f3 = f + C0892a.f2557H;
        float f4 = f2 - (this.f3191g / 2.0f);
        int i = (int) (((f3 % this.f3190f) - this.f3194j) / (this.f3196l + this.f3198n));
        int i2 = -((int) ((f4 - this.f3195k) / (this.f3197m + this.f3199o)));
        if (i > this.f3200p - 1) {
            i = this.f3200p - 1;
        } else if (i < 0) {
            i = 0;
        }
        if (i2 > this.f3201q - 1) {
            i2 = this.f3201q - 1;
        } else if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f3189e - 1;
        int i4 = (int) (f3 / this.f3190f);
        int i5 = i + ((i4 >= 0 ? i4 : 0) * this.f3202r) + (i2 * this.f3200p);
        if (i5 <= i3 && i5 >= 0) {
            return i5;
        }
        return -1;
    }

    /* renamed from: n */
    private void m10122n() {
        if (C0869e.m10758l()) {
            this.f3205u = C4189x.m593b(C1306b.C1310d.scrollcontainer_arrow);
            this.f3203s = new C0981k(C0892a.f2567c * 24.0f, 45.0f * C0892a.f2567c, false);
            this.f3203s.rotation().f2528z = 180.0f;
            this.f3203s.textures().addElement(this.f3205u);
            C3567c.m1967a(this.f3203s, C3567c.f11849h);
            this.f3204t = new C0981k(C0892a.f2567c * 24.0f, 45.0f * C0892a.f2567c, false);
            this.f3204t.textures().addElement(this.f3205u);
            C3567c.m1967a(this.f3204t, C3567c.f11849h);
            this.f3203s.calAABB(3.0f, 3.0f, 1.0f);
            this.f3204t.calAABB(3.0f, 3.0f, 1.0f);
        } else {
            this.f3203s = new C0981k(0.0f, 0.0f, false);
            this.f3203s.rotation().f2528z = 180.0f;
            C3567c.m1967a(this.f3203s, C3567c.f11849h);
            this.f3204t = new C0981k(0.0f, 0.0f, false);
            C3567c.m1967a(this.f3204t, C3567c.f11849h);
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.h.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    C1040h.this.f3205u = C4189x.m593b(C1306b.C1310d.scrollcontainer_arrow);
                    C1040h.this.f3203s.mo10368a(C0892a.f2567c * 24.0f);
                    C1040h.this.f3204t.mo10368a(C0892a.f2567c * 24.0f);
                    C1040h.this.f3203s.mo5215b(C0892a.f2567c * 45.0f);
                    C1040h.this.f3204t.mo5215b(C0892a.f2567c * 45.0f);
                    C1040h.this.f3203s.textures().addElement(C1040h.this.f3205u);
                    C1040h.this.f3204t.textures().addElement(C1040h.this.f3205u);
                    C1040h.this.f3203s.calAABB(3.0f, 3.0f, 1.0f);
                    C1040h.this.f3204t.calAABB(3.0f, 3.0f, 1.0f);
                }
            });
        }
        this.f3203s.setMouseEventListener(new C0937a(this.f3203s) { // from class: com.censivn.C3DEngine.b.h.b.h.5
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C1040h.f3174a = 0.1f;
                C1040h.this.m10124m();
            }
        });
        this.f3204t.setMouseEventListener(new C0937a(this.f3204t) { // from class: com.censivn.C3DEngine.b.h.b.h.6
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C1040h.f3174a = 0.1f;
                C1040h.this.m10126l();
            }
        });
    }

    /* renamed from: o */
    private void m10120o() {
        if (this.f3178D != null) {
            Iterator<C0975i> it = this.f3185K.iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                next.setDisplayTag(-1);
                this.f3178D.mo1761a(next);
            }
        }
        this.f3185K.clear();
    }

    /* renamed from: f */
    public void m10138f() {
        C0975i c0975i;
        m10132i();
        if (this.f3187c.getAnimationObjectState()) {
            this.f3185K.clear();
            this.f3187c.position().f2526x += (this.f3208x - this.f3187c.position().f2526x) * f3174a;
            if (!this.f3175A && Math.abs(this.f3187c.position().f2526x - this.f3208x) < 0.1f) {
                this.f3187c.position().f2526x = this.f3208x;
                this.f3187c.setAnimationObjectState(false);
            }
            m10146c();
            if (this.f3178D == null || this.f3189e <= 0) {
                m10120o();
                return;
            }
            float f = this.f3187c.position().f2526x;
            int i = this.f3189e - 1;
            int i2 = (int) ((-f) / this.f3190f);
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = (int) ((((-f) % this.f3190f) - this.f3194j) / (this.f3196l + this.f3198n));
            if ((this.f3202r * i2) + i3 <= i) {
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 > this.f3200p - 1) {
                    i3 = this.f3200p - 1;
                }
                int i4 = i2 * this.f3202r;
                if (!m10164a(i3, this.f3200p, i4, i)) {
                    m10164a(0, (this.f3200p - (this.f3200p - i3)) + 1, i4 + this.f3202r, i);
                }
                Iterator<Integer> it = this.f3184J.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    Iterator<C0975i> it2 = this.f3182H.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c0975i = null;
                            break;
                        }
                        c0975i = it2.next();
                        if (c0975i.getDisplayTag() == intValue) {
                            break;
                        }
                    }
                    if (c0975i != null) {
                        m10150b(intValue, c0975i);
                        this.f3185K.remove(c0975i);
                        this.f3182H.remove(c0975i);
                    } else {
                        this.f3183I.add(Integer.valueOf(intValue));
                    }
                }
                m10120o();
                Iterator<Integer> it3 = this.f3183I.iterator();
                while (it3.hasNext()) {
                    int intValue2 = it3.next().intValue();
                    if (!this.f3182H.isEmpty()) {
                        m10150b(intValue2, this.f3178D.mo724a(intValue2, this.f3182H.remove(0)));
                    } else {
                        m10150b(intValue2, this.f3178D.mo724a(intValue2, null));
                    }
                }
                this.f3183I.clear();
                this.f3184J.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m10164a(int i, int i2, int i3, int i4) {
        while (i < i2) {
            for (int i5 = 0; i5 < this.f3201q; i5++) {
                int i6 = (this.f3200p * i5) + i3 + i;
                if (i6 > i4) {
                    if (i5 == 0) {
                        return true;
                    }
                } else {
                    float f = this.f3176B.get(i6).f3225a + this.f3187c.position().f2526x;
                    if (f - (this.f3196l / 2.0f) < this.f3190f / 2.0f && f + (this.f3196l / 2.0f) > (-this.f3190f) / 2.0f) {
                        this.f3184J.add(Integer.valueOf(i6));
                    }
                }
            }
            i++;
        }
        return false;
    }

    /* renamed from: p */
    private void m10118p() {
        if (this.f3210z > 1) {
            if (this.f3209y > 0) {
                m10161a(this.f3203s);
            } else {
                m10149b(this.f3203s);
            }
            if (this.f3209y < this.f3210z - 1) {
                m10161a(this.f3204t);
                return;
            } else {
                m10149b(this.f3204t);
                return;
            }
        }
        m10149b(this.f3203s);
        m10149b(this.f3204t);
    }

    /* renamed from: a */
    private void m10161a(C0981k c0981k) {
        if (c0981k.parent() == null) {
            this.f3188d.addChild(c0981k);
        }
        if (c0981k.alpha() != 255.0f) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(c0981k);
            C1014c.m10325a(c0981k, 250, c1017d);
        }
        c0981k.mouseEnabled(true);
    }

    /* renamed from: b */
    private void m10149b(final C0981k c0981k) {
        if (c0981k.parent() != null) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.h.b.h.7
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1040h.this.f3188d.removeChild(c0981k);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(c0981k);
            C1014c.m10325a(c0981k, 250, c1017d);
        }
        c0981k.mouseEnabled(false);
    }

    /* renamed from: com.censivn.C3DEngine.b.h.b.h$a */
    /* loaded from: classes.dex */
    public class C1048a {

        /* renamed from: a */
        public float f3225a;

        /* renamed from: b */
        public float f3226b;

        /* renamed from: c */
        public float f3227c;

        /* renamed from: d */
        public float f3228d;

        public C1048a() {
        }

        /* renamed from: a */
        public void m10117a(float f, float f2) {
            this.f3227c = f;
            this.f3225a = f;
            this.f3228d = f2;
            this.f3226b = f2;
        }
    }
}
