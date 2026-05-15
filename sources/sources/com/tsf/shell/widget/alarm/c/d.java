package com.tsf.shell.widget.alarm.c;

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
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.p;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends VObject3dContainer {
    public static TextureElement a;
    public static TextureElement b;
    private VRectangle d;
    private VRectangle e;
    private int f;
    private com.tsf.shell.widget.alarm.b.d c = AlarmWidget.a;
    private boolean g = false;

    public d(int i) {
        if (b == null) {
            Bitmap bitmapA = p.a(AlarmWidget.h, "week_toggle_on");
            b = AlarmWidget.c.createTexture(bitmapA, false);
            bitmapA.recycle();
        }
        if (a == null) {
            Bitmap bitmapA2 = p.a(AlarmWidget.h, "week_toggle_off");
            a = AlarmWidget.c.createTexture(bitmapA2, false);
            bitmapA2.recycle();
        }
        this.f = i;
        this.d = new VRectangle(105.83333f, 63.333332f);
        this.d.moveAllPointsSP(0.0f, 20.0f, 0.0f);
        this.e = new VRectangle(this.c.a[this.f].c, this.c.a[this.f].d);
        this.e.moveAllPointsSP(0.0f, 20.0f, 0.0f);
        this.e.textures().addElement(AlarmWidget.a.g());
        this.c.a[this.f].a(this.e);
        AlarmWidget.a(this.d);
        AlarmWidget.a(this.e);
        addChild(this.d);
        addChild(this.e);
        double dSin = Math.sin(a((((double) this.f) * 24.0d) - 90.0d));
        position().spY((float) (Math.cos(a((((double) this.f) * 24.0d) - 90.0d)) * 200.0d));
        position().spX((float) (200.0d * dSin));
        rotation().z = ((float) ((-90.0d) + (24.0d * ((double) this.f)))) * (-1.0f);
        setMouseEventListener(new a(this));
        calAABB();
    }

    public static void a() {
        AlarmWidget.e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.c.d.1
            @Override // java.lang.Runnable
            public void run() {
                if (d.b != null) {
                    Bitmap bitmapA = p.a(AlarmWidget.h, "week_toggle_on");
                    p.a(d.b.id, bitmapA, 0, 0);
                    bitmapA.recycle();
                }
                if (d.a != null) {
                    Bitmap bitmapA2 = p.a(AlarmWidget.h, "week_toggle_off");
                    p.a(d.a.id, bitmapA2, 0, 0);
                    bitmapA2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    public void a(int i) {
        this.d.rotation().x = -180.0f;
        this.e.rotation().x = -180.0f;
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
        VTween.killTween(this.d);
        VTween.killTween(this.e);
        VTween.to(this.d, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
        VTween.to(this.e, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    private double a(double d) {
        return 0.017453292519943295d * d;
    }

    public boolean b() {
        return this.g;
    }

    public void a(boolean z) {
        this.g = z;
        i.c("SetStat:" + z);
        d();
    }

    private void d() {
        if (this.g) {
            this.d.textures().removeAll();
            this.d.textures().addElement(b);
        } else {
            this.d.textures().removeAll();
            this.d.textures().addElement(a);
        }
    }

    public void c() {
        this.g = !this.g;
        d();
    }

    class a extends VMouseEventListener {
        public a(VObject3d vObject3d) {
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
            i.c("onSingleTapUp+" + d.this.f);
            d.this.c();
        }
    }
}
