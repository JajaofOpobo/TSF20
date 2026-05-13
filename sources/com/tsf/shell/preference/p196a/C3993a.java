package com.tsf.shell.preference.p196a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p033b.C0908c;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
import com.tsf.C1306b;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.p096f.p118e.C2617i;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.preference.a.a */
/* loaded from: classes.dex */
public class C3993a extends AbstractC0951f {

    /* renamed from: a */
    private C2617i f13092a;

    /* renamed from: b */
    private C0967a f13093b;

    /* renamed from: f */
    private C0981k f13096f;

    /* renamed from: h */
    private C0981k f13098h;

    /* renamed from: j */
    private float f13100j;

    /* renamed from: l */
    private ArrayList<AbstractC3208b> f13102l;

    /* renamed from: d */
    private TextureElement f13094d = new TextureElement(0, false);

    /* renamed from: e */
    private TextureElement f13095e = new TextureElement(0, false);

    /* renamed from: g */
    private TextureElement f13097g = new TextureElement(0, false);

    /* renamed from: i */
    private float f13099i = 0.4f;

    /* renamed from: k */
    private C3560a f13101k = new C3560a(1.15f, 1.15f);

    public C3993a() {
        m10628a(1);
        m10622a(true);
        C0907b layoutParams = getLayoutParams();
        layoutParams.f2655a = C0892a.m10742a(30.0f);
        layoutParams.f2656b = C0892a.m10742a(30.0f);
        this.f13093b = new C0967a(C2951n.f9588a, C2951n.f9589b, C0892a.f2567c, new C0968b(68, 68, 68, 68, 136, 136));
        this.f13093b.textures().addElement(this.f13094d);
        this.f13093b.alpha(80.0f);
        addChild(this.f13093b);
        this.f13092a = new C2617i();
        addChild(this.f13092a);
        this.f13096f = new C0981k(289.0f, 336.0f, false);
        this.f13096f.textures().addElement(this.f13095e);
        this.f13092a.addChild(this.f13096f);
        this.f13098h = new C0981k(392.0f, 95.0f, false);
        this.f13098h.textures().addElement(this.f13097g);
        this.f13092a.addChild(this.f13098h);
        this.f13102l = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            C3224h c3224h = new C3224h(this.f13101k);
            c3224h.m3154aL();
            this.f13102l.add(c3224h);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        this.f13100j = C0892a.f2568d;
        m921h();
    }

    /* renamed from: e */
    private void m922e() {
        float f = this.f13100j / 3.0f;
        this.f13093b.mo10368a((C0892a.f2553D * this.f13099i) + (40.0f * f));
        this.f13093b.mo5215b((C0892a.f2554E * this.f13099i) + (40.0f * f));
        this.f13092a.m5152a(this.f13093b.mo10366b() - (40.0f * f), this.f13093b.mo10365c() - (40.0f * f));
        C0907b layoutParams = getLayoutParams();
        layoutParams.f2663i = -this.f13093b.mo10365c();
        layoutParams.f2665k = 0.0f;
        m10615d((int) this.f13093b.mo10365c());
        PositionNumber3d position = this.f13093b.position();
        PositionNumber3d position2 = this.f13092a.position();
        float f2 = (-this.f13093b.mo10365c()) / 2.0f;
        position2.f2527y = f2;
        position.f2527y = f2;
        if (parent() != null) {
            ((C0908c) parent()).mo4847d();
        }
        if (C0892a.f2564O) {
            this.f13096f.position().f2526x = 0.0f;
            this.f13096f.position().f2527y = f * 180.0f;
        } else {
            this.f13096f.position().f2526x = ((-this.f13093b.mo10366b()) * 0.5f) + (150.0f * f);
            this.f13096f.position().f2527y = f * 50.0f;
        }
        m923a(this.f13100j);
    }

    /* renamed from: a */
    public void m923a(float f) {
        this.f13100j = f;
        float f2 = this.f13100j / 3.0f;
        this.f13098h.position().f2527y = (((-C0892a.f2554E) * this.f13099i) / 2.0f) + ((this.f13098h.mo10365c() * f2) / 2.0f) + (20.0f * this.f13099i);
        Number3d scale = this.f13098h.scale();
        this.f13098h.scale().f2527y = f2;
        scale.f2526x = f2;
        if (C0892a.f2564O) {
            Number3d scale2 = this.f13096f.scale();
            this.f13096f.scale().f2527y = f2;
            scale2.f2526x = f2;
            return;
        }
        Number3d scale3 = this.f13096f.scale();
        float f3 = f2 * 0.75f;
        this.f13096f.scale().f2527y = f3;
        scale3.f2526x = f3;
    }

    /* renamed from: h */
    private void m921h() {
        if (this.f13094d.f2529id == 0) {
            Bitmap m607a = C4189x.m607a(C1306b.C1310d.preference_screen_frame, C3489a.f11530q, C3489a.f11530q);
            C0853a.m10853g().m10540a(this.f13094d, m607a);
            m607a.recycle();
        }
        if (this.f13095e.f2529id == 0) {
            Bitmap m609a = C4189x.m609a(C1306b.C1310d.preference_screen_widget_clock);
            C0853a.m10853g().m10540a(this.f13095e, m609a);
            m609a.recycle();
        }
        if (this.f13097g.f2529id == 0) {
            Bitmap m609a2 = C4189x.m609a(C1306b.C1310d.preference_screen_dock);
            C0853a.m10853g().m10540a(this.f13097g, m609a2);
            m609a2.recycle();
        }
    }

    /* renamed from: m */
    private void m920m() {
        if (this.f13094d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13094d);
        }
        if (this.f13095e.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13095e);
        }
        if (this.f13097g.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13097g);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        m920m();
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        m922e();
        super.mo544c(i);
    }
}
