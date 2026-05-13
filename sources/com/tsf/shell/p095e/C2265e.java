package com.tsf.shell.p095e;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p095e.C2262d;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import com.tsf.shell.utils.C4170g;
/* renamed from: com.tsf.shell.e.e */
/* loaded from: classes.dex */
public class C2265e extends FrameLayout {

    /* renamed from: a */
    private C2269f f7395a;

    /* renamed from: b */
    private boolean f7396b;

    /* renamed from: c */
    private MotionEvent f7397c;

    /* renamed from: d */
    private C3124a f7398d;

    /* renamed from: e */
    private C3109c f7399e;

    public C2265e(Context context) {
        super(context);
        this.f7396b = false;
        C4170g.m687a(this);
    }

    public void setWorkspace(C2269f c2269f) {
        this.f7395a = c2269f;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f7397c = MotionEvent.obtain(motionEvent);
                break;
            case 1:
            case 3:
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.e.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2265e.this.m5987a(obtain);
                    }
                });
                break;
            case 2:
                m5985b(motionEvent);
                break;
        }
        return this.f7396b;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7396b) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.e.e.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2265e.this.m5987a(obtain);
                    }
                });
                break;
            case 2:
                m5985b(motionEvent);
                break;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i) {
        return this.f7395a != null && this.f7395a.dispatchUnhandledMove(view, i);
    }

    /* renamed from: b */
    private void m5985b(MotionEvent motionEvent) {
        if (this.f7396b && this.f7399e != null) {
            this.f7399e.mo2129a(this.f7397c, motionEvent);
        }
    }

    /* renamed from: a */
    public void m5986a(C2262d.ContextMenu$ContextMenuInfoC2263a contextMenu$ContextMenuInfoC2263a) {
        C3124a m1868a;
        if (!this.f7396b && contextMenu$ContextMenuInfoC2263a.f7384a != null && contextMenu$ContextMenuInfoC2263a.f7384a.isInTouchMode() && this.f7395a.getCurrentScreenLayout() != null && (m1868a = C3359a.f11098l.m1868a(contextMenu$ContextMenuInfoC2263a.f7384a)) != null) {
            C0864d.m10811b(true);
            C3359a.f11094h.m4064b(m1868a.m3486z() != null ? m1868a.m3486z() : C3359a.f11094h.m4029o());
            C3359a.f11094h.m4119H();
            this.f7396b = true;
            this.f7398d = m1868a;
            this.f7399e = m1868a.getMouseEventListener();
            this.f7399e.mo1654e(this.f7397c);
            this.f7399e.mo2122c(this.f7397c);
        }
    }

    /* renamed from: a */
    public void m5987a(MotionEvent motionEvent) {
        int mo10366b;
        int mo10365c;
        if (this.f7396b) {
            C0864d.m10811b(false);
            C2262d.C2264b c2264b = (C2262d.C2264b) this.f7398d.f10163g.getLayoutParams();
            if (C3359a.f11094h.f9606d.m4333b()) {
                float[] m4340a = C3359a.f11094h.f9606d.m4340a();
                mo10366b = (int) ((m4340a[0] - (this.f7398d.f10161b.mo10366b() / 2.0f)) + C0892a.f2557H);
                mo10365c = (int) (((-m4340a[1]) + C0892a.f2558I) - (this.f7398d.f10161b.mo10365c() / 2.0f));
            } else {
                mo10366b = (int) ((this.f7398d.position().f2526x - (this.f7398d.f10161b.mo10366b() / 2.0f)) + C0892a.f2557H);
                mo10365c = (int) (((-this.f7398d.position().f2527y) + C0892a.f2558I) - (this.f7398d.f10161b.mo10365c() / 2.0f));
            }
            int[] iArr = {mo10366b, mo10365c, c2264b.f7393d, c2264b.f7394e};
            if (c2264b.f7393d + mo10366b > C0892a.f2588x) {
                iArr[0] = C0892a.f2588x - c2264b.f7393d;
            } else if (mo10366b < C0892a.f2586v) {
                iArr[0] = C0892a.f2586v;
            }
            if (c2264b.f7394e + mo10365c > C0892a.f2589y) {
                iArr[1] = C0892a.f2589y - c2264b.f7394e;
            } else if (mo10365c < C0892a.f2587w) {
                iArr[1] = C0892a.f2587w;
            }
            ItemInfo K = this.f7398d.m3534K();
            if (C0892a.f2564O) {
                int i = iArr[0];
                c2264b.f7390a = i;
                K.cellX = i;
                int i2 = iArr[1];
                c2264b.f7391b = i2;
                K.cellY = i2;
            } else {
                int i3 = iArr[0];
                c2264b.f7390a = i3;
                K.cellXH = i3;
                int i4 = iArr[1];
                c2264b.f7391b = i4;
                K.cellYH = i4;
            }
            final C2932g m4031n = C3359a.f11094h.m4031n();
            final C3124a c3124a = this.f7398d;
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.e.e.3
                @Override // java.lang.Runnable
                public void run() {
                    if (c3124a != null && c3124a.f10163g != null) {
                        c3124a.f10163g.requestLayout();
                        if (!m4031n.m4216ad()) {
                            c3124a.f10163g.m6006b();
                        }
                    }
                }
            });
            int i5 = K.height * K.width;
            if (m4031n.m4182s() != null && !m4031n.m4182s().m5994a(i5, this.f7398d.f10163g)) {
                C3359a.f11094h.m4009y();
                C2244e.m6020a(C1306b.C1315i.out_of_space);
            }
            C3359a.f11094h.m4118I();
            this.f7396b = false;
            this.f7399e.mo2119d(motionEvent);
            this.f7399e.mo1653f(motionEvent);
            this.f7399e = null;
            this.f7398d = null;
        }
    }
}
