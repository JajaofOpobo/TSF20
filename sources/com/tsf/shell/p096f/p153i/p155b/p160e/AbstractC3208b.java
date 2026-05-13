package com.tsf.shell.p096f.p153i.p155b.p160e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.InterfaceC2639m;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p154a.C3111d;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.e.b */
/* loaded from: classes.dex */
public abstract class AbstractC3208b extends C3231c implements InterfaceC2639m {

    /* renamed from: a */
    private static int[] f10490a = {0, 0};

    /* renamed from: v */
    private static ArrayList<C3210a> f10491v = new ArrayList<>();

    /* renamed from: w */
    private static int f10492w = 0;

    /* renamed from: x */
    private static int f10493x = 2;

    /* renamed from: b */
    private boolean f10494b;

    /* renamed from: k */
    public C0962a f10495k;

    /* renamed from: l */
    public C0964b f10496l;

    /* renamed from: m */
    public C0964b f10497m;

    /* renamed from: n */
    public C3560a f10498n;

    /* renamed from: o */
    public boolean f10499o;

    /* renamed from: p */
    private boolean f10500p;

    /* renamed from: q */
    private float f10501q;

    /* renamed from: r */
    private boolean f10502r;

    /* renamed from: s */
    private AbstractC2374a f10503s;

    /* renamed from: t */
    private boolean f10504t;

    /* renamed from: u */
    private C3210a f10505u;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo1827k();

    public AbstractC3208b(LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a) {
        super(launcherShortcut3DInfo);
        this.f10494b = true;
        this.f10500p = true;
        this.f10502r = false;
        this.f10499o = false;
        this.f10504t = false;
        this.f10498n = c3560a;
        useVBO(false);
        m3498i(false);
        this.f10495k = mo3131aF();
        this.f10496l = this.f10495k.m10456a(0);
        this.f10497m = this.f10495k.m10456a(1);
        m3510c(1.2f);
        m3496k(true);
        mo3129aO();
        setMouseEventListener(mo3130aH());
        addChild(this.f10495k);
        m3497j(true);
    }

    /* renamed from: f */
    public void m3137f(float f) {
        this.f10501q = f;
    }

