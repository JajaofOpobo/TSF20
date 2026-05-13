package com.tsf.shell.manager.p181m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0896c;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0902e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4177m;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.tsf.shell.manager.m.a */
/* loaded from: classes.dex */
public class C3524a extends C0896c {

    /* renamed from: a */
    private AbstractC3208b f11628a;

    /* renamed from: b */
    private C0902e f11629b;

    /* renamed from: d */
    private float f11631d;

    /* renamed from: e */
    private C3529b f11632e;

    /* renamed from: f */
    private C3526a f11633f;

    /* renamed from: c */
    private int f11630c = 0;

    /* renamed from: g */
    private boolean f11634g = true;

    public C3524a(C3529b c3529b) {
        this.f11632e = c3529b;
        m2130e();
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: d */
    public C0975i mo2131d() {
        return this.f11632e.m2082k();
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: a */
    public void mo2137a(final C3231c c3231c) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.m.a.1
            @Override // java.lang.Runnable
            public void run() {
                C3524a.this.removeChild(c3231c);
                C3524a.this.f11632e.m2078o();
            }
        };
        if (c3231c instanceof C3145b) {
            C3743g.m1618a(c3231c, null, runnable);
        } else {
            C3743g.m1619a(c3231c, runnable);
        }
    }

    /* renamed from: a */
    public void m2139a(C0902e c0902e) {
        this.f11629b = c0902e;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        super.onDrawStart();
        if (this.f11630c == 1) {
            this.f11629b.m10671a(this.f11631d);
        } else if (this.f11630c == 2) {
            this.f11629b.m10663b(this.f11631d);
        }
    }

    /* renamed from: c */
    public int m2133c(float f) {
        float b = m10726b();
        float c = m10723c();
        int i = (int) (((f - b) + (c / 2.0f)) / (c + C3566b.f11839a.f11763U));
        if (i < 0) {
            i = 0;
        }
        return i > numChildren() + (-1) ? numChildren() - 1 : i;
    }

