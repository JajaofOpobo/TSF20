package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p153i.p161c.p162a.p165c.C3285a;
/* renamed from: com.tsf.shell.preference.a.a.a.k */
/* loaded from: classes.dex */
public class C4020k extends C4017h {

    /* renamed from: a */
    private C0980j f13173a;

    /* renamed from: b */
    private C3285a f13174b;

    public C4020k(String str) {
        super(str, C0892a.m10742a(300.0f));
        this.f13174b = C3285a.m2924e();
        this.f13173a = new C0980j() { // from class: com.tsf.shell.preference.a.a.a.k.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart() {
                C4020k.this.f13174b.dispatchDraw();
            }
        };
        m890e().addChild(this.f13173a);
        this.f13173a.scale().setAll(0.55f, 0.55f, 1.0f);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        m885h();
        this.f13174b.m2925d();
        this.f13174b.m2928b();
    }

    /* renamed from: h */
    private void m885h() {
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        m885h();
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        this.f13174b.m2926c();
    }
}
