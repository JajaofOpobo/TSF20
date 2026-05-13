package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0973g;
/* renamed from: com.tsf.shell.preference.a.a.a.f */
/* loaded from: classes.dex */
public class C4014f extends C4017h {

    /* renamed from: a */
    private C0973g f13157a;

    public C4014f(String str, int i, float f) {
        super(str, f);
        this.f13157a = new C0973g() { // from class: com.tsf.shell.preference.a.a.a.f.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0973g
            /* renamed from: a */
            public void mo893a(TextureElement textureElement) {
                C4014f.this.f13157a.mo10368a((int) C0892a.m10742a(textureElement.width));
                C4014f.this.f13157a.mo5215b((int) C0892a.m10742a(textureElement.height));
            }
        };
        this.f13157a.m10375a(i);
        m890e().addChild(this.f13157a);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        this.f13157a.m10376a();
    }
}
