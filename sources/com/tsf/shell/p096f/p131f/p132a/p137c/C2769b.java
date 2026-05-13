package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p051e.C1064b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2775c;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.c.b */
/* loaded from: classes.dex */
public class C2769b extends C2775c.C2778a {

    /* renamed from: a */
    private C1064b f9061a;

    /* renamed from: b */
    private C2810l f9062b;

    /* renamed from: c */
    private C2862h f9063c;

    /* renamed from: d */
    private ArrayList<C2784e> f9064d;

    /* renamed from: e */
    private int f9065e;

    /* renamed from: f */
    private C2784e f9066f;

    /* renamed from: g */
    private C2784e f9067g;

    /* renamed from: h */
    private C2843f f9068h;

    /* renamed from: i */
    private C2775c f9069i;

    /* renamed from: j */
    private C0984m f9070j;

    /* renamed from: k */
    private float f9071k;

    public C2769b(C2775c c2775c, C2843f c2843f, C2862h c2862h) {
        this.f9069i = c2775c;
        this.f9063c = c2862h;
        this.f9068h = c2843f;
        m4712h();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2775c.C2778a
    /* renamed from: d */
    public void mo4679d() {
        this.f9070j.m10358a();
        this.f9067g.m4671d();
        this.f9066f.m4671d();
    }

    /* renamed from: a */
    public void m4725a(int i, int i2, int i3, int i4) {
        this.f9061a.m10045a(i, (-this.f9071k) / 2.0f, i3, this.f9071k / 2.0f);
        this.f9062b.m4624b();
    }

    /* renamed from: h */
    private void m4712h() {
        float f = 0.8f * (C3566b.f11841c.f11763U / C3566b.f11839a.f11763U);
        this.f9071k = C3566b.f11839a.f11763U * f;
        this.f9070j = new C0984m();
        this.f9070j.m10349c(C1306b.C1315i.notic_batch_operation);
        this.f9070j.m10347d(39);
        this.f9070j.m10345e(-1);
        C3567c.m1967a(this.f9070j, C3567c.f11849h);
        addChild(this.f9070j);
        this.f9062b = new C2810l(this.f9069i, 1.0f) { // from class: com.tsf.shell.f.f.a.c.b.1
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2810l
            /* renamed from: a */
            public C0980j mo4630a() {
                return C2769b.this.f9061a.m10008l();
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2810l
            /* renamed from: a */
            public C0975i mo4628a(int i) {
                return C2769b.this.f9061a.m10008l().getChildAt(i);
            }
        };
        this.f9061a = new C1064b(C0892a.f2553D, this.f9071k, C3566b.f11839a.f11763U * f, 30.0f * C0892a.f2567c * f, C0892a.f2567c * 10.0f * f, f) { // from class: com.tsf.shell.f.f.a.c.b.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: a */
            public void mo4667a(int i) {
                C2769b.this.m4720b(i);
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: a */
            public void mo4708a(C0975i c0975i) {
                C2769b.this.f9063c.m4417c((C3112b) c0975i);
                C2769b.this.f9062b.m4627a(c0975i);
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: b */
            public void mo4666b(C0975i c0975i) {
                C2769b.this.f9062b.m4623b(c0975i);
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: k */
            public void mo4706k() {
                if (C2769b.this.f9065e == 0) {
                    super.mo4706k();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: h */
            public void mo4707h() {
                if (C2769b.this.f9065e != 0) {
                    C2769b.this.f9062b.m4622c();
                } else {
                    super.mo4707h();
                }
            }
        };
        this.f9064d = new ArrayList<>();
        C2784e c2784e = new C2784e(C1306b.C1310d.drawer_layout_folder, 70, C4189x.m588c(C1306b.C1315i.pop_menu_create_folder)) { // from class: com.tsf.shell.f.f.a.c.b.3
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2784e
            /* renamed from: a */
            public void mo4672a() {
                ArrayList<AbstractC3208b> arrayList = new ArrayList<>();
                int numChildren = C2769b.this.f9061a.m10008l().numChildren();
                if (numChildren > 0) {
                    int i = numChildren - 1;
                    while (true) {
                        int i2 = i;
                        if (i2 <= -1) {
                            break;
                        }
                        AbstractC3208b abstractC3208b = (AbstractC3208b) C2769b.this.f9061a.m10008l().getChildAt(i2);
                        if (abstractC3208b.m3068ao()) {
                            arrayList.add(abstractC3208b);
                        }
                        i = i2 - 1;
                    }
                    Iterator<AbstractC3208b> it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC3208b next = it.next();
                        next.alpha(255.0f);
                        next.visible(true);
                        next.m3071al();
                        next.m3069an();
                        Number3d localToGlobal = next.localToGlobal(new Number3d());
                        C2769b.this.f9061a.m10008l().removeChild(next);
                        next.position().setAllFrom(localToGlobal);
                    }
                }
                C2769b.this.f9063c.m4432b(arrayList);
            }
        };
        this.f9066f = c2784e;
        this.f9064d.add(c2784e);
        C2784e c2784e2 = new C2784e(C1306b.C1310d.drawer_layout_reset, 70, C4189x.m588c(C1306b.C1315i.text_reset)) { // from class: com.tsf.shell.f.f.a.c.b.4
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2784e
            /* renamed from: a */
            public void mo4672a() {
                C2769b.this.m4711i();
            }
        };
        this.f9067g = c2784e2;
        this.f9064d.add(c2784e2);
        int size = this.f9064d.size();
        float f2 = C0892a.f2553D / (size + 1);
        float f3 = C0892a.f2590z + (C0892a.f2553D / (size + 1));
        for (int i = 0; i < size; i++) {
            C2784e c2784e3 = this.f9064d.get(i);
            c2784e3.position().f2526x = f3;
            c2784e3.position().f2527y = ((((-C2843f.f9233a) / 2.0f) + C2862h.f9293F) - C2843f.f9234b) + (C0892a.f2567c * 10.0f);
            c2784e3.removeFromParent();
            addChild(c2784e3);
            f3 += f2;
        }
        addChild(this.f9061a);
        m4726a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4720b(int i) {
        m4710j();
        if (i > 0) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.b.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2769b.this.f9070j.visible(false);
                    C2769b.this.f9070j.m10358a();
                }
            };
            c1017d.mo10298h(C0892a.m10742a(-150.0f));
            c1017d.m10314a(0);
            C1014c.m10326a(this.f9070j);
            C1014c.m10325a(this.f9070j, 300, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.m10314a(255);
            C1014c.m10326a(this.f9067g);
            C1014c.m10325a(this.f9067g, 300, c1017d2);
            this.f9067g.mouseEnabled(true);
        } else if (!this.f9069i.m4689d()) {
            C1017d c1017d3 = new C1017d();
            c1017d3.mo10298h(0.0f);
            c1017d3.m10314a(255);
            C1014c.m10326a(this.f9070j);
            C1014c.m10325a(this.f9070j, 300, c1017d3);
            this.f9070j.visible(true);
            C1017d c1017d4 = new C1017d();
            c1017d4.m10314a(30);
            C1014c.m10326a(this.f9067g);
            C1014c.m10325a(this.f9067g, 300, c1017d4);
            this.f9067g.mouseEnabled(false);
        }
    }

    /* renamed from: a */
    public void m4726a(int i) {
        int i2 = 0;
        this.f9065e = i;
        if (this.f9065e == 0) {
            this.f9061a.m10021f();
            C3567c.m1967a(this.f9066f, C3567c.f11849h);
            this.f9061a.m10008l().renderChildren(true);
            this.f9061a.m10006m();
            return;
        }
        this.f9061a.m10024e();
        C3567c.m1967a(this.f9066f, C3567c.f11853l);
        this.f9061a.m10008l().renderChildren(false);
        while (true) {
            int i3 = i2;
            if (i3 < this.f9061a.m10008l().numChildren()) {
                AbstractC3208b abstractC3208b = (AbstractC3208b) this.f9061a.m10008l().getChildAt(i3);
                abstractC3208b.m3072ak();
                abstractC3208b.m3070am();
                i2 = i3 + 1;
            } else {
                this.f9062b.m4629a(this.f9061a.m10018g() * C0892a.f2553D);
                this.f9062b.m4624b();
                return;
            }
        }
    }

    /* renamed from: b */
    public int m4721b() {
        return this.f9061a.m10008l().numChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m4711i() {
        ArrayList arrayList = new ArrayList();
        int numChildren = this.f9061a.m10008l().numChildren();
        if (numChildren > 0) {
            while (true) {
                numChildren--;
                if (numChildren <= -1) {
                    break;
                }
                arrayList.add(this.f9061a.m10008l().getChildAt(numChildren));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0975i c0975i = (C0975i) it.next();
                if (c0975i instanceof AbstractC3208b) {
                    AbstractC3208b abstractC3208b = (AbstractC3208b) c0975i;
                    abstractC3208b.alpha(255.0f);
                    abstractC3208b.visible(true);
                    abstractC3208b.m3071al();
                    abstractC3208b.m3069an();
                    Number3d localToGlobal = abstractC3208b.localToGlobal(new Number3d());
                    this.f9061a.m10008l().removeChild(abstractC3208b);
                    int m4437b = this.f9063c.m4437b((C3112b) abstractC3208b);
                    int i = m4437b % C2862h.f9296m;
                    C2676a m4411e = this.f9063c.m4411e(m4437b);
                    abstractC3208b.position().setAllFrom(m4411e.globalToLocal(localToGlobal));
                    m4411e.addChildAt(abstractC3208b, i);
                    this.f9063c.m4491a(abstractC3208b, m4411e, i);
                    C1017d c1017d = new C1017d();
                    c1017d.m10294l(1.0f);
                    c1017d.m10293m(1.0f);
                    C1014c.m10326a(abstractC3208b);
                    C1014c.m10325a(abstractC3208b, 250, c1017d);
                }
            }
            arrayList.clear();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2775c.C2778a
    /* renamed from: c */
    public void mo4680c() {
        m4711i();
        m4726a(0);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2775c.C2778a
    /* renamed from: a */
    public void mo4681a() {
        m4720b(this.f9061a.m10008l().numChildren());
    }

    /* renamed from: e */
    public boolean m4715e() {
        return this.f9061a.m10008l().numChildren() == 0;
    }

    /* renamed from: j */
    private void m4710j() {
        if (m4709k()) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(this.f9066f);
            C1014c.m10325a(this.f9066f, 300, c1017d);
            this.f9066f.mouseEnabled(true);
            return;
        }
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(30);
        C1014c.m10326a(this.f9066f);
        C1014c.m10325a(this.f9066f, 300, c1017d2);
        this.f9066f.mouseEnabled(false);
    }

    /* renamed from: k */
    private boolean m4709k() {
        int numChildren = this.f9061a.m10008l().numChildren();
        for (int i = 0; i < numChildren; i++) {
            if (((AbstractC3208b) this.f9061a.m10008l().getChildAt(i)).m3068ao()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m4722a(C3231c c3231c, MotionEvent motionEvent) {
        if ((c3231c.parent() instanceof C2676a) && (c3231c instanceof AbstractC3208b)) {
            c3231c.rotation().setAll(0.0f, 0.0f, 0.0f);
            c3231c.m3072ak();
            c3231c.m3070am();
            if (this.f9065e == 0) {
                this.f9061a.m10026d(c3231c);
            } else {
                this.f9061a.m10008l().addChild(c3231c);
                this.f9062b.m4624b();
            }
            m4710j();
        } else if (c3231c.parent() == this.f9061a.m10008l() && (c3231c instanceof AbstractC3208b)) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) c3231c;
            if (!abstractC3208b.m3068ao()) {
                abstractC3208b.m3072ak();
                abstractC3208b.m3070am();
            } else {
                abstractC3208b.m3071al();
                abstractC3208b.m3069an();
            }
            m4710j();
        } else if ((c3231c.parent() instanceof C2676a) && (c3231c instanceof C3145b)) {
            ((C3145b) c3231c).m3365aR();
        }
    }

    /* renamed from: b */
    public void m4718b(C3231c c3231c, MotionEvent motionEvent) {
        C0980j c0980j = (C0980j) c3231c.parent();
        ArrayList<C3231c> arrayList = new ArrayList<>();
        if (c0980j == this.f9061a.m10008l()) {
            if (this.f9065e == 0) {
                Iterator<C0975i> it = c0980j.children().iterator();
                while (it.hasNext()) {
                    AbstractC3208b abstractC3208b = (AbstractC3208b) it.next();
                    if (abstractC3208b.m3068ao()) {
                        arrayList.add(abstractC3208b);
                    }
                }
            } else {
                Iterator<C0975i> it2 = c0980j.children().iterator();
                while (it2.hasNext()) {
                    arrayList.add((AbstractC3208b) it2.next());
                }
            }
            Iterator<C3231c> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C3231c next = it3.next();
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                C1014c.m10326a(next);
                C1014c.m10325a(next, VEasing.Back.easeIn, c1017d);
            }
            arrayList.remove(c3231c);
            c3231c.m3057b(arrayList);
        }
        c3231c.removeFromParent();
        this.f9069i.m4705a(c3231c.position().f2526x, c3231c.position().f2527y);
        C3359a.f11096j.m2232a(c3231c);
    }
}
