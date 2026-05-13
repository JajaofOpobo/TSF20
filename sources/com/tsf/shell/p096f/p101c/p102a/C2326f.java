package com.tsf.shell.p096f.p101c.p102a;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.C3345g;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2288a;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2290b;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2291c;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2292d;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2293e;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2294f;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2295g;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2296h;
import com.tsf.shell.p096f.p101c.p102a.p103a.C2297i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2989o;
import com.tsf.shell.p096f.p148h.C3095e;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.utils.C4169f;
import com.tsf.shell.utils.C4171h;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.c.a.f */
/* loaded from: classes.dex */
public class C2326f implements C0925e.InterfaceC0934a {

    /* renamed from: a */
    public static int f7566a;

    /* renamed from: b */
    public static int f7567b;

    /* renamed from: c */
    public static float f7568c;

    /* renamed from: d */
    public static float f7569d;

    /* renamed from: e */
    public static float f7570e;

    /* renamed from: f */
    public static float f7571f;

    /* renamed from: g */
    public static float f7572g;

    /* renamed from: h */
    public static C2288a f7573h;

    /* renamed from: i */
    public static C2288a f7574i;

    /* renamed from: j */
    public static C2288a f7575j;

    /* renamed from: k */
    public static C2288a f7576k;

    /* renamed from: l */
    public static C2288a f7577l;

    /* renamed from: m */
    public static C2288a f7578m;

    /* renamed from: o */
    public static float f7579o = 0.0f;

    /* renamed from: p */
    public static float f7580p = 0.0f;

    /* renamed from: q */
    public static float f7581q = 0.0f;

    /* renamed from: C */
    private C0980j f7584C;

    /* renamed from: D */
    private C0980j f7585D;

    /* renamed from: E */
    private C0980j f7586E;

    /* renamed from: F */
    private C3095e f7587F;

    /* renamed from: G */
    private C3095e f7588G;

    /* renamed from: K */
    private C1017d f7592K;

    /* renamed from: L */
    private C1017d f7593L;

    /* renamed from: M */
    private C0981k f7594M;

    /* renamed from: N */
    private C2344g f7595N;

    /* renamed from: O */
    private float f7596O;

    /* renamed from: P */
    private C0981k f7597P;

    /* renamed from: Q */
    private C0981k f7598Q;

    /* renamed from: R */
    private C2287a f7599R;

    /* renamed from: S */
    private C2298b f7600S;

    /* renamed from: T */
    private float f7601T;

    /* renamed from: U */
    private float f7602U;

    /* renamed from: V */
    private float f7603V;

    /* renamed from: W */
    private float f7604W;

    /* renamed from: Y */
    private boolean f7606Y;

    /* renamed from: Z */
    private boolean f7607Z;

    /* renamed from: ae */
    private C1013b f7612ae;

    /* renamed from: af */
    private boolean f7613af;

    /* renamed from: ag */
    private C1017d f7614ag;

    /* renamed from: ah */
    private C1017d f7615ah;

    /* renamed from: am */
    private C1017d f7620am;

    /* renamed from: an */
    private C1017d f7621an;

    /* renamed from: n */
    public C2288a f7622n;

    /* renamed from: r */
    public Runnable f7623r;

    /* renamed from: s */
    private C0980j f7624s;

    /* renamed from: t */
    private C0980j f7625t;

    /* renamed from: w */
    private float f7628w;

    /* renamed from: u */
    private float f7626u = 0.0f;

    /* renamed from: v */
    private float f7627v = 0.0f;

    /* renamed from: x */
    private float f7629x = 0.4f;

    /* renamed from: y */
    private boolean f7630y = true;

    /* renamed from: z */
    private boolean f7631z = true;

    /* renamed from: A */
    private boolean f7582A = false;

    /* renamed from: H */
    private TextureElement f7589H = new TextureElement(0, false);

    /* renamed from: I */
    private TextureElement f7590I = new TextureElement(0, false);

    /* renamed from: J */
    private TextureElement f7591J = new TextureElement(0, false);

    /* renamed from: X */
    private boolean f7605X = false;

    /* renamed from: aa */
    private int f7608aa = 255;

    /* renamed from: ab */
    private boolean f7609ab = false;

    /* renamed from: ac */
    private float f7610ac = 0.0f;

    /* renamed from: ad */
    private boolean f7611ad = false;

    /* renamed from: ai */
    private boolean f7616ai = false;

    /* renamed from: aj */
    private float f7617aj = 0.0f;

    /* renamed from: ak */
    private float f7618ak = 0.0f;

    /* renamed from: al */
    private boolean f7619al = false;

    /* renamed from: B */
    private C2311e f7583B = new C2311e(this);

    /* renamed from: com.tsf.shell.f.c.a.f$a */
    /* loaded from: classes.dex */
    public static class C2343a {

