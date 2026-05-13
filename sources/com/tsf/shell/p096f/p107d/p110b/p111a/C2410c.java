package com.tsf.shell.p096f.p107d.p110b.p111a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
/* renamed from: com.tsf.shell.f.d.b.a.c */
/* loaded from: classes.dex */
public class C2410c extends C2411d {

    /* renamed from: c */
    private C0981k f7967c;

    /* renamed from: d */
    private TextureElement f7968d;

    public C2410c(int i, boolean z) {
        super(i, z);
        this.f7967c = new C0981k(C3566b.f11839a.f11750H * 1.45f, C3566b.f11839a.f11750H * 1.45f, false);
        this.f7967c.setAnimationObjectState(true);
        this.f7967c.uvs().set(0, 0.25f, 0.125f);
        this.f7967c.uvs().set(1, 0.0f, 0.125f);
        this.f7967c.uvs().set(2, 0.25f, 0.0f);
        this.f7967c.uvs().set(3, 0.0f, 0.0f);
        this.f7967c.position().f2527y = (C3566b.f11839a.f11767Y + C3566b.f11839a.f11751I) - (C3566b.f11839a.f11751I * 0.12f);
        this.f7967c.useVBO(false);
        this.f7967c.mouseEnabled(false);
        this.f7967c.removeFromParent();
        this.f7968d = new TextureElement(0, false);
        this.f7967c.textures().addElement(this.f7968d);
    }

    /* renamed from: a */
    private void m5616a(int i) {
        int i2 = i % 4;
        int i3 = i / 4;
        this.f7967c.uvs().set(0, (i2 + 1) * 0.25f, (i3 + 1) * 0.125f);
        this.f7967c.uvs().set(1, i2 * 0.25f, (i3 + 1) * 0.125f);
        this.f7967c.uvs().set(2, (i2 + 1) * 0.25f, i3 * 0.125f);
        this.f7967c.uvs().set(3, i2 * 0.25f, i3 * 0.125f);
        this.f7967c.dispatchDraw();
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: a */
    public void mo5612a() {
        if (this.f7968d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f7968d);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: a */
    public void mo5610a(AbstractC3208b abstractC3208b) {
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: b */
    public void mo5608b(AbstractC3208b abstractC3208b) {
        if (this.f7968d.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f7968d, C1306b.C1310d.widget_app_new_fire);
        }
        float m3146az = abstractC3208b.m3146az();
        int i = (int) m3146az;
        if (i >= 29) {
            i = 0;
            m3146az = 0.0f;
        }
        abstractC3208b.m3137f((float) (m3146az + 0.5d));
        m5616a(i);
    }
}
