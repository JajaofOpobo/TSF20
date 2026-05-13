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
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p131f.C2939h;
import com.tsf.shell.p096f.p131f.C2948l;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.g.a.c */
/* loaded from: classes.dex */
public class C2999c extends C2578b {

    /* renamed from: a */
    public C2992b f9797a;

    /* renamed from: b */
    private C1040h f9798b;

    /* renamed from: c */
    private C2574a.C2575a f9799c;

    /* renamed from: d */
    private C3595e.C3597a f9800d;

    public C2999c(C2992b c2992b) {
        super(C1306b.C1315i.menu_effect_desktop);
        this.f9797a = c2992b;
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        C2574a.C2575a.C2577a c2577a = new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.g.a.c.1
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3359a.f11108v.f7768a.f9582a.m4344g();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11108v.f7768a.f9582a.m4348a(true);
                C2999c.this.f9798b.m10143d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11108v.f7768a.f9582a.m4348a(false);
                C2999c.this.f9798b.m10143d();
            }
        };
        C2574a.C2575a.C2577a c2577a2 = new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.g.a.c.2
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C2939h.m4167c();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C2939h.m4168b(true);
                C3359a.f11108v.f7768a.f9582a.m4311d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C2939h.m4168b(false);
                C3359a.f11108v.f7768a.f9582a.m4311d();
            }
        };
        this.f9799c = new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_swing, C4189x.m588c(C1306b.C1315i.menu_effect_swing), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.g.a.c.3
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3359a.f11108v.f7770c.m5576b();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11108v.f7770c.m5575c();
                C3359a.f11108v.f7768a.f9582a.m4311d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11108v.f7770c.m5574d();
                C3359a.f11108v.f7768a.f9582a.m4311d();
            }
        });
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_random, C4189x.m588c(C1306b.C1315i.text_random), c2577a));
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_page_border, C4189x.m588c(C1306b.C1315i.text_border), c2577a2));
        arrayList.add(this.f9799c);
        setFunctions(arrayList);
        this.f9798b = new C1040h(C0892a.f2553D, this.f9797a.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 0.9f, C3566b.f11841c.f11763U * C0892a.f2567c * 0.9f);
        this.f9798b.m10160a(new C1024b() { // from class: com.tsf.shell.f.g.a.c.4
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3359a.f11108v.f7768a.f9582a.m4342i();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C0975i c0975i2;
                if (c0975i == null) {
                    c0975i2 = new C3020h();
                    c0975i2.calAABB();
                } else {
                    c0975i2 = c0975i;
                }
                C2948l a = C3359a.f11108v.f7768a.f9582a.m4351a(i);
                C3020h c3020h = (C3020h) c0975i2;
                if (a.m4266i()) {
                    c3020h.m3820g();
                } else {
                    c3020h.m3819h();
                }
                if (a.m4261n()) {
                    c3020h.m3824c();
                } else {
                    c3020h.m3823d();
                }
                c3020h.f9833e.textures().clear();
                c3020h.f9833e.textures().addElement(a.m4272a(C3020h.m3822e(), C3020h.m3821f()));
                return c0975i2;
            }
        });
        this.f9798b.m10159a(new C1036f() { // from class: com.tsf.shell.f.g.a.c.5
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C3359a.f11108v.f7768a.f9582a.m4312c(C3359a.f11108v.f7768a.f9582a.m4351a(i));
                C2999c.this.f9798b.m10143d();
            }
        });
        this.f9800d = C3359a.f11087a.m1927a(this, C3595e.f11921f);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f9798b;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f9798b.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f9798b.m10143d();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        super.onHide();
        this.f9800d.m1916b();
        int i = C3359a.f11108v.f7768a.f9582a.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7768a.f9582a.m4351a(i2).m4263l();
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        int i = C3359a.f11108v.f7768a.f9582a.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7768a.f9582a.m4351a(i2).m4267h();
        }
        C3020h.m3825b();
        C3359a.f11108v.f7768a.f9582a.m4341j();
    }
}
