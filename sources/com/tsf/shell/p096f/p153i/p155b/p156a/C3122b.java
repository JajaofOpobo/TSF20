package com.tsf.shell.p096f.p153i.p155b.p156a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.p096f.p118e.p129h.C2611a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p161c.C3232a;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
/* renamed from: com.tsf.shell.f.i.b.a.b */
/* loaded from: classes.dex */
public class C3122b extends C3112b implements C2611a.InterfaceC2613a {

    /* renamed from: a */
    private boolean f10155a;

    /* renamed from: b */
    private boolean f10156b;

    /* renamed from: f */
    private boolean f10157f;

    /* renamed from: g */
    private C3117a f10158g;

    /* renamed from: k */
    public static C3343g m3469k() {
        return new C3232a();
    }

    public C3122b(ItemInfo itemInfo) {
        super(itemInfo);
        this.f10155a = false;
        this.f10156b = false;
        this.f10157f = false;
        itemInfo.iconType = 2;
        this.f10158g = new C3117a(true) { // from class: com.tsf.shell.f.i.b.a.b.1
            @Override // com.tsf.shell.p096f.p153i.p155b.p156a.C3117a
            /* renamed from: d */
            public Bitmap mo3467d() {
                return C3122b.this.m3534K().getPhoto();
            }

            @Override // com.tsf.shell.p096f.p153i.p155b.p156a.C3117a
            /* renamed from: e */
            public void mo3466e() {
                C2611a.m5163a(C3122b.this, 300, 300);
            }
        };
        setAABBPX(C0892a.f2566b * (-180.0f), C0892a.f2566b * (-300.0f), 0.0f, C0892a.f2566b * 180.0f, C0892a.f2566b * 100.0f, 0.0f);
        addChild(this.f10158g);
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: W */
    public void mo3471W() {
        this.f10156b = true;
        m3468l();
        this.f10158g.m3480c();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: X */
    public void mo3440X() {
        this.f10156b = false;
        m3468l();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: n_ */
    public void mo3052n_() {
        this.f10155a = true;
        m3468l();
        super.mo3052n_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: c */
    public void mo3056c() {
        this.f10155a = false;
        m3468l();
        super.mo3056c();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: m_ */
    public void mo3053m_() {
        super.mo3053m_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: q_ */
    public void mo3081q_() {
        this.f10157f = true;
        m3468l();
        super.mo3081q_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: j */
    public void mo3083j() {
        this.f10157f = false;
        m3468l();
        super.mo3083j();
    }

    /* renamed from: l */
    private void m3468l() {
        if (this.f10157f || this.f10155a || this.f10156b) {
            this.f10158g.m3485a();
        } else {
            this.f10158g.m3482b();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        this.f10158g.destroy();
        super.mo3055g();
    }

    @Override // com.tsf.shell.p096f.p118e.p129h.C2611a.InterfaceC2613a
    /* renamed from: a */
    public void mo3470a(Bitmap bitmap) {
        m3534K().onUpdatePhoto(bitmap, null);
        this.f10158g.m3484a(m3534K().getPhoto());
    }
}
