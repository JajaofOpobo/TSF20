package com.tsf.shell.p096f.p101c.p102a;

import android.util.Log;
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
/* renamed from: com.tsf.shell.f.c.a.a */
/* loaded from: classes.dex */
public class C2287a extends C0937a {

    /* renamed from: a */
    private boolean f7461a;

    /* renamed from: b */
    private C2951n f7462b;

    /* renamed from: d */
    private final int f7463d;

    /* renamed from: e */
    private int f7464e;

    /* renamed from: f */
    private float f7465f;

    /* renamed from: g */
    private float f7466g;

    /* renamed from: h */
    private float f7467h;

    /* renamed from: i */
    private float f7468i;

    /* renamed from: j */
    private C2326f f7469j;

    /* renamed from: k */
    private C2298b f7470k;

    public C2287a(C0975i c0975i, C2326f c2326f) {
        super(c0975i);
        this.f7461a = false;
        this.f7463d = (int) (30.0f * C0892a.f2565a);
        this.f7464e = 0;
        this.f7469j = c2326f;
        this.f7470k = this.f7469j.m5824g();
        this.f7462b = C3359a.f11094h;
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo502a(MotionEvent motionEvent) {
        C4187w.m614b();
        if (this.f7469j.m5802r()) {
            this.f7469j.m5796u();
        } else {
            this.f7469j.m5798t();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: h */
    public void mo3555h(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: c */
    public void mo2122c(MotionEvent motionEvent) {
        C4187w.m616a();
        this.f7461a = true;
        this.f7469j.m5808o();
        this.f7467h = this.f7469j.m5822h().position().f2526x;
        this.f7468i = this.f7469j.m5822h().position().f2527y;
        this.f7469j.m5814l();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: g */
    public void mo3208g(MotionEvent motionEvent) {
        this.f7461a = false;
        switch (this.f7464e) {
            case 0:
            case 3:
            default:
                return;
            case 1:
                this.f7462b.m4011x();
                return;
            case 2:
                this.f7470k.m5897c();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: d */
    public void mo2119d(MotionEvent motionEvent) {
        this.f7461a = false;
        this.f7469j.m5804q();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f7461a = false;
        switch (this.f7464e) {
            case 0:
            case 3:
            default:
                return;
            case 1:
                this.f7462b.m4011x();
                return;
            case 2:
                this.f7470k.m5897c();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    public void mo1654e(MotionEvent motionEvent) {
        C0855b.f2418d = 1000;
        C0855b.f2417c = this.f7463d * this.f7463d;
        this.f7465f = motionEvent.getX();
        this.f7466g = motionEvent.getY();
        C3398f.m2651a();
        if (this.f7462b.m4033m() == 2) {
            this.f7464e = 0;
        } else {
            this.f7462b.m4013w();
            this.f7464e = 1;
        }
        this.f7469j.m5818j();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: f */
    public void mo1653f(MotionEvent motionEvent) {
        this.f7469j.m5814l();
        switch (this.f7464e) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                this.f7464e = 0;
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.f7461a) {
            this.f7469j.m5855a((int) (this.f7467h + (motionEvent2.getX() - motionEvent.getX())), (int) (this.f7468i - (motionEvent2.getY() - motionEvent.getY())));
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Log.w("ddddddd", "ddddddd:" + this.f7464e);
        switch (this.f7464e) {
            case 0:
                if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.f7463d) {
                    this.f7464e = C3359a.f11093g.f7459b.m5856a((C4189x.m587d(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) + 90.0f) * (-1.0f));
                    switch (this.f7464e) {
                        case 1:
                            this.f7462b.m4013w();
                            this.f7462b.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f7465f, this.f7466g);
                            this.f7469j.m5816k();
                            return;
                        case 2:
                            if (this.f7470k.m5913a(motionEvent2.getX(), motionEvent2.getY())) {
                                this.f7470k.m5901b(motionEvent2.getX(), motionEvent2.getY());
                            } else {
                                this.f7462b.m4013w();
                                this.f7464e = 1;
                                this.f7462b.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f7465f, this.f7466g);
                            }
                            this.f7469j.m5816k();
                            return;
                        case 3:
                            this.f7469j.m5816k();
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                this.f7462b.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f7465f, this.f7466g);
                return;
            case 2:
                this.f7470k.m5901b(motionEvent2.getX(), motionEvent2.getY());
                return;
            case 3:
            default:
                return;
        }
    }
}
