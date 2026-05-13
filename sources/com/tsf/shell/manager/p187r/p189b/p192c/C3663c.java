package com.tsf.shell.manager.p187r.p189b.p192c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p187r.p189b.p191b.C3644a;
import com.tsf.shell.manager.p187r.p189b.p192c.C3655b;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.p096f.p153i.p161c.C3342f;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.r.b.c.c */
/* loaded from: classes.dex */
public class C3663c extends C3644a {

    /* renamed from: a */
    private C3667d f12096a;

    /* renamed from: b */
    private C1040h f12097b;

    /* renamed from: e */
    private PackageManager f12098e;

    /* renamed from: f */
    private AppWidgetManager f12099f;

    /* renamed from: g */
    private ArrayList<AbstractC3341e> f12100g;

    /* renamed from: h */
    private C3652a f12101h;

    /* renamed from: i */
    private float f12102i;

    /* renamed from: j */
    private ArrayList<C3342f> f12103j;

    public C3663c(AbstractC2593d abstractC2593d, C3667d c3667d) {
        super(abstractC2593d);
        this.f12103j = new ArrayList<>();
        this.f12096a = c3667d;
        m1780g();
    }

    /* renamed from: g */
    private void m1780g() {
        this.f12101h = new C3652a() { // from class: com.tsf.shell.manager.r.b.c.c.1
            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3652a
            /* renamed from: a */
            public void mo1778a() {
                C3663c.this.f12096a.m1775c(true);
            }
        };
        this.f12098e = C0853a.m10856d().getPackageManager();
        this.f12099f = AppWidgetManager.getInstance(C0853a.m10856d());
        this.f12100g = new ArrayList<>();
        this.f12102i = C0892a.m10742a(900.0f);
        this.f12097b = new C1040h(C0892a.f2553D, this.f12054d.getHeight(), 50.0f * C0892a.f2567c, C0892a.f2567c * 20.0f, 0.0f, 0.0f);
        this.f12053c.addChild(this.f12097b);
        this.f12097b.m10160a(new C1024b() { // from class: com.tsf.shell.manager.r.b.c.c.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3663c.this.f12103j.size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C0975i c3678h = c0975i == null ? new C3678h(C3663c.this.f12102i, C3663c.this.f12054d.getHeight() - C0892a.m10742a(100.0f), C0892a.m10742a(30.0f), false) : c0975i;
                ((C3678h) c3678h).m1738a((AbstractC3341e) C3663c.this.f12103j.get(i), false);
                return c3678h;
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public void mo1761a(C0975i c0975i) {
                ((C3678h) c0975i).m1735d();
            }
        });
        this.f12097b.m10159a(new C3671f(this.f12054d) { // from class: com.tsf.shell.manager.r.b.c.c.3
            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3671f, com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C3663c.this.m1790a((AbstractC3341e) C3663c.this.f12103j.get(i), 0.0f, C3663c.this.f12054d.getScreenFreeSpaceCenter());
                C3663c.this.f12054d.templeteHide();
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3671f
            /* renamed from: a */
            public AbstractC3341e mo1760a(int i) {
                return (AbstractC3341e) C3663c.this.f12103j.get(i);
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3671f
            /* renamed from: a */
            public boolean mo1759a(AbstractC3341e abstractC3341e, float f, float f2) {
                return C3663c.this.m1790a(abstractC3341e, f, f2);
            }
        });
        this.f12097b.m10151b(0.0f, C0892a.f2567c * 20.0f);
    }

    /* renamed from: a */
    protected boolean m1790a(AbstractC3341e abstractC3341e, float f, float f2) {
        float[] m612a = C4189x.m612a(f, f2);
        C3359a.f11098l.f11996a.m1882a(this.f12099f, (C3342f) abstractC3341e, (int) m612a[0], (int) m612a[1]);
        return false;
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: c */
    public void mo1766c() {
        this.f12054d.showOption(this.f12101h);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: a */
    public void mo1772a() {
        this.f12101h.m1806c();
        this.f12054d.resuemCurrentOption();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: e */
    public void mo1763e() {
        m1779h();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: b */
    public void mo1786b() {
        m1779h();
    }

    /* renamed from: h */
    private void m1779h() {
        Iterator<C3342f> it = this.f12103j.iterator();
        while (it.hasNext()) {
            C3342f next = it.next();
            next.mo1625a();
            this.f12100g.add(next);
        }
        this.f12103j.clear();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: a */
    public void mo1771a(float f, float f2, float f3, float f4) {
        this.f12097b.m10167a(this.f12102i, this.f12054d.getHeight());
        this.f12097b.m10166a(f, f2, f3, f4);
        this.f12101h.m1811a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void m1789a(C3655b.C3661a c3661a) {
        this.f12097b.m10140e();
        m1779h();
        Iterator<C3655b.C3662b> it = c3661a.f12089c.iterator();
        while (it.hasNext()) {
            C3655b.C3662b next = it.next();
            C3342f m1787a = m1787a(next.f12093a.label, next.f12094b, next.f12093a);
            m1787a.m2804a(next.f12093a.provider);
            m1787a.m2801d(next.f12093a.minHeight);
            m1787a.m2800e(next.f12093a.minWidth);
            this.f12103j.add(m1787a);
        }
        this.f12101h.m1808a(c3661a);
        this.f12097b.m10143d();
    }

    /* renamed from: a */
    private C3342f m1787a(String str, ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        C3342f c3342f;
        if (this.f12100g.isEmpty()) {
            c3342f = new C3342f();
        } else {
            c3342f = (C3342f) this.f12100g.remove(0);
        }
        c3342f.m2803a(str, applicationInfo, appWidgetProviderInfo);
        return c3342f;
    }
}
