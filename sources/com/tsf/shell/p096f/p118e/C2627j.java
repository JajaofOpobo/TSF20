package com.tsf.shell.p096f.p118e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4189x;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.j */
/* loaded from: classes.dex */
public class C2627j extends C0980j {

    /* renamed from: d */
    private C0962a f8649d;

    /* renamed from: e */
    private C0964b f8650e;

    /* renamed from: k */
    private TextureElement f8656k;

    /* renamed from: l */
    private C2634a f8657l;

    /* renamed from: m */
    private C2634a f8658m;

    /* renamed from: n */
    private C2634a f8659n;

    /* renamed from: a */
    private int f8646a = 50;

    /* renamed from: b */
    private int f8647b = 0;

    /* renamed from: f */
    private int f8651f = -1;

    /* renamed from: g */
    private boolean f8652g = true;

    /* renamed from: h */
    private boolean f8653h = false;

    /* renamed from: p */
    private boolean f8661p = false;

    /* renamed from: q */
    private C1013b f8662q = new C1013b();

    /* renamed from: i */
    private float f8654i = C0892a.f2567c * 100.0f;

    /* renamed from: j */
    private float f8655j = C0892a.f2567c * 100.0f;

    /* renamed from: c */
    private TextureElement f8648c = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_PREVIEW_INDICATOR, C3489a.f11525l, C3489a.f11525l);

    /* renamed from: o */
    private C2652r f8660o = new C2652r();

    public C2627j(final boolean z) {
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.e.j.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (z) {
                    if (C2627j.this.f8661p) {
                        if (C2627j.this.f8653h) {
                            C3359a.f11094h.m4021s().m3903c(motionEvent, motionEvent2, 0.0f, 0.0f);
                            return;
                        } else {
                            C3359a.f11094h.m4021s().m3931a(motionEvent, motionEvent2);
                            return;
                        }
                    }
                    C3359a.f11094h.m4021s().m3903c(motionEvent, motionEvent2, 0.0f, 0.0f);
                    if (C3359a.f11094h.m4021s().m3888f()) {
                        if (C3359a.f11094h.m4021s().m3884g()) {
                            C2627j.this.f8653h = true;
                        } else {
                            C2627j.this.f8653h = false;
                        }
                        C2627j.this.f8661p = true;
                        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.e.j.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (C2627j.this.f8653h) {
                                    C2627j.this.m5115c();
                                    return;
                                }
                                C2627j.this.m5112d();
                                C3359a.f11094h.m4021s().m3892e();
                            }
                        });
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                if (z) {
                    C2627j.this.m5120b();
                    C3359a.f11094h.m4085a(true);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                if (z) {
                    if (C2627j.this.f8661p && !C2627j.this.f8653h) {
                        C3359a.f11094h.m4021s().m3932a(motionEvent);
                    }
                    C3359a.f11094h.m4021s().m3897d(motionEvent);
                    C2627j.this.f8661p = false;
                    C2627j.this.m5109e();
                    C3359a.f11094h.m4045g();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (z && C2627j.this.f8661p && !C2627j.this.f8653h) {
                    C3359a.f11094h.m4021s().m3913b(motionEvent, motionEvent2, f, f2);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2627j.this.mo4003a();
            }
        });
        this.f8656k = C4189x.m592b(C1306b.C1310d.dock_operation_border_point, C3489a.f11526m, C3489a.f11527n);
        this.f8659n = new C2634a(C3489a.f11526m, C3489a.f11527n, false, this.f8656k, this.f8654i);
        this.f8657l = new C2634a(C3489a.f11526m, C3489a.f11527n, false, this.f8656k, this.f8655j);
        this.f8657l.rotation().f2528z = 90.0f;
        this.f8658m = new C2634a(C3489a.f11526m, C3489a.f11527n, false, this.f8656k, this.f8655j);
        this.f8658m.rotation().f2528z = -90.0f;
    }

    /* renamed from: a */
    public void mo4003a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5120b() {
        this.f8657l.m5105a();
        this.f8658m.m5105a();
        this.f8659n.m5105a();
        this.f8660o.m5061a(this.f8651f + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5115c() {
        this.f8659n.m5103b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5112d() {
        this.f8657l.m5103b();
        this.f8658m.m5103b();
        this.f8660o.m5062a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5109e() {
        m5115c();
        m5112d();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        int i;
        if (this.f8661p && this.f8653h) {
            float f = 2.1474836E9f;
            int i2 = 1;
            Iterator<C0975i> it = C3359a.f11094h.m4017u().children().iterator();
            while (true) {
                float f2 = f;
                i = i2;
                if (!it.hasNext()) {
                    break;
                }
                C0975i next = it.next();
                if (next instanceof C2932g) {
                    C2932g c2932g = (C2932g) next;
                    float abs = Math.abs(c2932g.f9541g);
                    if (abs < f2) {
                        i2 = c2932g.m4183r();
                        f = abs;
                    }
                }
                i2 = i;
                f = f2;
            }
            if (this.f8651f != i - 1) {
                this.f8660o.m5056b(i);
            }
            m5119b(i - 1);
        }
    }

    /* renamed from: a */
    public void m5124a(int i) {
        if (this.f8649d != null) {
            this.f8649d.destroy();
        }
        this.f8647b = i;
        this.f8650e = null;
        float f = 0.0f - (((this.f8646a * C0892a.f2567c) * (i - 1)) / 2.0f);
        this.f8649d = new C0962a(i, 32, 32, 32);
        this.f8649d.useVBO(false);
        float f2 = f;
        for (int i2 = 0; i2 < i; i2++) {
            C0964b m10456a = this.f8649d.m10456a(i2);
            m10456a.f2853m.pxX(f2);
            m10456a.m10431b(C3489a.f11525l);
            m10456a.m10418d(C3489a.f11525l);
            m10456a.m10405k().setAll(0.4f, 0.4f, 1.0f);
            m10456a.m10439a(0, 0, 1, 1);
            m10456a.m10408h();
            f2 += this.f8646a * C0892a.f2567c;
        }
        this.f8649d.textures().addElement(this.f8648c);
        addChild(this.f8649d);
        if (!this.f8652g) {
            this.f8649d.alpha(0.0f);
        }
        if (this.f8651f < this.f8647b && this.f8651f > -1) {
            this.f8650e = this.f8649d.m10456a(this.f8651f);
        }
        setAABBPX(f - C0892a.m10742a(150.0f), C0892a.f2567c * (-55.0f), 0.0f, C0892a.m10742a(150.0f) + (-f), C0892a.f2567c * 55.0f, 0.0f);
        this.f8657l.position().f2526x = f - this.f8655j;
        this.f8658m.position().f2526x = (-f) + this.f8655j;
        this.f8659n.position().f2527y = this.f8654i;
        this.f8651f = -1;
    }

    /* renamed from: b */
    public void m5119b(int i) {
        if (i > -1 && i < this.f8647b) {
            if (this.f8651f != i) {
                if (this.f8650e != null) {
                    C1017d c1017d = new C1017d();
                    c1017d.m10294l(0.4f);
                    c1017d.m10293m(0.4f);
                    C1014c.m10326a(this.f8650e);
                    C1014c.m10325a(this.f8650e, 250, c1017d);
                }
                this.f8651f = i;
                this.f8650e = this.f8649d.m10456a(i);
                C1017d c1017d2 = new C1017d();
                c1017d2.m10294l(1.0f);
                c1017d2.m10293m(1.0f);
                C1014c.m10326a(this.f8650e);
                C1014c.m10325a(this.f8650e, 250, c1017d2);
            }
            if (!this.f8652g) {
                m5110d(true);
            }
        } else if (this.f8652g) {
            m5113c(true);
        }
    }

    /* renamed from: a */
    public void m5121a(final boolean z) {
        mouseEnabled(false);
        final float alpha = alpha();
        final float f = z ? 30.0f : 0.0f;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.j.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                C2627j.this.alpha(alpha + ((f - alpha) * f2));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (!z) {
                    C2627j.this.visible(false);
                }
            }
        };
        C1014c.m10326a(this.f8662q);
        C1014c.m10325a(this.f8662q, 300, c1017d);
    }

    /* renamed from: b */
    public void m5116b(boolean z) {
        if (this.f8652g) {
            mouseEnabled(true);
        }
        visible(true);
        final float alpha = alpha();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.j.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C2627j.this.alpha(alpha + ((255.0f - alpha) * f));
            }
        };
        C1014c.m10326a(this.f8662q);
        C1014c.m10325a(this.f8662q, 300, c1017d);
    }

    /* renamed from: c */
    public void m5113c(boolean z) {
        this.f8652g = false;
        mouseEnabled(false);
        C1014c.m10326a(this.f8649d);
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.j.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2627j.this.f8649d.visible(false);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10325a(this.f8649d, 600, c1017d);
            return;
        }
        this.f8649d.alpha(0.0f);
    }

    /* renamed from: d */
    public void m5110d(boolean z) {
        C1014c.m10326a(this.f8649d);
        this.f8652g = true;
        this.f8649d.visible(true);
        mouseEnabled(true);
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.j.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    C2627j.this.f8649d.visible(true);
                }
            };
            c1017d.m10314a(255);
            C1014c.m10325a(this.f8649d, 600, c1017d);
            return;
        }
        this.f8649d.alpha(255.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.e.j$a */
    /* loaded from: classes.dex */
    public class C2634a extends C0980j {

        /* renamed from: b */
        private float f8675b;

        /* renamed from: c */
        private C0981k f8676c;

        /* renamed from: d */
        private float f8677d;

        /* renamed from: e */
        private boolean f8678e = false;

        public C2634a(float f, float f2, boolean z, TextureElement textureElement, float f3) {
            this.f8677d = f3;
            this.f8676c = new C0981k(f, f2, z);
            this.f8676c.alpha(0.0f);
            PositionNumber3d position = this.f8676c.position();
            float f4 = -f3;
            this.f8675b = f4;
            position.f2527y = f4;
            this.f8676c.textures().addElement(textureElement);
            addChild(this.f8676c);
        }

        /* renamed from: a */
        public void m5105a() {
            if (!this.f8678e) {
                this.f8678e = true;
                C1017d c1017d = new C1017d();
                c1017d.m10314a(VEasing.Back.easeIn);
                c1017d.mo10298h(0.0f);
                C1014c.m10326a(this.f8676c);
                C1014c.m10325a(this.f8676c, 250, c1017d);
                removeFromParent();
                C2627j.this.addChild(this);
            }
        }

        /* renamed from: b */
        public void m5103b() {
            if (this.f8678e) {
                this.f8678e = false;
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.j.a.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2634a.this.f8676c.position().f2527y = C2634a.this.f8675b;
                        C2634a.this.removeFromParent();
                    }
                };
                c1017d.m10314a(0);
                c1017d.mo10298h(100.0f * C0892a.f2567c);
                C1014c.m10326a(this.f8676c);
                C1014c.m10325a(this.f8676c, 250, c1017d);
            }
        }
    }
}
