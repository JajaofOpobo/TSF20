package com.tsf.shell.manager.p174f;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p030a.C0872g;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0922d;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0985n;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p095e.C2265e;
import com.tsf.shell.p096f.p100b.C2284a;
/* renamed from: com.tsf.shell.manager.f.d */
/* loaded from: classes.dex */
public class C3483d implements C0925e.InterfaceC0934a {

    /* renamed from: a */
    private C0872g f11498a;

    /* renamed from: b */
    private C0980j f11499b;

    /* renamed from: c */
    private C0980j f11500c;

    /* renamed from: d */
    private VObject3dContainer f11501d;

    /* renamed from: e */
    private C0985n f11502e;

    /* renamed from: f */
    private C2284a f11503f;

    /* renamed from: g */
    private C0922d.C0924b f11504g;

    /* renamed from: h */
    private C2265e f11505h;

    /* renamed from: i */
    private FrameLayout f11506i;

    /* renamed from: j */
    private C0980j f11507j;

    public C3483d(C2265e c2265e) {
        C3359a.f11088b.m10565a(this);
        this.f11505h = c2265e;
        this.f11506i = new FrameLayout(this.f11505h.getContext());
        this.f11504g = new C0922d.C0924b() { // from class: com.tsf.shell.manager.f.d.1
            @Override // com.censivn.C3DEngine.p031b.p035c.C0922d.C0924b
            /* renamed from: a */
            public void mo2216a() {
                if (C3483d.this.f11503f != null) {
                    C3483d.this.f11503f.mo727a(4, null);
                }
            }
        };
    }

    /* renamed from: a */
    public C0980j m2236a() {
        return this.f11500c;
    }

    /* renamed from: a */
    public void m2234a(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.f11506i.getParent() == null) {
            this.f11505h.addView(this.f11506i);
        }
        this.f11506i.addView(view, layoutParams);
    }

    /* renamed from: a */
    public void m2235a(View view) {
        this.f11506i.removeView(view);
        if (this.f11506i.getChildCount() == 0) {
            this.f11505h.removeView(this.f11506i);
        }
    }

    /* renamed from: a */
    public void m2233a(C0872g c0872g) {
        this.f11498a = c0872g;
        this.f11499b = new C0980j();
        this.f11507j = new C0980j() { // from class: com.tsf.shell.manager.f.d.2
            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public boolean removeChild(C0975i c0975i) {
                boolean removeChild = super.removeChild(c0975i);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChild;
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public C0975i removeChildAt(int i) {
                C0975i removeChildAt = super.removeChildAt(i);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChildAt;
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public void addChild(C0975i c0975i) {
                if (parent() == null) {
                    C3483d.this.f11498a.addChild(this);
                }
                super.addChild(c0975i);
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
            public void addChildAt(C0975i c0975i, int i) {
                if (parent() == null) {
                    C3483d.this.f11498a.addChild(this);
                }
                super.addChildAt(c0975i, i);
            }
        };
        this.f11501d = new VObject3dContainer() { // from class: com.tsf.shell.manager.f.d.3
            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildStart(VObject3d vObject3d) {
            }

            @Override // com.censivn.C3DEngine.api.core.VObject3dContainer
            public void onDrawChildEnd(VObject3d vObject3d) {
            }
        };
        this.f11500c = (C0980j) this.f11501d.getVirtualTarget();
        this.f11502e = new C0985n();
        this.f11502e.setAABBPX(-2.1474836E9f, -2.1474836E9f, -2.1474836E9f, 2.1474836E9f, 2.1474836E9f, 2.1474836E9f);
        this.f11502e.setMouseEventListener(new C0937a(this.f11502e) { // from class: com.tsf.shell.manager.f.d.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C3483d.this.f11503f != null) {
                    C3483d.this.f11503f.mo727a(4, null);
                }
            }
        });
        this.f11499b.addChild(this.f11502e);
        this.f11499b.addChild(this.f11500c);
    }

    /* renamed from: a */
    public C0980j m2229a(C2284a c2284a) {
        if (c2284a == null) {
            return null;
        }
        this.f11502e.alpha(0.0f);
        C3359a.f11094h.m4119H();
        C0915b.m10597a(c2284a);
        this.f11503f = c2284a;
        this.f11498a.addChild(this.f11499b);
        C3359a.f11105s.m10574a(this.f11504g);
        return this.f11500c;
    }

    /* renamed from: b */
    public void m2224b() {
        this.f11498a.removeChild(this.f11499b);
        C3359a.f11094h.m4118I();
        C0915b.m10594b(this.f11503f);
        C3359a.f11105s.m10572b(this.f11504g);
        this.f11503f = null;
    }

    /* renamed from: c */
    public void m2220c() {
        m2227a((Runnable) null);
    }

    /* renamed from: a */
    public void m2227a(Runnable runnable) {
        m2226a(runnable, ItemInfo.APP_INTENT);
    }

    /* renamed from: a */
    public void m2226a(Runnable runnable, int i) {
        C3359a.f11089c.m2249a(runnable, i);
    }

    /* renamed from: d */
    public void m2218d() {
        m2225a((Runnable) null, true);
    }

    /* renamed from: b */
    public void m2221b(Runnable runnable) {
        m2225a(runnable, true);
    }

    /* renamed from: a */
    public void m2225a(final Runnable runnable, boolean z) {
        C3359a.f11089c.m2248a(new Runnable() { // from class: com.tsf.shell.manager.f.d.5
            @Override // java.lang.Runnable
            public void run() {
                C3483d.this.m2217e();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m2217e() {
    }

    /* renamed from: a */
    public void m2230a(C0975i c0975i, boolean z) {
        if (z) {
            Number3d.TEMPNUMBER3D.reset();
            c0975i.position().setAllFrom(c0975i.localToGlobal(Number3d.TEMPNUMBER3D));
            c0975i.removeFromParent();
        }
        this.f11507j.addChild(c0975i);
        this.f11507j.setZOrderOnTop();
    }

    /* renamed from: a */
    public void m2232a(C0975i c0975i) {
        m2230a(c0975i, false);
    }

    /* renamed from: a */
    public void m2231a(C0975i c0975i, int i) {
        this.f11507j.addChildAt(c0975i, i);
        this.f11507j.setZOrderOnTop();
    }

    /* renamed from: b */
    public void m2223b(C0975i c0975i) {
        this.f11507j.removeChild(c0975i);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        if (this.f11503f != null) {
            this.f11503f.mo2157a(i, i2, i3, i4);
        }
    }
}
