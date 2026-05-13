package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p046h.p051e.C1058a;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p132a.p139d.C2817a;
import com.tsf.shell.p096f.p131f.p132a.p139d.p140a.C2826c;
import com.tsf.shell.p096f.p146g.p147a.C3020h;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.a.c.m */
/* loaded from: classes.dex */
public class C2812m extends C2792i {

    /* renamed from: g */
    private C1058a f9174g;

    /* renamed from: h */
    private C2817a f9175h;

    /* renamed from: i */
    private ArrayList<C3020h> f9176i;

    /* renamed from: j */
    private C3020h f9177j;

    /* renamed from: k */
    private C0984m f9178k;

    /* renamed from: l */
    private float f9179l;

    public C2812m(C2862h c2862h, C2843f c2843f) {
        super(c2862h, c2843f, C1306b.C1310d.drawer_sort, C4189x.m588c(C1306b.C1315i.text_sort));
        this.f9175h = C3359a.f11109w.m2712b();
        m4608d();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4611b(boolean z) {
        m4610c();
        this.f9129b.m4535e();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f9175h.m4598a()) {
                C3020h c3020h = this.f9176i.get(i2);
                C2826c m4597a = this.f9175h.m4597a(i2);
                c3020h.f9833e.textures().addElement(m4597a.m4272a(C3020h.m3822e(), C3020h.m3821f()));
                if (m4597a == this.f9175h.m4591b()) {
                    this.f9177j = c3020h;
                    c3020h.m3820g();
                } else {
                    c3020h.m3819h();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4617a() {
        this.f9129b.m4533f();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4616a(int i, int i2, int i3, int i4) {
        this.f9174g.m10085a(i, (-this.f9179l) / 2.0f, i3, this.f9179l / 2.0f);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4613b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f9175h.m4598a()) {
                this.f9175h.m4597a(i2).m4267h();
                this.f9176i.get(i2).f9833e.textures().clear();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m4610c() {
        this.f9178k.m10355a(this.f9175h.m4591b().m4573c());
    }

    /* renamed from: d */
    private void m4608d() {
        this.f9178k = new C0984m();
        this.f9178k.m10347d(38);
        this.f9178k.position().f2527y = C0892a.m10742a(145.0f);
        this.f9176i = new ArrayList<>();
        float f = 0.0f;
        float f2 = 0.0f;
        final int i = 0;
        while (i < this.f9175h.m4598a()) {
            final C3020h c3020h = new C3020h(1.0f);
            c3020h.f9833e.scale().setAll(0.8f, 0.8f, 1.0f);
            c3020h.f9833e.position().f2527y = C0892a.m10742a(20.0f);
            C3567c.m1967a(c3020h, C3567c.f11849h);
            C0937a c0937a = new C0937a(c3020h) { // from class: com.tsf.shell.f.f.a.c.m.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C3359a.f11094h.m4019t().m4472aL()) {
                        C2812m.this.f9175h.m4590b(C2812m.this.f9175h.m4597a(i).mo4264k());
                        C4187w.m614b();
                        if (C2812m.this.f9177j != null) {
                            C2812m.this.f9177j.m3819h();
                        }
                        C2812m.this.f9177j = c3020h;
                        c3020h.m3820g();
                        C2812m.this.m4610c();
                    }
                }
            };
            c3020h.calAABB();
            c3020h.setMouseEventListener(c0937a);
            f2 = c3020h.maxY() - c3020h.minY();
            float maxX = c3020h.maxX() - c3020h.minX();
            this.f9176i.add(c3020h);
            i++;
            f = maxX;
        }
        this.f9179l = f2;
        this.f9174g = new C1058a(C0892a.f2553D, f2, f * 0.8f, 80.0f * C0892a.f2567c, 40.0f * C0892a.f2567c);
        this.f9174g.m10071d();
        this.f9174g.m10071d();
        addChild(this.f9174g);
        for (int i2 = 0; i2 < this.f9175h.m4598a(); i2++) {
            this.f9174g.addChild(this.f9176i.get(i2));
        }
        addChild(this.f9178k);
    }
}
