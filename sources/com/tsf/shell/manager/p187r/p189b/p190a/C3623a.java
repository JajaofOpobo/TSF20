package com.tsf.shell.manager.p187r.p189b.p190a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1025c;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3361b;
import com.tsf.shell.manager.p166a.C3364c;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p187r.p189b.C3621a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2945k;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3111d;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.r.b.a.a */
/* loaded from: classes.dex */
public class C3623a extends C2578b implements C0915b.InterfaceC0918a {

    /* renamed from: a */
    public C3621a f12006a;

    /* renamed from: b */
    private C3364c f12007b;

    /* renamed from: c */
    private C1040h f12008c;

    /* renamed from: d */
    private float f12009d;

    /* renamed from: e */
    private ArrayList<C3222g> f12010e;

    /* renamed from: f */
    private C1025c.C1033a f12011f;

    /* renamed from: g */
    private C3361b.InterfaceC3363a f12012g;

    /* renamed from: h */
    private C3631b f12013h;

    /* renamed from: i */
    private boolean f12014i;

    /* renamed from: j */
    private C2945k f12015j;

    public C3623a(final C3621a c3621a, String str) {
        super(str);
        this.f12014i = false;
        this.f12013h = new C3631b() { // from class: com.tsf.shell.manager.r.b.a.a.1
            @Override // com.tsf.shell.manager.p187r.p189b.p190a.C3631b
            /* renamed from: a */
            public void mo1840a() {
                C3623a.this.m1853b();
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p190a.C3631b
            /* renamed from: b */
            public void mo1835b() {
                C3623a.this.m1845f();
            }

            @Override // com.tsf.shell.manager.p187r.p189b.p190a.C3631b
            /* renamed from: c */
            public void mo1834c() {
                C3623a.this.a();
            }
        };
        this.f12012g = new C3361b.InterfaceC3363a() { // from class: com.tsf.shell.manager.r.b.a.a.2
            @Override // com.tsf.shell.manager.p166a.C3361b.InterfaceC3363a
            /* renamed from: a */
            public void mo1842a() {
                if (C3623a.this.isShowing()) {
                    C3623a.this.f12008c.m10143d();
                }
            }
        };
        this.f12010e = new ArrayList<>();
        this.f12006a = c3621a;
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        arrayList.add(new C2574a.C2575a(C1306b.C1310d.widget_menu_setting, C4189x.m588c(C1306b.C1315i.menu_manage_apps), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.a.a.3
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                Home.m6177b().m6163m();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
            }
        }));
        setFunctions(arrayList);
        this.f12008c = new C1040h(C0892a.f2553D, c3621a.getHeight(), 20.0f * C0892a.f2567c, 20.0f * C0892a.f2567c, (C0892a.f2567c * 20.0f) + C3566b.f11839a.f11762T, (C0892a.f2567c * 20.0f) + C3566b.f11839a.f11763U) { // from class: com.tsf.shell.manager.r.b.a.a.4
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onKillFocus() {
            }
        };
        this.f12008c.m10160a(new C1024b() { // from class: com.tsf.shell.manager.r.b.a.a.5
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                if (C3623a.this.f12007b == null) {
                    return 0;
                }
                return C3623a.this.f12007b.f11127a.m2751c();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C3636c c3636c;
                if (c0975i == null) {
                    C3636c c3636c2 = new C3636c();
                    c3636c2.f10495k.visible(true);
                    c3636c2.position().f2527y = C3623a.this.f12009d;
                    c3636c2.mo3129aO();
                    c3636c2.setMouseEventListener(new C0937a(c3636c2));
                    c3636c = c3636c2;
                } else {
                    c3636c = c0975i;
                }
                C3222g m2755a = C3623a.this.f12007b.f11127a.m2755a(i);
                C3636c c3636c3 = (C3636c) c3636c;
                c3636c3.m1828a(m2755a.m3101bi());
                c3636c3.f10495k.textures().clear();
                c3636c3.f10495k.textures().addElement(m2755a.m3111aZ());
                return c3636c;
            }
        });
        this.f12008c.m10159a(new C1036f() { // from class: com.tsf.shell.manager.r.b.a.a.6

            /* renamed from: c */
            private C3222g f12023c;

            /* renamed from: d */
            private C3111d f12024d;

            /* renamed from: e */
            private boolean f12025e;

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C3636c c3636c = (C3636c) c0975i;
                C3222g m2755a = C3623a.this.f12007b.f11127a.m2755a(i);
                if (c3621a.m1860a()) {
                    c3621a.m1858b().mo1856a(C3519a.m2147a((ItemInfo) m2755a.m3107bc(), C3566b.f11840b, false));
                    return;
                }
                if (m2755a.m3101bi()) {
                    m2755a.m3115a(false);
                    c3636c.m1828a(false);
                    C3623a.this.f12010e.remove(m2755a);
                } else {
                    m2755a.m3115a(true);
                    c3636c.m1828a(true);
                    C3623a.this.f12010e.add(m2755a);
                }
                C3623a.this.m1851c();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: b */
            public void mo1698b(C0975i c0975i, int i, MotionEvent motionEvent) {
                if (!c3621a.m1860a()) {
                    C4187w.m616a();
                    c3621a.templeteHide();
                    C3222g m2755a = C3623a.this.f12007b.f11127a.m2755a(i);
                    this.f12023c = m2755a.m3109ba();
                    this.f12024d = (C3111d) this.f12023c.getMouseEventListener();
                    Number3d.TEMPNUMBER3D.reset();
                    this.f12023c.position().setAllFrom(c0975i.localToGlobal(Number3d.TEMPNUMBER3D));
                    if (!C3623a.this.f12010e.isEmpty()) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= C3623a.this.f12010e.size()) {
                                break;
                            }
                            C3222g c3222g = (C3222g) C3623a.this.f12010e.get(i3);
                            if (c3222g != m2755a) {
                                C3222g m3109ba = c3222g.m3109ba();
                                Number3d.TEMPNUMBER3D.reset();
                                m3109ba.position().setAllFrom(c0975i.localToGlobal(Number3d.TEMPNUMBER3D));
                                m3109ba.rotation().setAll(0.0f, 0.0f, 0.0f);
                                this.f12023c.m3080a((C3231c) m3109ba);
                            }
                            i2 = i3 + 1;
                        }
                        C3623a.this.m1853b();
                        C3623a.this.f12008c.m10143d();
                    }
                    this.f12024d.mo2122c(motionEvent);
                    this.f12025e = true;
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: c */
            public void mo1697c(C0975i c0975i, int i, MotionEvent motionEvent) {
                boolean z;
                if (!c3621a.m1860a()) {
                    if (this.f12024d != null) {
                        C3222g c3222g = (C3222g) this.f12024d.f2740c;
                        c3222g.m3499h(true);
                        z = !c3222g.m3064as();
                        this.f12024d.mo2119d(motionEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        c3621a.templeteShow();
                    } else {
                        c3621a.templeteHide();
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo1699a(C0975i c0975i, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (!c3621a.m1860a() && this.f12025e && this.f12024d != null) {
                    this.f12024d.mo2129a(motionEvent, motionEvent2);
                }
            }
        });
        this.f12011f = new C1025c.C1033a() { // from class: com.tsf.shell.manager.r.b.a.a.7
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1025c.C1033a
            /* renamed from: a */
            public void mo1841a() {
                c3621a.templeteShow();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1853b() {
        if (this.f12007b != null) {
            int m2751c = this.f12007b.f11127a.m2751c();
            for (int i = 0; i < m2751c; i++) {
                this.f12007b.f11127a.m2755a(i).m3115a(false);
            }
            this.f12010e.clear();
            this.f12008c.m10143d();
            m1851c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m1851c() {
        int size = this.f12010e.size();
        if (size > 0) {
            m1849d();
            this.f12013h.m1838a(size);
            return;
        }
        m1847e();
    }

    /* renamed from: d */
    private void m1849d() {
        if (!this.f12014i) {
            this.f12014i = true;
            C0915b.m10597a(this);
            this.f12013h.m1831f();
            this.f12006a.showOption(this.f12013h);
        }
    }

    /* renamed from: e */
    private void m1847e() {
        if (this.f12014i) {
            this.f12014i = false;
            C0915b.m10594b(this);
            this.f12006a.showOption(getMenuContainer());
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m1853b();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m1845f() {
        if (!this.f12010e.isEmpty()) {
            ArrayList<AbstractC3208b> arrayList = new ArrayList<>();
            for (int i = 0; i < this.f12010e.size(); i++) {
                arrayList.add(this.f12010e.get(i).m3109ba());
            }
            m1853b();
            this.f12008c.m10143d();
            if (arrayList.size() > 0) {
                float f = arrayList.get(0).position().f2526x;
                float f2 = arrayList.get(0).position().f2527y;
                Iterator<AbstractC3208b> it = arrayList.iterator();
                float f3 = f;
                while (true) {
                    float f4 = f2;
                    if (it.hasNext()) {
                        AbstractC3208b next = it.next();
                        f3 = (f3 + next.position().f2526x) / 2.0f;
                        f2 = (next.position().f2527y + f4) / 2.0f;
                    } else {
                        C3145b.m3407a(C3359a.f11094h.m4121F(), 0, (int) this.f12006a.getScreenFreeSpaceCenter()).m3328c(arrayList);
                        return;
                    }
                }
            }
        }
    }

    public void a() {
        this.f12006a.templeteHide();
        C2932g m4031n = C3359a.f11094h.m4031n();
        if (m4031n.m4181t() != -1) {
            this.f12015j = (C2945k) m4031n;
            this.f12015j.m4147a(this.f12011f);
            this.f12008c.setFocus();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f12010e.size()) {
                    C3222g c3222g = this.f12010e.get(i2);
                    this.f12015j.m4148a(c3222g, c3222g);
                    i = i2 + 1;
                } else {
                    m1853b();
                    this.f12008c.m10143d();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12008c;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f12008c.m10166a(f, f2, f3, f4);
        this.f12013h.m1839a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        if (this.f12007b == null) {
            this.f12007b = C3359a.f11109w.m2716a();
            this.f12007b.f11127a.m2754a(this.f12012g);
            this.f12007b.f11127a.m2753b();
        }
        C3231c.m3073aj();
        this.f12008c.m10143d();
        super.onShow();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHide() {
        m1853b();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        if (this.f12007b != null) {
            m1853b();
            this.f12013h.m1830g();
            this.f12007b.f11127a.m2752b(this.f12012g);
            this.f12007b = null;
        }
    }
}
