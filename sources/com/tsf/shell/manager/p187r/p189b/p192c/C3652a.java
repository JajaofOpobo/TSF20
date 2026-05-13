package com.tsf.shell.manager.p187r.p189b.p192c;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p187r.p189b.p192c.C3655b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.r.b.c.a */
/* loaded from: classes.dex */
public class C3652a extends C0980j {

    /* renamed from: a */
    private TextureElement f12069a = new TextureElement(0, false);

    /* renamed from: b */
    private C0981k f12070b;

    /* renamed from: c */
    private C0984m f12071c;

    public C3652a() {
        m1807b();
    }

    /* renamed from: a */
    public void mo1778a() {
    }

    /* renamed from: a */
    public void m1808a(C3655b.C3661a c3661a) {
        this.f12071c.m10355a(c3661a.f12087a + "  -  " + String.format(C4189x.m588c(C1306b.C1315i.text_widget_count), Integer.valueOf(c3661a.f12089c.size())));
    }

    /* renamed from: b */
    public void m1807b() {
        this.f12070b = new C0981k(C0892a.m10742a(24.0f), C0892a.m10742a(45.0f), false) { // from class: com.tsf.shell.manager.r.b.c.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C3652a.this.f12069a.f2529id == 0) {
                    Bitmap m609a = C4189x.m609a(C1306b.C1310d.scrollcontainer_arrow);
                    C0853a.m10853g().m10540a(C3652a.this.f12069a, m609a);
                    m609a.recycle();
                }
            }
        };
        this.f12070b.textures().addElement(this.f12069a);
        m1810a(this.f12070b);
        addChild(this.f12070b);
        this.f12070b.position().f2526x = C0892a.m10742a(20.0f) + C0892a.m10742a(12.0f);
        this.f12070b.rotation().f2528z = 180.0f;
        this.f12071c = new C0984m();
        this.f12071c.m10347d(42);
        this.f12071c.m10345e(-1);
        this.f12071c.m10352b(1);
        m1810a(this.f12071c);
        this.f12071c.position().f2526x = this.f12070b.position().f2526x + C0892a.m10742a(12.0f) + C0892a.m10742a(40.0f);
        addChild(this.f12071c);
        C3567c.m1967a(this, C3567c.f11849h);
    }

    /* renamed from: a */
    public void m1811a(float f, float f2, float f3, float f4) {
        position().f2526x = f;
    }

    /* renamed from: c */
    public void m1806c() {
        this.f12071c.m10358a();
        C0853a.m10853g().m10543a(this.f12069a);
    }

    /* renamed from: a */
    public void m1810a(C0975i c0975i) {
        c0975i.setMouseEventListener(new C0937a(c0975i) { // from class: com.tsf.shell.manager.r.b.c.a.2
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3652a.this.mo1778a();
            }
        });
    }
}
