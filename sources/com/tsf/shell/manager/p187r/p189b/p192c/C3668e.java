package com.tsf.shell.manager.p187r.p189b.p192c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.shell.manager.p187r.p189b.p191b.C3644a;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c;
import com.tsf.shell.p096f.p153i.p161c.AbstractC3341e;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.r.b.c.e */
/* loaded from: classes.dex */
public class C3668e extends C3644a {

    /* renamed from: a */
    private C1040h f12110a;

    /* renamed from: b */
    private ArrayList<AbstractC3341e> f12111b;

    /* renamed from: e */
    private float f12112e;

    /* renamed from: f */
    private float f12113f;

    public C3668e(AbstractC2593d abstractC2593d, final AbstractC2580c abstractC2580c) {
        super(abstractC2593d);
        this.f12111b = new ArrayList<>();
        this.f12112e = 0.0f;
        this.f12113f = 0.0f;
        this.f12110a = new C1040h(C0892a.f2553D, abstractC2593d.getHeight(), 50.0f * C0892a.f2567c, C0892a.f2567c * 20.0f, this.f12112e, this.f12113f);
        this.f12053c.addChild(this.f12110a);
        this.f12110a.m10160a(new C1024b() { // from class: com.tsf.shell.manager.r.b.c.e.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3668e.this.f12111b.size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C0975i c3678h = c0975i == null ? new C3678h(C3668e.this.f12112e, C3668e.this.f12113f, C0892a.m10742a(30.0f), true) : c0975i;
                C3678h c3678h2 = (C3678h) c3678h;
                if (c3678h2.m1737b() != C3668e.this.f12112e || c3678h2.m1736c() != C3668e.this.f12113f) {
                    c3678h2.m1740a(C3668e.this.f12112e, C3668e.this.f12113f);
                }
                c3678h2.m1738a((AbstractC3341e) C3668e.this.f12111b.get(i), abstractC2580c.isAnimation());
                return c3678h;
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public void mo1761a(C0975i c0975i) {
                ((C3678h) c0975i).m1735d();
            }
        });
        this.f12110a.m10151b(0.0f, C0892a.f2567c * 20.0f);
        this.f12110a.m10159a(new C3671f(abstractC2593d) { // from class: com.tsf.shell.manager.r.b.c.e.2
            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3671f, com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                AbstractC3341e abstractC3341e = (AbstractC3341e) C3668e.this.f12111b.get(i);
                if (abstractC3341e instanceof C3343g) {
                    C3343g c3343g = (C3343g) abstractC3341e;
                    if (!c3343g.m2789j()) {
                        c3343g.m2788k();
                        return;
                    } else {
                        C3668e.this.mo1743a(abstractC3341e);
                        return;
                    }
                }
                C3668e.this.mo1743a(abstractC3341e);
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3671f
            /* renamed from: a */
            public AbstractC3341e mo1760a(int i) {
                return (AbstractC3341e) C3668e.this.f12111b.get(i);
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p192c.C3671f
            /* renamed from: a */
            public boolean mo1759a(AbstractC3341e abstractC3341e, float f, float f2) {
                return C3668e.this.mo1742a(abstractC3341e, f, f2);
            }
        });
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: a */
    public void mo1772a() {
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: c */
    public void mo1766c() {
        m1762g();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: e */
    public void mo1763e() {
        Iterator<AbstractC3341e> it = this.f12111b.iterator();
        while (it.hasNext()) {
            C3343g c3343g = (C3343g) it.next();
            c3343g.m2806i();
            c3343g.mo2791g();
        }
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: a */
    public void mo1771a(float f, float f2, float f3, float f4) {
        this.f12112e = (C0892a.f2553D - (120.0f * C0892a.f2567c)) / 2.0f;
        this.f12113f = 370.0f * C0892a.f2567c;
        this.f12110a.m10167a(this.f12112e, this.f12113f);
        this.f12110a.m10166a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void mo1743a(AbstractC3341e abstractC3341e) {
    }

    /* renamed from: a */
    public boolean mo1742a(AbstractC3341e abstractC3341e, float f, float f2) {
        return true;
    }

    /* renamed from: g */
    public void m1762g() {
        this.f12110a.m10143d();
    }

    /* renamed from: b */
    public void m1768b(AbstractC3341e abstractC3341e) {
        this.f12111b.add(abstractC3341e);
        this.f12110a.m10143d();
    }

    /* renamed from: a */
    public void m1769a(ArrayList<AbstractC3341e> arrayList) {
        this.f12111b.addAll(arrayList);
        this.f12110a.m10143d();
    }

    /* renamed from: c */
    public void m1765c(AbstractC3341e abstractC3341e) {
        this.f12111b.remove(abstractC3341e);
        this.f12110a.m10143d();
    }
}
