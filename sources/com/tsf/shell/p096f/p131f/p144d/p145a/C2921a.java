package com.tsf.shell.p096f.p131f.p144d.p145a;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.p096f.p131f.p144d.C2920a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.d.a.a */
/* loaded from: classes.dex */
public class C2921a implements InterfaceC2928b {

    /* renamed from: a */
    public int f9480a;

    /* renamed from: b */
    public int f9481b;

    /* renamed from: c */
    private C2951n f9482c;

    /* renamed from: d */
    private C2920a f9483d;

    /* renamed from: e */
    private C0980j f9484e;

    /* renamed from: f */
    private int f9485f;

    /* renamed from: g */
    private int f9486g;

    /* renamed from: h */
    private int f9487h;

    /* renamed from: i */
    private int f9488i;

    /* renamed from: j */
    private boolean f9489j;

    /* renamed from: k */
    private int f9490k;

    /* renamed from: l */
    private int f9491l;

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4295a() {
        if (this.f9484e.position().f2526x != this.f9488i) {
            C1014c.m10326a(this.f9484e);
            PositionNumber3d position = this.f9484e.position();
            position.f2526x = (float) (position.f2526x + ((this.f9488i - this.f9484e.position().f2526x) * 0.1d));
            this.f9484e.setAnimationObjectState(true);
            if (Math.abs(this.f9488i - this.f9484e.position().f2526x) < 0.01d) {
                this.f9484e.position().f2526x = this.f9488i;
                this.f9484e.setAnimationObjectState(false);
            }
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4285a(final C2932g c2932g, InterfaceC1012a interfaceC1012a) {
        C1014c.m10326a(interfaceC1012a);
        final float f = c2932g.rotation().f2527y;
        C1014c.m10325a(interfaceC1012a, 500, new C1017d() { // from class: com.tsf.shell.f.f.d.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                c2932g.rotation().f2527y = f + ((0.0f - f) * f2);
            }
        });
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: b */
    public void mo4281b(final C2932g c2932g, InterfaceC1012a interfaceC1012a) {
        final float f = c2932g.rotation().f2527y;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.d.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                c2932g.rotation().f2527y = f + ((50.0f - f) * f2);
            }
        };
        C1014c.m10326a(interfaceC1012a);
        C1014c.m10325a(interfaceC1012a, 500, c1017d);
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4291a(int i, int i2) {
        this.f9480a = (int) ((C2951n.f9588a - (100.0f * C0892a.f2566b)) / 2.0f);
        mo4293a(this.f9491l);
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4293a(int i) {
        this.f9491l = i;
        this.f9481b = (int) (60.0f * C0892a.f2565a);
        this.f9490k = (int) ((i - 1) * C2951n.f9590c);
        if (this.f9490k + C2951n.f9588a + (20.0f * C0892a.f2565a) > C0892a.f2553D) {
            this.f9489j = true;
            this.f9485f = (int) (C0892a.f2590z + (C2951n.f9588a / 2) + (C0892a.f2565a * 10.0f));
            this.f9486g = (int) ((((0 - this.f9490k) + C0892a.f2550A) - (C2951n.f9588a / 2)) - (C0892a.f2565a * 10.0f));
        } else {
            this.f9489j = false;
            this.f9488i = (-this.f9490k) / 2;
            this.f9485f = this.f9488i;
            this.f9486g = this.f9488i;
        }
        if (((int) ((this.f9481b * (i - 1)) + C2951n.f9589b + (C0892a.f2565a * 10.0f * 2.0f))) > C0892a.f2554E) {
            this.f9481b = (int) (((C0892a.f2554E - C2951n.f9589b) - ((C0892a.f2565a * 10.0f) * 2.0f)) / (i - 1));
        }
        this.f9487h = 0 - ((this.f9481b * (i - 1)) / 2);
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4286a(C2932g c2932g) {
        if (this.f9490k > C0892a.f2553D) {
            this.f9488i = (int) this.f9482c.m4059c(c2932g.m4183r());
        } else {
            this.f9488i = (-this.f9490k) / 2;
        }
        this.f9484e.position().f2526x = this.f9488i;
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4288a(C1017d c1017d, C2932g c2932g) {
        c1017d.mo10301f(c2932g.m4183r() * C2951n.f9590c);
        c1017d.mo10298h(this.f9487h + (c2932g.m4183r() * this.f9481b));
        c1017d.m10296j(0.0f);
        c1017d.m10305d(0.0f);
        c1017d.m10307c(0.0f);
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4290a(int i, ArrayList<C2932g> arrayList, C2932g c2932g, boolean z) {
        C1017d c1017d;
        if (this.f9488i > this.f9485f) {
            this.f9488i = this.f9485f;
        } else if (this.f9488i < this.f9486g) {
            this.f9488i = this.f9486g;
        }
        int i2 = 0;
        for (int i3 = z ? 1 : 0; i3 < i; i3++) {
            C2932g c2932g2 = arrayList.get(i3);
            c2932g2.m4186o();
            c2932g2.position().f2526x = C2951n.f9590c * i2;
            if (c2932g2 != c2932g) {
                c2932g2.mo4150O();
                if (c2932g2.parent() == null) {
                    c2932g2.rotation().f2527y = 50.0f;
                    c2932g2.m4199d(false);
                    c2932g2.removeFromParent();
                    this.f9484e.addChild(c2932g2);
                }
                c1017d = new C1017d();
                c1017d.mo10298h(this.f9487h + (this.f9481b * i2));
            } else {
                c1017d = new C1017d() { // from class: com.tsf.shell.f.f.d.a.a.3
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2921a.this.f9483d.mo4001b();
                    }
                };
                c1017d.m10305d(0.0f);
                c1017d.mo10298h(this.f9487h + (this.f9481b * i2));
            }
            i2++;
            C1014c.m10326a(c2932g2);
            C1014c.m10325a(c2932g2, 500, c1017d);
        }
        if (z) {
            if (c2932g.m4181t() != -1) {
                c2932g.m4256E();
                return;
            }
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.d.a.a.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2932g c2932g3 = (C2932g) m10306d();
                    c2932g3.position().f2527y = 0.0f;
                    c2932g3.rotation().f2527y = 0.0f;
                    C2921a.this.f9484e.removeChild(c2932g3);
                }
            };
            c1017d2.mo10298h((C0892a.f2552C - (C2951n.f9589b / 2)) - (100.0f * C0892a.f2566b));
            C1014c.m10326a(c2932g);
            this.f9482c.m4094a(this.f9482c.m4029o(), true, true);
            C1014c.m10325a(c2932g, 500, c1017d2);
            return;
        }
        c2932g.m4256E();
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4283a(ArrayList<C2932g> arrayList, C2932g c2932g, boolean z) {
        int size = arrayList.size();
        for (int i = z ? 1 : 0; i < size; i++) {
            C2932g c2932g2 = arrayList.get(i);
            if (c2932g2 != c2932g) {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.d.a.a.5
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2932g c2932g3 = (C2932g) m10306d();
                        c2932g3.position().f2527y = 0.0f;
                        c2932g3.rotation().f2527y = 0.0f;
                        C2921a.this.f9484e.removeChild(c2932g3);
                    }
                };
                c1017d.mo10298h((C0892a.f2552C - (C2951n.f9589b / 2)) - (100.0f * C0892a.f2566b));
                C1014c.m10326a(c2932g2);
                C1014c.m10325a(c2932g2, 500, c1017d);
            }
        }
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.d.a.a.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2921a.this.f9483d.mo4000c();
            }
        };
        c2932g.m4254G();
        c2932g.m4255F();
        c1017d2.mo10298h(0.0f);
        c1017d2.m10305d(0.0f);
        C1014c.m10326a(c2932g);
        C1014c.m10325a(c2932g, 500, c1017d2);
        C1017d c1017d3 = new C1017d();
        if (z) {
            c1017d3.mo10301f(this.f9482c.m4059c(c2932g.m4183r() - 1));
        } else {
            c1017d3.mo10301f(this.f9482c.m4059c(c2932g.m4183r()));
        }
        C1014c.m10326a(this.f9484e);
        C1014c.m10325a(this.f9484e, VEasing.Linear.easeNone, c1017d3);
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4294a(float f, float f2, float f3, float f4, boolean z) {
        if (this.f9489j) {
            if (z && this.f9485f != this.f9486g) {
                this.f9488i = (int) (this.f9485f + (((this.f9486g + this.f9480a) - this.f9485f) * (f / C0892a.f2553D)));
            } else {
                this.f9488i = (int) (this.f9485f + ((this.f9486g - this.f9485f) * (f / C0892a.f2553D)));
            }
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: b */
    public float mo4282b(int i) {
        return ((i + 1) * this.f9480a) + (this.f9480a / 2.0f);
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public int mo4292a(int i, float f, float f2, float f3, float f4, boolean z) {
        if (z) {
            int i2 = ((int) (((f - (C0892a.f2553D / 2)) - this.f9484e.position().f2526x) / this.f9480a)) + 1;
            if (i2 < 1) {
                return 1;
            }
            return i2 >= i ? i - 1 : i2;
        }
        int i3 = (int) (((f - (C0892a.f2553D / 2)) - this.f9484e.position().f2526x) / this.f9480a);
        if (i3 < 0) {
            return 0;
        }
        if (i3 >= i) {
            return i - 1;
        }
        return i3;
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4284a(C2951n c2951n) {
        this.f9482c = c2951n;
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4287a(C2920a c2920a) {
        this.f9483d = c2920a;
    }

    @Override // com.tsf.shell.p096f.p131f.p144d.p145a.InterfaceC2928b
    /* renamed from: a */
    public void mo4289a(C0980j c0980j) {
        this.f9484e = c0980j;
    }
}
