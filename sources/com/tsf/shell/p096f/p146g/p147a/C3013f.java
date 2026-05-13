package com.tsf.shell.p096f.p146g.p147a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2409b;
import com.tsf.shell.p096f.p107d.p110b.p111a.C2411d;
import com.tsf.shell.p096f.p131f.C2931f;
import com.tsf.shell.utils.C4187w;
/* renamed from: com.tsf.shell.f.g.a.f */
/* loaded from: classes.dex */
public class C3013f extends C2991a {

    /* renamed from: a */
    public C2992b f9816a;

    /* renamed from: b */
    private C1040h f9817b;

    /* renamed from: c */
    private C3595e.C3597a f9818c;

    /* renamed from: d */
    private C0984m f9819d;

    public C3013f(C2992b c2992b) {
        super(C1306b.C1315i.text_mark);
        this.f9816a = c2992b;
        this.f9819d = new C0984m();
        this.f9819d.m10349c(C1306b.C1315i.notic_mark_introduction);
        this.f9819d.m10347d(34);
        this.f9819d.m10354a(true);
        C3567c.m1967a(this.f9819d, C3567c.f11855n);
        setMenuHeight(C0892a.m10742a(430.0f));
        this.f9817b = new C1040h(C0892a.f2553D, this.f9816a.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 0.9f, C3566b.f11841c.f11763U * C0892a.f2567c * 0.9f);
        this.f9817b.m10160a(new C1024b() { // from class: com.tsf.shell.f.g.a.f.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3359a.f11108v.f7773f.m4342i();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C2411d a = C3359a.f11108v.f7773f.m4351a(i);
                C2409b m5614e = a.m5614e();
                m5614e.removeFromParent();
                if (a.m4266i()) {
                    m5614e.m3820g();
                } else {
                    m5614e.m3819h();
                }
                if (a.m4261n()) {
                    m5614e.m3824c();
                } else {
                    m5614e.m3823d();
                }
                return m5614e;
            }
        });
        this.f9819d.position().f2527y = C0892a.m10742a(300.0f);
        this.f9817b.m10168a().addChild(this.f9819d);
        this.f9817b.m10159a(new C1036f() { // from class: com.tsf.shell.f.g.a.f.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C3359a.f11108v.f7773f.m4350a((C2931f) C3359a.f11108v.f7773f.m4351a(i));
                C3013f.this.f9817b.m10143d();
            }
        });
        this.f9818c = C3359a.f11087a.m1927a(this, C3595e.f11923h);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f9817b;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f9817b.m10166a(f, f2, f3, f4);
        this.f9819d.m10344f((int) (C0892a.f2553D - C0892a.m10742a(150.0f)));
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f9817b.m10143d();
        this.f9816a.m3844a();
    }

    @Override // com.tsf.shell.p096f.p146g.p147a.C2991a
    /* renamed from: b */
    public float mo3829b() {
        return C0892a.m10742a(120.0f);
    }

    @Override // com.tsf.shell.p096f.p146g.p147a.C2991a
    /* renamed from: c */
    public void mo3828c() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        super.onHide();
        this.f9818c.m1916b();
        int i = C3359a.f11108v.f7773f.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7773f.m4351a(i2).m4263l();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        this.f9819d.m10358a();
        int i = C3359a.f11108v.f7773f.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C2411d a = C3359a.f11108v.f7773f.m4351a(i2);
            a.m4267h();
            a.m5615d();
            a.mo5612a();
        }
        C3359a.f11108v.f7773f.m4341j();
    }
}
