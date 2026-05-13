package com.tsf.shell.manager.p187r.p189b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.r.b.c */
/* loaded from: classes.dex */
public class C3647c<E> extends C2578b {

    /* renamed from: a */
    public C3621a f12057a;

    /* renamed from: b */
    private C1040h f12058b;

    /* renamed from: c */
    private C0980j f12059c;

    /* renamed from: d */
    private AbstractC3651a<E> f12060d;

    /* renamed from: com.tsf.shell.manager.r.b.c$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3651a<E> {
        /* renamed from: a */
        public abstract ArrayList<E> mo1710a();
    }

    /* renamed from: a */
    public void m1817a() {
        this.f12058b.m10143d();
    }

    public C3647c(String str) {
        super(str);
    }

    /* renamed from: a */
    public void mo1733a(MotionEvent motionEvent, E e, C0975i c0975i) {
    }

    /* renamed from: b */
    public boolean mo1725b(MotionEvent motionEvent, E e, C0975i c0975i) {
        return true;
    }

    /* renamed from: a */
    public C0975i mo1729a(E e) {
        return null;
    }

    /* renamed from: b */
    public void mo1722b(E e) {
    }

    /* renamed from: c */
    public void mo1718c(E e) {
    }

    /* renamed from: a */
    public boolean m1815a(AbstractC3651a<E> abstractC3651a) {
        return this.f12060d == abstractC3651a;
    }

    /* renamed from: b */
    public void m1813b(AbstractC3651a<E> abstractC3651a) {
        final boolean z;
        if (this.f12060d == null) {
            this.f12060d = abstractC3651a;
            this.f12058b.m10143d();
            this.f12058b.m10140e();
            return;
        }
        if (this.f12060d != abstractC3651a) {
            this.f12060d = abstractC3651a;
            z = true;
        } else {
            z = false;
        }
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.r.b.c.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (z) {
                    C3647c.this.f12058b.m10143d();
                    C3647c.this.f12058b.m10140e();
                }
                C1017d c1017d2 = new C1017d();
                c1017d2.m10314a(255);
                c1017d2.mo10298h(0.0f);
                c1017d2.m10313a(C0986a.f2946a);
                C1014c.m10326a(C3647c.this.f12058b);
                C1014c.m10325a(C3647c.this.f12058b, 500, c1017d2);
            }
        };
        c1017d.m10314a(0);
        c1017d.mo10298h((-this.f12057a.getHeight()) * 0.8f);
        C1014c.m10326a(this.f12058b);
        C1014c.m10325a(this.f12058b, VEasing.Back.easeIn, c1017d);
    }

    /* renamed from: a */
    public C0975i mo1728a(E e, int i, C0975i c0975i) {
        return c0975i;
    }

    /* renamed from: a */
    public void m1816a(final C3621a c3621a, ArrayList<C2574a.C2575a> arrayList, float f, float f2, float f3, float f4) {
        this.f12057a = c3621a;
        setFunctions(arrayList);
        this.f12059c = new C0980j();
        this.f12058b = new C1040h(C0892a.f2553D, c3621a.getHeight(), 50.0f * C0892a.f2567c, C0892a.f2567c * 20.0f, f3, f4);
        this.f12059c.addChild(this.f12058b);
        this.f12058b.m10160a(new C1024b() { // from class: com.tsf.shell.manager.r.b.c.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3647c.this.f12060d.mo1710a().size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                return C3647c.this.mo1728a((C3647c) C3647c.this.f12060d.mo1710a().get(i), i, c0975i);
            }
        });
        this.f12058b.m10151b(0.0f, C0892a.f2567c * 20.0f);
        this.f12058b.m10159a(new C1036f() { // from class: com.tsf.shell.manager.r.b.c.3

            /* renamed from: c */
            private C0975i f12066c;

            /* renamed from: d */
            private float f12067d;

            /* renamed from: e */
            private float f12068e;

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                E e = C3647c.this.f12060d.mo1710a().get(i);
                if (c3621a.m1860a()) {
                    C3647c.this.mo1722b((C3647c) e);
                } else {
                    C3647c.this.mo1718c(e);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: b */
            public void mo1698b(C0975i c0975i, int i, MotionEvent motionEvent) {
                if (!c3621a.m1860a()) {
                    C4187w.m616a();
                    this.f12066c = C3647c.this.mo1729a((C3647c) C3647c.this.f12060d.mo1710a().get(i));
                    Number3d.TEMPNUMBER3D.reset();
                    Number3d localToGlobal = c0975i.localToGlobal(Number3d.TEMPNUMBER3D);
                    this.f12066c.position().setAllFrom(localToGlobal);
                    this.f12067d = localToGlobal.f2526x;
                    this.f12068e = localToGlobal.f2527y;
                    C3359a.f11096j.m2232a(this.f12066c);
                    C3647c.this.mo1733a(motionEvent, (MotionEvent) C3647c.this.f12060d.mo1710a().get(i), this.f12066c);
                    this.f12066c.alpha(255.0f);
                    C1017d c1017d = new C1017d();
                    c1017d.m10294l(1.2f);
                    c1017d.m10293m(1.2f);
                    c1017d.m10292n(1.2f);
                    C1014c.m10326a(this.f12066c);
                    C1014c.m10325a(this.f12066c, 500, c1017d);
                    c3621a.templeteHide();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: c */
            public void mo1697c(C0975i c0975i, int i, MotionEvent motionEvent) {
                if (!c3621a.m1860a()) {
                    if (C3647c.this.mo1725b(motionEvent, C3647c.this.f12060d.mo1710a().get(i), this.f12066c)) {
                        c3621a.templeteShow();
                    }
                    this.f12066c = null;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo1699a(C0975i c0975i, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f12066c != null) {
                    this.f12066c.position().f2526x = this.f12067d + (motionEvent2.getX() - motionEvent.getX());
                    this.f12066c.position().f2527y = this.f12068e - (motionEvent2.getY() - motionEvent.getY());
                }
            }
        });
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12059c;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f12058b.m10166a(f, f2, f3, f4);
    }
}
