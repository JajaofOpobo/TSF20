package com.tsf.shell.manager.p187r.p189b.p190a;

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
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.r.b.a.b */
/* loaded from: classes.dex */
public class C3631b extends C0980j {

    /* renamed from: a */
    private TextureElement f12028a = new TextureElement(0, false);

    /* renamed from: b */
    private C0981k f12029b;

    /* renamed from: c */
    private C0984m f12030c;

    /* renamed from: d */
    private C2574a.C2575a f12031d;

    /* renamed from: e */
    private C2574a.C2575a f12032e;

    public C3631b() {
        m1833d();
    }

    /* renamed from: a */
    public void mo1840a() {
    }

    /* renamed from: b */
    public void mo1835b() {
    }

    /* renamed from: c */
    public void mo1834c() {
    }

    /* renamed from: d */
    public void m1833d() {
        this.f12029b = new C0981k(C0892a.m10742a(24.0f), C0892a.m10742a(45.0f), false) { // from class: com.tsf.shell.manager.r.b.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C3631b.this.f12028a.f2529id == 0) {
                    Bitmap m609a = C4189x.m609a(C1306b.C1310d.scrollcontainer_arrow);
                    C0853a.m10853g().m10540a(C3631b.this.f12028a, m609a);
                    m609a.recycle();
                }
            }
        };
        this.f12029b.textures().addElement(this.f12028a);
        this.f12029b.calAABB(3.0f, 1.0f, 1.0f);
        C3567c.m1967a(this.f12029b, C3567c.f11849h);
        m1837a(this.f12029b);
        addChild(this.f12029b);
        this.f12029b.rotation().f2528z = 180.0f;
        this.f12030c = new C0984m();
        this.f12030c.m10347d(42);
        this.f12030c.m10345e(-1);
        this.f12030c.m10352b(1);
        m1837a(this.f12030c);
        addChild(this.f12030c);
        C3567c.m1967a(this.f12030c, C3567c.f11849h);
        this.f12031d = new C2574a.C2575a(C1306b.C1310d.widget_menu_app_folder, C4189x.m588c(C1306b.C1315i.widget_folder), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.a.b.2
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3631b.this.mo1835b();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
            }
        });
        this.f12032e = new C2574a.C2575a(C1306b.C1310d.widget_menu_app_desktop, C4189x.m588c(C1306b.C1315i.menu_effect_desktop), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.a.b.3
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3631b.this.mo1834c();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
            }
        });
        addChild(this.f12031d);
        addChild(this.f12032e);
    }

    /* renamed from: a */
    public void m1838a(int i) {
        this.f12030c.m10355a(Integer.toString(i));
    }

    /* renamed from: a */
    public void m1839a(float f, float f2, float f3, float f4) {
        this.f12029b.position().f2526x = C0892a.m10742a(20.0f) + f + C0892a.m10742a(12.0f);
        this.f12030c.position().f2526x = this.f12029b.position().f2526x + C0892a.m10742a(12.0f) + C0892a.m10742a(20.0f);
        m1829h();
    }

    /* renamed from: e */
    public void m1832e() {
        C0853a.m10853g().m10543a(this.f12028a);
    }

    /* renamed from: a */
    public void m1837a(C0975i c0975i) {
        c0975i.setMouseEventListener(new C0937a(c0975i) { // from class: com.tsf.shell.manager.r.b.a.b.4
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3631b.this.mo1840a();
            }
        });
    }

    /* renamed from: h */
    private void m1829h() {
        float m10742a = C0892a.m10742a(30.0f);
        float f = (-((this.f12031d.mo10366b() + this.f12032e.mo10366b()) + m10742a)) / 2.0f;
        this.f12031d.position().f2526x = (this.f12031d.mo10366b() / 2.0f) + f;
        float b = m10742a + this.f12031d.mo10366b() + f;
        this.f12032e.position().f2526x = b + (this.f12032e.mo10366b() / 2.0f);
    }

    /* renamed from: f */
    public void m1831f() {
        this.f12031d.m5242d();
        this.f12032e.m5242d();
        m1829h();
    }

    /* renamed from: g */
    public void m1830g() {
        m1832e();
        this.f12031d.m5241e();
        this.f12032e.m5241e();
    }
}
