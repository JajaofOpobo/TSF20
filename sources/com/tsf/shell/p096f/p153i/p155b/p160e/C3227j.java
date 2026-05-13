package com.tsf.shell.p096f.p153i.p155b.p160e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.action.toggle.C3403a;
import com.tsf.shell.manager.action.toggle.C3414b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.i.b.e.j */
/* loaded from: classes.dex */
public class C3227j extends AbstractC3208b {

    /* renamed from: a */
    private C3414b f10535a;

    /* renamed from: b */
    private C0981k f10536b;

    /* renamed from: p */
    private TextureElement f10537p;

    /* renamed from: q */
    private int f10538q;

    /* renamed from: r */
    private int f10539r;

    /* renamed from: s */
    private boolean f10540s;

    /* renamed from: t */
    private int f10541t;

    /* renamed from: u */
    private int f10542u;

    /* renamed from: v */
    private C0964b f10543v;

    /* renamed from: w */
    private C0964b f10544w;

    /* renamed from: x */
    private String f10545x;

    public C3227j(C3414b c3414b) {
        super(null, C3566b.f11840b);
        this.f10538q = 0;
        this.f10539r = -1;
        this.f10540s = false;
        this.f10541t = 0;
        this.f10542u = 0;
        this.f10535a = c3414b;
        this.f10537p = new TextureElement(0, false);
        this.f10536b = new C0981k(this.f10498n.f11750H, this.f10498n.f11751I, false) { // from class: com.tsf.shell.f.i.b.e.j.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C3227j.this.f10538q == 1) {
                    rotation().f2528z += 5.0f;
                }
            }
        };
        float m10742a = C0892a.m10742a(4.0f);
        this.f10536b.position().f2527y = this.f10498n.f11767Y - m10742a;
        addChild(this.f10536b);
        this.f10536b.visible(false);
        this.f10543v = this.f10495k.m10456a(0);
        this.f10543v.m10407i().f2527y -= m10742a;
        this.f10543v.m10408h();
        this.f10544w = this.f10495k.m10456a(1);
        this.f10495k.visible(false);
        this.f10495k.textures().addElement(this.f10537p);
        C3386b.C3389a m2628b = C3403a.m2628b(this.f10535a.f11287a);
        this.f10545x = m2628b.f11195b;
        int i = m2628b.f11196c;
        this.f10542u = i;
        this.f10541t = i;
    }

    /* renamed from: q */
    public TextureElement m3082q() {
        return this.f10537p;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: j */
    public void mo3083j() {
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: q_ */
    public void mo3081q_() {
    }

    /* renamed from: aV */
    public void m3091aV() {
        this.f10535a.mo2602c();
    }

    /* renamed from: b */
    public void m3087b(int i) {
        this.f10541t = i;
    }

    /* renamed from: aY */
    private void m3088aY() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.b.e.j.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C0853a.m10853g().m10543a(C3227j.this.f10537p);
                C3227j.this.m3090aW();
                C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.i.b.e.j.2.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                    }
                };
                c1017d2.m10294l(1.0f);
                c1017d2.m10293m(1.0f);
                C1014c.m10326a(C3227j.this.f10543v);
                C1014c.m10325a(C3227j.this.f10543v, 300, c1017d2);
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        C1014c.m10326a(this.f10543v);
        C1014c.m10325a(this.f10543v, 300, c1017d);
    }

    /* renamed from: c */
    public void m3085c(int i) {
        this.f10538q = i;
        invalidate();
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f10539r != this.f10538q) {
            this.f10539r = this.f10538q;
            switch (this.f10538q) {
                case 0:
                    C3567c.m1967a(this.f10495k, C3567c.f11848g);
                    C3567c.m1967a(this.f10536b, C3567c.f11848g);
                    this.f10536b.setAnimationObjectState(false);
                    this.f10536b.textures().clear();
                    this.f10536b.textures().addElement(C3359a.f11090d.f11189c.m2629b());
                    break;
                case 1:
                    this.f10536b.textures().clear();
                    this.f10536b.textures().addElement(C3359a.f11090d.f11189c.m2626c());
                    this.f10536b.setAnimationObjectState(true);
                    break;
                case 2:
                    C3567c.m1967a(this.f10495k, C3567c.f11846e);
                    C3567c.m1967a(this.f10536b, C3567c.f11846e);
                    this.f10536b.setAnimationObjectState(false);
                    this.f10536b.textures().clear();
                    this.f10536b.textures().addElement(C3359a.f11090d.f11189c.m2629b());
                    break;
            }
        }
        if (this.f10542u != this.f10541t) {
            this.f10542u = this.f10541t;
            m3088aY();
        }
    }

    /* renamed from: aW */
    public void m3090aW() {
        if (this.f10537p.f2529id == 0) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f10498n.f11750H, this.f10498n.f11751I, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap m608a = C4189x.m608a(this.f10542u, C0892a.m10742a(96.0f), C0892a.m10742a(96.0f));
            canvas.drawBitmap(m608a, (createBitmap.getWidth() - m608a.getWidth()) / 2, (createBitmap.getHeight() - m608a.getHeight()) / 2, (Paint) null);
            m608a.recycle();
            Bitmap createTextureBitmap = LauncherShortcutStandardInfo.createTextureBitmap(this.f10545x, createBitmap, this.f10498n, false);
            createBitmap.recycle();
            C0853a.m10853g().m10540a(this.f10537p, createTextureBitmap);
            createTextureBitmap.recycle();
        }
        if (this.f10536b.textures().size() == 0) {
            this.f10536b.textures().addElement(C3359a.f11090d.f11189c.m2629b());
        }
        this.f10536b.visible(true);
        this.f10495k.visible(true);
    }

    /* renamed from: aX */
    public void m3089aX() {
        if (this.f10537p.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f10537p);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        this.f10536b.textures().clear();
        super.mo3055g();
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: k */
    protected void mo1827k() {
    }
}
