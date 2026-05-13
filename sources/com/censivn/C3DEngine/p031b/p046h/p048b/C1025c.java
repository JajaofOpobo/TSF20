package com.censivn.C3DEngine.p031b.p046h.p048b;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.p096f.p118e.p123d.p124a.C2516c;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.h.b.c */
/* loaded from: classes.dex */
public class C1025c extends C0980j implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a, InterfaceC1034d, C3105a.InterfaceC3106a {

    /* renamed from: Q */
    private static C0980j f3088Q;

    /* renamed from: R */
    private static C2516c.C2522a f3089R;

    /* renamed from: A */
    private Number3d f3090A;

    /* renamed from: B */
    private Number3d f3091B;

    /* renamed from: C */
    private Number3d f3092C;

    /* renamed from: D */
    private Number3d f3093D;

    /* renamed from: E */
    private Number3d f3094E;

    /* renamed from: F */
    private Number3d f3095F;

    /* renamed from: G */
    private float f3096G;

    /* renamed from: H */
    private float f3097H;

    /* renamed from: I */
    private int f3098I;

    /* renamed from: J */
    private int f3099J;

    /* renamed from: K */
    private int f3100K;

    /* renamed from: L */
    private int f3101L;

    /* renamed from: M */
    private boolean f3102M;

    /* renamed from: N */
    private boolean f3103N;

    /* renamed from: O */
    private C2932g f3104O;

    /* renamed from: P */
    private C1033a f3105P;

    /* renamed from: a */
    private C0980j f3106a;

    /* renamed from: b */
    private C0981k f3107b;

    /* renamed from: c */
    private C0981k f3108c;

    /* renamed from: d */
    private C0980j f3109d;

    /* renamed from: e */
    private TextureElement f3110e;

    /* renamed from: f */
    private TextureElement f3111f;

    /* renamed from: g */
    private C0937a f3112g;

    /* renamed from: h */
    private C1035e f3113h;

    /* renamed from: i */
    private C3105a f3114i;

    /* renamed from: j */
    private ArrayList<Number3d> f3115j;

    /* renamed from: k */
    private float f3116k;

    /* renamed from: l */
    private float f3117l;

    /* renamed from: m */
    private boolean f3118m;

    /* renamed from: n */
    private boolean f3119n;

    /* renamed from: o */
    private Number3d f3120o;

    /* renamed from: p */
    private Number3d f3121p;

    /* renamed from: q */
    private Number3d f3122q;

    /* renamed from: r */
    private Number3d f3123r;

    /* renamed from: s */
    private Number3d f3124s;

    /* renamed from: t */
    private Number3d f3125t;

    /* renamed from: u */
    private Number3d f3126u;

    /* renamed from: v */
    private Number3d f3127v;

    /* renamed from: w */
    private Number3d f3128w;

    /* renamed from: x */
    private Number3d f3129x;

    /* renamed from: y */
    private Number3d f3130y;

    /* renamed from: z */
    private Number3d f3131z;

    /* renamed from: com.censivn.C3DEngine.b.h.b.c$a */
    /* loaded from: classes.dex */
    public static class C1033a {
        /* renamed from: a */
        public void mo1841a() {
        }
    }

    public C1025c(C2932g c2932g, boolean z) {
        this(c2932g, z, null);
    }

    public C1025c(C2932g c2932g, boolean z, C1033a c1033a) {
        this.f3116k = 0.0f;
        this.f3117l = 0.0f;
        this.f3118m = false;
        this.f3119n = false;
        this.f3102M = false;
        this.f3103N = true;
        this.f3104O = c2932g;
        this.f3105P = c1033a;
        m10257a(z);
        this.f3104O.m4229a(this);
        C3359a.f11088b.m10565a(this);
        C3359a.f11094h.m4100a().m2284b();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (!this.f3103N && !this.f3119n) {
            this.f3106a.position().f2526x += (this.f3116k - this.f3106a.position().f2526x) * 0.36f;
            this.f3106a.position().f2527y += (this.f3117l - this.f3106a.position().f2527y) * 0.36f;
            if (Math.abs(this.f3106a.position().f2526x - this.f3116k) < 0.2f && Math.abs(this.f3106a.position().f2527y - this.f3117l) < 0.2f) {
                this.f3106a.position().f2526x = this.f3116k;
                this.f3106a.position().f2527y = this.f3117l;
                this.f3103N = true;
            }
        }
        if (this.f3102M && !this.f3119n) {
            m10243g();
        }
    }

