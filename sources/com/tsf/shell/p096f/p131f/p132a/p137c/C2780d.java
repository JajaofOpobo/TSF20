package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.p127g.C2588b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p132a.p136b.AbstractC2745k;
import com.tsf.shell.p096f.p131f.p132a.p136b.C2746l;
import com.tsf.shell.p096f.p146g.p147a.C3020h;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.c.d */
/* loaded from: classes.dex */
public class C2780d extends C2792i {

    /* renamed from: g */
    private C1040h f9103g;

    /* renamed from: h */
    private C2746l f9104h;

    /* renamed from: i */
    private C2588b f9105i;

    /* renamed from: j */
    private ArrayList<C2574a.C2575a> f9106j;

    public C2780d(C2862h c2862h, C2843f c2843f) {
        super(c2862h, c2843f, C1306b.C1310d.drawer_effect, C4189x.m588c(C1306b.C1315i.text_effect));
        this.f9104h = c2862h.m4481aC();
        m4673c();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4616a(int i, int i2, int i3, int i4) {
        this.f9103g.m10166a(i, (-C3566b.f11841c.f11763U) / 2.0f, i3, C3566b.f11841c.f11763U / 2.0f);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4611b(boolean z) {
        this.f9129b.m4535e();
        this.f9103g.m10143d();
        if (this.f9106j != null && this.f9106j.size() > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f9106j.size()) {
                    this.f9106j.get(i2).m5242d();
                    i = i2 + 1;
                } else {
                    this.f9105i.measure();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4617a() {
        this.f9129b.m4533f();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4613b() {
        for (int i = 0; i < this.f9104h.m4342i(); i++) {
            this.f9104h.m4351a(i).m4267h();
        }
        if (this.f9106j != null && this.f9106j.size() > 0) {
            for (int i2 = 0; i2 < this.f9106j.size(); i2++) {
                this.f9106j.get(i2).m5241e();
            }
        }
        C3020h.m3825b();
        this.f9104h.m4341j();
    }

    /* renamed from: c */
    private void m4673c() {
        this.f9103g = new C1040h(C0892a.f2553D, C3566b.f11841c.f11763U, C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 0.9f, C3566b.f11841c.f11763U * C0892a.f2567c * 0.9f);
        this.f9103g.m10160a(new C1024b() { // from class: com.tsf.shell.f.f.a.c.d.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C2780d.this.f9104h.m4342i();
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
                AbstractC2745k a = C2780d.this.f9104h.m4351a(i);
                C3020h c3020h = (C3020h) c0975i2;
                if (a.m4266i()) {
                    c3020h.m3820g();
                } else {
                    c3020h.m3819h();
                }
                c3020h.f9833e.textures().clear();
                c3020h.f9833e.textures().addElement(a.m4272a(C3020h.m3822e(), C3020h.m3821f()));
                return c0975i2;
            }
        });
        this.f9103g.m10159a(new C1036f() { // from class: com.tsf.shell.f.f.a.c.d.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                if (!C3359a.f11094h.m4019t().m4453an().m4589c()) {
                    C2780d.this.f9128a.m4414d(i);
                    C4187w.m614b();
                }
                C2780d.this.f9103g.m10143d();
            }
        });
        addChild(this.f9103g);
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_random, C4189x.m588c(C1306b.C1315i.text_random), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.f.a.c.d.3
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C2780d.this.f9104h.m4344g();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C2780d.this.f9104h.m4348a(true);
                C2780d.this.f9103g.m10143d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C2780d.this.f9104h.m4348a(false);
                C2780d.this.f9103g.m10143d();
            }
        }));
        m4675a(arrayList);
    }

    /* renamed from: a */
    public void m4675a(ArrayList<C2574a.C2575a> arrayList) {
        if (arrayList != null) {
            this.f9106j = arrayList;
            this.f9105i = new C2588b();
            this.f9105i.position().f2527y = C0892a.m10742a(160.0f);
            Iterator<C2574a.C2575a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f9105i.addChild(it.next());
            }
            addChild(this.f9105i);
        }
    }
}
