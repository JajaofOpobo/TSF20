package com.tsf.shell.manager.p178j;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0968b;
/* renamed from: com.tsf.shell.manager.j.d */
/* loaded from: classes.dex */
public class C3517d extends C0967a {

    /* renamed from: a */
    private TextureElement f11617a;

    /* renamed from: d */
    private int f11618d;

    public C3517d(float f, float f2, float f3, C0968b c0968b, int i) {
        super(f, f2, f3, c0968b);
        this.f11618d = i;
        this.f11617a = new TextureElement(0, false);
        textures().addElement(this.f11617a);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f11617a.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f11617a, this.f11618d);
        }
    }
}
