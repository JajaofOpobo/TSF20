package com.censivn.C3DEngine.p031b.p046h.p049c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.h.c.a */
/* loaded from: classes.dex */
public class C1049a extends C0981k {

    /* renamed from: a */
    private TextureElement f3230a;

    public C1049a() {
        super(C3489a.f11524k, C3489a.f11524k, false);
        this.f3230a = new TextureElement(0, false);
        textures().addElement(this.f3230a);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f3230a.f2529id == 0) {
            Bitmap m607a = C4189x.m607a(C1306b.C1310d.res_loading, C3489a.f11524k, C3489a.f11524k);
            C0853a.m10853g().m10540a(this.f3230a, m607a);
            m607a.recycle();
        }
        rotation().f2528z -= 10.0f;
        invalidate();
    }

    /* renamed from: a */
    public void m10116a() {
        C0853a.m10853g().m10543a(this.f3230a);
    }

    /* renamed from: a */
    public void m10115a(boolean z) {
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(this);
            C1014c.m10325a(this, VEasing.Back.easeIn, c1017d);
            return;
        }
        alpha(255.0f);
    }

    /* renamed from: b */
    public void m10114b(boolean z) {
        if (z) {
            C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.h.c.a.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1049a.this.m10116a();
                    C1049a.this.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this);
            C1014c.m10325a(this, VEasing.Back.easeIn, c1017d);
            return;
        }
        alpha(0.0f);
        m10116a();
    }
}