        /* renamed from: a */
        public float f7660a;

        /* renamed from: b */
        public float f7661b;

        /* renamed from: c */
        public float f7662c;
    }

    /* renamed from: a */
    public boolean m5857a() {
        return this.f7606Y;
    }

    /* renamed from: b */
    public static String m5841b() {
        Cursor query = C0853a.m10856d().getContentResolver().query(C3345g.C3353h.f11072a, null, null, null, null);
        String str = "";
        while (query.moveToNext()) {
            str = query.getString(query.getColumnIndex("child"));
        }
        if (str == null) {
            str = "";
        }
        query.close();
        return str;
    }

    public C2326f(boolean z) {
        boolean z2 = true;
        this.f7606Y = false;
        this.f7607Z = false;
        this.f7613af = false;
        this.f7606Y = z;
        if (!z && C3359a.f11093g.m5950c() != 1) {
            z2 = false;
        }
        this.f7607Z = z2;
        if (!z) {
            C3359a.f11088b.m10565a(this);
        }
        if (z) {
            this.f7613af = false;
        } else {
            this.f7613af = C3430e.m2476e();
        }
        f7573h = new C2294f();
        f7574i = new C2296h();
        f7575j = new C2293e();
        f7576k = new C2295g();
        f7577l = new C2290b();
        f7578m = new C2291c();
        f7570e = 200.0f * C0892a.f2566b;
        f7571f = 360.0f * C0892a.f2566b;
        f7572g = 150.0f * C0892a.f2566b;
        f7568c = 138.0f * C0892a.f2566b;
        m5865A();
    }

    /* renamed from: c */
    public void m5835c() {
        if (this.f7607Z) {
            m5842a(true);
        } else {
            m5831d();
        }
    }

    /* renamed from: d */
    public void m5831d() {
        this.f7607Z = true;
        m5787z();
    }

    /* renamed from: a */
    public void m5842a(boolean z) {
        this.f7607Z = false;
        m5836b(z);
    }

    /* renamed from: e */
    public boolean m5828e() {
        return this.f7607Z;
    }

    /* renamed from: f */
    public C2311e m5826f() {
        return this.f7583B;
    }

    /* renamed from: A */
    private void m5865A() {
        this.f7601T = C0892a.m10742a(54.0f);
        this.f7602U = C0892a.m10742a(54.0f);
        this.f7603V = C0892a.m10742a(80.0f);
        this.f7604W = C0892a.m10742a(80.0f);
        f7579o = C0892a.m10742a(60.0f);
        f7580p = C0892a.m10742a(60.0f);
        f7581q = C0892a.m10742a(60.0f);
    }

    /* renamed from: B */
    private void m5864B() {
        Bitmap m638b = C4181q.m638b(18.0f, -1);
        C0853a.m10853g().m10540a(this.f7590I, m638b);
        m638b.recycle();
    }

    /* renamed from: g */
    public C2298b m5824g() {
        return this.f7600S;
    }

    /* renamed from: h */
    public C0980j m5822h() {
        return this.f7625t;
    }