    /* renamed from: a */
    private void m10257a(boolean z) {
        this.f3096G = 32.0f * C0892a.f2565a;
        this.f3097H = 32.0f * C0892a.f2565a;
        this.f3094E = new Number3d();
        this.f3095F = new Number3d();
        this.f3106a = this;
        this.f3115j = new ArrayList<>();
        int m10742a = (int) C0892a.m10742a(128.0f);
        this.f3110e = ThemeManager.mix.interactiveArrange.getTextureElement(ThemeShellDescription.INTERACTIVE_ARRANGE_BG, m10742a, m10742a);
        this.f3107b = new C0981k(128.0f, 128.0f, 3, 3) { // from class: com.censivn.C3DEngine.b.h.b.c.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                if (C1025c.this.f3114i.m3563e()) {
                    C1025c.this.f3114i.m3561g();
                }
                C1025c.this.m10248d();
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void calAABB() {
                super.calAABB();
            }
        };
        this.f3107b.textures().addElement(this.f3110e);
        this.f3107b.useVBO(false);
        this.f3107b.setAnimationObjectState(true);
        this.f3107b.mouseAreaDynamic(true);
        this.f3112g = new C0937a(this.f3107b) { // from class: com.censivn.C3DEngine.b.h.b.c.2

            /* renamed from: a */
            boolean f3133a = false;

            /* renamed from: d */
            private float f3135d;

            /* renamed from: e */
            private float f3136e;

            /* renamed from: f */
            private float f3137f;

            /* renamed from: g */
            private float f3138g;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f3133a = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!C1025c.this.f3119n) {
                    if (!this.f3133a) {
                        if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 10.0f) {
                            this.f3137f = motionEvent2.getX();
                            this.f3138g = motionEvent2.getY();
                            this.f3135d = C1025c.this.f3106a.position().f2526x;
                            this.f3136e = C1025c.this.f3106a.position().f2527y;
                            this.f3133a = true;
                            return;
                        }
                        return;
                    }
                    float x = (int) (this.f3135d + (motionEvent2.getX() - this.f3137f));
                    float y = (int) (this.f3136e - (motionEvent2.getY() - this.f3138g));
                    if (C1025c.this.f3095F.f2526x + x > C0892a.f2550A) {
                        this.f3135d -= (x + C1025c.this.f3095F.f2526x) - C0892a.f2550A;
                        x = (int) (C0892a.f2550A - C1025c.this.f3095F.f2526x);
                    } else if (C1025c.this.f3094E.f2526x + x < C0892a.f2590z) {
                        this.f3135d = (C0892a.f2590z - (x + C1025c.this.f3094E.f2526x)) + this.f3135d;
                        x = (int) (C0892a.f2590z - C1025c.this.f3094E.f2526x);
                    }
                    if (C1025c.this.f3094E.f2527y + y > C0892a.f2551B) {
                        this.f3136e -= (y + C1025c.this.f3094E.f2527y) - C0892a.f2551B;
                        y = (int) (C0892a.f2551B - C1025c.this.f3094E.f2527y);
                    } else if (C1025c.this.f3095F.f2527y + y < C0892a.f2552C) {
                        this.f3136e = (C0892a.f2552C - (y + C1025c.this.f3095F.f2527y)) + this.f3136e;
                        y = (int) (C0892a.f2552C - C1025c.this.f3095F.f2527y);
                    }
                    C1025c.this.f3103N = false;
                    C1025c.this.f3116k = x;
                    C1025c.this.f3117l = y;
                }
            }
        };
        this.f3107b.setMouseEventListener(this.f3112g);
        this.f3120o = this.f3107b.points().getAsNumber3dPX(13);
        this.f3121p = this.f3107b.points().getAsNumber3dPX(9);
        this.f3122q = this.f3107b.points().getAsNumber3dPX(5);
        this.f3123r = this.f3107b.points().getAsNumber3dPX(1);
        this.f3124s = this.f3107b.points().getAsNumber3dPX(12);
        this.f3125t = this.f3107b.points().getAsNumber3dPX(8);
        this.f3126u = this.f3107b.points().getAsNumber3dPX(4);
        this.f3128w = this.f3107b.points().getAsNumber3dPX(2);
        this.f3129x = this.f3107b.points().getAsNumber3dPX(3);
        this.f3130y = this.f3107b.points().getAsNumber3dPX(6);
        this.f3131z = this.f3107b.points().getAsNumber3dPX(7);
        this.f3090A = this.f3107b.points().getAsNumber3dPX(10);
        this.f3091B = this.f3107b.points().getAsNumber3dPX(11);
        this.f3092C = this.f3107b.points().getAsNumber3dPX(14);
        this.f3093D = this.f3107b.points().getAsNumber3dPX(15);
        this.f3127v = this.f3107b.points().getAsNumber3dPX(0);
        addChild(this.f3107b);
        this.f3113h = new C1035e() { // from class: com.censivn.C3DEngine.b.h.b.c.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1035e
            /* renamed from: a */
            public void mo10214a(MotionEvent motionEvent) {
                m10193e(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1035e
            /* renamed from: b */
            public void mo10203b(MotionEvent motionEvent) {
                C3112b e = m10193e(motionEvent);
                if (e != null && C1025c.this.f3114i.m3563e()) {
                    ((C3231c) e).m3067ap();
                }
            }
        };
        this.f3114i = new C3105a(this, this) { // from class: com.censivn.C3DEngine.b.h.b.c.4
            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: a */
            public void mo3302a() {
                C1025c.this.m10245f();
            }
        };
        this.f3113h.getMouseEventListener().f2740c = this.f3107b;
        this.f3113h.m10213a(this);
        this.f3109d = this.f3113h.m10205b();
        addChild(this.f3113h);
        this.f3111f = ThemeManager.mix.interactiveArrange.getTextureElement(ThemeShellDescription.INTERACTIVE_ARRANGE_SCALE_BUTTON, C3489a.f11514a, C3489a.f11514a);
        this.f3108c = new C0981k(C3489a.f11514a, C3489a.f11514a, false);
        this.f3108c.textures().addElement(this.f3111f);
        this.f3108c.calAABB(1.3f, 1.3f, 1.0f);
        this.f3108c.setMouseEventListener(new C0937a(this.f3107b) { // from class: com.censivn.C3DEngine.b.h.b.c.5

            /* renamed from: b */
            private boolean f3142b = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C1025c.this.f3100K = C1025c.this.f3098I;
                C1025c.this.f3101L = C1025c.this.f3099J;
                C1025c.this.f3102M = true;
                this.f3142b = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C1025c.this.f3102M = false;
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f3142b) {
                    if (C1025c.this.f3102M) {
                        float[] m601a = C4189x.m601a(motionEvent2);
                        C1025c.this.f3100K = (int) (m601a[0] - C1025c.this.f3106a.position().f2526x);
                        C1025c.this.f3101L = (int) (m601a[1] - C1025c.this.f3106a.position().f2527y);
                    }
                } else if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                    this.f3142b = true;
                }
            }
        });
        addChild(this.f3108c);
        if (z) {
            this.f3107b.setFocus();
        }
        C0915b.m10597a(this);
        if (f3088Q == null) {
            f3088Q = new C0980j();
            C2516c.C2523b c2523b = new C2516c.C2523b();
            c2523b.f8372a = C0892a.m10742a(-130.0f);
            c2523b.f8373b = C0892a.m10742a(128.0f);
            c2523b.f8374c = C0892a.m10742a(50.0f);
            c2523b.f8375d = 0.0f;
            c2523b.f8376e = 38;
            c2523b.f8377f = C0892a.m10742a(54.0f);
            c2523b.f8378g = 0;
            f3089R = new C2516c.C2522a(C1306b.C1315i.menu_multiple_choice, C1306b.C1310d.widget_folder_multi_choice, c2523b);
            f3088Q.addChild(f3089R);
        }
        f3089R.setMouseEventListener(new C0937a(this.f3107b) { // from class: com.censivn.C3DEngine.b.h.b.c.6
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C1025c.this.m10266a();
            }
        });
        f3089R.alpha(0.0f);
        f3088Q.removeFromParent();
        m10245f();
        addChild(f3088Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m10245f() {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(f3089R);
        C1014c.m10325a(f3089R, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: b */
    private void m10256b(int i) {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(i);
        C1014c.m10326a(f3089R);
        C1014c.m10325a(f3089R, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: a */
    public void m10266a() {
        if (this.f3114i.m3563e()) {
            this.f3114i.m3561g();
            m10245f();
            return;
        }
        this.f3114i.m3562f();
        m10256b(100);
    }

    @Override // com.tsf.shell.p096f.p153i.C3105a.InterfaceC3106a
    /* renamed from: b */
    public ArrayList<C0975i> mo2100b() {
        return this.f3113h.m10205b().children();
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m10248d();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: g */
    private void m10243g() {
        this.f3098I = (int) (this.f3098I + ((this.f3100K - this.f3098I) * 0.36f));
        this.f3099J = (int) (this.f3099J + ((this.f3101L - this.f3099J) * 0.36f));
        if (this.f3106a.position().f2526x == 0.0f && this.f3106a.position().f2527y == 0.0f) {
            if (this.f3099J < C0892a.f2552C) {
                this.f3099J = C0892a.f2552C;
            }
            if (this.f3098I > C0892a.f2550A) {
                this.f3098I = C0892a.f2550A;
            }
            m10265a(this.f3098I, -this.f3099J);
        } else {
            if (this.f3099J + this.f3106a.position().f2527y < C0892a.f2552C) {
                this.f3099J = (int) (C0892a.f2552C + this.f3106a.position().f2527y);
            }
            if (this.f3098I + this.f3106a.position().f2526x > C0892a.f2550A) {
                this.f3098I = (int) (C0892a.f2550A - this.f3106a.position().f2526x);
            }
            m10255b(this.f3098I, -this.f3099J);
        }
        m10241h();
    }

    /* renamed from: a */
    public void m10259a(C3112b c3112b) {
        this.f3115j.add(c3112b.position().m13946clone());
        C1017d c1017d = new C1017d();
        c1017d.m10303e(0.0f);
        C1014c.m10325a(c3112b, 500, c1017d);
        c3112b.mo3462a(this.f3114i);
        this.f3113h.m10212a(c3112b);
        m10241h();
    }

    /* renamed from: a */
    public void m10258a(ArrayList<C3112b> arrayList) {
        Iterator<C3112b> it = arrayList.iterator();
        while (it.hasNext()) {
            C3112b next = it.next();
            this.f3115j.add(next.position().m13946clone());
            C1017d c1017d = new C1017d();
            c1017d.m10303e(0.0f);
            C1014c.m10325a(next, 500, c1017d);
            next.mo3462a(this.f3114i);
        }
        this.f3113h.m10201b(arrayList);
        m10241h();
    }

    /* renamed from: h */
    private void m10241h() {
        int i;
        int i2;
        int round;
        float f;
        this.f3094E.f2526x = this.f3107b.points().pxX(15);
        this.f3094E.f2527y = this.f3107b.points().pxY(15);
        this.f3095F.f2526x = this.f3107b.points().pxX(0);
        this.f3095F.f2527y = this.f3107b.points().pxY(0);
        int i3 = 2;
        int i4 = (int) (this.f3095F.f2526x - this.f3094E.f2526x);
        int i5 = (int) (this.f3094E.f2527y - this.f3095F.f2527y);
        int size = this.f3115j.size();
        if (size < 2) {
            i2 = 2;
            i = 2;
        } else if (i4 / (size - 1) > 130.0f * C0892a.f2565a || i5 / (size - 1) > 130.0f * C0892a.f2565a) {
            if (i4 > i5 / 2) {
                int i6 = 2;
                while (i4 / (i6 - 1) > 130.0f * C0892a.f2565a && i6 < size) {
                    i6++;
                }
                if (size % i6 == 0) {
                    i2 = i6;
                    i = size / i6;
                } else {
                    i2 = i6;
                    i = (size / i6) + 1;
                }
            } else {
                i = 2;
                while (i5 / (i - 1) > 130.0f * C0892a.f2565a && i < size) {
                    i++;
                }
                if (size % i == 0) {
                    i2 = size / i;
                } else {
                    i2 = (size / i) + 1;
                }
            }
        } else {
            if (i4 > i5) {
                round = (int) Math.round(i4 / i5);
            } else {
                round = (int) Math.round(i5 / i4);
            }
            while (true) {
                if (i4 > i5) {
                    i2 = i3 * round;
                    i = i3;
                } else {
                    i = i3 * round;
                    i2 = i3;
                }
                if (i2 * i >= size) {
                    break;
                }
                i3++;
            }
            if (round != 1) {
                if (i4 > i5) {
                    while ((i2 - 1) * i >= size && i2 != 2) {
                        i2--;
                    }
                } else {
                    while ((i - 1) * i2 >= size && i != 2) {
                        i--;
                    }
                }
            } else if (i5 > i4) {
                while ((i2 - 1) * i >= size && i2 != 2) {
                    i2--;
                }
            } else {
                while ((i - 1) * i2 >= size && i != 2) {
                    i--;
                }
            }
        }
        int i7 = (int) (60.0f * C0892a.f2565a);
        int i8 = (int) (68.0f * C0892a.f2565a);
        if (i2 == 1) {
            f = 0.0f;
        } else {
            f = (i4 - (i7 * 2)) / (i2 - 1);
        }
        float f2 = 0.0f;
        if (i != 1) {
            f2 = (i5 - (i8 * 2)) / (i - 1);
        }
        int i9 = (int) (this.f3094E.f2526x + i7);
        int i10 = (int) (this.f3094E.f2527y - i8);
        for (int i11 = 0; i11 < size; i11++) {
            Number3d number3d = this.f3115j.get(i11);
            number3d.f2526x = ((i11 % i2) * f) + i9;
            number3d.f2527y = i10 - ((i11 / i2) * f2);
        }
        this.f3113h.m10208a(this.f3115j);
        this.f3113h.m10216a((int) this.f3094E.f2526x, (int) this.f3095F.f2527y, (int) this.f3095F.f2526x, (int) this.f3094E.f2527y);
    }

    /* renamed from: c */
    public void m10250c() {
        int i;
        if (400 > C0892a.f2553D) {
            i = (C0892a.f2553D / 2) - 20;
        } else {
            i = VEasing.Back.easeIn;
        }
        m10265a(i, i);
    }

    /* renamed from: a */
    public void m10265a(int i, int i2) {
        this.f3098I = i;
        this.f3099J = -i2;
        if (i < C0892a.f2565a * 64.0f) {
            i = (int) (C0892a.f2565a * 64.0f);
        }
        if (i2 < C0892a.f2565a * 64.0f) {
            i2 = (int) (C0892a.f2565a * 64.0f);
        }
        int i3 = i - (((int) (C0892a.f2565a * 128.0f)) / 2);
        int i4 = i2 - (((int) (C0892a.f2565a * 128.0f)) / 2);
        this.f3108c.position().f2526x = i - this.f3096G;
        this.f3108c.position().f2527y = (-i2) + this.f3097H;
        f3088Q.position().f2526x = 0.0f;
        f3088Q.position().f2527y = this.f3108c.position().f2527y - C0892a.m10742a(100.0f);
        this.f3107b.points().pxX(13, this.f3120o.f2526x + i3);
        this.f3107b.points().pxX(9, this.f3121p.f2526x + i3);
        this.f3107b.points().pxX(5, this.f3122q.f2526x + i3);
        this.f3107b.points().pxX(1, this.f3123r.f2526x + i3);
        this.f3107b.points().pxX(12, this.f3124s.f2526x + i3);
        this.f3107b.points().pxX(8, this.f3125t.f2526x + i3);
        this.f3107b.points().pxX(4, this.f3126u.f2526x + i3);
        this.f3107b.points().pxX(0, this.f3127v.f2526x + i3);
        this.f3107b.points().pxY(0, this.f3127v.f2527y - i4);
        this.f3107b.points().pxY(1, this.f3123r.f2527y - i4);
        this.f3107b.points().pxY(2, this.f3128w.f2527y - i4);
        this.f3107b.points().pxY(3, this.f3129x.f2527y - i4);
        this.f3107b.points().pxY(4, this.f3126u.f2527y - i4);
        this.f3107b.points().pxY(5, this.f3122q.f2527y - i4);
        this.f3107b.points().pxY(6, this.f3130y.f2527y - i4);
        this.f3107b.points().pxY(7, this.f3131z.f2527y - i4);
        this.f3107b.points().pxX(2, this.f3128w.f2526x - i3);
        this.f3107b.points().pxX(6, this.f3130y.f2526x - i3);
        this.f3107b.points().pxX(10, this.f3090A.f2526x - i3);
        this.f3107b.points().pxX(14, this.f3092C.f2526x - i3);
        this.f3107b.points().pxX(3, this.f3129x.f2526x - i3);
        this.f3107b.points().pxX(7, this.f3131z.f2526x - i3);
        this.f3107b.points().pxX(11, this.f3091B.f2526x - i3);
        this.f3107b.points().pxX(15, this.f3093D.f2526x - i3);
        this.f3107b.points().pxY(8, this.f3125t.f2527y + i4);
        this.f3107b.points().pxY(9, this.f3121p.f2527y + i4);
        this.f3107b.points().pxY(10, this.f3090A.f2527y + i4);
        this.f3107b.points().pxY(11, this.f3091B.f2527y + i4);
        this.f3107b.points().pxY(12, this.f3124s.f2527y + i4);
        this.f3107b.points().pxY(13, this.f3120o.f2527y + i4);
        this.f3107b.points().pxY(14, this.f3092C.f2527y + i4);
        this.f3107b.points().pxY(15, i4 + this.f3093D.f2527y);
    }

    /* renamed from: b */
    private void m10255b(int i, int i2) {
        float f = i - ((C0892a.f2565a * 128.0f) / 2.0f);
        float f2 = i2 - ((C0892a.f2565a * 128.0f) / 2.0f);
        if ((this.f3127v.f2526x + f) - this.f3107b.points().pxX(15) < C0892a.f2565a * 128.0f) {
            f = ((C0892a.f2565a * 128.0f) + this.f3107b.points().pxX(15)) - this.f3127v.f2526x;
        }
        if ((this.f3107b.points().pxY(15) - this.f3127v.f2527y) + f2 < C0892a.f2565a * 128.0f) {
            f2 = ((C0892a.f2565a * 128.0f) - this.f3107b.points().pxY(15)) + this.f3127v.f2527y;
        }
        this.f3108c.position().f2526x = this.f3096G + f;
        this.f3108c.position().f2527y = (-this.f3097H) - f2;
        f3088Q.position().f2526x = (this.f3107b.points().pxX(15) + this.f3107b.points().pxX(0)) / 2.0f;
        f3088Q.position().f2527y = this.f3108c.position().f2527y - C0892a.m10742a(100.0f);
        this.f3107b.points().pxX(13, this.f3120o.f2526x + f);
        this.f3107b.points().pxX(9, this.f3121p.f2526x + f);
        this.f3107b.points().pxX(5, this.f3122q.f2526x + f);
        this.f3107b.points().pxX(1, this.f3123r.f2526x + f);
        this.f3107b.points().pxX(12, this.f3124s.f2526x + f);
        this.f3107b.points().pxX(8, this.f3125t.f2526x + f);
        this.f3107b.points().pxX(4, this.f3126u.f2526x + f);
        this.f3107b.points().pxX(0, f + this.f3127v.f2526x);
        this.f3107b.points().pxY(0, this.f3127v.f2527y - f2);
        this.f3107b.points().pxY(1, this.f3123r.f2527y - f2);
        this.f3107b.points().pxY(2, this.f3128w.f2527y - f2);
        this.f3107b.points().pxY(3, this.f3129x.f2527y - f2);
        this.f3107b.points().pxY(4, this.f3126u.f2527y - f2);
        this.f3107b.points().pxY(5, this.f3122q.f2527y - f2);
        this.f3107b.points().pxY(6, this.f3130y.f2527y - f2);
        this.f3107b.points().pxY(7, this.f3131z.f2527y - f2);
    }

    /* renamed from: d */
    public void m10248d() {
        if (!this.f3119n && !this.f3118m) {
            m10256b(0);
            C0915b.m10594b(this);
            C3359a.f11088b.m10557b(this);
            C3359a.f11094h.m4100a().m2282c();
            this.f3114i.m3561g();
            this.f3119n = true;
            float f = this.f3106a.position().f2526x;
            float f2 = this.f3106a.position().f2527y;
            Iterator<C0975i> it = this.f3113h.m10200c().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                next.position().f2526x += f;
                next.position().f2527y += f2;
                next.mouseEnabled(true);
                next.removeFromParent();
                this.f3104O.m4229a(next);
                ((C3112b) next).m3514ad();
            }
            this.f3115j.clear();
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.h.b.c.7
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f3) {
                    C1025c.this.f3108c.alpha(C1025c.this.f3107b.alpha());
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1025c.this.f3106a.destroy();
                    C1025c.this.f3107b.destroy();
                    C1025c.this.f3108c.destroy();
                    C1025c.this.f3113h.destroy();
                    C1025c.this.f3104O = null;
                    C0853a.m10853g().m10543a(C1025c.this.f3110e);
                    C0853a.m10853g().m10543a(C1025c.this.f3111f);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f3107b);
            C1014c.m10325a(this.f3107b, 300, c1017d);
            AbstractC2593d.onTempleteShow();
            if (this.f3105P != null) {
                this.f3105P.mo1841a();
                this.f3105P = null;
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: e */
    public void mo10222e() {
        PositionNumber3d position;
        PositionNumber3d position2;
        if (!this.f3118m) {
            int numChildren = this.f3109d.numChildren();
            for (int i = 0; i < numChildren; i++) {
                C0975i childAt = this.f3109d.getChildAt(i);
                Number3d number3d = this.f3115j.get(i);
                childAt.position().f2526x = (float) (position.f2526x + ((number3d.f2526x - childAt.position().f2526x) * 0.2d));
                childAt.position().f2527y = (float) (position2.f2527y + ((number3d.f2527y - childAt.position().f2527y) * 0.2d));
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: a */
    public void mo10231a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f3112g.mo2129a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: a */
    public void mo10232a(MotionEvent motionEvent) {
        this.f3112g.mo1654e(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: b */
    public void mo10228b(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: c */
    public void mo10226c(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: b */
    public void mo10227b(C3112b c3112b) {
        this.f3118m = true;
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: c */
    public void mo10225c(C3112b c3112b) {
        this.f3118m = false;
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: a */
    public void mo10230a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: a */
    public boolean mo10233a(int i) {
        return false;
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: d */
    public void mo10223d(C3112b c3112b) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: d */
    public void mo10224d(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: e */
    public void mo10221e(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: f */
    public void mo10219f(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: e */
    public void mo10220e(C3112b c3112b) {
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p048b.InterfaceC1034d
    /* renamed from: a */
    public void mo10229a(C3112b c3112b, Number3d number3d) {
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        if (!this.f3119n) {
            m10250c();
            m10241h();
            this.f3103N = false;
            this.f3116k = 0.0f;
            this.f3117l = 0.0f;
        }
    }
}
