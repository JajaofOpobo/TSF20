package com.tsf.shell.p096f.p148h;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p030a.C0855b;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.h.d */
/* loaded from: classes.dex */
public class C3094d extends C0937a {

    /* renamed from: a */
    private C3084b f10023a;

    /* renamed from: b */
    private boolean f10024b;

    /* renamed from: d */
    private C2951n f10025d;

    /* renamed from: e */
    private final int f10026e;

    /* renamed from: f */
    private int f10027f;

    /* renamed from: g */
    private float f10028g;

    /* renamed from: h */
    private float f10029h;

    /* renamed from: i */
    private float f10030i;

    /* renamed from: j */
    private float f10031j;

    public C3094d(C3084b c3084b, C0975i c0975i) {
        super(c0975i);
        this.f10024b = false;
        this.f10026e = (int) (30.0f * C0892a.f2565a);
        this.f10027f = 0;
        this.f10023a = c3084b;
        this.f10025d = C3359a.f11094h;
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo502a(MotionEvent motionEvent) {
        C4187w.m614b();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: h */
    public void mo3555h(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: c */
    public void mo2122c(MotionEvent motionEvent) {
        C4187w.m616a();
        this.f10024b = true;
        this.f10030i = this.f10023a.m3625b().position().f2526x;
        this.f10031j = this.f10023a.m3625b().position().f2527y;
        this.f10023a.m3602p();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: g */
    public void mo3208g(MotionEvent motionEvent) {
        this.f10024b = false;
        switch (this.f10027f) {
            case 0:
            default:
                return;
            case 1:
                this.f10025d.m4011x();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: d */
    public void mo2119d(MotionEvent motionEvent) {
        this.f10024b = false;
        this.f10023a.m3601q();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f10024b = false;
        switch (this.f10027f) {
            case 0:
            default:
                return;
            case 1:
                this.f10025d.m4011x();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    public void mo1654e(MotionEvent motionEvent) {
        C0855b.f2418d = 500;
        C0855b.f2417c = this.f10026e * this.f10026e;
        this.f10028g = motionEvent.getX();
        this.f10029h = motionEvent.getY();
        C3398f.m2651a();
        if (this.f10025d.m4033m() == 2) {
            this.f10027f = 0;
            return;
        }
        this.f10025d.m4013w();
        this.f10027f = 1;
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: f */
    public void mo1653f(MotionEvent motionEvent) {
        switch (this.f10027f) {
            case 0:
            default:
                this.f10027f = 0;
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.f10024b) {
            this.f10023a.m3631a(this.f10030i + (motionEvent2.getX() - motionEvent.getX()), this.f10031j - (motionEvent2.getY() - motionEvent.getY()));
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f10027f) {
            case 0:
                if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.f10026e) {
                    this.f10027f = 1;
                    switch (this.f10027f) {
                        case 1:
                            this.f10025d.m4013w();
                            this.f10025d.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10028g, this.f10029h);
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                this.f10025d.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10028g, this.f10029h);
                return;
            default:
                return;
        }
    }
}
