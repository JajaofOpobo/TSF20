package com.tsf.shell.manager.p187r.p193c;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1025c;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.p096f.p118e.C2603h;
import com.tsf.shell.p096f.p118e.C2640n;
import com.tsf.shell.p096f.p118e.InterfaceC2639m;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.r.c.d */
/* loaded from: classes.dex */
public class C3712d implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a, C2603h.InterfaceC2610a, C2640n.InterfaceC2648a {

    /* renamed from: e */
    private static C3719a f12231e;

    /* renamed from: a */
    private C0980j f12232a;

    /* renamed from: b */
    private C2603h f12233b;

    /* renamed from: c */
    private String f12234c;

    /* renamed from: d */
    private String f12235d;

    /* renamed from: f */
    private boolean f12236f;

    /* renamed from: g */
    private C3550a.C3558a f12237g;

    /* renamed from: h */
    private ArrayList<C3112b> f12238h;

    /* renamed from: i */
    private boolean f12239i = false;

    /* renamed from: j */
    private boolean f12240j = false;

    /* renamed from: com.tsf.shell.manager.r.c.d$a */
    /* loaded from: classes.dex */
    public class C3719a implements Comparator<C0975i> {
        public C3719a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C0975i c0975i, C0975i c0975i2) {
            float f = (C0892a.f2558I - (c0975i.position().f2527y * C0892a.f2555F)) + c0975i.position().f2526x + C0892a.f2557H;
            float f2 = (C0892a.f2558I - (c0975i2.position().f2527y * C0892a.f2555F)) + c0975i2.position().f2526x + C0892a.f2557H;
            if (f > f2) {
                return 1;
            }
            if (f < f2) {
                return -1;
            }
            return 0;
        }
    }

    public C3712d() {
        if (f12231e == null) {
            f12231e = new C3719a();
        }
        this.f12235d = C0853a.m10856d().getString(C1306b.C1315i.line_picker_back_to_select);
        this.f12234c = C0853a.m10856d().getString(C1306b.C1315i.notic_function_unavailable);
        this.f12232a = new C0980j() { // from class: com.tsf.shell.manager.r.c.d.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
                C3712d.this.m1659c();
            }
        };
        this.f12233b = new C2603h();
        this.f12233b.m5199a(this.f12232a);
        this.f12233b.m5197a(this);
        this.f12233b.m5190a(true);
        this.f12232a.setMouseEventListener(new C0937a(this.f12232a) { // from class: com.tsf.shell.manager.r.c.d.2

            /* renamed from: a */
            boolean f12242a = false;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                C3398f.m2651a();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!C3712d.this.f12233b.m5204a()) {
                    C3712d.this.f12233b.m5200a(motionEvent, motionEvent2);
                } else if (!this.f12242a) {
                    final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    final MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
                    final float[] m601a = C4189x.m601a(motionEvent);
                    this.f12242a = true;
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.d.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2932g m4031n = C3359a.f11094h.m4031n();
                            C3712d.this.f12232a.removeFromParent();
                            m4031n.m4229a(C3712d.this.f12232a);
                            C3712d.this.f12232a.position().f2526x = m601a[0];
                            C3712d.this.f12232a.position().f2527y = m601a[1];
                            C3712d.this.f12233b.m5200a(obtain, obtain2);
                        }
                    });
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                C3712d.this.f12233b.m5201a(motionEvent);
                C3712d.this.m1659c();
                this.f12242a = false;
            }
        });
    }

    /* renamed from: a */
    public boolean m1666a() {
        return this.f12236f;
    }

    /* renamed from: b */
    public void m1661b() {
        if (!this.f12236f) {
            this.f12237g = C3359a.f11103q.m2043a(this.f12237g, C4189x.m588c(C1306b.C1315i.notic_line_picker_notic));
            this.f12236f = true;
            this.f12232a.position().f2526x = 0.0f;
            this.f12232a.position().f2527y = 0.0f;
            this.f12232a.removeFromParent();
            C0915b.m10597a(this);
            C3359a.f11096j.m2232a(this.f12232a);
            this.f12232a.setFocus();
            this.f12232a.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
            C3359a.f11088b.m10565a(this);
            mo1657e();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m1659c();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: c */
    public void m1659c() {
        if (this.f12236f) {
            C3359a.f11103q.m2037b(this.f12237g);
            this.f12236f = false;
            C0915b.m10594b(this);
            this.f12232a.removeFromParent();
            C3359a.f11088b.m10557b(this);
            mo1658d();
        }
    }

    /* renamed from: d */
    public void mo1658d() {
    }

    /* renamed from: e */
    public void mo1657e() {
    }

    @Override // com.tsf.shell.p096f.p118e.C2603h.InterfaceC2610a
    /* renamed from: a */
    public void mo1663a(InterfaceC2639m interfaceC2639m) {
        if (this.f12238h == null) {
            this.f12238h = new ArrayList<>();
        }
        if (interfaceC2639m instanceof AbstractC3208b) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) interfaceC2639m;
            if (abstractC3208b.m3068ao()) {
                abstractC3208b.m3065ar();
            }
            C3112b c3112b = (C3112b) interfaceC2639m;
            this.f12239i = true;
            c3112b.setDefaultColor(C2603h.f8568a);
            this.f12238h.add(c3112b);
        } else if (interfaceC2639m instanceof C3145b) {
            C3112b c3112b2 = (C3112b) interfaceC2639m;
            this.f12239i = true;
            c3112b2.setDefaultColor(C2603h.f8568a);
            this.f12238h.add(c3112b2);
        }
    }

    @Override // com.tsf.shell.p096f.p118e.C2603h.InterfaceC2610a
    /* renamed from: f */
    public void mo1656f() {
        Iterator<C3112b> it = this.f12238h.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        this.f12238h.clear();
    }

    @Override // com.tsf.shell.p096f.p118e.C2603h.InterfaceC2610a
    /* renamed from: l_ */
    public C2640n mo1655l_() {
        return new C2640n(this.f12232a, this);
    }

    @Override // com.tsf.shell.p096f.p118e.C2640n.InterfaceC2648a
    /* renamed from: a */
    public void mo1665a(int i) {
        ArrayList<C3112b> arrayList = new ArrayList<>();
        Iterator<C3112b> it = this.f12238h.iterator();
        while (it.hasNext()) {
            C3112b next = it.next();
            if (!next.hasDestroyed()) {
                arrayList.add(next);
            }
        }
        this.f12238h.clear();
        Iterator<C3112b> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().clearDefaultColor();
        }
        switch (i) {
            case 0:
                if (arrayList.size() > 1 && arrayList.get(0).m3486z() != null) {
                    C1025c c1025c = new C1025c(arrayList.get(0).m3486z(), true);
                    Collections.sort(arrayList, f12231e);
                    c1025c.m10250c();
                    c1025c.m10258a(arrayList);
                    break;
                } else {
                    C2244e.m6020a(C1306b.C1315i.notic_arrangement_error);
                    break;
                }
            case 1:
                C2244e.m6012a(this.f12234c);
                break;
            case 2:
                final ArrayList arrayList2 = (ArrayList) arrayList.clone();
                C2244e.m6019a(C1306b.C1315i.pop_menu_delete_notic, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.d.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    C3743g.m1619a((C3112b) it3.next(), (Runnable) null);
                                }
                            }
                        });
                    }
                }, (Runnable) null);
                break;
            case 3:
                final ArrayList arrayList3 = new ArrayList();
                Iterator<C3112b> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C3112b next2 = it3.next();
                    if (next2 instanceof AbstractC3208b) {
                        arrayList3.add((AbstractC3208b) next2);
                    }
                }
                if (arrayList3.size() > 0) {
                    float f = ((AbstractC3208b) arrayList3.get(0)).position().f2526x;
                    float f2 = ((AbstractC3208b) arrayList3.get(0)).position().f2527y;
                    Iterator it4 = arrayList3.iterator();
                    float f3 = f;
                    while (true) {
                        float f4 = f2;
                        if (it4.hasNext()) {
                            AbstractC3208b abstractC3208b = (AbstractC3208b) it4.next();
                            f3 = (f3 + abstractC3208b.position().f2526x) / 2.0f;
                            f2 = (abstractC3208b.position().f2527y + f4) / 2.0f;
                        } else {
                            final C3145b m3407a = C3145b.m3407a(C3359a.f11094h.m4121F(), (int) f3, (int) f4);
                            RenderRunnable renderRunnable = new RenderRunnable(2, 1) { // from class: com.tsf.shell.manager.r.c.d.4
                                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                                public void run() {
                                    m3407a.m3328c(arrayList3);
                                }
                            };
                            renderRunnable.autoInvalidate = true;
                            C0853a.m10865a().m10590a(renderRunnable);
                            break;
                        }
                    }
                }
                break;
            case 4:
                Iterator<C3112b> it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C3112b next3 = it5.next();
                    if (next3 instanceof C3231c) {
                        ((C3231c) next3).m3067ap();
                    }
                }
                break;
        }
        arrayList.clear();
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        this.f12232a.setAABBPX(C0892a.f2590z, C0892a.f2552C, 0.0f, C0892a.f2550A, C0892a.f2551B, 0.0f);
    }
}
