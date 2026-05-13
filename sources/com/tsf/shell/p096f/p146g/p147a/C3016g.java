package com.tsf.shell.p096f.p146g.p147a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2421c;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2426d;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p131f.C2931f;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.g.a.g */
/* loaded from: classes.dex */
public class C3016g extends C2991a {

    /* renamed from: a */
    public C2992b f9822a;

    /* renamed from: b */
    private C1040h f9823b;

    /* renamed from: c */
    private C3595e.C3597a f9824c;

    public C3016g(C2992b c2992b) {
        super(C1306b.C1315i.text_menu);
        this.f9822a = c2992b;
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_random, C4189x.m588c(C1306b.C1315i.text_random), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.g.a.g.1
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3359a.f11108v.f7772e.m4344g();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11108v.f7772e.m4348a(true);
                C3016g.this.f9823b.m10143d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11108v.f7772e.m4348a(false);
                C3016g.this.f9823b.m10143d();
            }
        }));
        setFunctions(arrayList);
        this.f9823b = new C1040h(C0892a.f2553D, this.f9822a.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 0.9f, C3566b.f11841c.f11763U * C0892a.f2567c * 0.9f);
        this.f9823b.m10160a(new C1024b() { // from class: com.tsf.shell.f.g.a.g.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3359a.f11108v.f7772e.m4342i();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C2426d a = C3359a.f11108v.f7772e.m4351a(i);
                C2421c m5589b = a.m5589b();
                m5589b.removeFromParent();
                if (a.m4266i()) {
                    m5589b.m3820g();
                } else {
                    m5589b.m3819h();
                }
                if (a.m4261n()) {
                    m5589b.m3824c();
                } else {
                    m5589b.m3823d();
                }
                return m5589b;
            }
        });
        this.f9823b.m10159a(new C1036f() { // from class: com.tsf.shell.f.g.a.g.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C3359a.f11108v.f7772e.m4350a((C2931f) C3359a.f11108v.f7772e.m4351a(i));
                C3359a.f11108v.f7772e.m5604d().m5285b(C3016g.this.f9822a.m3844a());
                C3016g.this.f9823b.m10143d();
            }
        });
        this.f9824c = C3359a.f11087a.m1927a(this, C3595e.f11922g);
    }

    @Override // com.tsf.shell.p096f.p146g.p147a.C2991a
    /* renamed from: a */
    public float mo3831a() {
        return C0892a.f2590z / 2.0f;
    }

    @Override // com.tsf.shell.p096f.p146g.p147a.C2991a
    /* renamed from: b */
    public float mo3829b() {
        return C0892a.m10742a(120.0f);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f9823b;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f9823b.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f9823b.m10143d();
    }

    @Override // com.tsf.shell.p096f.p146g.p147a.C2991a
    /* renamed from: c */
    public void mo3828c() {
        C3359a.f11108v.f7772e.m5604d().m5285b(this.f9822a.m3844a());
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        super.onHide();
        C3359a.f11108v.f7772e.m5604d().m5292a((C3231c) null);
        this.f9824c.m1916b();
        int i = C3359a.f11108v.f7772e.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7772e.m4351a(i2).m4263l();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        int i = C3359a.f11108v.f7772e.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7772e.m4351a(i2).m4267h();
        }
        C2421c.m5596a();
        C3359a.f11108v.f7772e.m4341j();
    }
}
