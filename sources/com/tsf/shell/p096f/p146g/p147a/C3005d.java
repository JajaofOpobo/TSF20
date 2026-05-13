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
import com.tsf.shell.p096f.p107d.p116e.C2437a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p131f.p141b.p142a.C2885d;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.g.a.d */
/* loaded from: classes.dex */
public class C3005d extends C2578b {

    /* renamed from: a */
    public C2992b f9806a;

    /* renamed from: b */
    private C1040h f9807b;

    public C3005d(C2992b c2992b) {
        super(C1306b.C1315i.mn_drawer);
        this.f9806a = c2992b;
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_random, C4189x.m588c(C1306b.C1315i.text_random), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.g.a.d.1
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3359a.f11108v.f7768a.f9583b.m4344g();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11108v.f7768a.f9583b.m4348a(true);
                C3005d.this.f9807b.m10143d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11108v.f7768a.f9583b.m4348a(false);
                C3005d.this.f9807b.m10143d();
            }
        }));
        setFunctions(arrayList);
        this.f9807b = new C1040h(C0892a.f2553D, this.f9806a.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 0.9f, C3566b.f11841c.f11763U * C0892a.f2567c * 0.9f);
        this.f9807b.m10160a(new C1024b() { // from class: com.tsf.shell.f.g.a.d.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3359a.f11108v.f7768a.f9583b.m4342i();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C2885d c2885d = (C2885d) C3359a.f11108v.f7768a.f9583b.m4351a(i);
                C2437a c2437a = (C2437a) c2885d.m4362o();
                c2437a.f9833e.textures().clear();
                c2437a.f9833e.textures().addElement(C2437a.m5555a());
                if (c2885d.m4266i()) {
                    c2437a.m3820g();
                } else {
                    c2437a.m3819h();
                }
                return c2437a;
            }
        });
        this.f9807b.m10159a(new C1036f() { // from class: com.tsf.shell.f.g.a.d.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C3359a.f11108v.f7768a.f9583b.m4276b(C3359a.f11108v.f7768a.f9583b.m4351a(i));
                C3005d.this.f9807b.m10143d();
            }
        });
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f9807b;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f9807b.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f9807b.m10143d();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        int i = C3359a.f11108v.f7768a.f9583b.m4342i();
        for (int i2 = 0; i2 < i; i2++) {
            C3359a.f11108v.f7768a.f9583b.m4351a(i2).m4267h();
        }
        C3020h.m3825b();
        C3359a.f11108v.f7768a.f9583b.m4341j();
    }
}
