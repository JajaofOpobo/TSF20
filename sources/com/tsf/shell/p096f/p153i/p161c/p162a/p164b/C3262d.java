package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
/* renamed from: com.tsf.shell.f.i.c.a.b.d */
/* loaded from: classes.dex */
public class C3262d extends VObject3dContainer {

    /* renamed from: g */
    private AbstractC3259b f10760g;

    /* renamed from: a */
    public C3258a f10754a = new C3258a();

    /* renamed from: c */
    private float f10756c = 0.0f;

    /* renamed from: d */
    private float f10757d = 0.8f;

    /* renamed from: e */
    private int f10758e = 0;

    /* renamed from: f */
    private int f10759f = 0;

    /* renamed from: b */
    int f10755b = 0;

    public C3262d() {
        addChild(this.f10754a);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        int m2968b;
        int m2974a = m2974a(this.f10754a.rotation().f2526x);
        if (m2974a != this.f10755b) {
            m2972a(this.f10755b, m2974a);
        }
        this.f10755b = m2974a;
        float f = (this.f10756c - this.f10754a.position().f2528z) * this.f10757d;
        this.f10754a.position().f2528z += f;
        if (Math.abs(f) < 0.02f) {
            this.f10754a.position().f2528z = this.f10756c;
            if (this.f10760g != null && this.f10759f != (m2968b = m2968b(this.f10758e))) {
                this.f10759f = m2968b;
                this.f10760g.mo2951c(m2968b);
            }
        }
    }

    /* renamed from: a */
    public int m2974a(float f) {
        return Math.round(f / 90.0f);
    }

    /* renamed from: a */
    public void m2971a(AbstractC3259b abstractC3259b) {
        if (this.f10760g != null) {
            this.f10760g.m2977b();
        }
        this.f10760g = abstractC3259b;
        this.f10760g.m2979a(this);
        m2969b();
    }

    /* renamed from: a */
    public void m2970a(AbstractC3263e abstractC3263e) {
        this.f10754a.f10724g = abstractC3263e.f10761a.f2529id;
    }

    /* renamed from: a */
    public void m2972a(int i, int i2) {
        if (this.f10760g != null) {
            if (Math.abs(i2 - i) < 2) {
                int i3 = (i2 <= i ? -2 : 2) + i;
                this.f10754a.m2984a(m2973a(i3), this.f10760g.mo2945a(m2968b(i3)));
                return;
            }
            m2969b();
        }
    }

    /* renamed from: b */
    private void m2969b() {
        if (this.f10760g != null) {
            int m2974a = m2974a(this.f10754a.rotation().f2526x);
            this.f10754a.m2984a(m2973a(m2974a), this.f10760g.mo2945a(m2968b(m2974a)));
            int m2974a2 = m2974a(this.f10754a.rotation().f2526x + 90.0f);
            this.f10754a.m2984a(m2973a(m2974a2), this.f10760g.mo2945a(m2968b(m2974a2)));
            int m2974a3 = m2974a(this.f10754a.rotation().f2526x - 90.0f);
            this.f10754a.m2984a(m2973a(m2974a3), this.f10760g.mo2945a(m2968b(m2974a3)));
        }
    }

    /* renamed from: a */
    public int m2973a(int i) {
        int i2 = i % 4;
        return i2 < 0 ? i2 + 4 : i2;
    }

    /* renamed from: b */
    public int m2968b(int i) {
        int mo2946a = this.f10760g.mo2946a();
        int i2 = i % mo2946a;
        return i2 < 0 ? i2 + mo2946a : i2;
    }

    /* renamed from: b */
    public void m2967b(int i, int i2) {
        if (this.f10760g != null) {
            VTweenParam vTweenParam = new VTweenParam();
            vTweenParam.setRotationX(i * 90);
            VTween.killTween(this.f10754a);
            VTween.m10747to(this.f10754a, i2, vTweenParam);
            if (this.f10758e != i) {
                this.f10760g.mo2952b(m2968b(this.f10758e));
            }
            this.f10758e = i;
        }
    }

    /* renamed from: a */
    public int m2975a() {
        return m2974a(this.f10754a.rotation().f2526x);
    }
}
