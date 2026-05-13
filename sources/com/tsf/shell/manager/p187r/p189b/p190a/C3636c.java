package com.tsf.shell.manager.p187r.p189b.p190a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
/* renamed from: com.tsf.shell.manager.r.b.a.c */
/* loaded from: classes.dex */
public class C3636c extends AbstractC3208b {

    /* renamed from: a */
    private static C0981k f12037a;

    /* renamed from: b */
    private static TextureElement f12038b;

    /* renamed from: p */
    private boolean f12039p;

    public C3636c() {
        super(null, C3566b.f11839a);
        this.f12039p = false;
        if (f12037a == null) {
            f12037a = new C0981k(64.0f, 64.0f, 1, 1, true);
            f12037a.position().f2526x = 32.0f * C0892a.f2565a;
            f12037a.position().f2527y = 40.0f * C0892a.f2565a;
            f12038b = new TextureElement(0, false);
            f12037a.textures().addElementWithoutVerify(f12038b);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        if (this.f12039p) {
            f12038b.f2529id = f10550f.f2529id;
            f12037a.dispatchDraw();
        }
    }

    /* renamed from: a */
    public void m1828a(boolean z) {
        this.f12039p = z;
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: k */
    public void mo1827k() {
    }
}
