package com.tsf.shell.widget.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.alarm.p203b.C4262d;
import com.tsf.shell.widget.alarm.p204c.C4269b;
import com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c;
import com.tsf.shell.widget.alarm.setting.C4371e;
import java.util.ArrayList;
import java.util.List;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class AlarmWidget extends VWidgetContainer {

    /* renamed from: a */
    public static C4262d f13707a;

    /* renamed from: b */
    public static VWidgetContainer f13708b;

    /* renamed from: c */
    public static VTextureManager f13709c;

    /* renamed from: d */
    public static VObjectManager f13710d;

    /* renamed from: e */
    public static VMessageQueueManager f13711e;

    /* renamed from: f */
    public static int f13712f;

    /* renamed from: g */
    public static float f13713g;

    /* renamed from: h */
    public static Context f13714h;

    /* renamed from: k */
    public static ServiceConnectionC4343c f13715k;

    /* renamed from: l */
    public static AlarmWidget f13716l;

    /* renamed from: n */
    public static C4371e f13717n;

    /* renamed from: i */
    public C4249a f13723i;

    /* renamed from: j */
    public C4298g f13724j;

    /* renamed from: m */
    public C4309k f13725m;

    /* renamed from: p */
    private long f13726p;

    /* renamed from: q */
    private int f13727q;

    /* renamed from: r */
    private int f13728r;

    /* renamed from: t */
    private C4247c f13729t;

    /* renamed from: v */
    private Object f13730v;

    /* renamed from: w */
    private int f13731w;

    /* renamed from: x */
    private C4248d f13732x;

    /* renamed from: s */
    private static List<InterfaceC4246b> f13719s = new ArrayList();

    /* renamed from: u */
    private static ArrayList<VTweenTarget> f13720u = new ArrayList<>();

    /* renamed from: o */
    public static boolean f13718o = false;

    /* renamed from: y */
    private static String f13721y = "com.tsf.shell.widget.alarm.OnThemeChange";

    /* renamed from: z */
    private static String f13722z = "com.tsf.shell.widget.alarm.onClick";

    /* renamed from: com.tsf.shell.widget.alarm.AlarmWidget$b */
    /* loaded from: classes.dex */
    interface InterfaceC4246b {
        /* renamed from: a */
        void mo279a();

        /* renamed from: b */
        void mo275b();
    }

    /* renamed from: a */
    public static void m418a(VTweenTarget vTweenTarget) {
        f13720u.add(vTweenTarget);
    }

    /* renamed from: e */
    private void m407e() {
        int size = f13720u.size();
        for (int i = 0; i < size; i++) {
            VTween.pauseTween(f13720u.get(i));
        }
    }

    /* renamed from: f */
    private void m406f() {
        int size = f13720u.size();
        for (int i = 0; i < size; i++) {
            VTween.resumeTween(f13720u.get(i));
        }
    }

    public AlarmWidget(Context context, Integer num) {
        super(num.intValue());
        this.f13730v = new Object();
        this.f13731w = 0;
        allowResize(true);
        f13716l = this;
        f13714h = context;
        f13712f = num.intValue();
        f13713g = VInformation.Scale();
        C4305i.m259c("EngineScale:" + f13713g);
        f13709c = getTextureManager();
        f13710d = getObjectManager();
        f13711e = new VMessageQueueManager(f13712f);
        m405g();
        m400l();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public boolean calTouchCollision(float f, float f2) {
        C4305i.m259c("XXXX:" + f + "    YYYYY:" + f2);
        return getHittingTarget(f, f2, true) != null;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (!f13718o) {
            this.f13726p = System.currentTimeMillis();
            int i = (int) ((this.f13726p / 1000) / 60);
            if (i != this.f13727q) {
                this.f13727q = i;
                for (InterfaceC4246b interfaceC4246b : f13719s) {
                    interfaceC4246b.mo279a();
                }
                int i2 = i / 60;
                if (i2 != this.f13728r) {
                    this.f13728r = i2;
                    for (InterfaceC4246b interfaceC4246b2 : f13719s) {
                        interfaceC4246b2.mo275b();
                    }
                }
            }
            if (this.f13731w == 0) {
                invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.AlarmWidget$d */
    /* loaded from: classes.dex */
    public class C4248d extends Thread {

        /* renamed from: b */
        private boolean f13744b = false;

        C4248d() {
        }

        /* renamed from: a */
        public void m397a() {
            this.f13744b = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (AlarmWidget.this.f13730v) {
                    AlarmWidget.this.invalidate();
                    C4305i.m259c("Timer Invalidate:" + AlarmWidget.f13718o);
                    if (!this.f13744b) {
                        try {
                            if (AlarmWidget.f13718o) {
                                AlarmWidget.this.f13730v.wait();
                            } else {
                                AlarmWidget.this.f13730v.wait(AlarmWidget.this.f13731w * 1000);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onPause() {
        C4305i.m259c("onPause");
        f13718o = true;
        f13711e.pause();
        m407e();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onResume() {
        C4305i.m259c("onResume");
        f13718o = false;
        f13711e.resume();
        m406f();
        synchronized (this.f13730v) {
            this.f13730v.notifyAll();
        }
    }

    /* renamed from: a */
    public static void m417a(InterfaceC4246b interfaceC4246b) {
        f13719s.add(interfaceC4246b);
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onDestroy() {
        m399m();
        if (this.f13732x != null) {
            this.f13732x.m397a();
        }
        f13715k.m188b();
        C4321n.m235a();
    }

    /* renamed from: g */
    private void m405g() {
        f13717n = new C4371e(f13714h);
        C4281d.m317a(f13714h);
        C4371e c4371e = f13717n;
        this.f13731w = C4371e.f14147k;
        this.f13729t = new C4247c();
        f13707a = new C4262d(f13714h, f13709c);
        f13715k = new ServiceConnectionC4343c(f13714h);
        this.f13725m = new C4309k();
        this.f13725m.scale().setAll(0.9f, 0.9f, 0.9f);
        this.f13725m.position().spY(-20.0f);
        m418a(this.f13725m);
        this.f13723i = new C4249a();
        this.f13723i.mouseEnabled(false);
        this.f13723i.position().spZ(-10.0f);
        this.f13723i.rotation().f2527y = 180.0f;
        this.f13725m.addChild(this.f13723i);
        this.f13724j = new C4298g();
        this.f13724j.f13939a.setMouseEventListener(new C4245a(this.f13724j.f13939a));
        this.f13724j.f13939a.calAABB();
        this.f13724j.position().spZ(10.0f);
        this.f13725m.addChild(this.f13724j);
        addChild(this.f13725m);
        setAABBSP(-198.0f, -198.0f, 0.0f, 198.0f, 198.0f, 0.0f);
        m404h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m404h() {
        this.f13731w = C4371e.f14147k;
        C4305i.m259c("===============WidgetFreshDuration:" + this.f13731w);
        if (this.f13731w != 0) {
            if (this.f13732x == null) {
                this.f13732x = new C4248d();
                this.f13732x.start();
            }
            C4305i.m259c("===============Widget Set Animation false");
            return;
        }
        if (this.f13732x != null) {
            this.f13732x.m397a();
            this.f13732x = null;
        }
        C4305i.m259c("===============Widget Set Animation true");
    }

    /* renamed from: i */
    private void m403i() {
        interceptMouseEventScroll(true);
        this.f13724j.mouseEnabled(false);
        this.f13723i.m392b();
        this.f13723i.mouseEnabled(true);
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.AlarmWidget.1

            /* renamed from: b */
            private boolean f13734b = false;

            /* renamed from: c */
            private boolean f13735c = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                AlarmWidget.this.f13723i.m389c();
                AlarmWidget.this.f13724j.m267f();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.f13734b) {
                    AlarmWidget.this.m414a(false);
                    this.f13734b = true;
                }
                if (f > 0.5f && !this.f13735c) {
                    AlarmWidget.this.f13723i.m385e();
                    this.f13735c = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(180.0f);
        VTween.killTween(this.f13725m);
        VTween.m10747to(this.f13725m, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    /* renamed from: j */
    private void m402j() {
        interceptMouseEventScroll(false);
        this.f13724j.m269e();
        this.f13724j.mouseEnabled(true);
        this.f13723i.mouseEnabled(false);
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.AlarmWidget.2

            /* renamed from: b */
            private boolean f13737b = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                AlarmWidget.this.f13723i.m387d();
                AlarmWidget.this.f13724j.m271d();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.f13737b) {
                    AlarmWidget.this.m414a(true);
                    this.f13737b = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(0.0f);
        VTween.killTween(this.f13725m);
        VTween.m10747to(this.f13725m, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m414a(boolean z) {
        C4305i.m259c("swepDepth:" + z);
        if (z) {
            this.f13724j.setZOrderOnTop();
        } else {
            this.f13723i.setZOrderOnTop();
        }
    }

    /* renamed from: a */
    public static void m419a() {
        f13716l.m403i();
    }

    /* renamed from: b */
    public static void m413b() {
        f13716l.m402j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.AlarmWidget$c */
    /* loaded from: classes.dex */
    public class C4247c extends BroadcastReceiver {
        C4247c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (!action.equals("com.tsf.shell.widget.alarm.SettingOnChange")) {
                if (action.equals(AlarmWidget.f13721y)) {
                    AlarmWidget.this.m401k();
                    return;
                } else if (action.equals(AlarmWidget.f13722z)) {
                    AlarmWidget.this.f13725m.m249b();
                    return;
                } else {
                    return;
                }
            }
            AlarmWidget.f13717n.m117b();
            StringBuilder append = new StringBuilder().append("Widget AUTOLocation:");
            C4371e c4371e = AlarmWidget.f13717n;
            StringBuilder append2 = append.append(C4371e.f14137a).append("   LocationName:");
            C4371e c4371e2 = AlarmWidget.f13717n;
            C4305i.m259c(append2.append(C4371e.f14139c).toString());
            AlarmWidget.this.m404h();
            AlarmWidget.this.f13724j.m273c();
            AlarmWidget.this.f13723i.m396a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m401k() {
        C4281d.m317a(f13714h);
        C4269b.m351a();
        this.f13724j.m265g();
        this.f13723i.m383f();
        this.f13725m.m251a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class SettingFilter extends IntentFilter {
        public SettingFilter() {
            addAction("com.tsf.shell.widget.alarm.SettingOnChange");
            addAction(AlarmWidget.f13721y);
            addAction(AlarmWidget.f13722z);
        }
    }

    /* renamed from: l */
    private void m400l() {
        f13714h.registerReceiver(this.f13729t, new SettingFilter());
    }

    /* renamed from: m */
    private void m399m() {
        f13714h.unregisterReceiver(this.f13729t);
    }

    /* renamed from: com.tsf.shell.widget.alarm.AlarmWidget$a */
    /* loaded from: classes.dex */
    public class C4245a extends VMouseEventListener {

        /* renamed from: a */
        Number3d f13739a;

        /* renamed from: b */
        float f13740b;

        public C4245a(VObject3d vObject3d) {
            super(vObject3d);
            this.f13739a = new Number3d(0.0f, 0.0f, 0.0f);
            this.f13740b = 0.1f;
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
            Number3d m398a = m398a(motionEvent);
            AlarmWidget.this.f13725m.m250a(m398a.f2526x, m398a.f2527y);
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
        }

        /* renamed from: a */
        private Number3d m398a(MotionEvent motionEvent) {
            this.f13739a.f2526x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            this.f13739a.f2527y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            this.f13739a.f2528z = 0.0f;
            return AlarmWidget.f13716l.globalToLocal(this.f13739a);
        }
    }
}
