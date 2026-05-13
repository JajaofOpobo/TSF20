package com.tsf.shell.p096f.p148h;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p051e.C1058a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.h.c */
/* loaded from: classes.dex */
public class C3091c extends C0980j {

    /* renamed from: a */
    private C3084b f10009a;

    /* renamed from: f */
    private C1058a f10014f;

    /* renamed from: g */
    private C1058a f10015g;

    /* renamed from: h */
    private C3100f f10016h;

    /* renamed from: j */
    private AbstractC3208b f10018j;

    /* renamed from: d */
    private float f10012d = C0892a.f2567c * 0.0f;

    /* renamed from: e */
    private float f10013e = 5.0f * C0892a.f2567c;

    /* renamed from: b */
    private float f10010b = ((this.f10012d * 3.0f) + (C3566b.f11840b.f11762T * 4)) + (90.0f * C0892a.f2567c);

    /* renamed from: c */
    private float f10011c = ((this.f10013e * 2.0f) + (C3566b.f11840b.f11763U * 3)) + (50.0f * C0892a.f2567c);

    /* renamed from: i */
    private AbstractC3208b f10017i = m3595a(12, C3595e.f11927l);

    public C3091c(C3084b c3084b) {
        this.f10009a = c3084b;
        this.f10014f = new C1058a(this.f10009a.m3625b().m5462c(), this.f10010b - (C0892a.f2567c * 10.0f), C3566b.f11840b.f11763U, C3566b.f11840b.f11762T, C0892a.f2567c * 40.0f, C0892a.f2567c * 0.0f);
        this.f10014f.addChild(this.f10017i);
        this.f10014f.addChild(m3596a(13));
        this.f10018j = m3596a(11);
        this.f10014f.addChild(this.f10018j);
        this.f10014f.addChild(m3596a(14));
        this.f10014f.position().f2527y = C3566b.f11840b.f11763U + this.f10013e;
        this.f10014f.m10068e();
        addChild(this.f10014f);
        this.f10015g = new C1058a(this.f10009a.m3625b().m5462c(), this.f10010b - (C0892a.f2567c * 10.0f), C3566b.f11840b.f11763U, C3566b.f11840b.f11762T, C0892a.f2567c * 40.0f, C0892a.f2567c * 0.0f);
        this.f10015g.addChild(m3595a(VEasing.Back.easeIn, C3595e.f11916a));
        this.f10015g.addChild(m3595a(300, C3595e.f11920e));
        this.f10015g.addChild(m3596a(800));
        this.f10015g.addChild(m3595a(1700, C3595e.f11930o));
        this.f10015g.addChild(m3595a(1500, C3595e.f11926k));
        this.f10015g.addChild(m3596a(900));
        this.f10015g.addChild(m3596a(VEasing.Linear.easeNone));
        this.f10015g.addChild(m3596a(1400));
        this.f10015g.addChild(m3596a(700));
        this.f10015g.addChild(m3596a(1100));
        this.f10015g.addChild(m3596a(1200));
        this.f10015g.addChild(m3596a(1300));
        this.f10015g.addChild(m3596a(1600));
        this.f10015g.addChild(m3596a(15));
        this.f10015g.m10068e();
        addChild(this.f10015g);
        this.f10016h = new C3100f(this, this.f10009a.m3625b().m5462c(), this.f10010b - (C0892a.f2567c * 10.0f), C3566b.f11840b.f11763U, C3566b.f11840b.f11762T, 40.0f * C0892a.f2567c, 0.0f * C0892a.f2567c);
        this.f10016h.position().f2527y = (-C3566b.f11840b.f11763U) - this.f10013e;
        this.f10016h.m10028d();
        addChild(this.f10016h);
    }

    /* renamed from: a */
    public AbstractC3208b m3596a(int i) {
        AbstractC3208b m2151a = C3519a.m2151a(i, C3566b.f11840b);
        m3594a(m2151a);
        return m2151a;
    }

    /* renamed from: a */
    private AbstractC3208b m3595a(int i, int i2) {
        final AbstractC3208b m3596a = m3596a(i);
        final LauncherShortcutStandardInfo launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) m3596a.m3534K();
        C3595e.C3597a m1929a = C3359a.f11087a.m1929a(i2);
        if (m1929a.m1919a()) {
            launcherShortcutStandardInfo.enableNotifPoint();
            m1929a.m1918a(new C3595e.C3597a.C3598a() { // from class: com.tsf.shell.f.h.c.1
                @Override // com.tsf.shell.manager.p185p.C3595e.C3597a.C3598a
                /* renamed from: a */
                public void mo720a() {
                    launcherShortcutStandardInfo.disableNotifPoint();
                    m3596a.m3162aB();
                }
            });
        }
        return m3596a;
    }

    /* renamed from: a */
    public float m3597a(float f) {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(50);
        C1014c.m10326a(this.f10014f);
        C1014c.m10325a(this.f10014f, 500, c1017d);
        this.f10014f.mouseEnabled(false);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(50);
        C1014c.m10326a(this.f10015g);
        C1014c.m10325a(this.f10015g, 500, c1017d2);
        this.f10015g.mouseEnabled(false);
        return (this.f10011c / 2.0f) + f + C0892a.m10742a(260.0f);
    }

    /* renamed from: a */
    public void m3598a() {
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f10014f);
        C1014c.m10325a(this.f10014f, 500, c1017d);
        this.f10014f.mouseEnabled(true);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(255);
        C1014c.m10326a(this.f10015g);
        C1014c.m10325a(this.f10015g, 500, c1017d2);
        this.f10015g.mouseEnabled(true);
        this.f10016h.m3573p();
    }

    /* renamed from: b */
    public void m3592b() {
        if (C3359a.f11094h.m4122E()) {
            C3567c.m1967a(this.f10017i, C3567c.f11847f);
            C3567c.m1967a(this.f10018j, C3567c.f11847f);
            this.f10017i.mouseEnabled(false);
            this.f10018j.mouseEnabled(false);
        } else {
            C3567c.m1967a(this.f10017i, C3567c.f11846e);
            C3567c.m1967a(this.f10018j, C3567c.f11846e);
            this.f10017i.mouseEnabled(true);
            this.f10018j.mouseEnabled(true);
        }
        this.f10015g.m10084a(1, false);
        this.f10015g.m10084a(0, true);
    }

    /* renamed from: a */
    public static void m3594a(final AbstractC3208b abstractC3208b) {
        abstractC3208b.setMouseEventListener(new C0937a(abstractC3208b) { // from class: com.tsf.shell.f.h.c.2
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                abstractC3208b.mo3094l();
            }
        });
        C3567c.m1967a(abstractC3208b, C3567c.f11846e);
        abstractC3208b.m3152aN();
    }

    /* renamed from: c */
    public float m3591c() {
        return this.f10010b;
    }

    /* renamed from: d */
    public float m3590d() {
        return this.f10011c;
    }

    /* renamed from: a */
    public void m3593a(ArrayList<ItemInfo> arrayList, String str) {
        this.f10016h.m3578a(arrayList, str);
    }

    /* renamed from: e */
    public void m3589e() {
        int numChildren = this.f10014f.numChildren();
        for (int i = 0; i < numChildren; i++) {
            ((AbstractC3208b) this.f10014f.getChildAt(i)).m3162aB();
        }
        int numChildren2 = this.f10015g.numChildren();
        for (int i2 = 0; i2 < numChildren2; i2++) {
            ((AbstractC3208b) this.f10015g.getChildAt(i2)).m3162aB();
        }
    }
}
