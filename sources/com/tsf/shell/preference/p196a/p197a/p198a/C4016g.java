package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2409b;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2411d;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.preference.a.a.a.g */
/* loaded from: classes.dex */
public class C4016g extends C4017h {

    /* renamed from: a */
    private C0980j f13159a;

    /* renamed from: b */
    private float f13160b;

    /* renamed from: d */
    private float f13161d;

    /* renamed from: e */
    private float f13162e;

    /* renamed from: f */
    private ArrayList<C2411d> f13163f;

    /* renamed from: g */
    private C0984m f13164g;

    public C4016g(String str) {
        super(str, C0892a.m10742a(400.0f));
        this.f13159a = new C0980j();
        m890e().addChild(this.f13159a);
        this.f13160b = C3566b.f11839a.f11750H;
        this.f13162e = C0892a.m10742a(40.0f);
        this.f13161d = (this.f13160b * 5.0f) + (this.f13162e * 4.0f);
        this.f13159a.position().f2526x = ((-this.f13161d) / 2.0f) + C0892a.m10742a(40.0f);
        this.f13159a.position().f2527y = -C0892a.m10742a(140.0f);
        this.f13163f = new ArrayList<>();
        this.f13164g = new C0984m();
        this.f13164g.m10349c(C1306b.C1315i.notic_mark_introduction);
        this.f13164g.m10347d(34);
        this.f13164g.m10354a(true);
        this.f13164g.position().f2527y = C0892a.m10742a(200.0f);
        C3567c.m1967a(this.f13164g, C3567c.f11855n);
        m890e().addChild(this.f13164g);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        int i = 0;
        super.mo539f();
        this.f13163f.clear();
        this.f13163f.add(C3359a.f11108v.f7773f.m4351a(0));
        this.f13163f.add(C3359a.f11108v.f7773f.m4351a(2));
        this.f13163f.add(C3359a.f11108v.f7773f.m4351a(3));
        this.f13163f.add(C3359a.f11108v.f7773f.m4351a(12));
        this.f13163f.add(C3359a.f11108v.f7773f.m4351a(14));
        while (true) {
            int i2 = i;
            if (i2 < this.f13163f.size()) {
                C2409b m5614e = this.f13163f.get(i2).m5614e();
                if (i2 == 0) {
                    m5614e.m3820g();
                } else {
                    m5614e.m3819h();
                }
                m5614e.removeFromParent();
                m5614e.position().f2526x = this.f13162e + ((this.f13160b + this.f13162e) * i2);
                this.f13159a.addChild(m5614e);
                i = i2 + 1;
            } else {
                m892h();
                return;
            }
        }
    }

    /* renamed from: h */
    private void m892h() {
        this.f13164g.m10344f((int) (C0892a.f2553D - C0892a.m10742a(150.0f)));
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        m892h();
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        this.f13164g.m10358a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f13163f.size()) {
                C2411d c2411d = this.f13163f.get(i2);
                c2411d.m5614e().removeFromParent();
                c2411d.m4267h();
                c2411d.m5615d();
                c2411d.mo5612a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
