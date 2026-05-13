package com.tsf.shell.p096f.p107d.p110b.p111a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
/* renamed from: com.tsf.shell.f.d.b.a.f */
/* loaded from: classes.dex */
public class C2414f extends C2411d {

    /* renamed from: c */
    private C2406a f7975c;

    /* renamed from: d */
    private Number3d f7976d;

    public C2414f(int i, int i2, boolean z) {
        super(i, z);
        this.f7976d = new Number3d();
        this.f7975c = new C2406a(i2, C0892a.m10742a(26.0f), C0892a.m10742a(60.0f), 250.0f);
        this.f7975c.position().f2526x = C0892a.m10742a(47.0f);
        this.f7975c.position().f2527y = C0892a.m10742a(75.0f);
        this.f7975c.rotation().f2526x = -30.0f;
        this.f7975c.rotation().f2528z = -45.0f;
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: a */
    public void mo5612a() {
        this.f7975c.m5625a();
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: a */
    public void mo5610a(AbstractC3208b abstractC3208b) {
        if (this.f7975c.visible()) {
            if (abstractC3208b.parent() instanceof C2676a) {
                C0853a.m10855e().m10770b(abstractC3208b.position().f2526x, abstractC3208b.position().f2527y);
            } else {
                this.f7976d.reset();
                abstractC3208b.localToGlobal(this.f7976d);
                C0853a.m10855e().m10770b(this.f7976d.f2526x, this.f7976d.f2527y);
            }
            this.f7975c.m5619b(abstractC3208b.m3146az());
            C0853a.m10855e().m10764f();
            C0853a.m10855e().m10760j();
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: b */
    public void mo5608b(AbstractC3208b abstractC3208b) {
        if (this.f7975c.visible()) {
            GLES20.glFrontFace(2304);
            if (abstractC3208b.parent() instanceof C2676a) {
                C0853a.m10855e().m10770b(abstractC3208b.position().f2526x, abstractC3208b.position().f2527y);
            } else {
                this.f7976d.reset();
                abstractC3208b.localToGlobal(this.f7976d);
                C0853a.m10855e().m10770b(this.f7976d.f2526x, this.f7976d.f2527y);
            }
            float m3146az = abstractC3208b.m3146az();
            this.f7975c.m5624a(m3146az);
            abstractC3208b.m3137f(m3146az + 8.0f);
            C0853a.m10855e().m10764f();
            GLES20.glFrontFace(2305);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: b */
    public void mo5609b() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.b.a.f.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2414f.this.f7975c.visible(false);
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f7975c);
        C1014c.m10325a(this.f7975c, VEasing.Back.easeIn, c1017d);
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: c */
    public void mo5607c() {
        this.f7975c.visible(true);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f7975c);
        C1014c.m10325a(this.f7975c, VEasing.Back.easeIn, c1017d);
    }
}
