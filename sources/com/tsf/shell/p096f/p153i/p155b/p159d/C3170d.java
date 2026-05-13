package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
/* renamed from: com.tsf.shell.f.i.b.d.d */
/* loaded from: classes.dex */
public class C3170d {

    /* renamed from: i */
    private static Number3d f10319i = new Number3d();

    /* renamed from: j */
    private static Number3d f10320j = new Number3d();

    /* renamed from: k */
    private static Number3d f10321k = new Number3d();

    /* renamed from: l */
    private static float f10322l;

    /* renamed from: a */
    public ThemeFolderDescription f10323a;

    /* renamed from: b */
    public C2273a f10324b;

    /* renamed from: c */
    public int f10325c;

    /* renamed from: d */
    public int f10326d;

    /* renamed from: e */
    public int f10327e;

    /* renamed from: f */
    public int f10328f;

    /* renamed from: g */
    public int f10329g;

    /* renamed from: h */
    public int f10330h;

    public C3170d() {
        m3296a();
    }

    /* renamed from: b */
    private void m3294b() {
        this.f10325c = (int) (C3187j.f10398Q - C3187j.f10397P);
        this.f10326d = (int) (C3187j.f10400S - C3187j.f10399R);
        this.f10327e = (int) C3187j.f10397P;
        this.f10328f = (int) C3187j.f10399R;
        this.f10329g = (int) C3187j.f10398Q;
        this.f10330h = (int) C3187j.f10400S;
    }

    /* renamed from: a */
    public void m3296a() {
        this.f10323a = ThemeManager.mix.folder.getTheme().folder;
        m3294b();
        if (this.f10324b != null) {
            C3359a.f11106t.m5976a(this.f10324b);
        } else {
            this.f10324b = C3359a.f11106t.m5977a(this.f10325c, this.f10326d);
        }
    }

    /* renamed from: a */
    public void m3295a(C3145b c3145b) {
        if (c3145b.f10277u != null) {
            boolean z = c3145b.f10280x;
            if (z) {
                m3293b(c3145b);
            }
            if (c3145b.f10281y) {
                c3145b.f10274r.visible(false);
            }
            Color4 defaultColor = c3145b.getDefaultColor();
            c3145b.clearDefaultColor();
            f10319i.setAllFrom(c3145b.position());
            f10320j.setAllFrom(c3145b.rotation());
            f10321k.setAllFrom(c3145b.scale());
            f10322l = c3145b.alpha();
            boolean visible = c3145b.visible();
            float x = c3145b.m3488x();
            c3145b.m3512b(0.0f);
            c3145b.position().setAll((-(this.f10327e + this.f10329g)) / 2.0f, (-(this.f10328f + this.f10330h)) / 2.0f, 0.0f);
            c3145b.rotation().setAll(0.0f, 0.0f, 0.0f);
            c3145b.scale().setAll(1.0f, 1.0f, 1.0f);
            c3145b.alpha(255.0f);
            c3145b.visible(true);
            C3359a.f11106t.m5972b(this.f10324b, c3145b.f10277u);
            GLES20.glViewport(0, 0, this.f10325c, this.f10326d);
            C0853a.m10855e().m10779a(this.f10325c, this.f10326d);
            if (c3145b.visible()) {
                MatrixStack.glPushMatrix();
                c3145b.draw();
                MatrixStack.glColor(c3145b.alpha(), c3145b.getDefaultColor());
                if (c3145b.renderChildren()) {
                    int size = c3145b.children().size();
                    for (int i = 0; i < size; i++) {
                        C0975i c0975i = c3145b.children().get(i);
                        if (!(c0975i instanceof C3112b)) {
                            c0975i.dispatchDraw();
                        }
                    }
                }
                MatrixStack.glPopMatrix();
            }
            C3359a.f11106t.m5973b();
            GLES20.glViewport(0, 0, C0892a.f2555F, C0892a.f2556G);
            C0853a.m10855e().m10779a(C0892a.f2555F, C0892a.f2556G);
            c3145b.position().setAllFrom(f10319i);
            c3145b.rotation().setAllFrom(f10320j);
            c3145b.m3512b(x);
            c3145b.scale().setAllFrom(f10321k);
            c3145b.setDefaultColor(defaultColor);
            c3145b.alpha(f10322l);
            c3145b.visible(Boolean.valueOf(visible));
            if (z) {
                m3292c(c3145b);
            }
        }
    }

    /* renamed from: b */
    public void m3293b(C3145b c3145b) {
        if (c3145b.f10280x) {
            c3145b.f10280x = false;
            m3291d(c3145b);
        }
    }

    /* renamed from: c */
    public void m3292c(C3145b c3145b) {
        if (!c3145b.f10280x) {
            c3145b.f10280x = true;
            m3290e(c3145b);
        }
    }

    /* renamed from: d */
    public void m3291d(C3145b c3145b) {
        c3145b.f10271o.visible(true);
        if (c3145b.f10273q != null) {
            c3145b.f10273q.visible(true);
        }
        if (c3145b.f10272p != null) {
            c3145b.f10272p.visible(true);
        }
        if (c3145b.f10275s != null) {
            c3145b.f10275s.visible(true);
        }
        if (!c3145b.f10281y) {
            c3145b.f10274r.visible(true);
        }
        c3145b.f10276t.visible(false);
    }

    /* renamed from: e */
    public void m3290e(C3145b c3145b) {
        c3145b.f10271o.visible(false);
        if (c3145b.f10273q != null) {
            c3145b.f10273q.visible(false);
        }
        if (c3145b.f10272p != null) {
            c3145b.f10272p.visible(false);
        }
        if (c3145b.f10275s != null) {
            c3145b.f10275s.visible(false);
        }
        c3145b.f10274r.visible(false);
        c3145b.f10276t.visible(true);
    }
}
