package com.censivn.C3DEngine.p031b.p046h.p048b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.censivn.C3DEngine.b.h.b.a */
/* loaded from: classes.dex */
public class C1023a extends C0937a {

    /* renamed from: a */
    public boolean f3081a;

    /* renamed from: b */
    private C1035e f3082b;

    /* renamed from: d */
    private InterfaceC1034d f3083d;

    /* renamed from: e */
    private C3112b f3084e;

    /* renamed from: f */
    private float f3085f;

    /* renamed from: g */
    private float f3086g;

    /* renamed from: h */
    private boolean f3087h;

    public C1023a(C0975i c0975i) {
        super(c0975i);
        this.f3087h = false;
    }

    /* renamed from: a */
    public void m10268a(C1035e c1035e) {
        this.f3082b = c1035e;
        this.f3083d = c1035e.m10218a();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: f */
    public void mo1653f(MotionEvent motionEvent) {
        this.f3083d.mo10226c(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: g */
    public void mo3208g(MotionEvent motionEvent) {
        this.f3083d.mo10228b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo502a(MotionEvent motionEvent) {
        this.f3083d.mo10219f(motionEvent);
        this.f3082b.mo10203b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: k */
    public void mo10267k(MotionEvent motionEvent) {
        this.f3083d.mo10221e(motionEvent);
        this.f3082b.m10196d(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: h */
    public void mo3555h(MotionEvent motionEvent) {
        if (this.f3082b.m10206a(false)) {
            this.f3083d.mo10224d(motionEvent);
            this.f3082b.mo10214a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: c */
    public void mo2122c(MotionEvent motionEvent) {
        int i;
        super.mo2122c(motionEvent);
        if (this.f3082b.m10206a(true)) {
            this.f3087h = false;
            C3112b m10193e = this.f3082b.m10193e(motionEvent);
            if (m10193e != null && (m10193e instanceof C3231c)) {
                C3231c c3231c = (C3231c) m10193e;
                C4187w.m616a();
                this.f3084e = c3231c;
                this.f3081a = true;
                if (c3231c.m3541A().m3563e()) {
                    int i2 = Integer.MAX_VALUE;
                    ArrayList<C3231c> m3560i = c3231c.m3541A().m3560i();
                    c3231c.rotation().f2528z = 0.0f;
                    int size = m3560i.size();
                    int i3 = 0;
                    while (i3 < size) {
                        C3231c c3231c2 = m3560i.get(i3);
                        if (c3231c2 != c3231c) {
                            i = c3231c2.m3535J();
                            if (i >= i2) {
                                i = i2;
                            }
                            this.f3083d.mo10223d(c3231c2);
                            c3231c.m3080a(c3231c2);
                            this.f3082b.m10197d();
                        } else {
                            i = i2;
                        }
                        i3++;
                        i2 = i;
                    }
                    this.f3082b.m10215a(i2, c3231c);
                    c3231c.m3541A().m3561g();
                }
                C3359a.f11096j.m2230a((C0975i) this.f3084e, true);
                m10270a();
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.2f);
                c1017d.m10293m(1.2f);
                c1017d.m10292n(1.2f);
                C1014c.m10326a(this.f3084e);
                C1014c.m10325a(this.f3084e, 500, c1017d);
                this.f3082b.m10198c(this.f3084e);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    public void mo1654e(MotionEvent motionEvent) {
        this.f3083d.mo10232a(motionEvent);
        this.f3082b.m10199c(motionEvent);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: d */
    public void mo2119d(MotionEvent motionEvent) {
        super.mo2119d(motionEvent);
        if (this.f3081a) {
            this.f3081a = false;
            boolean m10210a = this.f3082b.m10210a(this.f3084e, motionEvent.getX(), motionEvent.getY(), false, true);
            C3359a.f11096j.m2223b(this.f3084e);
            if (m10210a && this.f3082b.m10192e(this.f3084e)) {
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                c1017d.m10292n(1.0f);
                c1017d.m10313a(C0986a.f2946a);
                C1014c.m10326a(this.f3084e);
                C1014c.m10325a(this.f3084e, 500, c1017d);
                this.f3082b.m10195d(this.f3084e);
                return;
            }
            this.f3082b.m10205b().globalToLocal(this.f3084e.position());
            this.f3082b.m10205b().addChildAt(this.f3084e, this.f3084e.m3535J());
            Number3d m10217a = this.f3082b.m10217a(this.f3084e.m3535J());
            if (this.f3084e instanceof C3231c) {
                C3231c c3231c = (C3231c) this.f3084e;
                if (c3231c.m3064as()) {
                    ArrayList<C3231c> m3060aw = c3231c.m3060aw();
                    ArrayList<C3112b> arrayList = new ArrayList<>();
                    int size = m3060aw == null ? 0 : m3060aw.size();
                    if (size > 0) {
                        int J = c3231c.m3535J() + 1;
                        for (int i = 0; i < size; i++) {
                            C3231c c3231c2 = m3060aw.get(i);
                            arrayList.add(c3231c2);
                            c3231c2.position().f2526x = c3231c.position().f2526x + (AbstractC3208b.f10553j * (i + 1));
                            c3231c2.position().f2527y = c3231c.position().f2527y + (AbstractC3208b.f10553j * (i + 1));
                            c3231c2.removeFromParent();
                        }
                        this.f3082b.m10207a(arrayList, J);
                    }
                }
            }
            C1017d c1017d2 = new C1017d();
            this.f3082b.m10195d(this.f3084e);
            c1017d2.m10294l(1.0f);
            c1017d2.m10293m(1.0f);
            c1017d2.m10292n(1.0f);
            c1017d2.mo10301f(m10217a.f2526x);
            c1017d2.mo10298h(m10217a.f2527y);
            c1017d2.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f3084e);
            C1014c.m10325a(this.f3084e, 500, c1017d2);
            if (!this.f3087h && (this.f3082b.m10205b() instanceof C2570b) && (this.f3084e instanceof C3231c)) {
                ((C3231c) this.f3084e).m3074ai();
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.mo2129a(motionEvent, motionEvent2);
        if (this.f3081a) {
            if (this.f3087h) {
                this.f3084e.position().f2526x = (int) (this.f3085f + (motionEvent2.getX() - motionEvent.getX()));
                this.f3084e.position().f2527y = (int) (this.f3086g - (motionEvent2.getY() - motionEvent.getY()));
                this.f3082b.m10211a(this.f3084e, motionEvent2.getX(), motionEvent2.getY());
                return;
            } else if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 60.0f) {
                this.f3087h = true;
                if (this.f3084e instanceof C3112b) {
                    this.f3084e.mo3077ab();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        this.f3083d.mo10231a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f3083d.mo10230a(motionEvent, motionEvent2, f, f2);
    }

    /* renamed from: a */
    public void m10270a() {
        m10269a(this.f3084e.position().f2526x, this.f3084e.position().f2527y);
    }

    /* renamed from: a */
    public void m10269a(float f, float f2) {
        this.f3085f = f;
        this.f3086g = f2;
    }
}
