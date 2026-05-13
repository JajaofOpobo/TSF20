package com.tsf.shell.p096f.p153i.p155b.p160e;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.b.e.c */
/* loaded from: classes.dex */
public class C3211c extends C3216d {

    /* renamed from: a */
    private static C0981k f10509a;

    /* renamed from: b */
    private static TextureElement f10510b = new TextureElement(0, false);

    /* renamed from: p */
    private static float f10511p = 0.0f;

    /* renamed from: q */
    private static ArrayList<C3211c> f10512q = new ArrayList<>();

    /* renamed from: r */
    private static C1017d f10513r = new C1017d();

    /* renamed from: s */
    private LauncherShortcutStandardInfo.ResourceControler f10514s;

    /* renamed from: t */
    private int f10515t;

    /* renamed from: aV */
    public static void m3127aV() {
        if (f10512q != null) {
            Iterator<C3211c> it = f10512q.iterator();
            while (it.hasNext()) {
                C3211c next = it.next();
                next.mo1827k();
                next.mo3118C();
            }
        }
    }

    public C3211c(LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a, boolean z, int i) {
        super(launcherShortcut3DInfo, c3560a, z);
        this.f10515t = i;
        int i2 = (int) (45.0f * C0892a.f2567c * m3159aE().f11743A);
        if (f10509a == null) {
            f10509a = new C0981k(i2, i2, false) { // from class: com.tsf.shell.f.i.b.e.c.1
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawStart() {
                    if (C3211c.f10510b.f2529id == 0) {
                        int i3 = C3566b.f11839a.f11750H;
                        Bitmap bitmap = ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_POINT, i3, i3);
                        C0853a.m10853g().m10540a(C3211c.f10510b, bitmap);
                        bitmap.recycle();
                    }
                }
            };
            f10509a.position().f2527y = m3159aE().f11767Y;
            f10509a.rotation().f2528z = f10511p;
            f10509a.textures().addElement(f10510b);
        }
        f10512q.add(this);
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.C3216d
    /* renamed from: aW */
    public LauncherShortcutStandardInfo.ResourceControler mo3122aW() {
        if (this.f10514s == null) {
            this.f10514s = new LauncherShortcutStandardInfo.ResourceControler() { // from class: com.tsf.shell.f.i.b.e.c.2
                @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo.ResourceControler
                public Bitmap getThemeBitmap(C3560a c3560a) {
                    return ThemeManager.mix.action.getTheme().getBitmap(ThemeShellDescription.ACTION_APP_DRAWER_ICON, c3560a.f11750H, c3560a.f11751I);
                }
            };
        }
        return this.f10514s;
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: aH */
    public C3109c mo3130aH() {
        return new C3215a(this);
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: aF */
    public C0962a mo3131aF() {
        C0962a c0962a = new C0962a(2, 0, m3159aE().f11764V, m3159aE().f11765W) { // from class: com.tsf.shell.f.i.b.e.c.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (parent() != null && C3211c.f10510b != null && C3211c.this.f10514s != null && !C3211c.this.f10514s.isCustomResource()) {
                    C3211c.f10509a.dispatchDraw();
                }
            }
        };
        m3159aE().m2014a(c0962a);
        return c0962a;
    }

    /* renamed from: h */
    public static void m3123h(float f) {
        if (f != f10511p) {
            f10511p = f;
            if (f10509a != null) {
                f10513r.m10303e(f);
                f10513r.m10313a(C0986a.f2950e);
                C1014c.m10326a(f10509a);
                C1014c.m10325a(f10509a, 500, f10513r);
            }
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: aO */
    public void mo3129aO() {
        m3159aE().m2012a(this, this.f10497m.m10404l());
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: aP */
    public void mo3128aP() {
        C3398f.m2651a();
        if (this.f10514s.isCustomResource()) {
            super.mo3128aP();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.C3216d, com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        if (f10512q.contains(this)) {
            f10512q.remove(this);
        }
        if (f10512q.size() == 0) {
            C0853a.m10853g().m10543a(f10510b);
            f10510b = null;
        }
        super.mo3055g();
    }

    /* renamed from: com.tsf.shell.f.i.b.e.c$a */
    /* loaded from: classes.dex */
    class C3215a extends C3109c {

        /* renamed from: h */
        private float f10520h;

        /* renamed from: i */
        private float f10521i;

        /* renamed from: j */
        private AbstractC3208b f10522j;

        /* renamed from: k */
        private boolean f10523k;

        public C3215a(AbstractC3208b abstractC3208b) {
            super(abstractC3208b);
            this.f10523k = false;
            this.f10522j = abstractC3208b;
        }

        @Override // com.tsf.shell.p096f.p153i.p154a.C3109c, com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo502a(MotionEvent motionEvent) {
            C3359a.f11090d.m2670a(C3211c.this.f10515t);
        }

        @Override // com.tsf.shell.p096f.p153i.p154a.C3109c, com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: e */
        public void mo1654e(MotionEvent motionEvent) {
            this.f10523k = false;
            this.f10520h = motionEvent.getX();
            this.f10521i = motionEvent.getY();
            this.f10522j.m3151aQ();
            C3398f.m2651a();
        }

        @Override // com.tsf.shell.p096f.p153i.p154a.C3109c, com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f10523k) {
                C3359a.f11094h.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10520h, this.f10521i);
                return;
            }
            C3359a.f11094h.m4013w();
            C3359a.f11094h.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10520h, this.f10521i);
            this.f10523k = true;
        }

        @Override // com.tsf.shell.p096f.p153i.p154a.C3109c, com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: f */
        public void mo1653f(MotionEvent motionEvent) {
            if (this.f10523k) {
                C3359a.f11094h.m4011x();
                this.f10523k = false;
            }
        }
    }
}
