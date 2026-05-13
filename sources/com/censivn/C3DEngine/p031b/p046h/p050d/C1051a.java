package com.censivn.C3DEngine.p031b.p046h.p050d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.h.d.a */
/* loaded from: classes.dex */
public class C1051a extends C0980j {

    /* renamed from: a */
    private C1052b f3232a;

    /* renamed from: b */
    private C0981k f3233b;

    /* renamed from: c */
    private int f3234c;

    /* renamed from: d */
    private TextureElement f3235d;

    public C1051a(float f, int i, float f2) {
        this.f3232a = new C1052b(f, i);
        addChild(this.f3232a);
        C3567c.m1967a(this.f3232a, C3567c.f11849h);
        this.f3233b = new C0981k(f2, f2, false);
        this.f3235d = new TextureElement(0, false);
        C3567c.m1967a(this.f3233b, C3567c.f11849h);
        this.f3233b.textures().addElement(this.f3235d);
        addChild(this.f3233b);
    }

    /* renamed from: a */
    public float m10113a() {
        return this.f3232a.m10099d();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void transferCanvas(float f, float f2, float f3, float f4) {
    }

    /* renamed from: a */
    public void m10111a(int i) {
        if (this.f3235d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f3235d);
        }
        this.f3234c = i;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f3235d != null && this.f3235d.f2529id == 0) {
            Bitmap m609a = C4189x.m609a(this.f3234c);
            C0853a.m10853g().m10540a(this.f3235d, m609a);
            m609a.recycle();
        }
    }

    /* renamed from: b */
    public void m10110b() {
        this.f3232a.m10102c();
        if (this.f3235d.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f3235d);
        }
    }

    /* renamed from: a */
    public void m10112a(float f) {
        if (this.f3233b != null) {
            this.f3233b.rotation().f2528z = (180.0f * f) + 180.0f;
            this.f3233b.scale().setAll(f, f, 1.0f);
        }
        this.f3232a.m10103b(360.0f * f);
    }
}
