package com.tsf.shell.manager.p187r.p189b.p192c;

import android.appwidget.AppWidgetManager;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.manager.p187r.p189b.C3621a;
import com.tsf.shell.manager.p187r.p189b.p191b.C3644a;
import com.tsf.shell.manager.p187r.p193c.C3702b;
import com.tsf.shell.manager.p187r.p193c.p194a.C3696a;
import com.tsf.shell.manager.p187r.p193c.p194a.C3700b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.p096f.p153i.p161c.C3342f;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import com.tsf.shell.utils.C4170g;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.r.b.c.g */
/* loaded from: classes.dex */
public class C3673g extends C2578b {

    /* renamed from: a */
    private C2574a.C2575a f12125a;

    /* renamed from: b */
    private C2574a.C2575a f12126b;

    /* renamed from: c */
    private C3668e f12127c;

    /* renamed from: d */
    private C3644a f12128d;

    /* renamed from: e */
    private C3644a f12129e;

    /* renamed from: f */
    private C0980j f12130f;

    /* renamed from: g */
    private AppWidgetManager f12131g;

    /* renamed from: h */
    private C3595e.C3597a f12132h;

    public C3673g(final C3621a c3621a, String str) {
        super(str);
        this.f12131g = AppWidgetManager.getInstance(C0853a.m10856d());
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        C2574a.C2575a c2575a = new C2574a.C2575a(C1306b.C1310d.widget_menu_widget_tsf, C4189x.m588c(C1306b.C1315i.group_tsf_widget), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.c.g.1
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3673g.this.f12129e == C3673g.this.f12127c;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3673g.this.m1752a(C3673g.this.f12127c, true);
                C3673g.this.f12126b.m5245a();
            }
        });
        C3702b.f12213e = c2575a;
        this.f12125a = c2575a;
        C2574a.C2575a c2575a2 = new C2574a.C2575a(C1306b.C1310d.widget_menu_widget_system, C4189x.m588c(C1306b.C1315i.group_system_widgets), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.c.g.2
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3673g.this.f12129e == C3673g.this.f12128d;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                if (C4170g.f13485b) {
                    C3673g.this.m1752a(C3673g.this.f12128d, true);
                    C3673g.this.f12125a.m5245a();
                    return;
                }
                C3359a.f11098l.f11996a.m1876b();
            }
        });
        C3702b.f12214f = c2575a2;
        this.f12126b = c2575a2;
        arrayList.add(this.f12125a);
        arrayList.add(this.f12126b);
        setFunctions(arrayList);
        this.f12130f = new C0980j();
        this.f12127c = new C3668e(c3621a, this) { // from class: com.tsf.shell.manager.r.b.c.g.3
            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3668e
            /* renamed from: a */
            public void mo1743a(AbstractC3341e abstractC3341e) {
                C3673g.this.m1753a(abstractC3341e, 0.0f, c3621a.getScreenFreeSpaceCenter());
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3668e
            /* renamed from: a */
            public boolean mo1742a(AbstractC3341e abstractC3341e, float f, float f2) {
                return C3673g.this.m1753a(abstractC3341e, f, f2);
            }
        };
        this.f12128d = new C3667d(c3621a);
        this.f12130f.addChild(this.f12127c.m1818f());
        this.f12130f.addChild(this.f12128d.m1818f());
        this.f12129e = this.f12127c;
        this.f12132h = C3359a.f11087a.m1927a(this, C3595e.f11928m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1752a(C3644a c3644a, boolean z) {
        if (c3644a != this.f12129e) {
            this.f12129e.m1820a(z);
            this.f12129e = c3644a;
            this.f12129e.m1819b(z);
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f12127c.mo1771a(f, f2, f3, f4);
        this.f12128d.mo1771a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f12129e.m1819b(false);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShowComplete() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        this.f12132h.m1916b();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12130f;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        super.onRecycle();
        m1752a(this.f12127c, false);
        this.f12126b.m5245a();
        this.f12127c.mo1763e();
        this.f12128d.mo1763e();
    }

    /* renamed from: a */
    public boolean m1753a(AbstractC3341e abstractC3341e, float f, float f2) {
        if (abstractC3341e instanceof C3343g) {
            C3700b.m1677a((C3343g) abstractC3341e, f, f2, new C3696a.AbstractC3699a() { // from class: com.tsf.shell.manager.r.b.c.g.4
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
        } else if (abstractC3341e instanceof C3342f) {
            float[] m612a = C4189x.m612a(f, f2);
            C3359a.f11098l.f11996a.m1882a(this.f12131g, (C3342f) abstractC3341e, (int) m612a[0], (int) m612a[1]);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public void m1754a(AbstractC3341e abstractC3341e) {
        this.f12127c.m1768b(abstractC3341e);
    }

    /* renamed from: b */
    public void m1748b(AbstractC3341e abstractC3341e) {
        this.f12127c.m1765c(abstractC3341e);
    }

    /* renamed from: a */
    public void m1749a(ArrayList<AbstractC3341e> arrayList) {
        this.f12127c.m1769a(arrayList);
    }
}
