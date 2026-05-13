package com.tsf.shell.p096f.p153i;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1025c;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.C2529e;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.c */
/* loaded from: classes.dex */
public class C3231c extends C3112b {

    /* renamed from: b */
    private static C0981k f10549b;

    /* renamed from: f */
    public static TextureElement f10550f;

    /* renamed from: g */
    public static TextureElement f10551g;

    /* renamed from: h */
    public static TextureElement f10552h;

    /* renamed from: j */
    public static int f10553j = (int) (6.0f * C0892a.f2565a);

    /* renamed from: a */
    private boolean f10554a;

    /* renamed from: i */
    public int f10555i;

    /* renamed from: k */
    private boolean f10556k;

    /* renamed from: l */
    private int f10557l;

    /* renamed from: m */
    private float f10558m;

    /* renamed from: n */
    private float f10559n;

    public C3231c(ItemInfo itemInfo) {
        super(itemInfo);
        this.f10554a = false;
        this.f10556k = false;
        this.f10557l = 0;
        this.f10555i = 0;
        this.f10558m = 0.75f;
        this.f10559n = 0.75f;
    }

    /* renamed from: ag */
    public C2570b m3076ag() {
        if (parent() == null) {
            return null;
        }
        if (parent() instanceof C2570b) {
            return (C2570b) parent();
        }
        if (m3486z() != null) {
            return (C2570b) m3486z().m4243S();
        }
        return null;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: m_ */
    public void mo3053m_() {
        if (!this.f10554a) {
            m3074ai();
        } else {
            this.f10554a = false;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: c */
    public void mo3056c() {
        super.mo3056c();
        if (m3064as() && !m3533L()) {
            m3059ax();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: n_ */
    public void mo3052n_() {
        super.mo3052n_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: aa */
    public void mo3078aa() {
        super.mo3078aa();
        m3054k();
    }

    /* renamed from: k */
    private void m3054k() {
        if (C3359a.f11108v.f7772e.m5604d() != null) {
            C3359a.f11108v.f7772e.m5604d().m5289a(true);
        }
    }

    /* renamed from: ah */
    public void m3075ah() {
        this.f10554a = true;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: ab */
    public void mo3077ab() {
        super.mo3077ab();
        this.f10554a = true;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: o_ */
    public void mo3051o_() {
        if (m3064as() && (getMouseEventListener() instanceof C3109c) && !((C3109c) getMouseEventListener()).m3554a()) {
            m3059ax();
        }
        super.mo3051o_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: p_ */
    public void mo3050p_() {
        super.mo3050p_();
        this.f10554a = true;
    }

    /* renamed from: ai */
    public void m3074ai() {
        if (m3076ag() != null && !m3539D()) {
            ArrayList<Integer> m5254s = m3076ag().m5254s();
            C3359a.f11108v.f7772e.m5604d().m5291a(this, m3076ag().mo2131d(), m3076ag().m5255r(), m5254s);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        if (m3068ao()) {
            m3065ar();
        }
        super.mo3055g();
    }

    /* renamed from: a */
    public ArrayList<Integer> mo3079a(ArrayList<Integer> arrayList) {
        return arrayList;
    }

    /* renamed from: aj */
    public static void m3073aj() {
        if (f10550f == null) {
            int m10742a = (int) C0892a.m10742a(120.0f);
            f10550f = ThemeManager.mix.appMutilChoice.getTextureElement(ThemeShellDescription.APP_MULTI_CHOICE, m10742a, m10742a);
            f10551g = ThemeManager.mix.appMutilChoice.getTextureElement(ThemeShellDescription.APP_MULTI_NOT_CHOICE, m10742a, m10742a);
        }
    }

    /* renamed from: ak */
    public void m3072ak() {
        this.f10557l = 1;
    }

    /* renamed from: al */
    public void m3071al() {
        this.f10557l = 0;
    }

    /* renamed from: am */
    public void m3070am() {
        if (!this.f10556k) {
            m3073aj();
            if (f10549b == null) {
                f10549b = new C0981k(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, 1, 1, false);
                f10552h = new TextureElement(f10550f.f2529id, false);
                f10549b.textures().addElementWithoutVerify(f10552h);
                f10549b.position().f2526x = (C3566b.f11839a.f11762T / 2) - (45.0f * C0892a.f2567c);
                f10549b.position().f2527y = (C3566b.f11839a.f11763U / 2) - (25.0f * C0892a.f2567c);
            }
            this.f10558m = 0.75f;
            if (m3068ao()) {
                this.f10559n = 1.0f;
            } else {
                this.f10559n = 0.75f;
            }
            this.f10556k = true;
        }
    }

    /* renamed from: an */
    public void m3069an() {
        this.f10556k = false;
        this.f10557l = 0;
        this.f10559n = 0.75f;
    }

    /* renamed from: ao */
    public boolean m3068ao() {
        return this.f10557l == 1;
    }

    /* renamed from: ap */
    public void m3067ap() {
        if (m3541A() != null) {
            if (m3068ao()) {
                m3065ar();
            } else {
                m3066aq();
            }
        }
    }

    /* renamed from: aq */
    public void m3066aq() {
        this.f10559n = 1.0f;
        this.f10557l = 1;
        m3541A().m3562f();
        m3541A().m3568a(this);
    }

    /* renamed from: ar */
    public void m3065ar() {
        this.f10559n = 0.75f;
        this.f10557l = 0;
        m3541A().m3566b(this);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        if (this.f10556k) {
            f10549b.alpha(alpha());
            this.f10558m += (this.f10559n - this.f10558m) * 0.15f;
            f10549b.scale().setAll(this.f10558m, this.f10558m, 1.0f);
            if (this.f10557l == 0) {
                f10552h.f2529id = f10551g.f2529id;
            } else {
                f10552h.f2529id = f10550f.f2529id;
            }
            f10549b.dispatchDraw();
        }
    }

    /* renamed from: a */
    public void m3080a(C3231c c3231c) {
        C2529e.m5335c(this);
        C2529e.m5334d(c3231c);
    }

    /* renamed from: b */
    public void m3057b(ArrayList<C3231c> arrayList) {
        if (arrayList.size() > 0) {
            C2529e.m5335c(this);
            C2529e.m5339a(arrayList);
            return;
        }
        m3071al();
        m3069an();
    }

    /* renamed from: as */
    public boolean m3064as() {
        return C2529e.m5340a(this);
    }

    /* renamed from: at */
    public int m3063at() {
        return C2529e.m5341a();
    }

    /* renamed from: au */
    public boolean m3062au() {
        return C2529e.m5337b(this);
    }

    /* renamed from: av */
    public ArrayList<C3231c> m3061av() {
        return C2529e.m5338b();
    }

    /* renamed from: aw */
    public ArrayList<C3231c> m3060aw() {
        return C2529e.m5336c();
    }

    /* renamed from: ax */
    public void m3059ax() {
        int i;
        if (m3064as() && m3486z() != null) {
            C2932g z = m3486z();
            if (z.m4203c(this)) {
                ArrayList<C3231c> m3060aw = m3060aw();
                C1025c c1025c = new C1025c(z, true);
                if (400 > C0892a.f2553D) {
                    i = (C0892a.f2553D / 2) - 20;
                } else {
                    i = VEasing.Back.easeIn;
                }
                c1025c.m10265a(i, i);
                ArrayList<C3112b> arrayList = new ArrayList<>();
                Iterator<C3231c> it = m3060aw.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                arrayList.add(0, this);
                c1025c.m10258a(arrayList);
            }
        }
    }

    /* renamed from: ay */
    public void m3058ay() {
        if (m3064as()) {
            C0980j c0980j = (C0980j) parent();
            int childIndexOf = c0980j.getChildIndexOf(this);
            ArrayList<C3231c> m3060aw = m3060aw();
            int size = m3060aw.size();
            for (int i = 0; i < size; i++) {
                C3231c c3231c = m3060aw.get(i);
                C1014c.m10326a(c3231c);
                Number3d.TEMPNUMBER3D.reset();
                c3231c.localToGlobal(Number3d.TEMPNUMBER3D);
                c0980j.globalToLocal(Number3d.TEMPNUMBER3D);
                c3231c.position().f2526x = Number3d.TEMPNUMBER3D.f2526x;
                c3231c.position().f2527y = Number3d.TEMPNUMBER3D.f2527y;
                c3231c.removeFromParent();
                c0980j.addChildAt(c3231c, childIndexOf);
            }
        }
    }
}
