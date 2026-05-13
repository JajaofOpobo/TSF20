package com.tsf.shell.p096f.p118e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p099b.C2278b;
/* renamed from: com.tsf.shell.f.e.i */
/* loaded from: classes.dex */
public class C2617i extends C0980j {

    /* renamed from: b */
    private int f8612b = 0;

    /* renamed from: c */
    private int f8613c = 0;

    /* renamed from: a */
    private C2278b f8611a = new C2278b(0.0f, 0.0f, this);

    public C2617i() {
        this.f8611a.setDefaultColor(new Color4(255, 0, 0, 100));
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        C3359a.f11107u.m5966a(this.f8611a);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        C3359a.f11107u.m5968a();
    }

    /* renamed from: a */
    public void m5153a(float f) {
        this.f8611a.mo10368a(f);
        m5151a(this.f8612b);
    }

    /* renamed from: b */
    public void m5150b(float f) {
        this.f8611a.mo5215b(f);
        m5149b(this.f8613c);
    }

    /* renamed from: a */
    public void m5152a(float f, float f2) {
        m5153a(f);
        m5150b(f2);
    }

    /* renamed from: a */
    public void m5151a(int i) {
        this.f8612b = i;
        switch (i) {
            case 0:
                this.f8611a.position().f2526x = 0.0f;
                minX((-this.f8611a.mo10366b()) / 2.0f);
                maxX(this.f8611a.mo10366b() / 2.0f);
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                this.f8611a.position().f2526x = this.f8611a.mo10366b() / 2.0f;
                minX(0.0f);
                maxX(this.f8611a.mo10366b());
                return;
            case 4:
                this.f8611a.position().f2526x = (-this.f8611a.mo10366b()) / 2.0f;
                minX(-this.f8611a.mo10366b());
                maxX(0.0f);
                return;
        }
    }

    /* renamed from: b */
    public void m5149b(int i) {
        this.f8613c = i;
        switch (i) {
            case 0:
                this.f8611a.position().f2527y = 0.0f;
                minY((-this.f8611a.mo10365c()) / 2.0f);
                maxY(this.f8611a.mo10365c() / 2.0f);
                return;
            case 1:
                this.f8611a.position().f2527y = (-this.f8611a.mo10365c()) / 2.0f;
                minY(-this.f8611a.mo10365c());
                maxY(0.0f);
                return;
            case 2:
                this.f8611a.position().f2527y = this.f8611a.mo10365c() / 2.0f;
                minY(0.0f);
                maxY(this.f8611a.mo10365c());
                return;
            default:
                return;
        }
    }
}
