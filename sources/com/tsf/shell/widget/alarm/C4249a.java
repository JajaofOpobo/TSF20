package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.p086a.p087a.C2205e;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.AlarmUtils.C4242c;
import com.tsf.shell.widget.alarm.p204c.C4267a;
import com.tsf.shell.widget.alarm.p204c.C4269b;
import com.tsf.shell.widget.alarm.p204c.C4271c;
import com.tsf.shell.widget.alarm.p204c.C4276d;
import com.tsf.shell.widget.alarm.p204c.C4280e;
import com.tsf.shell.widget.alarm.service.InterfaceC4340b;
import com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c;
/* renamed from: com.tsf.shell.widget.alarm.a */
/* loaded from: classes.dex */
public class C4249a extends VObject3dContainer implements C4271c.InterfaceC4275b {

    /* renamed from: a */
    public static boolean f13745a;

    /* renamed from: A */
    private C4306j f13746A;

    /* renamed from: B */
    private C4306j f13747B;

    /* renamed from: C */
    private C4269b f13748C;

    /* renamed from: D */
    private VRectangle f13749D;

    /* renamed from: E */
    private C4258b f13750E;

    /* renamed from: h */
    private Cursor f13757h;

    /* renamed from: i */
    private int f13758i;

    /* renamed from: j */
    private int f13759j;

    /* renamed from: k */
    private String f13760k;

    /* renamed from: l */
    private Alarm.C4227b f13761l;

    /* renamed from: m */
    private boolean f13762m;

    /* renamed from: n */
    private String f13763n;

    /* renamed from: o */
    private TextureElement f13764o;

    /* renamed from: p */
    private TextureElement f13765p;

    /* renamed from: q */
    private TextureElement f13766q;

    /* renamed from: t */
    private C4294e f13769t;

    /* renamed from: u */
    private C4294e f13770u;

    /* renamed from: v */
    private C4280e f13771v;

    /* renamed from: w */
    private C4271c f13772w;

    /* renamed from: x */
    private C4267a f13773x;

    /* renamed from: y */
    private InterfaceC4256c f13774y;

    /* renamed from: z */
    private VRectangle f13775z;

    /* renamed from: b */
    private VWidgetContainer f13751b = AlarmWidget.f13708b;

    /* renamed from: c */
    private VTextureManager f13752c = AlarmWidget.f13709c;

    /* renamed from: d */
    private VObjectManager f13753d = AlarmWidget.f13710d;

    /* renamed from: e */
    private VMessageQueueManager f13754e = AlarmWidget.f13711e;

    /* renamed from: f */
    private Context f13755f = AlarmWidget.f13714h;

    /* renamed from: g */
    private ServiceConnectionC4343c f13756g = AlarmWidget.f13715k;

    /* renamed from: r */
    private float f13767r = 1.2f;

    /* renamed from: s */
    private float f13768s = VInformation.Scale();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC4256c {
        /* renamed from: a */
        void mo276a(boolean z);
    }

    public C4249a() {
        m379h();
        m377i();
        m396a();
        m387d();
    }

    /* renamed from: a */
    public void m395a(InterfaceC4256c interfaceC4256c) {
        this.f13774y = interfaceC4256c;
        this.f13774y.mo276a(f13745a);
    }

