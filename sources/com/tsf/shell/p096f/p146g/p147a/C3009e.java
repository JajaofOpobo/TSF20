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
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.g.a.e */
/* loaded from: classes.dex */
public class C3009e extends C2991a {

    /* renamed from: a */
    public C2992b f9811a;

    /* renamed from: b */
    private C1040h f9812b;

    public C3009e(C2992b c2992b) {
        super(C1306b.C1315i.menu_effect_clicking);
        this.f9811a = c2992b;
        C2574a.C2575a.C2577a c2577a = new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.f.g.a.e.1
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3359a.f11108v.f7769b.m5641b();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11108v.f7769b.m5642a(true);
                C3009e.this.f9812b.m10143d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11108v.f7769b.m5642a(false);
                C3009e.this.f9812b.m10143d();
            }
        };
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.effect_setting_desktop_menu_random, C4189x.m588c(C1306b.C1315i.text_random), c2577a));
        setFunctions(arrayList);
        this.f9812b = new C1040h(C0892a.f2553D, this.f9811a.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T * 0.9f, C3566b.f11841c.f11763U * C0892a.f2567c * 0.9f);
        this.f9812b.m10160a(new C1024b() { // from class: com.tsf.shell.f.g.a.e.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3359a.f11108v.f7769b.m5637d();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                AbstractC2374a m5647a = C3359a.f11108v.f7769b.m5647a(i);
                C3020h c3020h = (C3020h) m5647a.mo5650e();
                c3020h.f9833e.textures().clear();
                c3020h.f9833e.textures().addElement(C3020h.m3818i());
                if (m5647a.m5682b()) {
                    c3020h.m3820g();
                } else {
                    c3020h.m3819h();
                }
                return c3020h;
            }
        });
        this.f9812b.m10159a(new C1036f() { // from class: com.tsf.shell.f.g.a.e.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                AbstractC2374a m5647a = C3359a.f11108v.f7769b.m5647a(i);
                C4187w.m614b();
                C3359a.f11108v.f7769b.m5646a(m5647a);
                if (m5647a.m5682b()) {
                    C3009e.this.f9811a.m3844a().m3168a(m5647a);
                }
                C3009e.this.f9812b.m10143d();
            }
        });
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f9812b;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f9812b.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f9812b.m10143d();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        C3020h.m3825b();
        C3020h.m3817j();
        C3359a.f11108v.f7769b.m5636e();
    }
}