    /* renamed from: az */
    public float m3146az() {
        return this.f10501q;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        m3163aA();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
        if (interfaceC2557f instanceof AbstractC3208b) {
            m3169a((C0975i) ((AbstractC3208b) interfaceC2557f));
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: d */
    public void mo3140d(InterfaceC2557f interfaceC2557f) {
        if (interfaceC2557f instanceof AbstractC3208b) {
            m3144b((C0975i) ((AbstractC3208b) interfaceC2557f));
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: e */
    public void mo3139e(InterfaceC2557f interfaceC2557f) {
        if ((interfaceC2557f instanceof AbstractC3208b) && this.f10505u != null) {
            C3145b m3164a = m3164a((AbstractC3208b) interfaceC2557f, false);
            m3164a.m3534K().screen = m3534K().screen;
            m3164a.m3514ad();
            m3164a.setMouseEventListener(new C3109c(m3164a));
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
        return (interfaceC2557f instanceof C3231c) && ((C3231c) interfaceC2557f).m3062au();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return interfaceC2557f instanceof AbstractC3208b;
    }

    /* renamed from: aA */
    public void m3163aA() {
        if (!this.f10502r) {
            if (this.f10495k.textures().size() == 0 || this.f10495k.textures().get(0).textureElement.f2529id == 0) {
                this.f10502r = true;
                m3133q();
                return;
            }
            this.f10502r = true;
        }
    }

    /* renamed from: aB */
    public void m3162aB() {
        mo1827k();
    }

    /* renamed from: aC */
    public boolean m3161aC() {
        return this.f10502r;
    }

    /* renamed from: aD */
    public void m3160aD() {
        this.f10502r = false;
    }

    /* renamed from: q */
    private void m3133q() {
        if (!m3492t()) {
            mo1827k();
        }
    }

    /* renamed from: aE */
    public C3560a m3159aE() {
        return this.f10498n;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public boolean doubleSidedEnabled() {
        return this.f10495k.doubleSidedEnabled();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void doubleSidedEnabled(boolean z) {
        this.f10495k.doubleSidedEnabled(z);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void alpha(float f) {
        this.f10495k.alpha(f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public float alpha() {
        return this.f10495k.alpha();
    }

    /* renamed from: aF */
    public C0962a mo3131aF() {
        return this.f10498n.m2010b();
    }

    /* renamed from: aG */
    public int[] m3158aG() {
        f10490a[0] = this.f10498n.f11750H;
        f10490a[1] = this.f10498n.f11751I;
        return f10490a;
    }

    /* renamed from: aH */
    public C3109c mo3130aH() {
        return new C3111d(this);
    }

    /* renamed from: l */
    public void m3134l(boolean z) {
        this.f10500p = z;
    }

    /* renamed from: aI */
    public boolean m3157aI() {
        return this.f10500p;
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c, com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: g */
    public void mo3135g(InterfaceC2557f interfaceC2557f) {
        m3536I();
        super.mo3135g(interfaceC2557f);
    }

    /* renamed from: a */
    public static void m3171a(Bitmap bitmap) {
    }

    /* renamed from: aJ */
    public float m3156aJ() {
        return this.f10497m.f2855o.f2526x;
    }

    /* renamed from: g */
    public void m3136g(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.f10497m.f2855o.f2526x) {
            this.f10497m.f2855o.f2526x = f;
            this.f10497m.f2855o.f2527y = f;
            this.f10497m.m10411f();
            if (f == 0.0f) {
                m3154aL();
            } else if (!this.f10497m.m10404l()) {
                m3153aM();
            }
        }
    }

    /* renamed from: aK */
    public boolean m3155aK() {
        return !this.f10497m.m10404l();
    }

    /* renamed from: aL */
    public void m3154aL() {
        if (this.f10497m.m10404l()) {
            this.f10497m.m10435a((Boolean) false);
            mo3129aO();
        }
    }

    /* renamed from: aM */
    public void m3153aM() {
        if (!this.f10497m.m10404l()) {
            this.f10497m.m10435a((Boolean) true);
            mo3129aO();
        }
    }

    /* renamed from: aN */
    public void m3152aN() {
        this.f10494b = false;
    }

    /* renamed from: aO */
    public void mo3129aO() {
        if (this.f10498n != null) {
            this.f10498n.m2012a(this, this.f10497m.m10404l());
        }
    }

    /* renamed from: a */
    public void m3170a(Number3d number3d, Number3d number3d2) {
        m3145b(number3d, number3d2);
    }

    /* renamed from: a */
    public void m3168a(AbstractC2374a abstractC2374a) {
        m3143b(abstractC2374a);
    }

    /* renamed from: b */
    public void m3145b(Number3d number3d, Number3d number3d2) {
        if (this.f10494b) {
            this.f10503s = C3359a.f11108v.f7769b.m5644a(this, number3d, number3d2);
        }
    }

    /* renamed from: aP */
    public void mo3128aP() {
        if (this.f10494b) {
            this.f10503s = C3359a.f11108v.f7769b.m5645a(this);
        }
    }

    /* renamed from: b */
    public void m3143b(AbstractC2374a abstractC2374a) {
        if (this.f10494b) {
            C3359a.f11108v.f7769b.m5643a(this, abstractC2374a);
        }
    }

    /* renamed from: aQ */
    public void m3151aQ() {
        if (m3161aC()) {
            mo3128aP();
        }
    }

    /* renamed from: l */
    public void mo3094l() {
        C4187w.m614b();
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        this.f10498n = null;
        this.f10503s = null;
        super.mo3055g();
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2639m
    /* renamed from: e_ */
    public boolean mo3138e_() {
        return this.f10504t;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2639m
    /* renamed from: b */
    public void mo3142b(boolean z) {
        this.f10504t = z;
    }

    @Override // com.tsf.shell.p096f.p118e.InterfaceC2639m
    /* renamed from: d */
    public boolean mo3141d() {
        return true;
    }

    /* renamed from: a */
    public boolean m3169a(C0975i c0975i) {
        if (this.f10505u == null) {
            this.f10505u = m3149aS();
        }
        if (this.f10505u == null) {
            return false;
        }
        this.f10505u.f10507a.m3391a(this, this.f10505u.f10508b, c0975i);
        return true;
    }

    /* renamed from: b */
    public void m3144b(C0975i c0975i) {
        if (this.f10505u != null) {
            this.f10505u.f10507a.m3400a(c0975i, new Runnable() { // from class: com.tsf.shell.f.i.b.e.b.1
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC3208b.this.f10505u.f10508b.removeFromParent();
                    AbstractC3208b.this.f10495k.visible(true);
                    AbstractC3208b.m3167a(AbstractC3208b.this.f10505u);
                    AbstractC3208b.this.f10505u = null;
                }
            });
        }
    }

    /* renamed from: a */
    public C3145b m3164a(AbstractC3208b abstractC3208b, boolean z) {
        C3145b c3145b = this.f10505u.f10507a;
        this.f10505u.f10507a.removeFromParent();
        this.f10505u.f10507a.m3390a(this, abstractC3208b, z);
        this.f10505u = null;
        this.f10495k.visible(true);
        m3148aT();
        return c3145b;
    }

    /* renamed from: aR */
    public static boolean m3150aR() {
        return f10492w < f10493x || f10491v.size() > 0;
    }

    /* renamed from: aS */
    public static C3210a m3149aS() {
        if (f10491v.isEmpty()) {
            if (f10492w >= f10493x) {
                return null;
            }
            return m3147aU();
        }
        return f10491v.remove(0);
    }

    /* renamed from: aT */
    public static void m3148aT() {
        f10492w--;
    }

    /* renamed from: aU */
    public static C3210a m3147aU() {
        C3210a c3210a = new C3210a();
        c3210a.f10507a = new C3145b(new LauncherDrawerFolder3DInfo(true));
        c3210a.f10508b = new C3224h();
        f10492w++;
        return c3210a;
    }

    /* renamed from: a */
    public static void m3167a(C3210a c3210a) {
        c3210a.f10508b.f10495k.textures().clear();
        f10491v.add(c3210a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.b.e.b$a */
    /* loaded from: classes.dex */
    public static class C3210a {

        /* renamed from: a */
        public C3145b f10507a;

        /* renamed from: b */
        public C3224h f10508b;

        C3210a() {
        }
    }
}
