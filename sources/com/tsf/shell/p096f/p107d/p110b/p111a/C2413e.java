package com.tsf.shell.p096f.p107d.p110b.p111a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4181q;
/* renamed from: com.tsf.shell.f.d.b.a.e */
/* loaded from: classes.dex */
public class C2413e extends C2411d {

    /* renamed from: c */
    private static TextureElement f7972c = new TextureElement(0, false);

    /* renamed from: d */
    private static float f7973d = 0.10471976f;

    /* renamed from: e */
    private C0981k f7974e;

    public C2413e(int i, int i2, boolean z) {
        super(i, z);
        int m10742a = (int) C0892a.m10742a(30.0f);
        this.f7974e = new C0981k(m10742a + 2, m10742a + 2, false);
        this.f7974e.setDefaultColor(new Color4(i2));
        this.f7974e.textures().addElement(f7972c);
        this.f7974e.position().f2526x = C0892a.m10742a(74.0f);
        this.f7974e.position().f2527y = C0892a.m10742a(103.0f);
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: a */
    public void mo5612a() {
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: a */
    public void mo5610a(AbstractC3208b abstractC3208b) {
        if (f7972c.f2529id == 0) {
            Bitmap m638b = C4181q.m638b(15.0f, -1);
            C0853a.m10853g().m10540a(f7972c, m638b);
            m638b.recycle();
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p110b.p111a.C2411d
    /* renamed from: b */
    public void mo5608b(AbstractC3208b abstractC3208b) {
        float m3146az = abstractC3208b.m3146az();
        float sin = (float) (1.0d + (Math.sin(m3146az) * 0.30000001192092896d));
        this.f7974e.scale().setAll(sin, sin, 1.0f);
        abstractC3208b.m3137f(m3146az + f7973d);
        this.f7974e.dispatchDraw();
        this.f7974e.invalidate();
    }
}
