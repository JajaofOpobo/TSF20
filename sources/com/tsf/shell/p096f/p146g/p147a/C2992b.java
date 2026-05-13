package com.tsf.shell.p096f.p146g.p147a;

import android.content.ComponentName;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0985n;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.ShellActivity;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2411d;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.g.a.b */
/* loaded from: classes.dex */
public class C2992b extends AbstractC2593d {

    /* renamed from: a */
    public C2999c f9779a;

    /* renamed from: b */
    public C3009e f9780b;

    /* renamed from: c */
    public C3005d f9781c;

    /* renamed from: d */
    public C3016g f9782d;

    /* renamed from: e */
    public C3013f f9783e;

    /* renamed from: f */
    private C0985n f9784f;

    /* renamed from: g */
    private boolean f9785g;

    /* renamed from: h */
    private C0980j f9786h;

    /* renamed from: i */
    private AbstractC3208b f9787i;

    /* renamed from: j */
    private Runnable f9788j;

    /* renamed from: k */
    private boolean f9789k;

    public C2992b() {
        super(210.0f * C0892a.f2567c);
        this.f9785g = true;
        this.f9789k = false;
        ArrayList<C2578b> arrayList = new ArrayList<>();
        this.f9779a = new C2999c(this);
        arrayList.add(this.f9779a);
        this.f9781c = new C3005d(this);
        arrayList.add(this.f9781c);
        this.f9780b = new C3009e(this);
        arrayList.add(this.f9780b);
        this.f9782d = new C3016g(this);
        arrayList.add(this.f9782d);
        this.f9783e = new C3013f(this);
        arrayList.add(this.f9783e);
        setMenuItems(arrayList);
        this.f9784f = new C0985n();
        this.f9784f.setMouseEventListener(new C0937a(this.f9784f) { // from class: com.tsf.shell.f.g.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (C2992b.this.f9785g) {
                    C3359a.f11094h.m4021s().m3930a(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (C2992b.this.f9785g) {
                    C3359a.f11094h.m4021s().m3896d(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (C2992b.this.f9785g) {
                    C3359a.f11094h.m4021s().m3897d(motionEvent);
                    C2992b.this.templeteShow();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                if (C2992b.this.f9785g) {
                    C2992b.this.templeteHide();
                }
            }
        });
        this.f9784f.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
    }

    /* renamed from: a */
    private void m3842a(boolean z) {
        this.f9785g = z;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onMenuChanged(AbstractC2580c abstractC2580c) {
        m3842a(abstractC2580c instanceof C2999c);
        if (abstractC2580c instanceof C2991a) {
            m3841b();
        } else {
            m3839c();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onShow() {
        C3359a.f11089c.m2241d();
        C3398f.m2642b();
        C3359a.f11096j.m2223b(this.f9784f);
        C3359a.f11096j.m2232a(this.f9784f);
        this.f9784f.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onHide() {
        C3359a.f11089c.m2240e();
        C3398f.m2637c();
        m3839c();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onHideComplete() {
        C3359a.f11096j.m2223b(this.f9784f);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f9784f.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
        m3837d();
    }

    /* renamed from: a */
    public AbstractC3208b m3844a() {
        m3836e();
        return this.f9787i;
    }

    /* renamed from: d */
    private void m3837d() {
        if (this.f9786h != null) {
            this.f9786h.position().f2527y = C0892a.f2551B - ((C0892a.f2554E - getHeight()) / 2.0f);
        }
    }

    /* renamed from: b */
    public void m3841b() {
        if (!this.f9789k) {
            m3836e();
            this.f9789k = true;
            m3837d();
            C3359a.f11089c.m2250a(this.f9788j);
        } else {
            AbstractC2580c currentMenuItem = getCurrentMenuItem();
            if (currentMenuItem != null && (currentMenuItem instanceof C2991a)) {
                ((C2991a) currentMenuItem).mo3828c();
            }
        }
        AbstractC2580c currentMenuItem2 = getCurrentMenuItem();
        if (currentMenuItem2 != null && (currentMenuItem2 instanceof C2991a)) {
            C2991a c2991a = (C2991a) currentMenuItem2;
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(c2991a.mo3831a() + 0.0f);
            c1017d.mo10298h(c2991a.mo3829b() + 0.0f);
            C1014c.m10326a(this.f9787i);
            C1014c.m10325a(this.f9787i, 250, c1017d);
        }
    }

    /* renamed from: e */
    private void m3836e() {
        if (this.f9787i == null) {
            C3377f m2769b = C3444a.m2356c().m2769b(new ComponentName(C0853a.m10856d().getPackageName(), ShellActivity.class.getName()));
            TextureElement textureElement = m2769b.f11171d;
            if (textureElement.f2529id == 0) {
                m2769b.m2696f();
            }
            this.f9787i = new C3224h() { // from class: com.tsf.shell.f.g.a.b.2

                /* renamed from: a */
                C2411d f9791a;

                @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
                public void onDrawChildStart() {
                    super.onDrawChildStart();
                    this.f9791a = null;
                    if (C2992b.this.f9783e == C2992b.this.getCurrentMenuItem()) {
                        this.f9791a = C3359a.f11108v.f7773f.m4343h();
                        this.f9791a.mo5610a(this);
                    }
                }

                @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.censivn.C3DEngine.p031b.p038f.C0980j
                public void onDrawChildEnd() {
                    super.onDrawChildEnd();
                    if (this.f9791a != null) {
                        this.f9791a.mo5608b(this);
                    }
                }
            };
            this.f9786h = new C0980j();
            this.f9786h.addChild(this.f9787i);
            this.f9787i.f10495k.textures().addElement(textureElement);
            this.f9787i.setMouseEventListener(new C0937a(this.f9787i) { // from class: com.tsf.shell.f.g.a.b.3
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: e */
                public void mo1654e(MotionEvent motionEvent) {
                    C2992b.this.f9787i.m3151aQ();
                }
            });
            this.f9788j = new Runnable() { // from class: com.tsf.shell.f.g.a.b.4
                @Override // java.lang.Runnable
                public void run() {
                    if (C2992b.this.f9786h.parent() == null) {
                        C2992b.this.f9787i.scale().setAll(0.0f, 0.0f, 1.0f);
                    }
                    C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.g.a.b.4.1
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            AbstractC2580c currentMenuItem = C2992b.this.getCurrentMenuItem();
                            if (currentMenuItem != null && (currentMenuItem instanceof C2991a)) {
                                ((C2991a) currentMenuItem).mo3828c();
                            }
                        }
                    };
                    c1017d.m10294l(1.0f);
                    c1017d.m10293m(1.0f);
                    c1017d.m10313a(C0986a.f2950e);
                    C1014c.m10326a(C2992b.this.f9787i);
                    C1014c.m10325a(C2992b.this.f9787i, 360, c1017d);
                    C2992b.this.f9786h.removeFromParent();
                    C3359a.f11096j.m2232a(C2992b.this.f9786h);
                }
            };
        }
    }

    /* renamed from: c */
    public void m3839c() {
        if (this.f9786h != null && this.f9789k) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.g.a.b.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3359a.f11096j.m2223b(C2992b.this.f9786h);
                }
            };
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            C1014c.m10326a(this.f9787i);
            C1014c.m10325a(this.f9787i, 250, c1017d);
            this.f9786h.removeFromParent();
            C3359a.f11096j.m2232a(this.f9786h);
            C3359a.f11089c.m2244b((Runnable) null, true);
        }
        this.f9789k = false;
    }
}