    /* renamed from: a */
    public void m2138a(InterfaceC2557f interfaceC2557f) {
        C0975i c0975i = (C0975i) interfaceC2557f;
        C1017d c1017d = new C1017d();
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 300, c1017d);
        this.f11633f.m2128a(c0975i);
    }

    /* renamed from: e */
    public void m2130e() {
        this.f11631d = C0892a.m10742a(15.0f);
        this.f11628a = new C3224h();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(6);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        m5257a(arrayList, arrayList2);
        C3526a c3526a = new C3526a(this);
        this.f11633f = c3526a;
        setMouseEventListener(c3526a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.m.a$a */
    /* loaded from: classes.dex */
    public class C3526a extends C0937a {

        /* renamed from: b */
        private Number3d f11638b;

        /* renamed from: d */
        private boolean f11639d;

        /* renamed from: e */
        private boolean f11640e;

        /* renamed from: f */
        private C0937a f11641f;

        /* renamed from: g */
        private C0975i f11642g;

        /* renamed from: h */
        private int f11643h;

        /* renamed from: i */
        private boolean f11644i;

        /* renamed from: j */
        private float[] f11645j;

        /* renamed from: k */
        private Number3d f11646k;

        /* renamed from: l */
        private boolean f11647l;

        public C3526a(C0975i c0975i) {
            super(c0975i);
            this.f11638b = new Number3d();
            this.f11639d = false;
            this.f11640e = false;
            this.f11644i = false;
            this.f11645j = new float[]{0.0f, 0.0f};
            this.f11646k = new Number3d();
            this.f11647l = false;
        }

        /* renamed from: a */
        public void m2128a(C0975i c0975i) {
            this.f11639d = false;
            this.f11647l = false;
            this.f11642g = c0975i;
            this.f11640e = true;
            C0864d.m10805d().m10801e();
            C0864d.m10805d().m10820a((C0937a) this, true);
            this.f11638b.setAllFrom(this.f11642g.position());
            if (this.f11642g != null && this.f11642g.getMouseEventListener() != null) {
                this.f11641f = this.f11642g.getMouseEventListener();
            }
            this.f11639d = true;
            this.f11643h = 0;
            C3524a.this.addChild(C3524a.this.f11628a);
            this.f11642g.setAnimationObjectState(true);
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: e */
        public void mo1654e(MotionEvent motionEvent) {
            this.f11640e = false;
            this.f11639d = false;
            this.f11647l = false;
            this.f11642g = C3524a.this.getHittingObjectTarget(motionEvent, true);
            if (this.f11642g != null && this.f11642g.getMouseEventListener() != null) {
                this.f11641f = this.f11642g.getMouseEventListener();
                this.f11641f.mo1654e(motionEvent);
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: f */
        public void mo1653f(MotionEvent motionEvent) {
            C3524a.this.f11630c = 0;
            if (this.f11641f != null) {
                this.f11641f.mo1653f(motionEvent);
                this.f11641f = null;
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo502a(MotionEvent motionEvent) {
            if (this.f11641f != null) {
                this.f11641f.mo502a(motionEvent);
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: c */
        public void mo2122c(MotionEvent motionEvent) {
            if (this.f11642g != null) {
                C4187w.m616a();
                this.f11643h = C3524a.this.getChildIndexOf(this.f11642g);
                this.f11638b.reset();
                this.f11638b = this.f11642g.localToGlobal(this.f11638b);
                C3524a.this.replaceChild(this.f11642g, C3524a.this.f11628a);
                this.f11642g.position().setAllFrom(this.f11638b);
                this.f11642g.setAnimationObjectState(true);
                C3359a.f11096j.m2232a(this.f11642g);
                this.f11639d = true;
                C3231c c3231c = (C3231c) this.f11642g;
                if (c3231c.m3541A().m3563e()) {
                    ArrayList<C3231c> m3560i = c3231c.m3541A().m3560i();
                    c3231c.rotation().f2528z = 0.0f;
                    int size = m3560i.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC3208b abstractC3208b = (AbstractC3208b) m3560i.get(i);
                        if (abstractC3208b != c3231c) {
                            c3231c.m3080a((C3231c) abstractC3208b);
                        }
                    }
                    c3231c.m3541A().m3561g();
                }
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: d */
        public void mo2119d(MotionEvent motionEvent) {
            if (this.f11642g != null) {
                this.f11639d = false;
                if (!this.f11647l) {
                    this.f11638b.setAllFrom(this.f11642g.position());
                    C3359a.f11096j.m2223b(this.f11642g);
                    C3524a.this.globalToLocal(this.f11638b);
                    C3524a.this.replaceChild(C3524a.this.f11628a, this.f11642g);
                    int childIndexOf = C3524a.this.getChildIndexOf(this.f11642g);
                    this.f11642g.position().setAllFrom(this.f11638b);
                    C3524a.this.m10724b(this.f11642g);
                    C3231c c3231c = (C3231c) this.f11642g;
                    C3524a.this.f11632e.m2107a((C3112b) c3231c, true);
                    if (c3231c.m3064as()) {
                        ArrayList<C3231c> m3060aw = c3231c.m3060aw();
                        int size = m3060aw == null ? 0 : m3060aw.size();
                        if (size > 0) {
                            if (childIndexOf != -1) {
                                for (int i = 0; i < size; i++) {
                                    AbstractC3208b abstractC3208b = (AbstractC3208b) m3060aw.get(i);
                                    abstractC3208b.position().f2526x = c3231c.position().f2526x + (AbstractC3208b.f10553j * (i + 1));
                                    abstractC3208b.position().f2527y = c3231c.position().f2527y + (AbstractC3208b.f10553j * (i + 1));
                                    abstractC3208b.removeFromParent();
                                    C3524a.this.addChildAt(abstractC3208b, childIndexOf);
                                    C3524a.this.f11632e.m2107a((C3112b) abstractC3208b, true);
                                }
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("restoreShortcut index error", Integer.toString(childIndexOf));
                                C4177m.m667a("EVENT_ISSUSE_FOLDER_ITEM_MOUSE_EVENT", hashMap);
                            }
                        }
                    } else if (!this.f11640e) {
                        c3231c.m3074ai();
                    }
                    C3524a.this.f11632e.m2078o();
                }
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo2129a(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
            if (this.f11642g != null && this.f11639d && !this.f11644i) {
                this.f11644i = true;
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.m.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3526a.this.f11644i = false;
                        if (C3526a.this.f11639d) {
                            if (C3526a.this.f11640e) {
                                if (C3526a.this.f11647l) {
                                    C3526a.this.f11642g.position().f2526x = (motionEvent2.getX() - motionEvent.getX()) + C3526a.this.f11638b.f2526x;
                                    C3526a.this.f11642g.position().f2527y = (motionEvent.getY() - motionEvent2.getY()) + C3526a.this.f11638b.f2527y;
                                    return;
                                }
                                float b = C3524a.this.m10726b();
                                C3524a.this.m10723c();
                                C4189x.m600a(motionEvent2, C3526a.this.f11645j);
                                C3526a.this.f11646k.f2526x = C3526a.this.f11645j[0];
                                C3526a.this.f11646k.f2527y = C3526a.this.f11645j[1];
                                float f = C3526a.this.f11646k.f2526x;
                                C3524a.this.f11629b.globalToLocal(C3526a.this.f11646k);
                                if (!(C3524a.this.f11632e.m2092d() == 0 ? f > ((float) C0892a.f2590z) + C3529b.f11653a : f < ((float) C0892a.f2550A) - C3529b.f11653a)) {
                                    if (C3526a.this.f11646k.f2527y > C3524a.this.f11629b.maxY() - b) {
                                        C3524a.this.f11630c = 1;
                                    } else if (C3526a.this.f11646k.f2527y < b + C3524a.this.f11629b.minY()) {
                                        C3524a.this.f11630c = 2;
                                    } else {
                                        C3524a.this.f11630c = 0;
                                        C3526a.this.f11646k.f2526x = C3526a.this.f11645j[0];
                                        C3526a.this.f11646k.f2527y = C3526a.this.f11645j[1];
                                        C3524a.this.globalToLocal(C3526a.this.f11646k);
                                        int m2133c = C3524a.this.m2133c(-C3526a.this.f11646k.f2527y);
                                        if (C3526a.this.f11643h != m2133c) {
                                            C3526a.this.f11643h = m2133c;
                                            C3524a.this.m10729a((C0975i) C3524a.this.f11628a);
                                            C3524a.this.addChildAt(C3524a.this.f11628a, C3526a.this.f11643h);
                                        }
                                    }
                                } else if (C3359a.f11094h.m4121F() != -1) {
                                    C3526a.this.f11647l = true;
                                    C3524a.this.removeChild(C3524a.this.f11628a);
                                    C3524a.this.f11632e.m2078o();
                                    final C0937a c0937a = C3526a.this.f11641f;
                                    C3524a.this.f11632e.m2103a(new Runnable() { // from class: com.tsf.shell.manager.m.a.a.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            ((AbstractC3208b) C3526a.this.f11642g).m3075ah();
                                            ((AbstractC3208b) C3526a.this.f11642g).mo3129aO();
                                            if (C3526a.this.f11639d) {
                                                C3526a.this.f11641f.mo2122c(null);
                                                C0864d.m10805d().m10801e();
                                                C0864d.m10805d().m10820a(C3526a.this.f11641f, true);
                                                return;
                                            }
                                            c0937a.mo2119d(C0864d.m10805d().m10796g());
                                        }
                                    });
                                }
                                C3526a.this.f11642g.position().f2526x = (motionEvent2.getX() - motionEvent.getX()) + C3526a.this.f11638b.f2526x;
                                C3526a.this.f11642g.position().f2527y = (motionEvent.getY() - motionEvent2.getY()) + C3526a.this.f11638b.f2527y;
                            } else if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                C3526a.this.f11640e = true;
                            }
                        }
                    }
                });
            }
        }
    }
}
