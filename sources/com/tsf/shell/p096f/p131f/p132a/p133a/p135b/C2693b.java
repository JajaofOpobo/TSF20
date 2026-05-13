package com.tsf.shell.p096f.p131f.p132a.p133a.p135b;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2695c;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c;
import com.tsf.shell.utils.C4180p;
/* renamed from: com.tsf.shell.f.f.a.a.b.b */
/* loaded from: classes.dex */
public class C2693b extends C0980j {

    /* renamed from: d */
    private static C0981k f8870d;

    /* renamed from: e */
    private C0975i f8871e;

    /* renamed from: f */
    private C0981k f8872f;

    /* renamed from: g */
    private C2684c f8873g;

    /* renamed from: h */
    private float f8874h;

    /* renamed from: b */
    private static TextureElement f8868b = new TextureElement(0, false);

    /* renamed from: a */
    public static int f8867a = C0892a.m10735b(138.0f);

    /* renamed from: c */
    private static int f8869c = C0892a.m10735b(8.0f);

    public C2693b(C2684c c2684c) {
        this.f8873g = c2684c;
        if (f8870d == null) {
            f8870d = new C0981k(f8867a, f8867a, false);
            f8870d.textures().addElement(f8868b);
        }
        this.f8872f = new C0981k(C0892a.m10742a(6.0f), 0.0f, false);
        this.f8872f.useVBO(false);
        this.f8872f.position().f2527y = -C0892a.m10742a(90.0f);
        this.f8872f.setDefaultColor(new Color4(255, 255, 255, 50));
        addChild(this.f8872f);
    }

    /* renamed from: a */
    public void m4903a(C0975i c0975i) {
        this.f8871e = c0975i;
        this.f8871e.setTag(this.f8873g);
        addChild(this.f8871e);
    }

    /* renamed from: b */
    public C0975i m4900b() {
        return this.f8871e;
    }

    /* renamed from: c */
    public float m4899c() {
        return this.f8874h;
    }

    /* renamed from: a */
    public void m4904a(float f) {
        this.f8874h = f;
        this.f8872f.points().setYPX(0, -f);
        this.f8872f.points().setYPX(1, -f);
    }

    /* renamed from: a */
    public static void m4902a(C0975i c0975i, float f, float f2) {
        c0975i.position().f2527y = f;
        c0975i.alpha(0.0f);
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(f2);
        c1017d.m10314a(255);
        c1017d.m10313a(C0986a.f2959n);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 750, c1017d);
    }

    /* renamed from: d */
    public void m4898d() {
        m4904a(0.0f);
        m4902a(this.f8871e, -C2695c.f8876a, 0.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        if (f8868b.f2529id == 0) {
            Bitmap m652a = C4180p.m652a(f8867a, f8869c, 1442840575);
            C0853a.m10853g().m10540a(f8868b, m652a);
            m652a.recycle();
        }
    }
}
