package com.tsf.shell.preference.p196a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p101c.p102a.C2326f;
import com.tsf.shell.p096f.p118e.C2627j;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.preference.a.e */
/* loaded from: classes.dex */
public class C4082e extends C4077b {

    /* renamed from: a */
    private C2326f f13301a;

    /* renamed from: b */
    private float f13302b;

    /* renamed from: d */
    private C2627j f13303d;

    /* renamed from: e */
    private ArrayList<AbstractC3208b> f13304e;

    public C4082e(float f) {
        super(f);
        this.f13304e = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            C3224h c3224h = new C3224h(C3566b.f11841c);
            c3224h.m3154aL();
            this.f13304e.add(c3224h);
        }
        m798n();
    }

    /* renamed from: f */
    public void m801f(int i) {
        this.f13301a.m5851a(i, false);
    }

    @Override // com.tsf.shell.preference.p196a.C4077b, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        this.f13301a.m5826f().m5745d();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 8) {
                AbstractC3208b abstractC3208b = this.f13304e.get(i2);
                abstractC3208b.f10495k.textures().clear();
                abstractC3208b.f10495k.textures().addElement(C3359a.f11084B.f13292a.m816a(i2));
                i = i2 + 1;
            } else {
                this.f13301a.m5826f().m5739j();
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.p196a.C4077b, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        this.f13301a.m5854a(this.f13302b, (-this.f13302b) / 2.0f, 0.0f);
    }

    @Override // com.tsf.shell.preference.p196a.C4077b, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        this.f13301a.m5826f().m5744e();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 8) {
                this.f13304e.get(i2).f10495k.textures().clear();
                C3359a.f11084B.f13292a.m815b(i2);
                i = i2 + 1;
            } else {
                this.f13301a.m5794v();
                this.f13301a.m5826f().m5740i();
                return;
            }
        }
    }

    /* renamed from: n */
    private void m798n() {
        this.f13301a = new C2326f(true);
        C2326f.C2343a c2343a = new C2326f.C2343a();
        c2343a.f7660a = 0.0f;
        c2343a.f7661b = 0.0f;
        c2343a.f7662c = 0.0f;
        this.f13301a.m5849a(m818e(), c2343a);
        this.f13302b = 0.0f;
        this.f13303d = new C2627j(false);
        this.f13303d.m5124a(5);
        this.f13303d.m5119b(2);
        Iterator<AbstractC3208b> it = this.f13304e.iterator();
        while (it.hasNext()) {
            AbstractC3208b next = it.next();
            this.f13301a.m5824g().addChild(next);
            this.f13302b = (next.maxX() - next.minX()) + this.f13302b;
        }
        this.f13302b *= 0.7f;
        this.f13301a.m5794v();
        this.f13303d.position().f2526x = this.f13302b / 2.0f;
        this.f13303d.position().f2527y = C0892a.m10742a(-100.0f);
        this.f13301a.m5822h().addChild(this.f13303d);
    }

    /* renamed from: h */
    public void m800h() {
        this.f13303d.m5116b(true);
    }

    /* renamed from: m */
    public void m799m() {
        this.f13303d.m5121a(true);
    }
}