    /* renamed from: g */
    private void m381g() {
        C4305i.m259c("============SetData=================" + this.f13758i + ":" + this.f13759j);
        this.f13769t.m293a(this.f13758i);
        this.f13770u.m293a(this.f13759j);
        this.f13771v.m320a(this.f13761l.m484b());
        this.f13772w.m339a(f13745a);
        this.f13773x.m355a(this.f13758i < 12 && this.f13758i > 0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        this.f13769t.m288d();
        this.f13770u.m288d();
    }

    /* renamed from: h */
    private void m379h() {
        Bitmap m230a = C4324p.m230a(this.f13755f, "back_big_circle");
        this.f13764o = this.f13752c.createTexture(m230a, false);
        m230a.recycle();
        Bitmap m230a2 = C4324p.m230a(this.f13755f, "back_small_circle");
        this.f13765p = this.f13752c.createTexture(m230a2, false);
        m230a2.recycle();
        Bitmap m230a3 = C4324p.m230a(this.f13755f, "back_time_bar_bg");
        this.f13766q = this.f13752c.createTexture(m230a3, false);
        m230a3.recycle();
    }

    /* renamed from: i */
    private void m377i() {
        this.f13750E = new C4258b();
        this.f13753d.addObject(this.f13750E);
        this.f13750E.doubleSidedEnabled(C4281d.f13873a.f13875a);
        this.f13750E.textures().addElement(this.f13764o);
        this.f13750E.calAABB();
        this.f13750E.setMouseEventListener(new C4253a(this.f13750E));
        addChild(this.f13750E);
        this.f13775z = new VRectangle(380.0f / this.f13767r, 380.0f / this.f13767r, 1, 1);
        this.f13775z.position().spZ(40.0f);
        this.f13753d.addObject(this.f13775z);
        this.f13775z.textures().addElement(this.f13765p);
        addChild(this.f13775z);
        this.f13749D = new VRectangle(261.0f / this.f13767r, 53.0f / this.f13767r, 1, 1);
        this.f13753d.addObject(this.f13749D);
        this.f13749D.position().spZ(80.0f);
        this.f13749D.position().spX(161.875f / this.f13767r);
        this.f13749D.textures().addElement(this.f13766q);
        addChild(this.f13749D);
        this.f13747B = new C4306j();
        this.f13747B.textures().addElement(C4306j.f13973a);
        this.f13747B.position().spZ(80.0f);
        this.f13747B.position().spX(100.0f);
        this.f13747B.position().spY(-2.0f);
        addChild(this.f13747B);
        this.f13746A = new C4306j();
        this.f13746A.textures().addElement(C4306j.f13974b);
        this.f13746A.position().spZ(80.0f);
        this.f13746A.position().spX(156.0f);
        this.f13746A.position().spY(-2.0f);
        addChild(this.f13746A);
        this.f13748C = new C4269b();
        this.f13748C.position().spX(-180.0f);
        this.f13748C.position().spY(-150.0f);
        this.f13748C.position().spZ(0.0f);
        this.f13748C.m350a(C4269b.f13848a.f13809f, C4269b.f13848a.f13808e);
        addChild(this.f13748C);
        this.f13771v = new C4280e(this);
        this.f13769t = new C4294e(this.f13775z, this.f13747B, 3, 1, 1);
        this.f13770u = new C4294e(this.f13750E, this.f13746A, -1, 5, 0);
        this.f13773x = new C4267a();
        this.f13747B.m254a(this.f13773x);
        addChild(this.f13773x);
        this.f13772w = new C4271c();
        this.f13772w.m341a(this);
        addChild(this.f13772w);
        this.f13748C.m348a(new Runnable() { // from class: com.tsf.shell.widget.alarm.a.1
            @Override // java.lang.Runnable
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tsf.shell.widget.alarm.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C2205e.m6087a(C4249a.this.f13755f)) {
                            new C4254b().start();
                            AlarmWidget.m413b();
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m396a() {
        this.f13757h = C4242c.m429b(this.f13755f);
        if (this.f13757h == null) {
            C4242c.m441a(this.f13755f);
            this.f13757h.close();
            this.f13757h = C4242c.m429b(this.f13755f);
        }
        C4305i.m260b("mCursor Count():" + this.f13757h.getCount());
        if (this.f13757h.getCount() > 0) {
            Alarm m440a = C4242c.m440a(this.f13755f, 1);
            f13745a = m440a.f13659b;
            this.f13760k = m440a.f13665h;
            this.f13758i = m440a.f13660c;
            this.f13759j = m440a.f13661d;
            this.f13761l = m440a.f13662e;
            this.f13762m = m440a.f13664g;
            this.f13763n = m440a.f13666i == null ? "silent" : m440a.f13666i.toString();
            C4305i.m260b("Info:" + f13745a + ":" + this.f13760k + ":" + this.f13758i + ":" + this.f13759j);
        }
        this.f13757h.close();
        m381g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m390b(boolean z) {
        f13745a = z;
        if (this.f13774y != null) {
            this.f13774y.mo276a(f13745a);
        }
        new C4254b().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.a$b */
    /* loaded from: classes.dex */
    public class C4254b extends Thread {
        C4254b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C4249a.this.f13756g.m191a(new ServiceConnectionC4343c.InterfaceC4344a() { // from class: com.tsf.shell.widget.alarm.a.b.1
                @Override // com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c.InterfaceC4344a
                /* renamed from: a */
                public void mo153a(InterfaceC4340b interfaceC4340b) {
                    int i;
                    int m289c = C4249a.this.f13769t.m289c();
                    boolean m354b = C4249a.this.f13773x.m354b();
                    if (m289c == 12) {
                        i = m354b ? 0 : 12;
                    } else {
                        i = m354b ? m289c : m289c + 12;
                    }
                    int m289c2 = C4249a.this.f13770u.m289c();
                    C4305i.m259c("Compass getCurrent " + i + ":" + m289c2);
                    for (int i2 = 0; i2 < 7; i2++) {
                        C4249a.this.f13761l.m486a(i2, C4249a.this.f13771v.m322a(i2));
                    }
                    interfaceC4340b.mo197a(1, C4249a.f13745a, i, m289c2, C4249a.this.f13761l.m488a(), C4249a.this.f13762m, null, C4249a.this.f13763n);
                }
            });
        }
    }

    @Override // com.tsf.shell.widget.alarm.p204c.C4271c.InterfaceC4275b
    /* renamed from: a */
    public void mo332a(final boolean z) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tsf.shell.widget.alarm.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (C2205e.m6087a(C4249a.this.f13755f)) {
                    C4249a.this.m390b(z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.a$a */
    /* loaded from: classes.dex */
    public class C4253a extends VMouseEventListener {

        /* renamed from: a */
        Number3d f13780a;

        /* renamed from: b */
        C4294e f13781b;

        /* renamed from: c */
        int f13782c;

        /* renamed from: e */
        private double f13784e;

        public C4253a(VObject3d vObject3d) {
            super(vObject3d);
            this.f13780a = new Number3d(0.0f, 0.0f, 0.0f);
            this.f13782c = 1;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            if (C4258b.f13796f) {
                this.f13781b = C4249a.this.f13769t;
            } else {
                this.f13781b = C4249a.this.f13770u;
            }
            this.f13781b.m295a();
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onMove(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (this.f13781b != null) {
                Number3d m374a = m374a(motionEvent);
                double atan2 = Math.atan2(m374a.f2527y, m374a.f2526x);
                Number3d m374a2 = m374a(motionEvent2);
                double atan22 = Math.atan2(m374a2.f2527y, m374a2.f2526x);
                this.f13782c = atan22 > this.f13784e ? 1 : -1;
                if (Math.abs(atan22 - this.f13784e) > 3.141592653589793d) {
                    this.f13782c *= -1;
                    C4305i.m259c("EX DRAG Way");
                }
                this.f13784e = atan22;
                float f = (float) (((atan22 - atan2) * 180.0d) / 3.141592653589793d);
                if (f < 0.0f) {
                    f += 360.0f;
                }
                this.f13781b.m294a(f);
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
            if (this.f13781b != null) {
                this.f13781b.m291b();
                this.f13781b = null;
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C4305i.m259c("BackPage onFling");
            if (this.f13781b != null) {
                this.f13781b.m292a(this.f13782c, (float) ((Math.sqrt((f * f) + (f2 * f2)) / 10000.0d) * 240.0d));
            }
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            if (this.f13781b != null) {
                Number3d m374a = m374a(motionEvent);
                this.f13781b.m290b((float) ((Math.atan2(m374a.f2527y, m374a.f2526x) * 180.0d) / 3.141592653589793d));
            }
        }

        /* renamed from: a */
        private Number3d m374a(MotionEvent motionEvent) {
            this.f13780a.f2526x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.f13780a.f2527y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.f13780a.f2528z = 0.0f;
            return AlarmWidget.f13716l.globalToLocal(this.f13780a);
        }
    }

    /* renamed from: b */
    public void m392b() {
        this.f13771v.m321a(true);
        this.f13772w.visible(true);
        this.f13773x.visible(true);
        this.f13775z.visible(true);
        this.f13746A.visible(true);
        this.f13747B.visible(true);
        this.f13748C.visible(true);
        this.f13749D.visible(true);
    }

    /* renamed from: c */
    public void m389c() {
        this.f13771v.m323a();
    }

    /* renamed from: d */
    public void m387d() {
        this.f13771v.m321a(false);
        this.f13772w.visible(false);
        this.f13773x.visible(false);
        this.f13775z.visible(false);
        this.f13746A.visible(false);
        this.f13747B.visible(false);
        this.f13748C.visible(false);
        this.f13749D.visible(false);
    }

    /* renamed from: e */
    public void m385e() {
        this.f13771v.m319b();
    }

    /* renamed from: f */
    public void m383f() {
        C4276d.m331a();
        this.f13772w.m342a();
        C4306j.m257a();
        C4322o.m233a(new VObject3d[]{this.f13750E}, this.f13764o.f2529id, C4324p.m230a(this.f13755f, "back_big_circle"), 250, 250, 50);
        C4322o.m233a(new VObject3d[]{this.f13775z}, this.f13765p.f2529id, C4324p.m230a(this.f13755f, "back_small_circle"), 250, 250, 50);
        C4322o.m233a(new VObject3d[]{this.f13749D}, this.f13766q.f2529id, C4324p.m230a(this.f13755f, "back_time_bar_bg"), 250, 250, 50);
        this.f13750E.doubleSidedEnabled(C4281d.f13873a.f13875a);
    }
}
