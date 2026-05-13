package com.tsf.shell.p096f.p153i.p154a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.p096f.p131f.C2951n;
/* renamed from: com.tsf.shell.f.i.a.a */
/* loaded from: classes.dex */
public class C3107a extends C0937a {

    /* renamed from: a */
    private boolean f10075a;

    /* renamed from: b */
    private C2951n.C2977c f10076b;

    public C3107a(C0980j c0980j) {
        super(c0980j);
        this.f10075a = true;
    }

    /* renamed from: a */
    public void m3557a(C2951n.C2977c c2977c) {
        this.f10076b = c2977c;
    }

    /* renamed from: a */
    public void m3556a(boolean z) {
        this.f10075a = z;
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: h */
    public void mo3555h(MotionEvent motionEvent) {
        C3398f.m2638b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f10075a) {
            C3359a.f11094h.m4021s().m3930a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f10075a) {
            C3359a.f11094h.m4021s().m3896d(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: f */
    public void mo1653f(MotionEvent motionEvent) {
        if (this.f10075a) {
            C3359a.f11094h.m4021s().m3897d(motionEvent);
        }
        if (this.f10075a) {
            C3359a.f11092f.m1591c().sendWallpaperCommand(Home.m6177b().m6164l().getWindowToken(), "android.wallpaper.tap", (int) motionEvent.getX(), (int) motionEvent.getY(), 0, null);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: i */
    public void mo3544i(MotionEvent motionEvent) {
        if (this.f10075a) {
            C3359a.f11094h.m4021s().m3914b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: j */
    public void mo3543j(MotionEvent motionEvent) {
        if (this.f10075a) {
            C3359a.f11094h.m4021s().m3904c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: c */
    public void mo2122c(MotionEvent motionEvent) {
        if (this.f10075a && !this.f10076b.m3938a()) {
            C3359a.f11101o.m3604n();
        } else {
            C3359a.f11101o.m3604n();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    public void mo1654e(MotionEvent motionEvent) {
        C3398f.m2644a(motionEvent);
    }
}
