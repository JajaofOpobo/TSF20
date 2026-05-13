package com.tsf.shell.p096f.p131f.p132a.p133a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3381g;
import com.tsf.shell.p096f.p118e.C2502d;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2682a;
import com.tsf.shell.p096f.p131f.p132a.p133a.p135b.C2693b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3218e;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.a.d */
/* loaded from: classes.dex */
public class C2712d extends C2682a {

    /* renamed from: a */
    private C3381g.C3384b f8921a;

    /* renamed from: b */
    private C2502d<C3218e> f8922b;

    /* renamed from: c */
    private ArrayList<C3222g> f8923c;

    /* renamed from: d */
    private TextureElement f8924d;

    /* renamed from: e */
    private C0981k f8925e;

    /* renamed from: f */
    private float f8926f;

    public C2712d(C2695c c2695c) {
        super(c2695c, C1306b.C1310d.allapps_recent_icon);
        this.f8924d = new TextureElement(0, false);
        this.f8926f = -C0892a.m10742a(50.0f);
        this.f8923c = new ArrayList<>();
        this.f8922b = new C2502d<C3218e>() { // from class: com.tsf.shell.f.f.a.a.d.1
            @Override // com.tsf.shell.p096f.p118e.C2502d
            /* renamed from: a */
            public C3218e mo718b() {
                return new C3218e();
            }
        };
        this.f8921a = new C3381g.C3384b() { // from class: com.tsf.shell.f.f.a.a.d.2
            @Override // com.tsf.shell.manager.p166a.C3381g.C3384b
            /* renamed from: a */
            public void mo2674a(ArrayList<C3222g> arrayList) {
                C2712d.this.m4841g();
            }
        };
        C3359a.f11109w.m2716a().m2749a().m2689a(this.f8921a);
        this.f8925e = new C0981k(C0892a.m10742a(60.0f), C0892a.m10742a(50.0f), false) { // from class: com.tsf.shell.f.f.a.a.d.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2712d.this.f8924d.f2529id == 0) {
                    C0853a.m10853g().m10542a(C2712d.this.f8924d, C1306b.C1310d.allapps_direction_swap);
                }
            }
        };
        this.f8925e.position().f2527y = this.f8926f;
        this.f8925e.textures().addElement(this.f8924d);
        this.f8925e.calAABB(3.0f, 3.0f, 1.0f);
        m4934i().addChild(this.f8925e);
        this.f8925e.setMouseEventListener(new C0937a(this.f8925e) { // from class: com.tsf.shell.f.f.a.a.d.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2712d.this.m4935h().m4892a();
            }
        });
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c
    /* renamed from: a */
    public void mo4845a(int i, boolean z) {
        super.mo4845a(i, z);
        float r = m4925r();
        C1014c.m10326a(this.f8925e);
        if (z) {
            C1017d c1017d = new C1017d();
            if (i == C2695c.f8877b) {
                c1017d.m10303e(0.0f);
            } else {
                c1017d.m10303e(180.0f);
            }
            c1017d.mo10301f(r);
            c1017d.m10313a(C0986a.f2959n);
            C1014c.m10325a(this.f8925e, 500, c1017d);
            return;
        }
        this.f8925e.position().f2526x = r;
        if (i == C2695c.f8877b) {
            this.f8925e.rotation().f2528z = 0.0f;
        } else {
            this.f8925e.rotation().f2528z = 180.0f;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c
    /* renamed from: e */
    public void mo4843e() {
        super.mo4843e();
        C2693b.m4902a(this.f8925e, this.f8926f - C2695c.f8876a, this.f8926f);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        this.f8925e.position().f2526x = m4925r();
        if (m4926q() == C2695c.f8877b) {
            this.f8925e.rotation().f2528z = 0.0f;
        } else {
            this.f8925e.rotation().f2528z = 180.0f;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2682a, com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c
    /* renamed from: f */
    public void mo4842f() {
        super.mo4842f();
        if (this.f8924d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f8924d);
        }
        m4840v();
    }

    /* renamed from: g */
    public void m4841g() {
        m4840v();
        int k = m4932k() * 3;
        Iterator<C3222g> it = C3359a.f11109w.m2716a().m2749a().m2692a(k <= 12 ? k : 12).iterator();
        while (it.hasNext()) {
            C3218e m5383c = this.f8922b.m5383c();
            m5383c.m3121a(it.next());
            this.f8923c.add(m5383c);
        }
        m4933j();
        m4939a(this.f8923c);
    }

    /* renamed from: v */
    private void m4840v() {
        Iterator<C3222g> it = this.f8923c.iterator();
        while (it.hasNext()) {
            C3218e c3218e = (C3218e) it.next();
            c3218e.m3120aW();
            this.f8922b.m5384a(c3218e);
        }
        this.f8923c.clear();
    }
}
