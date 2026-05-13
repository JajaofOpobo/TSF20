package com.tsf.shell.preference.p196a.p197a.p198a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0897d;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.p184a.C3562b;
import com.tsf.shell.manager.p183o.p184a.C3563c;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.preference.a.a.a.d */
/* loaded from: classes.dex */
public class C4010d extends C4017h {

    /* renamed from: a */
    private C0897d f13142a;

    /* renamed from: b */
    private C0895b f13143b;

    /* renamed from: d */
    private C0980j f13144d;

    /* renamed from: e */
    private C0981k f13145e;

    /* renamed from: f */
    private TextureElement f13146f;

    /* renamed from: g */
    private Runnable f13147g;

    /* renamed from: h */
    private boolean f13148h;

    /* renamed from: i */
    private int f13149i;

    /* renamed from: j */
    private ArrayList<C3562b> f13150j;

    public C4010d(String str) {
        super(str, C0892a.m10742a(238.0f));
        this.f13148h = false;
        this.f13149i = 0;
        this.f13144d = new C0980j();
        this.f13147g = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                C4010d.this.m897n();
            }
        };
        this.f13150j = new ArrayList<>();
        this.f13150j.add(C3563c.m1976c(0));
        this.f13150j.add(C3563c.m1976c(1));
        this.f13150j.add(C3563c.m1976c(3));
        this.f13150j.add(C3563c.m1976c(8));
        this.f13142a = new C0897d() { // from class: com.tsf.shell.preference.a.a.a.d.2
            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0897d
            /* renamed from: b */
            public float mo735b(float f) {
                float f2 = C3566b.f11839a.f11752J * 1.2f;
                return f2 * (-((int) ((Math.abs(f) + (f2 / 2.0f)) / f2)));
            }
        };
        this.f13142a.m10709b(true);
        this.f13142a.m10707c(((-C3566b.f11839a.f11752J) / 2.0f) * 1.2f);
        this.f13142a.m10702d((C3566b.f11839a.f11752J / 2.0f) * 1.2f);
        this.f13143b = new C0895b();
        this.f13142a.m10704c(this.f13143b);
        for (int i = 0; i < this.f13150j.size(); i++) {
            C0981k c0981k = new C0981k(C3566b.f11841c.f11752J, C3566b.f11841c.f11753K + C3562b.f11821d, false);
            c0981k.textures().addElement(this.f13150j.get(i).m1985b());
            c0981k.calAABB(1.2f, 1.0f, 1.0f);
            this.f13143b.addChild(c0981k);
        }
        this.f13144d.addChild(this.f13142a);
        this.f13145e = new C0981k(C3566b.f11841c.f11750H, C3566b.f11841c.f11751I, false);
        this.f13146f = new TextureElement(0, false);
        this.f13145e.textures().addElement(this.f13146f);
        this.f13142a.position().f2527y = -C3566b.f11841c.f11751I;
        this.f13144d.addChild(this.f13145e);
        this.f13144d.position().f2527y = C0892a.m10742a(50.0f);
        m890e().addChild(this.f13144d);
    }

    /* renamed from: h */
    private void m899h() {
        m898m();
        Bitmap m609a = C4189x.m609a(C1306b.C1310d.tsf_ico);
        C0853a.m10853g().m10540a(this.f13146f, m609a);
        m609a.recycle();
    }

    /* renamed from: m */
    private void m898m() {
        if (this.f13146f.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13146f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m897n() {
        this.f13149i++;
        if (this.f13149i > this.f13143b.numChildren() - 1) {
            this.f13149i = 0;
        }
        m901a(this.f13149i, true);
        if (this.f13148h) {
            C0853a.m10865a().m10584b(this.f13147g, 2000L);
        }
    }

    /* renamed from: a */
    private void m901a(int i, boolean z) {
        this.f13142a.m10719a((C3566b.f11839a.f11752J * 1.2f * (-i)) + (this.f13142a.m10691i() / 2.0f) + this.f13142a.m10713b(), z);
        this.f13142a.setAnimationObjectState(true);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        this.f13148h = true;
        m899h();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f13150j.size()) {
                this.f13150j.get(i2).m1986a(C3566b.f11841c);
                i = i2 + 1;
            } else {
                m896o();
                m897n();
                return;
            }
        }
    }

    /* renamed from: o */
    private void m896o() {
        this.f13142a.position().f2526x = C0892a.f2590z;
        this.f13142a.setAABBPX(0.0f, (-C0892a.m10742a(500.0f)) / 2.0f, 0.0f, C0892a.f2553D, C0892a.m10742a(500.0f) / 2.0f, 0.0f);
        this.f13142a.m10687k();
        this.f13142a.m10720a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        m896o();
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        int i = 0;
        super.mo538g();
        this.f13148h = false;
        while (true) {
            int i2 = i;
            if (i2 < this.f13150j.size()) {
                this.f13150j.get(i2).m1984c();
                i = i2 + 1;
            } else {
                m898m();
                return;
            }
        }
    }
}
