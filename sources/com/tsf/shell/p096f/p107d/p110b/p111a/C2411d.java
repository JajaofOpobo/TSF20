package com.tsf.shell.p096f.p107d.p110b.p111a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p177i.C3498a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p131f.C2931f;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.d.b.a.d */
/* loaded from: classes.dex */
public class C2411d extends C2931f {

    /* renamed from: b */
    public static TextureElement f7969b = new TextureElement(0, false);

    /* renamed from: a */
    public C2409b f7970a;

    public C2411d(int i, boolean z) {
        super(i, 0, z);
        this.f7970a = new C2409b(m5613o());
    }

    /* renamed from: a */
    public void mo5612a() {
    }

    /* renamed from: a */
    public void mo5610a(AbstractC3208b abstractC3208b) {
    }

    /* renamed from: b */
    public void mo5608b(AbstractC3208b abstractC3208b) {
    }

    /* renamed from: b */
    public void mo5609b() {
    }

    /* renamed from: c */
    public void mo5607c() {
    }

    /* renamed from: o */
    private C3224h m5613o() {
        C3224h c3224h = new C3224h() { // from class: com.tsf.shell.f.d.b.a.d.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (C2411d.f7969b.f2529id == 0) {
                    Bitmap m2022a = C3566b.f11839a.m2022a();
                    Canvas canvas = new Canvas(m2022a);
                    canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                    C3566b.f11839a.m2015a(canvas, C4189x.m607a(C1306b.C1310d.effect_icon_standard, C3566b.f11839a.f11750H, C3566b.f11839a.f11751I), true);
                    C0853a.m10853g().m10540a(C2411d.f7969b, m2022a);
                }
                C2411d.this.mo5610a(this);
            }

            @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildEnd() {
                super.onDrawChildEnd();
                C2411d.this.mo5608b(this);
                C3498a.m2191a(C2411d.this, C0892a.m10742a(30.0f));
            }
        };
        c3224h.m3137f((float) (Math.random() * 200.0d));
        c3224h.f10495k.textures().addElement(f7969b);
        return c3224h;
    }

    /* renamed from: d */
    public void m5615d() {
        if (f7969b.f2529id != 0) {
            C0853a.m10853g().m10543a(f7969b);
        }
    }

    /* renamed from: e */
    public C2409b m5614e() {
        return this.f7970a;
    }
}
