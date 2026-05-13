package com.tsf.shell.manager.p174f;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0922d;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.p096f.p118e.p120b.C2468a;
import com.tsf.shell.p096f.p118e.p120b.C2471b;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p131f.C2942j;
/* renamed from: com.tsf.shell.manager.f.b */
/* loaded from: classes.dex */
public class C3474b extends C0980j implements C0925e.InterfaceC0934a, ShellWallpaperManager.InterfaceC3748a {

    /* renamed from: b */
    public static int f11468b = 0;

    /* renamed from: f */
    private C2942j.C2943a f11473f;

    /* renamed from: g */
    private C2468a f11474g;

    /* renamed from: h */
    private C0922d.C0924b f11475h;

    /* renamed from: i */
    private C3478a f11476i;

    /* renamed from: j */
    private C2942j.C2943a f11477j;

    /* renamed from: a */
    public Object f11469a = new Object();

    /* renamed from: d */
    private boolean f11471d = false;

    /* renamed from: e */
    private boolean f11472e = false;

    /* renamed from: k */
    private C2471b f11478k = new C2471b();

    /* renamed from: l */
    private boolean f11479l = false;

    /* renamed from: c */
    private C0981k f11470c = new C0981k(0.0f, 0.0f);

    public C3474b() {
        this.f11470c.uvs().set(0, 1.0f, 0.0f);
        this.f11470c.uvs().set(1, 0.0f, 0.0f);
        this.f11470c.uvs().set(2, 1.0f, 1.0f);
        this.f11470c.uvs().set(3, 0.0f, 1.0f);
        this.f11474g = new C2468a();
        this.f11475h = new C0922d.C0924b() { // from class: com.tsf.shell.manager.f.b.1
            @Override // com.censivn.C3DEngine.p031b.p035c.C0922d.C0924b
            /* renamed from: a */
            public void mo2216a() {
                if (C3474b.this.f11476i != null) {
                    C3474b.this.f11476i.mo2070a();
                }
            }
        };
        this.f11474g.setMouseEventListener(new C0937a(this.f11474g) { // from class: com.tsf.shell.manager.f.b.2
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C3474b.this.f11476i != null) {
                    C3474b.this.f11476i.mo2070a();
                }
            }
        });
        C2942j.m4162a(this.f11469a, 1);
    }

    /* renamed from: com.tsf.shell.manager.f.b$a */
    /* loaded from: classes.dex */
    public static class C3478a {
        /* renamed from: a */
        public void mo2070a() {
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public C0975i getHittingTarget(float f, float f2, boolean z) {
        if (!this.f11471d) {
            return super.getHittingTarget(f, f2, z);
        }
        return this.f11474g.getHittingTarget(f, f2, false);
    }

    /* renamed from: a */
    public C2468a m2277a() {
        return this.f11474g;
    }

    /* renamed from: a */
    public void m2272a(TextureElement textureElement, Runnable runnable) {
        this.f11474g.m5507a(textureElement, 128.0f, runnable);
    }

    /* renamed from: a */
    public void m2273a(TextureElement textureElement, float f, Runnable runnable) {
        this.f11474g.m5507a(textureElement, f, runnable);
    }

    /* renamed from: a */
    public void m2276a(int i, Runnable runnable) {
        this.f11474g.m5509a(i, runnable);
    }

    /* renamed from: a */
    public void m2275a(int i, Runnable runnable, boolean z) {
        if (z) {
            this.f11474g.m5509a(i, runnable);
        } else {
            this.f11474g.m5509a(0, runnable);
        }
    }

    /* renamed from: a */
    public void m2274a(TextureElement textureElement) {
        this.f11474g.m5508a(textureElement);
    }

    /* renamed from: b */
    public void m2265b() {
        this.f11473f = m2256g();
        this.f11474g.m5508a(this.f11473f.f9574b);
        this.f11474g.m5510a(1.0f);
    }

    /* renamed from: c */
    public boolean m2260c() {
        return this.f11472e;
    }

    /* renamed from: a */
    public void m2270a(C3478a c3478a) {
        m2269a(c3478a, ItemInfo.APP_INTENT, (Runnable) null);
    }

    /* renamed from: b */
    public void m2262b(C3478a c3478a) {
        this.f11476i = c3478a;
    }

    /* renamed from: a */
    public void m2269a(C3478a c3478a, int i, Runnable runnable) {
        if (!this.f11472e) {
            this.f11472e = true;
            this.f11471d = true;
            m2262b(c3478a);
            this.f11473f = m2256g();
            m2273a(this.f11473f.f9574b, i, runnable);
            C3359a.f11105s.m10574a(this.f11475h);
            mouseEnabled(false);
            C0864d.m10805d().m10810c().m3556a(false);
            C3359a.f11094h.m4031n().mo4146ab();
            C3359a.f11088b.m10565a(this);
            this.f11474g.setAABBPX(-C0892a.f2557H, -C0892a.f2558I, 0.0f, C0892a.f2557H, C0892a.f2558I, 0.0f);
        }
    }

    /* renamed from: d */
    public void m2258d() {
        this.f11473f = m2256g();
        m2274a(this.f11473f.f9574b);
    }

    /* renamed from: e */
    public void m2257e() {
        m2266a((Runnable) null, true);
    }

    /* renamed from: b */
    public void m2264b(int i, final Runnable runnable, boolean z) {
        if (this.f11472e) {
            this.f11472e = false;
            this.f11476i = null;
            m2258d();
            m2275a(i, new Runnable() { // from class: com.tsf.shell.manager.f.b.3
                @Override // java.lang.Runnable
                public void run() {
                    C3474b.this.f11471d = false;
                    C3474b.this.f11473f.f9573a = null;
                    C3474b.this.mouseEnabled(true);
                    C0864d.m10805d().m10810c().m3556a(true);
                    C3359a.f11094h.m4031n().mo4145ac();
                    C3359a.f11088b.m10557b(C3474b.this);
                    C3359a.f11105s.m10572b(C3474b.this.f11475h);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }, z);
        }
    }

    /* renamed from: a */
    public void m2266a(Runnable runnable, boolean z) {
        m2264b(380, runnable, z);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        this.f11474g.setAABBPX(-C0892a.f2557H, -C0892a.f2558I, 0.0f, C0892a.f2557H, C0892a.f2558I, 0.0f);
        if (this.f11471d) {
            this.f11473f = m2256g();
            this.f11474g.m5508a(this.f11473f.f9574b);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (f11468b != 0 && this.f11479l) {
            this.f11477j = C2942j.m4158c(this.f11469a);
            C3359a.f11106t.m5972b(C2942j.m4159c(), this.f11477j.f9574b);
            if (f11468b == 3) {
                C3359a.f11092f.m1579g().dispatchDraw();
                C3359a.f11106t.m5973b();
            }
        }
        if (this.f11471d) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            this.f11474g.dispatchDraw();
            MatrixStack.glPopMatrix();
        } else {
            super.dispatchDraw();
        }
        if (f11468b != 0) {
            if (this.f11479l) {
                this.f11478k.m5501a(this.f11477j.f9574b, 16);
                if (f11468b != 3) {
                    C3359a.f11106t.m5973b();
                    if (this.f11477j.f9574b.width != this.f11470c.mo10366b()) {
                        this.f11470c.mo10368a(this.f11477j.f9574b.width);
                    }
                    if (this.f11477j.f9574b.height != this.f11470c.mo10365c()) {
                        this.f11470c.mo5215b(this.f11477j.f9574b.height);
                    }
                    this.f11470c.textures().clear();
                    this.f11470c.textures().addElement(this.f11477j.f9574b);
                    this.f11470c.dispatchDraw();
                }
            }
            if (f11468b == 1) {
                this.f11479l = true;
            } else {
                this.f11479l = false;
            }
        }
    }

    /* renamed from: a */
    public TextureElement m2271a(AbstractC2593d abstractC2593d) {
        f11468b = 3;
        C3359a.f11092f.m1606a(this);
        if (this.f11474g.m5511a()) {
            return this.f11474g.m5504b();
        }
        this.f11479l = true;
        return this.f11478k.f8118a;
    }

    /* renamed from: b */
    public void m2263b(AbstractC2593d abstractC2593d) {
        this.f11479l = false;
        f11468b = 0;
        C3359a.f11092f.m1593b(this);
        if (this.f11477j != null) {
        }
    }

    /* renamed from: g */
    private C2942j.C2943a m2256g() {
        C2942j.C2943a m4158c = C2942j.m4158c(this.f11469a);
        m4158c.f9573a = this.f11469a;
        C3359a.f11106t.m5972b(C2942j.m4159c(), m4158c.f9574b);
        super.dispatchDraw();
        C3359a.f11106t.m5973b();
        return m4158c;
    }

    @Override // com.tsf.shell.manager.wallpaper.ShellWallpaperManager.InterfaceC3748a
    /* renamed from: f */
    public void mo1569f() {
        this.f11479l = true;
    }
}
