package com.tsf.shell.manager.p187r.p189b.p192c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0970d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.r.b.c.h */
/* loaded from: classes.dex */
public class C3678h extends C0980j {

    /* renamed from: a */
    private static C0981k f12138a;

    /* renamed from: b */
    private static TextureElement f12139b = new TextureElement(0, false);

    /* renamed from: c */
    private C0970d f12140c;

    /* renamed from: d */
    private C0975i f12141d;

    /* renamed from: e */
    private C0980j f12142e;

    /* renamed from: f */
    private C0975i f12143f;

    /* renamed from: g */
    private AbstractC3341e f12144g;

    /* renamed from: h */
    private float f12145h;

    /* renamed from: i */
    private float f12146i;

    /* renamed from: j */
    private float f12147j;

    /* renamed from: k */
    private float f12148k = 0.0f * C0892a.f2567c;

    public C3678h(float f, float f2, float f3, boolean z) {
        this.f12146i = f;
        this.f12147j = f2;
        this.f12145h = f3;
        this.f12140c = new C0970d(f, f2 - this.f12145h);
        this.f12140c.m10378a(553648127, ThemeElementType.PARSER_CONFIG_ALL);
        if (z) {
            addChild(this.f12140c);
        }
        this.f12142e = new C0980j() { // from class: com.tsf.shell.manager.r.b.c.h.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                Number3d.TEMPNUMBER3D.reset();
                Number3d localToGlobal = localToGlobal(Number3d.TEMPNUMBER3D);
                C0853a.m10855e().m10770b(localToGlobal.f2526x, localToGlobal.f2527y);
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawEnd() {
                C0853a.m10855e().m10764f();
            }
        };
        addChild(this.f12142e);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        if ((this.f12144g instanceof C3343g) && !((C3343g) this.f12144g).m2789j()) {
            if (f12139b.f2529id == 0) {
                Bitmap m609a = C4189x.m609a(C1306b.C1310d.widget_item_download);
                C0853a.m10853g().m10540a(f12139b, m609a);
                m609a.recycle();
            }
            if (f12138a == null) {
                f12138a = new C0981k(C0892a.f2567c * 84.0f, C0892a.f2567c * 84.0f, false);
                f12138a.textures().addElement(f12139b);
                f12138a.position().f2526x = ((this.f12146i / 2.0f) - (f12138a.mo10366b() / 2.0f)) - C0892a.m10742a(10.0f);
                f12138a.position().f2527y = (((this.f12147j - this.f12145h) / 2.0f) - (f12138a.mo10365c() / 2.0f)) - C0892a.m10742a(10.0f);
            }
            f12138a.dispatchDraw();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
    }

    /* renamed from: a */
    public void m1739a(C0975i c0975i) {
        c0975i.removeFromParent();
        this.f12142e.addChild(c0975i);
    }

    /* renamed from: a */
    public C0975i m1741a() {
        return this.f12143f;
    }

    /* renamed from: a */
    public void m1738a(AbstractC3341e abstractC3341e, boolean z) {
        C0975i mo1624a = abstractC3341e.mo1624a((int) this.f12146i, (int) this.f12147j, z);
        if (this.f12140c.m10372b() != this.f12147j) {
            this.f12140c.m10371b(this.f12147j - this.f12145h);
        }
        if (this.f12143f != mo1624a) {
            this.f12142e.removeChild(this.f12143f);
            this.f12143f = mo1624a;
            this.f12144g = abstractC3341e;
            if (this.f12144g != null) {
                this.f12144g.mo2790h();
            }
            this.f12143f.removeFromParent();
            this.f12142e.addChild(this.f12143f);
            this.f12143f.position().f2528z = this.f12148k;
        } else if (this.f12144g != null) {
            this.f12144g.mo2790h();
        }
        C0975i m2808b = abstractC3341e.m2808b((int) (this.f12146i - C0892a.m10742a(20.0f)));
        if (this.f12141d != m2808b) {
            removeChild(this.f12141d);
            this.f12141d = m2808b;
            this.f12141d.removeFromParent();
            addChild(this.f12141d);
            this.f12141d.position().f2527y = (-this.f12147j) / 2.0f;
        }
    }

    /* renamed from: b */
    public float m1737b() {
        return this.f12146i;
    }

    /* renamed from: c */
    public float m1736c() {
        return this.f12147j;
    }

    /* renamed from: a */
    public void m1740a(float f, float f2) {
        this.f12146i = f;
        this.f12147j = f2;
        this.f12140c.m10373a(f);
        this.f12140c.m10371b(f2 - this.f12145h);
    }

    /* renamed from: d */
    public void m1735d() {
        if (this.f12143f != null) {
            this.f12142e.removeChild(this.f12143f);
            this.f12144g.mo2791g();
            this.f12143f = null;
            this.f12144g = null;
        }
        if (this.f12141d != null) {
            removeChild(this.f12141d);
            this.f12141d = null;
        }
    }
}
