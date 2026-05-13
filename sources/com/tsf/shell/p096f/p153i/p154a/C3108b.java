package com.tsf.shell.p096f.p153i.p154a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.i.a.b */
/* loaded from: classes.dex */
public class C3108b extends C0937a {

    /* renamed from: d */
    public static C2951n f10077d;

    /* renamed from: a */
    private final float f10078a;

    /* renamed from: b */
    private final float f10079b;

    /* renamed from: e */
    private final int f10080e;

    /* renamed from: f */
    private final int f10081f;

    /* renamed from: g */
    private int f10082g;

    /* renamed from: h */
    private float f10083h;

    /* renamed from: i */
    private float f10084i;

    public C3108b(C0975i c0975i) {
        super(c0975i);
        this.f10078a = 30.0f * C0892a.f2565a;
        this.f10079b = 15.0f * C0892a.f2565a;
        this.f10080e = 0;
        this.f10081f = 1;
        this.f10082g = 0;
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo502a(MotionEvent motionEvent) {
        if (f10077d.m4033m() == 1 || f10077d.m4033m() == 3) {
            f10077d.m4011x();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: g */
    public void mo3208g(MotionEvent motionEvent) {
        switch (this.f10082g) {
            case 0:
            default:
                return;
            case 1:
                f10077d.m4011x();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f10082g) {
            case 0:
            default:
                return;
            case 1:
                f10077d.m4011x();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    public void mo1654e(MotionEvent motionEvent) {
        this.f10083h = motionEvent.getX();
        this.f10084i = motionEvent.getY();
        C3398f.m2651a();
        if (f10077d.m4033m() == 2) {
            this.f10082g = 0;
        } else {
            this.f10082g = 1;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f10082g) {
            case 0:
                if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.f10078a) {
                    this.f10082g = 1;
                    f10077d.m4013w();
                    f10077d.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10083h, this.f10084i);
                    return;
                }
                return;
            case 1:
                f10077d.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10083h, this.f10084i);
                return;
            default:
                return;
        }
    }
}
