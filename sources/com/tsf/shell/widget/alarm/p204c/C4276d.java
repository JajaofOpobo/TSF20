package com.tsf.shell.widget.alarm.p204c;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.widget.alarm.AlarmWidget;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4324p;
import com.tsf.shell.widget.alarm.p203b.C4262d;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.widget.alarm.c.d */
/* loaded from: classes.dex */
public class C4276d extends VObject3dContainer {

    /* renamed from: a */
    public static TextureElement f13862a;

    /* renamed from: b */
    public static TextureElement f13863b;

    /* renamed from: d */
    private VRectangle f13865d;

    /* renamed from: e */
    private VRectangle f13866e;

    /* renamed from: f */
    private int f13867f;

    /* renamed from: c */
    private C4262d f13864c = AlarmWidget.f13707a;

    /* renamed from: g */
    private boolean f13868g = false;

    public C4276d(int i) {
        if (f13863b == null) {
            Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "week_toggle_on");
            f13863b = AlarmWidget.f13709c.createTexture(m230a, false);
            m230a.recycle();
        }
        if (f13862a == null) {
            Bitmap m230a2 = C4324p.m230a(AlarmWidget.f13714h, "week_toggle_off");
            f13862a = AlarmWidget.f13709c.createTexture(m230a2, false);
            m230a2.recycle();
        }
        this.f13867f = i;
        this.f13865d = new VRectangle(105.83333f, 63.333332f);
        this.f13865d.moveAllPointsSP(0.0f, 20.0f, 0.0f);
        this.f13866e = new VRectangle(this.f13864c.f13819a[this.f13867f].f13831c, this.f13864c.f13819a[this.f13867f].f13832d);
        this.f13866e.moveAllPointsSP(0.0f, 20.0f, 0.0f);
        this.f13866e.textures().addElement(AlarmWidget.f13707a.m365g());
        this.f13864c.f13819a[this.f13867f].m361a(this.f13866e);
        AlarmWidget.m418a(this.f13865d);
        AlarmWidget.m418a(this.f13866e);
        addChild(this.f13865d);
        addChild(this.f13866e);
        double sin = Math.sin(m330a((this.f13867f * 24.0d) - 90.0d));
        position().spY((float) (Math.cos(m330a((this.f13867f * 24.0d) - 90.0d)) * 200.0d));
        position().spX((float) (200.0d * sin));
        rotation().f2528z = ((float) ((-90.0d) + (24.0d * this.f13867f))) * (-1.0f);
        setMouseEventListener(new C4279a(this));
        calAABB();
    }

    /* renamed from: a */
    public static void m331a() {
        AlarmWidget.f13711e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.d.1
            @Override // java.lang.Runnable
            public void run() {
                if (C4276d.f13863b != null) {
                    Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "week_toggle_on");
                    C4324p.m232a(C4276d.f13863b.f2529id, m230a, 0, 0);
                    m230a.recycle();
                }
                if (C4276d.f13862a != null) {
                    Bitmap m230a2 = C4324p.m230a(AlarmWidget.f13714h, "week_toggle_off");
                    C4324p.m232a(C4276d.f13862a.f2529id, m230a2, 0, 0);
                    m230a2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    /* renamed from: a */
    public void m329a(int i) {
        this.f13865d.rotation().f2526x = -180.0f;
        this.f13866e.rotation().f2526x = -180.0f;
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.c.d.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setTimeout(i);
        vTweenParam.setRotationX(0.0f);
        VTween.killTween(this.f13865d);
        VTween.killTween(this.f13866e);
        VTween.m10747to(this.f13865d, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
        VTween.m10747to(this.f13866e, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    /* renamed from: a */
    private double m330a(double d) {
        return 0.017453292519943295d * d;
    }

    /* renamed from: b */
    public boolean m326b() {
        return this.f13868g;
    }

    /* renamed from: a */
    public void m327a(boolean z) {
        this.f13868g = z;
        C4305i.m259c("SetStat:" + z);
        m324d();
    }

    /* renamed from: d */
    private void m324d() {
        if (this.f13868g) {
            this.f13865d.textures().removeAll();
            this.f13865d.textures().addElement(f13863b);
            return;
        }
        this.f13865d.textures().removeAll();
        this.f13865d.textures().addElement(f13862a);
    }

    /* renamed from: c */
    public void m325c() {
        this.f13868g = !this.f13868g;
        m324d();
    }

    /* renamed from: com.tsf.shell.widget.alarm.c.d$a */
    /* loaded from: classes.dex */
    class C4279a extends VMouseEventListener {
        public C4279a(VObject3d vObject3d) {
            super(vObject3d);
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onDown(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onUp(MotionEvent motionEvent) {
        }

        @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
        public void onSingleTapUp(MotionEvent motionEvent) {
            C4305i.m259c("onSingleTapUp+" + C4276d.this.f13867f);
            C4276d.this.m325c();
        }
    }
}
