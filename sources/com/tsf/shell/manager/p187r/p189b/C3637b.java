package com.tsf.shell.manager.p187r.p189b;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p187r.p189b.p192c.C3668e;
import com.tsf.shell.manager.p187r.p193c.C3702b;
import com.tsf.shell.manager.p187r.p193c.p194a.C3696a;
import com.tsf.shell.manager.p187r.p193c.p194a.C3700b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.r.b.b */
/* loaded from: classes.dex */
public class C3637b extends C2578b {

    /* renamed from: a */
    private C2574a.C2575a f12040a;

    /* renamed from: b */
    private C2574a.C2575a f12041b;

    /* renamed from: c */
    private Runnable f12042c;

    /* renamed from: d */
    private C3668e f12043d;

    /* renamed from: e */
    private C0980j f12044e;

    public C3637b(final C3621a c3621a, String str) {
        super(str);
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        this.f12042c = new Runnable() { // from class: com.tsf.shell.manager.r.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                C3637b.this.f12040a.m5245a();
            }
        };
        final Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10583c(C3637b.this.f12042c);
            }
        };
        C2574a.C2575a.C2577a c2577a = new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.b.3
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3702b.f12211c;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11095i.m1640b().m1675a(runnable);
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11095i.m1640b().m1674a(false);
            }
        };
        C2574a.C2575a c2575a = new C2574a.C2575a(C1306b.C1310d.widget_menu_decoration_floating, C4189x.m588c(C1306b.C1315i.text_floating), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.b.4
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3702b.f12209a;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3359a.f11095i.m1640b().m1673b(true);
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3359a.f11095i.m1640b().m1673b(false);
            }
        });
        C3702b.f12213e = c2575a;
        this.f12041b = c2575a;
        C2574a.C2575a c2575a2 = new C2574a.C2575a(C1306b.C1310d.widget_menu_setting, C4189x.m588c(C1306b.C1315i.text_animation), c2577a);
        C3702b.f12214f = c2575a2;
        this.f12040a = c2575a2;
        arrayList.add(this.f12040a);
        arrayList.add(this.f12041b);
        setFunctions(arrayList);
        this.f12044e = new C0980j();
        this.f12043d = new C3668e(c3621a, this) { // from class: com.tsf.shell.manager.r.b.b.5
            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3668e
            /* renamed from: a */
            public void mo1743a(AbstractC3341e abstractC3341e) {
                C3637b.this.m1825a(abstractC3341e, 0.0f, c3621a.getScreenFreeSpaceCenter());
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3668e
            /* renamed from: a */
            public boolean mo1742a(AbstractC3341e abstractC3341e, float f, float f2) {
                return C3637b.this.m1825a(abstractC3341e, f, f2);
            }
        };
        this.f12044e.addChild(this.f12043d.m1818f());
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f12043d.mo1771a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f12043d.m1819b(false);
        this.f12043d.mo1766c();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        this.f12043d.mo1772a();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12044e;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        this.f12043d.mo1763e();
    }

    /* renamed from: a */
    public boolean m1825a(AbstractC3341e abstractC3341e, float f, float f2) {
        C3700b.m1677a((C3343g) abstractC3341e, f, f2, new C3696a.AbstractC3699a() { // from class: com.tsf.shell.manager.r.b.b.6
            @Override // com.tsf.shell.manager.p187r.p193c.p194a.C3696a.AbstractC3699a
            /* renamed from: a */
            public void mo1681a(ItemInfo itemInfo) {
            }

            @Override // com.tsf.shell.manager.p187r.p193c.p194a.C3696a.AbstractC3699a
            /* renamed from: a */
            public void mo1680a(C3112b c3112b, C3343g c3343g) {
                c3112b.scale().setAll(0.0f, 0.0f, 1.0f);
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10326a(c3112b);
                C1014c.m10325a(c3112b, 500, c1017d);
            }
        });
        return true;
    }

    /* renamed from: a */
    public void m1826a(AbstractC3341e abstractC3341e) {
        this.f12043d.m1768b(abstractC3341e);
    }

    /* renamed from: b */
    public void m1822b(AbstractC3341e abstractC3341e) {
        this.f12043d.m1765c(abstractC3341e);
    }

    /* renamed from: a */
    public void m1823a(ArrayList<AbstractC3341e> arrayList) {
        this.f12043d.m1769a(arrayList);
    }
}
