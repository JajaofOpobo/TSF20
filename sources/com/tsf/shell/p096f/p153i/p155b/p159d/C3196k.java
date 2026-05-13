package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.C2234d;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.C2285c;
import com.tsf.shell.p096f.p100b.C2284a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.b.d.k */
/* loaded from: classes.dex */
public class C3196k {

    /* renamed from: b */
    private static int f10457b = 800;

    /* renamed from: c */
    private C3145b f10459c;

    /* renamed from: d */
    private C0980j f10460d;

    /* renamed from: e */
    private C3112b f10461e;

    /* renamed from: h */
    private int f10464h;

    /* renamed from: i */
    private int f10465i;

    /* renamed from: j */
    private int f10466j;

    /* renamed from: k */
    private int f10467k;

    /* renamed from: l */
    private float f10468l;

    /* renamed from: m */
    private float f10469m;

    /* renamed from: r */
    private float f10474r;

    /* renamed from: u */
    private AbstractC3208b f10477u;

    /* renamed from: n */
    private boolean f10470n = false;

    /* renamed from: o */
    private boolean f10471o = false;

    /* renamed from: p */
    private boolean f10472p = true;

    /* renamed from: s */
    private boolean f10475s = false;

    /* renamed from: t */
    private boolean f10476t = false;

    /* renamed from: a */
    boolean f10458a = false;

    /* renamed from: g */
    private ArrayList<float[]> f10463g = new ArrayList<>();

