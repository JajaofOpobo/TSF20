package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.content.IntentFilter;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public class AlarmWidget extends VWidgetContainer {
    public static com.tsf.shell.widget.alarm.b.d a;
    public static VWidgetContainer b;
    public static VTextureManager c;
    public static VObjectManager d;
    public static VMessageQueueManager e;
    public static int f;
    public static float g;
    public static Context h;
    public static com.tsf.shell.widget.alarm.service.g k;
    public static AlarmWidget l;
    public static com.tsf.shell.widget.alarm.setting.j n;
    public e i;
    public q j;
    public x m;
    private long p;
    private int q;
    private int r;
    private c t;
    private Object v;
    private int w;
    private d x;
    private static List s = new ArrayList();
    private static ArrayList u = new ArrayList();
    public static boolean o = false;
    private static String y = "com.tsf.shell.widget.alarm.OnThemeChange";
    private static String z = "com.tsf.shell.widget.alarm.onClick";

    public static void a(VTweenTarget vTweenTarget) {
        u.add(vTweenTarget);
    }

    private void e() {
        int size = u.size();
        for (int i = 0; i < size; i++) {
            VTween.pauseTween((VTweenTarget) u.get(i));
        }
    }

    private void f() {
        int size = u.size();
        for (int i = 0; i < size; i++) {
            VTween.resumeTween((VTweenTarget) u.get(i));
        }
    }

    public AlarmWidget(Context context, Integer num) {
        super(num.intValue());
        this.v = new Object();
        this.w = 0;
        allowResize(true);
        l = this;
        h = context;
        f = num.intValue();
        g = VInformation.Scale();
        u.c("EngineScale:" + g);
        c = getTextureManager();
        d = getObjectManager();
        e = new VMessageQueueManager(f);
        g();
        l();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public boolean calTouchCollision(float f2, float f3) {
        u.c("XXXX:" + f2 + "    YYYYY:" + f3);
        return getHittingTarget(f2, f3, true) != null;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        if (!o) {
            this.p = System.currentTimeMillis();
            int i = (int) ((this.p / 1000) / 60);
            if (i != this.q) {
                this.q = i;
                Iterator it = s.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
                int i2 = i / 60;
                if (i2 != this.r) {
                    this.r = i2;
                    Iterator it2 = s.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).b();
                    }
                }
            }
            if (this.w == 0) {
                invalidate();
            }
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onPause() {
        u.c("onPause");
        o = true;
        e.pause();
        e();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onResume() {
        u.c("onResume");
        o = false;
        e.resume();
        f();
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    public static void a(b bVar) {
        s.add(bVar);
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onDestroy() {
        m();
        if (this.x != null) {
            this.x.a();
        }
        k.b();
        ag.a();
    }

    private void g() {
        n = new com.tsf.shell.widget.alarm.setting.j(h);
        j.a(h);
        this.w = com.tsf.shell.widget.alarm.setting.j.k;
        this.t = new c(this);
        a = new com.tsf.shell.widget.alarm.b.d(h, c);
        k = new com.tsf.shell.widget.alarm.service.g(h);
        this.m = new x();
        this.m.scale().setAll(0.9f, 0.9f, 0.9f);
        this.m.position().spY(-20.0f);
        a(this.m);
        this.i = new e();
        this.i.mouseEnabled(false);
        this.i.position().spZ(-10.0f);
        this.i.rotation().y = 180.0f;
        this.m.addChild(this.i);
        this.j = new q();
        this.j.a.setMouseEventListener(new a(this, this.j.a));
        this.j.a.calAABB();
        this.j.position().spZ(10.0f);
        this.m.addChild(this.j);
        addChild(this.m);
        setAABBSP(-198.0f, -198.0f, 0.0f, 198.0f, 198.0f, 0.0f);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.w = com.tsf.shell.widget.alarm.setting.j.k;
        u.c("===============WidgetFreshDuration:" + this.w);
        if (this.w != 0) {
            if (this.x == null) {
                this.x = new d(this);
                this.x.start();
            }
            u.c("===============Widget Set Animation false");
            return;
        }
        if (this.x != null) {
            this.x.a();
            this.x = null;
        }
        u.c("===============Widget Set Animation true");
    }

    private void i() {
        interceptMouseEventScroll(true);
        this.j.mouseEnabled(false);
        this.i.b();
        this.i.mouseEnabled(true);
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.AlarmWidget.1
            private boolean b = false;
            private boolean c = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                AlarmWidget.this.i.c();
                AlarmWidget.this.j.f();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f2) {
                if (f2 > 0.5f && !this.b) {
                    AlarmWidget.this.a(false);
                    this.b = true;
                }
                if (f2 > 0.5f && !this.c) {
                    AlarmWidget.this.i.e();
                    this.c = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(180.0f);
        VTween.killTween(this.m);
        VTween.to(this.m, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    private void j() {
        interceptMouseEventScroll(false);
        this.j.e();
        this.j.mouseEnabled(true);
        this.i.mouseEnabled(false);
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.AlarmWidget.2
            private boolean b = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                AlarmWidget.this.i.d();
                AlarmWidget.this.j.d();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f2) {
                if (f2 <= 0.5f || this.b) {
                    return;
                }
                AlarmWidget.this.a(true);
                this.b = true;
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(0.0f);
        VTween.killTween(this.m);
        VTween.to(this.m, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        u.c("swepDepth:" + z2);
        if (z2) {
            this.j.setZOrderOnTop();
        } else {
            this.i.setZOrderOnTop();
        }
    }

    public static void a() {
        l.i();
    }

    public static void b() {
        l.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        j.a(h);
        com.tsf.shell.widget.alarm.c.c.a();
        this.j.g();
        this.i.f();
        this.m.a();
    }

    class SettingFilter extends IntentFilter {
        public SettingFilter() {
            addAction("com.tsf.shell.widget.alarm.SettingOnChange");
            addAction(AlarmWidget.y);
            addAction(AlarmWidget.z);
        }
    }

    private void l() {
        h.registerReceiver(this.t, new SettingFilter());
    }

    private void m() {
        h.unregisterReceiver(this.t);
    }
}
