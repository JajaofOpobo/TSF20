package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p051e.C1064b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.c.f */
/* loaded from: classes.dex */
public class C2786f extends C2792i {

    /* renamed from: g */
    private C1064b f9117g;

    /* renamed from: h */
    private C0984m f9118h;

    /* renamed from: i */
    private float f9119i;

    public C2786f(C2862h c2862h, C2843f c2843f) {
        super(c2862h, c2843f, C1306b.C1310d.drawer_hide, C4189x.m588c(C1306b.C1315i.text_hide));
        float f = 0.8f * (C3566b.f11841c.f11763U / C3566b.f11839a.f11763U);
        this.f9119i = C3566b.f11839a.f11763U * f;
        this.f9117g = new C1064b(C0892a.f2553D, this.f9119i, C3566b.f11839a.f11763U * f, 30.0f * C0892a.f2567c * f, 10.0f * C0892a.f2567c * f, f) { // from class: com.tsf.shell.f.f.a.c.f.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: a */
            public void mo4667a(int i) {
                if (i > 0) {
                    C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.f.1.1
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            C2786f.this.f9118h.visible(false);
                            C2786f.this.f9118h.m10358a();
                        }
                    };
                    c1017d.mo10298h(C0892a.m10742a(-150.0f));
                    c1017d.m10314a(0);
                    C1014c.m10326a(C2786f.this.f9118h);
                    C1014c.m10325a(C2786f.this.f9118h, 300, c1017d);
                    return;
                }
                C1017d c1017d2 = new C1017d();
                c1017d2.mo10298h(0.0f);
                c1017d2.m10314a(255);
                C1014c.m10326a(C2786f.this.f9118h);
                C1014c.m10325a(C2786f.this.f9118h, 300, c1017d2);
                C2786f.this.f9118h.visible(true);
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
            /* renamed from: b */
            public void mo4666b(C0975i c0975i) {
                C3231c c3231c = c0975i instanceof C3231c ? (C3231c) c0975i : null;
                if (c3231c != null && c3231c.m3534K() != null) {
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) c3231c.m3534K();
                    launcherShortcutAppInfo.isHide = false;
                    C3359a.f11109w.m2708c().m2733a(launcherShortcutAppInfo, 64);
                }
            }
        };
        addChild(this.f9117g);
        this.f9118h = new C0984m();
        this.f9118h.m10349c(C1306b.C1315i.notic_hide_app);
        this.f9118h.m10347d(38);
        this.f9118h.m10345e(-1);
        C3567c.m1967a(this.f9118h, C3567c.f11849h);
        addChild(this.f9118h);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4616a(int i, int i2, int i3, int i4) {
        this.f9117g.m10045a(i, (-this.f9119i) / 2.0f, i3, this.f9119i / 2.0f);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4613b() {
        this.f9118h.m10358a();
    }

    /* renamed from: a */
    public void m4668a(ArrayList<C3112b> arrayList) {
        Iterator<C3112b> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f9117g.m10026d(it.next());
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: c */
    public void mo4651c(C3231c c3231c, MotionEvent motionEvent) {
        this.f9129b.m4546b().mo4651c(c3231c, motionEvent);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: d */
    public void mo4649d(C3231c c3231c, MotionEvent motionEvent) {
        this.f9129b.m4546b().mo4649d(c3231c, motionEvent);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4658a(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f9129b.m4546b().mo4658a(c3231c, motionEvent, motionEvent2);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: e */
    public void mo4647e(C3231c c3231c, MotionEvent motionEvent) {
        if ((c3231c.parent() instanceof C2676a) && (c3231c instanceof AbstractC3208b)) {
            this.f9128a.m4417c((C3112b) c3231c);
            this.f9117g.m10026d(c3231c);
            if (c3231c.m3534K() != null) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) c3231c.m3534K();
                launcherShortcutAppInfo.isHide = true;
                C3359a.f11109w.m2708c().m2733a(launcherShortcutAppInfo, 68);
            }
        } else if (c3231c.parent() == this.f9117g.m10008l()) {
            c3231c.visible(true);
            c3231c.scale().setAll(1.0f, 1.0f, 1.0f);
            Number3d.TEMPNUMBER3D.reset();
            Number3d localToGlobal = c3231c.localToGlobal(Number3d.TEMPNUMBER3D);
            this.f9117g.removeChild(c3231c);
            C2676a m4451ap = this.f9128a.m4451ap();
            c3231c.position().setAllFrom(m4451ap.globalToLocal(localToGlobal));
            m4451ap.addChildAt(c3231c, 0);
            this.f9128a.m4491a(c3231c, m4451ap, 0);
            this.f9128a.m4452ao().m4807c();
        }
    }
}