    /* renamed from: f */
    private C0980j f10462f = new C0980j() { // from class: com.tsf.shell.f.i.b.d.k.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawEnd() {
            C3196k.this.m3180i();
        }
    };

    /* renamed from: q */
    private C2284a f10473q = new C2284a() { // from class: com.tsf.shell.f.i.b.d.k.2
        @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: a */
        public void mo727a(int i, KeyEvent keyEvent) {
            if (i == 4 && C3196k.this.f10476t) {
                C3196k.this.m3198b();
            }
        }

        @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: b */
        public void mo726b(int i, KeyEvent keyEvent) {
        }
    };

    public C3196k(C3145b c3145b) {
        this.f10459c = c3145b;
        this.f10461e = this.f10459c;
    }

    /* renamed from: a */
    public void m3207a() {
        this.f10462f.destroy();
        this.f10463g.clear();
        this.f10463g = null;
        this.f10459c = null;
        this.f10460d = null;
        this.f10461e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m3186f() {
        this.f10462f.removeFromParent();
        this.f10470n = false;
        this.f10471o = false;
        this.f10472p = true;
        this.f10463g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m3184g() {
        if (this.f10461e.m3534K().container != -1 || (this.f10461e.m3534K() instanceof LauncherDrawerFolder3DInfo)) {
            Number3d.TEMPNUMBER3D.reset();
            this.f10461e.localToGlobal(Number3d.TEMPNUMBER3D);
            this.f10477u = C2285c.m5957a(this.f10461e);
            ((C0980j) this.f10461e.parent()).replaceChild(this.f10461e, this.f10477u);
            this.f10461e.position().setAllFrom(Number3d.TEMPNUMBER3D);
        }
        this.f10474r = this.f10461e.rotation().f2528z;
        if (this.f10474r != 0.0f) {
            this.f10475s = true;
            C1017d c1017d = new C1017d();
            c1017d.m10303e(0.0f);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f10461e);
            C1014c.m10325a(this.f10461e, 250, c1017d);
        } else {
            if (this.f10461e.scale().f2526x != 1.0f) {
                C1017d c1017d2 = new C1017d();
                c1017d2.m10294l(1.0f);
                c1017d2.m10293m(1.0f);
                C1014c.m10326a(this.f10461e);
                C1014c.m10325a(this.f10461e, 250, c1017d2);
            }
            this.f10475s = false;
        }
        C3145b.f10242m.m3293b(this.f10459c);
        C2234d.m6033a().m6030a("LineViewer");
        this.f10459c.m3305o(false);
        this.f10461e.mouseSkip(true);
        this.f10461e.removeFromParent();
        C0980j m2229a = C3359a.f11096j.m2229a(this.f10473q);
        C3359a.f11096j.m2220c();
        m2229a.addChild(this.f10461e);
        C3359a.f11088b.m10559b(Home.m6177b());
    }

    /* renamed from: a */
    public void m3199a(final boolean z) {
        this.f10476t = false;
        Iterator<C0975i> it = this.f10460d.children().iterator();
        while (it.hasNext()) {
            ((AbstractC3208b) it.next()).mouseEnabled(false);
        }
        if (this.f10477u != null) {
            this.f10474r = this.f10477u.rotation().f2528z;
        }
        if (!z) {
            this.f10461e.rotation().f2528z = this.f10474r;
        }
        this.f10459c.m3387a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.k.3
            @Override // java.lang.Runnable
            public void run() {
                C3359a.f11096j.m2221b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.k.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3196k.this.f10475s) {
                            if (C3196k.this.f10477u != null && C3196k.this.f10461e.scale().f2526x != C3196k.this.f10477u.scale().f2526x) {
                                C1017d c1017d = new C1017d();
                                c1017d.m10294l(C3196k.this.f10477u.scale().f2526x);
                                c1017d.m10293m(C3196k.this.f10477u.scale().f2527y);
                                C1014c.m10326a(C3196k.this.f10461e);
                                C1014c.m10325a(C3196k.this.f10461e, 250, c1017d);
                            }
                        } else if (!z) {
                            if (C3196k.this.f10477u != null) {
                                C3196k.this.f10461e.scale().setAllFrom(C3196k.this.f10477u.scale());
                            }
                        } else {
                            C1017d c1017d2 = new C1017d();
                            if (C3196k.this.f10477u != null) {
                                c1017d2.m10294l(C3196k.this.f10477u.scale().f2526x);
                                c1017d2.m10293m(C3196k.this.f10477u.scale().f2527y);
                            }
                            c1017d2.m10303e(C3196k.this.f10474r);
                            C1014c.m10326a(C3196k.this.f10461e);
                            C1014c.m10325a(C3196k.this.f10461e, 250, c1017d2);
                        }
                        C2932g m4031n = C3359a.f11094h.m4031n();
                        C3196k.this.f10461e.removeFromParent();
                        if (C3196k.this.f10477u != null) {
                            ((C0980j) C3196k.this.f10477u.parent()).replaceChild(C3196k.this.f10477u, C3196k.this.f10461e);
                            C2285c.m5956a(C3196k.this.f10477u);
                            C3196k.this.f10477u = null;
                        } else {
                            m4031n.m4229a(C3196k.this.f10461e);
                        }
                        C3196k.this.f10461e.mouseSkip(false);
                        C3196k.this.f10459c.m3305o(true);
                        C3359a.f11096j.m2224b();
                        C2234d.m6033a().m6027b("LineViewer");
                        C3196k.this.f10465i = 0;
                        C3196k.this.m3186f();
                        C3359a.f11088b.m10552c(Home.m6177b());
                    }
                });
            }
        }, z);
        this.f10458a = false;
    }

    /* renamed from: b */
    public void m3198b() {
        m3199a(true);
    }

    /* renamed from: h */
    private void m3182h() {
        this.f10462f.setAnimationObjectState(false);
        this.f10476t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m3180i() {
        if (!this.f10471o && this.f10465i > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f10464h) {
                    C0975i childAt = this.f10460d.getChildAt(i2);
                    float[] fArr = this.f10463g.get((int) ((((i2 / this.f10464h) * 0.9f) + 0.1f) * this.f10465i));
                    PositionNumber3d position = childAt.position();
                    position.f2526x = (float) (position.f2526x + ((fArr[0] - childAt.position().f2526x) * 0.2d));
                    PositionNumber3d position2 = childAt.position();
                    position2.f2527y = (float) (position2.f2527y + ((fArr[1] - childAt.position().f2527y) * 0.2d));
                    Number3d rotation = childAt.rotation();
                    rotation.f2528z = (float) (rotation.f2528z + ((0.0f - childAt.rotation().f2528z) * 0.5d));
                    if (childAt.scale().f2526x < 1.0f) {
                        Number3d scale = childAt.scale();
                        scale.f2526x = (float) (scale.f2526x + ((1.0f - childAt.scale().f2526x) * 0.1d));
                        childAt.scale().f2527y = childAt.scale().f2526x;
                        if (1.0f - childAt.scale().f2526x < 0.05d) {
                            childAt.scale().f2526x = 1.0f;
                            childAt.scale().f2527y = 1.0f;
                        }
                    }
                    if (this.f10470n && i2 == 0 && C4189x.m594b(childAt.position().f2526x, childAt.position().f2527y, fArr[0], fArr[1]) < 5.0f) {
                        this.f10471o = true;
                        m3182h();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m3194c() {
        return this.f10458a;
    }

    /* renamed from: a */
    public void m3206a(MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.f10472p) {
            this.f10458a = false;
            this.f10472p = false;
            C0853a.m10865a().m10585b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.k.4
                @Override // java.lang.Runnable
                public void run() {
                    C3196k.this.m3184g();
                    C3196k.this.f10470n = false;
                    C3196k.this.f10462f.setAnimationObjectState(true);
                    C3196k.this.f10461e.addChild(C3196k.this.f10462f);
                    C3196k.this.f10463g.clear();
                    C3196k.this.f10460d = C3196k.this.f10459c.m3377aF();
                    C3196k.this.f10464h = C3196k.this.f10460d.numChildren();
                    for (int i = 0; i < C3196k.this.f10464h; i++) {
                        C3196k.this.f10463g.add(new float[]{0.0f, 0.0f});
                    }
                    C3196k.this.f10465i = C3196k.this.f10464h;
                    Number3d localToGlobal = C3196k.this.f10460d.localToGlobal(new Number3d(0.0f, 0.0f, 0.0f));
                    C3196k.this.f10466j = (int) (C0892a.f2557H + localToGlobal.f2526x);
                    C3196k.this.f10467k = (int) (C0892a.f2558I - localToGlobal.f2527y);
                    C3196k.this.f10468l = motionEvent2.getX();
                    C3196k.this.f10469m = motionEvent2.getY();
                    Iterator<C0975i> it = C3196k.this.f10460d.children().iterator();
                    while (it.hasNext()) {
                        AbstractC3208b abstractC3208b = (AbstractC3208b) it.next();
                        abstractC3208b.alpha(255.0f);
                        abstractC3208b.visible(true);
                        abstractC3208b.m3136g(1.0f);
                        abstractC3208b.mouseEnabled(true);
                    }
                    C3196k.this.f10458a = true;
                }
            });
        }
        if (this.f10465i <= f10457b && this.f10458a) {
            float x = motionEvent2.getX();
            float y = motionEvent2.getY();
            int m594b = (int) (C4189x.m594b(x, y, this.f10468l, this.f10469m) / 5.0f);
            if (m594b >= 1) {
                float f = (x - this.f10468l) / m594b;
                float f2 = (y - this.f10469m) / m594b;
                for (int i = 0; i < m594b; i++) {
                    this.f10463g.add(new float[]{(((i + 1) * f) + this.f10468l) - this.f10466j, this.f10467k - (((i + 1) * f2) + this.f10469m)});
                    this.f10465i++;
                }
                this.f10468l = x;
                this.f10469m = y;
            }
        }
    }

    /* renamed from: d */
    public void m3191d() {
        this.f10472p = true;
        this.f10470n = true;
    }

    /* renamed from: e */
    public void m3188e() {
    }
}