    /* renamed from: a */
    public void m5843a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = C4171h.m678a(arrayList, str, ",", false).iterator();
        while (it.hasNext()) {
            m5850a(it.next());
        }
        float mo5935a = this.f7622n.mo5935a(this.f7626u, this.f7627v);
        if (this.f7596O > mo5935a) {
            this.f7600S.m5902b(mo5935a);
        } else {
            this.f7600S.m5902b(this.f7596O);
        }
        if (this.f7613af) {
            this.f7600S.m5880j();
            this.f7600S.m5883h();
            return;
        }
        m5844a((Runnable) null, false);
    }

    /* renamed from: a */
    private void m5850a(ItemInfo itemInfo) {
        C3112b m2146a;
        if (itemInfo.itemType == 1) {
            m2146a = C3145b.m3404a((LauncherFolder3DInfo) itemInfo);
        } else {
            m2146a = C3519a.m2146a(itemInfo, true);
        }
        this.f7600S.m5904a(m2146a, false);
        this.f7600S.addChild(m2146a);
    }

    /* renamed from: a */
    public void m5851a(int i, boolean z) {
        if (this.f7608aa != i) {
            this.f7608aa = i;
            int m690a = C4169f.m690a(i);
            this.f7584C.alpha(m690a);
            this.f7597P.alpha(m690a);
            if (z) {
                C3430e.m2542a(i);
            }
        }
    }

    /* renamed from: i */
    public int m5820i() {
        return this.f7608aa;
    }

    /* renamed from: a */
    public void m5849a(C0980j c0980j, C2343a c2343a) {
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        float f5;
        float f6;
        boolean z2 = true;
        this.f7614ag = new C1017d();
        this.f7614ag.m10294l(1.0f);
        this.f7614ag.m10293m(1.0f);
        this.f7615ah = new C1017d() { // from class: com.tsf.shell.f.c.a.f.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2326f.this.f7597P.visible(false);
            }
        };
        this.f7615ah.m10294l(0.0f);
        this.f7615ah.m10293m(0.0f);
        this.f7624s = c0980j;
        f7566a = (int) (50.0f * C0892a.f2566b);
        f7567b = (int) (100.0f * C0892a.f2566b);
        this.f7600S = new C2298b(this);
        if (this.f7606Y) {
            this.f7600S.f7492a = 0.1f;
        }
        m5848a(f7578m);
        m5863C();
        this.f7585D = new C0980j();
        this.f7584C = new C0980j();
        this.f7612ae = new C1013b();
        this.f7625t = new C0980j() { // from class: com.tsf.shell.f.c.a.f.9
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (!C2326f.this.f7630y && !C2326f.this.f7619al) {
                    position().f2526x += (C2326f.this.f7626u - position().f2526x) * C2326f.this.f7629x;
                    position().f2527y += (C2326f.this.f7627v - position().f2527y) * C2326f.this.f7629x;
                    if (Math.abs(position().f2526x - C2326f.this.f7626u) < 0.2f && Math.abs(position().f2527y - C2326f.this.f7627v) < 0.2f && !C2326f.this.f7582A) {
                        position().f2526x = C2326f.this.f7626u;
                        position().f2527y = C2326f.this.f7627v;
                        C2326f.this.f7630y = true;
                        C2326f.this.f7625t.setAnimationObjectState(false);
                    }
                }
                if (!C2326f.this.f7631z) {
                    if (C2326f.this.f7600S.m5914a(C2326f.this.f7610ac) > 0.32f || C2326f.this.f7610ac > C2326f.this.f7628w) {
                        C2326f.this.f7628w = C2326f.this.f7610ac;
                    }
                    float m5786a = C2326f.this.f7595N.m5786a();
                    C2326f.this.f7596O = m5786a + ((C2326f.this.f7628w - m5786a) * C2326f.this.f7629x);
                    C2326f.this.m5852a(C2326f.this.f7596O, true);
                    C2326f.this.f7600S.m5896c(C2326f.this.f7596O);
                    if (Math.abs(C2326f.this.f7596O - C2326f.this.f7628w) < 0.2f) {
                        C2326f.this.f7596O = C2326f.this.f7628w;
                        C2326f.this.m5852a(C2326f.this.f7596O, true);
                        C2326f.this.f7600S.m5896c(C2326f.this.f7596O);
                        C2326f.this.f7595N.setAnimationObjectState(false);
                        C2326f.this.f7631z = true;
                        if (!C2326f.this.f7606Y) {
                            if (C0892a.f2564O) {
                                C3430e.m2544a(C2326f.this.f7596O);
                            } else {
                                C3430e.m2497b(C2326f.this.f7596O);
                            }
                        }
                    }
                }
            }
        };
        this.f7624s.addChild(this.f7625t);
        PositionNumber3d position = this.f7625t.position();
        float f7 = C0892a.f2590z + f7566a;
        this.f7626u = f7;
        position.f2526x = f7;
        PositionNumber3d position2 = this.f7625t.position();
        float f8 = C0892a.f2552C + f7566a;
        this.f7627v = f8;
        position2.f2527y = f8;
        m5864B();
        this.f7586E = new C0980j();
        this.f7587F = new C3095e();
        this.f7587F.m3586b(0.0f);
        this.f7586E.addChild(this.f7587F);
        this.f7588G = new C3095e();
        this.f7588G.m3586b(0.0f);
        this.f7586E.addChild(this.f7588G);
        this.f7599R = new C2287a(this.f7584C, this);
        this.f7584C.setMouseEventListener(this.f7599R);
        this.f7597P = new C0981k(this.f7590I.width, this.f7590I.height, false);
        this.f7597P.rotation().f2528z = 90.0f;
        this.f7597P.calAABB(3.0f, 3.0f, 1.0f);
        this.f7597P.scale().setAll(0.0f, 0.0f, 1.0f);
        this.f7597P.visible(false);
        this.f7597P.textures().addElement(this.f7590I);
        this.f7598Q = new C0981k(this.f7590I.width, this.f7590I.height, false);
        this.f7598Q.textures().addElement(this.f7590I);
        this.f7584C.addChild(this.f7598Q);
        this.f7584C.calAABB(3.0f, 3.0f, 1.0f);
        this.f7597P.setMouseEventListener(new C0937a(this.f7597P) { // from class: com.tsf.shell.f.c.a.f.10

            /* renamed from: b */
            private float f7634b;

            /* renamed from: d */
            private boolean f7635d = false;

            /* renamed from: e */
            private float f7636e;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C4187w.m614b();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f7635d = false;
                this.f7634b = C2326f.this.f7595N.m5786a();
                this.f7636e = C2326f.this.f7622n.mo5935a(C2326f.this.f7626u, C2326f.this.f7627v);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!C2326f.this.f7613af) {
                    boolean z3 = C2326f.this.f7595N.rotation().f2528z % 180.0f == 0.0f;
                    if (this.f7635d) {
                        float mo5934a = C2326f.this.f7622n.mo5934a(this.f7634b, motionEvent, motionEvent2);
                        if (mo5934a > this.f7636e) {
                            mo5934a = this.f7636e;
                        }
                        if (mo5934a < C2326f.f7568c * C0892a.f2566b) {
                            mo5934a = C2326f.f7568c * C0892a.f2566b;
                        }
                        C2326f.this.f7610ac = mo5934a;
                        C2326f.this.f7631z = false;
                        C2326f.this.f7595N.setAnimationObjectState(true);
                        C2326f.this.f7595N.invalidate();
                    } else if (z3) {
                        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > 20.0f) {
                            this.f7635d = true;
                        }
                    } else if (Math.abs(motionEvent2.getY() - motionEvent.getY()) > 20.0f) {
                        this.f7635d = true;
                    }
                }
            }
        });
        this.f7594M = new C0981k(0.0f, this.f7591J.height * C0892a.f2566b);
        this.f7594M.textures().addElement(this.f7591J);
        this.f7594M.alpha(0.0f);
        this.f7592K = new C1017d();
        this.f7592K.m10314a(255);
        this.f7593L = new C1017d() { // from class: com.tsf.shell.f.c.a.f.11
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2326f.this.f7594M.removeFromParent();
            }
        };
        this.f7593L.m10314a(0);
        f7569d = C0892a.m10742a(130.0f);
        this.f7595N = new C2344g(this.f7589H.width, this.f7589H.height, new C2345h(this.f7589H.width / 2, this.f7589H.height / 2, this.f7589H.height)) { // from class: com.tsf.shell.f.c.a.f.12
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public C0975i getHittingTarget(float f9, float f10, boolean z3) {
                if (C2326f.this.f7597P.calTouchCollision(f9, f10)) {
                    return C2326f.this.f7597P;
                }
                if (!calTouchCollision(f9, f10)) {
                    return null;
                }
                return this;
            }
        };
        this.f7595N.textures().addElement(this.f7589H);
        this.f7595N.setMouseEventListener(new C0937a(this.f7595N) { // from class: com.tsf.shell.f.c.a.f.13

            /* renamed from: a */
            boolean f7639a = true;

            /* renamed from: b */
            boolean f7640b = true;

            /* renamed from: d */
            C0975i f7641d;

            /* renamed from: e */
            C0937a f7642e;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
                if (this.f7639a) {
                    this.f7639a = false;
                    C2326f.this.f7600S.m5913a(motionEvent2.getX(), motionEvent2.getY());
                }
                C2326f.this.f7600S.m5901b(motionEvent2.getX(), motionEvent2.getY());
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f7641d = null;
                this.f7642e = null;
                this.f7641d = C2326f.this.f7600S.getHittingObjectTarget(motionEvent, true);
                if (this.f7641d != null && this.f7641d.getMouseEventListener() != null) {
                    this.f7642e = this.f7641d.getMouseEventListener();
                    this.f7642e.mo1654e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (!this.f7639a) {
                    this.f7639a = true;
                    C2326f.this.f7600S.m5897c();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f7642e != null) {
                    this.f7642e.mo502a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f7642e != null) {
                    this.f7642e.mo2129a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                this.f7640b = false;
                if (this.f7642e != null) {
                    this.f7642e.mo2122c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                this.f7640b = false;
                if (this.f7642e != null) {
                    this.f7642e.mo2119d(motionEvent);
                }
            }
        });
        this.f7585D.addChild(this.f7597P);
        this.f7595N.addChild(this.f7585D);
        this.f7625t.addChild(this.f7600S);
        this.f7625t.addChild(this.f7595N);
        this.f7625t.addChild(this.f7584C);
        m5852a(0.0f, true);
        float m2490c = C0892a.f2564O ? C3430e.m2490c() : C3430e.m2483d();
        if (!this.f7606Y) {
            if (C3430e.m2490c() != 0.0f || C3430e.m2483d() != 0.0f) {
                z2 = false;
            }
            if (m2490c == 0.0f) {
                f5 = (int) (C3566b.f11839a.f11750H * 6 * 0.95f);
                f4 = (-f5) / 2.0f;
                f6 = C0892a.f2552C;
            } else {
                Number3d m2471f = C0892a.f2564O ? C3430e.m2471f() : C3430e.m2466g();
                float f9 = m2471f.f2526x;
                float f10 = m2471f.f2527y;
                f4 = f9;
                f5 = m2490c;
                f6 = f10;
            }
            if (f5 < f7568c) {
                boolean z3 = z2;
                f = f7568c;
                f2 = f4;
                f3 = f6;
                z = z3;
            } else {
                boolean z4 = z2;
                f = f5;
                f2 = f4;
                f3 = f6;
                z = z4;
            }
        } else {
            f = c2343a.f7660a;
            f2 = c2343a.f7661b;
            f3 = c2343a.f7662c;
            z = false;
        }
        this.f7628w = f;
        this.f7596O = f;
        m5853a(f2, f3, false);
        if (!this.f7606Y && z) {
            if (C0892a.f2564O) {
                C3430e.m2544a(this.f7596O);
                C3430e.m2543a(this.f7626u, this.f7627v);
            } else {
                C3430e.m2497b(this.f7596O);
                C3430e.m2496b(this.f7626u, this.f7627v);
            }
        }
        m5851a(C3430e.m2498b(), false);
        C3359a.f11094h.m4060c().m3849a(new C2989o.C2990a() { // from class: com.tsf.shell.f.c.a.f.14
            @Override // com.tsf.shell.p096f.p131f.C2989o.C2990a
            /* renamed from: a */
            public void mo3846a(C2932g c2932g) {
                if (c2932g.m4181t() == -1) {
                    if (C2326f.this.f7611ad) {
                        C2326f.this.m5794v();
                    }
                } else if (!C2326f.this.f7613af && !C2326f.this.f7611ad) {
                    C2326f.this.m5790x();
                }
            }

            @Override // com.tsf.shell.p096f.p131f.C2989o.C2990a
            /* renamed from: a */
            public void mo3847a() {
                if (C2326f.this.f7611ad) {
                    C2326f.this.m5794v();
                }
            }

            @Override // com.tsf.shell.p096f.p131f.C2989o.C2990a
            /* renamed from: b */
            public void mo3845b() {
                if (!C2326f.this.f7613af && !C2326f.this.f7611ad && C3359a.f11094h.m4031n().m4181t() != -1) {
                    C2326f.this.m5790x();
                }
            }
        });
        if (this.f7607Z) {
            m5831d();
        } else {
            m5842a(false);
        }
    }

    /* renamed from: a */
    public int m5856a(float f) {
        return this.f7622n.mo5926a(f, this.f7588G.rotation().f2528z, 0.0f);
    }

    /* renamed from: j */
    public void m5818j() {
        C2288a.C2289a mo5924a = this.f7622n.mo5924a(this.f7625t, this.f7588G.f10034a, 8.0f, 4.0f, 24.0f);
        if (mo5924a != null) {
            this.f7588G.visible(Boolean.valueOf(!this.f7611ad));
            this.f7588G.rotation().f2528z = mo5924a.f7479d;
            this.f7587F.rotation().f2528z = mo5924a.f7480e;
            this.f7588G.m3588a(mo5924a.f7476a);
            this.f7587F.m3588a(mo5924a.f7477b);
            this.f7586E.removeFromParent();
            this.f7586E.position().setAllFrom(this.f7625t.position());
            C3359a.f11096j.m2232a(this.f7586E);
        }
    }

    /* renamed from: k */
    public void m5816k() {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.c.a.f.15
            @Override // java.lang.Runnable
            public void run() {
                C2326f.this.m5814l();
            }
        });
    }

    /* renamed from: l */
    public void m5814l() {
        if (this.f7623r == null) {
            this.f7623r = new Runnable() { // from class: com.tsf.shell.f.c.a.f.16
                @Override // java.lang.Runnable
                public void run() {
                    C2326f.this.f7588G.m3586b(0.0f);
                    C2326f.this.f7587F.m3586b(0.0f);
                    C2326f.this.f7586E.removeFromParent();
                }
            };
        }
        this.f7588G.m3587a(0.0f, this.f7623r);
        this.f7587F.m3588a(0.0f);
    }

    /* renamed from: m */
    public void m5812m() {
        if (!this.f7609ab) {
            this.f7609ab = true;
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.c.a.f.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C2326f.this.f7594M.parent() == null) {
                        C2326f.this.f7625t.addChildAt(C2326f.this.f7594M, 0);
                    }
                    if (!C2326f.this.f7605X) {
                        C2326f.this.f7594M.rotation().f2528z = 90.0f;
                        C2326f.this.f7594M.mo10368a(C0892a.f2556G * 2);
                    } else {
                        C2326f.this.f7594M.rotation().f2528z = 0.0f;
                        C2326f.this.f7594M.mo10368a(C0892a.f2555F * 2);
                    }
                    C1014c.m10326a(C2326f.this.f7594M);
                    C1014c.m10325a(C2326f.this.f7594M, VEasing.Linear.easeNone, C2326f.this.f7592K);
                }
            });
        }
    }

    /* renamed from: n */
    public void m5810n() {
        if (this.f7609ab) {
            this.f7609ab = false;
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.c.a.f.3
                @Override // java.lang.Runnable
                public void run() {
                    C1014c.m10326a(C2326f.this.f7594M);
                    C1014c.m10325a(C2326f.this.f7594M, VEasing.Linear.easeNone, C2326f.this.f7593L);
                }
            });
        }
    }

    /* renamed from: a */
    public void m5852a(float f, boolean z) {
        this.f7595N.setAABBPX(0.0f, (-f7569d) / 2.0f, 0.0f, f, f7569d / 2.0f, 0.0f);
        this.f7595N.m5783c(f);
        if (z) {
            this.f7585D.position().f2526x = f;
        }
    }

    /* renamed from: a */
    private void m5848a(C2288a c2288a) {
        this.f7622n = c2288a;
        this.f7600S.m5888e();
    }

    /* renamed from: b */
    private void m5840b(C2288a c2288a) {
        if (c2288a != this.f7622n) {
            this.f7622n = c2288a;
            this.f7600S.m5888e();
        }
    }

    /* renamed from: C */
    private void m5863C() {
        this.f7600S.m5895c(this.f7601T, this.f7602U);
    }

    /* renamed from: o */
    public void m5808o() {
        C4187w.m616a();
        this.f7582A = true;
        this.f7630y = false;
        this.f7625t.setAnimationObjectState(true);
        this.f7625t.invalidate();
        this.f7626u = this.f7625t.position().f2526x;
        this.f7627v = this.f7625t.position().f2527y;
        m5794v();
    }

    /* renamed from: a */
    public void m5855a(float f, float f2) {
        this.f7626u = f;
        this.f7627v = f2;
    }

    /* renamed from: a */
    public void m5854a(float f, float f2, float f3) {
        this.f7626u = f2;
        this.f7627v = f3;
        this.f7625t.position().setAll(this.f7626u, this.f7627v, 0.0f);
        this.f7596O = f;
        if (this.f7611ad) {
            this.f7600S.m5896c(f);
            m5852a(f, true);
        }
    }

    /* renamed from: p */
    public float m5806p() {
        return this.f7596O;
    }

    /* renamed from: q */
    public void m5804q() {
        this.f7582A = false;
        m5832c(false);
        if (!this.f7606Y) {
            if (C0892a.f2564O) {
                C3430e.m2543a(this.f7626u, this.f7627v);
            } else {
                C3430e.m2496b(this.f7626u, this.f7627v);
            }
        }
        if (!this.f7613af) {
            m5790x();
            return;
        }
        float f = this.f7596O;
        float mo5935a = this.f7622n.mo5935a(this.f7626u, this.f7627v);
        if (f <= mo5935a) {
            mo5935a = f;
        }
        this.f7600S.m5887e(mo5935a);
    }

    /* renamed from: a */
    private void m5853a(float f, float f2, boolean z) {
        this.f7626u = f;
        this.f7627v = f2;
        m5832c(z);
        this.f7625t.position().setAll(this.f7626u, this.f7627v, 0.0f);
    }

    /* renamed from: c */
    private void m5832c(boolean z) {
        float abs = Math.abs(this.f7626u - C0892a.f2590z);
        float abs2 = Math.abs(C0892a.f2550A - this.f7626u);
        float abs3 = Math.abs(this.f7627v - C0892a.f2552C);
        if (z && this.f7622n != null) {
            if (this.f7622n instanceof C2292d) {
                this.f7627v = C0892a.f2552C + f7566a;
                m5860F();
            } else {
                if (abs > abs2) {
                    this.f7626u = C0892a.f2550A - f7566a;
                } else {
                    this.f7626u = C0892a.f2590z + f7566a;
                }
                m5861E();
            }
        } else if (abs < abs2 && abs < abs3) {
            this.f7626u = C0892a.f2590z + f7566a;
            m5861E();
        } else if (abs2 < abs && abs2 < abs3) {
            this.f7626u = C0892a.f2550A - f7566a;
            m5861E();
        } else {
            this.f7627v = C0892a.f2552C + f7566a;
            m5860F();
        }
        if (z && !this.f7606Y) {
            if (this.f7622n instanceof C2292d) {
                C3430e.m2543a(this.f7626u, this.f7627v);
            } else {
                C3430e.m2496b(this.f7626u, this.f7627v);
            }
        }
    }

    /* renamed from: D */
    private void m5862D() {
        if (!this.f7606Y) {
            if (this.f7622n.f7473c == 3) {
                this.f7627v = C0892a.f2552C + f7566a;
            } else if (this.f7622n.f7473c == 0) {
                this.f7626u = C0892a.f2590z + f7566a;
            } else if (this.f7622n.f7473c == 1) {
                this.f7627v = C0892a.f2550A - f7566a;
            }
        }
    }

    /* renamed from: E */
    private void m5861E() {
        if (!this.f7606Y) {
            if (this.f7627v > C0892a.f2551B - f7566a) {
                this.f7627v = C0892a.f2551B - f7566a;
            } else if (this.f7627v < C0892a.f2552C + f7566a) {
                this.f7627v = C0892a.f2552C + f7566a;
            }
            boolean z = this.f7595N.m5786a() != 0.0f;
            if (this.f7627v > 0.0f) {
                if (z) {
                    C1017d c1017d = new C1017d();
                    c1017d.m10303e(-90.0f);
                    C1014c.m10326a(this.f7595N);
                    C1014c.m10325a(this.f7595N, 300, c1017d);
                } else {
                    this.f7595N.rotation().f2528z = -90.0f;
                }
                this.f7585D.rotation().f2528z = 90.0f;
                if (this.f7626u < 0.0f) {
                    this.f7605X = false;
                    m5840b(f7575j);
                    return;
                }
                this.f7605X = false;
                m5840b(f7576k);
                return;
            }
            if (z) {
                C1017d c1017d2 = new C1017d();
                c1017d2.m10303e(90.0f);
                C1014c.m10326a(this.f7595N);
                C1014c.m10325a(this.f7595N, 300, c1017d2);
            } else {
                this.f7595N.rotation().f2528z = 90.0f;
            }
            this.f7585D.rotation().f2528z = -90.0f;
            if (this.f7626u < 0.0f) {
                this.f7605X = false;
                m5840b(f7573h);
                return;
            }
            this.f7605X = false;
            m5840b(f7574i);
        }
    }

    /* renamed from: F */
    private void m5860F() {
        if (!this.f7606Y) {
            if (this.f7626u > C0892a.f2550A - f7566a) {
                this.f7626u = C0892a.f2550A - f7566a;
            } else if (this.f7626u < C0892a.f2590z + f7566a) {
                this.f7626u = C0892a.f2590z + f7566a;
            }
            boolean z = this.f7595N.m5786a() != 0.0f;
            if (this.f7626u > 0.0f) {
                if (z) {
                    C1017d c1017d = new C1017d();
                    c1017d.m10303e(180.0f);
                    C1014c.m10326a(this.f7595N);
                    C1014c.m10325a(this.f7595N, 300, c1017d);
                } else {
                    this.f7595N.rotation().f2528z = 180.0f;
                }
                this.f7585D.rotation().f2528z = -180.0f;
                this.f7605X = true;
                m5840b(f7577l);
                return;
            }
            if (z) {
                C1017d c1017d2 = new C1017d();
                c1017d2.m10303e(0.0f);
                C1014c.m10326a(this.f7595N);
                C1014c.m10325a(this.f7595N, 300, c1017d2);
            } else {
                this.f7595N.rotation().f2528z = 0.0f;
            }
            this.f7585D.rotation().f2528z = 0.0f;
            this.f7605X = true;
            m5840b(f7578m);
        }
    }

    /* renamed from: r */
    public boolean m5802r() {
        return this.f7611ad;
    }

    /* renamed from: s */
    public boolean m5800s() {
        return this.f7613af;
    }

    /* renamed from: G */
    private void m5859G() {
        if (!this.f7606Y) {
            C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.f.c.a.f.4
                @Override // java.lang.Runnable
                public void run() {
                    C3430e.m2536a(C2326f.this.f7613af);
                }
            });
        }
    }

    /* renamed from: t */
    public void m5798t() {
        if (this.f7607Z) {
            C4187w.m616a();
            this.f7613af = false;
            m5790x();
            m5859G();
        }
    }

    /* renamed from: u */
    public void m5796u() {
        if (this.f7607Z) {
            C4187w.m616a();
            this.f7613af = true;
            m5794v();
            m5859G();
        }
    }

    /* renamed from: v */
    public void m5794v() {
        if (this.f7611ad) {
            this.f7600S.m5885f();
            this.f7611ad = false;
            final float m5786a = this.f7595N.m5786a();
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.c.a.f.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C2326f.this.m5852a(m5786a * (1.0f - f), true);
                }
            };
            C1014c.m10326a(this.f7612ae);
            C1014c.m10325a(this.f7612ae, 600, c1017d);
            m5858H();
        }
    }

    /* renamed from: d */
    private void m5829d(boolean z) {
        this.f7597P.visible(true);
        if (z) {
            C1014c.m10326a(this.f7597P);
            C1014c.m10325a(this.f7597P, 600, this.f7614ag);
            return;
        }
        this.f7597P.scale().setAll(1.0f, 1.0f, 1.0f);
    }

    /* renamed from: H */
    private void m5858H() {
        C1014c.m10326a(this.f7597P);
        C1014c.m10325a(this.f7597P, 600, this.f7615ah);
    }

    /* renamed from: w */
    public float m5792w() {
        return this.f7627v;
    }

    /* renamed from: x */
    public void m5790x() {
        m5844a((Runnable) null, true);
    }

    /* renamed from: a */
    public void m5844a(final Runnable runnable, boolean z) {
        if (!this.f7611ad) {
            this.f7611ad = true;
            float f = this.f7596O;
            final float mo5935a = this.f7622n.mo5935a(this.f7626u, this.f7627v);
            if (f <= mo5935a) {
                mo5935a = f;
            }
            this.f7600S.m5887e(mo5935a);
            this.f7600S.m5903a(z);
            final float m5786a = this.f7595N.m5786a();
            final boolean z2 = this.f7613af ? false : true;
            if (z) {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.c.a.f.6
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f2) {
                        C2326f.this.m5852a(m5786a + ((mo5935a - m5786a) * f2), z2);
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                C1014c.m10326a(this.f7612ae);
                C1014c.m10325a(this.f7612ae, 500, c1017d);
            } else {
                m5852a(mo5935a, z2);
                if (runnable != null) {
                    runnable.run();
                }
            }
            m5829d(z);
        }
    }

    /* renamed from: y */
    public void m5788y() {
        m5836b(true);
    }

    /* renamed from: b */
    public void m5836b(boolean z) {
        if (!this.f7619al) {
            this.f7619al = true;
            this.f7625t.mouseEnabled(false);
            Number3d mo5921a = this.f7622n.mo5921a(this.f7625t);
            if (z) {
                if (this.f7621an == null) {
                    this.f7621an = new C1017d() { // from class: com.tsf.shell.f.c.a.f.7
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            C2326f.this.f7625t.visible(false);
                        }
                    };
                }
                this.f7621an.mo10301f(mo5921a.f2526x);
                this.f7621an.mo10298h(mo5921a.f2527y);
                C1014c.m10326a(this.f7625t);
                C1014c.m10325a(this.f7625t, 600, this.f7621an);
                return;
            }
            this.f7625t.visible(false);
            this.f7625t.position().f2526x = mo5921a.f2526x;
            this.f7625t.position().f2527y = mo5921a.f2527y;
        }
    }

    /* renamed from: z */
    public void m5787z() {
        if (this.f7619al && this.f7607Z) {
            this.f7619al = false;
            this.f7625t.visible(true);
            Number3d mo5916b = this.f7622n.mo5916b(this.f7625t);
            if (this.f7620am == null) {
                this.f7620am = new C1017d() { // from class: com.tsf.shell.f.c.a.f.8
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2326f.this.f7625t.mouseEnabled(true);
                    }
                };
            }
            this.f7620am.mo10301f(mo5916b.f2526x);
            this.f7620am.mo10298h(mo5916b.f2527y);
            C1014c.m10326a(this.f7625t);
            C1014c.m10325a(this.f7625t, 600, this.f7620am);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        boolean z = false;
        if (((this.f7622n instanceof C2292d) && C0892a.f2564O) || ((this.f7622n instanceof C2297i) && !C0892a.f2564O)) {
            z = true;
        }
        Number3d m2471f = C0892a.f2564O ? C3430e.m2471f() : C3430e.m2466g();
        if (m2471f.f2526x == 0.0f && m2471f.f2527y == 0.0f) {
            m5862D();
            f = this.f7626u;
            f2 = this.f7627v;
        } else {
            f = m2471f.f2526x;
            f2 = m2471f.f2527y;
        }
        m5853a(f, f2, z);
        float m2490c = C0892a.f2564O ? C3430e.m2490c() : C3430e.m2483d();
        if (m2490c == 0.0f) {
            m2490c = this.f7596O;
        }
        if (m2490c != 0.0f) {
            if (m2490c < f7568c * C0892a.f2566b) {
                m2490c = f7568c * C0892a.f2566b;
            }
            float mo5935a = this.f7622n.mo5935a(this.f7626u, this.f7627v);
            if (m2490c > mo5935a) {
                m2490c = mo5935a;
            }
            this.f7628w = m2490c;
            this.f7596O = m2490c;
            if (this.f7611ad) {
                m5852a(this.f7596O, true);
                this.f7600S.m5891d(this.f7596O);
                this.f7600S.invalidate();
            }
        }
    }
}
