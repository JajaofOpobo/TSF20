package com.tsf.shell.p096f.p118e.p119a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1037g;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3361b;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.a.c */
/* loaded from: classes.dex */
public class C2455c {

    /* renamed from: b */
    private static C0980j f8079b;

    /* renamed from: c */
    private static C0981k f8080c;

    /* renamed from: d */
    private static boolean f8081d;

    /* renamed from: e */
    private static C1037g f8082e;

    /* renamed from: f */
    private static C2454b f8083f;

    /* renamed from: g */
    private static C2462d f8084g;

    /* renamed from: i */
    private static InterfaceC2453a f8086i;

    /* renamed from: j */
    private static ArrayList<C3222g> f8087j;

    /* renamed from: k */
    private static ArrayList<C3377f> f8088k;

    /* renamed from: l */
    private static C3361b.InterfaceC3363a f8089l;

    /* renamed from: a */
    private static float f8078a = 0.0f;

    /* renamed from: h */
    private static boolean f8085h = false;

    /* renamed from: h */
    private static void m5519h() {
        if (!f8081d) {
            f8083f = new C2454b();
            f8084g = new C2462d();
            f8079b = new C0980j() { // from class: com.tsf.shell.f.e.a.c.1
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onKillFocus() {
                    C2455c.m5525b();
                }
            };
            f8089l = new C3361b.InterfaceC3363a() { // from class: com.tsf.shell.f.e.a.c.2
                @Override // com.tsf.shell.manager.p166a.C3361b.InterfaceC3363a
                /* renamed from: a */
                public void mo1842a() {
                    C2455c.m5529a();
                    C2455c.f8082e.m10181b();
                }
            };
            f8079b.alpha(0.0f);
            f8080c = new C0981k(C0892a.f2553D, 308.0f * C0892a.f2566b, false);
            f8079b.addChild(f8080c);
            f8082e = new C1037g(C0892a.f2590z, C0892a.f2550A, C0892a.f2566b * (-80.0f), C0892a.f2566b * 80.0f, C3566b.f11839a.f11762T) { // from class: com.tsf.shell.f.e.a.c.3
                @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1037g
                /* renamed from: a */
                public C0975i mo5516a(int i, C0975i c0975i) {
                    C0962a c0962a;
                    if (c0975i == null) {
                        c0962a = C3566b.f11839a.m2010b();
                        c0962a.m10448a(true);
                        c0962a.calAABB();
                    } else {
                        c0962a = c0975i;
                    }
                    c0962a.textures().clear();
                    c0962a.textures().addElement(((C3222g) C2455c.f8087j.get(i)).m3111aZ());
                    return c0962a;
                }

                @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1037g
                /* renamed from: e */
                public int mo5514e() {
                    return C2455c.f8087j.size();
                }

                @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1037g
                /* renamed from: a */
                public void mo5515a(C0975i c0975i, int i) {
                    C2455c.f8086i.mo3402a(c0975i, (C3222g) C2455c.f8087j.get(i));
                    C2455c.f8087j.remove(i);
                    m10188a(i);
                    m10181b();
                    if (C2455c.f8087j.size() == 0) {
                        C2455c.m5525b();
                    }
                }
            };
            f8079b.addChild(f8082e);
            f8079b.setAABBPX(C0892a.f2590z, C0892a.f2566b * (-80.0f), 0.0f, C0892a.f2550A, 80.0f * C0892a.f2566b, 0.0f);
            f8079b.setMouseEventListener(new C0937a(f8079b) { // from class: com.tsf.shell.f.e.a.c.4

                /* renamed from: a */
                C0937a f8090a;

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: e */
                public void mo1654e(MotionEvent motionEvent) {
                    float[] m601a = C4189x.m601a(motionEvent);
                    C0975i hittingTarget = this.f2740c.getHittingTarget(m601a[0], m601a[1], true);
                    if (hittingTarget == null) {
                        this.f8090a = C2455c.f8082e.getMouseEventListener();
                        return;
                    }
                    this.f8090a = hittingTarget.getMouseEventListener();
                    this.f8090a.mo1654e(motionEvent);
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (this.f8090a != null) {
                        this.f8090a.mo527a(motionEvent, motionEvent2, f, f2);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: f */
                public void mo1653f(MotionEvent motionEvent) {
                    if (this.f8090a != null) {
                        this.f8090a.mo1653f(motionEvent);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (this.f8090a != null) {
                        C4187w.m614b();
                        this.f8090a.mo502a(motionEvent);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: b */
                public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (this.f8090a != null) {
                        this.f8090a.mo3209b(motionEvent, motionEvent2, f, f2);
                    }
                }
            });
            f8081d = true;
            return;
        }
        f8082e.m10190a();
        f8082e.m10181b();
    }

    /* renamed from: a */
    public static void m5529a() {
        f8087j.clear();
        ArrayList<C3222g> m2750d = C3359a.f11109w.m2716a().f11127a.m2750d();
        if (f8088k != null) {
            Iterator<C3222g> it = m2750d.iterator();
            while (it.hasNext()) {
                C3222g next = it.next();
                if (!f8088k.contains(next.m3106bd())) {
                    f8087j.add(next);
                }
            }
            m2750d.clear();
            return;
        }
        Iterator<C3222g> it2 = m2750d.iterator();
        while (it2.hasNext()) {
            f8087j.add(it2.next());
        }
    }

    /* renamed from: a */
    public static void m5526a(InterfaceC2453a interfaceC2453a, ArrayList<C3377f> arrayList) {
        if (f8087j != null) {
            f8087j.clear();
        }
        f8088k = arrayList;
        f8087j = new ArrayList<>();
        m5529a();
        f8086i = interfaceC2453a;
        f8086i.mo3324e();
        m5519h();
        C3359a.f11109w.m2716a().f11127a.m2754a(f8089l);
        C3359a.f11109w.m2716a().f11127a.m2753b();
        m5517j();
        if (f8079b.parent() == null) {
            f8079b.position().f2527y = f8078a - (300.0f * C0892a.f2566b);
        } else {
            f8079b.removeFromParent();
        }
        C3359a.f11096j.m2232a(f8079b);
        m5518i();
    }

    /* renamed from: b */
    public static void m5525b() {
        if (f8085h) {
            C3359a.f11109w.m2716a().f11127a.m2752b(f8089l);
            C0915b.m10594b(f8083f);
            C3359a.f11088b.m10557b(f8084g);
            m5524c();
        }
    }

    /* renamed from: i */
    private static void m5518i() {
        f8079b.mouseEnabled(false);
        f8079b.setFocus();
        f8085h = true;
        C0915b.m10597a(f8083f);
        C3359a.f11088b.m10565a(f8084g);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.a.c.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2455c.f8079b.mouseEnabled(true);
            }
        };
        c1017d.m10314a(255);
        c1017d.mo10298h(f8078a);
        C1014c.m10326a(f8079b);
        C1014c.m10325a(f8079b, 500, c1017d);
    }

    /* renamed from: c */
    protected static void m5524c() {
        f8085h = false;
        f8086i.mo3318i();
        f8079b.mouseEnabled(false);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.a.c.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2455c.f8079b.removeFromParent();
                C2455c.f8086i.mo3320h();
                InterfaceC2453a unused = C2455c.f8086i = null;
                C2455c.f8087j.clear();
            }
        };
        c1017d.m10314a(0);
        c1017d.mo10298h(f8078a - (300.0f * C0892a.f2566b));
        C1014c.m10326a(f8079b);
        C1014c.m10325a(f8079b, 500, c1017d);
    }

    /* renamed from: j */
    private static void m5517j() {
        f8079b.setAABBPX(C0892a.f2590z, C0892a.f2566b * (-80.0f), 0.0f, C0892a.f2550A, C0892a.f2566b * 80.0f, 0.0f);
        f8080c.mo10368a(C0892a.f2553D);
        f8082e.m10189a(C0892a.f2590z, C0892a.f2566b * (-80.0f), C0892a.f2550A, C0892a.f2566b * 80.0f);
        f8078a = C0892a.f2552C + (C3566b.f11839a.f11763U / 2.0f) + (10.0f * C0892a.f2567c);
        if (f8085h) {
            f8079b.position().f2527y = f8078a;
        }
    }

    /* renamed from: a */
    public static void m5528a(int i, int i2, int i3, int i4) {
        m5517j();
    }
}
