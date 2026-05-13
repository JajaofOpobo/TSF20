package com.tsf.shell.p096f.p107d.p108a.p109a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p107d.p108a.C2401b;
import com.tsf.shell.p096f.p146g.p147a.C3020h;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
/* renamed from: com.tsf.shell.f.d.a.a.c */
/* loaded from: classes.dex */
public class C2383c extends AbstractC2374a {

    /* renamed from: a */
    private C0962a f7873a;

    /* renamed from: b */
    private C2401b f7874b;

    /* renamed from: c */
    private C0981k f7875c;

    public C2383c(int i, boolean z) {
        super(i, z);
        this.f7873a = new C3224h().f10495k;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5652a(C0975i c0975i, Number3d number3d, Number3d number3d2, Runnable runnable) {
        if (c0975i.textures().size() != 0 && c0975i.textures().get(0).textureElement != null) {
            this.f7873a.removeFromParent();
            this.f7873a.textures().removeAll();
            this.f7873a.textures().addElement(c0975i.textures().get(0).textureElement);
            this.f7873a.alpha(150.0f);
            this.f7873a.clearDefaultColor();
            this.f7873a.scale().setAll(1.0f, 1.0f, 1.0f);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.c.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2383c.this.f7873a.textures().removeAll();
                    C3359a.f11096j.m2223b(C2383c.this.f7873a);
                }
            };
            this.f7873a.position().setAllFrom(number3d);
            this.f7873a.rotation().setAllFrom(number3d2);
            C3359a.f11096j.m2232a(this.f7873a);
            c1017d.m10294l(2.0f);
            c1017d.m10293m(2.0f);
            c1017d.m10314a(0);
            C1014c.m10326a(this.f7873a);
            C1014c.m10325a(this.f7873a, 250, c1017d);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: e */
    public C0975i mo5650e() {
        if (this.f7874b == null) {
            this.f7874b = new C2401b(this, true);
            this.f7875c = C3020h.m3826a(0.85f);
        }
        return this.f7874b;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5651a(C0981k c0981k, final Runnable runnable) {
        this.f7875c.textures().clear();
        this.f7875c.textures().addElement(c0981k.textures().get(0).textureElement);
        this.f7875c.alpha(150.0f);
        this.f7875c.scale().setAll(1.0f, 1.0f, 1.0f);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.c.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2383c.this.f7875c.removeFromParent();
                runnable.run();
            }
        };
        this.f7875c.removeFromParent();
        this.f7874b.f9833e.addChild(this.f7875c);
        c1017d.m10294l(2.0f);
        c1017d.m10293m(2.0f);
        c1017d.m10314a(0);
        C1014c.m10326a(this.f7875c);
        C1014c.m10325a(this.f7875c, 500, c1017d);
    }
}
